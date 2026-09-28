package org.apache.commons.collections4;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.apache.commons.collections4.OrderedIterator[][][] orderedIteratorArray1 = new org.apache.commons.collections4.OrderedIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][] objItorArray2 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]) orderedIteratorArray1;
        org.apache.commons.collections4.OrderedIterator[][][] orderedIteratorArray4 = new org.apache.commons.collections4.OrderedIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][] objItorArray5 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]) orderedIteratorArray4;
        org.apache.commons.collections4.OrderedIterator[][][][] orderedIteratorArray7 = new org.apache.commons.collections4.OrderedIterator[2][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][] objItorArray8 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]) orderedIteratorArray7;
        objItorArray8[0] = objItorArray2;
        objItorArray8[1] = objItorArray5;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]> objItorArrayItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray8);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]> objItorArrayItor14 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]> objItorArrayItor16 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray8, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]> objItorArrayItor17 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItorArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Object[]> objArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorArray8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedIteratorArray1);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray1, new org.apache.commons.collections4.OrderedIterator[][][] {});
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertArrayEquals(objItorArray2, new org.apache.commons.collections4.OrderedIterator[][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray4);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray4, new org.apache.commons.collections4.OrderedIterator[][][] {});
        org.junit.Assert.assertNotNull(objItorArray5);
        org.junit.Assert.assertArrayEquals(objItorArray5, new org.apache.commons.collections4.OrderedIterator[][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray7);
        org.junit.Assert.assertNotNull(objItorArray8);
        org.junit.Assert.assertNotNull(objItorArrayItor13);
        org.junit.Assert.assertNotNull(objItorArrayItor14);
        org.junit.Assert.assertNotNull(objItorArrayItor16);
        org.junit.Assert.assertNotNull(objItorArrayItor17);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.collections4.MapIterator<java.lang.Comparable<java.lang.String>, java.lang.String[][]> strComparableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(strComparableItor0);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>> charSequenceItorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]> serializableItorArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]>[]) iteratorArray1);
        java.util.Iterator<java.util.Iterator[][]> iteratorArrayItor9 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.Iterator[][]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(serializableItorItor5);
        org.junit.Assert.assertNotNull(objItorArrayItor6);
        org.junit.Assert.assertNotNull(charSequenceItor7);
        org.junit.Assert.assertNotNull(serializableItorArrayItor8);
        org.junit.Assert.assertNotNull(iteratorArrayItor9);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.collections4.MapIterator[][][][][][][] mapIteratorArray1 = new org.apache.commons.collections4.MapIterator[0][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][] serializableItorArray2 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][]) mapIteratorArray1;
        org.apache.commons.collections4.MapIterator[][][][][][][] mapIteratorArray4 = new org.apache.commons.collections4.MapIterator[0][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][] serializableItorArray5 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][]) mapIteratorArray4;
        org.apache.commons.collections4.MapIterator[][][][][][][] mapIteratorArray7 = new org.apache.commons.collections4.MapIterator[0][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][] serializableItorArray8 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][]) mapIteratorArray7;
        org.apache.commons.collections4.MapIterator[][][][][][][] mapIteratorArray10 = new org.apache.commons.collections4.MapIterator[0][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][] serializableItorArray11 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][]) mapIteratorArray10;
        org.apache.commons.collections4.MapIterator[][][][][][][][] mapIteratorArray13 = new org.apache.commons.collections4.MapIterator[4][][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][][] serializableItorArray14 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][][]) mapIteratorArray13;
        serializableItorArray14[0] = serializableItorArray2;
        serializableItorArray14[1] = serializableItorArray5;
        serializableItorArray14[2] = serializableItorArray8;
        serializableItorArray14[3] = serializableItorArray11;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][]> serializableItorArrayItor24 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray14, 4);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][]> serializableItorArrayItor25 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray14);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][]> serializableItorArrayItor26 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray14);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][]> serializableItorArrayItor28 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray14, 2);
        org.junit.Assert.assertNotNull(mapIteratorArray1);
        org.junit.Assert.assertArrayEquals(mapIteratorArray1, new org.apache.commons.collections4.MapIterator[][][][][][][] {});
        org.junit.Assert.assertNotNull(serializableItorArray2);
        org.junit.Assert.assertArrayEquals(serializableItorArray2, new org.apache.commons.collections4.MapIterator[][][][][][][] {});
        org.junit.Assert.assertNotNull(mapIteratorArray4);
        org.junit.Assert.assertArrayEquals(mapIteratorArray4, new org.apache.commons.collections4.MapIterator[][][][][][][] {});
        org.junit.Assert.assertNotNull(serializableItorArray5);
        org.junit.Assert.assertArrayEquals(serializableItorArray5, new org.apache.commons.collections4.MapIterator[][][][][][][] {});
        org.junit.Assert.assertNotNull(mapIteratorArray7);
        org.junit.Assert.assertArrayEquals(mapIteratorArray7, new org.apache.commons.collections4.MapIterator[][][][][][][] {});
        org.junit.Assert.assertNotNull(serializableItorArray8);
        org.junit.Assert.assertArrayEquals(serializableItorArray8, new org.apache.commons.collections4.MapIterator[][][][][][][] {});
        org.junit.Assert.assertNotNull(mapIteratorArray10);
        org.junit.Assert.assertArrayEquals(mapIteratorArray10, new org.apache.commons.collections4.MapIterator[][][][][][][] {});
        org.junit.Assert.assertNotNull(serializableItorArray11);
        org.junit.Assert.assertArrayEquals(serializableItorArray11, new org.apache.commons.collections4.MapIterator[][][][][][][] {});
        org.junit.Assert.assertNotNull(mapIteratorArray13);
        org.junit.Assert.assertNotNull(serializableItorArray14);
        org.junit.Assert.assertNotNull(serializableItorArrayItor24);
        org.junit.Assert.assertNotNull(serializableItorArrayItor25);
        org.junit.Assert.assertNotNull(serializableItorArrayItor26);
        org.junit.Assert.assertNotNull(serializableItorArrayItor28);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][][], java.lang.reflect.Type> objItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(objItorArrayItor0);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.apache.commons.collections4.ResettableListIterator[][][] resettableListIteratorArray1 = new org.apache.commons.collections4.ResettableListIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][][] objItorArray2 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][][]) resettableListIteratorArray1;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray2);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray2);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator[][]> iteratorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator[][][]) objItorArray2);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray2, 0);
        org.junit.Assert.assertNotNull(resettableListIteratorArray1);
        org.junit.Assert.assertArrayEquals(resettableListIteratorArray1, new org.apache.commons.collections4.ResettableListIterator[][][] {});
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertArrayEquals(objItorArray2, new org.apache.commons.collections4.ResettableListIterator[][][] {});
        org.junit.Assert.assertNotNull(objItorArrayItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(iteratorArrayItor5);
        org.junit.Assert.assertNotNull(objItorArrayItor7);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.apache.commons.collections4.OrderedIterator[][][] orderedIteratorArray1 = new org.apache.commons.collections4.OrderedIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][] objItorArray2 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]) orderedIteratorArray1;
        org.apache.commons.collections4.OrderedIterator[][][] orderedIteratorArray4 = new org.apache.commons.collections4.OrderedIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][] objItorArray5 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]) orderedIteratorArray4;
        org.apache.commons.collections4.OrderedIterator[][][][] orderedIteratorArray7 = new org.apache.commons.collections4.OrderedIterator[2][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][] objItorArray8 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]) orderedIteratorArray7;
        objItorArray8[0] = objItorArray2;
        objItorArray8[1] = objItorArray5;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]> objItorArrayItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray8);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]> objItorArrayItor14 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]> objItorArrayItor16 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray8, (int) (short) 1);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]> objItorArrayItor18 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray8, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence> charSequenceItor21 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorArray8, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedIteratorArray1);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray1, new org.apache.commons.collections4.OrderedIterator[][][] {});
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertArrayEquals(objItorArray2, new org.apache.commons.collections4.OrderedIterator[][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray4);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray4, new org.apache.commons.collections4.OrderedIterator[][][] {});
        org.junit.Assert.assertNotNull(objItorArray5);
        org.junit.Assert.assertArrayEquals(objItorArray5, new org.apache.commons.collections4.OrderedIterator[][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray7);
        org.junit.Assert.assertNotNull(objItorArray8);
        org.junit.Assert.assertNotNull(objItorArrayItor13);
        org.junit.Assert.assertNotNull(objItorArrayItor14);
        org.junit.Assert.assertNotNull(objItorArrayItor16);
        org.junit.Assert.assertNotNull(objItorArrayItor18);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator resettableListIterator1 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator2 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator4 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator4);
        java.lang.Object[] objArray8 = new java.lang.Object[] { resettableIterator2, (short) 100, resettableIteratorItor5, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray8, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor12 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor11);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor13 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor11);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray15 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray16 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray15;
        objItorArray16[0] = objItor0;
        objItorArray16[1] = resettableListIterator1;
        objItorArray16[2] = objItor11;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor24 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray16, (int) (short) 0);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object[]> objArrayItor25 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object[]) objItorArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor28 = org.apache.commons.collections4.IteratorUtils.arrayIterator((org.apache.commons.collections4.ResettableIterator[]) objItorArray16, 2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(resettableListIterator1);
        org.junit.Assert.assertNotNull(resettableIterator2);
        org.junit.Assert.assertNotNull(resettableIterator4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertNotNull(objItorItor12);
        org.junit.Assert.assertNotNull(objItorItor13);
        org.junit.Assert.assertNotNull(resettableListIteratorArray15);
        org.junit.Assert.assertNotNull(objItorArray16);
        org.junit.Assert.assertNotNull(objItorItor24);
        org.junit.Assert.assertNotNull(objArrayItor25);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.Object[]> objArrayItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.Object[]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][][]> serializableItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][][]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(objArrayItor5);
        org.junit.Assert.assertNotNull(iteratorItor6);
        org.junit.Assert.assertNotNull(serializableItorArrayItor7);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.apache.commons.collections4.OrderedMapIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[][][], java.lang.Class<?>[]> resettableIteratorItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(resettableIteratorItorArrayItor0);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        java.lang.String[][][][] strArray0 = new java.lang.String[][][][] {};
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][]> strArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray0);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement[]> annotatedElementArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strArray0);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][]> strArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[][][][] {});
        org.junit.Assert.assertNotNull(strArrayItor1);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor2);
        org.junit.Assert.assertNotNull(iteratorItor3);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.apache.commons.collections4.MapIterator mapIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR;
        java.lang.Class<?> wildcardClass1 = mapIterator0.getClass();
        org.junit.Assert.assertNotNull(mapIterator0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor1);
        java.util.Iterator[] iteratorArray3 = new java.util.Iterator[] { serializableItorItor2 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor4 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor4);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor6 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor5);
        java.util.Iterator[] iteratorArray7 = new java.util.Iterator[] { serializableItorItor6 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor8 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor9 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor8);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor10 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor9);
        java.util.Iterator[] iteratorArray11 = new java.util.Iterator[] { serializableItorItor10 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor12 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor13 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor12);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor14 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor13);
        java.util.Iterator[] iteratorArray15 = new java.util.Iterator[] { serializableItorItor14 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor16 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor17 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor16);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor18 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor17);
        java.util.Iterator[] iteratorArray19 = new java.util.Iterator[] { serializableItorItor18 };
        java.util.Iterator[][] iteratorArray20 = new java.util.Iterator[][] { iteratorArray3, iteratorArray7, iteratorArray11, iteratorArray15, iteratorArray19 };
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator[]> iteratorArrayItor21 = org.apache.commons.collections4.IteratorUtils.arrayIterator(iteratorArray20);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][]> strArrayItor22 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray20);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor23 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor24 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        java.util.Iterator[] iteratorArray26 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray27 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray26;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor28 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray26);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor29 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray26);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor30 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray26);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorArray26);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor32 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor33 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor32);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor34 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor33);
        java.util.Iterator[] iteratorArray35 = new java.util.Iterator[] { serializableItorItor34 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor36 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor37 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor36);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor38 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor37);
        java.util.Iterator[] iteratorArray39 = new java.util.Iterator[] { serializableItorItor38 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor40 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor41 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor40);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor42 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor41);
        java.util.Iterator[] iteratorArray43 = new java.util.Iterator[] { serializableItorItor42 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor44 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor45 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor44);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor46 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor45);
        java.util.Iterator[] iteratorArray47 = new java.util.Iterator[] { serializableItorItor46 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor48 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor49 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor48);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor50 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor49);
        java.util.Iterator[] iteratorArray51 = new java.util.Iterator[] { serializableItorItor50 };
        java.util.Iterator[][] iteratorArray52 = new java.util.Iterator[][] { iteratorArray35, iteratorArray39, iteratorArray43, iteratorArray47, iteratorArray51 };
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator[]> iteratorArrayItor53 = org.apache.commons.collections4.IteratorUtils.arrayIterator(iteratorArray52);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][]> strArrayItor54 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray52);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator[]> iteratorArrayItor55 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorArray52);
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableIterator, java.util.Iterator[]> resettableIteratorItor56 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator57 = org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR;
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator58 = org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR;
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableIterator, java.util.Iterator[]> resettableIteratorItor59 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableIterator, java.util.Iterator[]> resettableIteratorItor60 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator61 = org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray62 = new org.apache.commons.collections4.OrderedMapIterator[] { resettableIteratorItor56, orderedMapIterator57, orderedMapIterator58, resettableIteratorItor59, resettableIteratorItor60, orderedMapIterator61 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor64 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(orderedMapIteratorArray62, 5);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[]> orderedMapIteratorArrayItor65 = org.apache.commons.collections4.IteratorUtils.singletonIterator(orderedMapIteratorArray62);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray66 = new org.apache.commons.collections4.ResettableIterator[] { strArrayItor22, typeItor23, orderedMapIteratorItor24, iteratorItor31, iteratorArrayItor55, orderedMapIteratorArrayItor65 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor69 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(resettableIteratorArray66, 0, 2);
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator[]> iteratorArrayItor70 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.util.Iterator[]) resettableIteratorArray66);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor71 = org.apache.commons.collections4.IteratorUtils.singletonIterator(resettableIteratorArray66);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[]> orderedMapIteratorArrayItor73 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) resettableIteratorArray66, (int) (byte) 0);
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(serializableItorItor2);
        org.junit.Assert.assertNotNull(iteratorArray3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(serializableItor5);
        org.junit.Assert.assertNotNull(serializableItorItor6);
        org.junit.Assert.assertNotNull(iteratorArray7);
        org.junit.Assert.assertNotNull(serializableItor8);
        org.junit.Assert.assertNotNull(serializableItor9);
        org.junit.Assert.assertNotNull(serializableItorItor10);
        org.junit.Assert.assertNotNull(iteratorArray11);
        org.junit.Assert.assertNotNull(serializableItor12);
        org.junit.Assert.assertNotNull(serializableItor13);
        org.junit.Assert.assertNotNull(serializableItorItor14);
        org.junit.Assert.assertNotNull(iteratorArray15);
        org.junit.Assert.assertNotNull(serializableItor16);
        org.junit.Assert.assertNotNull(serializableItor17);
        org.junit.Assert.assertNotNull(serializableItorItor18);
        org.junit.Assert.assertNotNull(iteratorArray19);
        org.junit.Assert.assertNotNull(iteratorArray20);
        org.junit.Assert.assertNotNull(iteratorArrayItor21);
        org.junit.Assert.assertNotNull(strArrayItor22);
        org.junit.Assert.assertNotNull(typeItor23);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor24);
        org.junit.Assert.assertNotNull(iteratorArray26);
        org.junit.Assert.assertArrayEquals(iteratorArray26, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray27);
        org.junit.Assert.assertArrayEquals(wildcardItorArray27, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor28);
        org.junit.Assert.assertNotNull(objItorArrayItor29);
        org.junit.Assert.assertNotNull(resettableIteratorItor30);
        org.junit.Assert.assertNotNull(iteratorItor31);
        org.junit.Assert.assertNotNull(serializableItor32);
        org.junit.Assert.assertNotNull(serializableItor33);
        org.junit.Assert.assertNotNull(serializableItorItor34);
        org.junit.Assert.assertNotNull(iteratorArray35);
        org.junit.Assert.assertNotNull(serializableItor36);
        org.junit.Assert.assertNotNull(serializableItor37);
        org.junit.Assert.assertNotNull(serializableItorItor38);
        org.junit.Assert.assertNotNull(iteratorArray39);
        org.junit.Assert.assertNotNull(serializableItor40);
        org.junit.Assert.assertNotNull(serializableItor41);
        org.junit.Assert.assertNotNull(serializableItorItor42);
        org.junit.Assert.assertNotNull(iteratorArray43);
        org.junit.Assert.assertNotNull(serializableItor44);
        org.junit.Assert.assertNotNull(serializableItor45);
        org.junit.Assert.assertNotNull(serializableItorItor46);
        org.junit.Assert.assertNotNull(iteratorArray47);
        org.junit.Assert.assertNotNull(serializableItor48);
        org.junit.Assert.assertNotNull(serializableItor49);
        org.junit.Assert.assertNotNull(serializableItorItor50);
        org.junit.Assert.assertNotNull(iteratorArray51);
        org.junit.Assert.assertNotNull(iteratorArray52);
        org.junit.Assert.assertNotNull(iteratorArrayItor53);
        org.junit.Assert.assertNotNull(strArrayItor54);
        org.junit.Assert.assertNotNull(iteratorArrayItor55);
        org.junit.Assert.assertNotNull(resettableIteratorItor56);
        org.junit.Assert.assertNotNull(orderedMapIterator57);
        org.junit.Assert.assertNotNull(orderedMapIterator58);
        org.junit.Assert.assertNotNull(resettableIteratorItor59);
        org.junit.Assert.assertNotNull(resettableIteratorItor60);
        org.junit.Assert.assertNotNull(orderedMapIterator61);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray62);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor64);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor65);
        org.junit.Assert.assertNotNull(resettableIteratorArray66);
        org.junit.Assert.assertNotNull(resettableIteratorItor69);
        org.junit.Assert.assertNotNull(iteratorArrayItor70);
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor71);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor73);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor1);
        java.util.Iterator[] iteratorArray3 = new java.util.Iterator[] { serializableItorItor2 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor4 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor4);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor6 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor5);
        java.util.Iterator[] iteratorArray7 = new java.util.Iterator[] { serializableItorItor6 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor8 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor9 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor8);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor10 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor9);
        java.util.Iterator[] iteratorArray11 = new java.util.Iterator[] { serializableItorItor10 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor12 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor13 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor12);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor14 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor13);
        java.util.Iterator[] iteratorArray15 = new java.util.Iterator[] { serializableItorItor14 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor16 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor17 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor16);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor18 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor17);
        java.util.Iterator[] iteratorArray19 = new java.util.Iterator[] { serializableItorItor18 };
        java.util.Iterator[][] iteratorArray20 = new java.util.Iterator[][] { iteratorArray3, iteratorArray7, iteratorArray11, iteratorArray15, iteratorArray19 };
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator[]> iteratorArrayItor21 = org.apache.commons.collections4.IteratorUtils.arrayIterator(iteratorArray20);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][]> strArrayItor22 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray20);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor23 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor24 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        java.util.Iterator[] iteratorArray26 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray27 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray26;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor28 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray26);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor29 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray26);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor30 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray26);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorArray26);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor32 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor33 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor32);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor34 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor33);
        java.util.Iterator[] iteratorArray35 = new java.util.Iterator[] { serializableItorItor34 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor36 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor37 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor36);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor38 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor37);
        java.util.Iterator[] iteratorArray39 = new java.util.Iterator[] { serializableItorItor38 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor40 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor41 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor40);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor42 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor41);
        java.util.Iterator[] iteratorArray43 = new java.util.Iterator[] { serializableItorItor42 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor44 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor45 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor44);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor46 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor45);
        java.util.Iterator[] iteratorArray47 = new java.util.Iterator[] { serializableItorItor46 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor48 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor49 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor48);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor50 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor49);
        java.util.Iterator[] iteratorArray51 = new java.util.Iterator[] { serializableItorItor50 };
        java.util.Iterator[][] iteratorArray52 = new java.util.Iterator[][] { iteratorArray35, iteratorArray39, iteratorArray43, iteratorArray47, iteratorArray51 };
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator[]> iteratorArrayItor53 = org.apache.commons.collections4.IteratorUtils.arrayIterator(iteratorArray52);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][]> strArrayItor54 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray52);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator[]> iteratorArrayItor55 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorArray52);
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableIterator, java.util.Iterator[]> resettableIteratorItor56 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator57 = org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR;
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator58 = org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR;
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableIterator, java.util.Iterator[]> resettableIteratorItor59 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableIterator, java.util.Iterator[]> resettableIteratorItor60 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator61 = org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray62 = new org.apache.commons.collections4.OrderedMapIterator[] { resettableIteratorItor56, orderedMapIterator57, orderedMapIterator58, resettableIteratorItor59, resettableIteratorItor60, orderedMapIterator61 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor64 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(orderedMapIteratorArray62, 5);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[]> orderedMapIteratorArrayItor65 = org.apache.commons.collections4.IteratorUtils.singletonIterator(orderedMapIteratorArray62);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray66 = new org.apache.commons.collections4.ResettableIterator[] { strArrayItor22, typeItor23, orderedMapIteratorItor24, iteratorItor31, iteratorArrayItor55, orderedMapIteratorArrayItor65 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor69 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(resettableIteratorArray66, 0, 2);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor70 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(resettableIteratorArray66);
        org.apache.commons.collections4.ResettableIterator resettableIterator71 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor72 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator71);
        java.util.ListIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> resettableIteratorItorItor73 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIteratorItor72);
        java.util.ListIterator[] listIteratorArray75 = new java.util.ListIterator[2];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[] resettableIteratorItorArray76 = (java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[]) listIteratorArray75;
        resettableIteratorItorArray76[0] = resettableIteratorItor70;
        resettableIteratorItorArray76[1] = resettableIteratorItor72;
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> resettableIteratorItorItor82 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorItorArray76, 0);
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> resettableIteratorItorItor85 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorItorArray76, (int) (short) 1, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[]> resettableIteratorItorArrayItor86 = org.apache.commons.collections4.IteratorUtils.singletonIterator(resettableIteratorItorArray76);
        java.util.ListIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[]> resettableIteratorItorArrayItor87 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIteratorItorArray76);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor88 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) resettableIteratorItorArrayItor87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(serializableItorItor2);
        org.junit.Assert.assertNotNull(iteratorArray3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(serializableItor5);
        org.junit.Assert.assertNotNull(serializableItorItor6);
        org.junit.Assert.assertNotNull(iteratorArray7);
        org.junit.Assert.assertNotNull(serializableItor8);
        org.junit.Assert.assertNotNull(serializableItor9);
        org.junit.Assert.assertNotNull(serializableItorItor10);
        org.junit.Assert.assertNotNull(iteratorArray11);
        org.junit.Assert.assertNotNull(serializableItor12);
        org.junit.Assert.assertNotNull(serializableItor13);
        org.junit.Assert.assertNotNull(serializableItorItor14);
        org.junit.Assert.assertNotNull(iteratorArray15);
        org.junit.Assert.assertNotNull(serializableItor16);
        org.junit.Assert.assertNotNull(serializableItor17);
        org.junit.Assert.assertNotNull(serializableItorItor18);
        org.junit.Assert.assertNotNull(iteratorArray19);
        org.junit.Assert.assertNotNull(iteratorArray20);
        org.junit.Assert.assertNotNull(iteratorArrayItor21);
        org.junit.Assert.assertNotNull(strArrayItor22);
        org.junit.Assert.assertNotNull(typeItor23);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor24);
        org.junit.Assert.assertNotNull(iteratorArray26);
        org.junit.Assert.assertArrayEquals(iteratorArray26, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray27);
        org.junit.Assert.assertArrayEquals(wildcardItorArray27, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor28);
        org.junit.Assert.assertNotNull(objItorArrayItor29);
        org.junit.Assert.assertNotNull(resettableIteratorItor30);
        org.junit.Assert.assertNotNull(iteratorItor31);
        org.junit.Assert.assertNotNull(serializableItor32);
        org.junit.Assert.assertNotNull(serializableItor33);
        org.junit.Assert.assertNotNull(serializableItorItor34);
        org.junit.Assert.assertNotNull(iteratorArray35);
        org.junit.Assert.assertNotNull(serializableItor36);
        org.junit.Assert.assertNotNull(serializableItor37);
        org.junit.Assert.assertNotNull(serializableItorItor38);
        org.junit.Assert.assertNotNull(iteratorArray39);
        org.junit.Assert.assertNotNull(serializableItor40);
        org.junit.Assert.assertNotNull(serializableItor41);
        org.junit.Assert.assertNotNull(serializableItorItor42);
        org.junit.Assert.assertNotNull(iteratorArray43);
        org.junit.Assert.assertNotNull(serializableItor44);
        org.junit.Assert.assertNotNull(serializableItor45);
        org.junit.Assert.assertNotNull(serializableItorItor46);
        org.junit.Assert.assertNotNull(iteratorArray47);
        org.junit.Assert.assertNotNull(serializableItor48);
        org.junit.Assert.assertNotNull(serializableItor49);
        org.junit.Assert.assertNotNull(serializableItorItor50);
        org.junit.Assert.assertNotNull(iteratorArray51);
        org.junit.Assert.assertNotNull(iteratorArray52);
        org.junit.Assert.assertNotNull(iteratorArrayItor53);
        org.junit.Assert.assertNotNull(strArrayItor54);
        org.junit.Assert.assertNotNull(iteratorArrayItor55);
        org.junit.Assert.assertNotNull(resettableIteratorItor56);
        org.junit.Assert.assertNotNull(orderedMapIterator57);
        org.junit.Assert.assertNotNull(orderedMapIterator58);
        org.junit.Assert.assertNotNull(resettableIteratorItor59);
        org.junit.Assert.assertNotNull(resettableIteratorItor60);
        org.junit.Assert.assertNotNull(orderedMapIterator61);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray62);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor64);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor65);
        org.junit.Assert.assertNotNull(resettableIteratorArray66);
        org.junit.Assert.assertNotNull(resettableIteratorItor69);
        org.junit.Assert.assertNotNull(resettableIteratorItor70);
        org.junit.Assert.assertNotNull(resettableIterator71);
        org.junit.Assert.assertNotNull(resettableIteratorItor72);
        org.junit.Assert.assertNotNull(resettableIteratorItorItor73);
        org.junit.Assert.assertNotNull(listIteratorArray75);
        org.junit.Assert.assertNotNull(resettableIteratorItorArray76);
        org.junit.Assert.assertNotNull(resettableIteratorItorItor82);
        org.junit.Assert.assertNotNull(resettableIteratorItorItor85);
        org.junit.Assert.assertNotNull(resettableIteratorItorArrayItor86);
        org.junit.Assert.assertNotNull(resettableIteratorItorArrayItor87);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray1 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray2 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray3 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray4 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray5 = new java.lang.String[][][][][][] { strArray0, strArray1, strArray2, strArray3, strArray4 };
        java.lang.String[][][][][] strArray6 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray7 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray8 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray9 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray10 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray11 = new java.lang.String[][][][][][] { strArray6, strArray7, strArray8, strArray9, strArray10 };
        java.lang.String[][][][][] strArray12 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray13 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray14 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray15 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray16 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray17 = new java.lang.String[][][][][][] { strArray12, strArray13, strArray14, strArray15, strArray16 };
        java.lang.String[][][][][][][] strArray18 = new java.lang.String[][][][][][][] { strArray5, strArray11, strArray17 };
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][]> strArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][][][]> strArrayItor21 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray18, 0);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][]> strArrayItor22 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][][][]> strArrayItor23 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray18);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][][]> strArrayItor24 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strArray18);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][][]> strArrayItor25 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strArray18);
        org.apache.commons.collections4.ResettableListIterator<java.io.Serializable> serializableItor26 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.io.Serializable[]) strArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor28 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.io.Serializable[]) strArray18, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArrayItor19);
        org.junit.Assert.assertNotNull(strArrayItor21);
        org.junit.Assert.assertNotNull(strArrayItor22);
        org.junit.Assert.assertNotNull(strArrayItor23);
        org.junit.Assert.assertNotNull(strArrayItor24);
        org.junit.Assert.assertNotNull(strArrayItor25);
        org.junit.Assert.assertNotNull(serializableItor26);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        java.lang.String[][][][][][][] strArray0 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray1 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray2 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray3 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][][] strArray4 = new java.lang.String[][][][][][][][] { strArray0, strArray1, strArray2, strArray3 };
        java.lang.String[][][][][][][][][] strArray5 = new java.lang.String[][][][][][][][][] { strArray4 };
        java.lang.String[][][][][][][] strArray6 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray7 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray8 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray9 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][][] strArray10 = new java.lang.String[][][][][][][][] { strArray6, strArray7, strArray8, strArray9 };
        java.lang.String[][][][][][][][][] strArray11 = new java.lang.String[][][][][][][][][] { strArray10 };
        java.lang.String[][][][][][][] strArray12 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray13 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray14 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray15 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][][] strArray16 = new java.lang.String[][][][][][][][] { strArray12, strArray13, strArray14, strArray15 };
        java.lang.String[][][][][][][][][] strArray17 = new java.lang.String[][][][][][][][][] { strArray16 };
        java.lang.String[][][][][][][] strArray18 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray19 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray20 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray21 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][][] strArray22 = new java.lang.String[][][][][][][][] { strArray18, strArray19, strArray20, strArray21 };
        java.lang.String[][][][][][][][][] strArray23 = new java.lang.String[][][][][][][][][] { strArray22 };
        java.lang.String[][][][][][][][][][] strArray24 = new java.lang.String[][][][][][][][][][] { strArray5, strArray11, strArray17, strArray23 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][][][][][][]> strArrayItor25 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][][][][]> strArrayItor27 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray24, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArrayItor25);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>>[]) iteratorArray1);
        java.util.Iterator<java.lang.Object[][]> objArrayItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Object[][]>[]) iteratorArray1);
        java.util.Iterator<?> wildcardItor7 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray1);
        java.util.Iterator<?> wildcardItor9 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) resettableIteratorItor8);
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator> iteratorItor10 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.util.Iterator) wildcardItor9);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(serializableItorItor5);
        org.junit.Assert.assertNotNull(objArrayItor6);
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertNotNull(resettableIteratorItor8);
        org.junit.Assert.assertNotNull(wildcardItor9);
        org.junit.Assert.assertNotNull(iteratorItor10);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.ResettableIterator, org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> resettableIteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.lang.Class<?> wildcardClass1 = resettableIteratorItor0.getClass();
        java.lang.Class[] classArray3 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray4 = (java.lang.Class<?>[]) classArray3;
        wildcardClassArray4[0] = wildcardClass1;
        java.lang.Class[][] classArray8 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray9 = (java.lang.Class<?>[][]) classArray8;
        wildcardClassArray9[0] = wildcardClassArray4;
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.ResettableIterator, org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> resettableIteratorItor12 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.lang.Class<?> wildcardClass13 = resettableIteratorItor12.getClass();
        java.lang.Class[] classArray15 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray16 = (java.lang.Class<?>[]) classArray15;
        wildcardClassArray16[0] = wildcardClass13;
        java.lang.Class[][] classArray20 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray21 = (java.lang.Class<?>[][]) classArray20;
        wildcardClassArray21[0] = wildcardClassArray16;
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.ResettableIterator, org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> resettableIteratorItor24 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.lang.Class<?> wildcardClass25 = resettableIteratorItor24.getClass();
        java.lang.Class[] classArray27 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        wildcardClassArray28[0] = wildcardClass25;
        java.lang.Class[][] classArray32 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray33 = (java.lang.Class<?>[][]) classArray32;
        wildcardClassArray33[0] = wildcardClassArray28;
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.ResettableIterator, org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> resettableIteratorItor36 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.lang.Class<?> wildcardClass37 = resettableIteratorItor36.getClass();
        java.lang.Class[] classArray39 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        wildcardClassArray40[0] = wildcardClass37;
        java.lang.Class[][] classArray44 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray45 = (java.lang.Class<?>[][]) classArray44;
        wildcardClassArray45[0] = wildcardClassArray40;
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.ResettableIterator, org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> resettableIteratorItor48 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.lang.Class<?> wildcardClass49 = resettableIteratorItor48.getClass();
        java.lang.Class[] classArray51 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass49;
        java.lang.Class[][] classArray56 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray57 = (java.lang.Class<?>[][]) classArray56;
        wildcardClassArray57[0] = wildcardClassArray52;
        java.lang.Class[][][] classArray61 = new java.lang.Class[5][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray62 = (java.lang.Class<?>[][][]) classArray61;
        wildcardClassArray62[0] = wildcardClassArray9;
        wildcardClassArray62[1] = wildcardClassArray21;
        wildcardClassArray62[2] = wildcardClassArray33;
        wildcardClassArray62[3] = wildcardClassArray45;
        wildcardClassArray62[4] = wildcardClassArray57;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][]> wildcardClassArrayItor73 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray62);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object[][]> objArrayItor74 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[][][]) wildcardClassArray62);
        org.junit.Assert.assertNotNull(resettableIteratorItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertArrayEquals(classArray3, new java.lang.Class[] { org.apache.commons.collections4.iterators.EmptyMapIterator.class });
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertArrayEquals(wildcardClassArray4, new java.lang.Class[] { org.apache.commons.collections4.iterators.EmptyMapIterator.class });
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(resettableIteratorItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertArrayEquals(classArray15, new java.lang.Class[] { org.apache.commons.collections4.iterators.EmptyMapIterator.class });
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertArrayEquals(wildcardClassArray16, new java.lang.Class[] { org.apache.commons.collections4.iterators.EmptyMapIterator.class });
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(resettableIteratorItor24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertArrayEquals(classArray27, new java.lang.Class[] { org.apache.commons.collections4.iterators.EmptyMapIterator.class });
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertArrayEquals(wildcardClassArray28, new java.lang.Class[] { org.apache.commons.collections4.iterators.EmptyMapIterator.class });
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(resettableIteratorItor36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertArrayEquals(classArray39, new java.lang.Class[] { org.apache.commons.collections4.iterators.EmptyMapIterator.class });
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertArrayEquals(wildcardClassArray40, new java.lang.Class[] { org.apache.commons.collections4.iterators.EmptyMapIterator.class });
        org.junit.Assert.assertNotNull(classArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(resettableIteratorItor48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertArrayEquals(classArray51, new java.lang.Class[] { org.apache.commons.collections4.iterators.EmptyMapIterator.class });
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertArrayEquals(wildcardClassArray52, new java.lang.Class[] { org.apache.commons.collections4.iterators.EmptyMapIterator.class });
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor73);
        org.junit.Assert.assertNotNull(objArrayItor74);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.collections4.MapIterator<java.lang.Class<?>[][][][][], org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]> wildcardClassArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(wildcardClassArrayItor0);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][], java.util.Iterator[]> objItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(objItorArrayItor0);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray1);
        java.util.ListIterator<java.io.Serializable> serializableItor6 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.io.Serializable) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        java.util.Iterator<java.lang.String[][][][][][]> strArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[][][][][][]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor9 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableListIterator<java.lang.Object>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][][]> orderedMapIteratorArrayItor10 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator[][][][][][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]> charSequenceItorArrayItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(serializableItor6);
        org.junit.Assert.assertNotNull(objItorItor7);
        org.junit.Assert.assertNotNull(strArrayItor8);
        org.junit.Assert.assertNotNull(objItorItor9);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor10);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor11);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1);
        java.util.Iterator<java.lang.Class<?>> wildcardClassItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Class<?>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator>[]) iteratorArray1);
        java.util.Iterator<java.util.Iterator> iteratorItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.Iterator>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableListIterator<java.lang.Object>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.Comparable<java.lang.String>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][][]> objItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][][]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator[][][][]> orderedMapIteratorArrayItor11 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator[][][][]>[]) iteratorArray1);
        java.util.ListIterator<java.util.Iterator[]> iteratorArrayItor12 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(genericDeclarationItor3);
        org.junit.Assert.assertNotNull(wildcardClassItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor5);
        org.junit.Assert.assertNotNull(iteratorItor6);
        org.junit.Assert.assertNotNull(objItorItor7);
        org.junit.Assert.assertNotNull(objItorItor8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(objItorArrayItor10);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor11);
        org.junit.Assert.assertNotNull(iteratorArrayItor12);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.AnnotatedElement[][]> annotatedElementArrayItor6 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.AnnotatedElement[][]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]> charSequenceItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(serializableItorItor5);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor6);
        org.junit.Assert.assertNotNull(objItorArrayItor7);
        org.junit.Assert.assertNotNull(serializableItorItor8);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.apache.commons.collections4.ResettableListIterator resettableListIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor1 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor2);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor2);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray6 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray7 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray6;
        objItorArray7[0] = resettableListIterator0;
        objItorArray7[1] = objItor1;
        objItorArray7[2] = objItor2;
        org.apache.commons.collections4.ResettableListIterator resettableListIterator14 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor15 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor16 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor17 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor16);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor18 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor16);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray20 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray21 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray20;
        objItorArray21[0] = resettableListIterator14;
        objItorArray21[1] = objItor15;
        objItorArray21[2] = objItor16;
        org.apache.commons.collections4.ResettableListIterator resettableListIterator28 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor29 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor30 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor31 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor30);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor32 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor30);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray34 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray35 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray34;
        objItorArray35[0] = resettableListIterator28;
        objItorArray35[1] = objItor29;
        objItorArray35[2] = objItor30;
        org.apache.commons.collections4.ResettableListIterator resettableListIterator42 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor43 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor44 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor45 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor44);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor46 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor44);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray48 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray49 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray48;
        objItorArray49[0] = resettableListIterator42;
        objItorArray49[1] = objItor43;
        objItorArray49[2] = objItor44;
        org.apache.commons.collections4.ResettableListIterator[][] resettableListIteratorArray57 = new org.apache.commons.collections4.ResettableListIterator[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][] objItorArray58 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]) resettableListIteratorArray57;
        objItorArray58[0] = objItorArray7;
        objItorArray58[1] = objItorArray21;
        objItorArray58[2] = objItorArray35;
        objItorArray58[3] = objItorArray49;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor67 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray58);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor68 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItorArray58);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor69 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray58);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor70 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray58);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor71 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItorArray58);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator[]> iteratorArrayItor72 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator[][]) objItorArray58);
        org.junit.Assert.assertNotNull(resettableListIterator0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(resettableListIteratorArray6);
        org.junit.Assert.assertNotNull(objItorArray7);
        org.junit.Assert.assertNotNull(resettableListIterator14);
        org.junit.Assert.assertNotNull(objItor15);
        org.junit.Assert.assertNotNull(objItor16);
        org.junit.Assert.assertNotNull(objItorItor17);
        org.junit.Assert.assertNotNull(objItorItor18);
        org.junit.Assert.assertNotNull(resettableListIteratorArray20);
        org.junit.Assert.assertNotNull(objItorArray21);
        org.junit.Assert.assertNotNull(resettableListIterator28);
        org.junit.Assert.assertNotNull(objItor29);
        org.junit.Assert.assertNotNull(objItor30);
        org.junit.Assert.assertNotNull(objItorItor31);
        org.junit.Assert.assertNotNull(objItorItor32);
        org.junit.Assert.assertNotNull(resettableListIteratorArray34);
        org.junit.Assert.assertNotNull(objItorArray35);
        org.junit.Assert.assertNotNull(resettableListIterator42);
        org.junit.Assert.assertNotNull(objItor43);
        org.junit.Assert.assertNotNull(objItor44);
        org.junit.Assert.assertNotNull(objItorItor45);
        org.junit.Assert.assertNotNull(objItorItor46);
        org.junit.Assert.assertNotNull(resettableListIteratorArray48);
        org.junit.Assert.assertNotNull(objItorArray49);
        org.junit.Assert.assertNotNull(resettableListIteratorArray57);
        org.junit.Assert.assertNotNull(objItorArray58);
        org.junit.Assert.assertNotNull(objItorArrayItor67);
        org.junit.Assert.assertNotNull(objItorArrayItor68);
        org.junit.Assert.assertNotNull(objItorArrayItor69);
        org.junit.Assert.assertNotNull(objItorArrayItor70);
        org.junit.Assert.assertNotNull(objItorArrayItor71);
        org.junit.Assert.assertNotNull(iteratorArrayItor72);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        java.lang.String[][][][][][][] strArray0 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray1 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray2 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray3 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][][] strArray4 = new java.lang.String[][][][][][][][] { strArray0, strArray1, strArray2, strArray3 };
        java.lang.String[][][][][][][][][] strArray5 = new java.lang.String[][][][][][][][][] { strArray4 };
        java.lang.String[][][][][][][] strArray6 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray7 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray8 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray9 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][][] strArray10 = new java.lang.String[][][][][][][][] { strArray6, strArray7, strArray8, strArray9 };
        java.lang.String[][][][][][][][][] strArray11 = new java.lang.String[][][][][][][][][] { strArray10 };
        java.lang.String[][][][][][][] strArray12 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray13 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray14 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray15 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][][] strArray16 = new java.lang.String[][][][][][][][] { strArray12, strArray13, strArray14, strArray15 };
        java.lang.String[][][][][][][][][] strArray17 = new java.lang.String[][][][][][][][][] { strArray16 };
        java.lang.String[][][][][][][] strArray18 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray19 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray20 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][] strArray21 = new java.lang.String[][][][][][][] {};
        java.lang.String[][][][][][][][] strArray22 = new java.lang.String[][][][][][][][] { strArray18, strArray19, strArray20, strArray21 };
        java.lang.String[][][][][][][][][] strArray23 = new java.lang.String[][][][][][][][][] { strArray22 };
        java.lang.String[][][][][][][][][][] strArray24 = new java.lang.String[][][][][][][][][][] { strArray5, strArray11, strArray17, strArray23 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][][][][][][]> strArrayItor25 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray24);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][][][][]> strArrayItor27 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray24, 3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][][][][]> strArrayItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray24, 2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: End index must not be less than start index");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArrayItor25);
        org.junit.Assert.assertNotNull(strArrayItor27);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][][][]> wildcardClassArrayItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(wildcardClassArray2);
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.io.Serializable[]) wildcardClassArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][][]> wildcardClassArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray2, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertArrayEquals(classArray1, new java.lang.Class[][][][] {});
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertArrayEquals(wildcardClassArray2, new java.lang.Class[][][][] {});
        org.junit.Assert.assertNotNull(wildcardClassArrayItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1);
        java.util.Iterator<java.lang.Class<?>> wildcardClassItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Class<?>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator>[]) iteratorArray1);
        java.util.Iterator<java.util.Iterator> iteratorItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.Iterator>[]) iteratorArray1);
        java.util.Iterator<java.lang.reflect.Type> typeItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.Type>[]) iteratorArray1);
        java.lang.Class<?> wildcardClass8 = typeItor7.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor9 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.GenericDeclaration) wildcardClass8);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(genericDeclarationItor3);
        org.junit.Assert.assertNotNull(wildcardClassItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor5);
        org.junit.Assert.assertNotNull(iteratorItor6);
        org.junit.Assert.assertNotNull(typeItor7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(genericDeclarationItor9);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator2 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor3 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator2);
        java.lang.Object[] objArray6 = new java.lang.Object[] { resettableIterator0, (short) 100, resettableIteratorItor3, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray6, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor10 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor9);
        org.apache.commons.collections4.ResettableIterator resettableIterator11 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator13 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor14 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator13);
        java.lang.Object[] objArray17 = new java.lang.Object[] { resettableIterator11, (short) 100, resettableIteratorItor14, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor20 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray17, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor21 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor20);
        org.apache.commons.collections4.ResettableIterator resettableIterator22 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator24 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor25 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator24);
        java.lang.Object[] objArray28 = new java.lang.Object[] { resettableIterator22, (short) 100, resettableIteratorItor25, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray28, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor32 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor31);
        org.apache.commons.collections4.ResettableIterator resettableIterator33 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator35 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor36 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator35);
        java.lang.Object[] objArray39 = new java.lang.Object[] { resettableIterator33, (short) 100, resettableIteratorItor36, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor42 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray39, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator resettableIterator43 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator45 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor46 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator45);
        java.lang.Object[] objArray49 = new java.lang.Object[] { resettableIterator43, (short) 100, resettableIteratorItor46, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor52 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray49, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator resettableIterator53 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator55 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor56 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator55);
        java.lang.Object[] objArray59 = new java.lang.Object[] { resettableIterator53, (short) 100, resettableIteratorItor56, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor62 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray59, 0, (int) (byte) 1);
        org.apache.commons.collections4.OrderedIterator[] orderedIteratorArray64 = new org.apache.commons.collections4.OrderedIterator[6];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[] objItorArray65 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) orderedIteratorArray64;
        objItorArray65[0] = objItor9;
        objItorArray65[1] = objItor20;
        objItorArray65[2] = objItor31;
        objItorArray65[3] = objItor42;
        objItorArray65[4] = objItor52;
        objItorArray65[5] = objItor62;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor78 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray65);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement[][]> annotatedElementArrayItor80 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorArray65, 0);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor81 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((org.apache.commons.collections4.ResettableIterator) annotatedElementArrayItor80);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor82 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor81);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor83 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor81);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor84 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor83);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor85 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor84);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor86 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor85);
        java.util.ListIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> resettableIteratorItorItor87 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIteratorItor86);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor88 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor86);
        java.util.Iterator<?> wildcardItor89 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) resettableIteratorItor88);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor90 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor88);
        java.util.Iterator<?> wildcardItor91 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) resettableIteratorItor88);
        org.junit.Assert.assertNotNull(resettableIterator0);
        org.junit.Assert.assertNotNull(resettableIterator2);
        org.junit.Assert.assertNotNull(resettableIteratorItor3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertNotNull(objItorItor10);
        org.junit.Assert.assertNotNull(resettableIterator11);
        org.junit.Assert.assertNotNull(resettableIterator13);
        org.junit.Assert.assertNotNull(resettableIteratorItor14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objItor20);
        org.junit.Assert.assertNotNull(objItorItor21);
        org.junit.Assert.assertNotNull(resettableIterator22);
        org.junit.Assert.assertNotNull(resettableIterator24);
        org.junit.Assert.assertNotNull(resettableIteratorItor25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objItor31);
        org.junit.Assert.assertNotNull(objItorItor32);
        org.junit.Assert.assertNotNull(resettableIterator33);
        org.junit.Assert.assertNotNull(resettableIterator35);
        org.junit.Assert.assertNotNull(resettableIteratorItor36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objItor42);
        org.junit.Assert.assertNotNull(resettableIterator43);
        org.junit.Assert.assertNotNull(resettableIterator45);
        org.junit.Assert.assertNotNull(resettableIteratorItor46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objItor52);
        org.junit.Assert.assertNotNull(resettableIterator53);
        org.junit.Assert.assertNotNull(resettableIterator55);
        org.junit.Assert.assertNotNull(resettableIteratorItor56);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objItor62);
        org.junit.Assert.assertNotNull(orderedIteratorArray64);
        org.junit.Assert.assertNotNull(objItorArray65);
        org.junit.Assert.assertNotNull(objItorItor78);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor80);
        org.junit.Assert.assertNotNull(resettableIteratorItor81);
        org.junit.Assert.assertNotNull(resettableIteratorItor82);
        org.junit.Assert.assertNotNull(resettableIteratorItor83);
        org.junit.Assert.assertNotNull(resettableIteratorItor84);
        org.junit.Assert.assertNotNull(resettableIteratorItor85);
        org.junit.Assert.assertNotNull(resettableIteratorItor86);
        org.junit.Assert.assertNotNull(resettableIteratorItorItor87);
        org.junit.Assert.assertNotNull(resettableIteratorItor88);
        org.junit.Assert.assertNotNull(wildcardItor89);
        org.junit.Assert.assertNotNull(resettableIteratorItor90);
        org.junit.Assert.assertNotNull(wildcardItor91);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1, 0);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorArray1);
        java.util.Iterator<java.lang.Class<?>[]> wildcardClassArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Class<?>[]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor6);
        org.junit.Assert.assertNotNull(iteratorItor7);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor8);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1);
        java.util.Iterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> resettableIteratorItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>>[]) iteratorArray1);
        java.util.Iterator<java.lang.String[][][][]> strArrayItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[][][][]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> charSequenceItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]>[]) iteratorArray1);
        java.util.Iterator<?> wildcardItor8 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) charSequenceItorArrayItor7);
        java.lang.Class<?> wildcardClass9 = charSequenceItorArrayItor7.getClass();
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(genericDeclarationItor3);
        org.junit.Assert.assertNotNull(resettableIteratorItorItor4);
        org.junit.Assert.assertNotNull(serializableItorItor5);
        org.junit.Assert.assertNotNull(strArrayItor6);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor7);
        org.junit.Assert.assertNotNull(wildcardItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.apache.commons.collections4.OrderedIterator[][][] orderedIteratorArray1 = new org.apache.commons.collections4.OrderedIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][] objItorArray2 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]) orderedIteratorArray1;
        org.apache.commons.collections4.OrderedIterator[][][] orderedIteratorArray4 = new org.apache.commons.collections4.OrderedIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][] objItorArray5 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]) orderedIteratorArray4;
        org.apache.commons.collections4.OrderedIterator[][][][] orderedIteratorArray7 = new org.apache.commons.collections4.OrderedIterator[2][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][] objItorArray8 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]) orderedIteratorArray7;
        objItorArray8[0] = objItorArray2;
        objItorArray8[1] = objItorArray5;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]> objItorArrayItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray8);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]> objItorArrayItor14 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]> objItorArrayItor16 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray8, (int) (byte) 1);
        java.util.ListIterator<java.util.Iterator> iteratorItor17 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.util.Iterator) objItorArrayItor16);
        java.lang.Class<?> wildcardClass18 = objItorArrayItor16.getClass();
        org.junit.Assert.assertNotNull(orderedIteratorArray1);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray1, new org.apache.commons.collections4.OrderedIterator[][][] {});
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertArrayEquals(objItorArray2, new org.apache.commons.collections4.OrderedIterator[][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray4);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray4, new org.apache.commons.collections4.OrderedIterator[][][] {});
        org.junit.Assert.assertNotNull(objItorArray5);
        org.junit.Assert.assertArrayEquals(objItorArray5, new org.apache.commons.collections4.OrderedIterator[][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray7);
        org.junit.Assert.assertNotNull(objItorArray8);
        org.junit.Assert.assertNotNull(objItorArrayItor13);
        org.junit.Assert.assertNotNull(objItorArrayItor14);
        org.junit.Assert.assertNotNull(objItorArrayItor16);
        org.junit.Assert.assertNotNull(iteratorItor17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        java.util.Iterator[][][] iteratorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator[][]> iteratorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(iteratorArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.apache.commons.collections4.OrderedIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strComparableItor0);
        org.junit.Assert.assertNotNull(strComparableItor0);
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.AnnotatedElement[][]> annotatedElementArrayItor6 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.AnnotatedElement[][]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.Comparable<java.lang.String>>[]) iteratorArray1);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]> objItorArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]> serializableItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorArrayItor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(serializableItorItor5);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(charSequenceItor8);
        org.junit.Assert.assertNotNull(objItorArrayItor9);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray0 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray1 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray2 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray3 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][][] orderedMapIteratorArray4 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][] { orderedMapIteratorArray0, orderedMapIteratorArray1, orderedMapIteratorArray2, orderedMapIteratorArray3 };
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray5 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray6 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray7 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray8 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][][] orderedMapIteratorArray9 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][] { orderedMapIteratorArray5, orderedMapIteratorArray6, orderedMapIteratorArray7, orderedMapIteratorArray8 };
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray10 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray11 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray12 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray13 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][][] orderedMapIteratorArray14 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][] { orderedMapIteratorArray10, orderedMapIteratorArray11, orderedMapIteratorArray12, orderedMapIteratorArray13 };
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray15 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray16 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray17 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray18 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][][] orderedMapIteratorArray19 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][] { orderedMapIteratorArray15, orderedMapIteratorArray16, orderedMapIteratorArray17, orderedMapIteratorArray18 };
        org.apache.commons.collections4.OrderedMapIterator[][][][][][][] orderedMapIteratorArray20 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][][] { orderedMapIteratorArray4, orderedMapIteratorArray9, orderedMapIteratorArray14, orderedMapIteratorArray19 };
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray21 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray22 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray23 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray24 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][][] orderedMapIteratorArray25 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][] { orderedMapIteratorArray21, orderedMapIteratorArray22, orderedMapIteratorArray23, orderedMapIteratorArray24 };
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray26 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray27 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray28 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray29 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][][] orderedMapIteratorArray30 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][] { orderedMapIteratorArray26, orderedMapIteratorArray27, orderedMapIteratorArray28, orderedMapIteratorArray29 };
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray31 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray32 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray33 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray34 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][][] orderedMapIteratorArray35 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][] { orderedMapIteratorArray31, orderedMapIteratorArray32, orderedMapIteratorArray33, orderedMapIteratorArray34 };
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray36 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray37 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray38 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][] orderedMapIteratorArray39 = new org.apache.commons.collections4.OrderedMapIterator[][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][][] orderedMapIteratorArray40 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][] { orderedMapIteratorArray36, orderedMapIteratorArray37, orderedMapIteratorArray38, orderedMapIteratorArray39 };
        org.apache.commons.collections4.OrderedMapIterator[][][][][][][] orderedMapIteratorArray41 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][][] { orderedMapIteratorArray25, orderedMapIteratorArray30, orderedMapIteratorArray35, orderedMapIteratorArray40 };
        org.apache.commons.collections4.OrderedMapIterator[][][][][][][][] orderedMapIteratorArray42 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][][][] { orderedMapIteratorArray20, orderedMapIteratorArray41 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][][][]> orderedMapIteratorArrayItor44 = org.apache.commons.collections4.IteratorUtils.arrayIterator(orderedMapIteratorArray42, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIteratorArray0);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray0, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray1);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray1, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray2);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray2, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray3);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray3, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray4);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray5);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray5, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray6);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray6, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray7);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray7, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray8);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray8, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray9);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray10);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray10, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray11);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray11, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray12);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray12, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray13);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray13, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray14);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray15);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray15, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray16);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray16, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray17);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray17, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray18);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray18, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray19);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray20);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray21);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray21, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray22);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray22, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray23);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray23, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray24);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray24, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray25);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray26);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray26, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray27);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray27, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray28);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray28, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray29);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray29, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray30);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray31);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray31, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray32);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray32, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray33);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray33, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray34);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray34, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray35);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray36);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray36, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray37);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray37, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray38);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray38, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray39);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray39, new org.apache.commons.collections4.OrderedMapIterator[][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray40);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray41);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray42);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]> objItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(objItorArrayItor0);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator0);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor1);
        java.util.Iterator<?> wildcardItor3 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) resettableIteratorItor1);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor1);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor1);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor5);
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> resettableIteratorItorItor7 = org.apache.commons.collections4.IteratorUtils.singletonIterator(resettableIteratorItor6);
        java.lang.Class<?> wildcardClass8 = resettableIteratorItorItor7.getClass();
        org.junit.Assert.assertNotNull(resettableIterator0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertNotNull(resettableIteratorItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(resettableIteratorItorItor7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>, java.lang.String[][][][][][][][]> objItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(objItorItor0);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> charSequenceItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type> typeItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][]> serializableItorArrayItor11 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor12 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) serializableItorArrayItor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(serializableItorItor5);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor6);
        org.junit.Assert.assertNotNull(resettableIteratorItor7);
        org.junit.Assert.assertNotNull(typeItor8);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor9);
        org.junit.Assert.assertNotNull(wildcardClassItor10);
        org.junit.Assert.assertNotNull(serializableItorArrayItor11);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][], java.lang.reflect.GenericDeclaration> charSequenceItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]> charSequenceItorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) charSequenceItorArrayItor0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor0);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor3);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor4);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[][]> strArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) serializableItor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertNotNull(serializableItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(serializableItor5);
        org.junit.Assert.assertNotNull(serializableItor6);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][][][]> wildcardClassArrayItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(wildcardClassArray2);
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.io.Serializable[]) wildcardClassArray2);
        java.lang.Class<?> wildcardClass5 = wildcardClassArray2.getClass();
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertArrayEquals(classArray1, new java.lang.Class[][][][] {});
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertArrayEquals(wildcardClassArray2, new java.lang.Class[][][][] {});
        org.junit.Assert.assertNotNull(wildcardClassArrayItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        java.util.Iterator<java.lang.Object[][]> objArrayItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Object[][]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>> charSequenceItorItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.Class<?>[][][][]> wildcardClassArrayItor8 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.Class<?>[][][][]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor11 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardClassArrayItor8, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(objArrayItor5);
        org.junit.Assert.assertNotNull(charSequenceItorItor6);
        org.junit.Assert.assertNotNull(objItorItor7);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor8);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray1 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray2 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray3 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray4 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray5 = new java.lang.String[][][][][][] { strArray0, strArray1, strArray2, strArray3, strArray4 };
        java.lang.String[][][][][] strArray6 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray7 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray8 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray9 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray10 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray11 = new java.lang.String[][][][][][] { strArray6, strArray7, strArray8, strArray9, strArray10 };
        java.lang.String[][][][][] strArray12 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray13 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray14 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray15 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray16 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray17 = new java.lang.String[][][][][][] { strArray12, strArray13, strArray14, strArray15, strArray16 };
        java.lang.String[][][][][][][] strArray18 = new java.lang.String[][][][][][][] { strArray5, strArray11, strArray17 };
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][]> strArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][][][]> strArrayItor21 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray18, 0);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][]> strArrayItor22 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][][][]> strArrayItor23 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray18);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][][]> strArrayItor24 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strArray18);
        java.util.ListIterator<java.lang.String[][][][][][][]> strArrayItor25 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(strArray18);
        java.util.ListIterator<java.lang.String[][][][][][][]> strArrayItor26 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(strArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][][][]> strArrayItor28 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray18, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArrayItor19);
        org.junit.Assert.assertNotNull(strArrayItor21);
        org.junit.Assert.assertNotNull(strArrayItor22);
        org.junit.Assert.assertNotNull(strArrayItor23);
        org.junit.Assert.assertNotNull(strArrayItor24);
        org.junit.Assert.assertNotNull(strArrayItor25);
        org.junit.Assert.assertNotNull(strArrayItor26);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1);
        java.util.Iterator<java.lang.Class<?>> wildcardClassItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Class<?>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.Object[]> objArrayItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.Object[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor6 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String[][][][][][][][]> strArrayItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String[][][][][][][][]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(genericDeclarationItor3);
        org.junit.Assert.assertNotNull(wildcardClassItor4);
        org.junit.Assert.assertNotNull(objArrayItor5);
        org.junit.Assert.assertNotNull(serializableItorItor6);
        org.junit.Assert.assertNotNull(strArrayItor7);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][][]> serializableItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.lang.Class<?> wildcardClass1 = serializableItorArrayItor0.getClass();
        org.junit.Assert.assertNotNull(serializableItorArrayItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray8 = new java.lang.String[][] { strArray7 };
        java.lang.String[][][] strArray9 = new java.lang.String[][][] { strArray2, strArray5, strArray8 };
        java.lang.String[][][][] strArray10 = new java.lang.String[][][][] { strArray9 };
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray13 = new java.lang.String[][] { strArray12 };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray16 = new java.lang.String[][] { strArray15 };
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray19 = new java.lang.String[][] { strArray18 };
        java.lang.String[][][] strArray20 = new java.lang.String[][][] { strArray13, strArray16, strArray19 };
        java.lang.String[][][][] strArray21 = new java.lang.String[][][][] { strArray20 };
        java.lang.String[][][][][] strArray22 = new java.lang.String[][][][][] { strArray10, strArray21 };
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][]> strArrayItor23 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray22);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor24 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strArray22);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][]> strArrayItor25 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray22);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]> objItorArrayItor26 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strArray22);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][]> strArrayItor27 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strArray22);
        java.util.Iterator<?> wildcardItor28 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strArrayItor27);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArrayItor23);
        org.junit.Assert.assertNotNull(objItorItor24);
        org.junit.Assert.assertNotNull(strArrayItor25);
        org.junit.Assert.assertNotNull(objItorArrayItor26);
        org.junit.Assert.assertNotNull(strArrayItor27);
        org.junit.Assert.assertNotNull(wildcardItor28);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[][]> objItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][]> charSequenceItorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorArrayItor0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItorArrayItor0);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.lang.Class<?> wildcardClass4 = iteratorArray1.getClass();
        java.lang.Class[] classArray6 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        wildcardClassArray7[0] = wildcardClass4;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray7);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.Type[]) wildcardClassArray7, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor15 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray7, (int) (short) 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor17 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray7, (int) (short) 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor18 = org.apache.commons.collections4.IteratorUtils.singletonIterator(wildcardClassArray7);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertArrayEquals(classArray6, new java.lang.Class[] { java.util.Iterator[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertArrayEquals(wildcardClassArray7, new java.lang.Class[] { java.util.Iterator[].class });
        org.junit.Assert.assertNotNull(wildcardClassItor10);
        org.junit.Assert.assertNotNull(typeItor13);
        org.junit.Assert.assertNotNull(genericDeclarationItor15);
        org.junit.Assert.assertNotNull(genericDeclarationItor17);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor18);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.apache.commons.collections4.MapIterator<java.lang.Object[][], java.lang.reflect.AnnotatedElement[][]> objArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][]> serializableItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objArrayItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArrayItor0);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>, org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> serializableItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(serializableItorItor0);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.collections4.OrderedIterator<java.lang.Class<?>[][]> wildcardClassArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator[][]> iteratorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClassArrayItor0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassArrayItor0);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.apache.commons.collections4.OrderedIterator[][][][] orderedIteratorArray1 = new org.apache.commons.collections4.OrderedIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][] objItorArray2 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]) orderedIteratorArray1;
        org.apache.commons.collections4.OrderedIterator[][][][] orderedIteratorArray4 = new org.apache.commons.collections4.OrderedIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][] objItorArray5 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]) orderedIteratorArray4;
        org.apache.commons.collections4.OrderedIterator[][][][] orderedIteratorArray7 = new org.apache.commons.collections4.OrderedIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][] objItorArray8 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]) orderedIteratorArray7;
        org.apache.commons.collections4.OrderedIterator[][][][] orderedIteratorArray10 = new org.apache.commons.collections4.OrderedIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][] objItorArray11 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]) orderedIteratorArray10;
        org.apache.commons.collections4.OrderedIterator[][][][][] orderedIteratorArray13 = new org.apache.commons.collections4.OrderedIterator[4][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][] objItorArray14 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][]) orderedIteratorArray13;
        objItorArray14[0] = objItorArray2;
        objItorArray14[1] = objItorArray5;
        objItorArray14[2] = objItorArray8;
        objItorArray14[3] = objItorArray11;
        java.util.ListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][]> objItorArrayItor23 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItorArray14);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]> objItorArrayItor24 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray14);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]> objItorArrayItor27 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray14, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(orderedIteratorArray1);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray1, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertArrayEquals(objItorArray2, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray4);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray4, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(objItorArray5);
        org.junit.Assert.assertArrayEquals(objItorArray5, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray7);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray7, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(objItorArray8);
        org.junit.Assert.assertArrayEquals(objItorArray8, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray10);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray10, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(objItorArray11);
        org.junit.Assert.assertArrayEquals(objItorArray11, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray13);
        org.junit.Assert.assertNotNull(objItorArray14);
        org.junit.Assert.assertNotNull(objItorArrayItor23);
        org.junit.Assert.assertNotNull(objItorArrayItor24);
        org.junit.Assert.assertNotNull(objItorArrayItor27);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][]> wildcardClassArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 0, (int) 'a', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1, 0);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorArray1);
        java.util.Iterator<?> wildcardItor8 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.util.Iterator[][]> iteratorArrayItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.util.Iterator[][]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor11 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor6);
        org.junit.Assert.assertNotNull(iteratorItor7);
        org.junit.Assert.assertNotNull(wildcardItor8);
        org.junit.Assert.assertNotNull(iteratorArrayItor9);
        org.junit.Assert.assertNotNull(objItorArrayItor10);
        org.junit.Assert.assertNotNull(resettableIteratorItor11);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][][][]> orderedMapIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor0);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.apache.commons.collections4.OrderedMapIterator[][][][][][][][][] orderedMapIteratorArray0 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][][][][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][][][][]> orderedMapIteratorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(orderedMapIteratorArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIteratorArray0);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray0, new org.apache.commons.collections4.OrderedMapIterator[][][][][][][][][] {});
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableListIterator<java.lang.Object>>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][][][][][]> strArrayItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1, 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(iteratorItor6);
        org.junit.Assert.assertNotNull(objItorItor7);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.apache.commons.collections4.ResettableListIterator[][] resettableListIteratorArray1 = new org.apache.commons.collections4.ResettableListIterator[0][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][] objItorArray2 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]) resettableListIteratorArray1;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]) objItorArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableListIteratorArray1);
        org.junit.Assert.assertArrayEquals(resettableListIteratorArray1, new org.apache.commons.collections4.ResettableListIterator[][] {});
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertArrayEquals(objItorArray2, new org.apache.commons.collections4.ResettableListIterator[][] {});
        org.junit.Assert.assertNotNull(objItorArrayItor3);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][]> serializableItorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(obj0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedMapIterator[][][], org.apache.commons.collections4.OrderedMapIterator[][][][][]> orderedMapIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor0);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>> charSequenceItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray1);
        java.util.Iterator<java.lang.Class<?>> wildcardClassItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Class<?>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator[]> orderedMapIteratorArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator[]>[]) iteratorArray1);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Comparable<java.lang.String>>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator[]> iteratorArrayItor11 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(genericDeclarationItor3);
        org.junit.Assert.assertNotNull(charSequenceItorItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(wildcardClassItor6);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor7);
        org.junit.Assert.assertNotNull(strComparableItor8);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.apache.commons.collections4.MapIterator[][][][][][] mapIteratorArray1 = new org.apache.commons.collections4.MapIterator[0][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][] serializableItorArray2 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][]) mapIteratorArray1;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][]> serializableItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(serializableItorArray2);
        java.util.Iterator<?> wildcardItor4 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) serializableItorArray2);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][]> serializableItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.singletonIterator(serializableItorArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][]> serializableItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mapIteratorArray1);
        org.junit.Assert.assertArrayEquals(mapIteratorArray1, new org.apache.commons.collections4.MapIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(serializableItorArray2);
        org.junit.Assert.assertArrayEquals(serializableItorArray2, new org.apache.commons.collections4.MapIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(serializableItorArrayItor3);
        org.junit.Assert.assertNotNull(wildcardItor4);
        org.junit.Assert.assertNotNull(serializableItorArrayItor5);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>> charSequenceItorItor4 = org.apache.commons.collections4.IteratorUtils.singletonIterator(charSequenceItor3);
        java.lang.Class<?> wildcardClass5 = charSequenceItorItor4.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor6 = org.apache.commons.collections4.IteratorUtils.singletonIterator(wildcardClass5);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(charSequenceItorItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClassItor6);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]> charSequenceItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]>[]) iteratorArray1);
        java.util.Iterator<java.lang.Class<?>> wildcardClassItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Class<?>>[]) iteratorArray1);
        java.util.Iterator<?> wildcardItor7 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(genericDeclarationItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor5);
        org.junit.Assert.assertNotNull(wildcardClassItor6);
        org.junit.Assert.assertNotNull(wildcardItor7);
        org.junit.Assert.assertNotNull(objItorItor8);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][][][], java.util.Iterator> objItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(objItorArrayItor0);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1);
        java.util.Iterator<java.lang.Class<?>> wildcardClassItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Class<?>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.Object[]> objArrayItor6 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.Object[]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][]> serializableItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][]> serializableItorArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(genericDeclarationItor3);
        org.junit.Assert.assertNotNull(wildcardClassItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor5);
        org.junit.Assert.assertNotNull(objArrayItor6);
        org.junit.Assert.assertNotNull(serializableItorArrayItor7);
        org.junit.Assert.assertNotNull(serializableItorArrayItor8);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        java.lang.Class<?>[][][][][][][] wildcardClassArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][][][][][]> wildcardClassArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.OrderedMapIterator[][][][], org.apache.commons.collections4.OrderedIterator<java.lang.Object>> orderedMapIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor0);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.apache.commons.collections4.ResettableListIterator resettableListIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor1 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor2);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor2);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray6 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray7 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray6;
        objItorArray7[0] = resettableListIterator0;
        objItorArray7[1] = objItor1;
        objItorArray7[2] = objItor2;
        org.apache.commons.collections4.ResettableListIterator resettableListIterator14 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor15 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor16 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor17 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor16);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor18 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor16);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray20 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray21 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray20;
        objItorArray21[0] = resettableListIterator14;
        objItorArray21[1] = objItor15;
        objItorArray21[2] = objItor16;
        org.apache.commons.collections4.ResettableListIterator resettableListIterator28 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor29 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor30 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor31 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor30);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor32 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor30);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray34 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray35 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray34;
        objItorArray35[0] = resettableListIterator28;
        objItorArray35[1] = objItor29;
        objItorArray35[2] = objItor30;
        org.apache.commons.collections4.ResettableListIterator resettableListIterator42 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor43 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor44 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor45 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor44);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor46 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor44);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray48 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray49 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray48;
        objItorArray49[0] = resettableListIterator42;
        objItorArray49[1] = objItor43;
        objItorArray49[2] = objItor44;
        org.apache.commons.collections4.ResettableListIterator[][] resettableListIteratorArray57 = new org.apache.commons.collections4.ResettableListIterator[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][] objItorArray58 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]) resettableListIteratorArray57;
        objItorArray58[0] = objItorArray7;
        objItorArray58[1] = objItorArray21;
        objItorArray58[2] = objItorArray35;
        objItorArray58[3] = objItorArray49;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor67 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray58);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor68 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItorArray58);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object[]> objArrayItor69 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItorArray58);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]> objItorArrayItor70 = org.apache.commons.collections4.IteratorUtils.singletonIterator((org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]) objItorArray58);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor71 = org.apache.commons.collections4.IteratorUtils.arrayIterator((org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]) objItorArray58);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor73 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItorArray58, 1);
        org.apache.commons.collections4.ResettableListIterator<java.io.Serializable> serializableItor75 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorArray58, (int) (byte) 0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor77 = org.apache.commons.collections4.IteratorUtils.arrayIterator((org.apache.commons.collections4.ResettableIterator[][]) objItorArray58, 4);
        org.junit.Assert.assertNotNull(resettableListIterator0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(resettableListIteratorArray6);
        org.junit.Assert.assertNotNull(objItorArray7);
        org.junit.Assert.assertNotNull(resettableListIterator14);
        org.junit.Assert.assertNotNull(objItor15);
        org.junit.Assert.assertNotNull(objItor16);
        org.junit.Assert.assertNotNull(objItorItor17);
        org.junit.Assert.assertNotNull(objItorItor18);
        org.junit.Assert.assertNotNull(resettableListIteratorArray20);
        org.junit.Assert.assertNotNull(objItorArray21);
        org.junit.Assert.assertNotNull(resettableListIterator28);
        org.junit.Assert.assertNotNull(objItor29);
        org.junit.Assert.assertNotNull(objItor30);
        org.junit.Assert.assertNotNull(objItorItor31);
        org.junit.Assert.assertNotNull(objItorItor32);
        org.junit.Assert.assertNotNull(resettableListIteratorArray34);
        org.junit.Assert.assertNotNull(objItorArray35);
        org.junit.Assert.assertNotNull(resettableListIterator42);
        org.junit.Assert.assertNotNull(objItor43);
        org.junit.Assert.assertNotNull(objItor44);
        org.junit.Assert.assertNotNull(objItorItor45);
        org.junit.Assert.assertNotNull(objItorItor46);
        org.junit.Assert.assertNotNull(resettableListIteratorArray48);
        org.junit.Assert.assertNotNull(objItorArray49);
        org.junit.Assert.assertNotNull(resettableListIteratorArray57);
        org.junit.Assert.assertNotNull(objItorArray58);
        org.junit.Assert.assertNotNull(objItorArrayItor67);
        org.junit.Assert.assertNotNull(objItorArrayItor68);
        org.junit.Assert.assertNotNull(objArrayItor69);
        org.junit.Assert.assertNotNull(objItorArrayItor70);
        org.junit.Assert.assertNotNull(objItorArrayItor71);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor73);
        org.junit.Assert.assertNotNull(serializableItor75);
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor77);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor3);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor4);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor5);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor6);
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertNotNull(serializableItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(serializableItor5);
        org.junit.Assert.assertNotNull(serializableItor6);
        org.junit.Assert.assertNotNull(serializableItor7);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.lang.Class<?> wildcardClass1 = resettableIterator0.getClass();
        java.util.ListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.GenericDeclaration) wildcardClass1);
        java.util.Iterator<?> wildcardItor3 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) genericDeclarationItor2);
        java.util.Iterator<?> wildcardItor4 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) wildcardItor3);
        java.lang.Class<?> wildcardClass5 = wildcardItor4.getClass();
        org.junit.Assert.assertNotNull(resettableIterator0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(genericDeclarationItor2);
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertNotNull(wildcardItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        java.lang.Class[][][][][][] classArray1 = new java.lang.Class[0][][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][][]) classArray1;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][][][][]> wildcardClassArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][][][][]> wildcardClassArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray2, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertArrayEquals(classArray1, new java.lang.Class[][][][][][] {});
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertArrayEquals(wildcardClassArray2, new java.lang.Class[][][][][][] {});
        org.junit.Assert.assertNotNull(wildcardClassArrayItor3);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor2);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor2);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor4);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor4);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor6);
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertNotNull(serializableItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(serializableItor5);
        org.junit.Assert.assertNotNull(serializableItor6);
        org.junit.Assert.assertNotNull(serializableItor7);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1, 0);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][]> charSequenceItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]> serializableItorArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator[][][]> orderedMapIteratorArrayItor9 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator[][][]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor6);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor7);
        org.junit.Assert.assertNotNull(serializableItorArrayItor8);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor9);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]> charSequenceItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]> serializableItorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) charSequenceItorArrayItor0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor0);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.apache.commons.collections4.MapIterator<java.lang.Object[][], java.lang.String[]> objArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(objArrayItor0);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor2);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor3);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor4);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor4);
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertNotNull(serializableItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(serializableItor5);
        org.junit.Assert.assertNotNull(serializableItor6);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1);
        java.util.Iterator<java.lang.Class<?>> wildcardClassItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Class<?>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][]> charSequenceItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(genericDeclarationItor3);
        org.junit.Assert.assertNotNull(wildcardClassItor4);
        org.junit.Assert.assertNotNull(genericDeclarationItor5);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor6);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.apache.commons.collections4.ResettableListIterator[][][] resettableListIteratorArray1 = new org.apache.commons.collections4.ResettableListIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][][] objItorArray2 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][][]) resettableListIteratorArray1;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray2);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray2);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][][]> objItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItorArray2);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][][]> strArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItorArrayItor6, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableListIteratorArray1);
        org.junit.Assert.assertArrayEquals(resettableListIteratorArray1, new org.apache.commons.collections4.ResettableListIterator[][][] {});
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertArrayEquals(objItorArray2, new org.apache.commons.collections4.ResettableListIterator[][][] {});
        org.junit.Assert.assertNotNull(objItorArrayItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(objItorArrayItor5);
        org.junit.Assert.assertNotNull(objItorArrayItor6);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray1 = new org.apache.commons.collections4.iterators.ZippingIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[] charSequenceItorArray2 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]) zippingIteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray4 = new org.apache.commons.collections4.iterators.ZippingIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[] charSequenceItorArray5 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]) zippingIteratorArray4;
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray7 = new org.apache.commons.collections4.iterators.ZippingIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[] charSequenceItorArray8 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]) zippingIteratorArray7;
        org.apache.commons.collections4.iterators.ZippingIterator[][] zippingIteratorArray10 = new org.apache.commons.collections4.iterators.ZippingIterator[3][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][] charSequenceItorArray11 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]) zippingIteratorArray10;
        charSequenceItorArray11[0] = charSequenceItorArray2;
        charSequenceItorArray11[1] = zippingIteratorArray4;
        charSequenceItorArray11[2] = charSequenceItorArray8;
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray19 = new org.apache.commons.collections4.iterators.ZippingIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[] charSequenceItorArray20 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]) zippingIteratorArray19;
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray22 = new org.apache.commons.collections4.iterators.ZippingIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[] charSequenceItorArray23 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]) zippingIteratorArray22;
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray25 = new org.apache.commons.collections4.iterators.ZippingIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[] charSequenceItorArray26 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]) zippingIteratorArray25;
        org.apache.commons.collections4.iterators.ZippingIterator[][] zippingIteratorArray28 = new org.apache.commons.collections4.iterators.ZippingIterator[3][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][] charSequenceItorArray29 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]) zippingIteratorArray28;
        charSequenceItorArray29[0] = charSequenceItorArray20;
        charSequenceItorArray29[1] = zippingIteratorArray22;
        charSequenceItorArray29[2] = charSequenceItorArray26;
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray37 = new org.apache.commons.collections4.iterators.ZippingIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[] charSequenceItorArray38 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]) zippingIteratorArray37;
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray40 = new org.apache.commons.collections4.iterators.ZippingIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[] charSequenceItorArray41 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]) zippingIteratorArray40;
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray43 = new org.apache.commons.collections4.iterators.ZippingIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[] charSequenceItorArray44 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]) zippingIteratorArray43;
        org.apache.commons.collections4.iterators.ZippingIterator[][] zippingIteratorArray46 = new org.apache.commons.collections4.iterators.ZippingIterator[3][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][] charSequenceItorArray47 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]) zippingIteratorArray46;
        charSequenceItorArray47[0] = charSequenceItorArray38;
        charSequenceItorArray47[1] = zippingIteratorArray40;
        charSequenceItorArray47[2] = charSequenceItorArray44;
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray55 = new org.apache.commons.collections4.iterators.ZippingIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[] charSequenceItorArray56 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]) zippingIteratorArray55;
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray58 = new org.apache.commons.collections4.iterators.ZippingIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[] charSequenceItorArray59 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]) zippingIteratorArray58;
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray61 = new org.apache.commons.collections4.iterators.ZippingIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[] charSequenceItorArray62 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]) zippingIteratorArray61;
        org.apache.commons.collections4.iterators.ZippingIterator[][] zippingIteratorArray64 = new org.apache.commons.collections4.iterators.ZippingIterator[3][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][] charSequenceItorArray65 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]) zippingIteratorArray64;
        charSequenceItorArray65[0] = charSequenceItorArray56;
        charSequenceItorArray65[1] = zippingIteratorArray58;
        charSequenceItorArray65[2] = charSequenceItorArray62;
        org.apache.commons.collections4.iterators.ZippingIterator[][][] zippingIteratorArray73 = new org.apache.commons.collections4.iterators.ZippingIterator[4][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][] charSequenceItorArray74 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]) zippingIteratorArray73;
        charSequenceItorArray74[0] = charSequenceItorArray11;
        charSequenceItorArray74[1] = charSequenceItorArray29;
        charSequenceItorArray74[2] = charSequenceItorArray47;
        charSequenceItorArray74[3] = charSequenceItorArray65;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]> charSequenceItorArrayItor85 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceItorArray74, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor88 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) 1, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zippingIteratorArray1);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray1, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray2);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray2, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray4);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray4, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray5);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray5, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray7);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray7, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray8);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray8, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray10);
        org.junit.Assert.assertNotNull(charSequenceItorArray11);
        org.junit.Assert.assertNotNull(zippingIteratorArray19);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray19, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray20);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray20, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray22);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray22, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray23);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray23, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray25);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray25, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray26);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray26, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray28);
        org.junit.Assert.assertNotNull(charSequenceItorArray29);
        org.junit.Assert.assertNotNull(zippingIteratorArray37);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray37, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray38);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray38, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray40);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray40, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray41);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray41, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray43);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray43, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray44);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray44, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray46);
        org.junit.Assert.assertNotNull(charSequenceItorArray47);
        org.junit.Assert.assertNotNull(zippingIteratorArray55);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray55, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray56);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray56, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray58);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray58, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray59);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray59, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray61);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray61, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray62);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray62, new org.apache.commons.collections4.iterators.ZippingIterator[] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray64);
        org.junit.Assert.assertNotNull(charSequenceItorArray65);
        org.junit.Assert.assertNotNull(zippingIteratorArray73);
        org.junit.Assert.assertNotNull(charSequenceItorArray74);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor85);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.apache.commons.collections4.MapIterator[][][][] mapIteratorArray1 = new org.apache.commons.collections4.MapIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][] serializableItorArray2 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]) mapIteratorArray1;
        org.apache.commons.collections4.MapIterator[][][][][] mapIteratorArray4 = new org.apache.commons.collections4.MapIterator[1][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][] serializableItorArray5 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][]) mapIteratorArray4;
        serializableItorArray5[0] = serializableItorArray2;
        org.apache.commons.collections4.MapIterator[][][][] mapIteratorArray9 = new org.apache.commons.collections4.MapIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][] serializableItorArray10 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]) mapIteratorArray9;
        org.apache.commons.collections4.MapIterator[][][][][] mapIteratorArray12 = new org.apache.commons.collections4.MapIterator[1][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][] serializableItorArray13 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][]) mapIteratorArray12;
        serializableItorArray13[0] = serializableItorArray10;
        org.apache.commons.collections4.MapIterator[][][][] mapIteratorArray17 = new org.apache.commons.collections4.MapIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][] serializableItorArray18 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]) mapIteratorArray17;
        org.apache.commons.collections4.MapIterator[][][][][] mapIteratorArray20 = new org.apache.commons.collections4.MapIterator[1][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][] serializableItorArray21 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][]) mapIteratorArray20;
        serializableItorArray21[0] = serializableItorArray18;
        org.apache.commons.collections4.MapIterator[][][][] mapIteratorArray25 = new org.apache.commons.collections4.MapIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][] serializableItorArray26 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]) mapIteratorArray25;
        org.apache.commons.collections4.MapIterator[][][][][] mapIteratorArray28 = new org.apache.commons.collections4.MapIterator[1][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][] serializableItorArray29 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][]) mapIteratorArray28;
        serializableItorArray29[0] = serializableItorArray26;
        org.apache.commons.collections4.MapIterator[][][][][][] mapIteratorArray33 = new org.apache.commons.collections4.MapIterator[4][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][] serializableItorArray34 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][]) mapIteratorArray33;
        serializableItorArray34[0] = serializableItorArray5;
        serializableItorArray34[1] = serializableItorArray13;
        serializableItorArray34[2] = serializableItorArray21;
        serializableItorArray34[3] = serializableItorArray29;
        org.apache.commons.collections4.MapIterator[][][][] mapIteratorArray44 = new org.apache.commons.collections4.MapIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][] serializableItorArray45 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]) mapIteratorArray44;
        org.apache.commons.collections4.MapIterator[][][][][] mapIteratorArray47 = new org.apache.commons.collections4.MapIterator[1][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][] serializableItorArray48 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][]) mapIteratorArray47;
        serializableItorArray48[0] = serializableItorArray45;
        org.apache.commons.collections4.MapIterator[][][][] mapIteratorArray52 = new org.apache.commons.collections4.MapIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][] serializableItorArray53 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]) mapIteratorArray52;
        org.apache.commons.collections4.MapIterator[][][][][] mapIteratorArray55 = new org.apache.commons.collections4.MapIterator[1][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][] serializableItorArray56 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][]) mapIteratorArray55;
        serializableItorArray56[0] = serializableItorArray53;
        org.apache.commons.collections4.MapIterator[][][][] mapIteratorArray60 = new org.apache.commons.collections4.MapIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][] serializableItorArray61 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]) mapIteratorArray60;
        org.apache.commons.collections4.MapIterator[][][][][] mapIteratorArray63 = new org.apache.commons.collections4.MapIterator[1][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][] serializableItorArray64 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][]) mapIteratorArray63;
        serializableItorArray64[0] = serializableItorArray61;
        org.apache.commons.collections4.MapIterator[][][][] mapIteratorArray68 = new org.apache.commons.collections4.MapIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][] serializableItorArray69 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]) mapIteratorArray68;
        org.apache.commons.collections4.MapIterator[][][][][] mapIteratorArray71 = new org.apache.commons.collections4.MapIterator[1][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][] serializableItorArray72 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][]) mapIteratorArray71;
        serializableItorArray72[0] = serializableItorArray69;
        org.apache.commons.collections4.MapIterator[][][][][][] mapIteratorArray76 = new org.apache.commons.collections4.MapIterator[4][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][] serializableItorArray77 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][]) mapIteratorArray76;
        serializableItorArray77[0] = serializableItorArray48;
        serializableItorArray77[1] = serializableItorArray56;
        serializableItorArray77[2] = serializableItorArray64;
        serializableItorArray77[3] = serializableItorArray72;
        org.apache.commons.collections4.MapIterator[][][][][][][] mapIteratorArray87 = new org.apache.commons.collections4.MapIterator[2][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][] serializableItorArray88 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][]) mapIteratorArray87;
        serializableItorArray88[0] = serializableItorArray34;
        serializableItorArray88[1] = serializableItorArray77;
        org.apache.commons.collections4.MapIterator[][][][][][][][] mapIteratorArray94 = new org.apache.commons.collections4.MapIterator[1][][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][][] serializableItorArray95 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][][]) mapIteratorArray94;
        serializableItorArray95[0] = serializableItorArray88;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][]> serializableItorArrayItor99 = org.apache.commons.collections4.IteratorUtils.arrayIterator(serializableItorArray95, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mapIteratorArray1);
        org.junit.Assert.assertArrayEquals(mapIteratorArray1, new org.apache.commons.collections4.MapIterator[][][][] {});
        org.junit.Assert.assertNotNull(serializableItorArray2);
        org.junit.Assert.assertArrayEquals(serializableItorArray2, new org.apache.commons.collections4.MapIterator[][][][] {});
        org.junit.Assert.assertNotNull(mapIteratorArray4);
        org.junit.Assert.assertNotNull(serializableItorArray5);
        org.junit.Assert.assertNotNull(mapIteratorArray9);
        org.junit.Assert.assertArrayEquals(mapIteratorArray9, new org.apache.commons.collections4.MapIterator[][][][] {});
        org.junit.Assert.assertNotNull(serializableItorArray10);
        org.junit.Assert.assertArrayEquals(serializableItorArray10, new org.apache.commons.collections4.MapIterator[][][][] {});
        org.junit.Assert.assertNotNull(mapIteratorArray12);
        org.junit.Assert.assertNotNull(serializableItorArray13);
        org.junit.Assert.assertNotNull(mapIteratorArray17);
        org.junit.Assert.assertArrayEquals(mapIteratorArray17, new org.apache.commons.collections4.MapIterator[][][][] {});
        org.junit.Assert.assertNotNull(serializableItorArray18);
        org.junit.Assert.assertArrayEquals(serializableItorArray18, new org.apache.commons.collections4.MapIterator[][][][] {});
        org.junit.Assert.assertNotNull(mapIteratorArray20);
        org.junit.Assert.assertNotNull(serializableItorArray21);
        org.junit.Assert.assertNotNull(mapIteratorArray25);
        org.junit.Assert.assertArrayEquals(mapIteratorArray25, new org.apache.commons.collections4.MapIterator[][][][] {});
        org.junit.Assert.assertNotNull(serializableItorArray26);
        org.junit.Assert.assertArrayEquals(serializableItorArray26, new org.apache.commons.collections4.MapIterator[][][][] {});
        org.junit.Assert.assertNotNull(mapIteratorArray28);
        org.junit.Assert.assertNotNull(serializableItorArray29);
        org.junit.Assert.assertNotNull(mapIteratorArray33);
        org.junit.Assert.assertNotNull(serializableItorArray34);
        org.junit.Assert.assertNotNull(mapIteratorArray44);
        org.junit.Assert.assertArrayEquals(mapIteratorArray44, new org.apache.commons.collections4.MapIterator[][][][] {});
        org.junit.Assert.assertNotNull(serializableItorArray45);
        org.junit.Assert.assertArrayEquals(serializableItorArray45, new org.apache.commons.collections4.MapIterator[][][][] {});
        org.junit.Assert.assertNotNull(mapIteratorArray47);
        org.junit.Assert.assertNotNull(serializableItorArray48);
        org.junit.Assert.assertNotNull(mapIteratorArray52);
        org.junit.Assert.assertArrayEquals(mapIteratorArray52, new org.apache.commons.collections4.MapIterator[][][][] {});
        org.junit.Assert.assertNotNull(serializableItorArray53);
        org.junit.Assert.assertArrayEquals(serializableItorArray53, new org.apache.commons.collections4.MapIterator[][][][] {});
        org.junit.Assert.assertNotNull(mapIteratorArray55);
        org.junit.Assert.assertNotNull(serializableItorArray56);
        org.junit.Assert.assertNotNull(mapIteratorArray60);
        org.junit.Assert.assertArrayEquals(mapIteratorArray60, new org.apache.commons.collections4.MapIterator[][][][] {});
        org.junit.Assert.assertNotNull(serializableItorArray61);
        org.junit.Assert.assertArrayEquals(serializableItorArray61, new org.apache.commons.collections4.MapIterator[][][][] {});
        org.junit.Assert.assertNotNull(mapIteratorArray63);
        org.junit.Assert.assertNotNull(serializableItorArray64);
        org.junit.Assert.assertNotNull(mapIteratorArray68);
        org.junit.Assert.assertArrayEquals(mapIteratorArray68, new org.apache.commons.collections4.MapIterator[][][][] {});
        org.junit.Assert.assertNotNull(serializableItorArray69);
        org.junit.Assert.assertArrayEquals(serializableItorArray69, new org.apache.commons.collections4.MapIterator[][][][] {});
        org.junit.Assert.assertNotNull(mapIteratorArray71);
        org.junit.Assert.assertNotNull(serializableItorArray72);
        org.junit.Assert.assertNotNull(mapIteratorArray76);
        org.junit.Assert.assertNotNull(serializableItorArray77);
        org.junit.Assert.assertNotNull(mapIteratorArray87);
        org.junit.Assert.assertNotNull(serializableItorArray88);
        org.junit.Assert.assertNotNull(mapIteratorArray94);
        org.junit.Assert.assertNotNull(serializableItorArray95);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1, 0);
        java.util.Iterator<java.lang.String[][][][][][][][]> strArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[][][][][][][][]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][][][]> wildcardClassArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strArrayItor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor6);
        org.junit.Assert.assertNotNull(strArrayItor7);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.apache.commons.collections4.MapIterator[][] mapIteratorArray1 = new org.apache.commons.collections4.MapIterator[0][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][] serializableItorArray2 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]) mapIteratorArray1;
        org.apache.commons.collections4.MapIterator[][][] mapIteratorArray4 = new org.apache.commons.collections4.MapIterator[1][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][] serializableItorArray5 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]) mapIteratorArray4;
        serializableItorArray5[0] = serializableItorArray2;
        org.apache.commons.collections4.MapIterator[][][][] mapIteratorArray9 = new org.apache.commons.collections4.MapIterator[1][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][] serializableItorArray10 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]) mapIteratorArray9;
        serializableItorArray10[0] = serializableItorArray5;
        org.apache.commons.collections4.MapIterator[][] mapIteratorArray14 = new org.apache.commons.collections4.MapIterator[0][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][] serializableItorArray15 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]) mapIteratorArray14;
        org.apache.commons.collections4.MapIterator[][][] mapIteratorArray17 = new org.apache.commons.collections4.MapIterator[1][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][] serializableItorArray18 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]) mapIteratorArray17;
        serializableItorArray18[0] = serializableItorArray15;
        org.apache.commons.collections4.MapIterator[][][][] mapIteratorArray22 = new org.apache.commons.collections4.MapIterator[1][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][] serializableItorArray23 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]) mapIteratorArray22;
        serializableItorArray23[0] = serializableItorArray18;
        org.apache.commons.collections4.MapIterator[][] mapIteratorArray27 = new org.apache.commons.collections4.MapIterator[0][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][] serializableItorArray28 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]) mapIteratorArray27;
        org.apache.commons.collections4.MapIterator[][][] mapIteratorArray30 = new org.apache.commons.collections4.MapIterator[1][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][] serializableItorArray31 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]) mapIteratorArray30;
        serializableItorArray31[0] = serializableItorArray28;
        org.apache.commons.collections4.MapIterator[][][][] mapIteratorArray35 = new org.apache.commons.collections4.MapIterator[1][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][] serializableItorArray36 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]) mapIteratorArray35;
        serializableItorArray36[0] = serializableItorArray31;
        org.apache.commons.collections4.MapIterator[][][][][] mapIteratorArray40 = new org.apache.commons.collections4.MapIterator[3][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][] serializableItorArray41 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][]) mapIteratorArray40;
        serializableItorArray41[0] = serializableItorArray10;
        serializableItorArray41[1] = serializableItorArray23;
        serializableItorArray41[2] = serializableItorArray36;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]> serializableItorArrayItor48 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray41);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]> serializableItorArrayItor49 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray41);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]> serializableItorArrayItor50 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray41);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor52 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) serializableItorArray41, 3);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][][][][]> wildcardClassArrayItor53 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) serializableItorArray41);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor54 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) serializableItorArray41);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]> serializableItorArrayItor56 = org.apache.commons.collections4.IteratorUtils.arrayIterator(serializableItorArray41, (int) (short) 1);
        org.junit.Assert.assertNotNull(mapIteratorArray1);
        org.junit.Assert.assertArrayEquals(mapIteratorArray1, new org.apache.commons.collections4.MapIterator[][] {});
        org.junit.Assert.assertNotNull(serializableItorArray2);
        org.junit.Assert.assertArrayEquals(serializableItorArray2, new org.apache.commons.collections4.MapIterator[][] {});
        org.junit.Assert.assertNotNull(mapIteratorArray4);
        org.junit.Assert.assertNotNull(serializableItorArray5);
        org.junit.Assert.assertNotNull(mapIteratorArray9);
        org.junit.Assert.assertNotNull(serializableItorArray10);
        org.junit.Assert.assertNotNull(mapIteratorArray14);
        org.junit.Assert.assertArrayEquals(mapIteratorArray14, new org.apache.commons.collections4.MapIterator[][] {});
        org.junit.Assert.assertNotNull(serializableItorArray15);
        org.junit.Assert.assertArrayEquals(serializableItorArray15, new org.apache.commons.collections4.MapIterator[][] {});
        org.junit.Assert.assertNotNull(mapIteratorArray17);
        org.junit.Assert.assertNotNull(serializableItorArray18);
        org.junit.Assert.assertNotNull(mapIteratorArray22);
        org.junit.Assert.assertNotNull(serializableItorArray23);
        org.junit.Assert.assertNotNull(mapIteratorArray27);
        org.junit.Assert.assertArrayEquals(mapIteratorArray27, new org.apache.commons.collections4.MapIterator[][] {});
        org.junit.Assert.assertNotNull(serializableItorArray28);
        org.junit.Assert.assertArrayEquals(serializableItorArray28, new org.apache.commons.collections4.MapIterator[][] {});
        org.junit.Assert.assertNotNull(mapIteratorArray30);
        org.junit.Assert.assertNotNull(serializableItorArray31);
        org.junit.Assert.assertNotNull(mapIteratorArray35);
        org.junit.Assert.assertNotNull(serializableItorArray36);
        org.junit.Assert.assertNotNull(mapIteratorArray40);
        org.junit.Assert.assertNotNull(serializableItorArray41);
        org.junit.Assert.assertNotNull(serializableItorArrayItor48);
        org.junit.Assert.assertNotNull(serializableItorArrayItor49);
        org.junit.Assert.assertNotNull(serializableItorArrayItor50);
        org.junit.Assert.assertNotNull(objItorItor52);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor53);
        org.junit.Assert.assertNotNull(objItorItor54);
        org.junit.Assert.assertNotNull(serializableItorArrayItor56);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor1);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor1);
        java.lang.Class<?> wildcardClass4 = serializableItor3.getClass();
        java.lang.Class[] classArray6 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        wildcardClassArray7[0] = wildcardClass4;
        java.lang.Class[][] classArray11 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray12 = (java.lang.Class<?>[][]) classArray11;
        wildcardClassArray12[0] = wildcardClassArray7;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[]> wildcardClassArrayItor15 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][][][]> wildcardClassArrayItor17 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClassArray12, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(serializableItorItor2);
        org.junit.Assert.assertNotNull(serializableItor3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertArrayEquals(classArray6, new java.lang.Class[] { org.apache.commons.collections4.iterators.UnmodifiableMapIterator.class });
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertArrayEquals(wildcardClassArray7, new java.lang.Class[] { org.apache.commons.collections4.iterators.UnmodifiableMapIterator.class });
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor15);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator0);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor1);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor2);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor3);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor4);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor4);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor6);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor8 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor7);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor7);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor9);
        java.util.Iterator<?> wildcardItor11 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) resettableIteratorItor9);
        java.util.Iterator<?> wildcardItor12 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) wildcardItor11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[][]> orderedMapIteratorArrayItor14 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardItor11, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIterator0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(resettableIteratorItor3);
        org.junit.Assert.assertNotNull(resettableIteratorItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(resettableIteratorItor7);
        org.junit.Assert.assertNotNull(resettableIteratorItor8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(wildcardItor11);
        org.junit.Assert.assertNotNull(wildcardItor12);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator2 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor3 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator2);
        java.lang.Object[] objArray6 = new java.lang.Object[] { resettableIterator0, (short) 100, resettableIteratorItor3, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray6, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor10 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor9);
        java.util.Iterator<?> wildcardItor11 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) objItor9);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray13 = new org.apache.commons.collections4.ResettableListIterator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray14 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray13;
        objItorArray14[0] = objItor9;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor17 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray14);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor18 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((org.apache.commons.collections4.ResettableIterator[]) objItorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator((org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) objItorArray14);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor20 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor23 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray14, 0, (int) (short) 0);
        java.util.ListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor24 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) objItorArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor27 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((org.apache.commons.collections4.ResettableIterator[]) objItorArray14, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIterator0);
        org.junit.Assert.assertNotNull(resettableIterator2);
        org.junit.Assert.assertNotNull(resettableIteratorItor3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertNotNull(objItorItor10);
        org.junit.Assert.assertNotNull(wildcardItor11);
        org.junit.Assert.assertNotNull(resettableListIteratorArray13);
        org.junit.Assert.assertNotNull(objItorArray14);
        org.junit.Assert.assertNotNull(objItorItor17);
        org.junit.Assert.assertNotNull(resettableIteratorItor18);
        org.junit.Assert.assertNotNull(objItorItor19);
        org.junit.Assert.assertNotNull(objItorArrayItor20);
        org.junit.Assert.assertNotNull(objItorItor23);
        org.junit.Assert.assertNotNull(objItorArrayItor24);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.lang.Class<?> wildcardClass4 = iteratorArray1.getClass();
        java.lang.Class[] classArray6 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        wildcardClassArray7[0] = wildcardClass4;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray7);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>> wildcardClassItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray7, (int) (byte) 0);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor13 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.AnnotatedElement[]) wildcardClassArray7);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]> objItorArrayItor14 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClassArray7);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor15 = org.apache.commons.collections4.IteratorUtils.singletonIterator(wildcardClassArray7);
        java.util.ListIterator<java.lang.Class<?>[]> wildcardClassArrayItor16 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(wildcardClassArray7);
        java.util.ListIterator<java.lang.Class<?>[]> wildcardClassArrayItor17 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(wildcardClassArray7);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[][][]> orderedMapIteratorArrayItor18 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClassArray7);
        java.util.Iterator<?> wildcardItor19 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) orderedMapIteratorArrayItor18);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertArrayEquals(classArray6, new java.lang.Class[] { java.util.Iterator[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertArrayEquals(wildcardClassArray7, new java.lang.Class[] { java.util.Iterator[].class });
        org.junit.Assert.assertNotNull(wildcardClassItor10);
        org.junit.Assert.assertNotNull(wildcardClassItor12);
        org.junit.Assert.assertNotNull(annotatedElementItor13);
        org.junit.Assert.assertNotNull(objItorArrayItor14);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor15);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor16);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor17);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor18);
        org.junit.Assert.assertNotNull(wildcardItor19);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>> charSequenceItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator[][]> orderedMapIteratorArrayItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator[][]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator[][][][][][]> orderedMapIteratorArrayItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator[][][][][][]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][]> charSequenceItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(genericDeclarationItor3);
        org.junit.Assert.assertNotNull(charSequenceItorItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor5);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor6);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor7);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.apache.commons.collections4.OrderedIterator[] orderedIteratorArray1 = new org.apache.commons.collections4.OrderedIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[] objItorArray2 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) orderedIteratorArray1;
        org.apache.commons.collections4.OrderedIterator[] orderedIteratorArray4 = new org.apache.commons.collections4.OrderedIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[] objItorArray5 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) orderedIteratorArray4;
        org.apache.commons.collections4.OrderedIterator[] orderedIteratorArray7 = new org.apache.commons.collections4.OrderedIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[] objItorArray8 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) orderedIteratorArray7;
        org.apache.commons.collections4.OrderedIterator[][] orderedIteratorArray10 = new org.apache.commons.collections4.OrderedIterator[3][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][] objItorArray11 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]) orderedIteratorArray10;
        objItorArray11[0] = objItorArray2;
        objItorArray11[1] = objItorArray5;
        objItorArray11[2] = objItorArray8;
        org.apache.commons.collections4.OrderedIterator[] orderedIteratorArray19 = new org.apache.commons.collections4.OrderedIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[] objItorArray20 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) orderedIteratorArray19;
        org.apache.commons.collections4.OrderedIterator[] orderedIteratorArray22 = new org.apache.commons.collections4.OrderedIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[] objItorArray23 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) orderedIteratorArray22;
        org.apache.commons.collections4.OrderedIterator[] orderedIteratorArray25 = new org.apache.commons.collections4.OrderedIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[] objItorArray26 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) orderedIteratorArray25;
        org.apache.commons.collections4.OrderedIterator[][] orderedIteratorArray28 = new org.apache.commons.collections4.OrderedIterator[3][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][] objItorArray29 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]) orderedIteratorArray28;
        objItorArray29[0] = objItorArray20;
        objItorArray29[1] = objItorArray23;
        objItorArray29[2] = objItorArray26;
        org.apache.commons.collections4.OrderedIterator[] orderedIteratorArray37 = new org.apache.commons.collections4.OrderedIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[] objItorArray38 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) orderedIteratorArray37;
        org.apache.commons.collections4.OrderedIterator[] orderedIteratorArray40 = new org.apache.commons.collections4.OrderedIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[] objItorArray41 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) orderedIteratorArray40;
        org.apache.commons.collections4.OrderedIterator[] orderedIteratorArray43 = new org.apache.commons.collections4.OrderedIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[] objItorArray44 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) orderedIteratorArray43;
        org.apache.commons.collections4.OrderedIterator[][] orderedIteratorArray46 = new org.apache.commons.collections4.OrderedIterator[3][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][] objItorArray47 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]) orderedIteratorArray46;
        objItorArray47[0] = objItorArray38;
        objItorArray47[1] = objItorArray41;
        objItorArray47[2] = objItorArray44;
        org.apache.commons.collections4.OrderedIterator[] orderedIteratorArray55 = new org.apache.commons.collections4.OrderedIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[] objItorArray56 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) orderedIteratorArray55;
        org.apache.commons.collections4.OrderedIterator[] orderedIteratorArray58 = new org.apache.commons.collections4.OrderedIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[] objItorArray59 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) orderedIteratorArray58;
        org.apache.commons.collections4.OrderedIterator[] orderedIteratorArray61 = new org.apache.commons.collections4.OrderedIterator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[] objItorArray62 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) orderedIteratorArray61;
        org.apache.commons.collections4.OrderedIterator[][] orderedIteratorArray64 = new org.apache.commons.collections4.OrderedIterator[3][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][] objItorArray65 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]) orderedIteratorArray64;
        objItorArray65[0] = objItorArray56;
        objItorArray65[1] = objItorArray59;
        objItorArray65[2] = objItorArray62;
        org.apache.commons.collections4.OrderedIterator[][][] orderedIteratorArray73 = new org.apache.commons.collections4.OrderedIterator[4][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][] objItorArray74 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]) orderedIteratorArray73;
        objItorArray74[0] = objItorArray11;
        objItorArray74[1] = objItorArray29;
        objItorArray74[2] = objItorArray47;
        objItorArray74[3] = objItorArray65;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]> objItorArrayItor84 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray74, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedIteratorArray1);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray1, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertArrayEquals(objItorArray2, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray4);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray4, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(objItorArray5);
        org.junit.Assert.assertArrayEquals(objItorArray5, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray7);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray7, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(objItorArray8);
        org.junit.Assert.assertArrayEquals(objItorArray8, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray10);
        org.junit.Assert.assertNotNull(objItorArray11);
        org.junit.Assert.assertNotNull(orderedIteratorArray19);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray19, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(objItorArray20);
        org.junit.Assert.assertArrayEquals(objItorArray20, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray22);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray22, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(objItorArray23);
        org.junit.Assert.assertArrayEquals(objItorArray23, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray25);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray25, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(objItorArray26);
        org.junit.Assert.assertArrayEquals(objItorArray26, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray28);
        org.junit.Assert.assertNotNull(objItorArray29);
        org.junit.Assert.assertNotNull(orderedIteratorArray37);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray37, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(objItorArray38);
        org.junit.Assert.assertArrayEquals(objItorArray38, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray40);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray40, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(objItorArray41);
        org.junit.Assert.assertArrayEquals(objItorArray41, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray43);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray43, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(objItorArray44);
        org.junit.Assert.assertArrayEquals(objItorArray44, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray46);
        org.junit.Assert.assertNotNull(objItorArray47);
        org.junit.Assert.assertNotNull(orderedIteratorArray55);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray55, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(objItorArray56);
        org.junit.Assert.assertArrayEquals(objItorArray56, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray58);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray58, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(objItorArray59);
        org.junit.Assert.assertArrayEquals(objItorArray59, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray61);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray61, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(objItorArray62);
        org.junit.Assert.assertArrayEquals(objItorArray62, new org.apache.commons.collections4.OrderedIterator[] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray64);
        org.junit.Assert.assertNotNull(objItorArray65);
        org.junit.Assert.assertNotNull(orderedIteratorArray73);
        org.junit.Assert.assertNotNull(objItorArray74);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor1 = org.apache.commons.collections4.IteratorUtils.singletonIterator((org.apache.commons.collections4.OrderedMapIterator) serializableItorArrayItor0);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String[][], java.io.Serializable> strArrayItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement[][], java.io.Serializable> annotatedElementArrayItor3 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray4 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor0, strArrayItor2, annotatedElementArrayItor3 };
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray5 = new org.apache.commons.collections4.OrderedMapIterator[][] { orderedMapIteratorArray4 };
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor7 = org.apache.commons.collections4.IteratorUtils.singletonIterator((org.apache.commons.collections4.OrderedMapIterator) serializableItorArrayItor6);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String[][], java.io.Serializable> strArrayItor8 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement[][], java.io.Serializable> annotatedElementArrayItor9 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray10 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor6, strArrayItor8, annotatedElementArrayItor9 };
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray11 = new org.apache.commons.collections4.OrderedMapIterator[][] { orderedMapIteratorArray10 };
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor13 = org.apache.commons.collections4.IteratorUtils.singletonIterator((org.apache.commons.collections4.OrderedMapIterator) serializableItorArrayItor12);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String[][], java.io.Serializable> strArrayItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement[][], java.io.Serializable> annotatedElementArrayItor15 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray16 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor12, strArrayItor14, annotatedElementArrayItor15 };
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray17 = new org.apache.commons.collections4.OrderedMapIterator[][] { orderedMapIteratorArray16 };
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor18 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor19 = org.apache.commons.collections4.IteratorUtils.singletonIterator((org.apache.commons.collections4.OrderedMapIterator) serializableItorArrayItor18);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String[][], java.io.Serializable> strArrayItor20 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement[][], java.io.Serializable> annotatedElementArrayItor21 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray22 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor18, strArrayItor20, annotatedElementArrayItor21 };
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray23 = new org.apache.commons.collections4.OrderedMapIterator[][] { orderedMapIteratorArray22 };
        org.apache.commons.collections4.OrderedMapIterator[][][] orderedMapIteratorArray24 = new org.apache.commons.collections4.OrderedMapIterator[][][] { orderedMapIteratorArray5, orderedMapIteratorArray11, orderedMapIteratorArray17, orderedMapIteratorArray23 };
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[][]> orderedMapIteratorArrayItor26 = org.apache.commons.collections4.IteratorUtils.arrayIterator(orderedMapIteratorArray24, (int) (byte) 0);
        java.util.ListIterator<org.apache.commons.collections4.OrderedMapIterator[][][]> orderedMapIteratorArrayItor27 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(orderedMapIteratorArray24);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][][]> strArrayItor29 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) orderedMapIteratorArray24, (int) (short) 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[][]> orderedMapIteratorArrayItor31 = org.apache.commons.collections4.IteratorUtils.arrayIterator(orderedMapIteratorArray24, 1);
        org.junit.Assert.assertNotNull(serializableItorArrayItor0);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor1);
        org.junit.Assert.assertNotNull(strArrayItor2);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor3);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray4);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray5);
        org.junit.Assert.assertNotNull(serializableItorArrayItor6);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor7);
        org.junit.Assert.assertNotNull(strArrayItor8);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor9);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray10);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray11);
        org.junit.Assert.assertNotNull(serializableItorArrayItor12);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor13);
        org.junit.Assert.assertNotNull(strArrayItor14);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor15);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray16);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray17);
        org.junit.Assert.assertNotNull(serializableItorArrayItor18);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor19);
        org.junit.Assert.assertNotNull(strArrayItor20);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor21);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray22);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray23);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray24);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor26);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor27);
        org.junit.Assert.assertNotNull(strArrayItor29);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor31);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator2 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor3 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator2);
        java.lang.Object[] objArray6 = new java.lang.Object[] { resettableIterator0, (short) 100, resettableIteratorItor3, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray6, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor10 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor9);
        org.apache.commons.collections4.ResettableIterator resettableIterator11 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator13 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor14 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator13);
        java.lang.Object[] objArray17 = new java.lang.Object[] { resettableIterator11, (short) 100, resettableIteratorItor14, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor20 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray17, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor21 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor20);
        org.apache.commons.collections4.ResettableIterator resettableIterator22 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator24 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor25 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator24);
        java.lang.Object[] objArray28 = new java.lang.Object[] { resettableIterator22, (short) 100, resettableIteratorItor25, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray28, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor32 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor31);
        org.apache.commons.collections4.ResettableIterator resettableIterator33 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator35 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor36 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator35);
        java.lang.Object[] objArray39 = new java.lang.Object[] { resettableIterator33, (short) 100, resettableIteratorItor36, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor42 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray39, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator resettableIterator43 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator45 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor46 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator45);
        java.lang.Object[] objArray49 = new java.lang.Object[] { resettableIterator43, (short) 100, resettableIteratorItor46, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor52 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray49, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator resettableIterator53 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator55 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor56 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator55);
        java.lang.Object[] objArray59 = new java.lang.Object[] { resettableIterator53, (short) 100, resettableIteratorItor56, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor62 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray59, 0, (int) (byte) 1);
        org.apache.commons.collections4.OrderedIterator[] orderedIteratorArray64 = new org.apache.commons.collections4.OrderedIterator[6];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[] objItorArray65 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) orderedIteratorArray64;
        objItorArray65[0] = objItor9;
        objItorArray65[1] = objItor20;
        objItorArray65[2] = objItor31;
        objItorArray65[3] = objItor42;
        objItorArray65[4] = objItor52;
        objItorArray65[5] = objItor62;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor78 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray65);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor79 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((org.apache.commons.collections4.ResettableIterator) objItorItor78);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor80 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor79);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor81 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor80);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor82 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor81);
        org.junit.Assert.assertNotNull(resettableIterator0);
        org.junit.Assert.assertNotNull(resettableIterator2);
        org.junit.Assert.assertNotNull(resettableIteratorItor3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertNotNull(objItorItor10);
        org.junit.Assert.assertNotNull(resettableIterator11);
        org.junit.Assert.assertNotNull(resettableIterator13);
        org.junit.Assert.assertNotNull(resettableIteratorItor14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objItor20);
        org.junit.Assert.assertNotNull(objItorItor21);
        org.junit.Assert.assertNotNull(resettableIterator22);
        org.junit.Assert.assertNotNull(resettableIterator24);
        org.junit.Assert.assertNotNull(resettableIteratorItor25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objItor31);
        org.junit.Assert.assertNotNull(objItorItor32);
        org.junit.Assert.assertNotNull(resettableIterator33);
        org.junit.Assert.assertNotNull(resettableIterator35);
        org.junit.Assert.assertNotNull(resettableIteratorItor36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objItor42);
        org.junit.Assert.assertNotNull(resettableIterator43);
        org.junit.Assert.assertNotNull(resettableIterator45);
        org.junit.Assert.assertNotNull(resettableIteratorItor46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objItor52);
        org.junit.Assert.assertNotNull(resettableIterator53);
        org.junit.Assert.assertNotNull(resettableIterator55);
        org.junit.Assert.assertNotNull(resettableIteratorItor56);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objItor62);
        org.junit.Assert.assertNotNull(orderedIteratorArray64);
        org.junit.Assert.assertNotNull(objItorArray65);
        org.junit.Assert.assertNotNull(objItorItor78);
        org.junit.Assert.assertNotNull(resettableIteratorItor79);
        org.junit.Assert.assertNotNull(resettableIteratorItor80);
        org.junit.Assert.assertNotNull(resettableIteratorItor81);
        org.junit.Assert.assertNotNull(resettableIteratorItor82);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Class<?>[][][][][][], java.lang.Object[]> wildcardClassArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) wildcardClassArrayItor0);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor0);
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[][][][]> orderedMapIteratorArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) serializableItor1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(serializableItorItor2);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        java.lang.String[][][][] strArray0 = new java.lang.String[][][][] {};
        java.lang.String[][][][][] strArray1 = new java.lang.String[][][][][] { strArray0 };
        java.lang.String[][][][] strArray2 = new java.lang.String[][][][] {};
        java.lang.String[][][][][] strArray3 = new java.lang.String[][][][][] { strArray2 };
        java.lang.String[][][][] strArray4 = new java.lang.String[][][][] {};
        java.lang.String[][][][][] strArray5 = new java.lang.String[][][][][] { strArray4 };
        java.lang.String[][][][][][] strArray6 = new java.lang.String[][][][][][] { strArray1, strArray3, strArray5 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][][]> strArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][][]> strArrayItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6, 1, 3);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][]> strArrayItor11 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][][]> strArrayItor13 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[][][][] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[][][][] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[][][][] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArrayItor7);
        org.junit.Assert.assertNotNull(strArrayItor10);
        org.junit.Assert.assertNotNull(strArrayItor11);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray1 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray2 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray3 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray4 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray5 = new java.lang.String[][][][][][] { strArray0, strArray1, strArray2, strArray3, strArray4 };
        java.lang.String[][][][][] strArray6 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray7 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray8 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray9 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray10 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray11 = new java.lang.String[][][][][][] { strArray6, strArray7, strArray8, strArray9, strArray10 };
        java.lang.String[][][][][] strArray12 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray13 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray14 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray15 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray16 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray17 = new java.lang.String[][][][][][] { strArray12, strArray13, strArray14, strArray15, strArray16 };
        java.lang.String[][][][][][][] strArray18 = new java.lang.String[][][][][][][] { strArray5, strArray11, strArray17 };
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][]> strArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][][][]> strArrayItor20 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray18);
        java.util.ListIterator<java.lang.String[][][][][][][]> strArrayItor21 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(strArray18);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][][]> strArrayItor22 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strArray18);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArrayItor19);
        org.junit.Assert.assertNotNull(strArrayItor20);
        org.junit.Assert.assertNotNull(strArrayItor21);
        org.junit.Assert.assertNotNull(strArrayItor22);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.apache.commons.collections4.MapIterator[][][][][][] mapIteratorArray1 = new org.apache.commons.collections4.MapIterator[0][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][] serializableItorArray2 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][]) mapIteratorArray1;
        org.apache.commons.collections4.MapIterator[][][][][][][] mapIteratorArray4 = new org.apache.commons.collections4.MapIterator[1][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][] serializableItorArray5 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][]) mapIteratorArray4;
        serializableItorArray5[0] = serializableItorArray2;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][]> serializableItorArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator(serializableItorArray5);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][]> serializableItorArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray5);
        org.junit.Assert.assertNotNull(mapIteratorArray1);
        org.junit.Assert.assertArrayEquals(mapIteratorArray1, new org.apache.commons.collections4.MapIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(serializableItorArray2);
        org.junit.Assert.assertArrayEquals(serializableItorArray2, new org.apache.commons.collections4.MapIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(mapIteratorArray4);
        org.junit.Assert.assertNotNull(serializableItorArray5);
        org.junit.Assert.assertNotNull(serializableItorArrayItor8);
        org.junit.Assert.assertNotNull(serializableItorArrayItor9);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.apache.commons.collections4.iterators.ZippingIterator[][][] zippingIteratorArray1 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][] charSequenceItorArray2 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]) zippingIteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator[][][] zippingIteratorArray4 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][] charSequenceItorArray5 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]) zippingIteratorArray4;
        org.apache.commons.collections4.iterators.ZippingIterator[][][] zippingIteratorArray7 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][] charSequenceItorArray8 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]) zippingIteratorArray7;
        org.apache.commons.collections4.iterators.ZippingIterator[][][] zippingIteratorArray10 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][] charSequenceItorArray11 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]) zippingIteratorArray10;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][] zippingIteratorArray13 = new org.apache.commons.collections4.iterators.ZippingIterator[4][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][] charSequenceItorArray14 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][]) zippingIteratorArray13;
        charSequenceItorArray14[0] = charSequenceItorArray2;
        charSequenceItorArray14[1] = charSequenceItorArray5;
        charSequenceItorArray14[2] = charSequenceItorArray8;
        charSequenceItorArray14[3] = charSequenceItorArray11;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]> charSequenceItorArrayItor23 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceItorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]> charSequenceItorArrayItor24 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceItorArray14);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object[]> objArrayItor27 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[][]) charSequenceItorArray14, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(zippingIteratorArray1);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray1, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray2);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray2, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray4);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray4, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray5);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray5, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray7);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray7, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray8);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray8, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray10);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray10, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray11);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray11, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray13);
        org.junit.Assert.assertNotNull(charSequenceItorArray14);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor23);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor24);
        org.junit.Assert.assertNotNull(objArrayItor27);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray1 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray2 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray3 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray4 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray5 = new java.lang.String[][][][][][] { strArray0, strArray1, strArray2, strArray3, strArray4 };
        java.lang.String[][][][][] strArray6 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray7 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray8 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray9 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray10 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray11 = new java.lang.String[][][][][][] { strArray6, strArray7, strArray8, strArray9, strArray10 };
        java.lang.String[][][][][] strArray12 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray13 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray14 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray15 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray16 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray17 = new java.lang.String[][][][][][] { strArray12, strArray13, strArray14, strArray15, strArray16 };
        java.lang.String[][][][][][][] strArray18 = new java.lang.String[][][][][][][] { strArray5, strArray11, strArray17 };
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][]> strArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][][][]> strArrayItor21 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray18, 0);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][]> strArrayItor22 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray18);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][][][]> strArrayItor23 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray18);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][][]> strArrayItor24 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strArray18);
        java.util.ListIterator<java.lang.String[][][][][][][]> strArrayItor25 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(strArray18);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][]> strArrayItor27 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray18, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArrayItor19);
        org.junit.Assert.assertNotNull(strArrayItor21);
        org.junit.Assert.assertNotNull(strArrayItor22);
        org.junit.Assert.assertNotNull(strArrayItor23);
        org.junit.Assert.assertNotNull(strArrayItor24);
        org.junit.Assert.assertNotNull(strArrayItor25);
        org.junit.Assert.assertNotNull(strArrayItor27);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][]>[] wildcardItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][]> serializableItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.zippingIterator(wildcardItorArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][] zippingIteratorArray1 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][] charSequenceItorArray2 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][]) zippingIteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][] zippingIteratorArray4 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][] charSequenceItorArray5 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][]) zippingIteratorArray4;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][] zippingIteratorArray7 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][] charSequenceItorArray8 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][]) zippingIteratorArray7;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][][] zippingIteratorArray10 = new org.apache.commons.collections4.iterators.ZippingIterator[3][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][] charSequenceItorArray11 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][]) zippingIteratorArray10;
        charSequenceItorArray11[0] = charSequenceItorArray2;
        charSequenceItorArray11[1] = charSequenceItorArray5;
        charSequenceItorArray11[2] = charSequenceItorArray8;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][] zippingIteratorArray19 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][] charSequenceItorArray20 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][]) zippingIteratorArray19;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][] zippingIteratorArray22 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][] charSequenceItorArray23 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][]) zippingIteratorArray22;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][] zippingIteratorArray25 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][] charSequenceItorArray26 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][]) zippingIteratorArray25;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][][] zippingIteratorArray28 = new org.apache.commons.collections4.iterators.ZippingIterator[3][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][] charSequenceItorArray29 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][]) zippingIteratorArray28;
        charSequenceItorArray29[0] = charSequenceItorArray20;
        charSequenceItorArray29[1] = charSequenceItorArray23;
        charSequenceItorArray29[2] = charSequenceItorArray26;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][] zippingIteratorArray37 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][] charSequenceItorArray38 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][]) zippingIteratorArray37;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][] zippingIteratorArray40 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][] charSequenceItorArray41 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][]) zippingIteratorArray40;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][] zippingIteratorArray43 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][] charSequenceItorArray44 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][]) zippingIteratorArray43;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][][] zippingIteratorArray46 = new org.apache.commons.collections4.iterators.ZippingIterator[3][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][] charSequenceItorArray47 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][]) zippingIteratorArray46;
        charSequenceItorArray47[0] = charSequenceItorArray38;
        charSequenceItorArray47[1] = charSequenceItorArray41;
        charSequenceItorArray47[2] = charSequenceItorArray44;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][] zippingIteratorArray55 = new org.apache.commons.collections4.iterators.ZippingIterator[3][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][] charSequenceItorArray56 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][]) zippingIteratorArray55;
        charSequenceItorArray56[0] = charSequenceItorArray11;
        charSequenceItorArray56[1] = charSequenceItorArray29;
        charSequenceItorArray56[2] = charSequenceItorArray47;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][]> charSequenceItorArrayItor63 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceItorArray56);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][]> charSequenceItorArrayItor66 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceItorArray56, 5, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zippingIteratorArray1);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray1, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray2);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray2, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray4);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray4, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray5);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray5, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray7);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray7, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray8);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray8, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray10);
        org.junit.Assert.assertNotNull(charSequenceItorArray11);
        org.junit.Assert.assertNotNull(zippingIteratorArray19);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray19, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray20);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray20, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray22);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray22, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray23);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray23, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray25);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray25, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray26);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray26, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray28);
        org.junit.Assert.assertNotNull(charSequenceItorArray29);
        org.junit.Assert.assertNotNull(zippingIteratorArray37);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray37, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray38);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray38, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray40);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray40, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray41);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray41, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray43);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray43, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray44);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray44, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray46);
        org.junit.Assert.assertNotNull(charSequenceItorArray47);
        org.junit.Assert.assertNotNull(zippingIteratorArray55);
        org.junit.Assert.assertNotNull(charSequenceItorArray56);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor63);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][][]> objItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(objItorArrayItor0);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.apache.commons.collections4.OrderedIterator[][][][][][][] orderedIteratorArray1 = new org.apache.commons.collections4.OrderedIterator[0][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][][][] objItorArray2 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][][][]) orderedIteratorArray1;
        org.apache.commons.collections4.OrderedIterator[][][][][][][] orderedIteratorArray4 = new org.apache.commons.collections4.OrderedIterator[0][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][][][] objItorArray5 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][][][]) orderedIteratorArray4;
        org.apache.commons.collections4.OrderedIterator[][][][][][][] orderedIteratorArray7 = new org.apache.commons.collections4.OrderedIterator[0][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][][][] objItorArray8 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][][][]) orderedIteratorArray7;
        org.apache.commons.collections4.OrderedIterator[][][][][][][][] orderedIteratorArray10 = new org.apache.commons.collections4.OrderedIterator[3][][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][][][][] objItorArray11 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][][][][]) orderedIteratorArray10;
        objItorArray11[0] = objItorArray2;
        objItorArray11[1] = objItorArray5;
        objItorArray11[2] = objItorArray8;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][][][]> objItorArrayItor18 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray11);
        org.junit.Assert.assertNotNull(orderedIteratorArray1);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray1, new org.apache.commons.collections4.OrderedIterator[][][][][][][] {});
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertArrayEquals(objItorArray2, new org.apache.commons.collections4.OrderedIterator[][][][][][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray4);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray4, new org.apache.commons.collections4.OrderedIterator[][][][][][][] {});
        org.junit.Assert.assertNotNull(objItorArray5);
        org.junit.Assert.assertArrayEquals(objItorArray5, new org.apache.commons.collections4.OrderedIterator[][][][][][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray7);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray7, new org.apache.commons.collections4.OrderedIterator[][][][][][][] {});
        org.junit.Assert.assertNotNull(objItorArray8);
        org.junit.Assert.assertArrayEquals(objItorArray8, new org.apache.commons.collections4.OrderedIterator[][][][][][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray10);
        org.junit.Assert.assertNotNull(objItorArray11);
        org.junit.Assert.assertNotNull(objItorArrayItor18);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.apache.commons.collections4.ResettableListIterator[][][] resettableListIteratorArray1 = new org.apache.commons.collections4.ResettableListIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][][] objItorArray2 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][][]) resettableListIteratorArray1;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray2);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray2);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]> objItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]) objItorArray2);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]> objItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]) objItorArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]> objItorArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]) objItorArray2, (int) (byte) 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableListIteratorArray1);
        org.junit.Assert.assertArrayEquals(resettableListIteratorArray1, new org.apache.commons.collections4.ResettableListIterator[][][] {});
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertArrayEquals(objItorArray2, new org.apache.commons.collections4.ResettableListIterator[][][] {});
        org.junit.Assert.assertNotNull(objItorArrayItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(objItorArrayItor5);
        org.junit.Assert.assertNotNull(objItorArrayItor6);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][] objItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]> objItorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>> charSequenceItorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strArray4);
        org.apache.commons.collections4.ResettableIterator<java.lang.String> strItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray4, (int) (short) 0, (int) (short) 0);
        org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence> charSequenceItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.CharSequence[]) strArray4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray4, (int) (byte) 0);
        org.apache.commons.collections4.ResettableIterator<java.lang.String> strItor15 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray4, 2, 4);
        java.util.Iterator<?> wildcardItor16 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(charSequenceItorItor6);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNotNull(charSequenceItor10);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(wildcardItor16);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor2);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor2);
        java.util.Iterator<?> wildcardItor5 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) serializableItor4);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][]> serializableItorArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) serializableItor6, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertNotNull(serializableItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(wildcardItor5);
        org.junit.Assert.assertNotNull(serializableItor6);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.apache.commons.collections4.MapIterator<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][]> wildcardClassArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) charSequenceItor0, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceItor0);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator0);
        java.util.ListIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> resettableIteratorItorItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIteratorItor1);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor1);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor3);
        java.util.Iterator<?> wildcardItor5 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) resettableIteratorItor3);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor3);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(resettableIterator0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItorItor2);
        org.junit.Assert.assertNotNull(resettableIteratorItor3);
        org.junit.Assert.assertNotNull(resettableIteratorItor4);
        org.junit.Assert.assertNotNull(wildcardItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(resettableIteratorItor7);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1, 0);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorArray1);
        java.util.Iterator<?> wildcardItor8 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.util.Iterator[][]> iteratorArrayItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.util.Iterator[][]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor10 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator[]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][][][][][][][]> strArrayItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor6);
        org.junit.Assert.assertNotNull(iteratorItor7);
        org.junit.Assert.assertNotNull(wildcardItor8);
        org.junit.Assert.assertNotNull(iteratorArrayItor9);
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor10);
        org.junit.Assert.assertNotNull(strArrayItor11);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.apache.commons.collections4.OrderedMapIterator[][][][] orderedMapIteratorArray0 = new org.apache.commons.collections4.OrderedMapIterator[][][][] {};
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[][][]> orderedMapIteratorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(orderedMapIteratorArray0, (int) (short) 0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[][][]> orderedMapIteratorArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator(orderedMapIteratorArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[][][]> orderedMapIteratorArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(orderedMapIteratorArray0, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIteratorArray0);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray0, new org.apache.commons.collections4.OrderedMapIterator[][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor2);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor4);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.AnnotatedElement[][]> annotatedElementArrayItor6 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.AnnotatedElement[][]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> charSequenceItorArrayItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(serializableItorItor5);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor6);
        org.junit.Assert.assertNotNull(objItorArrayItor7);
        org.junit.Assert.assertNotNull(serializableItorItor8);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor9);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        java.util.Iterator<java.lang.Object[][]> objArrayItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Object[][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][]> strArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        java.util.Iterator<java.lang.Class<?>[]> wildcardClassArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Class<?>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]> charSequenceItorArrayItor9 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(objArrayItor5);
        org.junit.Assert.assertNotNull(strArrayItor6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor8);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor9);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.apache.commons.collections4.ResettableListIterator resettableListIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor1 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor2);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor2);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray6 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray7 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray6;
        objItorArray7[0] = resettableListIterator0;
        objItorArray7[1] = objItor1;
        objItorArray7[2] = objItor2;
        org.apache.commons.collections4.ResettableListIterator resettableListIterator14 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor15 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor16 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor17 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor16);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor18 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor16);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray20 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray21 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray20;
        objItorArray21[0] = resettableListIterator14;
        objItorArray21[1] = objItor15;
        objItorArray21[2] = objItor16;
        org.apache.commons.collections4.ResettableListIterator resettableListIterator28 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor29 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor30 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor31 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor30);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor32 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor30);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray34 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray35 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray34;
        objItorArray35[0] = resettableListIterator28;
        objItorArray35[1] = objItor29;
        objItorArray35[2] = objItor30;
        org.apache.commons.collections4.ResettableListIterator resettableListIterator42 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor43 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor44 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor45 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor44);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor46 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor44);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray48 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray49 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray48;
        objItorArray49[0] = resettableListIterator42;
        objItorArray49[1] = objItor43;
        objItorArray49[2] = objItor44;
        org.apache.commons.collections4.ResettableListIterator[][] resettableListIteratorArray57 = new org.apache.commons.collections4.ResettableListIterator[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][] objItorArray58 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]) resettableListIteratorArray57;
        objItorArray58[0] = objItorArray7;
        objItorArray58[1] = objItorArray21;
        objItorArray58[2] = objItorArray35;
        objItorArray58[3] = objItorArray49;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor67 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray58);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor68 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItorArray58);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor69 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray58);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor71 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray58, 1);
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator[]> iteratorArrayItor72 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.util.Iterator[][]) objItorArray58);
        org.junit.Assert.assertNotNull(resettableListIterator0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(resettableListIteratorArray6);
        org.junit.Assert.assertNotNull(objItorArray7);
        org.junit.Assert.assertNotNull(resettableListIterator14);
        org.junit.Assert.assertNotNull(objItor15);
        org.junit.Assert.assertNotNull(objItor16);
        org.junit.Assert.assertNotNull(objItorItor17);
        org.junit.Assert.assertNotNull(objItorItor18);
        org.junit.Assert.assertNotNull(resettableListIteratorArray20);
        org.junit.Assert.assertNotNull(objItorArray21);
        org.junit.Assert.assertNotNull(resettableListIterator28);
        org.junit.Assert.assertNotNull(objItor29);
        org.junit.Assert.assertNotNull(objItor30);
        org.junit.Assert.assertNotNull(objItorItor31);
        org.junit.Assert.assertNotNull(objItorItor32);
        org.junit.Assert.assertNotNull(resettableListIteratorArray34);
        org.junit.Assert.assertNotNull(objItorArray35);
        org.junit.Assert.assertNotNull(resettableListIterator42);
        org.junit.Assert.assertNotNull(objItor43);
        org.junit.Assert.assertNotNull(objItor44);
        org.junit.Assert.assertNotNull(objItorItor45);
        org.junit.Assert.assertNotNull(objItorItor46);
        org.junit.Assert.assertNotNull(resettableListIteratorArray48);
        org.junit.Assert.assertNotNull(objItorArray49);
        org.junit.Assert.assertNotNull(resettableListIteratorArray57);
        org.junit.Assert.assertNotNull(objItorArray58);
        org.junit.Assert.assertNotNull(objItorArrayItor67);
        org.junit.Assert.assertNotNull(objItorArrayItor68);
        org.junit.Assert.assertNotNull(objItorArrayItor69);
        org.junit.Assert.assertNotNull(objItorArrayItor71);
        org.junit.Assert.assertNotNull(iteratorArrayItor72);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][][]> wildcardClassArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray2);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][][]> wildcardClassArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][][]> wildcardClassArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray2, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertArrayEquals(classArray1, new java.lang.Class[][][][] {});
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertArrayEquals(wildcardClassArray2, new java.lang.Class[][][][] {});
        org.junit.Assert.assertNotNull(wildcardClassArrayItor3);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor4);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.apache.commons.collections4.OrderedIterator[][][][] orderedIteratorArray1 = new org.apache.commons.collections4.OrderedIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][] objItorArray2 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]) orderedIteratorArray1;
        org.apache.commons.collections4.OrderedIterator[][][][] orderedIteratorArray4 = new org.apache.commons.collections4.OrderedIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][] objItorArray5 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]) orderedIteratorArray4;
        org.apache.commons.collections4.OrderedIterator[][][][] orderedIteratorArray7 = new org.apache.commons.collections4.OrderedIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][] objItorArray8 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]) orderedIteratorArray7;
        org.apache.commons.collections4.OrderedIterator[][][][] orderedIteratorArray10 = new org.apache.commons.collections4.OrderedIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][] objItorArray11 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]) orderedIteratorArray10;
        org.apache.commons.collections4.OrderedIterator[][][][] orderedIteratorArray13 = new org.apache.commons.collections4.OrderedIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][] objItorArray14 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]) orderedIteratorArray13;
        org.apache.commons.collections4.OrderedIterator[][][][][] orderedIteratorArray16 = new org.apache.commons.collections4.OrderedIterator[5][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][] objItorArray17 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][]) orderedIteratorArray16;
        objItorArray17[0] = objItorArray2;
        objItorArray17[1] = objItorArray5;
        objItorArray17[2] = objItorArray8;
        objItorArray17[3] = objItorArray11;
        objItorArray17[4] = objItorArray14;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]> objItorArrayItor30 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray17, 0, 0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][]> objItorArrayItor31 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItorArray17);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]> objItorArrayItor34 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray17, 0, 2);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]> objItorArrayItor35 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray17);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]> objItorArrayItor36 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray17);
        org.junit.Assert.assertNotNull(orderedIteratorArray1);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray1, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertArrayEquals(objItorArray2, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray4);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray4, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(objItorArray5);
        org.junit.Assert.assertArrayEquals(objItorArray5, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray7);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray7, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(objItorArray8);
        org.junit.Assert.assertArrayEquals(objItorArray8, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray10);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray10, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(objItorArray11);
        org.junit.Assert.assertArrayEquals(objItorArray11, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray13);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray13, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(objItorArray14);
        org.junit.Assert.assertArrayEquals(objItorArray14, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray16);
        org.junit.Assert.assertNotNull(objItorArray17);
        org.junit.Assert.assertNotNull(objItorArrayItor30);
        org.junit.Assert.assertNotNull(objItorArrayItor31);
        org.junit.Assert.assertNotNull(objItorArrayItor34);
        org.junit.Assert.assertNotNull(objItorArrayItor35);
        org.junit.Assert.assertNotNull(objItorArrayItor36);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement[], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]> annotatedElementArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object[][], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> objArrayItor1 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedMapIterator[], java.lang.CharSequence> orderedMapIteratorArrayItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence, java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement[][], org.apache.commons.collections4.OrderedMapIterator> annotatedElementArrayItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray5 = new org.apache.commons.collections4.OrderedMapIterator[] { annotatedElementArrayItor0, objArrayItor1, orderedMapIteratorArrayItor2, charSequenceItor3, annotatedElementArrayItor4 };
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement[], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]> annotatedElementArrayItor6 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object[][], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> objArrayItor7 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedMapIterator[], java.lang.CharSequence> orderedMapIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence, java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> charSequenceItor9 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement[][], org.apache.commons.collections4.OrderedMapIterator> annotatedElementArrayItor10 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray11 = new org.apache.commons.collections4.OrderedMapIterator[] { annotatedElementArrayItor6, objArrayItor7, orderedMapIteratorArrayItor8, charSequenceItor9, annotatedElementArrayItor10 };
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement[], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]> annotatedElementArrayItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object[][], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> objArrayItor13 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedMapIterator[], java.lang.CharSequence> orderedMapIteratorArrayItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence, java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> charSequenceItor15 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement[][], org.apache.commons.collections4.OrderedMapIterator> annotatedElementArrayItor16 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray17 = new org.apache.commons.collections4.OrderedMapIterator[] { annotatedElementArrayItor12, objArrayItor13, orderedMapIteratorArrayItor14, charSequenceItor15, annotatedElementArrayItor16 };
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement[], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]> annotatedElementArrayItor18 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object[][], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> objArrayItor19 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedMapIterator[], java.lang.CharSequence> orderedMapIteratorArrayItor20 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence, java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> charSequenceItor21 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement[][], org.apache.commons.collections4.OrderedMapIterator> annotatedElementArrayItor22 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray23 = new org.apache.commons.collections4.OrderedMapIterator[] { annotatedElementArrayItor18, objArrayItor19, orderedMapIteratorArrayItor20, charSequenceItor21, annotatedElementArrayItor22 };
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement[], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]> annotatedElementArrayItor24 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object[][], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> objArrayItor25 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedMapIterator[], java.lang.CharSequence> orderedMapIteratorArrayItor26 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence, java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> charSequenceItor27 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement[][], org.apache.commons.collections4.OrderedMapIterator> annotatedElementArrayItor28 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray29 = new org.apache.commons.collections4.OrderedMapIterator[] { annotatedElementArrayItor24, objArrayItor25, orderedMapIteratorArrayItor26, charSequenceItor27, annotatedElementArrayItor28 };
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement[], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]> annotatedElementArrayItor30 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object[][], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> objArrayItor31 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedMapIterator[], java.lang.CharSequence> orderedMapIteratorArrayItor32 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence, java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> charSequenceItor33 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement[][], org.apache.commons.collections4.OrderedMapIterator> annotatedElementArrayItor34 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray35 = new org.apache.commons.collections4.OrderedMapIterator[] { annotatedElementArrayItor30, objArrayItor31, orderedMapIteratorArrayItor32, charSequenceItor33, annotatedElementArrayItor34 };
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray36 = new org.apache.commons.collections4.OrderedMapIterator[][] { orderedMapIteratorArray5, orderedMapIteratorArray11, orderedMapIteratorArray17, orderedMapIteratorArray23, orderedMapIteratorArray29, orderedMapIteratorArray35 };
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[][]> orderedMapIteratorArrayItor37 = org.apache.commons.collections4.IteratorUtils.singletonIterator(orderedMapIteratorArray36);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator[]> iteratorArrayItor40 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator[][]) orderedMapIteratorArray36, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotatedElementArrayItor0);
        org.junit.Assert.assertNotNull(objArrayItor1);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor2);
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray5);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor6);
        org.junit.Assert.assertNotNull(objArrayItor7);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor8);
        org.junit.Assert.assertNotNull(charSequenceItor9);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor10);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray11);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor12);
        org.junit.Assert.assertNotNull(objArrayItor13);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor14);
        org.junit.Assert.assertNotNull(charSequenceItor15);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor16);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray17);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor18);
        org.junit.Assert.assertNotNull(objArrayItor19);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor20);
        org.junit.Assert.assertNotNull(charSequenceItor21);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor22);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray23);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor24);
        org.junit.Assert.assertNotNull(objArrayItor25);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor26);
        org.junit.Assert.assertNotNull(charSequenceItor27);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor28);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray29);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor30);
        org.junit.Assert.assertNotNull(objArrayItor31);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor32);
        org.junit.Assert.assertNotNull(charSequenceItor33);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor34);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray35);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray36);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor37);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>> charSequenceItorItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][]> charSequenceItorArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator[][][][]> orderedMapIteratorArrayItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator[][][][]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(iteratorItor6);
        org.junit.Assert.assertNotNull(charSequenceItorItor7);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor8);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor9);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][]> objItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorArrayItor0, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItorArrayItor0);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator0);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor1);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor2);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor3);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor4);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor4);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor6);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor8 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(resettableIterator0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(resettableIteratorItor3);
        org.junit.Assert.assertNotNull(resettableIteratorItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(resettableIteratorItor7);
        org.junit.Assert.assertNotNull(resettableIteratorItor8);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1);
        java.util.Iterator<java.lang.Class<?>> wildcardClassItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Class<?>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.Object[]> objArrayItor6 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.Object[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][]> serializableItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor8 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor9 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(genericDeclarationItor3);
        org.junit.Assert.assertNotNull(wildcardClassItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor5);
        org.junit.Assert.assertNotNull(objArrayItor6);
        org.junit.Assert.assertNotNull(serializableItorArrayItor7);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor8);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor9);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]> serializableItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]>[]) iteratorArray1);
        java.util.Iterator<java.lang.String[][]> strArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[][]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.AnnotatedElement[]> annotatedElementArrayItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.AnnotatedElement[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor11 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator>[]) iteratorArray1);
        java.util.Iterator<?> wildcardItor12 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(serializableItorItor5);
        org.junit.Assert.assertNotNull(objItorArrayItor6);
        org.junit.Assert.assertNotNull(serializableItorArrayItor7);
        org.junit.Assert.assertNotNull(strArrayItor8);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor9);
        org.junit.Assert.assertNotNull(objItorArrayItor10);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor11);
        org.junit.Assert.assertNotNull(wildcardItor12);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor0);
        java.util.Iterator<?> wildcardItor2 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor3);
        java.util.Iterator<?> wildcardItor5 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) serializableItor4);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][]> strArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) serializableItor4, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItorItor1);
        org.junit.Assert.assertNotNull(wildcardItor2);
        org.junit.Assert.assertNotNull(serializableItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(wildcardItor5);
        org.junit.Assert.assertNotNull(serializableItor6);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][][], java.lang.reflect.GenericDeclaration> charSequenceItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor0);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        java.lang.String[][][][] strArray0 = new java.lang.String[][][][] {};
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][]> strArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray0);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement[]> annotatedElementArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strArray0);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][][][][][]> wildcardClassArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorItor3, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[][][][] {});
        org.junit.Assert.assertNotNull(strArrayItor1);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor2);
        org.junit.Assert.assertNotNull(iteratorItor3);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor0);
        java.util.Iterator<?> wildcardItor2 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor4 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor4);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor5);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor5);
        org.apache.commons.collections4.MapIterator[] mapIteratorArray9 = new org.apache.commons.collections4.MapIterator[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[] serializableItorArray10 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]) mapIteratorArray9;
        serializableItorArray10[0] = serializableItor0;
        serializableItorArray10[1] = serializableItor7;
        org.apache.commons.collections4.MapIterator[][] mapIteratorArray16 = new org.apache.commons.collections4.MapIterator[1][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][] serializableItorArray17 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]) mapIteratorArray16;
        serializableItorArray17[0] = serializableItorArray10;
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor20 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor21 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor20);
        java.util.Iterator<?> wildcardItor22 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) serializableItor20);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor23 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor20);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor24 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor25 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor24);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor26 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor25);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor27 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor25);
        org.apache.commons.collections4.MapIterator[] mapIteratorArray29 = new org.apache.commons.collections4.MapIterator[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[] serializableItorArray30 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]) mapIteratorArray29;
        serializableItorArray30[0] = serializableItor20;
        serializableItorArray30[1] = serializableItor27;
        org.apache.commons.collections4.MapIterator[][] mapIteratorArray36 = new org.apache.commons.collections4.MapIterator[1][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][] serializableItorArray37 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]) mapIteratorArray36;
        serializableItorArray37[0] = serializableItorArray30;
        org.apache.commons.collections4.MapIterator[][][] mapIteratorArray41 = new org.apache.commons.collections4.MapIterator[2][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][] serializableItorArray42 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]) mapIteratorArray41;
        serializableItorArray42[0] = serializableItorArray17;
        serializableItorArray42[1] = serializableItorArray37;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]> serializableItorArrayItor47 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray42);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]> serializableItorArrayItor48 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray42);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator[][]> iteratorArrayItor49 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator[][][]) serializableItorArray42);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object[][]> objArrayItor52 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[][][]) serializableItorArray42, 0, 2);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]> serializableItorArrayItor53 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray42);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]> serializableItorArrayItor54 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) serializableItorArrayItor53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItorItor1);
        org.junit.Assert.assertNotNull(wildcardItor2);
        org.junit.Assert.assertNotNull(serializableItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(serializableItor5);
        org.junit.Assert.assertNotNull(serializableItor6);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(mapIteratorArray9);
        org.junit.Assert.assertNotNull(serializableItorArray10);
        org.junit.Assert.assertNotNull(mapIteratorArray16);
        org.junit.Assert.assertNotNull(serializableItorArray17);
        org.junit.Assert.assertNotNull(serializableItor20);
        org.junit.Assert.assertNotNull(serializableItorItor21);
        org.junit.Assert.assertNotNull(wildcardItor22);
        org.junit.Assert.assertNotNull(serializableItor23);
        org.junit.Assert.assertNotNull(serializableItor24);
        org.junit.Assert.assertNotNull(serializableItor25);
        org.junit.Assert.assertNotNull(serializableItor26);
        org.junit.Assert.assertNotNull(serializableItor27);
        org.junit.Assert.assertNotNull(mapIteratorArray29);
        org.junit.Assert.assertNotNull(serializableItorArray30);
        org.junit.Assert.assertNotNull(mapIteratorArray36);
        org.junit.Assert.assertNotNull(serializableItorArray37);
        org.junit.Assert.assertNotNull(mapIteratorArray41);
        org.junit.Assert.assertNotNull(serializableItorArray42);
        org.junit.Assert.assertNotNull(serializableItorArrayItor47);
        org.junit.Assert.assertNotNull(serializableItorArrayItor48);
        org.junit.Assert.assertNotNull(iteratorArrayItor49);
        org.junit.Assert.assertNotNull(objArrayItor52);
        org.junit.Assert.assertNotNull(serializableItorArrayItor53);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String[][][][][][], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> strArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.io.Serializable, java.lang.CharSequence> serializableItor1 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>, org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementItor3 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[], org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray5 = new org.apache.commons.collections4.OrderedMapIterator[] { strArrayItor0, serializableItor1, objItorItor2, annotatedElementItor3, objItorArrayItor4 };
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String[][][][][][], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> strArrayItor6 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.io.Serializable, java.lang.CharSequence> serializableItor7 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>, org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor8 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementItor9 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[], org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> objItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray11 = new org.apache.commons.collections4.OrderedMapIterator[] { strArrayItor6, serializableItor7, objItorItor8, annotatedElementItor9, objItorArrayItor10 };
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String[][][][][][], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> strArrayItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.io.Serializable, java.lang.CharSequence> serializableItor13 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>, org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementItor15 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[], org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> objItorArrayItor16 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray17 = new org.apache.commons.collections4.OrderedMapIterator[] { strArrayItor12, serializableItor13, objItorItor14, annotatedElementItor15, objItorArrayItor16 };
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray18 = new org.apache.commons.collections4.OrderedMapIterator[][] { orderedMapIteratorArray5, orderedMapIteratorArray11, orderedMapIteratorArray17 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[]> orderedMapIteratorArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(orderedMapIteratorArray18);
        java.util.Iterator<?> wildcardItor20 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) orderedMapIteratorArray18);
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator[][]> iteratorArrayItor21 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.util.Iterator[][]) orderedMapIteratorArray18);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[]> orderedMapIteratorArrayItor22 = org.apache.commons.collections4.IteratorUtils.arrayIterator(orderedMapIteratorArray18);
        org.junit.Assert.assertNotNull(strArrayItor0);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(objItorItor2);
        org.junit.Assert.assertNotNull(annotatedElementItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray5);
        org.junit.Assert.assertNotNull(strArrayItor6);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(objItorItor8);
        org.junit.Assert.assertNotNull(annotatedElementItor9);
        org.junit.Assert.assertNotNull(objItorArrayItor10);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray11);
        org.junit.Assert.assertNotNull(strArrayItor12);
        org.junit.Assert.assertNotNull(serializableItor13);
        org.junit.Assert.assertNotNull(objItorItor14);
        org.junit.Assert.assertNotNull(annotatedElementItor15);
        org.junit.Assert.assertNotNull(objItorArrayItor16);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray17);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray18);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor19);
        org.junit.Assert.assertNotNull(wildcardItor20);
        org.junit.Assert.assertNotNull(iteratorArrayItor21);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor22);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray8 = new java.lang.String[][] { strArray7 };
        java.lang.String[][][] strArray9 = new java.lang.String[][][] { strArray2, strArray5, strArray8 };
        java.lang.String[][][][] strArray10 = new java.lang.String[][][][] { strArray9 };
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray13 = new java.lang.String[][] { strArray12 };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray16 = new java.lang.String[][] { strArray15 };
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray19 = new java.lang.String[][] { strArray18 };
        java.lang.String[][][] strArray20 = new java.lang.String[][][] { strArray13, strArray16, strArray19 };
        java.lang.String[][][][] strArray21 = new java.lang.String[][][][] { strArray20 };
        java.lang.String[][][][][] strArray22 = new java.lang.String[][][][][] { strArray10, strArray21 };
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][]> strArrayItor23 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray22);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][]> strArrayItor26 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray22, 0, (int) (byte) 0);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][]> strArrayItor27 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray22);
        java.util.ListIterator<java.lang.String[][][][][]> strArrayItor28 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(strArray22);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArrayItor23);
        org.junit.Assert.assertNotNull(strArrayItor26);
        org.junit.Assert.assertNotNull(strArrayItor27);
        org.junit.Assert.assertNotNull(strArrayItor28);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator2 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor3 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator2);
        java.lang.Object[] objArray6 = new java.lang.Object[] { resettableIterator0, (short) 100, resettableIteratorItor3, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray6, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor10 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor9);
        java.util.Iterator<?> wildcardItor11 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) objItor9);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray13 = new org.apache.commons.collections4.ResettableListIterator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray14 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray13;
        objItorArray14[0] = objItor9;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor17 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray14);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor18 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((org.apache.commons.collections4.ResettableIterator[]) objItorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator((org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) objItorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor20 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray14);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement[][]> annotatedElementArrayItor21 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorArray14);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor22 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) objItorArray14);
        org.junit.Assert.assertNotNull(resettableIterator0);
        org.junit.Assert.assertNotNull(resettableIterator2);
        org.junit.Assert.assertNotNull(resettableIteratorItor3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertNotNull(objItorItor10);
        org.junit.Assert.assertNotNull(wildcardItor11);
        org.junit.Assert.assertNotNull(resettableListIteratorArray13);
        org.junit.Assert.assertNotNull(objItorArray14);
        org.junit.Assert.assertNotNull(objItorItor17);
        org.junit.Assert.assertNotNull(resettableIteratorItor18);
        org.junit.Assert.assertNotNull(objItorItor19);
        org.junit.Assert.assertNotNull(objItorItor20);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor21);
        org.junit.Assert.assertNotNull(objItorItor22);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor1);
        java.util.Iterator[] iteratorArray3 = new java.util.Iterator[] { serializableItorItor2 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor4 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor4);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor6 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor5);
        java.util.Iterator[] iteratorArray7 = new java.util.Iterator[] { serializableItorItor6 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor8 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor9 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor8);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor10 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor9);
        java.util.Iterator[] iteratorArray11 = new java.util.Iterator[] { serializableItorItor10 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor12 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor13 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor12);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor14 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor13);
        java.util.Iterator[] iteratorArray15 = new java.util.Iterator[] { serializableItorItor14 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor16 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor17 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor16);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor18 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor17);
        java.util.Iterator[] iteratorArray19 = new java.util.Iterator[] { serializableItorItor18 };
        java.util.Iterator[][] iteratorArray20 = new java.util.Iterator[][] { iteratorArray3, iteratorArray7, iteratorArray11, iteratorArray15, iteratorArray19 };
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator[]> iteratorArrayItor21 = org.apache.commons.collections4.IteratorUtils.arrayIterator(iteratorArray20);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][]> strArrayItor22 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray20);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor23 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor24 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        java.util.Iterator[] iteratorArray26 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray27 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray26;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor28 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray26);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor29 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray26);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor30 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray26);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorArray26);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor32 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor33 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor32);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor34 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor33);
        java.util.Iterator[] iteratorArray35 = new java.util.Iterator[] { serializableItorItor34 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor36 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor37 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor36);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor38 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor37);
        java.util.Iterator[] iteratorArray39 = new java.util.Iterator[] { serializableItorItor38 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor40 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor41 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor40);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor42 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor41);
        java.util.Iterator[] iteratorArray43 = new java.util.Iterator[] { serializableItorItor42 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor44 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor45 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor44);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor46 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor45);
        java.util.Iterator[] iteratorArray47 = new java.util.Iterator[] { serializableItorItor46 };
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor48 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor49 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor48);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor50 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor49);
        java.util.Iterator[] iteratorArray51 = new java.util.Iterator[] { serializableItorItor50 };
        java.util.Iterator[][] iteratorArray52 = new java.util.Iterator[][] { iteratorArray35, iteratorArray39, iteratorArray43, iteratorArray47, iteratorArray51 };
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator[]> iteratorArrayItor53 = org.apache.commons.collections4.IteratorUtils.arrayIterator(iteratorArray52);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][]> strArrayItor54 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray52);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator[]> iteratorArrayItor55 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorArray52);
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableIterator, java.util.Iterator[]> resettableIteratorItor56 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator57 = org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR;
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator58 = org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR;
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableIterator, java.util.Iterator[]> resettableIteratorItor59 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableIterator, java.util.Iterator[]> resettableIteratorItor60 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator61 = org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray62 = new org.apache.commons.collections4.OrderedMapIterator[] { resettableIteratorItor56, orderedMapIterator57, orderedMapIterator58, resettableIteratorItor59, resettableIteratorItor60, orderedMapIterator61 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor64 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(orderedMapIteratorArray62, 5);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[]> orderedMapIteratorArrayItor65 = org.apache.commons.collections4.IteratorUtils.singletonIterator(orderedMapIteratorArray62);
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray66 = new org.apache.commons.collections4.ResettableIterator[] { strArrayItor22, typeItor23, orderedMapIteratorItor24, iteratorItor31, iteratorArrayItor55, orderedMapIteratorArrayItor65 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor69 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(resettableIteratorArray66, 0, 2);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor70 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(resettableIteratorArray66);
        org.apache.commons.collections4.ResettableIterator resettableIterator71 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor72 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator71);
        java.util.ListIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> resettableIteratorItorItor73 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIteratorItor72);
        java.util.ListIterator[] listIteratorArray75 = new java.util.ListIterator[2];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[] resettableIteratorItorArray76 = (java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[]) listIteratorArray75;
        resettableIteratorItorArray76[0] = resettableIteratorItor70;
        resettableIteratorItorArray76[1] = resettableIteratorItor72;
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> resettableIteratorItorItor82 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorItorArray76, 0);
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> resettableIteratorItorItor83 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorItorArray76);
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[]> resettableIteratorItorArrayItor84 = org.apache.commons.collections4.IteratorUtils.singletonIterator(resettableIteratorItorArray76);
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(serializableItorItor2);
        org.junit.Assert.assertNotNull(iteratorArray3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(serializableItor5);
        org.junit.Assert.assertNotNull(serializableItorItor6);
        org.junit.Assert.assertNotNull(iteratorArray7);
        org.junit.Assert.assertNotNull(serializableItor8);
        org.junit.Assert.assertNotNull(serializableItor9);
        org.junit.Assert.assertNotNull(serializableItorItor10);
        org.junit.Assert.assertNotNull(iteratorArray11);
        org.junit.Assert.assertNotNull(serializableItor12);
        org.junit.Assert.assertNotNull(serializableItor13);
        org.junit.Assert.assertNotNull(serializableItorItor14);
        org.junit.Assert.assertNotNull(iteratorArray15);
        org.junit.Assert.assertNotNull(serializableItor16);
        org.junit.Assert.assertNotNull(serializableItor17);
        org.junit.Assert.assertNotNull(serializableItorItor18);
        org.junit.Assert.assertNotNull(iteratorArray19);
        org.junit.Assert.assertNotNull(iteratorArray20);
        org.junit.Assert.assertNotNull(iteratorArrayItor21);
        org.junit.Assert.assertNotNull(strArrayItor22);
        org.junit.Assert.assertNotNull(typeItor23);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor24);
        org.junit.Assert.assertNotNull(iteratorArray26);
        org.junit.Assert.assertArrayEquals(iteratorArray26, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray27);
        org.junit.Assert.assertArrayEquals(wildcardItorArray27, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor28);
        org.junit.Assert.assertNotNull(objItorArrayItor29);
        org.junit.Assert.assertNotNull(resettableIteratorItor30);
        org.junit.Assert.assertNotNull(iteratorItor31);
        org.junit.Assert.assertNotNull(serializableItor32);
        org.junit.Assert.assertNotNull(serializableItor33);
        org.junit.Assert.assertNotNull(serializableItorItor34);
        org.junit.Assert.assertNotNull(iteratorArray35);
        org.junit.Assert.assertNotNull(serializableItor36);
        org.junit.Assert.assertNotNull(serializableItor37);
        org.junit.Assert.assertNotNull(serializableItorItor38);
        org.junit.Assert.assertNotNull(iteratorArray39);
        org.junit.Assert.assertNotNull(serializableItor40);
        org.junit.Assert.assertNotNull(serializableItor41);
        org.junit.Assert.assertNotNull(serializableItorItor42);
        org.junit.Assert.assertNotNull(iteratorArray43);
        org.junit.Assert.assertNotNull(serializableItor44);
        org.junit.Assert.assertNotNull(serializableItor45);
        org.junit.Assert.assertNotNull(serializableItorItor46);
        org.junit.Assert.assertNotNull(iteratorArray47);
        org.junit.Assert.assertNotNull(serializableItor48);
        org.junit.Assert.assertNotNull(serializableItor49);
        org.junit.Assert.assertNotNull(serializableItorItor50);
        org.junit.Assert.assertNotNull(iteratorArray51);
        org.junit.Assert.assertNotNull(iteratorArray52);
        org.junit.Assert.assertNotNull(iteratorArrayItor53);
        org.junit.Assert.assertNotNull(strArrayItor54);
        org.junit.Assert.assertNotNull(iteratorArrayItor55);
        org.junit.Assert.assertNotNull(resettableIteratorItor56);
        org.junit.Assert.assertNotNull(orderedMapIterator57);
        org.junit.Assert.assertNotNull(orderedMapIterator58);
        org.junit.Assert.assertNotNull(resettableIteratorItor59);
        org.junit.Assert.assertNotNull(resettableIteratorItor60);
        org.junit.Assert.assertNotNull(orderedMapIterator61);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray62);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor64);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor65);
        org.junit.Assert.assertNotNull(resettableIteratorArray66);
        org.junit.Assert.assertNotNull(resettableIteratorItor69);
        org.junit.Assert.assertNotNull(resettableIteratorItor70);
        org.junit.Assert.assertNotNull(resettableIterator71);
        org.junit.Assert.assertNotNull(resettableIteratorItor72);
        org.junit.Assert.assertNotNull(resettableIteratorItorItor73);
        org.junit.Assert.assertNotNull(listIteratorArray75);
        org.junit.Assert.assertNotNull(resettableIteratorItorArray76);
        org.junit.Assert.assertNotNull(resettableIteratorItorItor82);
        org.junit.Assert.assertNotNull(resettableIteratorItorItor83);
        org.junit.Assert.assertNotNull(resettableIteratorItorArrayItor84);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.apache.commons.collections4.ResettableListIterator resettableListIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor1 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor2);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor2);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray6 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray7 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray6;
        objItorArray7[0] = resettableListIterator0;
        objItorArray7[1] = objItor1;
        objItorArray7[2] = objItor2;
        org.apache.commons.collections4.ResettableListIterator resettableListIterator14 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor15 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor16 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor17 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor16);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor18 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor16);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray20 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray21 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray20;
        objItorArray21[0] = resettableListIterator14;
        objItorArray21[1] = objItor15;
        objItorArray21[2] = objItor16;
        org.apache.commons.collections4.ResettableListIterator resettableListIterator28 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor29 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor30 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor31 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor30);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor32 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor30);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray34 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray35 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray34;
        objItorArray35[0] = resettableListIterator28;
        objItorArray35[1] = objItor29;
        objItorArray35[2] = objItor30;
        org.apache.commons.collections4.ResettableListIterator resettableListIterator42 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor43 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor44 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor45 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor44);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor46 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor44);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray48 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray49 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray48;
        objItorArray49[0] = resettableListIterator42;
        objItorArray49[1] = objItor43;
        objItorArray49[2] = objItor44;
        org.apache.commons.collections4.ResettableListIterator[][] resettableListIteratorArray57 = new org.apache.commons.collections4.ResettableListIterator[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][] objItorArray58 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]) resettableListIteratorArray57;
        objItorArray58[0] = objItorArray7;
        objItorArray58[1] = objItorArray21;
        objItorArray58[2] = objItorArray35;
        objItorArray58[3] = objItorArray49;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor67 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray58);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor68 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItorArray58);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor69 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItorArray58);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor71 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]) objItorArray58, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableListIterator0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(resettableListIteratorArray6);
        org.junit.Assert.assertNotNull(objItorArray7);
        org.junit.Assert.assertNotNull(resettableListIterator14);
        org.junit.Assert.assertNotNull(objItor15);
        org.junit.Assert.assertNotNull(objItor16);
        org.junit.Assert.assertNotNull(objItorItor17);
        org.junit.Assert.assertNotNull(objItorItor18);
        org.junit.Assert.assertNotNull(resettableListIteratorArray20);
        org.junit.Assert.assertNotNull(objItorArray21);
        org.junit.Assert.assertNotNull(resettableListIterator28);
        org.junit.Assert.assertNotNull(objItor29);
        org.junit.Assert.assertNotNull(objItor30);
        org.junit.Assert.assertNotNull(objItorItor31);
        org.junit.Assert.assertNotNull(objItorItor32);
        org.junit.Assert.assertNotNull(resettableListIteratorArray34);
        org.junit.Assert.assertNotNull(objItorArray35);
        org.junit.Assert.assertNotNull(resettableListIterator42);
        org.junit.Assert.assertNotNull(objItor43);
        org.junit.Assert.assertNotNull(objItor44);
        org.junit.Assert.assertNotNull(objItorItor45);
        org.junit.Assert.assertNotNull(objItorItor46);
        org.junit.Assert.assertNotNull(resettableListIteratorArray48);
        org.junit.Assert.assertNotNull(objItorArray49);
        org.junit.Assert.assertNotNull(resettableListIteratorArray57);
        org.junit.Assert.assertNotNull(objItorArray58);
        org.junit.Assert.assertNotNull(objItorArrayItor67);
        org.junit.Assert.assertNotNull(objItorArrayItor68);
        org.junit.Assert.assertNotNull(objItorArrayItor69);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.apache.commons.collections4.iterators.ZippingIterator[][][] zippingIteratorArray1 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][] charSequenceItorArray2 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]) zippingIteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator[][][] zippingIteratorArray4 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][] charSequenceItorArray5 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]) zippingIteratorArray4;
        org.apache.commons.collections4.iterators.ZippingIterator[][][] zippingIteratorArray7 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][] charSequenceItorArray8 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]) zippingIteratorArray7;
        org.apache.commons.collections4.iterators.ZippingIterator[][][] zippingIteratorArray10 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][] charSequenceItorArray11 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]) zippingIteratorArray10;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][] zippingIteratorArray13 = new org.apache.commons.collections4.iterators.ZippingIterator[4][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][] charSequenceItorArray14 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][]) zippingIteratorArray13;
        charSequenceItorArray14[0] = charSequenceItorArray2;
        charSequenceItorArray14[1] = charSequenceItorArray5;
        charSequenceItorArray14[2] = charSequenceItorArray8;
        charSequenceItorArray14[3] = charSequenceItorArray11;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]> charSequenceItorArrayItor23 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceItorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]> charSequenceItorArrayItor24 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceItorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]> charSequenceItorArrayItor26 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceItorArray14, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]> charSequenceItorArrayItor28 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceItorArray14, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zippingIteratorArray1);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray1, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray2);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray2, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray4);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray4, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray5);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray5, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray7);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray7, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray8);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray8, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray10);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray10, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray11);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray11, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray13);
        org.junit.Assert.assertNotNull(charSequenceItorArray14);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor23);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor24);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor26);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.Object[]> objArrayItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.Object[]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorArray1);
        java.lang.Class<?> wildcardClass7 = iteratorArray1.getClass();
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(objArrayItor5);
        org.junit.Assert.assertNotNull(iteratorItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.OrderedMapIterator[]> orderedMapIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[][][]> orderedMapIteratorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) orderedMapIteratorArrayItor0, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor0);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> charSequenceItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type> typeItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][]> serializableItorArrayItor11 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][][][]> strArrayItor12 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(serializableItorItor5);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor6);
        org.junit.Assert.assertNotNull(resettableIteratorItor7);
        org.junit.Assert.assertNotNull(typeItor8);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor9);
        org.junit.Assert.assertNotNull(wildcardClassItor10);
        org.junit.Assert.assertNotNull(serializableItorArrayItor11);
        org.junit.Assert.assertNotNull(strArrayItor12);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1);
        java.util.Iterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> resettableIteratorItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String[][][][][]> strArrayItor6 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String[][][][][]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(genericDeclarationItor3);
        org.junit.Assert.assertNotNull(resettableIteratorItorItor4);
        org.junit.Assert.assertNotNull(serializableItorItor5);
        org.junit.Assert.assertNotNull(strArrayItor6);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.Object[][]> objArrayItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.Object[][]>[]) iteratorArray1);
        java.util.Iterator<java.lang.Object[][]> objArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Object[][]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]> charSequenceItorArrayItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor12 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) charSequenceItorArrayItor9, 5, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(iteratorItor6);
        org.junit.Assert.assertNotNull(objArrayItor7);
        org.junit.Assert.assertNotNull(objArrayItor8);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor9);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        java.lang.String[][][][] strArray0 = new java.lang.String[][][][] {};
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][]> strArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray0);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement[]> annotatedElementArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strArray0);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][][]> objItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strArray0, 3, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[][][][] {});
        org.junit.Assert.assertNotNull(strArrayItor1);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor2);
        org.junit.Assert.assertNotNull(strArrayItor3);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.apache.commons.collections4.MapIterator<java.lang.Class<?>[][][], java.lang.String[][][][][]> wildcardClassArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(wildcardClassArrayItor0);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][], org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray2 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor0, objItorArrayItor1 };
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][], org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray5 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor3, objItorArrayItor4 };
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][], org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray8 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor6, objItorArrayItor7 };
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor9 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][], org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray11 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor9, objItorArrayItor10 };
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][], org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorArrayItor13 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray14 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor12, objItorArrayItor13 };
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor15 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][], org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorArrayItor16 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray17 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor15, objItorArrayItor16 };
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray18 = new org.apache.commons.collections4.OrderedMapIterator[][] { orderedMapIteratorArray2, orderedMapIteratorArray5, orderedMapIteratorArray8, orderedMapIteratorArray11, orderedMapIteratorArray14, orderedMapIteratorArray17 };
        java.util.ListIterator<org.apache.commons.collections4.OrderedMapIterator[][]> orderedMapIteratorArrayItor19 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(orderedMapIteratorArray18);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor20 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) orderedMapIteratorArray18);
        java.util.ListIterator<org.apache.commons.collections4.OrderedMapIterator[][]> orderedMapIteratorArrayItor21 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(orderedMapIteratorArray18);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor22 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) orderedMapIteratorArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator[]> iteratorArrayItor25 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator[][]) orderedMapIteratorArray18, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItorArrayItor0);
        org.junit.Assert.assertNotNull(objItorArrayItor1);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray2);
        org.junit.Assert.assertNotNull(serializableItorArrayItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray5);
        org.junit.Assert.assertNotNull(serializableItorArrayItor6);
        org.junit.Assert.assertNotNull(objItorArrayItor7);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray8);
        org.junit.Assert.assertNotNull(serializableItorArrayItor9);
        org.junit.Assert.assertNotNull(objItorArrayItor10);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray11);
        org.junit.Assert.assertNotNull(serializableItorArrayItor12);
        org.junit.Assert.assertNotNull(objItorArrayItor13);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray14);
        org.junit.Assert.assertNotNull(serializableItorArrayItor15);
        org.junit.Assert.assertNotNull(objItorArrayItor16);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray17);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray18);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor19);
        org.junit.Assert.assertNotNull(objItor20);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor21);
        org.junit.Assert.assertNotNull(serializableItorItor22);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][]> strArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorArrayItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItorArrayItor0);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][]> strArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strArray4);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strArray4);
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.CharSequence[]) strArray4, (int) (byte) 0);
        org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence> charSequenceItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.CharSequence[]) strArray4, 1, 2);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[]> strArrayItor13 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strArrayItor6);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor7);
        org.junit.Assert.assertNotNull(charSequenceItor9);
        org.junit.Assert.assertNotNull(charSequenceItor12);
        org.junit.Assert.assertNotNull(strArrayItor13);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> charSequenceItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]> objItorArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String[][]> strArrayItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String[][]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][][]> wildcardClassArrayItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strArrayItor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(serializableItorItor5);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor6);
        org.junit.Assert.assertNotNull(resettableIteratorItor7);
        org.junit.Assert.assertNotNull(objItorArrayItor8);
        org.junit.Assert.assertNotNull(strArrayItor9);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray1 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray2 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray3 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray4 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray5 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray6 = new java.lang.String[][][][][][] { strArray0, strArray1, strArray2, strArray3, strArray4, strArray5 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][][]> strArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6);
        java.lang.Class<?> wildcardClass8 = strArrayItor7.getClass();
        java.util.ListIterator<java.lang.Class<?>> wildcardClassItor9 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][][][]> wildcardClassArrayItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArrayItor7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClassItor9);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>>[]) iteratorArray1);
        java.util.Iterator<java.lang.Object[][]> objArrayItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Object[][]>[]) iteratorArray1);
        java.util.ListIterator<java.lang.Object[]> objArrayItor7 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.Object[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(serializableItorItor5);
        org.junit.Assert.assertNotNull(objArrayItor6);
        org.junit.Assert.assertNotNull(objArrayItor7);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator2 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor3 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator2);
        java.lang.Object[] objArray6 = new java.lang.Object[] { resettableIterator0, (short) 100, resettableIteratorItor3, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray6, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor10 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor9);
        java.util.Iterator<?> wildcardItor11 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) objItor9);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray13 = new org.apache.commons.collections4.ResettableListIterator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray14 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray13;
        objItorArray14[0] = objItor9;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor17 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray14);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor18 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((org.apache.commons.collections4.ResettableIterator[]) objItorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator((org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) objItorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor20 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray14);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement[][]> annotatedElementArrayItor21 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor22 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray14);
        java.util.Iterator<?> wildcardItor23 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) objItorArray14);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor24 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor25 = org.apache.commons.collections4.IteratorUtils.singletonIterator((org.apache.commons.collections4.ResettableIterator[]) objItorArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[][][][]> orderedMapIteratorArrayItor28 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItorArray14, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIterator0);
        org.junit.Assert.assertNotNull(resettableIterator2);
        org.junit.Assert.assertNotNull(resettableIteratorItor3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertNotNull(objItorItor10);
        org.junit.Assert.assertNotNull(wildcardItor11);
        org.junit.Assert.assertNotNull(resettableListIteratorArray13);
        org.junit.Assert.assertNotNull(objItorArray14);
        org.junit.Assert.assertNotNull(objItorItor17);
        org.junit.Assert.assertNotNull(resettableIteratorItor18);
        org.junit.Assert.assertNotNull(objItorItor19);
        org.junit.Assert.assertNotNull(objItorItor20);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor21);
        org.junit.Assert.assertNotNull(objItorItor22);
        org.junit.Assert.assertNotNull(wildcardItor23);
        org.junit.Assert.assertNotNull(objItorItor24);
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor25);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator0);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor1);
        java.util.Iterator<?> wildcardItor3 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) resettableIteratorItor1);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor1);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor4);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor5);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(resettableIterator0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertNotNull(resettableIteratorItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(resettableIteratorItor7);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.apache.commons.collections4.OrderedMapIterator[][][][][][] orderedMapIteratorArray0 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {};
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][]> orderedMapIteratorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(orderedMapIteratorArray0);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][]> orderedMapIteratorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(orderedMapIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][][]> orderedMapIteratorArrayItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(orderedMapIteratorArray0);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray0);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray0, new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor1);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor2);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor3);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][][][]> wildcardClassArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray2);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][][][]> wildcardClassArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray2, (int) (byte) 0);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][][][]> wildcardClassArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][][][]> wildcardClassArrayItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray2, (int) '#', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertArrayEquals(classArray1, new java.lang.Class[][][][][] {});
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertArrayEquals(wildcardClassArray2, new java.lang.Class[][][][][] {});
        org.junit.Assert.assertNotNull(wildcardClassArrayItor3);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor5);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor7);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>> charSequenceItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray1);
        java.util.Iterator<java.util.Iterator[][]> iteratorArrayItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.Iterator[][]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> charSequenceItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Object[][]> objArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(genericDeclarationItor3);
        org.junit.Assert.assertNotNull(charSequenceItorItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(iteratorArrayItor6);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor7);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        java.util.ListIterator[][] listIteratorArray1 = new java.util.ListIterator[0][];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[][] resettableIteratorItorArray2 = (java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[][]) listIteratorArray1;
        org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[]> resettableIteratorItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(resettableIteratorItorArray2, (int) (byte) 0);
        org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[]> resettableIteratorItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(resettableIteratorItorArray2);
        java.util.ListIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[][]> resettableIteratorItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIteratorItorArray2);
        org.apache.commons.collections4.ResettableIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[][]> resettableIteratorItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.singletonIterator(resettableIteratorItorArray2);
        org.junit.Assert.assertNotNull(listIteratorArray1);
        org.junit.Assert.assertArrayEquals(listIteratorArray1, new java.util.ListIterator[][] {});
        org.junit.Assert.assertNotNull(resettableIteratorItorArray2);
        org.junit.Assert.assertArrayEquals(resettableIteratorItorArray2, new java.util.ListIterator[][] {});
        org.junit.Assert.assertNotNull(resettableIteratorItorArrayItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItorArrayItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItorArrayItor6);
        org.junit.Assert.assertNotNull(resettableIteratorItorArrayItor7);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String[][][][][][], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> strArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.io.Serializable, java.lang.CharSequence> serializableItor1 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>, org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementItor3 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[], org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray5 = new org.apache.commons.collections4.OrderedMapIterator[] { strArrayItor0, serializableItor1, objItorItor2, annotatedElementItor3, objItorArrayItor4 };
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String[][][][][][], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> strArrayItor6 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.io.Serializable, java.lang.CharSequence> serializableItor7 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>, org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor8 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementItor9 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[], org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> objItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray11 = new org.apache.commons.collections4.OrderedMapIterator[] { strArrayItor6, serializableItor7, objItorItor8, annotatedElementItor9, objItorArrayItor10 };
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String[][][][][][], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> strArrayItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.io.Serializable, java.lang.CharSequence> serializableItor13 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>, org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementItor15 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[], org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> objItorArrayItor16 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray17 = new org.apache.commons.collections4.OrderedMapIterator[] { strArrayItor12, serializableItor13, objItorItor14, annotatedElementItor15, objItorArrayItor16 };
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray18 = new org.apache.commons.collections4.OrderedMapIterator[][] { orderedMapIteratorArray5, orderedMapIteratorArray11, orderedMapIteratorArray17 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[]> orderedMapIteratorArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(orderedMapIteratorArray18);
        java.util.Iterator<?> wildcardItor20 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) orderedMapIteratorArray18);
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator[][]> iteratorArrayItor21 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.util.Iterator[][]) orderedMapIteratorArray18);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[]> orderedMapIteratorArrayItor22 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(orderedMapIteratorArray18);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[]> orderedMapIteratorArrayItor23 = org.apache.commons.collections4.IteratorUtils.arrayIterator(orderedMapIteratorArray18);
        org.junit.Assert.assertNotNull(strArrayItor0);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(objItorItor2);
        org.junit.Assert.assertNotNull(annotatedElementItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray5);
        org.junit.Assert.assertNotNull(strArrayItor6);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(objItorItor8);
        org.junit.Assert.assertNotNull(annotatedElementItor9);
        org.junit.Assert.assertNotNull(objItorArrayItor10);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray11);
        org.junit.Assert.assertNotNull(strArrayItor12);
        org.junit.Assert.assertNotNull(serializableItor13);
        org.junit.Assert.assertNotNull(objItorItor14);
        org.junit.Assert.assertNotNull(annotatedElementItor15);
        org.junit.Assert.assertNotNull(objItorArrayItor16);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray17);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray18);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor19);
        org.junit.Assert.assertNotNull(wildcardItor20);
        org.junit.Assert.assertNotNull(iteratorArrayItor21);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor22);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor23);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor3);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor4);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor4);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor4);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor8 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor7);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor9 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor7);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor10 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor7);
        java.lang.Class<?> wildcardClass11 = serializableItor7.getClass();
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertNotNull(serializableItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(serializableItor5);
        org.junit.Assert.assertNotNull(serializableItor6);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(serializableItor8);
        org.junit.Assert.assertNotNull(serializableItor9);
        org.junit.Assert.assertNotNull(serializableItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator2 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor3 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator2);
        java.lang.Object[] objArray6 = new java.lang.Object[] { resettableIterator0, (short) 100, resettableIteratorItor3, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray6, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor10 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor9);
        org.apache.commons.collections4.ResettableIterator resettableIterator11 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator13 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor14 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator13);
        java.lang.Object[] objArray17 = new java.lang.Object[] { resettableIterator11, (short) 100, resettableIteratorItor14, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor20 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray17, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor21 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor20);
        org.apache.commons.collections4.ResettableIterator resettableIterator22 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator24 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor25 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator24);
        java.lang.Object[] objArray28 = new java.lang.Object[] { resettableIterator22, (short) 100, resettableIteratorItor25, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray28, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor32 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor31);
        org.apache.commons.collections4.ResettableIterator resettableIterator33 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator35 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor36 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator35);
        java.lang.Object[] objArray39 = new java.lang.Object[] { resettableIterator33, (short) 100, resettableIteratorItor36, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor42 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray39, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator resettableIterator43 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator45 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor46 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator45);
        java.lang.Object[] objArray49 = new java.lang.Object[] { resettableIterator43, (short) 100, resettableIteratorItor46, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor52 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray49, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator resettableIterator53 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator55 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor56 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator55);
        java.lang.Object[] objArray59 = new java.lang.Object[] { resettableIterator53, (short) 100, resettableIteratorItor56, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor62 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray59, 0, (int) (byte) 1);
        org.apache.commons.collections4.OrderedIterator[] orderedIteratorArray64 = new org.apache.commons.collections4.OrderedIterator[6];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[] objItorArray65 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) orderedIteratorArray64;
        objItorArray65[0] = objItor9;
        objItorArray65[1] = objItor20;
        objItorArray65[2] = objItor31;
        objItorArray65[3] = objItor42;
        objItorArray65[4] = objItor52;
        objItorArray65[5] = objItor62;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor78 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray65);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement[][]> annotatedElementArrayItor80 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorArray65, 0);
        java.util.ListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor81 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItorArray65);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor82 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray65);
        org.junit.Assert.assertNotNull(resettableIterator0);
        org.junit.Assert.assertNotNull(resettableIterator2);
        org.junit.Assert.assertNotNull(resettableIteratorItor3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertNotNull(objItorItor10);
        org.junit.Assert.assertNotNull(resettableIterator11);
        org.junit.Assert.assertNotNull(resettableIterator13);
        org.junit.Assert.assertNotNull(resettableIteratorItor14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objItor20);
        org.junit.Assert.assertNotNull(objItorItor21);
        org.junit.Assert.assertNotNull(resettableIterator22);
        org.junit.Assert.assertNotNull(resettableIterator24);
        org.junit.Assert.assertNotNull(resettableIteratorItor25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objItor31);
        org.junit.Assert.assertNotNull(objItorItor32);
        org.junit.Assert.assertNotNull(resettableIterator33);
        org.junit.Assert.assertNotNull(resettableIterator35);
        org.junit.Assert.assertNotNull(resettableIteratorItor36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objItor42);
        org.junit.Assert.assertNotNull(resettableIterator43);
        org.junit.Assert.assertNotNull(resettableIterator45);
        org.junit.Assert.assertNotNull(resettableIteratorItor46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objItor52);
        org.junit.Assert.assertNotNull(resettableIterator53);
        org.junit.Assert.assertNotNull(resettableIterator55);
        org.junit.Assert.assertNotNull(resettableIteratorItor56);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objItor62);
        org.junit.Assert.assertNotNull(orderedIteratorArray64);
        org.junit.Assert.assertNotNull(objItorArray65);
        org.junit.Assert.assertNotNull(objItorItor78);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor80);
        org.junit.Assert.assertNotNull(objItorArrayItor81);
        org.junit.Assert.assertNotNull(objItorItor82);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.lang.Class<?> wildcardClass4 = iteratorArray1.getClass();
        java.lang.Class[] classArray6 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        wildcardClassArray7[0] = wildcardClass4;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray7);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor13 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClassArray7, 0, 0);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>> wildcardClassItor14 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray7);
        java.util.ListIterator<java.lang.Class<?>[]> wildcardClassArrayItor15 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(wildcardClassArray7);
        java.util.Iterator<?> wildcardItor16 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) wildcardClassArray7);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor17 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.GenericDeclaration[]) wildcardClassArray7);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertArrayEquals(classArray6, new java.lang.Class[] { java.util.Iterator[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertArrayEquals(wildcardClassArray7, new java.lang.Class[] { java.util.Iterator[].class });
        org.junit.Assert.assertNotNull(wildcardClassItor10);
        org.junit.Assert.assertNotNull(iteratorItor13);
        org.junit.Assert.assertNotNull(wildcardClassItor14);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor15);
        org.junit.Assert.assertNotNull(wildcardItor16);
        org.junit.Assert.assertNotNull(genericDeclarationItor17);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String[][] strArray6 = new java.lang.String[][] { strArray0, strArray1, strArray2, strArray3, strArray4, strArray5 };
        org.apache.commons.collections4.ResettableIterator<java.lang.String[]> strArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strArray6, 6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that ends beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArrayItor8);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.apache.commons.collections4.ResettableListIterator[][][] resettableListIteratorArray1 = new org.apache.commons.collections4.ResettableListIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][][] objItorArray2 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][][]) resettableListIteratorArray1;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray2);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[][][][]> orderedMapIteratorArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorArray2);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItorArray2);
        org.junit.Assert.assertNotNull(resettableListIteratorArray1);
        org.junit.Assert.assertArrayEquals(resettableListIteratorArray1, new org.apache.commons.collections4.ResettableListIterator[][][] {});
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertArrayEquals(objItorArray2, new org.apache.commons.collections4.ResettableListIterator[][][] {});
        org.junit.Assert.assertNotNull(objItorArrayItor3);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor4);
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor5);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][], org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]> serializableItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(serializableItorArrayItor0);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][]> serializableItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][]> objItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) serializableItorArrayItor0, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItorArrayItor0);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.OrderedMapIterator, java.lang.String[]> orderedMapIteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) orderedMapIteratorItor0, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIteratorItor0);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.apache.commons.collections4.MapIterator<java.lang.reflect.AnnotatedElement[], org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> annotatedElementArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(annotatedElementArrayItor0);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator2 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor3 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator2);
        java.lang.Object[] objArray6 = new java.lang.Object[] { resettableIterator0, (short) 100, resettableIteratorItor3, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray6, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = objItor9.getClass();
        org.apache.commons.collections4.ResettableIterator resettableIterator11 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.lang.Class<?> wildcardClass12 = resettableIterator11.getClass();
        org.apache.commons.collections4.ResettableIterator resettableIterator13 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator15 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor16 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator15);
        java.lang.Object[] objArray19 = new java.lang.Object[] { resettableIterator13, (short) 100, resettableIteratorItor16, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor22 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray19, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = objItor22.getClass();
        org.apache.commons.collections4.ResettableIterator resettableIterator24 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.lang.Class<?> wildcardClass25 = resettableIterator24.getClass();
        org.apache.commons.collections4.ResettableIterator resettableIterator26 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator28 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor29 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator28);
        java.lang.Object[] objArray32 = new java.lang.Object[] { resettableIterator26, (short) 100, resettableIteratorItor29, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor35 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray32, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass36 = objItor35.getClass();
        org.apache.commons.collections4.ResettableIterator resettableIterator37 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator39 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor40 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator39);
        java.lang.Object[] objArray43 = new java.lang.Object[] { resettableIterator37, (short) 100, resettableIteratorItor40, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor46 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray43, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass47 = objItor46.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray48 = new java.lang.reflect.AnnotatedElement[] { wildcardClass10, wildcardClass12, wildcardClass23, wildcardClass25, wildcardClass36, wildcardClass47 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor49 = org.apache.commons.collections4.IteratorUtils.arrayIterator(annotatedElementArray48);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor50 = org.apache.commons.collections4.IteratorUtils.arrayIterator(annotatedElementArray48);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor51 = org.apache.commons.collections4.IteratorUtils.arrayIterator(annotatedElementArray48);
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator> iteratorItor53 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) annotatedElementArray48, 5);
        java.lang.Class<?> wildcardClass54 = annotatedElementArray48.getClass();
        org.junit.Assert.assertNotNull(resettableIterator0);
        org.junit.Assert.assertNotNull(resettableIterator2);
        org.junit.Assert.assertNotNull(resettableIteratorItor3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(resettableIterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(resettableIterator13);
        org.junit.Assert.assertNotNull(resettableIterator15);
        org.junit.Assert.assertNotNull(resettableIteratorItor16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objItor22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(resettableIterator24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(resettableIterator26);
        org.junit.Assert.assertNotNull(resettableIterator28);
        org.junit.Assert.assertNotNull(resettableIteratorItor29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objItor35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(resettableIterator37);
        org.junit.Assert.assertNotNull(resettableIterator39);
        org.junit.Assert.assertNotNull(resettableIteratorItor40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objItor46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(annotatedElementArray48);
        org.junit.Assert.assertNotNull(annotatedElementItor49);
        org.junit.Assert.assertNotNull(annotatedElementItor50);
        org.junit.Assert.assertNotNull(annotatedElementItor51);
        org.junit.Assert.assertNotNull(iteratorItor53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        java.lang.String[][][][][] strArray0 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray1 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray2 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray3 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray4 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][] strArray5 = new java.lang.String[][][][][] {};
        java.lang.String[][][][][][] strArray6 = new java.lang.String[][][][][][] { strArray0, strArray1, strArray2, strArray3, strArray4, strArray5 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][][]> strArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][][]> strArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][][][][]> objItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[][][][][] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArrayItor7);
        org.junit.Assert.assertNotNull(strArrayItor9);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][], org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray2 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor0, objItorArrayItor1 };
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][], org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray5 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor3, objItorArrayItor4 };
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][], org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray8 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor6, objItorArrayItor7 };
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor9 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][], org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray11 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor9, objItorArrayItor10 };
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][], org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorArrayItor13 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray14 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor12, objItorArrayItor13 };
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor15 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][], org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorArrayItor16 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray17 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor15, objItorArrayItor16 };
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray18 = new org.apache.commons.collections4.OrderedMapIterator[][] { orderedMapIteratorArray2, orderedMapIteratorArray5, orderedMapIteratorArray8, orderedMapIteratorArray11, orderedMapIteratorArray14, orderedMapIteratorArray17 };
        java.util.ListIterator<org.apache.commons.collections4.OrderedMapIterator[][]> orderedMapIteratorArrayItor19 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(orderedMapIteratorArray18);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[]> orderedMapIteratorArrayItor20 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(orderedMapIteratorArray18);
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator[]> iteratorArrayItor22 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.util.Iterator[][]) orderedMapIteratorArray18, 3);
        org.junit.Assert.assertNotNull(serializableItorArrayItor0);
        org.junit.Assert.assertNotNull(objItorArrayItor1);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray2);
        org.junit.Assert.assertNotNull(serializableItorArrayItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray5);
        org.junit.Assert.assertNotNull(serializableItorArrayItor6);
        org.junit.Assert.assertNotNull(objItorArrayItor7);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray8);
        org.junit.Assert.assertNotNull(serializableItorArrayItor9);
        org.junit.Assert.assertNotNull(objItorArrayItor10);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray11);
        org.junit.Assert.assertNotNull(serializableItorArrayItor12);
        org.junit.Assert.assertNotNull(objItorArrayItor13);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray14);
        org.junit.Assert.assertNotNull(serializableItorArrayItor15);
        org.junit.Assert.assertNotNull(objItorArrayItor16);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray17);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray18);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor19);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor20);
        org.junit.Assert.assertNotNull(iteratorArrayItor22);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        org.apache.commons.collections4.OrderedIterator[][][][] orderedIteratorArray1 = new org.apache.commons.collections4.OrderedIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][] objItorArray2 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]) orderedIteratorArray1;
        org.apache.commons.collections4.OrderedIterator[][][][] orderedIteratorArray4 = new org.apache.commons.collections4.OrderedIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][] objItorArray5 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]) orderedIteratorArray4;
        org.apache.commons.collections4.OrderedIterator[][][][] orderedIteratorArray7 = new org.apache.commons.collections4.OrderedIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][] objItorArray8 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]) orderedIteratorArray7;
        org.apache.commons.collections4.OrderedIterator[][][][] orderedIteratorArray10 = new org.apache.commons.collections4.OrderedIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][] objItorArray11 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]) orderedIteratorArray10;
        org.apache.commons.collections4.OrderedIterator[][][][] orderedIteratorArray13 = new org.apache.commons.collections4.OrderedIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][] objItorArray14 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]) orderedIteratorArray13;
        org.apache.commons.collections4.OrderedIterator[][][][][] orderedIteratorArray16 = new org.apache.commons.collections4.OrderedIterator[5][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][] objItorArray17 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][]) orderedIteratorArray16;
        objItorArray17[0] = objItorArray2;
        objItorArray17[1] = objItorArray5;
        objItorArray17[2] = objItorArray8;
        objItorArray17[3] = objItorArray11;
        objItorArray17[4] = objItorArray14;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]> objItorArrayItor30 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray17, 0, 0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][]> objItorArrayItor31 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItorArray17);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]> objItorArrayItor34 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray17, 0, 2);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]> objItorArrayItor35 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray17);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][][]> objItorArrayItor36 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItorArray17);
        org.junit.Assert.assertNotNull(orderedIteratorArray1);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray1, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertArrayEquals(objItorArray2, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray4);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray4, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(objItorArray5);
        org.junit.Assert.assertArrayEquals(objItorArray5, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray7);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray7, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(objItorArray8);
        org.junit.Assert.assertArrayEquals(objItorArray8, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray10);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray10, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(objItorArray11);
        org.junit.Assert.assertArrayEquals(objItorArray11, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray13);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray13, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(objItorArray14);
        org.junit.Assert.assertArrayEquals(objItorArray14, new org.apache.commons.collections4.OrderedIterator[][][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray16);
        org.junit.Assert.assertNotNull(objItorArray17);
        org.junit.Assert.assertNotNull(objItorArrayItor30);
        org.junit.Assert.assertNotNull(objItorArrayItor31);
        org.junit.Assert.assertNotNull(objItorArrayItor34);
        org.junit.Assert.assertNotNull(objItorArrayItor35);
        org.junit.Assert.assertNotNull(objItorArrayItor36);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray0 = new org.apache.commons.collections4.OrderedMapIterator[] {};
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray1 = new org.apache.commons.collections4.OrderedMapIterator[] {};
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray2 = new org.apache.commons.collections4.OrderedMapIterator[] {};
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray3 = new org.apache.commons.collections4.OrderedMapIterator[] {};
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray4 = new org.apache.commons.collections4.OrderedMapIterator[] {};
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray5 = new org.apache.commons.collections4.OrderedMapIterator[] {};
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray6 = new org.apache.commons.collections4.OrderedMapIterator[][] { orderedMapIteratorArray0, orderedMapIteratorArray1, orderedMapIteratorArray2, orderedMapIteratorArray3, orderedMapIteratorArray4, orderedMapIteratorArray5 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[]> orderedMapIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(orderedMapIteratorArray6, (int) (short) 0);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((org.apache.commons.collections4.ResettableIterator) orderedMapIteratorArrayItor8);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor9);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor11 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor10);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor12 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor11);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray0);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray0, new org.apache.commons.collections4.OrderedMapIterator[] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray1);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray1, new org.apache.commons.collections4.OrderedMapIterator[] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray2);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray2, new org.apache.commons.collections4.OrderedMapIterator[] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray3);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray3, new org.apache.commons.collections4.OrderedMapIterator[] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray4);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray4, new org.apache.commons.collections4.OrderedMapIterator[] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray5);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray5, new org.apache.commons.collections4.OrderedMapIterator[] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray6);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
        org.junit.Assert.assertNotNull(resettableIteratorItor11);
        org.junit.Assert.assertNotNull(resettableIteratorItor12);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator2 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor3 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator2);
        java.lang.Object[] objArray6 = new java.lang.Object[] { resettableIterator0, (short) 100, resettableIteratorItor3, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray6, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor10 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor9);
        java.util.Iterator<?> wildcardItor11 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) objItor9);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray13 = new org.apache.commons.collections4.ResettableListIterator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray14 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray13;
        objItorArray14[0] = objItor9;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor17 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray14);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor18 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((org.apache.commons.collections4.ResettableIterator[]) objItorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator((org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) objItorArray14);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor20 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor21 = org.apache.commons.collections4.IteratorUtils.arrayIterator((org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) objItorArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator[][]> iteratorArrayItor24 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorArray14, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIterator0);
        org.junit.Assert.assertNotNull(resettableIterator2);
        org.junit.Assert.assertNotNull(resettableIteratorItor3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertNotNull(objItorItor10);
        org.junit.Assert.assertNotNull(wildcardItor11);
        org.junit.Assert.assertNotNull(resettableListIteratorArray13);
        org.junit.Assert.assertNotNull(objItorArray14);
        org.junit.Assert.assertNotNull(objItorItor17);
        org.junit.Assert.assertNotNull(resettableIteratorItor18);
        org.junit.Assert.assertNotNull(objItorItor19);
        org.junit.Assert.assertNotNull(objItorArrayItor20);
        org.junit.Assert.assertNotNull(objItorItor21);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray0, strArray1, strArray2, strArray3, strArray4 };
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.lang.String[][] strArray11 = new java.lang.String[][] { strArray6, strArray7, strArray8, strArray9, strArray10 };
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.lang.String[][] strArray17 = new java.lang.String[][] { strArray12, strArray13, strArray14, strArray15, strArray16 };
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.lang.String[] strArray22 = new java.lang.String[] {};
        java.lang.String[][] strArray23 = new java.lang.String[][] { strArray18, strArray19, strArray20, strArray21, strArray22 };
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.lang.String[] strArray25 = new java.lang.String[] {};
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.lang.String[] strArray27 = new java.lang.String[] {};
        java.lang.String[] strArray28 = new java.lang.String[] {};
        java.lang.String[][] strArray29 = new java.lang.String[][] { strArray24, strArray25, strArray26, strArray27, strArray28 };
        java.lang.String[] strArray30 = new java.lang.String[] {};
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.lang.String[] strArray32 = new java.lang.String[] {};
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.lang.String[][] strArray35 = new java.lang.String[][] { strArray30, strArray31, strArray32, strArray33, strArray34 };
        java.lang.String[][][] strArray36 = new java.lang.String[][][] { strArray5, strArray11, strArray17, strArray23, strArray29, strArray35 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][]> strArrayItor37 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray36);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][]> strArrayItor38 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray36);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object[][]> objArrayItor39 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[][][]) strArray36);
        java.util.ListIterator<java.io.Serializable> serializableItor40 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.io.Serializable) strArray36);
        java.util.ListIterator<java.lang.Object[][]> objArrayItor41 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.Object[][]) strArray36);
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor42 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.io.Serializable[]) strArray36);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor43 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strArray36);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArrayItor37);
        org.junit.Assert.assertNotNull(strArrayItor38);
        org.junit.Assert.assertNotNull(objArrayItor39);
        org.junit.Assert.assertNotNull(serializableItor40);
        org.junit.Assert.assertNotNull(objArrayItor41);
        org.junit.Assert.assertNotNull(serializableItor42);
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor43);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        org.apache.commons.collections4.ResettableListIterator[][][] resettableListIteratorArray1 = new org.apache.commons.collections4.ResettableListIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][][] objItorArray2 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][][]) resettableListIteratorArray1;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray2);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray2);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray2);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorArrayItor6, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableListIteratorArray1);
        org.junit.Assert.assertArrayEquals(resettableListIteratorArray1, new org.apache.commons.collections4.ResettableListIterator[][][] {});
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertArrayEquals(objItorArray2, new org.apache.commons.collections4.ResettableListIterator[][][] {});
        org.junit.Assert.assertNotNull(objItorArrayItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(objItorArrayItor5);
        org.junit.Assert.assertNotNull(objItorArrayItor6);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.apache.commons.collections4.MapIterator[][][][] mapIteratorArray1 = new org.apache.commons.collections4.MapIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][] serializableItorArray2 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]) mapIteratorArray1;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]> serializableItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray2);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]> serializableItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItorArray2);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]> serializableItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray2);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]> serializableItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray2);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]> serializableItorArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator(serializableItorArray2, 0);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]> serializableItorArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Object[][]> objArrayItor12 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[][][]) serializableItorArray2, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mapIteratorArray1);
        org.junit.Assert.assertArrayEquals(mapIteratorArray1, new org.apache.commons.collections4.MapIterator[][][][] {});
        org.junit.Assert.assertNotNull(serializableItorArray2);
        org.junit.Assert.assertArrayEquals(serializableItorArray2, new org.apache.commons.collections4.MapIterator[][][][] {});
        org.junit.Assert.assertNotNull(serializableItorArrayItor3);
        org.junit.Assert.assertNotNull(serializableItorArrayItor4);
        org.junit.Assert.assertNotNull(serializableItorArrayItor5);
        org.junit.Assert.assertNotNull(serializableItorArrayItor6);
        org.junit.Assert.assertNotNull(serializableItorArrayItor8);
        org.junit.Assert.assertNotNull(serializableItorArrayItor9);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.Object[][]> objArrayItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.Object[][]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.Type> typeItor8 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.Type>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]> serializableItorArrayItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>> charSequenceItorItor10 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]> serializableItorArrayItor11 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor12 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableListIterator<java.lang.Object>>[]) iteratorArray1);
        java.util.Iterator<java.lang.reflect.Type> typeItor13 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.Type>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(iteratorItor6);
        org.junit.Assert.assertNotNull(objArrayItor7);
        org.junit.Assert.assertNotNull(typeItor8);
        org.junit.Assert.assertNotNull(serializableItorArrayItor9);
        org.junit.Assert.assertNotNull(charSequenceItorItor10);
        org.junit.Assert.assertNotNull(serializableItorArrayItor11);
        org.junit.Assert.assertNotNull(objItorItor12);
        org.junit.Assert.assertNotNull(typeItor13);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Comparable<java.lang.String>[]) strArray4);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][]> strArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strArray4);
        org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Comparable<java.lang.String>[]) strArray4, 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Comparable<java.lang.String>[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence> charSequenceItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.CharSequence[]) strArray4, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strArrayItor6);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor9);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(obj0, (int) '4', 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.apache.commons.collections4.MapIterator<java.util.Iterator[], org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][]> iteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][]> serializableItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArrayItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArrayItor0);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableListIterator<java.lang.Object>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][]> serializableItorArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]> objItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1, 0);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor11 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]> charSequenceItorArrayItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1, 0);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(iteratorItor6);
        org.junit.Assert.assertNotNull(objItorItor7);
        org.junit.Assert.assertNotNull(serializableItorArrayItor8);
        org.junit.Assert.assertNotNull(objItorArrayItor10);
        org.junit.Assert.assertNotNull(resettableIteratorItor11);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor13);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        java.util.Iterator[] iteratorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator> iteratorItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(iteratorArray0, (int) (short) 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator2 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor3 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator2);
        java.lang.Object[] objArray6 = new java.lang.Object[] { resettableIterator0, (short) 100, resettableIteratorItor3, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray6, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor10 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor9);
        java.util.Iterator<?> wildcardItor11 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) objItor9);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray13 = new org.apache.commons.collections4.ResettableListIterator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray14 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray13;
        objItorArray14[0] = objItor9;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor17 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray14);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor18 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((org.apache.commons.collections4.ResettableIterator[]) objItorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor19 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor21 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray14, 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor22 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray14);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor23 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((org.apache.commons.collections4.ResettableIterator[]) objItorArray14);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor24 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>) resettableIteratorItor23);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor25 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor24);
        org.junit.Assert.assertNotNull(resettableIterator0);
        org.junit.Assert.assertNotNull(resettableIterator2);
        org.junit.Assert.assertNotNull(resettableIteratorItor3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertNotNull(objItorItor10);
        org.junit.Assert.assertNotNull(wildcardItor11);
        org.junit.Assert.assertNotNull(resettableListIteratorArray13);
        org.junit.Assert.assertNotNull(objItorArray14);
        org.junit.Assert.assertNotNull(objItorItor17);
        org.junit.Assert.assertNotNull(resettableIteratorItor18);
        org.junit.Assert.assertNotNull(objItorArrayItor19);
        org.junit.Assert.assertNotNull(objItorItor21);
        org.junit.Assert.assertNotNull(objItorItor22);
        org.junit.Assert.assertNotNull(resettableIteratorItor23);
        org.junit.Assert.assertNotNull(resettableIteratorItor24);
        org.junit.Assert.assertNotNull(resettableIteratorItor25);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][][] zippingIteratorArray1 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][][] charSequenceItorArray2 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][][]) zippingIteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][][] zippingIteratorArray4 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][][] charSequenceItorArray5 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][][]) zippingIteratorArray4;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][][] zippingIteratorArray7 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][][] charSequenceItorArray8 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][][]) zippingIteratorArray7;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][][] zippingIteratorArray10 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][][] charSequenceItorArray11 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][][]) zippingIteratorArray10;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][][] zippingIteratorArray13 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][][] charSequenceItorArray14 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][][]) zippingIteratorArray13;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][][][] zippingIteratorArray16 = new org.apache.commons.collections4.iterators.ZippingIterator[5][][][][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][][][] charSequenceItorArray17 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][][][]) zippingIteratorArray16;
        charSequenceItorArray17[0] = charSequenceItorArray2;
        charSequenceItorArray17[1] = charSequenceItorArray5;
        charSequenceItorArray17[2] = charSequenceItorArray8;
        charSequenceItorArray17[3] = charSequenceItorArray11;
        charSequenceItorArray17[4] = charSequenceItorArray14;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][][]> charSequenceItorArrayItor30 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceItorArray17, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zippingIteratorArray1);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray1, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray2);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray2, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray4);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray4, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray5);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray5, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray7);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray7, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray8);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray8, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray10);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray10, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray11);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray11, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray13);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray13, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray14);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray14, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray16);
        org.junit.Assert.assertNotNull(charSequenceItorArray17);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor1 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor1);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor1);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor3);
        org.apache.commons.collections4.MapIterator mapIterator5 = org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR;
        org.apache.commons.collections4.MapIterator[] mapIteratorArray7 = new org.apache.commons.collections4.MapIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[] serializableItorArray8 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]) mapIteratorArray7;
        serializableItorArray8[0] = serializableItor0;
        serializableItorArray8[1] = serializableItor4;
        serializableItorArray8[2] = mapIterator5;
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor15 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor16 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor17 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor16);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor18 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor16);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor19 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor18);
        org.apache.commons.collections4.MapIterator mapIterator20 = org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR;
        org.apache.commons.collections4.MapIterator[] mapIteratorArray22 = new org.apache.commons.collections4.MapIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[] serializableItorArray23 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]) mapIteratorArray22;
        serializableItorArray23[0] = serializableItor15;
        serializableItorArray23[1] = serializableItor19;
        serializableItorArray23[2] = mapIterator20;
        org.apache.commons.collections4.MapIterator[][] mapIteratorArray31 = new org.apache.commons.collections4.MapIterator[2][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][] serializableItorArray32 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]) mapIteratorArray31;
        serializableItorArray32[0] = serializableItorArray8;
        serializableItorArray32[1] = serializableItorArray23;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> serializableItorArrayItor37 = org.apache.commons.collections4.IteratorUtils.arrayIterator(serializableItorArray32);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object[]> objArrayItor38 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[][]) serializableItorArray32);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]> serializableItorArrayItor39 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItorArray32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor40 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) serializableItorArrayItor39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertNotNull(serializableItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(mapIterator5);
        org.junit.Assert.assertNotNull(mapIteratorArray7);
        org.junit.Assert.assertNotNull(serializableItorArray8);
        org.junit.Assert.assertNotNull(serializableItor15);
        org.junit.Assert.assertNotNull(serializableItor16);
        org.junit.Assert.assertNotNull(serializableItor17);
        org.junit.Assert.assertNotNull(serializableItor18);
        org.junit.Assert.assertNotNull(serializableItor19);
        org.junit.Assert.assertNotNull(mapIterator20);
        org.junit.Assert.assertNotNull(mapIteratorArray22);
        org.junit.Assert.assertNotNull(serializableItorArray23);
        org.junit.Assert.assertNotNull(mapIteratorArray31);
        org.junit.Assert.assertNotNull(serializableItorArray32);
        org.junit.Assert.assertNotNull(serializableItorArrayItor37);
        org.junit.Assert.assertNotNull(objArrayItor38);
        org.junit.Assert.assertNotNull(serializableItorArrayItor39);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.apache.commons.collections4.MapIterator[][][][] mapIteratorArray1 = new org.apache.commons.collections4.MapIterator[0][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][] serializableItorArray2 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]) mapIteratorArray1;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]> serializableItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray2);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]> serializableItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItorArray2);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]> serializableItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray2);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]> serializableItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(serializableItorArray2);
        org.junit.Assert.assertNotNull(mapIteratorArray1);
        org.junit.Assert.assertArrayEquals(mapIteratorArray1, new org.apache.commons.collections4.MapIterator[][][][] {});
        org.junit.Assert.assertNotNull(serializableItorArray2);
        org.junit.Assert.assertArrayEquals(serializableItorArray2, new org.apache.commons.collections4.MapIterator[][][][] {});
        org.junit.Assert.assertNotNull(serializableItorArrayItor3);
        org.junit.Assert.assertNotNull(serializableItorArrayItor4);
        org.junit.Assert.assertNotNull(serializableItorArrayItor5);
        org.junit.Assert.assertNotNull(serializableItorArrayItor6);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        org.apache.commons.collections4.ResettableListIterator resettableListIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor1 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor2);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor2);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray6 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray7 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray6;
        objItorArray7[0] = resettableListIterator0;
        objItorArray7[1] = objItor1;
        objItorArray7[2] = objItor2;
        org.apache.commons.collections4.ResettableListIterator resettableListIterator14 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor15 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor16 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor17 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor16);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor18 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor16);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray20 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray21 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray20;
        objItorArray21[0] = resettableListIterator14;
        objItorArray21[1] = objItor15;
        objItorArray21[2] = objItor16;
        org.apache.commons.collections4.ResettableListIterator resettableListIterator28 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor29 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor30 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor31 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor30);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor32 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor30);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray34 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray35 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray34;
        objItorArray35[0] = resettableListIterator28;
        objItorArray35[1] = objItor29;
        objItorArray35[2] = objItor30;
        org.apache.commons.collections4.ResettableListIterator resettableListIterator42 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor43 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor44 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor45 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor44);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor46 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor44);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray48 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray49 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray48;
        objItorArray49[0] = resettableListIterator42;
        objItorArray49[1] = objItor43;
        objItorArray49[2] = objItor44;
        org.apache.commons.collections4.ResettableListIterator[][] resettableListIteratorArray57 = new org.apache.commons.collections4.ResettableListIterator[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][] objItorArray58 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]) resettableListIteratorArray57;
        objItorArray58[0] = objItorArray7;
        objItorArray58[1] = objItorArray21;
        objItorArray58[2] = objItorArray35;
        objItorArray58[3] = objItorArray49;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor67 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray58);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor68 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItorArray58);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object[]> objArrayItor69 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItorArray58);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor70 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray58);
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor73 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.io.Serializable[]) objItorArray58, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(resettableListIterator0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(resettableListIteratorArray6);
        org.junit.Assert.assertNotNull(objItorArray7);
        org.junit.Assert.assertNotNull(resettableListIterator14);
        org.junit.Assert.assertNotNull(objItor15);
        org.junit.Assert.assertNotNull(objItor16);
        org.junit.Assert.assertNotNull(objItorItor17);
        org.junit.Assert.assertNotNull(objItorItor18);
        org.junit.Assert.assertNotNull(resettableListIteratorArray20);
        org.junit.Assert.assertNotNull(objItorArray21);
        org.junit.Assert.assertNotNull(resettableListIterator28);
        org.junit.Assert.assertNotNull(objItor29);
        org.junit.Assert.assertNotNull(objItor30);
        org.junit.Assert.assertNotNull(objItorItor31);
        org.junit.Assert.assertNotNull(objItorItor32);
        org.junit.Assert.assertNotNull(resettableListIteratorArray34);
        org.junit.Assert.assertNotNull(objItorArray35);
        org.junit.Assert.assertNotNull(resettableListIterator42);
        org.junit.Assert.assertNotNull(objItor43);
        org.junit.Assert.assertNotNull(objItor44);
        org.junit.Assert.assertNotNull(objItorItor45);
        org.junit.Assert.assertNotNull(objItorItor46);
        org.junit.Assert.assertNotNull(resettableListIteratorArray48);
        org.junit.Assert.assertNotNull(objItorArray49);
        org.junit.Assert.assertNotNull(resettableListIteratorArray57);
        org.junit.Assert.assertNotNull(objItorArray58);
        org.junit.Assert.assertNotNull(objItorArrayItor67);
        org.junit.Assert.assertNotNull(objItorArrayItor68);
        org.junit.Assert.assertNotNull(objArrayItor69);
        org.junit.Assert.assertNotNull(objItorArrayItor70);
        org.junit.Assert.assertNotNull(serializableItor73);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][] zippingIteratorArray1 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][] charSequenceItorArray2 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][]) zippingIteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][] zippingIteratorArray4 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][] charSequenceItorArray5 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][]) zippingIteratorArray4;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][][] zippingIteratorArray7 = new org.apache.commons.collections4.iterators.ZippingIterator[2][][][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][][] charSequenceItorArray8 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][][]) zippingIteratorArray7;
        charSequenceItorArray8[0] = charSequenceItorArray2;
        charSequenceItorArray8[1] = charSequenceItorArray5;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][]> charSequenceItorArrayItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceItorArray8);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][]> charSequenceItorArrayItor14 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceItorArray8);
        org.junit.Assert.assertNotNull(zippingIteratorArray1);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray1, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray2);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray2, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray4);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray4, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray5);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray5, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray7);
        org.junit.Assert.assertNotNull(charSequenceItorArray8);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor13);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor14);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> charSequenceItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) charSequenceItorArrayItor0);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor0);
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        java.lang.String[][][] strArray0 = new java.lang.String[][][] {};
        java.util.ListIterator<java.lang.String[][][]> strArrayItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(strArray0);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object[]> objArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[][]) strArray0, 0, (int) (short) 0);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][]> strArrayItor5 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[][][] {});
        org.junit.Assert.assertNotNull(strArrayItor1);
        org.junit.Assert.assertNotNull(objArrayItor4);
        org.junit.Assert.assertNotNull(strArrayItor5);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) iteratorItor0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorItor0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorItor0);
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator[]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator> iteratorItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator(iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(serializableItorItor6);
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor7);
        org.junit.Assert.assertNotNull(iteratorItor8);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        java.lang.Class[][][][] classArray1 = new java.lang.Class[0][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][]) classArray1;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][][]> wildcardClassArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray2);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][][]> wildcardClassArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray2, (int) (short) 0);
        java.util.ListIterator<java.lang.Class<?>[][][][]> wildcardClassArrayItor6 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(wildcardClassArray2);
        java.util.ListIterator<java.lang.Class<?>[][][][]> wildcardClassArrayItor7 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(wildcardClassArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][][]> wildcardClassArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray2, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertArrayEquals(classArray1, new java.lang.Class[][][][] {});
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertArrayEquals(wildcardClassArray2, new java.lang.Class[][][][] {});
        org.junit.Assert.assertNotNull(wildcardClassArrayItor3);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor5);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor6);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor7);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1);
        java.util.Iterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[][][][]> resettableIteratorItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[][][][]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(genericDeclarationItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItorArrayItor5);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        java.util.Iterator<java.lang.Object[][]> objArrayItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Object[][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][]> strArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.String>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor8 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator[] iteratorArray10 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray11 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray10;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor12 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray10);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>> charSequenceItorItor13 = org.apache.commons.collections4.IteratorUtils.singletonIterator(charSequenceItor12);
        java.util.Iterator[] iteratorArray15 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray16 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray15;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor17 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray15);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>> charSequenceItorItor18 = org.apache.commons.collections4.IteratorUtils.singletonIterator(charSequenceItor17);
        java.util.Iterator[] iteratorArray20 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray21 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray20;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor22 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray20);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>> charSequenceItorItor23 = org.apache.commons.collections4.IteratorUtils.singletonIterator(charSequenceItor22);
        java.util.Iterator[] iteratorArray25 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray26 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray25;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor27 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray25);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>> charSequenceItorItor28 = org.apache.commons.collections4.IteratorUtils.singletonIterator(charSequenceItor27);
        java.util.Iterator[] iteratorArray30 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray31 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray30;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor32 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray30);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>> charSequenceItorItor33 = org.apache.commons.collections4.IteratorUtils.singletonIterator(charSequenceItor32);
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray35 = new org.apache.commons.collections4.iterators.ZippingIterator[6];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[] charSequenceItorArray36 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]) zippingIteratorArray35;
        charSequenceItorArray36[0] = charSequenceItor8;
        charSequenceItorArray36[1] = charSequenceItor12;
        charSequenceItorArray36[2] = charSequenceItor17;
        charSequenceItorArray36[3] = charSequenceItor22;
        charSequenceItorArray36[4] = charSequenceItor27;
        charSequenceItorArray36[5] = charSequenceItor32;
        org.apache.commons.collections4.iterators.ZippingIterator[][] zippingIteratorArray50 = new org.apache.commons.collections4.iterators.ZippingIterator[1][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][] charSequenceItorArray51 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]) zippingIteratorArray50;
        charSequenceItorArray51[0] = charSequenceItorArray36;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> charSequenceItorArrayItor54 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceItorArray51);
        java.util.ListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]> charSequenceItorArrayItor55 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceItorArray51);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> charSequenceItorArrayItor56 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceItorArray51);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> charSequenceItorArrayItor59 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceItorArray51, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(objArrayItor5);
        org.junit.Assert.assertNotNull(strArrayItor6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(charSequenceItor8);
        org.junit.Assert.assertNotNull(iteratorArray10);
        org.junit.Assert.assertArrayEquals(iteratorArray10, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray11);
        org.junit.Assert.assertArrayEquals(wildcardItorArray11, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor12);
        org.junit.Assert.assertNotNull(charSequenceItorItor13);
        org.junit.Assert.assertNotNull(iteratorArray15);
        org.junit.Assert.assertArrayEquals(iteratorArray15, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray16);
        org.junit.Assert.assertArrayEquals(wildcardItorArray16, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor17);
        org.junit.Assert.assertNotNull(charSequenceItorItor18);
        org.junit.Assert.assertNotNull(iteratorArray20);
        org.junit.Assert.assertArrayEquals(iteratorArray20, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray21);
        org.junit.Assert.assertArrayEquals(wildcardItorArray21, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor22);
        org.junit.Assert.assertNotNull(charSequenceItorItor23);
        org.junit.Assert.assertNotNull(iteratorArray25);
        org.junit.Assert.assertArrayEquals(iteratorArray25, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray26);
        org.junit.Assert.assertArrayEquals(wildcardItorArray26, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor27);
        org.junit.Assert.assertNotNull(charSequenceItorItor28);
        org.junit.Assert.assertNotNull(iteratorArray30);
        org.junit.Assert.assertArrayEquals(iteratorArray30, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray31);
        org.junit.Assert.assertArrayEquals(wildcardItorArray31, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor32);
        org.junit.Assert.assertNotNull(charSequenceItorItor33);
        org.junit.Assert.assertNotNull(zippingIteratorArray35);
        org.junit.Assert.assertNotNull(charSequenceItorArray36);
        org.junit.Assert.assertNotNull(zippingIteratorArray50);
        org.junit.Assert.assertNotNull(charSequenceItorArray51);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor54);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor55);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor56);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][]> charSequenceItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor0);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String[][][], org.apache.commons.collections4.OrderedMapIterator[][]> strArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strArrayItor0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayItor0);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray0 = new org.apache.commons.collections4.OrderedMapIterator[] {};
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray1 = new org.apache.commons.collections4.OrderedMapIterator[] {};
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray2 = new org.apache.commons.collections4.OrderedMapIterator[] {};
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray3 = new org.apache.commons.collections4.OrderedMapIterator[] {};
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray4 = new org.apache.commons.collections4.OrderedMapIterator[] {};
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray5 = new org.apache.commons.collections4.OrderedMapIterator[] {};
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray6 = new org.apache.commons.collections4.OrderedMapIterator[][] { orderedMapIteratorArray0, orderedMapIteratorArray1, orderedMapIteratorArray2, orderedMapIteratorArray3, orderedMapIteratorArray4, orderedMapIteratorArray5 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[]> orderedMapIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(orderedMapIteratorArray6, (int) (short) 0);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((org.apache.commons.collections4.ResettableIterator) orderedMapIteratorArrayItor8);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.singletonIterator((org.apache.commons.collections4.ResettableIterator) orderedMapIteratorArrayItor8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) orderedMapIteratorArrayItor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIteratorArray0);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray0, new org.apache.commons.collections4.OrderedMapIterator[] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray1);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray1, new org.apache.commons.collections4.OrderedMapIterator[] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray2);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray2, new org.apache.commons.collections4.OrderedMapIterator[] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray3);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray3, new org.apache.commons.collections4.OrderedMapIterator[] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray4);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray4, new org.apache.commons.collections4.OrderedMapIterator[] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray5);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray5, new org.apache.commons.collections4.OrderedMapIterator[] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray6);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][] zippingIteratorArray1 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][] charSequenceItorArray2 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][]) zippingIteratorArray1;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][]> charSequenceItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceItorArray2);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][]> charSequenceItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceItorArray2);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][]> charSequenceItorArrayItor5 = org.apache.commons.collections4.IteratorUtils.singletonIterator(charSequenceItorArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][]> charSequenceItorArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceItorArray2, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zippingIteratorArray1);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray1, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray2);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray2, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor3);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor4);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor5);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableIterator[]> resettableIteratorArrayItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator[]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(genericDeclarationItor4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor6);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1);
        java.util.Iterator<java.lang.Class<?>> wildcardClassItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Class<?>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.Object[]> objArrayItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.Object[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor6 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator> iteratorItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator(iteratorArray1, 0, 0);
        java.util.Iterator<?> wildcardItor10 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) iteratorItor9);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(genericDeclarationItor3);
        org.junit.Assert.assertNotNull(wildcardClassItor4);
        org.junit.Assert.assertNotNull(objArrayItor5);
        org.junit.Assert.assertNotNull(serializableItorItor6);
        org.junit.Assert.assertNotNull(iteratorItor9);
        org.junit.Assert.assertNotNull(wildcardItor10);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(annotatedElementArray0, 5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        org.apache.commons.collections4.OrderedIterator[][] orderedIteratorArray1 = new org.apache.commons.collections4.OrderedIterator[0][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][] objItorArray2 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]) orderedIteratorArray1;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray2);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor4 = org.apache.commons.collections4.IteratorUtils.singletonIterator((org.apache.commons.collections4.ResettableIterator) objItorArrayItor3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItorArrayItor3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedIteratorArray1);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray1, new org.apache.commons.collections4.OrderedIterator[][] {});
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertArrayEquals(objItorArray2, new org.apache.commons.collections4.OrderedIterator[][] {});
        org.junit.Assert.assertNotNull(objItorArrayItor3);
        org.junit.Assert.assertNotNull(resettableIteratorItor4);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator2 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor3 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator2);
        java.lang.Object[] objArray6 = new java.lang.Object[] { resettableIterator0, (short) 100, resettableIteratorItor3, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray6, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor10 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor9);
        java.util.Iterator<?> wildcardItor11 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) objItor9);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray13 = new org.apache.commons.collections4.ResettableListIterator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray14 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray13;
        objItorArray14[0] = objItor9;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor17 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray14);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor18 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((org.apache.commons.collections4.ResettableIterator[]) objItorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor19 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor21 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray14, 1);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor22 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItorArray14);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor23 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor24 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray14);
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator> iteratorItor25 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.util.Iterator[]) objItorArray14);
        org.junit.Assert.assertNotNull(resettableIterator0);
        org.junit.Assert.assertNotNull(resettableIterator2);
        org.junit.Assert.assertNotNull(resettableIteratorItor3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertNotNull(objItorItor10);
        org.junit.Assert.assertNotNull(wildcardItor11);
        org.junit.Assert.assertNotNull(resettableListIteratorArray13);
        org.junit.Assert.assertNotNull(objItorArray14);
        org.junit.Assert.assertNotNull(objItorItor17);
        org.junit.Assert.assertNotNull(resettableIteratorItor18);
        org.junit.Assert.assertNotNull(objItorArrayItor19);
        org.junit.Assert.assertNotNull(objItorItor21);
        org.junit.Assert.assertNotNull(objItorArrayItor22);
        org.junit.Assert.assertNotNull(objItorArrayItor23);
        org.junit.Assert.assertNotNull(objItorItor24);
        org.junit.Assert.assertNotNull(iteratorItor25);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.apache.commons.collections4.OrderedMapIterator[][][][][][] orderedMapIteratorArray0 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][][] orderedMapIteratorArray1 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][][] orderedMapIteratorArray2 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][][][] orderedMapIteratorArray3 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][][] { orderedMapIteratorArray0, orderedMapIteratorArray1, orderedMapIteratorArray2 };
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][][]> orderedMapIteratorArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator(orderedMapIteratorArray3);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][][][]> orderedMapIteratorArrayItor5 = org.apache.commons.collections4.IteratorUtils.singletonIterator(orderedMapIteratorArray3);
        java.util.ListIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][][][]> orderedMapIteratorArrayItor6 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(orderedMapIteratorArray3);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray0);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray0, new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray1);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray1, new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray2);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray2, new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray3);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor5);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor6);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        org.apache.commons.collections4.OrderedIterator[][][] orderedIteratorArray1 = new org.apache.commons.collections4.OrderedIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][] objItorArray2 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]) orderedIteratorArray1;
        org.apache.commons.collections4.OrderedIterator[][][] orderedIteratorArray4 = new org.apache.commons.collections4.OrderedIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][] objItorArray5 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]) orderedIteratorArray4;
        org.apache.commons.collections4.OrderedIterator[][][][] orderedIteratorArray7 = new org.apache.commons.collections4.OrderedIterator[2][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][] objItorArray8 = (org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]) orderedIteratorArray7;
        objItorArray8[0] = objItorArray2;
        objItorArray8[1] = objItorArray5;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][]> objItorArrayItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray8);
        java.util.ListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][][][]> objItorArrayItor14 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItorArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor17 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorArrayItor14, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedIteratorArray1);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray1, new org.apache.commons.collections4.OrderedIterator[][][] {});
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertArrayEquals(objItorArray2, new org.apache.commons.collections4.OrderedIterator[][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray4);
        org.junit.Assert.assertArrayEquals(orderedIteratorArray4, new org.apache.commons.collections4.OrderedIterator[][][] {});
        org.junit.Assert.assertNotNull(objItorArray5);
        org.junit.Assert.assertArrayEquals(objItorArray5, new org.apache.commons.collections4.OrderedIterator[][][] {});
        org.junit.Assert.assertNotNull(orderedIteratorArray7);
        org.junit.Assert.assertNotNull(objItorArray8);
        org.junit.Assert.assertNotNull(objItorArrayItor13);
        org.junit.Assert.assertNotNull(objItorArrayItor14);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        org.apache.commons.collections4.MapIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[][][], org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][]> resettableIteratorItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(resettableIteratorItorArrayItor0);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        java.lang.Class[][][][][] classArray1 = new java.lang.Class[0][][][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][][][] wildcardClassArray2 = (java.lang.Class<?>[][][][][]) classArray1;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][][][]> wildcardClassArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray2);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][][][]> wildcardClassArrayItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray2, (int) (byte) 0);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[][][][]> wildcardClassArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertArrayEquals(classArray1, new java.lang.Class[][][][][] {});
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertArrayEquals(wildcardClassArray2, new java.lang.Class[][][][][] {});
        org.junit.Assert.assertNotNull(wildcardClassArrayItor3);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor5);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor6);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
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
        java.lang.Class[][] classArray16 = new java.lang.Class[5][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray17 = (java.lang.Class<?>[][]) classArray16;
        wildcardClassArray17[0] = classArray1;
        wildcardClassArray17[1] = wildcardClassArray5;
        wildcardClassArray17[2] = classArray7;
        wildcardClassArray17[3] = classArray10;
        wildcardClassArray17[4] = wildcardClassArray14;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[]> wildcardClassArrayItor28 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray17);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor29 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray17);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][]> wildcardClassArrayItor30 = org.apache.commons.collections4.IteratorUtils.singletonIterator(wildcardClassArray17);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement[]> annotatedElementArrayItor31 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.AnnotatedElement[][]) wildcardClassArray17);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray17, 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor34 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray17);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement[]> annotatedElementArrayItor35 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.reflect.AnnotatedElement[][]) wildcardClassArray17);
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
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor28);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor29);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor30);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor31);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor33);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor34);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor35);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        org.apache.commons.collections4.iterators.ZippingIterator[][][] zippingIteratorArray1 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][] charSequenceItorArray2 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]) zippingIteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator[][][] zippingIteratorArray4 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][] charSequenceItorArray5 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]) zippingIteratorArray4;
        org.apache.commons.collections4.iterators.ZippingIterator[][][] zippingIteratorArray7 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][] charSequenceItorArray8 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]) zippingIteratorArray7;
        org.apache.commons.collections4.iterators.ZippingIterator[][][] zippingIteratorArray10 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][] charSequenceItorArray11 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]) zippingIteratorArray10;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][] zippingIteratorArray13 = new org.apache.commons.collections4.iterators.ZippingIterator[4][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][] charSequenceItorArray14 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][]) zippingIteratorArray13;
        charSequenceItorArray14[0] = charSequenceItorArray2;
        charSequenceItorArray14[1] = charSequenceItorArray5;
        charSequenceItorArray14[2] = charSequenceItorArray8;
        charSequenceItorArray14[3] = charSequenceItorArray11;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]> charSequenceItorArrayItor23 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceItorArray14);
        java.util.Iterator<?> wildcardItor24 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) charSequenceItorArray14);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object[][]> objArrayItor25 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[][][]) charSequenceItorArray14);
        org.junit.Assert.assertNotNull(zippingIteratorArray1);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray1, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray2);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray2, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray4);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray4, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray5);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray5, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray7);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray7, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray8);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray8, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray10);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray10, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray11);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray11, new org.apache.commons.collections4.iterators.ZippingIterator[][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray13);
        org.junit.Assert.assertNotNull(charSequenceItorArray14);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor23);
        org.junit.Assert.assertNotNull(wildcardItor24);
        org.junit.Assert.assertNotNull(objArrayItor25);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>>[]) iteratorArray1);
        java.util.Iterator<java.util.Iterator[][]> iteratorArrayItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.Iterator[][]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.reflect.AnnotatedElement[]> annotatedElementArrayItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.reflect.AnnotatedElement[]>[]) iteratorArray1);
        java.util.Iterator<java.lang.String[][]> strArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[][]>[]) iteratorArray1);
        java.lang.Class<?> wildcardClass9 = strArrayItor8.getClass();
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(serializableItorItor5);
        org.junit.Assert.assertNotNull(iteratorArrayItor6);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor7);
        org.junit.Assert.assertNotNull(strArrayItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        org.apache.commons.collections4.ResettableListIterator[][] resettableListIteratorArray1 = new org.apache.commons.collections4.ResettableListIterator[0][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][] objItorArray2 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]) resettableListIteratorArray1;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray2);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objItorArray2, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[][][]> resettableIteratorItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableListIteratorArray1);
        org.junit.Assert.assertArrayEquals(resettableListIteratorArray1, new org.apache.commons.collections4.ResettableListIterator[][] {});
        org.junit.Assert.assertNotNull(objItorArray2);
        org.junit.Assert.assertArrayEquals(objItorArray2, new org.apache.commons.collections4.ResettableListIterator[][] {});
        org.junit.Assert.assertNotNull(objItorArrayItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor6);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator0);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor1);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor2);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor2);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor2);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor5);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor6);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor8 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor6);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor9 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor6);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor10 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(resettableIterator0);
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(resettableIteratorItor3);
        org.junit.Assert.assertNotNull(resettableIteratorItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(resettableIteratorItor6);
        org.junit.Assert.assertNotNull(resettableIteratorItor7);
        org.junit.Assert.assertNotNull(resettableIteratorItor8);
        org.junit.Assert.assertNotNull(resettableIteratorItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItor10);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strArray2);
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.CharSequence[]) strArray2, 1);
        java.util.ListIterator<java.lang.String[]> strArrayItor6 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(strArray2);
        org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[]> resettableIteratorItorArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strArray2, (int) (byte) 1);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[][]> resettableIteratorItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strItor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArrayItor3);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(strArrayItor6);
        org.junit.Assert.assertNotNull(resettableIteratorItorArrayItor8);
        org.junit.Assert.assertNotNull(strItor9);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor3);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor3);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor6 = org.apache.commons.collections4.IteratorUtils.singletonIterator(serializableItor5);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor5);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor8 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor7);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor9 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor7);
        java.util.Iterator<?> wildcardItor10 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) serializableItor7);
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertNotNull(serializableItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(serializableItor5);
        org.junit.Assert.assertNotNull(serializableItorItor6);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(serializableItor8);
        org.junit.Assert.assertNotNull(serializableItor9);
        org.junit.Assert.assertNotNull(wildcardItor10);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor1 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor1);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor1);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor3);
        org.apache.commons.collections4.MapIterator mapIterator5 = org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR;
        org.apache.commons.collections4.MapIterator[] mapIteratorArray7 = new org.apache.commons.collections4.MapIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[] serializableItorArray8 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]) mapIteratorArray7;
        serializableItorArray8[0] = serializableItor0;
        serializableItorArray8[1] = serializableItor4;
        serializableItorArray8[2] = mapIterator5;
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor15 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor16 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor17 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor16);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor18 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor16);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor19 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor18);
        org.apache.commons.collections4.MapIterator mapIterator20 = org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR;
        org.apache.commons.collections4.MapIterator[] mapIteratorArray22 = new org.apache.commons.collections4.MapIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[] serializableItorArray23 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]) mapIteratorArray22;
        serializableItorArray23[0] = serializableItor15;
        serializableItorArray23[1] = serializableItor19;
        serializableItorArray23[2] = mapIterator20;
        org.apache.commons.collections4.MapIterator[][] mapIteratorArray31 = new org.apache.commons.collections4.MapIterator[2][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][] serializableItorArray32 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]) mapIteratorArray31;
        serializableItorArray32[0] = serializableItorArray8;
        serializableItorArray32[1] = serializableItorArray23;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> serializableItorArrayItor37 = org.apache.commons.collections4.IteratorUtils.arrayIterator(serializableItorArray32);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object[]> objArrayItor38 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[][]) serializableItorArray32);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]> serializableItorArrayItor39 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItorArray32);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> serializableItorArrayItor40 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) serializableItorArray32);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> serializableItorArrayItor42 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray32, 2);
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertNotNull(serializableItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(mapIterator5);
        org.junit.Assert.assertNotNull(mapIteratorArray7);
        org.junit.Assert.assertNotNull(serializableItorArray8);
        org.junit.Assert.assertNotNull(serializableItor15);
        org.junit.Assert.assertNotNull(serializableItor16);
        org.junit.Assert.assertNotNull(serializableItor17);
        org.junit.Assert.assertNotNull(serializableItor18);
        org.junit.Assert.assertNotNull(serializableItor19);
        org.junit.Assert.assertNotNull(mapIterator20);
        org.junit.Assert.assertNotNull(mapIteratorArray22);
        org.junit.Assert.assertNotNull(serializableItorArray23);
        org.junit.Assert.assertNotNull(mapIteratorArray31);
        org.junit.Assert.assertNotNull(serializableItorArray32);
        org.junit.Assert.assertNotNull(serializableItorArrayItor37);
        org.junit.Assert.assertNotNull(objArrayItor38);
        org.junit.Assert.assertNotNull(serializableItorArrayItor39);
        org.junit.Assert.assertNotNull(serializableItorArrayItor40);
        org.junit.Assert.assertNotNull(serializableItorArrayItor42);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1);
        java.util.Iterator<java.lang.Class<?>> wildcardClassItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Class<?>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator>[]) iteratorArray1);
        java.util.Iterator<java.util.Iterator> iteratorItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.Iterator>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableListIterator<java.lang.Object>>[]) iteratorArray1);
        java.util.Iterator<java.lang.reflect.AnnotatedElement[][]> annotatedElementArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.AnnotatedElement[][]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]> charSequenceItorArrayItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[][][][]> orderedMapIteratorArrayItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts beyond the end of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(genericDeclarationItor3);
        org.junit.Assert.assertNotNull(wildcardClassItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor5);
        org.junit.Assert.assertNotNull(iteratorItor6);
        org.junit.Assert.assertNotNull(objItorItor7);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor8);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor9);
        org.junit.Assert.assertNotNull(objItorArrayItor10);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        java.lang.String[][][][][][][][][] strArray0 = new java.lang.String[][][][][][][][][] {};
        java.lang.String[][][][][][][][][] strArray1 = new java.lang.String[][][][][][][][][] {};
        java.lang.String[][][][][][][][][] strArray2 = new java.lang.String[][][][][][][][][] {};
        java.lang.String[][][][][][][][][] strArray3 = new java.lang.String[][][][][][][][][] {};
        java.lang.String[][][][][][][][][][] strArray4 = new java.lang.String[][][][][][][][][][] { strArray0, strArray1, strArray2, strArray3 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][][][][][][][][]> strArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray4, 3);
        java.util.ListIterator<java.lang.String[][][][][][][][][][]> strArrayItor7 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][][][][]> strArrayItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray4, (int) (short) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[][][][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[][][][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[][][][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[][][][][][][][][] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArrayItor6);
        org.junit.Assert.assertNotNull(strArrayItor7);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][][] zippingIteratorArray1 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][] charSequenceItorArray2 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][]) zippingIteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][][] zippingIteratorArray4 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][] charSequenceItorArray5 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][]) zippingIteratorArray4;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][][] zippingIteratorArray7 = new org.apache.commons.collections4.iterators.ZippingIterator[0][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][] charSequenceItorArray8 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][]) zippingIteratorArray7;
        org.apache.commons.collections4.iterators.ZippingIterator[][][][][][][] zippingIteratorArray10 = new org.apache.commons.collections4.iterators.ZippingIterator[3][][][][][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][] charSequenceItorArray11 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][]) zippingIteratorArray10;
        charSequenceItorArray11[0] = charSequenceItorArray2;
        charSequenceItorArray11[1] = charSequenceItorArray5;
        charSequenceItorArray11[2] = charSequenceItorArray8;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][]> charSequenceItorArrayItor18 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceItorArray11);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][]> charSequenceItorArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceItorArray11);
        java.util.ListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][]> charSequenceItorArrayItor20 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceItorArray11);
        org.junit.Assert.assertNotNull(zippingIteratorArray1);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray1, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray2);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray2, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray4);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray4, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray5);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray5, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray7);
        org.junit.Assert.assertArrayEquals(zippingIteratorArray7, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceItorArray8);
        org.junit.Assert.assertArrayEquals(charSequenceItorArray8, new org.apache.commons.collections4.iterators.ZippingIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(zippingIteratorArray10);
        org.junit.Assert.assertNotNull(charSequenceItorArray11);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor18);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor19);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor20);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator> orderedMapIteratorItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1, 0);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][]> charSequenceItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][]> serializableItorArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator[][][]> orderedMapIteratorArrayItor9 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator[][][]>[]) iteratorArray1);
        java.util.Iterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[]> resettableIteratorItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[]>[]) iteratorArray1);
        java.util.Iterator<?> wildcardItor11 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) resettableIteratorItorArrayItor10);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorItor6);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor7);
        org.junit.Assert.assertNotNull(serializableItorArrayItor8);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor9);
        org.junit.Assert.assertNotNull(resettableIteratorItorArrayItor10);
        org.junit.Assert.assertNotNull(wildcardItor11);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        org.apache.commons.collections4.MapIterator<java.util.Iterator, org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]> charSequenceItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorItor0, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorItor0);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor0);
        java.util.Iterator<?> wildcardItor2 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor4 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor4);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor5);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor5);
        org.apache.commons.collections4.MapIterator[] mapIteratorArray9 = new org.apache.commons.collections4.MapIterator[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[] serializableItorArray10 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]) mapIteratorArray9;
        serializableItorArray10[0] = serializableItor0;
        serializableItorArray10[1] = serializableItor7;
        org.apache.commons.collections4.MapIterator[][] mapIteratorArray16 = new org.apache.commons.collections4.MapIterator[1][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][] serializableItorArray17 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]) mapIteratorArray16;
        serializableItorArray17[0] = serializableItorArray10;
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor20 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor21 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor20);
        java.util.Iterator<?> wildcardItor22 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) serializableItor20);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor23 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor20);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor24 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor25 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor24);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor26 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor25);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor27 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor25);
        org.apache.commons.collections4.MapIterator[] mapIteratorArray29 = new org.apache.commons.collections4.MapIterator[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[] serializableItorArray30 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]) mapIteratorArray29;
        serializableItorArray30[0] = serializableItor20;
        serializableItorArray30[1] = serializableItor27;
        org.apache.commons.collections4.MapIterator[][] mapIteratorArray36 = new org.apache.commons.collections4.MapIterator[1][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][] serializableItorArray37 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]) mapIteratorArray36;
        serializableItorArray37[0] = serializableItorArray30;
        org.apache.commons.collections4.MapIterator[][][] mapIteratorArray41 = new org.apache.commons.collections4.MapIterator[2][][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][] serializableItorArray42 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][]) mapIteratorArray41;
        serializableItorArray42[0] = serializableItorArray17;
        serializableItorArray42[1] = serializableItorArray37;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]> serializableItorArrayItor47 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray42);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]> serializableItorArrayItor48 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray42);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator[][]> iteratorArrayItor49 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator[][][]) serializableItorArray42);
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator[][]> iteratorArrayItor50 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator[][][]) serializableItorArray42);
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor51 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((org.apache.commons.collections4.ResettableIterator) iteratorArrayItor50);
        java.lang.Class<?> wildcardClass52 = resettableIteratorItor51.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][]> strArrayItor53 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) resettableIteratorItor51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItorItor1);
        org.junit.Assert.assertNotNull(wildcardItor2);
        org.junit.Assert.assertNotNull(serializableItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(serializableItor5);
        org.junit.Assert.assertNotNull(serializableItor6);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(mapIteratorArray9);
        org.junit.Assert.assertNotNull(serializableItorArray10);
        org.junit.Assert.assertNotNull(mapIteratorArray16);
        org.junit.Assert.assertNotNull(serializableItorArray17);
        org.junit.Assert.assertNotNull(serializableItor20);
        org.junit.Assert.assertNotNull(serializableItorItor21);
        org.junit.Assert.assertNotNull(wildcardItor22);
        org.junit.Assert.assertNotNull(serializableItor23);
        org.junit.Assert.assertNotNull(serializableItor24);
        org.junit.Assert.assertNotNull(serializableItor25);
        org.junit.Assert.assertNotNull(serializableItor26);
        org.junit.Assert.assertNotNull(serializableItor27);
        org.junit.Assert.assertNotNull(mapIteratorArray29);
        org.junit.Assert.assertNotNull(serializableItorArray30);
        org.junit.Assert.assertNotNull(mapIteratorArray36);
        org.junit.Assert.assertNotNull(serializableItorArray37);
        org.junit.Assert.assertNotNull(mapIteratorArray41);
        org.junit.Assert.assertNotNull(serializableItorArray42);
        org.junit.Assert.assertNotNull(serializableItorArrayItor47);
        org.junit.Assert.assertNotNull(serializableItorArrayItor48);
        org.junit.Assert.assertNotNull(iteratorArrayItor49);
        org.junit.Assert.assertNotNull(iteratorArrayItor50);
        org.junit.Assert.assertNotNull(resettableIteratorItor51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor2);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor2);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor4);
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItorItor1);
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertNotNull(serializableItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(serializableItor5);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray0, strArray1, strArray2, strArray3, strArray4 };
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.lang.String[][] strArray11 = new java.lang.String[][] { strArray6, strArray7, strArray8, strArray9, strArray10 };
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.lang.String[] strArray14 = new java.lang.String[] {};
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.lang.String[] strArray16 = new java.lang.String[] {};
        java.lang.String[][] strArray17 = new java.lang.String[][] { strArray12, strArray13, strArray14, strArray15, strArray16 };
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.lang.String[] strArray21 = new java.lang.String[] {};
        java.lang.String[] strArray22 = new java.lang.String[] {};
        java.lang.String[][] strArray23 = new java.lang.String[][] { strArray18, strArray19, strArray20, strArray21, strArray22 };
        java.lang.String[] strArray24 = new java.lang.String[] {};
        java.lang.String[] strArray25 = new java.lang.String[] {};
        java.lang.String[] strArray26 = new java.lang.String[] {};
        java.lang.String[] strArray27 = new java.lang.String[] {};
        java.lang.String[] strArray28 = new java.lang.String[] {};
        java.lang.String[][] strArray29 = new java.lang.String[][] { strArray24, strArray25, strArray26, strArray27, strArray28 };
        java.lang.String[] strArray30 = new java.lang.String[] {};
        java.lang.String[] strArray31 = new java.lang.String[] {};
        java.lang.String[] strArray32 = new java.lang.String[] {};
        java.lang.String[] strArray33 = new java.lang.String[] {};
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.lang.String[][] strArray35 = new java.lang.String[][] { strArray30, strArray31, strArray32, strArray33, strArray34 };
        java.lang.String[][][] strArray36 = new java.lang.String[][][] { strArray5, strArray11, strArray17, strArray23, strArray29, strArray35 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String[][]> strArrayItor37 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray36);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][]> strArrayItor38 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray36);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][]> strArrayItor41 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray36, (int) (short) 1, 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][]> strArrayItor42 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strArray36);
        org.apache.commons.collections4.ResettableIterator<java.lang.String[][][]> strArrayItor43 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strArray36);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[][]> strArrayItor46 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strArray36, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArrayItor37);
        org.junit.Assert.assertNotNull(strArrayItor38);
        org.junit.Assert.assertNotNull(strArrayItor41);
        org.junit.Assert.assertNotNull(strArrayItor42);
        org.junit.Assert.assertNotNull(strArrayItor43);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        java.lang.String[][][][][][][][][] strArray0 = null;
        java.util.ListIterator<java.lang.String[][][][][][][][][]> strArrayItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(strArray0);
        org.junit.Assert.assertNotNull(strArrayItor1);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        org.apache.commons.collections4.MapIterator<java.lang.String[][][][][][][], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][][]> strArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(strArrayItor0);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        org.apache.commons.collections4.OrderedMapIterator[][][][][][] orderedMapIteratorArray0 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][][] orderedMapIteratorArray1 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][][] orderedMapIteratorArray2 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][][][] orderedMapIteratorArray3 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][][] { orderedMapIteratorArray0, orderedMapIteratorArray1, orderedMapIteratorArray2 };
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][][]> orderedMapIteratorArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator(orderedMapIteratorArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][][]> orderedMapIteratorArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(orderedMapIteratorArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIteratorArray0);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray0, new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray1);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray1, new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray2);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray2, new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray3);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor4);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        org.apache.commons.collections4.OrderedMapIterator[][][][][][] orderedMapIteratorArray0 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {};
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][]> orderedMapIteratorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(orderedMapIteratorArray0);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][]> orderedMapIteratorArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(orderedMapIteratorArray0);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][]> orderedMapIteratorArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(orderedMapIteratorArray0, (int) (short) 0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][][]> orderedMapIteratorArrayItor5 = org.apache.commons.collections4.IteratorUtils.singletonIterator(orderedMapIteratorArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][]> orderedMapIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator(orderedMapIteratorArray0, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIteratorArray0);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray0, new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor1);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor2);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor5);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator[]> iteratorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Class<?>[][][], java.lang.String[][]> wildcardClassArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) wildcardClassArrayItor0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][]> charSequenceItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardItor1, (int) (byte) -1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClassArrayItor0);
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray5 = new org.apache.commons.collections4.iterators.ZippingIterator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[] charSequenceItorArray6 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]) zippingIteratorArray5;
        charSequenceItorArray6[0] = charSequenceItor3;
        java.util.Iterator[] iteratorArray10 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray11 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray10;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor12 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray10);
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray14 = new org.apache.commons.collections4.iterators.ZippingIterator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[] charSequenceItorArray15 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]) zippingIteratorArray14;
        charSequenceItorArray15[0] = charSequenceItor12;
        java.util.Iterator[] iteratorArray19 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray20 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray19;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor21 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray19);
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray23 = new org.apache.commons.collections4.iterators.ZippingIterator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[] charSequenceItorArray24 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]) zippingIteratorArray23;
        charSequenceItorArray24[0] = charSequenceItor21;
        org.apache.commons.collections4.iterators.ZippingIterator[][] zippingIteratorArray28 = new org.apache.commons.collections4.iterators.ZippingIterator[3][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][] charSequenceItorArray29 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]) zippingIteratorArray28;
        charSequenceItorArray29[0] = charSequenceItorArray6;
        charSequenceItorArray29[1] = charSequenceItorArray15;
        charSequenceItorArray29[2] = charSequenceItorArray24;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> charSequenceItorArrayItor36 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceItorArray29);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]> charSequenceItorArrayItor37 = org.apache.commons.collections4.IteratorUtils.singletonIterator(charSequenceItorArray29);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object[][]> objArrayItor38 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object[][]) charSequenceItorArray29);
        java.util.ListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][]> charSequenceItorArrayItor39 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceItorArray29);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(zippingIteratorArray5);
        org.junit.Assert.assertNotNull(charSequenceItorArray6);
        org.junit.Assert.assertNotNull(iteratorArray10);
        org.junit.Assert.assertArrayEquals(iteratorArray10, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray11);
        org.junit.Assert.assertArrayEquals(wildcardItorArray11, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor12);
        org.junit.Assert.assertNotNull(zippingIteratorArray14);
        org.junit.Assert.assertNotNull(charSequenceItorArray15);
        org.junit.Assert.assertNotNull(iteratorArray19);
        org.junit.Assert.assertArrayEquals(iteratorArray19, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray20);
        org.junit.Assert.assertArrayEquals(wildcardItorArray20, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor21);
        org.junit.Assert.assertNotNull(zippingIteratorArray23);
        org.junit.Assert.assertNotNull(charSequenceItorArray24);
        org.junit.Assert.assertNotNull(zippingIteratorArray28);
        org.junit.Assert.assertNotNull(charSequenceItorArray29);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor36);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor37);
        org.junit.Assert.assertNotNull(objArrayItor38);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor39);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        org.apache.commons.collections4.OrderedMapIterator[][][][][][] orderedMapIteratorArray0 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][][] orderedMapIteratorArray1 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][][] orderedMapIteratorArray2 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {};
        org.apache.commons.collections4.OrderedMapIterator[][][][][][][] orderedMapIteratorArray3 = new org.apache.commons.collections4.OrderedMapIterator[][][][][][][] { orderedMapIteratorArray0, orderedMapIteratorArray1, orderedMapIteratorArray2 };
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][][]> orderedMapIteratorArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator(orderedMapIteratorArray3);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][][]> orderedMapIteratorArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(orderedMapIteratorArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray0);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray0, new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray1);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray1, new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray2);
        org.junit.Assert.assertArrayEquals(orderedMapIteratorArray2, new org.apache.commons.collections4.OrderedMapIterator[][][][][][] {});
        org.junit.Assert.assertNotNull(orderedMapIteratorArray3);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor6);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][], org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]> charSequenceItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor0);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        org.apache.commons.collections4.OrderedMapIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>, org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]> resettableIteratorItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(resettableIteratorItorItor0);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String[][][][][][], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> strArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.io.Serializable, java.lang.CharSequence> serializableItor1 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>, org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementItor3 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[], org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray5 = new org.apache.commons.collections4.OrderedMapIterator[] { strArrayItor0, serializableItor1, objItorItor2, annotatedElementItor3, objItorArrayItor4 };
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String[][][][][][], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> strArrayItor6 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.io.Serializable, java.lang.CharSequence> serializableItor7 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>, org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor8 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementItor9 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[], org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> objItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray11 = new org.apache.commons.collections4.OrderedMapIterator[] { strArrayItor6, serializableItor7, objItorItor8, annotatedElementItor9, objItorArrayItor10 };
        org.apache.commons.collections4.OrderedMapIterator<java.lang.String[][][][][][], org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> strArrayItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.io.Serializable, java.lang.CharSequence> serializableItor13 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>, org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor14 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementItor15 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[], org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> objItorArrayItor16 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray17 = new org.apache.commons.collections4.OrderedMapIterator[] { strArrayItor12, serializableItor13, objItorItor14, annotatedElementItor15, objItorArrayItor16 };
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray18 = new org.apache.commons.collections4.OrderedMapIterator[][] { orderedMapIteratorArray5, orderedMapIteratorArray11, orderedMapIteratorArray17 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator[]> orderedMapIteratorArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(orderedMapIteratorArray18);
        java.util.Iterator<?> wildcardItor20 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) orderedMapIteratorArray18);
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator[][]> iteratorArrayItor21 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.util.Iterator[][]) orderedMapIteratorArray18);
        java.lang.Class<?> wildcardClass22 = iteratorArrayItor21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor24 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClass22, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayItor0);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(objItorItor2);
        org.junit.Assert.assertNotNull(annotatedElementItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray5);
        org.junit.Assert.assertNotNull(strArrayItor6);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(objItorItor8);
        org.junit.Assert.assertNotNull(annotatedElementItor9);
        org.junit.Assert.assertNotNull(objItorArrayItor10);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray11);
        org.junit.Assert.assertNotNull(strArrayItor12);
        org.junit.Assert.assertNotNull(serializableItor13);
        org.junit.Assert.assertNotNull(objItorItor14);
        org.junit.Assert.assertNotNull(annotatedElementItor15);
        org.junit.Assert.assertNotNull(objItorArrayItor16);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray17);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray18);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor19);
        org.junit.Assert.assertNotNull(wildcardItor20);
        org.junit.Assert.assertNotNull(iteratorArrayItor21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor1 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor1);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor1);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor3);
        org.apache.commons.collections4.MapIterator mapIterator5 = org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR;
        org.apache.commons.collections4.MapIterator[] mapIteratorArray7 = new org.apache.commons.collections4.MapIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[] serializableItorArray8 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]) mapIteratorArray7;
        serializableItorArray8[0] = serializableItor0;
        serializableItorArray8[1] = serializableItor4;
        serializableItorArray8[2] = mapIterator5;
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor15 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor16 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor17 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor16);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor18 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor16);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor19 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor18);
        org.apache.commons.collections4.MapIterator mapIterator20 = org.apache.commons.collections4.IteratorUtils.EMPTY_MAP_ITERATOR;
        org.apache.commons.collections4.MapIterator[] mapIteratorArray22 = new org.apache.commons.collections4.MapIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[] serializableItorArray23 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]) mapIteratorArray22;
        serializableItorArray23[0] = serializableItor15;
        serializableItorArray23[1] = serializableItor19;
        serializableItorArray23[2] = mapIterator20;
        org.apache.commons.collections4.MapIterator[][] mapIteratorArray31 = new org.apache.commons.collections4.MapIterator[2][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][] serializableItorArray32 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]) mapIteratorArray31;
        serializableItorArray32[0] = serializableItorArray8;
        serializableItorArray32[1] = serializableItorArray23;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> serializableItorArrayItor37 = org.apache.commons.collections4.IteratorUtils.arrayIterator(serializableItorArray32);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object[]> objArrayItor38 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[][]) serializableItorArray32);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> serializableItorArrayItor40 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray32, 0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> serializableItorArrayItor42 = org.apache.commons.collections4.IteratorUtils.arrayIterator(serializableItorArray32, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][]> serializableItorArrayItor43 = org.apache.commons.collections4.IteratorUtils.singletonIterator(serializableItorArray32);
        org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor45 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.io.Serializable[]) serializableItorArray32, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Object[]> objArrayItor47 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[][]) serializableItorArray32, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertNotNull(serializableItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(mapIterator5);
        org.junit.Assert.assertNotNull(mapIteratorArray7);
        org.junit.Assert.assertNotNull(serializableItorArray8);
        org.junit.Assert.assertNotNull(serializableItor15);
        org.junit.Assert.assertNotNull(serializableItor16);
        org.junit.Assert.assertNotNull(serializableItor17);
        org.junit.Assert.assertNotNull(serializableItor18);
        org.junit.Assert.assertNotNull(serializableItor19);
        org.junit.Assert.assertNotNull(mapIterator20);
        org.junit.Assert.assertNotNull(mapIteratorArray22);
        org.junit.Assert.assertNotNull(serializableItorArray23);
        org.junit.Assert.assertNotNull(mapIteratorArray31);
        org.junit.Assert.assertNotNull(serializableItorArray32);
        org.junit.Assert.assertNotNull(serializableItorArrayItor37);
        org.junit.Assert.assertNotNull(objArrayItor38);
        org.junit.Assert.assertNotNull(serializableItorArrayItor40);
        org.junit.Assert.assertNotNull(serializableItorArrayItor42);
        org.junit.Assert.assertNotNull(serializableItorArrayItor43);
        org.junit.Assert.assertNotNull(serializableItor45);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>> charSequenceItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray1);
        java.util.Iterator<java.util.Iterator[][]> iteratorArrayItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.Iterator[][]>[]) iteratorArray1);
        java.util.Iterator<java.lang.Class<?>[]> wildcardClassArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Class<?>[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][]> orderedMapIteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator[][][][][]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(genericDeclarationItor3);
        org.junit.Assert.assertNotNull(charSequenceItorItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(iteratorArrayItor6);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor7);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor8);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> charSequenceItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]> charSequenceItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][]>[]) iteratorArray1);
        java.util.ListIterator<java.util.Iterator[]> iteratorArrayItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][]> serializableItorArrayItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][][]> charSequenceItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(serializableItorItor5);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor6);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor7);
        org.junit.Assert.assertNotNull(iteratorArrayItor8);
        org.junit.Assert.assertNotNull(serializableItorArrayItor9);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor10);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.OrderedMapIterator[][][][][][], org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][]> orderedMapIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor0);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor2);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor2);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor2);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor5);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor6);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor8 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor9 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor8);
        java.util.Iterator<?> wildcardItor10 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) serializableItor8);
        org.apache.commons.collections4.MapIterator[] mapIteratorArray12 = new org.apache.commons.collections4.MapIterator[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[] serializableItorArray13 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]) mapIteratorArray12;
        serializableItorArray13[0] = serializableItor7;
        serializableItorArray13[1] = serializableItor8;
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> serializableItorArrayItor18 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItorArray13);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> serializableItorArrayItor19 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItorArray13);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor20 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray13);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> serializableItorArrayItor21 = org.apache.commons.collections4.IteratorUtils.singletonIterator(serializableItorArray13);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor22 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray13);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor24 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) serializableItorArray13, (int) (byte) 1);
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(serializableItor2);
        org.junit.Assert.assertNotNull(serializableItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(serializableItor5);
        org.junit.Assert.assertNotNull(serializableItor6);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(serializableItor8);
        org.junit.Assert.assertNotNull(serializableItorItor9);
        org.junit.Assert.assertNotNull(wildcardItor10);
        org.junit.Assert.assertNotNull(mapIteratorArray12);
        org.junit.Assert.assertNotNull(serializableItorArray13);
        org.junit.Assert.assertNotNull(serializableItorArrayItor18);
        org.junit.Assert.assertNotNull(serializableItorArrayItor19);
        org.junit.Assert.assertNotNull(serializableItorItor20);
        org.junit.Assert.assertNotNull(serializableItorArrayItor21);
        org.junit.Assert.assertNotNull(serializableItorItor22);
        org.junit.Assert.assertNotNull(typeItor24);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        org.apache.commons.collections4.MapIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[][], java.lang.Object> resettableIteratorItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(resettableIteratorItorArrayItor0);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[][][][][][][][]> serializableItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0, 4, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        java.lang.Class<?>[][][][][][][] wildcardClassArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][][][][][]> wildcardClassArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Class<?>[], java.lang.Object> wildcardClassArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(wildcardClassArrayItor0);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator2 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        java.util.ListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor3 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(resettableIterator2);
        java.lang.Object[] objArray6 = new java.lang.Object[] { resettableIterator0, (short) 100, resettableIteratorItor3, (byte) -1, (short) 100 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objArray6, 0, (int) (byte) 1);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor10 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor9);
        java.util.Iterator<?> wildcardItor11 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) objItor9);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray13 = new org.apache.commons.collections4.ResettableListIterator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray14 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray13;
        objItorArray14[0] = objItor9;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor17 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray14);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor18 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((org.apache.commons.collections4.ResettableIterator[]) objItorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator((org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) objItorArray14);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor20 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItorArray14);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor21 = org.apache.commons.collections4.IteratorUtils.arrayIterator((org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]) objItorArray14);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor22 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItorArray14);
        org.junit.Assert.assertNotNull(resettableIterator0);
        org.junit.Assert.assertNotNull(resettableIterator2);
        org.junit.Assert.assertNotNull(resettableIteratorItor3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objItor9);
        org.junit.Assert.assertNotNull(objItorItor10);
        org.junit.Assert.assertNotNull(wildcardItor11);
        org.junit.Assert.assertNotNull(resettableListIteratorArray13);
        org.junit.Assert.assertNotNull(objItorArray14);
        org.junit.Assert.assertNotNull(objItorItor17);
        org.junit.Assert.assertNotNull(resettableIteratorItor18);
        org.junit.Assert.assertNotNull(objItorItor19);
        org.junit.Assert.assertNotNull(objItorArrayItor20);
        org.junit.Assert.assertNotNull(objItorItor21);
        org.junit.Assert.assertNotNull(objItorArrayItor22);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][], org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray2 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor0, objItorArrayItor1 };
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][], org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray5 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor3, objItorArrayItor4 };
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][], org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray8 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor6, objItorArrayItor7 };
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor9 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][], org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorArrayItor10 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray11 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor9, objItorArrayItor10 };
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor12 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][], org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorArrayItor13 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray14 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor12, objItorArrayItor13 };
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[], java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>> serializableItorArrayItor15 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][], org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorArrayItor16 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray17 = new org.apache.commons.collections4.OrderedMapIterator[] { serializableItorArrayItor15, objItorArrayItor16 };
        org.apache.commons.collections4.OrderedMapIterator[][] orderedMapIteratorArray18 = new org.apache.commons.collections4.OrderedMapIterator[][] { orderedMapIteratorArray2, orderedMapIteratorArray5, orderedMapIteratorArray8, orderedMapIteratorArray11, orderedMapIteratorArray14, orderedMapIteratorArray17 };
        java.util.ListIterator<org.apache.commons.collections4.OrderedMapIterator[][]> orderedMapIteratorArrayItor19 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(orderedMapIteratorArray18);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor20 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) orderedMapIteratorArray18);
        java.util.ListIterator<org.apache.commons.collections4.OrderedMapIterator[][]> orderedMapIteratorArrayItor21 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(orderedMapIteratorArray18);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor22 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) orderedMapIteratorArray18);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[]> orderedMapIteratorArrayItor23 = org.apache.commons.collections4.IteratorUtils.arrayIterator(orderedMapIteratorArray18);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[]> orderedMapIteratorArrayItor25 = org.apache.commons.collections4.IteratorUtils.arrayIterator(orderedMapIteratorArray18, 2);
        org.junit.Assert.assertNotNull(serializableItorArrayItor0);
        org.junit.Assert.assertNotNull(objItorArrayItor1);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray2);
        org.junit.Assert.assertNotNull(serializableItorArrayItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray5);
        org.junit.Assert.assertNotNull(serializableItorArrayItor6);
        org.junit.Assert.assertNotNull(objItorArrayItor7);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray8);
        org.junit.Assert.assertNotNull(serializableItorArrayItor9);
        org.junit.Assert.assertNotNull(objItorArrayItor10);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray11);
        org.junit.Assert.assertNotNull(serializableItorArrayItor12);
        org.junit.Assert.assertNotNull(objItorArrayItor13);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray14);
        org.junit.Assert.assertNotNull(serializableItorArrayItor15);
        org.junit.Assert.assertNotNull(objItorArrayItor16);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray17);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray18);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor19);
        org.junit.Assert.assertNotNull(objItor20);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor21);
        org.junit.Assert.assertNotNull(serializableItorItor22);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor23);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor25);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor0);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor1);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor3 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor3);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor5 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor4);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor6 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor6);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor8 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor9 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor8);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor10 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItor9);
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor11 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]> serializableItor12 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(serializableItor11);
        org.apache.commons.collections4.MapIterator[] mapIteratorArray14 = new org.apache.commons.collections4.MapIterator[5];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[] serializableItorArray15 = (org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]) mapIteratorArray14;
        serializableItorArray15[0] = serializableItor1;
        serializableItorArray15[1] = serializableItor4;
        serializableItorArray15[2] = serializableItor6;
        serializableItorArray15[3] = serializableItor9;
        serializableItorArray15[4] = serializableItor11;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor28 = org.apache.commons.collections4.IteratorUtils.arrayIterator(serializableItorArray15, (int) (byte) 0, 0);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> serializableItorArrayItor29 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(serializableItorArray15);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray15, 4);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> serializableItorArrayItor32 = org.apache.commons.collections4.IteratorUtils.singletonIterator(serializableItorArray15);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>[]> serializableItorArrayItor33 = org.apache.commons.collections4.IteratorUtils.singletonIterator(serializableItorArray15);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.Object[]>> serializableItorItor34 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(serializableItorArray15);
        org.junit.Assert.assertNotNull(serializableItor0);
        org.junit.Assert.assertNotNull(serializableItor1);
        org.junit.Assert.assertNotNull(serializableItorItor2);
        org.junit.Assert.assertNotNull(serializableItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(serializableItorItor5);
        org.junit.Assert.assertNotNull(serializableItor6);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(serializableItor8);
        org.junit.Assert.assertNotNull(serializableItor9);
        org.junit.Assert.assertNotNull(serializableItorItor10);
        org.junit.Assert.assertNotNull(serializableItor11);
        org.junit.Assert.assertNotNull(serializableItor12);
        org.junit.Assert.assertNotNull(mapIteratorArray14);
        org.junit.Assert.assertNotNull(serializableItorArray15);
        org.junit.Assert.assertNotNull(serializableItorItor28);
        org.junit.Assert.assertNotNull(serializableItorArrayItor29);
        org.junit.Assert.assertNotNull(serializableItorItor31);
        org.junit.Assert.assertNotNull(serializableItorArrayItor32);
        org.junit.Assert.assertNotNull(serializableItorArrayItor33);
        org.junit.Assert.assertNotNull(serializableItorItor34);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>> charSequenceItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableIterator>[]) iteratorArray1);
        java.util.Iterator<java.lang.Class<?>> wildcardClassItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Class<?>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator[]> orderedMapIteratorArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator[]>[]) iteratorArray1);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Comparable<java.lang.String>>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[][][][][][][]> strArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strComparableItor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(genericDeclarationItor3);
        org.junit.Assert.assertNotNull(charSequenceItorItor4);
        org.junit.Assert.assertNotNull(resettableIteratorItor5);
        org.junit.Assert.assertNotNull(wildcardClassItor6);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor7);
        org.junit.Assert.assertNotNull(strComparableItor8);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.CharSequence>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1;
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.Object[]> objArrayItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.Object[]>[]) iteratorArray1);
        java.util.Iterator<java.util.Iterator[]> iteratorArrayItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.Iterator[]>[]) iteratorArray1);
        java.util.Iterator<java.util.Iterator[][]> iteratorArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.util.Iterator[][]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][][]> charSequenceItorArrayItor8 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][][][][]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(charSequenceItor3);
        org.junit.Assert.assertNotNull(objItorArrayItor4);
        org.junit.Assert.assertNotNull(objArrayItor5);
        org.junit.Assert.assertNotNull(iteratorArrayItor6);
        org.junit.Assert.assertNotNull(iteratorArrayItor7);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor8);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
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
        java.lang.Class[][] classArray16 = new java.lang.Class[5][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray17 = (java.lang.Class<?>[][]) classArray16;
        wildcardClassArray17[0] = classArray1;
        wildcardClassArray17[1] = wildcardClassArray5;
        wildcardClassArray17[2] = classArray7;
        wildcardClassArray17[3] = classArray10;
        wildcardClassArray17[4] = wildcardClassArray14;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[]> wildcardClassArrayItor28 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray17);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor29 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray17);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[][]> wildcardClassArrayItor30 = org.apache.commons.collections4.IteratorUtils.singletonIterator(wildcardClassArray17);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[]> wildcardClassArrayItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray17);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[]> charSequenceItorArrayItor32 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardClassArray17);
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray17);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement[][]> annotatedElementArrayItor34 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.reflect.AnnotatedElement[][]) wildcardClassArray17);
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
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor28);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor29);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor30);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor31);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor32);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor33);
        org.junit.Assert.assertNotNull(annotatedElementArrayItor34);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        org.apache.commons.collections4.ResettableListIterator resettableListIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor1 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor2);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor4 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor2);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray6 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray7 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray6;
        objItorArray7[0] = resettableListIterator0;
        objItorArray7[1] = objItor1;
        objItorArray7[2] = objItor2;
        org.apache.commons.collections4.ResettableListIterator resettableListIterator14 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor15 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor16 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor17 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor16);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor18 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor16);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray20 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray21 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray20;
        objItorArray21[0] = resettableListIterator14;
        objItorArray21[1] = objItor15;
        objItorArray21[2] = objItor16;
        org.apache.commons.collections4.ResettableListIterator resettableListIterator28 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor29 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor30 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor31 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor30);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor32 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor30);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray34 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray35 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray34;
        objItorArray35[0] = resettableListIterator28;
        objItorArray35[1] = objItor29;
        objItorArray35[2] = objItor30;
        org.apache.commons.collections4.ResettableListIterator resettableListIterator42 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor43 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor44 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor45 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItor44);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>> objItorItor46 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItor44);
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray48 = new org.apache.commons.collections4.ResettableListIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[] objItorArray49 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]) resettableListIteratorArray48;
        objItorArray49[0] = resettableListIterator42;
        objItorArray49[1] = objItor43;
        objItorArray49[2] = objItor44;
        org.apache.commons.collections4.ResettableListIterator[][] resettableListIteratorArray57 = new org.apache.commons.collections4.ResettableListIterator[4][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][] objItorArray58 = (org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]) resettableListIteratorArray57;
        objItorArray58[0] = objItorArray7;
        objItorArray58[1] = objItorArray21;
        objItorArray58[2] = objItorArray35;
        objItorArray58[3] = objItorArray49;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor67 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray58);
        java.util.ListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor68 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(objItorArray58);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object[]> objArrayItor69 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) objItorArray58);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[]> objItorArrayItor71 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray58, 0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.Object>[][]> objItorArrayItor72 = org.apache.commons.collections4.IteratorUtils.singletonIterator(objItorArray58);
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator[][]> iteratorArrayItor73 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.util.Iterator[][]) objItorArray58);
        org.apache.commons.collections4.ResettableIterator<java.util.Iterator[]> iteratorArrayItor74 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.util.Iterator[][]) objItorArray58);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>[]> objItorArrayItor76 = org.apache.commons.collections4.IteratorUtils.arrayIterator((org.apache.commons.collections4.OrderedIterator<java.lang.Object>[][]) objItorArray58, (int) (short) 0);
        org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator<org.apache.commons.collections4.ResettableIterator>[][][]> resettableIteratorItorArrayItor77 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorArray58);
        org.junit.Assert.assertNotNull(resettableListIterator0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItorItor3);
        org.junit.Assert.assertNotNull(objItorItor4);
        org.junit.Assert.assertNotNull(resettableListIteratorArray6);
        org.junit.Assert.assertNotNull(objItorArray7);
        org.junit.Assert.assertNotNull(resettableListIterator14);
        org.junit.Assert.assertNotNull(objItor15);
        org.junit.Assert.assertNotNull(objItor16);
        org.junit.Assert.assertNotNull(objItorItor17);
        org.junit.Assert.assertNotNull(objItorItor18);
        org.junit.Assert.assertNotNull(resettableListIteratorArray20);
        org.junit.Assert.assertNotNull(objItorArray21);
        org.junit.Assert.assertNotNull(resettableListIterator28);
        org.junit.Assert.assertNotNull(objItor29);
        org.junit.Assert.assertNotNull(objItor30);
        org.junit.Assert.assertNotNull(objItorItor31);
        org.junit.Assert.assertNotNull(objItorItor32);
        org.junit.Assert.assertNotNull(resettableListIteratorArray34);
        org.junit.Assert.assertNotNull(objItorArray35);
        org.junit.Assert.assertNotNull(resettableListIterator42);
        org.junit.Assert.assertNotNull(objItor43);
        org.junit.Assert.assertNotNull(objItor44);
        org.junit.Assert.assertNotNull(objItorItor45);
        org.junit.Assert.assertNotNull(objItorItor46);
        org.junit.Assert.assertNotNull(resettableListIteratorArray48);
        org.junit.Assert.assertNotNull(objItorArray49);
        org.junit.Assert.assertNotNull(resettableListIteratorArray57);
        org.junit.Assert.assertNotNull(objItorArray58);
        org.junit.Assert.assertNotNull(objItorArrayItor67);
        org.junit.Assert.assertNotNull(objItorArrayItor68);
        org.junit.Assert.assertNotNull(objArrayItor69);
        org.junit.Assert.assertNotNull(objItorArrayItor71);
        org.junit.Assert.assertNotNull(objItorArrayItor72);
        org.junit.Assert.assertNotNull(iteratorArrayItor73);
        org.junit.Assert.assertNotNull(iteratorArrayItor74);
        org.junit.Assert.assertNotNull(objItorArrayItor76);
        org.junit.Assert.assertNotNull(resettableIteratorItorArrayItor77);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1;
        java.util.Iterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>> charSequenceItorItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator[][]> orderedMapIteratorArrayItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator[][]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][]> charSequenceItorArrayItor6 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence>[][][][][][]>[]) iteratorArray1);
        java.util.Iterator<?> wildcardItor7 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) charSequenceItorArrayItor6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator[][][]> orderedMapIteratorArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) charSequenceItorArrayItor6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(genericDeclarationItor3);
        org.junit.Assert.assertNotNull(charSequenceItorItor4);
        org.junit.Assert.assertNotNull(orderedMapIteratorArrayItor5);
        org.junit.Assert.assertNotNull(charSequenceItorArrayItor6);
        org.junit.Assert.assertNotNull(wildcardItor7);
    }
}

