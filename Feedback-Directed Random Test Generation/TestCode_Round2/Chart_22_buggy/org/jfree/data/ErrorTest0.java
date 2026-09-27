package org.jfree.data;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = keyedObjects2D0.clone();
        java.util.List list25 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj24", keyedObjects2D0.equals(obj24) ? keyedObjects2D0.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        java.lang.Object obj8 = keyedObjects2D0.clone();
        int int10 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj8", keyedObjects2D0.equals(obj8) ? keyedObjects2D0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D19.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj26 = keyedObjects2D19.getObject(0, 0);
        java.lang.Object obj27 = keyedObjects2D19.clone();
        boolean boolean28 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D6 and keyedObjects2D19", keyedObjects2D6.equals(keyedObjects2D19) ? keyedObjects2D6.hashCode() == keyedObjects2D19.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        java.lang.Object obj29 = keyedObjects2D0.clone();
        java.util.List list30 = keyedObjects2D0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj29", keyedObjects2D0.equals(obj29) ? keyedObjects2D0.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        java.lang.Object obj29 = keyedObjects2D0.clone();
        int int30 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj29", keyedObjects2D0.equals(obj29) ? keyedObjects2D0.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        java.lang.Object obj8 = keyedObjects2D0.clone();
        int int9 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj8", keyedObjects2D0.equals(obj8) ? keyedObjects2D0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        int int26 = keyedObjects2D24.getColumnIndex((java.lang.Comparable) 0.0d);
        int int28 = keyedObjects2D24.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj29 = keyedObjects2D24.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D30.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int36 = keyedObjects2D30.getColumnIndex((java.lang.Comparable) 0L);
        int int37 = keyedObjects2D30.getRowCount();
        keyedObjects2D24.setObject((java.lang.Object) int37, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int42 = keyedObjects2D24.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D43 = new org.jfree.data.KeyedObjects2D();
        java.util.List list44 = keyedObjects2D43.getRowKeys();
        keyedObjects2D24.setObject((java.lang.Object) keyedObjects2D43, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj48 = keyedObjects2D24.clone();
        keyedObjects2D19.setObject((java.lang.Object) keyedObjects2D24, (java.lang.Comparable) false, (java.lang.Comparable) 2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D6 and keyedObjects2D30", keyedObjects2D6.equals(keyedObjects2D30) ? keyedObjects2D6.hashCode() == keyedObjects2D30.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        keyedObjects2D0.removeObject((java.lang.Comparable) 10.0d, (java.lang.Comparable) 1.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) 100, (java.lang.Comparable) '#');
        java.lang.Object obj14 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass15 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj14", keyedObjects2D0.equals(obj14) ? keyedObjects2D0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        java.lang.Object obj29 = keyedObjects2D0.clone();
        java.util.List list30 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj29", keyedObjects2D0.equals(obj29) ? keyedObjects2D0.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D0.removeRow((int) (short) 0);
        java.lang.Object obj31 = keyedObjects2D0.clone();
        int int32 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj31", keyedObjects2D0.equals(obj31) ? keyedObjects2D0.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        int int29 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        int int32 = keyedObjects2D30.getColumnIndex((java.lang.Comparable) 0.0d);
        int int34 = keyedObjects2D30.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj35 = keyedObjects2D30.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D36.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int42 = keyedObjects2D36.getColumnIndex((java.lang.Comparable) 0L);
        int int43 = keyedObjects2D36.getRowCount();
        keyedObjects2D30.setObject((java.lang.Object) int43, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int48 = keyedObjects2D30.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D49 = new org.jfree.data.KeyedObjects2D();
        java.util.List list50 = keyedObjects2D49.getRowKeys();
        keyedObjects2D30.setObject((java.lang.Object) keyedObjects2D49, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj54 = null;
        boolean boolean55 = keyedObjects2D30.equals(obj54);
        keyedObjects2D30.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        int int59 = keyedObjects2D30.getRowCount();
        boolean boolean60 = keyedObjects2D0.equals((java.lang.Object) int59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and keyedObjects2D30", keyedObjects2D0.equals(keyedObjects2D30) ? keyedObjects2D0.hashCode() == keyedObjects2D30.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int5 = keyedObjects2D0.getColumnCount();
        java.util.List list6 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list12 = keyedObjects2D7.getRowKeys();
        int int13 = keyedObjects2D7.getRowCount();
        java.util.List list14 = keyedObjects2D7.getColumnKeys();
        keyedObjects2D7.addObject((java.lang.Object) 10.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0f);
        int int20 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 1.0f);
        java.lang.Object obj21 = keyedObjects2D7.clone();
        keyedObjects2D0.setObject(obj21, (java.lang.Comparable) 1.0f, (java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D7 and obj21", keyedObjects2D7.equals(obj21) ? keyedObjects2D7.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = keyedObjects2D19.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D25.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list30 = keyedObjects2D25.getRowKeys();
        int int31 = keyedObjects2D25.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D32.addObject((java.lang.Object) keyedObjects2D33, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj37 = keyedObjects2D33.clone();
        int int38 = keyedObjects2D33.getColumnCount();
        int int40 = keyedObjects2D33.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean41 = keyedObjects2D25.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable43 = keyedObjects2D25.getColumnKey((int) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D44 = new org.jfree.data.KeyedObjects2D();
        int int46 = keyedObjects2D44.getColumnIndex((java.lang.Comparable) 0.0d);
        int int48 = keyedObjects2D44.getRowIndex((java.lang.Comparable) 'a');
        int int50 = keyedObjects2D44.getRowIndex((java.lang.Comparable) '4');
        keyedObjects2D25.addObject((java.lang.Object) int50, (java.lang.Comparable) '4', (java.lang.Comparable) 'a');
        boolean boolean54 = keyedObjects2D19.equals((java.lang.Object) keyedObjects2D25);
        org.jfree.data.KeyedObjects2D keyedObjects2D55 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D56 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D55.addObject((java.lang.Object) keyedObjects2D56, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj60 = keyedObjects2D56.clone();
        int int62 = keyedObjects2D56.getRowIndex((java.lang.Comparable) false);
        int int63 = keyedObjects2D56.getColumnCount();
        keyedObjects2D19.addObject((java.lang.Object) int63, (java.lang.Comparable) (short) 1, (java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D32 and keyedObjects2D55", keyedObjects2D32.equals(keyedObjects2D55) ? keyedObjects2D32.hashCode() == keyedObjects2D55.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj13 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int21 = keyedObjects2D14.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int21, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int26 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.util.List list28 = keyedObjects2D27.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj32 = null;
        boolean boolean33 = keyedObjects2D8.equals(obj32);
        keyedObjects2D8.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D8.removeRow((int) (short) 0);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 100L);
        keyedObjects2D8.addObject((java.lang.Object) ' ', (java.lang.Comparable) "hi!", (java.lang.Comparable) 2);
        org.jfree.data.KeyedObjects2D keyedObjects2D46 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D46.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj53 = keyedObjects2D46.getObject(0, 0);
        keyedObjects2D46.removeObject((java.lang.Comparable) 10.0d, (java.lang.Comparable) 1.0f);
        keyedObjects2D46.removeObject((java.lang.Comparable) 100, (java.lang.Comparable) '#');
        java.lang.Object obj60 = keyedObjects2D46.clone();
        boolean boolean61 = keyedObjects2D8.equals(obj60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D46 and obj60", keyedObjects2D46.equals(obj60) ? keyedObjects2D46.hashCode() == obj60.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj12 = keyedObjects2D8.clone();
        int int13 = keyedObjects2D8.getColumnCount();
        int int15 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean16 = keyedObjects2D0.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable18 = keyedObjects2D0.getColumnKey((int) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0.0d);
        int int23 = keyedObjects2D19.getRowIndex((java.lang.Comparable) 'a');
        int int25 = keyedObjects2D19.getRowIndex((java.lang.Comparable) '4');
        keyedObjects2D0.addObject((java.lang.Object) int25, (java.lang.Comparable) '4', (java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D32.addObject((java.lang.Object) keyedObjects2D33, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj37 = keyedObjects2D33.clone();
        keyedObjects2D0.addObject(obj37, (java.lang.Comparable) 1.0d, (java.lang.Comparable) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D7 and keyedObjects2D32", keyedObjects2D7.equals(keyedObjects2D32) ? keyedObjects2D7.hashCode() == keyedObjects2D32.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.addObject((java.lang.Object) keyedObjects2D9, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj13 = keyedObjects2D9.clone();
        keyedObjects2D9.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj18 = null;
        boolean boolean19 = keyedObjects2D9.equals(obj18);
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) boolean19);
        int int21 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        int int24 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 0.0d);
        int int26 = keyedObjects2D22.getRowIndex((java.lang.Comparable) 'a');
        int int28 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 10.0d);
        int int29 = keyedObjects2D22.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D30.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D30.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D22.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        keyedObjects2D22.setObject((java.lang.Object) 1, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1));
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D22, (java.lang.Comparable) (-1L), (java.lang.Comparable) (-1.0f));
        org.jfree.data.KeyedObjects2D keyedObjects2D48 = new org.jfree.data.KeyedObjects2D();
        int int50 = keyedObjects2D48.getColumnIndex((java.lang.Comparable) 0.0d);
        int int52 = keyedObjects2D48.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj53 = keyedObjects2D48.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D54 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D54.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int60 = keyedObjects2D54.getColumnIndex((java.lang.Comparable) 0L);
        int int61 = keyedObjects2D54.getRowCount();
        keyedObjects2D48.setObject((java.lang.Object) int61, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int66 = keyedObjects2D48.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D67 = new org.jfree.data.KeyedObjects2D();
        java.util.List list68 = keyedObjects2D67.getRowKeys();
        keyedObjects2D48.setObject((java.lang.Object) keyedObjects2D67, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj72 = null;
        boolean boolean73 = keyedObjects2D48.equals(obj72);
        keyedObjects2D48.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        java.lang.Object obj77 = keyedObjects2D48.clone();
        keyedObjects2D22.addObject((java.lang.Object) keyedObjects2D48, (java.lang.Comparable) 2, (java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D48 and obj77", keyedObjects2D48.equals(obj77) ? keyedObjects2D48.hashCode() == obj77.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int8 = keyedObjects2D0.getRowCount();
        int int9 = keyedObjects2D0.getRowCount();
        java.lang.Object obj10 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = new org.jfree.data.KeyedObjects2D();
        java.util.List list12 = keyedObjects2D11.getRowKeys();
        java.lang.Object obj13 = keyedObjects2D11.clone();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        boolean boolean15 = keyedObjects2D0.equals(obj13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj10", keyedObjects2D0.equals(obj10) ? keyedObjects2D0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        int int29 = keyedObjects2D0.getRowCount();
        int int30 = keyedObjects2D0.getRowCount();
        java.lang.Object obj31 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass32 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj31", keyedObjects2D0.equals(obj31) ? keyedObjects2D0.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        keyedObjects2D1.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        keyedObjects2D1.removeObject((java.lang.Comparable) 100, (java.lang.Comparable) (short) 100);
        int int14 = keyedObjects2D1.getRowIndex((java.lang.Comparable) "");
        java.lang.Object obj15 = keyedObjects2D1.clone();
        java.lang.Object obj16 = keyedObjects2D1.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D1 and obj15", keyedObjects2D1.equals(obj15) ? keyedObjects2D1.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        java.lang.Object obj20 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        int int22 = keyedObjects2D21.getRowCount();
        int int24 = keyedObjects2D21.getRowIndex((java.lang.Comparable) (byte) -1);
        java.util.List list25 = keyedObjects2D21.getRowKeys();
        java.lang.Object obj26 = keyedObjects2D21.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        int int29 = keyedObjects2D27.getColumnIndex((java.lang.Comparable) 0.0d);
        int int31 = keyedObjects2D27.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj32 = keyedObjects2D27.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D33.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int39 = keyedObjects2D33.getColumnIndex((java.lang.Comparable) 0L);
        int int40 = keyedObjects2D33.getRowCount();
        keyedObjects2D27.setObject((java.lang.Object) int40, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int45 = keyedObjects2D27.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D46 = new org.jfree.data.KeyedObjects2D();
        java.util.List list47 = keyedObjects2D46.getRowKeys();
        keyedObjects2D27.setObject((java.lang.Object) keyedObjects2D46, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj51 = null;
        boolean boolean52 = keyedObjects2D27.equals(obj51);
        keyedObjects2D27.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D27.removeRow((int) (short) 0);
        java.util.List list58 = keyedObjects2D27.getColumnKeys();
        java.util.List list59 = keyedObjects2D27.getColumnKeys();
        keyedObjects2D21.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        keyedObjects2D27.removeColumn((int) (short) 1);
        java.util.List list65 = keyedObjects2D27.getColumnKeys();
        keyedObjects2D8.addObject((java.lang.Object) list65, (java.lang.Comparable) 100L, (java.lang.Comparable) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj20 and keyedObjects2D33", obj20.equals(keyedObjects2D33) ? obj20.hashCode() == keyedObjects2D33.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        java.lang.Object obj8 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D9.addObject((java.lang.Object) keyedObjects2D10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj14 = keyedObjects2D10.clone();
        keyedObjects2D10.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        int int19 = keyedObjects2D10.getColumnCount();
        keyedObjects2D0.addObject((java.lang.Object) int19, (java.lang.Comparable) 1L, (java.lang.Comparable) 3);
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = new org.jfree.data.KeyedObjects2D();
        int int25 = keyedObjects2D23.getColumnIndex((java.lang.Comparable) 0.0d);
        int int27 = keyedObjects2D23.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj28 = keyedObjects2D23.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D29.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int35 = keyedObjects2D29.getColumnIndex((java.lang.Comparable) 0L);
        int int36 = keyedObjects2D29.getRowCount();
        keyedObjects2D23.setObject((java.lang.Object) int36, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int41 = keyedObjects2D23.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        java.util.List list43 = keyedObjects2D42.getRowKeys();
        keyedObjects2D23.setObject((java.lang.Object) keyedObjects2D42, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D47 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D48 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D47.addObject((java.lang.Object) keyedObjects2D48, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int52 = keyedObjects2D48.getRowCount();
        boolean boolean53 = keyedObjects2D23.equals((java.lang.Object) int52);
        org.jfree.data.KeyedObjects2D keyedObjects2D54 = new org.jfree.data.KeyedObjects2D();
        int int55 = keyedObjects2D54.getRowCount();
        boolean boolean57 = keyedObjects2D54.equals((java.lang.Object) 10.0d);
        keyedObjects2D23.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean62 = keyedObjects2D23.equals((java.lang.Object) 10L);
        org.jfree.data.KeyedObjects2D keyedObjects2D63 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D63.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D63.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        java.util.List list71 = keyedObjects2D63.getColumnKeys();
        keyedObjects2D23.addObject((java.lang.Object) keyedObjects2D63, (java.lang.Comparable) true, (java.lang.Comparable) (short) 0);
        int int76 = keyedObjects2D63.getColumnIndex((java.lang.Comparable) '#');
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D63, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and keyedObjects2D29", obj8.equals(keyedObjects2D29) ? obj8.hashCode() == keyedObjects2D29.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Comparable comparable6 = keyedObjects2D0.getRowKey(0);
        java.lang.Object obj7 = keyedObjects2D0.clone();
        int int9 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj7", keyedObjects2D0.equals(obj7) ? keyedObjects2D0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D24.addObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int29 = keyedObjects2D25.getRowCount();
        boolean boolean30 = keyedObjects2D0.equals((java.lang.Object) int29);
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        int int32 = keyedObjects2D31.getRowCount();
        boolean boolean34 = keyedObjects2D31.equals((java.lang.Object) 10.0d);
        keyedObjects2D0.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean39 = keyedObjects2D0.equals((java.lang.Object) 10L);
        keyedObjects2D0.removeRow((java.lang.Comparable) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        int int44 = keyedObjects2D42.getColumnIndex((java.lang.Comparable) 0.0d);
        int int46 = keyedObjects2D42.getRowIndex((java.lang.Comparable) 'a');
        int int48 = keyedObjects2D42.getColumnIndex((java.lang.Comparable) 10.0d);
        int int49 = keyedObjects2D42.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D50 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D50.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D50.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D42.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D61 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D62 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D61.addObject((java.lang.Object) keyedObjects2D62, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj66 = keyedObjects2D62.clone();
        int int67 = keyedObjects2D62.getColumnCount();
        java.lang.Object obj68 = keyedObjects2D62.clone();
        java.util.List list69 = keyedObjects2D62.getRowKeys();
        boolean boolean70 = keyedObjects2D42.equals((java.lang.Object) keyedObjects2D62);
        int int71 = keyedObjects2D42.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D42, (java.lang.Comparable) 3, (java.lang.Comparable) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D24 and keyedObjects2D61", keyedObjects2D24.equals(keyedObjects2D61) ? keyedObjects2D24.hashCode() == keyedObjects2D61.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        keyedObjects2D0.removeObject((java.lang.Comparable) 10.0d, (java.lang.Comparable) 1.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) 100, (java.lang.Comparable) '#');
        java.lang.Object obj14 = keyedObjects2D0.clone();
        int int16 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj14", keyedObjects2D0.equals(obj14) ? keyedObjects2D0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D0.removeRow((int) (short) 0);
        java.util.List list31 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = new org.jfree.data.KeyedObjects2D();
        int int34 = keyedObjects2D32.getColumnIndex((java.lang.Comparable) 0.0d);
        int int36 = keyedObjects2D32.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj37 = keyedObjects2D32.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D38 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D38.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int44 = keyedObjects2D38.getColumnIndex((java.lang.Comparable) 0L);
        int int45 = keyedObjects2D38.getRowCount();
        keyedObjects2D32.setObject((java.lang.Object) int45, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int50 = keyedObjects2D32.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D51 = new org.jfree.data.KeyedObjects2D();
        java.util.List list52 = keyedObjects2D51.getRowKeys();
        keyedObjects2D32.setObject((java.lang.Object) keyedObjects2D51, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj56 = null;
        boolean boolean57 = keyedObjects2D32.equals(obj56);
        keyedObjects2D32.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        int int61 = keyedObjects2D32.getRowCount();
        int int62 = keyedObjects2D32.getRowCount();
        java.lang.Object obj63 = keyedObjects2D32.clone();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D32, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D6 and keyedObjects2D38", keyedObjects2D6.equals(keyedObjects2D38) ? keyedObjects2D6.hashCode() == keyedObjects2D38.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        java.util.List list21 = keyedObjects2D20.getRowKeys();
        java.lang.Object obj22 = keyedObjects2D20.clone();
        keyedObjects2D0.setObject(obj22, (java.lang.Comparable) false, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        int int28 = keyedObjects2D26.getColumnIndex((java.lang.Comparable) 0.0d);
        int int30 = keyedObjects2D26.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D26.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list34 = keyedObjects2D26.getColumnKeys();
        keyedObjects2D26.removeObject((java.lang.Comparable) 'a', (java.lang.Comparable) 0.0f);
        boolean boolean38 = keyedObjects2D0.equals((java.lang.Object) 'a');
        org.jfree.data.KeyedObjects2D keyedObjects2D39 = new org.jfree.data.KeyedObjects2D();
        int int41 = keyedObjects2D39.getColumnIndex((java.lang.Comparable) 0.0d);
        int int43 = keyedObjects2D39.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj44 = keyedObjects2D39.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D45 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D45.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int51 = keyedObjects2D45.getColumnIndex((java.lang.Comparable) 0L);
        int int52 = keyedObjects2D45.getRowCount();
        keyedObjects2D39.setObject((java.lang.Object) int52, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int57 = keyedObjects2D39.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D58 = new org.jfree.data.KeyedObjects2D();
        java.util.List list59 = keyedObjects2D58.getRowKeys();
        keyedObjects2D39.setObject((java.lang.Object) keyedObjects2D58, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj63 = null;
        boolean boolean64 = keyedObjects2D39.equals(obj63);
        keyedObjects2D39.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        int int68 = keyedObjects2D39.getRowCount();
        java.lang.Object obj69 = keyedObjects2D39.clone();
        keyedObjects2D0.setObject(obj69, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D8 and keyedObjects2D45", keyedObjects2D8.equals(keyedObjects2D45) ? keyedObjects2D8.hashCode() == keyedObjects2D45.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list3 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = new org.jfree.data.KeyedObjects2D();
        int int6 = keyedObjects2D4.getColumnIndex((java.lang.Comparable) 0.0d);
        int int8 = keyedObjects2D4.getRowIndex((java.lang.Comparable) 'a');
        int int10 = keyedObjects2D4.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list11 = keyedObjects2D4.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) list11, (java.lang.Comparable) 100L, (java.lang.Comparable) 0);
        java.lang.Object obj15 = keyedObjects2D0.clone();
        java.util.List list16 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj15", keyedObjects2D0.equals(obj15) ? keyedObjects2D0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = keyedObjects2D0.clone();
        int int26 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj24", keyedObjects2D0.equals(obj24) ? keyedObjects2D0.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) 10.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0f);
        int int13 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.lang.Object obj14 = keyedObjects2D0.clone();
        java.util.List list15 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj14", keyedObjects2D0.equals(obj14) ? keyedObjects2D0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        java.util.List list8 = keyedObjects2D7.getRowKeys();
        java.lang.Object obj9 = keyedObjects2D7.clone();
        boolean boolean10 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        java.lang.Object obj11 = null;
        keyedObjects2D0.setObject(obj11, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (short) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        int int17 = keyedObjects2D15.getColumnIndex((java.lang.Comparable) 0.0d);
        int int19 = keyedObjects2D15.getRowIndex((java.lang.Comparable) 'a');
        int int21 = keyedObjects2D15.getColumnIndex((java.lang.Comparable) 10.0d);
        int int22 = keyedObjects2D15.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D23.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D23.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D15.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        keyedObjects2D15.setObject((java.lang.Object) 1, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1));
        keyedObjects2D15.removeRow(0);
        java.lang.Object obj40 = keyedObjects2D15.clone();
        keyedObjects2D0.setObject(obj40, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D15 and obj40", keyedObjects2D15.equals(obj40) ? keyedObjects2D15.hashCode() == obj40.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0.0d);
        int int23 = keyedObjects2D19.getRowIndex((java.lang.Comparable) 'a');
        int int25 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 10.0d);
        int int26 = keyedObjects2D19.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) int26, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1L));
        int int31 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list32 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        int int35 = keyedObjects2D33.getColumnIndex((java.lang.Comparable) 0.0d);
        int int37 = keyedObjects2D33.getRowIndex((java.lang.Comparable) 'a');
        int int39 = keyedObjects2D33.getColumnIndex((java.lang.Comparable) 10.0d);
        int int40 = keyedObjects2D33.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D41 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D41.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D41.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D33.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D52 = new org.jfree.data.KeyedObjects2D();
        int int54 = keyedObjects2D52.getColumnIndex((java.lang.Comparable) 0.0d);
        int int56 = keyedObjects2D52.getRowIndex((java.lang.Comparable) 'a');
        int int58 = keyedObjects2D52.getColumnIndex((java.lang.Comparable) 10.0d);
        int int59 = keyedObjects2D52.getColumnCount();
        keyedObjects2D33.setObject((java.lang.Object) int59, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1L));
        int int64 = keyedObjects2D33.getColumnIndex((java.lang.Comparable) 1.0d);
        keyedObjects2D33.removeRow((int) (short) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D67 = new org.jfree.data.KeyedObjects2D();
        int int69 = keyedObjects2D67.getColumnIndex((java.lang.Comparable) 0.0d);
        int int71 = keyedObjects2D67.getRowIndex((java.lang.Comparable) 'a');
        int int73 = keyedObjects2D67.getRowIndex((java.lang.Comparable) '4');
        java.util.List list74 = keyedObjects2D67.getRowKeys();
        keyedObjects2D33.setObject((java.lang.Object) keyedObjects2D67, (java.lang.Comparable) 100, (java.lang.Comparable) (-1.0d));
        int int78 = keyedObjects2D67.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) int78, (java.lang.Comparable) 1.0f, (java.lang.Comparable) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D8 and keyedObjects2D41", keyedObjects2D8.equals(keyedObjects2D41) ? keyedObjects2D8.hashCode() == keyedObjects2D41.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        keyedObjects2D0.setObject((java.lang.Object) (byte) -1, (java.lang.Comparable) ' ', (java.lang.Comparable) '4');
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = new org.jfree.data.KeyedObjects2D();
        int int25 = keyedObjects2D23.getColumnIndex((java.lang.Comparable) 0.0d);
        int int27 = keyedObjects2D23.getRowIndex((java.lang.Comparable) 'a');
        int int29 = keyedObjects2D23.getColumnIndex((java.lang.Comparable) 10.0d);
        int int30 = keyedObjects2D23.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D31.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D31.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D23.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        int int44 = keyedObjects2D42.getColumnIndex((java.lang.Comparable) 0.0d);
        int int46 = keyedObjects2D42.getRowIndex((java.lang.Comparable) 'a');
        int int48 = keyedObjects2D42.getColumnIndex((java.lang.Comparable) 10.0d);
        int int49 = keyedObjects2D42.getColumnCount();
        keyedObjects2D23.setObject((java.lang.Object) int49, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1L));
        int int54 = keyedObjects2D23.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list55 = keyedObjects2D23.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D56 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D57 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D56.addObject((java.lang.Object) keyedObjects2D57, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj61 = keyedObjects2D57.clone();
        int int62 = keyedObjects2D57.getColumnCount();
        int int64 = keyedObjects2D57.getRowIndex((java.lang.Comparable) (short) 10);
        int int65 = keyedObjects2D57.getColumnCount();
        java.lang.Object obj66 = keyedObjects2D57.clone();
        keyedObjects2D23.addObject((java.lang.Object) keyedObjects2D57, (java.lang.Comparable) ' ', (java.lang.Comparable) 0L);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D57, (java.lang.Comparable) 100.0d, (java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D8 and keyedObjects2D31", keyedObjects2D8.equals(keyedObjects2D31) ? keyedObjects2D8.hashCode() == keyedObjects2D31.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        int int11 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj12 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = new org.jfree.data.KeyedObjects2D();
        int int14 = keyedObjects2D13.getRowCount();
        int int16 = keyedObjects2D13.getRowIndex((java.lang.Comparable) (byte) -1);
        int int18 = keyedObjects2D13.getColumnIndex((java.lang.Comparable) 1.0f);
        int int19 = keyedObjects2D13.getRowCount();
        java.lang.Object obj20 = keyedObjects2D13.clone();
        int int21 = keyedObjects2D13.getRowCount();
        int int22 = keyedObjects2D13.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D23.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D13.addObject((java.lang.Object) keyedObjects2D23, (java.lang.Comparable) (short) 0, (java.lang.Comparable) "");
        boolean boolean31 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D13);
        java.lang.Object obj32 = keyedObjects2D13.clone();
        int int34 = keyedObjects2D13.getColumnIndex((java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D13 and obj32", keyedObjects2D13.equals(obj32) ? keyedObjects2D13.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.util.List list6 = keyedObjects2D5.getRowKeys();
        java.lang.Object obj7 = keyedObjects2D5.clone();
        keyedObjects2D0.addObject(obj7, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 100);
        java.lang.Object obj11 = keyedObjects2D0.clone();
        int int13 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj11", keyedObjects2D0.equals(obj11) ? keyedObjects2D0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        int int11 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 0.0d);
        int int13 = keyedObjects2D9.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj14 = keyedObjects2D9.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D15.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int21 = keyedObjects2D15.getColumnIndex((java.lang.Comparable) 0L);
        int int22 = keyedObjects2D15.getRowCount();
        keyedObjects2D9.setObject((java.lang.Object) int22, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int27 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        java.util.List list29 = keyedObjects2D28.getRowKeys();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D28, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj33 = null;
        boolean boolean34 = keyedObjects2D9.equals(obj33);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        int int36 = keyedObjects2D35.getRowCount();
        int int38 = keyedObjects2D35.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj39 = keyedObjects2D35.clone();
        int int40 = keyedObjects2D35.getColumnCount();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D35, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0f);
        boolean boolean44 = keyedObjects2D7.equals((java.lang.Object) keyedObjects2D9);
        int int45 = keyedObjects2D9.getColumnCount();
        java.util.List list46 = keyedObjects2D9.getColumnKeys();
        java.lang.Object obj47 = keyedObjects2D9.clone();
        java.lang.Comparable comparable49 = keyedObjects2D9.getRowKey((int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D9 and obj47", keyedObjects2D9.equals(obj47) ? keyedObjects2D9.hashCode() == obj47.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        int int27 = keyedObjects2D26.getRowCount();
        int int29 = keyedObjects2D26.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D26.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int33 = keyedObjects2D26.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D34.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj41 = keyedObjects2D34.getObject(0, 0);
        int int42 = keyedObjects2D34.getRowCount();
        keyedObjects2D26.setObject((java.lang.Object) keyedObjects2D34, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        java.util.List list46 = keyedObjects2D26.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D26, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D6 and keyedObjects2D34", keyedObjects2D6.equals(keyedObjects2D34) ? keyedObjects2D6.hashCode() == keyedObjects2D34.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        java.lang.Object obj7 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj13 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int21 = keyedObjects2D14.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int21, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int26 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.util.List list28 = keyedObjects2D27.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj32 = null;
        boolean boolean33 = keyedObjects2D8.equals(obj32);
        keyedObjects2D8.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D8.removeRow((int) (short) 0);
        java.util.List list39 = keyedObjects2D8.getColumnKeys();
        java.util.List list40 = keyedObjects2D8.getColumnKeys();
        java.lang.Object obj41 = keyedObjects2D8.clone();
        boolean boolean42 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj7", keyedObjects2D0.equals(obj7) ? keyedObjects2D0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj12 = keyedObjects2D8.clone();
        int int13 = keyedObjects2D8.getColumnCount();
        int int15 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean16 = keyedObjects2D0.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable18 = keyedObjects2D0.getColumnKey((int) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0.0d);
        int int23 = keyedObjects2D19.getRowIndex((java.lang.Comparable) 'a');
        int int25 = keyedObjects2D19.getRowIndex((java.lang.Comparable) '4');
        keyedObjects2D0.addObject((java.lang.Object) int25, (java.lang.Comparable) '4', (java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1.0f), (java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = new org.jfree.data.KeyedObjects2D();
        int int34 = keyedObjects2D32.getColumnIndex((java.lang.Comparable) 0.0d);
        int int36 = keyedObjects2D32.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj37 = keyedObjects2D32.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D38 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D38.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int44 = keyedObjects2D38.getColumnIndex((java.lang.Comparable) 0L);
        int int45 = keyedObjects2D38.getRowCount();
        keyedObjects2D32.setObject((java.lang.Object) int45, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        java.util.List list49 = keyedObjects2D32.getColumnKeys();
        boolean boolean50 = keyedObjects2D0.equals((java.lang.Object) list49);
        org.jfree.data.KeyedObjects2D keyedObjects2D51 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D51.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list56 = keyedObjects2D51.getRowKeys();
        int int57 = keyedObjects2D51.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D58 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D59 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D58.addObject((java.lang.Object) keyedObjects2D59, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj63 = keyedObjects2D59.clone();
        int int64 = keyedObjects2D59.getColumnCount();
        int int66 = keyedObjects2D59.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean67 = keyedObjects2D51.equals((java.lang.Object) (short) 10);
        java.util.List list68 = keyedObjects2D51.getRowKeys();
        java.lang.Object obj69 = keyedObjects2D51.clone();
        keyedObjects2D0.addObject(obj69, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D7 and keyedObjects2D58", keyedObjects2D7.equals(keyedObjects2D58) ? keyedObjects2D7.hashCode() == keyedObjects2D58.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        java.util.List list21 = keyedObjects2D20.getRowKeys();
        java.lang.Object obj22 = keyedObjects2D20.clone();
        keyedObjects2D0.setObject(obj22, (java.lang.Comparable) false, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        int int27 = keyedObjects2D26.getRowCount();
        int int29 = keyedObjects2D26.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D26.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        java.util.List list33 = keyedObjects2D26.getColumnKeys();
        java.util.List list34 = keyedObjects2D26.getColumnKeys();
        java.util.List list35 = keyedObjects2D26.getRowKeys();
        java.lang.Class<?> wildcardClass36 = keyedObjects2D26.getClass();
        boolean boolean37 = keyedObjects2D0.equals((java.lang.Object) wildcardClass36);
        int int38 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D39 = new org.jfree.data.KeyedObjects2D();
        int int41 = keyedObjects2D39.getColumnIndex((java.lang.Comparable) 0.0d);
        int int43 = keyedObjects2D39.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj44 = keyedObjects2D39.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D45 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D45.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int51 = keyedObjects2D45.getColumnIndex((java.lang.Comparable) 0L);
        int int52 = keyedObjects2D45.getRowCount();
        keyedObjects2D39.setObject((java.lang.Object) int52, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int57 = keyedObjects2D39.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D58 = new org.jfree.data.KeyedObjects2D();
        java.util.List list59 = keyedObjects2D58.getRowKeys();
        keyedObjects2D39.setObject((java.lang.Object) keyedObjects2D58, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D63 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D64 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D63.addObject((java.lang.Object) keyedObjects2D64, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int68 = keyedObjects2D64.getRowCount();
        boolean boolean69 = keyedObjects2D39.equals((java.lang.Object) int68);
        org.jfree.data.KeyedObjects2D keyedObjects2D70 = new org.jfree.data.KeyedObjects2D();
        int int71 = keyedObjects2D70.getRowCount();
        boolean boolean73 = keyedObjects2D70.equals((java.lang.Object) 10.0d);
        keyedObjects2D39.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean77 = keyedObjects2D0.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D8 and keyedObjects2D45", keyedObjects2D8.equals(keyedObjects2D45) ? keyedObjects2D8.hashCode() == keyedObjects2D45.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        int int19 = keyedObjects2D0.getRowCount();
        java.lang.Object obj20 = keyedObjects2D0.clone();
        int int21 = keyedObjects2D0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj20", keyedObjects2D0.equals(obj20) ? keyedObjects2D0.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        java.util.List list21 = keyedObjects2D20.getRowKeys();
        java.lang.Object obj22 = keyedObjects2D20.clone();
        keyedObjects2D0.setObject(obj22, (java.lang.Comparable) false, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        int int27 = keyedObjects2D26.getRowCount();
        int int29 = keyedObjects2D26.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D26.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        java.util.List list33 = keyedObjects2D26.getColumnKeys();
        java.util.List list34 = keyedObjects2D26.getColumnKeys();
        java.util.List list35 = keyedObjects2D26.getRowKeys();
        java.lang.Class<?> wildcardClass36 = keyedObjects2D26.getClass();
        boolean boolean37 = keyedObjects2D0.equals((java.lang.Object) wildcardClass36);
        keyedObjects2D0.removeObject((java.lang.Comparable) 100.0d, (java.lang.Comparable) (-1));
        org.jfree.data.KeyedObjects2D keyedObjects2D41 = new org.jfree.data.KeyedObjects2D();
        int int43 = keyedObjects2D41.getColumnIndex((java.lang.Comparable) 0.0d);
        int int45 = keyedObjects2D41.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj46 = keyedObjects2D41.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D47 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D47.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int53 = keyedObjects2D47.getColumnIndex((java.lang.Comparable) 0L);
        int int54 = keyedObjects2D47.getRowCount();
        keyedObjects2D41.setObject((java.lang.Object) int54, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int59 = keyedObjects2D41.getColumnIndex((java.lang.Comparable) 100.0f);
        java.lang.Comparable comparable60 = null;
        int int61 = keyedObjects2D41.getColumnIndex(comparable60);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D41, (java.lang.Comparable) (short) 0, (java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D8 and keyedObjects2D47", keyedObjects2D8.equals(keyedObjects2D47) ? keyedObjects2D8.hashCode() == keyedObjects2D47.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int25 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        int int26 = keyedObjects2D0.getColumnCount();
        int int28 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list29 = keyedObjects2D0.getColumnKeys();
        java.util.List list30 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        int int32 = keyedObjects2D31.getRowCount();
        int int34 = keyedObjects2D31.getRowIndex((java.lang.Comparable) (byte) -1);
        int int36 = keyedObjects2D31.getColumnIndex((java.lang.Comparable) 1.0f);
        int int37 = keyedObjects2D31.getRowCount();
        java.lang.Object obj38 = keyedObjects2D31.clone();
        java.util.List list39 = keyedObjects2D31.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D40 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D40.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D45 = new org.jfree.data.KeyedObjects2D();
        int int47 = keyedObjects2D45.getColumnIndex((java.lang.Comparable) 0.0d);
        int int49 = keyedObjects2D45.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj50 = keyedObjects2D45.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D51 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D51.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int57 = keyedObjects2D51.getColumnIndex((java.lang.Comparable) 0L);
        int int58 = keyedObjects2D51.getRowCount();
        keyedObjects2D45.setObject((java.lang.Object) int58, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        keyedObjects2D40.addObject((java.lang.Object) (short) 0, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (-1L));
        int int65 = keyedObjects2D40.getRowCount();
        boolean boolean66 = keyedObjects2D31.equals((java.lang.Object) int65);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) false, (java.lang.Comparable) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D6 and keyedObjects2D51", keyedObjects2D6.equals(keyedObjects2D51) ? keyedObjects2D6.hashCode() == keyedObjects2D51.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.addObject((java.lang.Object) (short) 100, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        int int14 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 0.0d);
        int int16 = keyedObjects2D12.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj17 = keyedObjects2D12.clone();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D12, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D21.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj28 = keyedObjects2D21.getObject(0, 0);
        boolean boolean29 = keyedObjects2D12.equals((java.lang.Object) 0);
        java.lang.Object obj30 = keyedObjects2D12.clone();
        java.lang.Object obj31 = null;
        keyedObjects2D12.setObject(obj31, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 10);
        int int35 = keyedObjects2D12.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        int int38 = keyedObjects2D36.getColumnIndex((java.lang.Comparable) 0.0d);
        int int40 = keyedObjects2D36.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj41 = keyedObjects2D36.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D42.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int48 = keyedObjects2D42.getColumnIndex((java.lang.Comparable) 0L);
        int int49 = keyedObjects2D42.getRowCount();
        keyedObjects2D36.setObject((java.lang.Object) int49, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int54 = keyedObjects2D36.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D55 = new org.jfree.data.KeyedObjects2D();
        java.util.List list56 = keyedObjects2D55.getRowKeys();
        keyedObjects2D36.setObject((java.lang.Object) keyedObjects2D55, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj60 = keyedObjects2D55.clone();
        int int61 = keyedObjects2D55.getRowCount();
        int int62 = keyedObjects2D55.getRowCount();
        int int64 = keyedObjects2D55.getRowIndex((java.lang.Comparable) 1L);
        keyedObjects2D12.setObject((java.lang.Object) 1L, (java.lang.Comparable) 0L, (java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D21 and keyedObjects2D42", keyedObjects2D21.equals(keyedObjects2D42) ? keyedObjects2D21.hashCode() == keyedObjects2D42.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.util.List list6 = keyedObjects2D5.getRowKeys();
        java.lang.Object obj7 = keyedObjects2D5.clone();
        keyedObjects2D0.addObject(obj7, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 100);
        java.lang.Object obj11 = keyedObjects2D0.clone();
        java.lang.Comparable comparable13 = keyedObjects2D0.getRowKey((int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj11", keyedObjects2D0.equals(obj11) ? keyedObjects2D0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        int int29 = keyedObjects2D0.getRowCount();
        java.lang.Object obj30 = keyedObjects2D0.clone();
        java.util.List list31 = keyedObjects2D0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj30", keyedObjects2D0.equals(obj30) ? keyedObjects2D0.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int25 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        int int26 = keyedObjects2D0.getColumnCount();
        int int28 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list29 = keyedObjects2D0.getColumnKeys();
        java.util.List list30 = keyedObjects2D0.getRowKeys();
        int int32 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        int int34 = keyedObjects2D33.getRowCount();
        int int36 = keyedObjects2D33.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D33.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int40 = keyedObjects2D33.getRowCount();
        int int41 = keyedObjects2D33.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        int int43 = keyedObjects2D42.getRowCount();
        int int45 = keyedObjects2D42.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D42.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int49 = keyedObjects2D42.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D50 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D50.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj57 = keyedObjects2D50.getObject(0, 0);
        int int58 = keyedObjects2D50.getRowCount();
        keyedObjects2D42.setObject((java.lang.Object) keyedObjects2D50, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        boolean boolean62 = keyedObjects2D33.equals((java.lang.Object) "hi!");
        java.util.List list63 = keyedObjects2D33.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) list63, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D6 and keyedObjects2D50", keyedObjects2D6.equals(keyedObjects2D50) ? keyedObjects2D6.hashCode() == keyedObjects2D50.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        int int8 = keyedObjects2D0.getRowCount();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        int int16 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0.0d);
        int int18 = keyedObjects2D14.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj19 = keyedObjects2D14.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D20.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int26 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) 0L);
        int int27 = keyedObjects2D20.getRowCount();
        keyedObjects2D14.setObject((java.lang.Object) int27, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int32 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        java.util.List list34 = keyedObjects2D33.getRowKeys();
        keyedObjects2D14.setObject((java.lang.Object) keyedObjects2D33, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj38 = null;
        boolean boolean39 = keyedObjects2D14.equals(obj38);
        keyedObjects2D14.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D14.removeRow((int) (short) 0);
        java.util.List list45 = keyedObjects2D14.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) list45, (java.lang.Comparable) (-1.0f), (java.lang.Comparable) 2);
        org.jfree.data.KeyedObjects2D keyedObjects2D49 = new org.jfree.data.KeyedObjects2D();
        int int51 = keyedObjects2D49.getColumnIndex((java.lang.Comparable) 0.0d);
        int int53 = keyedObjects2D49.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj54 = keyedObjects2D49.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D55 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D55.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int61 = keyedObjects2D55.getColumnIndex((java.lang.Comparable) 0L);
        int int62 = keyedObjects2D55.getRowCount();
        keyedObjects2D49.setObject((java.lang.Object) int62, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int67 = keyedObjects2D49.getColumnIndex((java.lang.Comparable) 100.0f);
        java.util.List list68 = keyedObjects2D49.getColumnKeys();
        java.util.List list69 = keyedObjects2D49.getColumnKeys();
        boolean boolean70 = keyedObjects2D0.equals((java.lang.Object) list69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D20 and keyedObjects2D55", keyedObjects2D20.equals(keyedObjects2D55) ? keyedObjects2D20.hashCode() == keyedObjects2D55.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) 10.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0f);
        int int13 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.lang.Object obj14 = keyedObjects2D0.clone();
        java.lang.Comparable comparable15 = null;
        int int16 = keyedObjects2D0.getRowIndex(comparable15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj14", keyedObjects2D0.equals(obj14) ? keyedObjects2D0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int9 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 10);
        keyedObjects2D0.removeObject((java.lang.Comparable) true, (java.lang.Comparable) 10);
        java.lang.Object obj13 = keyedObjects2D0.clone();
        java.lang.Object obj14 = null;
        boolean boolean15 = keyedObjects2D0.equals(obj14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj13", keyedObjects2D0.equals(obj13) ? keyedObjects2D0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        java.lang.Object obj20 = keyedObjects2D8.clone();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D8 and obj20", keyedObjects2D8.equals(obj20) ? keyedObjects2D8.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        int int8 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.addObject((java.lang.Object) 0L, (java.lang.Comparable) 100.0d, (java.lang.Comparable) false);
        int int14 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        int int16 = keyedObjects2D15.getRowCount();
        int int18 = keyedObjects2D15.getRowIndex((java.lang.Comparable) (byte) -1);
        java.util.List list19 = keyedObjects2D15.getRowKeys();
        java.lang.Object obj20 = keyedObjects2D15.clone();
        boolean boolean21 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D15);
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D22.addObject((java.lang.Object) keyedObjects2D23, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D27.addObject((java.lang.Object) keyedObjects2D28, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int33 = keyedObjects2D27.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.List list34 = keyedObjects2D27.getColumnKeys();
        keyedObjects2D22.addObject((java.lang.Object) list34, (java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 0);
        java.lang.Object obj38 = keyedObjects2D22.clone();
        keyedObjects2D15.setObject((java.lang.Object) keyedObjects2D22, (java.lang.Comparable) (-1L), (java.lang.Comparable) 1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D22 and obj38", keyedObjects2D22.equals(obj38) ? keyedObjects2D22.hashCode() == obj38.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        keyedObjects2D0.removeObject((java.lang.Comparable) 10.0d, (java.lang.Comparable) 1.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) 100, (java.lang.Comparable) '#');
        java.lang.Object obj14 = keyedObjects2D0.clone();
        keyedObjects2D0.removeObject((java.lang.Comparable) false, (java.lang.Comparable) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj14", keyedObjects2D0.equals(obj14) ? keyedObjects2D0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        java.lang.Object obj29 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj29", keyedObjects2D0.equals(obj29) ? keyedObjects2D0.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        keyedObjects2D1.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.util.List list10 = keyedObjects2D1.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = new org.jfree.data.KeyedObjects2D();
        int int13 = keyedObjects2D11.getColumnIndex((java.lang.Comparable) 0.0d);
        int int15 = keyedObjects2D11.getRowIndex((java.lang.Comparable) 'a');
        int int17 = keyedObjects2D11.getColumnIndex((java.lang.Comparable) 10.0d);
        int int18 = keyedObjects2D11.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D19.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D19.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D11.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        int int32 = keyedObjects2D30.getColumnIndex((java.lang.Comparable) 0.0d);
        int int34 = keyedObjects2D30.getRowIndex((java.lang.Comparable) 'a');
        int int36 = keyedObjects2D30.getColumnIndex((java.lang.Comparable) 10.0d);
        int int37 = keyedObjects2D30.getColumnCount();
        keyedObjects2D11.setObject((java.lang.Object) int37, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1L));
        java.util.List list41 = keyedObjects2D11.getColumnKeys();
        int int43 = keyedObjects2D11.getColumnIndex((java.lang.Comparable) '4');
        java.lang.Object obj44 = keyedObjects2D11.clone();
        keyedObjects2D1.addObject(obj44, (java.lang.Comparable) 10, (java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D11 and obj44", keyedObjects2D11.equals(obj44) ? keyedObjects2D11.hashCode() == obj44.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0.0d);
        int int23 = keyedObjects2D19.getRowIndex((java.lang.Comparable) 'a');
        int int25 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 10.0d);
        int int26 = keyedObjects2D19.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) int26, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1L));
        int int31 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0d);
        java.lang.Object obj32 = keyedObjects2D0.clone();
        int int34 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj32", keyedObjects2D0.equals(obj32) ? keyedObjects2D0.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        int int8 = keyedObjects2D1.getRowIndex((java.lang.Comparable) (short) 10);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        int int11 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 0.0d);
        int int13 = keyedObjects2D9.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D9.setObject((java.lang.Object) 10.0f, (java.lang.Comparable) 'a', (java.lang.Comparable) 10L);
        java.lang.Class<?> wildcardClass18 = keyedObjects2D9.getClass();
        keyedObjects2D1.setObject((java.lang.Object) wildcardClass18, (java.lang.Comparable) (-1L), (java.lang.Comparable) 3);
        java.util.List list22 = keyedObjects2D1.getRowKeys();
        java.lang.Object obj23 = keyedObjects2D1.clone();
        java.util.List list24 = keyedObjects2D1.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D1 and obj23", keyedObjects2D1.equals(obj23) ? keyedObjects2D1.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.addObject((java.lang.Object) keyedObjects2D9, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj13 = keyedObjects2D9.clone();
        keyedObjects2D9.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj18 = null;
        boolean boolean19 = keyedObjects2D9.equals(obj18);
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) boolean19);
        int int21 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        int int24 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 0.0d);
        int int26 = keyedObjects2D22.getRowIndex((java.lang.Comparable) 'a');
        int int28 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 10.0d);
        int int29 = keyedObjects2D22.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D30.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D30.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D22.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        keyedObjects2D22.setObject((java.lang.Object) 1, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1));
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D22, (java.lang.Comparable) (-1L), (java.lang.Comparable) (-1.0f));
        java.util.List list48 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj49 = keyedObjects2D0.clone();
        int int50 = keyedObjects2D0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj49", keyedObjects2D0.equals(obj49) ? keyedObjects2D0.hashCode() == obj49.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.addObject((java.lang.Object) (short) 100, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        int int14 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 0.0d);
        int int16 = keyedObjects2D12.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj17 = keyedObjects2D12.clone();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D12, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D21.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj28 = keyedObjects2D21.getObject(0, 0);
        boolean boolean29 = keyedObjects2D12.equals((java.lang.Object) 0);
        java.lang.Object obj30 = keyedObjects2D12.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        int int32 = keyedObjects2D31.getRowCount();
        int int34 = keyedObjects2D31.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D31.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int38 = keyedObjects2D31.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D39 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D39.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj46 = keyedObjects2D39.getObject(0, 0);
        int int47 = keyedObjects2D39.getRowCount();
        keyedObjects2D31.setObject((java.lang.Object) keyedObjects2D39, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        int int51 = keyedObjects2D39.getColumnCount();
        boolean boolean52 = keyedObjects2D12.equals((java.lang.Object) int51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D21 and keyedObjects2D39", keyedObjects2D21.equals(keyedObjects2D39) ? keyedObjects2D21.hashCode() == keyedObjects2D39.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj13 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int21 = keyedObjects2D14.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int21, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int26 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.util.List list28 = keyedObjects2D27.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D32.addObject((java.lang.Object) keyedObjects2D33, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int37 = keyedObjects2D33.getRowCount();
        boolean boolean38 = keyedObjects2D8.equals((java.lang.Object) int37);
        org.jfree.data.KeyedObjects2D keyedObjects2D39 = new org.jfree.data.KeyedObjects2D();
        int int40 = keyedObjects2D39.getRowCount();
        boolean boolean42 = keyedObjects2D39.equals((java.lang.Object) 10.0d);
        keyedObjects2D8.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean47 = keyedObjects2D8.equals((java.lang.Object) 10L);
        boolean boolean48 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D8);
        java.util.List list49 = keyedObjects2D8.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D50 = new org.jfree.data.KeyedObjects2D();
        int int52 = keyedObjects2D50.getColumnIndex((java.lang.Comparable) 0.0d);
        int int54 = keyedObjects2D50.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj55 = keyedObjects2D50.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D56 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D56.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int62 = keyedObjects2D56.getColumnIndex((java.lang.Comparable) 0L);
        int int63 = keyedObjects2D56.getRowCount();
        keyedObjects2D50.setObject((java.lang.Object) int63, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int68 = keyedObjects2D50.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D69 = new org.jfree.data.KeyedObjects2D();
        java.util.List list70 = keyedObjects2D69.getRowKeys();
        keyedObjects2D50.setObject((java.lang.Object) keyedObjects2D69, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj74 = null;
        boolean boolean75 = keyedObjects2D50.equals(obj74);
        keyedObjects2D50.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D50.removeRow((int) (short) 0);
        java.util.List list81 = keyedObjects2D50.getColumnKeys();
        java.util.List list82 = keyedObjects2D50.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) list82, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D14 and keyedObjects2D56", keyedObjects2D14.equals(keyedObjects2D56) ? keyedObjects2D14.hashCode() == keyedObjects2D56.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj13 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int21 = keyedObjects2D14.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int21, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int26 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.util.List list28 = keyedObjects2D27.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D32.addObject((java.lang.Object) keyedObjects2D33, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int37 = keyedObjects2D33.getRowCount();
        boolean boolean38 = keyedObjects2D8.equals((java.lang.Object) int37);
        org.jfree.data.KeyedObjects2D keyedObjects2D39 = new org.jfree.data.KeyedObjects2D();
        int int40 = keyedObjects2D39.getRowCount();
        boolean boolean42 = keyedObjects2D39.equals((java.lang.Object) 10.0d);
        keyedObjects2D8.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean47 = keyedObjects2D8.equals((java.lang.Object) 10L);
        boolean boolean48 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D8);
        int int49 = keyedObjects2D8.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D50 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D50.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list55 = keyedObjects2D50.getRowKeys();
        int int56 = keyedObjects2D50.getRowCount();
        java.util.List list57 = keyedObjects2D50.getColumnKeys();
        keyedObjects2D50.addObject((java.lang.Object) 10.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0f);
        int int63 = keyedObjects2D50.getColumnIndex((java.lang.Comparable) 1.0f);
        java.lang.Object obj64 = keyedObjects2D50.clone();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D50, (java.lang.Comparable) (short) 100, (java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D50 and obj64", keyedObjects2D50.equals(obj64) ? keyedObjects2D50.hashCode() == obj64.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        keyedObjects2D1.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        keyedObjects2D1.removeObject((java.lang.Comparable) 100, (java.lang.Comparable) (short) 100);
        int int14 = keyedObjects2D1.getRowIndex((java.lang.Comparable) "");
        java.lang.Object obj15 = keyedObjects2D1.clone();
        int int16 = keyedObjects2D1.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D1 and obj15", keyedObjects2D1.equals(obj15) ? keyedObjects2D1.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0.0d);
        int int23 = keyedObjects2D19.getRowIndex((java.lang.Comparable) 'a');
        int int25 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 10.0d);
        int int26 = keyedObjects2D19.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) int26, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1L));
        int int31 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0d);
        java.lang.Object obj32 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        int int35 = keyedObjects2D33.getColumnIndex((java.lang.Comparable) 0.0d);
        int int37 = keyedObjects2D33.getRowIndex((java.lang.Comparable) 'a');
        int int39 = keyedObjects2D33.getColumnIndex((java.lang.Comparable) 10.0d);
        int int40 = keyedObjects2D33.getRowCount();
        keyedObjects2D0.addObject((java.lang.Object) int40, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 1.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D44 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D44.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list49 = keyedObjects2D44.getRowKeys();
        int int50 = keyedObjects2D44.getRowCount();
        java.util.List list51 = keyedObjects2D44.getColumnKeys();
        keyedObjects2D44.addObject((java.lang.Object) 10.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D56 = new org.jfree.data.KeyedObjects2D();
        int int58 = keyedObjects2D56.getColumnIndex((java.lang.Comparable) 0.0d);
        int int60 = keyedObjects2D56.getRowIndex((java.lang.Comparable) 'a');
        int int62 = keyedObjects2D56.getColumnIndex((java.lang.Comparable) 10.0d);
        int int63 = keyedObjects2D56.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D64 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D64.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D64.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D56.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D75 = new org.jfree.data.KeyedObjects2D();
        int int77 = keyedObjects2D75.getColumnIndex((java.lang.Comparable) 0.0d);
        int int79 = keyedObjects2D75.getRowIndex((java.lang.Comparable) 'a');
        int int81 = keyedObjects2D75.getColumnIndex((java.lang.Comparable) 10.0d);
        int int82 = keyedObjects2D75.getColumnCount();
        keyedObjects2D56.setObject((java.lang.Object) int82, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1L));
        java.util.List list86 = keyedObjects2D56.getColumnKeys();
        java.util.List list87 = keyedObjects2D56.getRowKeys();
        keyedObjects2D44.addObject((java.lang.Object) list87, (java.lang.Comparable) true, (java.lang.Comparable) (-1));
        boolean boolean91 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D8 and keyedObjects2D64", keyedObjects2D8.equals(keyedObjects2D64) ? keyedObjects2D8.hashCode() == keyedObjects2D64.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D24.addObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int29 = keyedObjects2D25.getRowCount();
        boolean boolean30 = keyedObjects2D0.equals((java.lang.Object) int29);
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        int int32 = keyedObjects2D31.getRowCount();
        boolean boolean34 = keyedObjects2D31.equals((java.lang.Object) 10.0d);
        keyedObjects2D0.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean39 = keyedObjects2D0.equals((java.lang.Object) 10L);
        org.jfree.data.KeyedObjects2D keyedObjects2D40 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D40.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D40.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        java.util.List list48 = keyedObjects2D40.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D40, (java.lang.Comparable) true, (java.lang.Comparable) (short) 0);
        java.lang.Object obj52 = keyedObjects2D40.clone();
        int int53 = keyedObjects2D40.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D40 and obj52", keyedObjects2D40.equals(obj52) ? keyedObjects2D40.hashCode() == obj52.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D24.addObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int29 = keyedObjects2D25.getRowCount();
        boolean boolean30 = keyedObjects2D0.equals((java.lang.Object) int29);
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        int int32 = keyedObjects2D31.getRowCount();
        int int34 = keyedObjects2D31.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D31.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int38 = keyedObjects2D31.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D39 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D39.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj46 = keyedObjects2D39.getObject(0, 0);
        int int47 = keyedObjects2D39.getRowCount();
        keyedObjects2D31.setObject((java.lang.Object) keyedObjects2D39, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        int int51 = keyedObjects2D31.getColumnCount();
        java.lang.Object obj52 = keyedObjects2D31.clone();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) 'a', (java.lang.Comparable) 3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D6 and keyedObjects2D39", keyedObjects2D6.equals(keyedObjects2D39) ? keyedObjects2D6.hashCode() == keyedObjects2D39.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Comparable comparable6 = keyedObjects2D0.getRowKey(0);
        java.lang.Object obj7 = keyedObjects2D0.clone();
        int int9 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj7", keyedObjects2D0.equals(obj7) ? keyedObjects2D0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.addObject((java.lang.Object) (short) 100, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        int int14 = keyedObjects2D12.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        java.util.List list16 = keyedObjects2D15.getRowKeys();
        boolean boolean18 = keyedObjects2D15.equals((java.lang.Object) (byte) 100);
        int int20 = keyedObjects2D15.getColumnIndex((java.lang.Comparable) (byte) -1);
        boolean boolean21 = keyedObjects2D12.equals((java.lang.Object) int20);
        keyedObjects2D0.addObject((java.lang.Object) boolean21, (java.lang.Comparable) 1L, (java.lang.Comparable) 3);
        int int26 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 0L);
        java.lang.Object obj27 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass28 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj27", keyedObjects2D0.equals(obj27) ? keyedObjects2D0.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        java.lang.Object obj7 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj7", keyedObjects2D0.equals(obj7) ? keyedObjects2D0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        int int27 = keyedObjects2D0.getRowIndex((java.lang.Comparable) true);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D28.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list33 = keyedObjects2D28.getRowKeys();
        int int34 = keyedObjects2D28.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D35.addObject((java.lang.Object) keyedObjects2D36, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj40 = keyedObjects2D36.clone();
        int int41 = keyedObjects2D36.getColumnCount();
        int int43 = keyedObjects2D36.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean44 = keyedObjects2D28.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable46 = keyedObjects2D28.getColumnKey((int) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D47 = new org.jfree.data.KeyedObjects2D();
        int int49 = keyedObjects2D47.getColumnIndex((java.lang.Comparable) 0.0d);
        int int51 = keyedObjects2D47.getRowIndex((java.lang.Comparable) 'a');
        int int53 = keyedObjects2D47.getRowIndex((java.lang.Comparable) '4');
        keyedObjects2D28.addObject((java.lang.Object) int53, (java.lang.Comparable) '4', (java.lang.Comparable) 'a');
        boolean boolean57 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D28);
        int int59 = keyedObjects2D28.getRowIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D60 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D60.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list65 = keyedObjects2D60.getRowKeys();
        int int66 = keyedObjects2D60.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D67 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D68 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D67.addObject((java.lang.Object) keyedObjects2D68, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj72 = keyedObjects2D68.clone();
        int int73 = keyedObjects2D68.getColumnCount();
        int int75 = keyedObjects2D68.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean76 = keyedObjects2D60.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable78 = keyedObjects2D60.getColumnKey((int) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D79 = new org.jfree.data.KeyedObjects2D();
        int int81 = keyedObjects2D79.getColumnIndex((java.lang.Comparable) 0.0d);
        int int83 = keyedObjects2D79.getRowIndex((java.lang.Comparable) 'a');
        int int85 = keyedObjects2D79.getRowIndex((java.lang.Comparable) '4');
        keyedObjects2D60.addObject((java.lang.Object) int85, (java.lang.Comparable) '4', (java.lang.Comparable) 'a');
        java.util.List list89 = keyedObjects2D60.getRowKeys();
        keyedObjects2D60.removeObject((java.lang.Comparable) 10.0d, (java.lang.Comparable) (byte) 0);
        java.util.List list93 = keyedObjects2D60.getColumnKeys();
        int int94 = keyedObjects2D60.getColumnCount();
        keyedObjects2D28.addObject((java.lang.Object) keyedObjects2D60, (java.lang.Comparable) 100.0d, (java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D35 and keyedObjects2D67", keyedObjects2D35.equals(keyedObjects2D67) ? keyedObjects2D35.hashCode() == keyedObjects2D67.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        int int29 = keyedObjects2D0.getRowCount();
        java.lang.Object obj30 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj30", keyedObjects2D0.equals(obj30) ? keyedObjects2D0.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        int int19 = keyedObjects2D0.getRowCount();
        java.lang.Object obj20 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D21.addObject((java.lang.Object) keyedObjects2D22, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int27 = keyedObjects2D21.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.List list28 = keyedObjects2D21.getColumnKeys();
        java.util.List list29 = keyedObjects2D21.getRowKeys();
        boolean boolean30 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj20", keyedObjects2D0.equals(obj20) ? keyedObjects2D0.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int25 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        int int26 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj27 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D28.addObject((java.lang.Object) keyedObjects2D29, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj33 = keyedObjects2D29.clone();
        keyedObjects2D29.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        keyedObjects2D29.removeObject((java.lang.Comparable) 100, (java.lang.Comparable) (short) 100);
        int int42 = keyedObjects2D29.getRowIndex((java.lang.Comparable) "");
        java.lang.Object obj43 = keyedObjects2D29.clone();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D29, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D29 and obj43", keyedObjects2D29.equals(obj43) ? keyedObjects2D29.hashCode() == obj43.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        java.util.List list21 = keyedObjects2D20.getRowKeys();
        java.lang.Object obj22 = keyedObjects2D20.clone();
        keyedObjects2D0.setObject(obj22, (java.lang.Comparable) false, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        int int28 = keyedObjects2D26.getColumnIndex((java.lang.Comparable) 0.0d);
        int int30 = keyedObjects2D26.getRowIndex((java.lang.Comparable) 'a');
        int int32 = keyedObjects2D26.getColumnIndex((java.lang.Comparable) 10.0d);
        int int33 = keyedObjects2D26.getRowCount();
        keyedObjects2D26.addObject((java.lang.Object) (short) 100, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D38 = new org.jfree.data.KeyedObjects2D();
        int int40 = keyedObjects2D38.getColumnIndex((java.lang.Comparable) 0.0d);
        int int42 = keyedObjects2D38.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj43 = keyedObjects2D38.clone();
        keyedObjects2D26.setObject((java.lang.Object) keyedObjects2D38, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D47 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D47.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj54 = keyedObjects2D47.getObject(0, 0);
        boolean boolean55 = keyedObjects2D38.equals((java.lang.Object) 0);
        java.lang.Object obj56 = keyedObjects2D38.clone();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D38, (java.lang.Comparable) 3, (java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D8 and keyedObjects2D47", keyedObjects2D8.equals(keyedObjects2D47) ? keyedObjects2D8.hashCode() == keyedObjects2D47.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass25 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj24", keyedObjects2D0.equals(obj24) ? keyedObjects2D0.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj13 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int21 = keyedObjects2D14.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int21, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int26 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.util.List list28 = keyedObjects2D27.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj32 = null;
        boolean boolean33 = keyedObjects2D8.equals(obj32);
        keyedObjects2D8.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D8.removeRow((int) (short) 0);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 100L);
        keyedObjects2D8.addObject((java.lang.Object) ' ', (java.lang.Comparable) "hi!", (java.lang.Comparable) 2);
        org.jfree.data.KeyedObjects2D keyedObjects2D46 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D47 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D46.addObject((java.lang.Object) keyedObjects2D47, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int51 = keyedObjects2D47.getRowCount();
        java.util.List list52 = keyedObjects2D47.getColumnKeys();
        java.util.List list53 = keyedObjects2D47.getColumnKeys();
        java.util.List list54 = keyedObjects2D47.getRowKeys();
        boolean boolean55 = keyedObjects2D8.equals((java.lang.Object) keyedObjects2D47);
        int int57 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list58 = keyedObjects2D8.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D59 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D59.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list64 = keyedObjects2D59.getRowKeys();
        int int65 = keyedObjects2D59.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D66 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D67 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D66.addObject((java.lang.Object) keyedObjects2D67, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj71 = keyedObjects2D67.clone();
        int int72 = keyedObjects2D67.getColumnCount();
        int int74 = keyedObjects2D67.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean75 = keyedObjects2D59.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable77 = keyedObjects2D59.getColumnKey((int) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D78 = new org.jfree.data.KeyedObjects2D();
        int int80 = keyedObjects2D78.getColumnIndex((java.lang.Comparable) 0.0d);
        int int82 = keyedObjects2D78.getRowIndex((java.lang.Comparable) 'a');
        int int84 = keyedObjects2D78.getRowIndex((java.lang.Comparable) '4');
        keyedObjects2D59.addObject((java.lang.Object) int84, (java.lang.Comparable) '4', (java.lang.Comparable) 'a');
        int int88 = keyedObjects2D59.getRowCount();
        java.util.List list89 = keyedObjects2D59.getColumnKeys();
        keyedObjects2D8.addObject((java.lang.Object) keyedObjects2D59, (java.lang.Comparable) 2, (java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D46 and keyedObjects2D66", keyedObjects2D46.equals(keyedObjects2D66) ? keyedObjects2D46.hashCode() == keyedObjects2D66.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int17 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (short) 1);
        boolean boolean18 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D8);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0.0d);
        int int23 = keyedObjects2D19.getRowIndex((java.lang.Comparable) 'a');
        int int25 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 10.0d);
        int int26 = keyedObjects2D19.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D27.addObject((java.lang.Object) keyedObjects2D28, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj32 = keyedObjects2D28.clone();
        keyedObjects2D28.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj37 = null;
        boolean boolean38 = keyedObjects2D28.equals(obj37);
        boolean boolean39 = keyedObjects2D19.equals((java.lang.Object) boolean38);
        int int41 = keyedObjects2D19.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Class<?> wildcardClass42 = keyedObjects2D19.getClass();
        keyedObjects2D0.setObject((java.lang.Object) wildcardClass42, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        org.jfree.data.KeyedObjects2D keyedObjects2D46 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D46.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D46.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int54 = keyedObjects2D46.getRowCount();
        boolean boolean55 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D8 and keyedObjects2D46", keyedObjects2D8.equals(keyedObjects2D46) ? keyedObjects2D8.hashCode() == keyedObjects2D46.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 100);
        int int11 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj12 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = new org.jfree.data.KeyedObjects2D();
        int int15 = keyedObjects2D13.getColumnIndex((java.lang.Comparable) 0.0d);
        int int17 = keyedObjects2D13.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj18 = keyedObjects2D13.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D19.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int25 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0L);
        int int26 = keyedObjects2D19.getRowCount();
        keyedObjects2D13.setObject((java.lang.Object) int26, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int31 = keyedObjects2D13.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = new org.jfree.data.KeyedObjects2D();
        java.util.List list33 = keyedObjects2D32.getRowKeys();
        keyedObjects2D13.setObject((java.lang.Object) keyedObjects2D32, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj37 = keyedObjects2D13.clone();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D13, (java.lang.Comparable) true, (java.lang.Comparable) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D13 and obj37", keyedObjects2D13.equals(obj37) ? keyedObjects2D13.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0.0d);
        int int23 = keyedObjects2D19.getRowIndex((java.lang.Comparable) 'a');
        int int25 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 10.0d);
        int int26 = keyedObjects2D19.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) int26, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1L));
        java.util.List list30 = keyedObjects2D0.getColumnKeys();
        java.util.List list31 = keyedObjects2D0.getRowKeys();
        java.util.List list32 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj33 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass34 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj33", keyedObjects2D0.equals(obj33) ? keyedObjects2D0.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D0.removeRow((int) (short) 0);
        java.util.List list31 = keyedObjects2D0.getColumnKeys();
        java.util.List list32 = keyedObjects2D0.getColumnKeys();
        java.lang.Object obj33 = keyedObjects2D0.clone();
        int int34 = keyedObjects2D0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj33", keyedObjects2D0.equals(obj33) ? keyedObjects2D0.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getRowKeys();
        boolean boolean3 = keyedObjects2D0.equals((java.lang.Object) (byte) 100);
        boolean boolean5 = keyedObjects2D0.equals((java.lang.Object) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.addObject((java.lang.Object) keyedObjects2D7, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj11 = keyedObjects2D7.clone();
        int int12 = keyedObjects2D7.getColumnCount();
        int int14 = keyedObjects2D7.getRowIndex((java.lang.Comparable) (short) 10);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        int int17 = keyedObjects2D15.getColumnIndex((java.lang.Comparable) 0.0d);
        int int19 = keyedObjects2D15.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D15.setObject((java.lang.Object) 10.0f, (java.lang.Comparable) 'a', (java.lang.Comparable) 10L);
        java.lang.Class<?> wildcardClass24 = keyedObjects2D15.getClass();
        keyedObjects2D7.setObject((java.lang.Object) wildcardClass24, (java.lang.Comparable) (-1L), (java.lang.Comparable) 3);
        java.util.List list28 = keyedObjects2D7.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) list28, (java.lang.Comparable) '#', (java.lang.Comparable) (short) 100);
        java.lang.Object obj32 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass33 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj32", keyedObjects2D0.equals(obj32) ? keyedObjects2D0.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int25 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        int int26 = keyedObjects2D0.getColumnCount();
        int int28 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        java.util.List list29 = keyedObjects2D0.getColumnKeys();
        java.util.List list30 = keyedObjects2D0.getRowKeys();
        int int32 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0d);
        java.lang.Object obj33 = keyedObjects2D0.clone();
        java.lang.Object obj36 = keyedObjects2D0.getObject(0, (int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj33", keyedObjects2D0.equals(obj33) ? keyedObjects2D0.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D5.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list10 = keyedObjects2D5.getRowKeys();
        int int11 = keyedObjects2D5.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D12.addObject((java.lang.Object) keyedObjects2D13, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj17 = keyedObjects2D13.clone();
        int int18 = keyedObjects2D13.getColumnCount();
        int int20 = keyedObjects2D13.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean21 = keyedObjects2D5.equals((java.lang.Object) (short) 10);
        java.lang.Object obj22 = keyedObjects2D5.clone();
        boolean boolean23 = keyedObjects2D0.equals(obj22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D5 and obj22", keyedObjects2D5.equals(obj22) ? keyedObjects2D5.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj13 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int21 = keyedObjects2D14.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int21, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int26 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.util.List list28 = keyedObjects2D27.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj32 = null;
        boolean boolean33 = keyedObjects2D8.equals(obj32);
        keyedObjects2D8.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D8.removeRow((int) (short) 0);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 100L);
        int int43 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) true);
        org.jfree.data.KeyedObjects2D keyedObjects2D44 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D44.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj51 = keyedObjects2D44.getObject(0, 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D52 = new org.jfree.data.KeyedObjects2D();
        int int54 = keyedObjects2D52.getColumnIndex((java.lang.Comparable) 0.0d);
        int int56 = keyedObjects2D52.getRowIndex((java.lang.Comparable) 'a');
        boolean boolean58 = keyedObjects2D52.equals((java.lang.Object) (short) 10);
        keyedObjects2D44.setObject((java.lang.Object) keyedObjects2D52, (java.lang.Comparable) 0, (java.lang.Comparable) true);
        org.jfree.data.KeyedObjects2D keyedObjects2D62 = new org.jfree.data.KeyedObjects2D();
        int int64 = keyedObjects2D62.getColumnIndex((java.lang.Comparable) 0.0d);
        int int66 = keyedObjects2D62.getRowIndex((java.lang.Comparable) 'a');
        int int68 = keyedObjects2D62.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.KeyedObjects2D keyedObjects2D69 = new org.jfree.data.KeyedObjects2D();
        java.util.List list70 = keyedObjects2D69.getRowKeys();
        java.lang.Object obj71 = keyedObjects2D69.clone();
        boolean boolean72 = keyedObjects2D62.equals((java.lang.Object) keyedObjects2D69);
        keyedObjects2D52.addObject((java.lang.Object) boolean72, (java.lang.Comparable) 100L, (java.lang.Comparable) 2);
        java.util.List list76 = keyedObjects2D52.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) list76, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) 0L, (java.lang.Comparable) 1.0d);
        java.lang.Object obj83 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass84 = obj83.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj83", keyedObjects2D0.equals(obj83) ? keyedObjects2D0.hashCode() == obj83.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        int int19 = keyedObjects2D0.getRowCount();
        java.lang.Object obj20 = keyedObjects2D0.clone();
        int int22 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj20", keyedObjects2D0.equals(obj20) ? keyedObjects2D0.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int25 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        int int26 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj27 = keyedObjects2D0.clone();
        keyedObjects2D0.removeRow((int) (short) 1);
        java.lang.Object obj30 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        int int33 = keyedObjects2D31.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = new org.jfree.data.KeyedObjects2D();
        java.util.List list35 = keyedObjects2D34.getRowKeys();
        boolean boolean37 = keyedObjects2D34.equals((java.lang.Object) (byte) 100);
        int int39 = keyedObjects2D34.getColumnIndex((java.lang.Comparable) (byte) -1);
        boolean boolean40 = keyedObjects2D31.equals((java.lang.Object) int39);
        org.jfree.data.KeyedObjects2D keyedObjects2D41 = new org.jfree.data.KeyedObjects2D();
        int int42 = keyedObjects2D41.getRowCount();
        int int44 = keyedObjects2D41.getRowIndex((java.lang.Comparable) (byte) -1);
        int int46 = keyedObjects2D41.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D41.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D51 = new org.jfree.data.KeyedObjects2D();
        int int53 = keyedObjects2D51.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list54 = keyedObjects2D51.getRowKeys();
        keyedObjects2D41.addObject((java.lang.Object) keyedObjects2D51, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D58 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D59 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D58.addObject((java.lang.Object) keyedObjects2D59, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj63 = keyedObjects2D59.clone();
        keyedObjects2D59.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        keyedObjects2D59.removeObject((java.lang.Comparable) 100, (java.lang.Comparable) (short) 100);
        int int72 = keyedObjects2D59.getRowIndex((java.lang.Comparable) "");
        int int73 = keyedObjects2D59.getRowCount();
        keyedObjects2D51.setObject((java.lang.Object) int73, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 'a');
        keyedObjects2D31.addObject((java.lang.Object) 'a', (java.lang.Comparable) 1.0d, (java.lang.Comparable) (short) -1);
        boolean boolean80 = keyedObjects2D0.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj30", keyedObjects2D0.equals(obj30) ? keyedObjects2D0.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int25 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        int int26 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj27 = keyedObjects2D0.clone();
        keyedObjects2D0.removeRow((int) (short) 1);
        java.lang.Object obj30 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass31 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj30", keyedObjects2D0.equals(obj30) ? keyedObjects2D0.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        keyedObjects2D1.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        keyedObjects2D1.removeObject((java.lang.Comparable) 100, (java.lang.Comparable) (short) 100);
        int int14 = keyedObjects2D1.getRowIndex((java.lang.Comparable) "");
        java.lang.Object obj15 = keyedObjects2D1.clone();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D1 and obj15", keyedObjects2D1.equals(obj15) ? keyedObjects2D1.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D0.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        int int16 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 10.0d);
        int int17 = keyedObjects2D10.getColumnCount();
        int int18 = keyedObjects2D10.getRowCount();
        java.lang.Object obj19 = keyedObjects2D10.clone();
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D10);
        int int21 = keyedObjects2D10.getRowCount();
        java.lang.Object obj22 = keyedObjects2D10.clone();
        keyedObjects2D10.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 0.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D26.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list31 = keyedObjects2D26.getRowKeys();
        int int32 = keyedObjects2D26.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D33.addObject((java.lang.Object) keyedObjects2D34, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj38 = keyedObjects2D34.clone();
        int int39 = keyedObjects2D34.getColumnCount();
        int int41 = keyedObjects2D34.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean42 = keyedObjects2D26.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable44 = keyedObjects2D26.getColumnKey((int) (short) 0);
        int int45 = keyedObjects2D26.getRowCount();
        keyedObjects2D26.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) (byte) -1);
        keyedObjects2D10.setObject((java.lang.Object) (byte) -1, (java.lang.Comparable) 100.0d, (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D52 = new org.jfree.data.KeyedObjects2D();
        int int54 = keyedObjects2D52.getColumnIndex((java.lang.Comparable) 0.0d);
        int int56 = keyedObjects2D52.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D52.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D60 = new org.jfree.data.KeyedObjects2D();
        int int62 = keyedObjects2D60.getColumnIndex((java.lang.Comparable) 0.0d);
        int int64 = keyedObjects2D60.getRowIndex((java.lang.Comparable) 'a');
        int int66 = keyedObjects2D60.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list67 = keyedObjects2D60.getRowKeys();
        keyedObjects2D52.setObject((java.lang.Object) keyedObjects2D60, (java.lang.Comparable) false, (java.lang.Comparable) (short) 1);
        keyedObjects2D10.addObject((java.lang.Object) keyedObjects2D52, (java.lang.Comparable) 2, (java.lang.Comparable) 'a');
        java.util.List list74 = keyedObjects2D52.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D75 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D75.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj82 = keyedObjects2D75.getObject(0, 0);
        java.lang.Object obj83 = keyedObjects2D75.clone();
        keyedObjects2D52.setObject(obj83, (java.lang.Comparable) 10L, (java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D75 and obj83", keyedObjects2D75.equals(obj83) ? keyedObjects2D75.hashCode() == obj83.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        java.lang.Object obj20 = keyedObjects2D8.clone();
        java.util.List list21 = keyedObjects2D8.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D8 and obj20", keyedObjects2D8.equals(obj20) ? keyedObjects2D8.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        keyedObjects2D1.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        keyedObjects2D1.removeObject((java.lang.Comparable) 100, (java.lang.Comparable) (short) 100);
        int int14 = keyedObjects2D1.getRowIndex((java.lang.Comparable) "");
        java.lang.Object obj15 = keyedObjects2D1.clone();
        java.util.List list16 = keyedObjects2D1.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D1 and obj15", keyedObjects2D1.equals(obj15) ? keyedObjects2D1.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0.0d);
        int int23 = keyedObjects2D19.getRowIndex((java.lang.Comparable) 'a');
        int int25 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 10.0d);
        int int26 = keyedObjects2D19.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) int26, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1L));
        java.util.List list30 = keyedObjects2D0.getColumnKeys();
        java.util.List list31 = keyedObjects2D0.getRowKeys();
        java.util.List list32 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj33 = keyedObjects2D0.clone();
        java.lang.Object obj34 = keyedObjects2D0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj33", keyedObjects2D0.equals(obj33) ? keyedObjects2D0.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj12 = keyedObjects2D8.clone();
        int int13 = keyedObjects2D8.getColumnCount();
        int int15 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean16 = keyedObjects2D0.equals((java.lang.Object) (short) 10);
        java.util.List list17 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj18 = keyedObjects2D0.clone();
        java.lang.Object obj19 = keyedObjects2D0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj18", keyedObjects2D0.equals(obj18) ? keyedObjects2D0.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj13 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int21 = keyedObjects2D14.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int21, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int26 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.util.List list28 = keyedObjects2D27.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj32 = null;
        boolean boolean33 = keyedObjects2D8.equals(obj32);
        keyedObjects2D8.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D8.removeRow((int) (short) 0);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 100L);
        keyedObjects2D8.addObject((java.lang.Object) ' ', (java.lang.Comparable) "hi!", (java.lang.Comparable) 2);
        org.jfree.data.KeyedObjects2D keyedObjects2D46 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D47 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D46.addObject((java.lang.Object) keyedObjects2D47, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int51 = keyedObjects2D47.getRowCount();
        java.util.List list52 = keyedObjects2D47.getColumnKeys();
        java.util.List list53 = keyedObjects2D47.getColumnKeys();
        java.util.List list54 = keyedObjects2D47.getRowKeys();
        boolean boolean55 = keyedObjects2D8.equals((java.lang.Object) keyedObjects2D47);
        int int56 = keyedObjects2D47.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D57 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D57.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int63 = keyedObjects2D57.getColumnIndex((java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D64 = new org.jfree.data.KeyedObjects2D();
        int int65 = keyedObjects2D64.getRowCount();
        int int67 = keyedObjects2D64.getRowIndex((java.lang.Comparable) (byte) -1);
        int int69 = keyedObjects2D64.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list70 = keyedObjects2D64.getRowKeys();
        keyedObjects2D64.removeObject((java.lang.Comparable) (short) 10, (java.lang.Comparable) (short) 100);
        boolean boolean74 = keyedObjects2D57.equals((java.lang.Object) keyedObjects2D64);
        keyedObjects2D47.addObject((java.lang.Object) boolean74, (java.lang.Comparable) 0, (java.lang.Comparable) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D14 and keyedObjects2D57", keyedObjects2D14.equals(keyedObjects2D57) ? keyedObjects2D14.hashCode() == keyedObjects2D57.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj12 = keyedObjects2D8.clone();
        int int13 = keyedObjects2D8.getColumnCount();
        int int15 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean16 = keyedObjects2D0.equals((java.lang.Object) (short) 10);
        java.lang.Object obj17 = keyedObjects2D0.clone();
        int int19 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj17", keyedObjects2D0.equals(obj17) ? keyedObjects2D0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0.0d);
        int int23 = keyedObjects2D19.getRowIndex((java.lang.Comparable) 'a');
        int int25 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 10.0d);
        int int26 = keyedObjects2D19.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) int26, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1L));
        int int31 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0d);
        java.lang.Object obj32 = keyedObjects2D0.clone();
        int int34 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj32", keyedObjects2D0.equals(obj32) ? keyedObjects2D0.hashCode() == obj32.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        int int29 = keyedObjects2D0.getRowCount();
        int int30 = keyedObjects2D0.getRowCount();
        int int31 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = new org.jfree.data.KeyedObjects2D();
        int int34 = keyedObjects2D32.getColumnIndex((java.lang.Comparable) 0.0d);
        int int36 = keyedObjects2D32.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj37 = keyedObjects2D32.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D38 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D38.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int44 = keyedObjects2D38.getColumnIndex((java.lang.Comparable) 0L);
        int int45 = keyedObjects2D38.getRowCount();
        keyedObjects2D32.setObject((java.lang.Object) int45, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int50 = keyedObjects2D32.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D51 = new org.jfree.data.KeyedObjects2D();
        java.util.List list52 = keyedObjects2D51.getRowKeys();
        keyedObjects2D32.setObject((java.lang.Object) keyedObjects2D51, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj56 = null;
        boolean boolean57 = keyedObjects2D32.equals(obj56);
        keyedObjects2D32.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D32.removeRow((int) (short) 0);
        java.lang.Object obj63 = keyedObjects2D32.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D64 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D64.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list69 = keyedObjects2D64.getRowKeys();
        keyedObjects2D64.removeRow((int) (byte) 0);
        java.lang.Class<?> wildcardClass72 = keyedObjects2D64.getClass();
        keyedObjects2D32.setObject((java.lang.Object) wildcardClass72, (java.lang.Comparable) (short) 0, (java.lang.Comparable) 1.0d);
        java.util.List list76 = keyedObjects2D32.getColumnKeys();
        keyedObjects2D0.setObject((java.lang.Object) list76, (java.lang.Comparable) '#', (java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D6 and keyedObjects2D38", keyedObjects2D6.equals(keyedObjects2D38) ? keyedObjects2D6.hashCode() == keyedObjects2D38.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        keyedObjects2D0.removeObject((java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) -1);
        int int12 = keyedObjects2D0.getRowIndex((java.lang.Comparable) "hi!");
        java.lang.Object obj13 = keyedObjects2D0.clone();
        int int15 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj13", keyedObjects2D0.equals(obj13) ? keyedObjects2D0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.addObject((java.lang.Object) keyedObjects2D9, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj13 = keyedObjects2D9.clone();
        keyedObjects2D9.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj18 = null;
        boolean boolean19 = keyedObjects2D9.equals(obj18);
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) boolean19);
        int int21 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        int int24 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 0.0d);
        int int26 = keyedObjects2D22.getRowIndex((java.lang.Comparable) 'a');
        int int28 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 10.0d);
        int int29 = keyedObjects2D22.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D30.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D30.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D22.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        keyedObjects2D22.setObject((java.lang.Object) 1, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1));
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D22, (java.lang.Comparable) (-1L), (java.lang.Comparable) (-1.0f));
        java.util.List list48 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj49 = keyedObjects2D0.clone();
        int int51 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj49", keyedObjects2D0.equals(obj49) ? keyedObjects2D0.hashCode() == obj49.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.addObject((java.lang.Object) (short) 100, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        int int14 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 0.0d);
        int int16 = keyedObjects2D12.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj17 = keyedObjects2D12.clone();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D12, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D21.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj28 = keyedObjects2D21.getObject(0, 0);
        boolean boolean29 = keyedObjects2D12.equals((java.lang.Object) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D30.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D30.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int38 = keyedObjects2D30.getRowCount();
        int int39 = keyedObjects2D30.getRowCount();
        int int41 = keyedObjects2D30.getColumnIndex((java.lang.Comparable) ' ');
        java.util.List list42 = keyedObjects2D30.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D43 = new org.jfree.data.KeyedObjects2D();
        int int45 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) 0.0d);
        int int47 = keyedObjects2D43.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj48 = keyedObjects2D43.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D49 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D49.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int55 = keyedObjects2D49.getColumnIndex((java.lang.Comparable) 0L);
        int int56 = keyedObjects2D49.getRowCount();
        keyedObjects2D43.setObject((java.lang.Object) int56, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int61 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D62 = new org.jfree.data.KeyedObjects2D();
        java.util.List list63 = keyedObjects2D62.getRowKeys();
        keyedObjects2D43.setObject((java.lang.Object) keyedObjects2D62, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj67 = null;
        boolean boolean68 = keyedObjects2D43.equals(obj67);
        org.jfree.data.KeyedObjects2D keyedObjects2D69 = new org.jfree.data.KeyedObjects2D();
        int int70 = keyedObjects2D69.getRowCount();
        int int72 = keyedObjects2D69.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj73 = keyedObjects2D69.clone();
        int int74 = keyedObjects2D69.getColumnCount();
        keyedObjects2D43.setObject((java.lang.Object) keyedObjects2D69, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0f);
        keyedObjects2D30.addObject((java.lang.Object) keyedObjects2D69, (java.lang.Comparable) 1, (java.lang.Comparable) '4');
        int int81 = keyedObjects2D69.getColumnCount();
        keyedObjects2D12.setObject((java.lang.Object) keyedObjects2D69, (java.lang.Comparable) false, (java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D21 and keyedObjects2D49", keyedObjects2D21.equals(keyedObjects2D49) ? keyedObjects2D21.hashCode() == keyedObjects2D49.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj13 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int21 = keyedObjects2D14.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int21, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int26 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.util.List list28 = keyedObjects2D27.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj32 = null;
        boolean boolean33 = keyedObjects2D8.equals(obj32);
        keyedObjects2D8.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D8.removeRow((int) (short) 0);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 100L);
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D43 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D42.addObject((java.lang.Object) keyedObjects2D43, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj47 = keyedObjects2D43.clone();
        keyedObjects2D0.setObject(obj47, (java.lang.Comparable) 10, (java.lang.Comparable) (short) 1);
        java.lang.Comparable comparable52 = keyedObjects2D0.getColumnKey((int) (short) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D53 = new org.jfree.data.KeyedObjects2D();
        int int55 = keyedObjects2D53.getColumnIndex((java.lang.Comparable) 0.0d);
        int int57 = keyedObjects2D53.getRowIndex((java.lang.Comparable) 'a');
        int int59 = keyedObjects2D53.getColumnIndex((java.lang.Comparable) 10.0d);
        int int60 = keyedObjects2D53.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D61 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D61.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D61.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D53.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D72 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D73 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D72.addObject((java.lang.Object) keyedObjects2D73, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj77 = keyedObjects2D73.clone();
        int int78 = keyedObjects2D73.getColumnCount();
        java.lang.Object obj79 = keyedObjects2D73.clone();
        java.util.List list80 = keyedObjects2D73.getRowKeys();
        boolean boolean81 = keyedObjects2D53.equals((java.lang.Object) keyedObjects2D73);
        org.jfree.data.KeyedObjects2D keyedObjects2D82 = new org.jfree.data.KeyedObjects2D();
        int int83 = keyedObjects2D82.getRowCount();
        int int85 = keyedObjects2D82.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D82.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int90 = keyedObjects2D82.getColumnIndex((java.lang.Comparable) 0.0f);
        java.util.List list91 = keyedObjects2D82.getColumnKeys();
        keyedObjects2D53.setObject((java.lang.Object) keyedObjects2D82, (java.lang.Comparable) 'a', (java.lang.Comparable) 3);
        java.util.List list95 = keyedObjects2D53.getColumnKeys();
        keyedObjects2D0.setObject((java.lang.Object) list95, (java.lang.Comparable) true, (java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D42 and keyedObjects2D72", keyedObjects2D42.equals(keyedObjects2D72) ? keyedObjects2D42.hashCode() == keyedObjects2D72.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int9 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 10);
        keyedObjects2D0.removeObject((java.lang.Comparable) true, (java.lang.Comparable) 10);
        java.lang.Object obj13 = keyedObjects2D0.clone();
        java.lang.Object obj14 = keyedObjects2D0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj13", keyedObjects2D0.equals(obj13) ? keyedObjects2D0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getRowIndex((java.lang.Comparable) '4');
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        int int9 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        java.lang.Object obj10 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = new org.jfree.data.KeyedObjects2D();
        int int13 = keyedObjects2D11.getColumnIndex((java.lang.Comparable) 0.0d);
        int int15 = keyedObjects2D11.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj16 = keyedObjects2D11.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D17.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int23 = keyedObjects2D17.getColumnIndex((java.lang.Comparable) 0L);
        int int24 = keyedObjects2D17.getRowCount();
        keyedObjects2D11.setObject((java.lang.Object) int24, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int29 = keyedObjects2D11.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        java.util.List list31 = keyedObjects2D30.getRowKeys();
        keyedObjects2D11.setObject((java.lang.Object) keyedObjects2D30, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D35.addObject((java.lang.Object) keyedObjects2D36, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int40 = keyedObjects2D36.getRowCount();
        boolean boolean41 = keyedObjects2D11.equals((java.lang.Object) int40);
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        int int43 = keyedObjects2D42.getRowCount();
        boolean boolean45 = keyedObjects2D42.equals((java.lang.Object) 10.0d);
        keyedObjects2D11.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean50 = keyedObjects2D11.equals((java.lang.Object) 10L);
        org.jfree.data.KeyedObjects2D keyedObjects2D51 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D51.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D51.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        java.util.List list59 = keyedObjects2D51.getColumnKeys();
        keyedObjects2D11.addObject((java.lang.Object) keyedObjects2D51, (java.lang.Comparable) true, (java.lang.Comparable) (short) 0);
        java.lang.Object obj63 = keyedObjects2D51.clone();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D51, (java.lang.Comparable) "", (java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D51 and obj63", keyedObjects2D51.equals(obj63) ? keyedObjects2D51.hashCode() == obj63.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list6 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 10, (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj15 = keyedObjects2D10.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D16.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int22 = keyedObjects2D16.getColumnIndex((java.lang.Comparable) 0L);
        int int23 = keyedObjects2D16.getRowCount();
        keyedObjects2D10.setObject((java.lang.Object) int23, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int28 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        java.util.List list30 = keyedObjects2D29.getRowKeys();
        keyedObjects2D10.setObject((java.lang.Object) keyedObjects2D29, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.util.List list34 = keyedObjects2D10.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        java.lang.Object obj38 = null;
        boolean boolean39 = keyedObjects2D0.equals(obj38);
        int int40 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D41 = new org.jfree.data.KeyedObjects2D();
        int int43 = keyedObjects2D41.getColumnIndex((java.lang.Comparable) 0.0d);
        int int45 = keyedObjects2D41.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj46 = keyedObjects2D41.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D47 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D47.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int53 = keyedObjects2D47.getColumnIndex((java.lang.Comparable) 0L);
        int int54 = keyedObjects2D47.getRowCount();
        keyedObjects2D41.setObject((java.lang.Object) int54, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int59 = keyedObjects2D41.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D60 = new org.jfree.data.KeyedObjects2D();
        java.util.List list61 = keyedObjects2D60.getRowKeys();
        keyedObjects2D41.setObject((java.lang.Object) keyedObjects2D60, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj65 = null;
        boolean boolean66 = keyedObjects2D41.equals(obj65);
        keyedObjects2D41.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D41.removeRow((int) (short) 0);
        keyedObjects2D41.removeRow((int) (byte) 0);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D41, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D16 and keyedObjects2D47", keyedObjects2D16.equals(keyedObjects2D47) ? keyedObjects2D16.hashCode() == keyedObjects2D47.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D5.addObject((java.lang.Object) keyedObjects2D6, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int11 = keyedObjects2D5.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.List list12 = keyedObjects2D5.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) list12, (java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 0);
        java.util.List list16 = keyedObjects2D0.getColumnKeys();
        java.lang.Object obj17 = keyedObjects2D0.clone();
        java.util.List list18 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj17", keyedObjects2D0.equals(obj17) ? keyedObjects2D0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        keyedObjects2D0.setObject((java.lang.Object) 1, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1));
        java.lang.Object obj23 = keyedObjects2D0.clone();
        java.util.List list24 = keyedObjects2D0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj23", keyedObjects2D0.equals(obj23) ? keyedObjects2D0.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int25 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        int int26 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D27.addObject((java.lang.Object) keyedObjects2D28, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int32 = keyedObjects2D28.getRowCount();
        int int33 = keyedObjects2D28.getRowCount();
        java.util.List list34 = keyedObjects2D28.getColumnKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D28, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (-1L));
        org.jfree.data.KeyedObjects2D keyedObjects2D38 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D38.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Comparable comparable44 = keyedObjects2D38.getRowKey(0);
        java.lang.Object obj45 = keyedObjects2D38.clone();
        boolean boolean46 = keyedObjects2D28.equals((java.lang.Object) keyedObjects2D38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D6 and keyedObjects2D38", keyedObjects2D6.equals(keyedObjects2D38) ? keyedObjects2D6.hashCode() == keyedObjects2D38.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        int int8 = keyedObjects2D0.getRowCount();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        int int15 = keyedObjects2D14.getRowCount();
        boolean boolean17 = keyedObjects2D14.equals((java.lang.Object) 10.0d);
        int int19 = keyedObjects2D14.getRowIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        int int22 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) 0.0d);
        int int24 = keyedObjects2D20.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D20.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list28 = keyedObjects2D20.getColumnKeys();
        boolean boolean29 = keyedObjects2D14.equals((java.lang.Object) list28);
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D30.addObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj35 = keyedObjects2D31.clone();
        keyedObjects2D31.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.util.List list40 = keyedObjects2D31.getColumnKeys();
        boolean boolean41 = keyedObjects2D14.equals((java.lang.Object) keyedObjects2D31);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) 3, (java.lang.Comparable) 100);
        int int45 = keyedObjects2D31.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D46 = new org.jfree.data.KeyedObjects2D();
        int int47 = keyedObjects2D46.getRowCount();
        int int49 = keyedObjects2D46.getRowIndex((java.lang.Comparable) (byte) -1);
        int int51 = keyedObjects2D46.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D46.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D56 = new org.jfree.data.KeyedObjects2D();
        int int58 = keyedObjects2D56.getColumnIndex((java.lang.Comparable) 0.0d);
        int int60 = keyedObjects2D56.getRowIndex((java.lang.Comparable) 'a');
        int int62 = keyedObjects2D56.getColumnIndex((java.lang.Comparable) 10.0d);
        int int63 = keyedObjects2D56.getColumnCount();
        int int64 = keyedObjects2D56.getRowCount();
        java.lang.Object obj65 = keyedObjects2D56.clone();
        boolean boolean66 = keyedObjects2D46.equals((java.lang.Object) keyedObjects2D56);
        java.lang.Comparable comparable67 = null;
        int int68 = keyedObjects2D46.getColumnIndex(comparable67);
        keyedObjects2D31.addObject((java.lang.Object) int68, (java.lang.Comparable) (-1), (java.lang.Comparable) (short) 0);
        java.lang.Object obj72 = keyedObjects2D31.clone();
        int int74 = keyedObjects2D31.getColumnIndex((java.lang.Comparable) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D31 and obj72", keyedObjects2D31.equals(obj72) ? keyedObjects2D31.hashCode() == obj72.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) "");
        int int7 = keyedObjects2D0.getColumnCount();
        java.util.List list8 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj9 = keyedObjects2D0.clone();
        java.util.List list10 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj9", keyedObjects2D0.equals(obj9) ? keyedObjects2D0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        keyedObjects2D0.setObject((java.lang.Object) 1, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1));
        keyedObjects2D0.removeRow(0);
        java.lang.Object obj25 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D26.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list31 = keyedObjects2D26.getRowKeys();
        keyedObjects2D26.removeRow((int) (byte) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = new org.jfree.data.KeyedObjects2D();
        int int36 = keyedObjects2D34.getColumnIndex((java.lang.Comparable) 0.0d);
        int int38 = keyedObjects2D34.getRowIndex((java.lang.Comparable) 'a');
        int int40 = keyedObjects2D34.getColumnIndex((java.lang.Comparable) 10.0d);
        int int41 = keyedObjects2D34.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D42.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D42.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D34.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D53 = new org.jfree.data.KeyedObjects2D();
        int int55 = keyedObjects2D53.getColumnIndex((java.lang.Comparable) 0.0d);
        int int57 = keyedObjects2D53.getRowIndex((java.lang.Comparable) 'a');
        int int59 = keyedObjects2D53.getColumnIndex((java.lang.Comparable) 10.0d);
        int int60 = keyedObjects2D53.getColumnCount();
        keyedObjects2D34.setObject((java.lang.Object) int60, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1L));
        java.util.List list64 = keyedObjects2D34.getColumnKeys();
        int int66 = keyedObjects2D34.getRowIndex((java.lang.Comparable) (byte) 10);
        boolean boolean67 = keyedObjects2D26.equals((java.lang.Object) keyedObjects2D34);
        java.lang.Object obj68 = keyedObjects2D34.clone();
        boolean boolean69 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj25", keyedObjects2D0.equals(obj25) ? keyedObjects2D0.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Comparable comparable6 = keyedObjects2D0.getRowKey(0);
        java.lang.Object obj7 = keyedObjects2D0.clone();
        java.util.List list8 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj7", keyedObjects2D0.equals(obj7) ? keyedObjects2D0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        keyedObjects2D0.removeObject((java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) -1);
        java.lang.Object obj11 = keyedObjects2D0.clone();
        java.lang.Object obj12 = keyedObjects2D0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj11", keyedObjects2D0.equals(obj11) ? keyedObjects2D0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        int int6 = keyedObjects2D0.getRowCount();
        java.lang.Object obj7 = keyedObjects2D0.clone();
        int int8 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        int int11 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 0.0d);
        int int13 = keyedObjects2D9.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj14 = keyedObjects2D9.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D15.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int21 = keyedObjects2D15.getColumnIndex((java.lang.Comparable) 0L);
        int int22 = keyedObjects2D15.getRowCount();
        keyedObjects2D9.setObject((java.lang.Object) int22, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int27 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        java.util.List list29 = keyedObjects2D28.getRowKeys();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D28, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj33 = null;
        boolean boolean34 = keyedObjects2D9.equals(obj33);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        int int36 = keyedObjects2D35.getRowCount();
        int int38 = keyedObjects2D35.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj39 = keyedObjects2D35.clone();
        int int40 = keyedObjects2D35.getColumnCount();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D35, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0f);
        keyedObjects2D0.addObject((java.lang.Object) (byte) 0, (java.lang.Comparable) (short) 0, (java.lang.Comparable) true);
        java.lang.Object obj47 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D48 = new org.jfree.data.KeyedObjects2D();
        int int49 = keyedObjects2D48.getRowCount();
        int int51 = keyedObjects2D48.getRowIndex((java.lang.Comparable) (byte) -1);
        int int53 = keyedObjects2D48.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D48.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D58 = new org.jfree.data.KeyedObjects2D();
        int int60 = keyedObjects2D58.getColumnIndex((java.lang.Comparable) 0.0d);
        int int62 = keyedObjects2D58.getRowIndex((java.lang.Comparable) 'a');
        int int64 = keyedObjects2D58.getColumnIndex((java.lang.Comparable) 10.0d);
        int int65 = keyedObjects2D58.getColumnCount();
        int int66 = keyedObjects2D58.getRowCount();
        java.lang.Object obj67 = keyedObjects2D58.clone();
        boolean boolean68 = keyedObjects2D48.equals((java.lang.Object) keyedObjects2D58);
        java.lang.Comparable comparable69 = null;
        int int70 = keyedObjects2D48.getColumnIndex(comparable69);
        java.lang.Object obj71 = keyedObjects2D48.clone();
        keyedObjects2D0.setObject(obj71, (java.lang.Comparable) true, (java.lang.Comparable) 10.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D48 and obj71", keyedObjects2D48.equals(obj71) ? keyedObjects2D48.hashCode() == obj71.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list3 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = new org.jfree.data.KeyedObjects2D();
        int int6 = keyedObjects2D4.getColumnIndex((java.lang.Comparable) 0.0d);
        int int8 = keyedObjects2D4.getRowIndex((java.lang.Comparable) 'a');
        int int10 = keyedObjects2D4.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list11 = keyedObjects2D4.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) list11, (java.lang.Comparable) 100L, (java.lang.Comparable) 0);
        java.lang.Object obj15 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj15", keyedObjects2D0.equals(obj15) ? keyedObjects2D0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        int int14 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list15 = keyedObjects2D8.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) false, (java.lang.Comparable) (short) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D19.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list24 = keyedObjects2D19.getRowKeys();
        int int25 = keyedObjects2D19.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D26.addObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj31 = keyedObjects2D27.clone();
        int int32 = keyedObjects2D27.getColumnCount();
        int int34 = keyedObjects2D27.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean35 = keyedObjects2D19.equals((java.lang.Object) (short) 10);
        java.util.List list36 = keyedObjects2D19.getRowKeys();
        java.lang.Object obj37 = keyedObjects2D19.clone();
        keyedObjects2D0.setObject(obj37, (java.lang.Comparable) 10.0f, (java.lang.Comparable) 1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D19 and obj37", keyedObjects2D19.equals(obj37) ? keyedObjects2D19.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        keyedObjects2D0.setObject((java.lang.Object) 1, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1));
        java.lang.Object obj23 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass24 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj23", keyedObjects2D0.equals(obj23) ? keyedObjects2D0.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list3 = keyedObjects2D0.getRowKeys();
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D5.addObject((java.lang.Object) keyedObjects2D6, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj10 = keyedObjects2D6.clone();
        int int11 = keyedObjects2D6.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D6, (java.lang.Comparable) 10.0d, (java.lang.Comparable) "");
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D15.addObject((java.lang.Object) keyedObjects2D16, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj20 = keyedObjects2D16.clone();
        int int21 = keyedObjects2D16.getColumnCount();
        java.lang.Object obj22 = keyedObjects2D16.clone();
        java.util.List list23 = keyedObjects2D16.getRowKeys();
        java.util.List list24 = keyedObjects2D16.getRowKeys();
        java.lang.Object obj25 = keyedObjects2D16.clone();
        keyedObjects2D0.setObject(obj25, (java.lang.Comparable) 100.0f, (java.lang.Comparable) "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D5 and keyedObjects2D15", keyedObjects2D5.equals(keyedObjects2D15) ? keyedObjects2D5.hashCode() == keyedObjects2D15.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list6 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 10, (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj15 = keyedObjects2D10.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D16.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int22 = keyedObjects2D16.getColumnIndex((java.lang.Comparable) 0L);
        int int23 = keyedObjects2D16.getRowCount();
        keyedObjects2D10.setObject((java.lang.Object) int23, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int28 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        java.util.List list30 = keyedObjects2D29.getRowKeys();
        keyedObjects2D10.setObject((java.lang.Object) keyedObjects2D29, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.util.List list34 = keyedObjects2D10.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        java.lang.Object obj38 = null;
        boolean boolean39 = keyedObjects2D0.equals(obj38);
        int int40 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D41 = new org.jfree.data.KeyedObjects2D();
        int int42 = keyedObjects2D41.getRowCount();
        int int44 = keyedObjects2D41.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D41.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int48 = keyedObjects2D41.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D49 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D49.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj56 = keyedObjects2D49.getObject(0, 0);
        int int57 = keyedObjects2D49.getRowCount();
        keyedObjects2D41.setObject((java.lang.Object) keyedObjects2D49, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D61 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D61.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list66 = keyedObjects2D61.getRowKeys();
        int int67 = keyedObjects2D61.getRowCount();
        java.util.List list68 = keyedObjects2D61.getColumnKeys();
        keyedObjects2D61.addObject((java.lang.Object) 10.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0f);
        int int74 = keyedObjects2D61.getColumnIndex((java.lang.Comparable) '4');
        boolean boolean75 = keyedObjects2D49.equals((java.lang.Object) int74);
        java.lang.Comparable comparable77 = keyedObjects2D49.getRowKey((int) (byte) 0);
        java.util.List list78 = keyedObjects2D49.getRowKeys();
        boolean boolean79 = keyedObjects2D0.equals((java.lang.Object) list78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D16 and keyedObjects2D49", keyedObjects2D16.equals(keyedObjects2D49) ? keyedObjects2D16.hashCode() == keyedObjects2D49.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj13 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int21 = keyedObjects2D14.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int21, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int26 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.util.List list28 = keyedObjects2D27.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D32.addObject((java.lang.Object) keyedObjects2D33, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int37 = keyedObjects2D33.getRowCount();
        boolean boolean38 = keyedObjects2D8.equals((java.lang.Object) int37);
        org.jfree.data.KeyedObjects2D keyedObjects2D39 = new org.jfree.data.KeyedObjects2D();
        int int40 = keyedObjects2D39.getRowCount();
        boolean boolean42 = keyedObjects2D39.equals((java.lang.Object) 10.0d);
        keyedObjects2D8.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean47 = keyedObjects2D8.equals((java.lang.Object) 10L);
        boolean boolean48 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D8);
        java.util.List list49 = keyedObjects2D8.getColumnKeys();
        java.lang.Object obj50 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D51 = new org.jfree.data.KeyedObjects2D();
        int int53 = keyedObjects2D51.getColumnIndex((java.lang.Comparable) 0.0d);
        int int55 = keyedObjects2D51.getRowIndex((java.lang.Comparable) 'a');
        int int57 = keyedObjects2D51.getColumnIndex((java.lang.Comparable) 10.0d);
        int int58 = keyedObjects2D51.getColumnCount();
        int int59 = keyedObjects2D51.getRowCount();
        java.lang.Object obj60 = keyedObjects2D51.clone();
        int int61 = keyedObjects2D51.getColumnCount();
        boolean boolean62 = keyedObjects2D8.equals((java.lang.Object) keyedObjects2D51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D8 and obj50", keyedObjects2D8.equals(obj50) ? keyedObjects2D8.hashCode() == obj50.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D0.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj13 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int21 = keyedObjects2D14.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int21, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int26 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.util.List list28 = keyedObjects2D27.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D32.addObject((java.lang.Object) keyedObjects2D33, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int37 = keyedObjects2D33.getRowCount();
        boolean boolean38 = keyedObjects2D8.equals((java.lang.Object) int37);
        org.jfree.data.KeyedObjects2D keyedObjects2D39 = new org.jfree.data.KeyedObjects2D();
        int int40 = keyedObjects2D39.getRowCount();
        boolean boolean42 = keyedObjects2D39.equals((java.lang.Object) 10.0d);
        keyedObjects2D8.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean47 = keyedObjects2D8.equals((java.lang.Object) 10L);
        boolean boolean48 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D8);
        java.util.List list49 = keyedObjects2D8.getColumnKeys();
        java.lang.Object obj50 = keyedObjects2D8.clone();
        int int52 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D8 and obj50", keyedObjects2D8.equals(obj50) ? keyedObjects2D8.hashCode() == obj50.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.addObject((java.lang.Object) (short) 100, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        int int14 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 0.0d);
        int int16 = keyedObjects2D12.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj17 = keyedObjects2D12.clone();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D12, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        java.lang.Comparable comparable22 = keyedObjects2D0.getColumnKey((int) (byte) 0);
        int int23 = keyedObjects2D0.getRowCount();
        java.lang.Comparable comparable25 = keyedObjects2D0.getRowKey((int) (short) 1);
        java.util.List list26 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        int int29 = keyedObjects2D27.getColumnIndex((java.lang.Comparable) 0.0d);
        int int31 = keyedObjects2D27.getRowIndex((java.lang.Comparable) 'a');
        int int33 = keyedObjects2D27.getColumnIndex((java.lang.Comparable) 10.0d);
        int int34 = keyedObjects2D27.getRowCount();
        keyedObjects2D27.addObject((java.lang.Object) (short) 100, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D39 = new org.jfree.data.KeyedObjects2D();
        int int41 = keyedObjects2D39.getColumnIndex((java.lang.Comparable) 0.0d);
        int int43 = keyedObjects2D39.getRowIndex((java.lang.Comparable) 'a');
        int int45 = keyedObjects2D39.getColumnIndex((java.lang.Comparable) 10.0d);
        int int46 = keyedObjects2D39.getRowCount();
        keyedObjects2D39.addObject((java.lang.Object) (short) 100, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D51 = new org.jfree.data.KeyedObjects2D();
        int int53 = keyedObjects2D51.getColumnIndex((java.lang.Comparable) 0.0d);
        int int55 = keyedObjects2D51.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj56 = keyedObjects2D51.clone();
        keyedObjects2D39.setObject((java.lang.Object) keyedObjects2D51, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        java.util.List list60 = keyedObjects2D51.getColumnKeys();
        keyedObjects2D27.addObject((java.lang.Object) keyedObjects2D51, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 10.0d);
        boolean boolean64 = keyedObjects2D0.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and keyedObjects2D39", keyedObjects2D0.equals(keyedObjects2D39) ? keyedObjects2D0.hashCode() == keyedObjects2D39.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        java.util.List list19 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        int int22 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) 0.0d);
        int int24 = keyedObjects2D20.getRowIndex((java.lang.Comparable) 'a');
        int int26 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) 10.0d);
        int int27 = keyedObjects2D20.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D28.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D28.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D20.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        keyedObjects2D20.setObject((java.lang.Object) 1, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1));
        keyedObjects2D20.removeRow(0);
        boolean boolean45 = keyedObjects2D0.equals((java.lang.Object) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D46 = new org.jfree.data.KeyedObjects2D();
        int int48 = keyedObjects2D46.getColumnIndex((java.lang.Comparable) 0.0d);
        int int50 = keyedObjects2D46.getRowIndex((java.lang.Comparable) 'a');
        int int52 = keyedObjects2D46.getColumnIndex((java.lang.Comparable) 10.0d);
        int int53 = keyedObjects2D46.getRowCount();
        keyedObjects2D46.addObject((java.lang.Object) (short) 100, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D58 = new org.jfree.data.KeyedObjects2D();
        int int60 = keyedObjects2D58.getColumnIndex((java.lang.Comparable) 0.0d);
        int int62 = keyedObjects2D58.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj63 = keyedObjects2D58.clone();
        keyedObjects2D46.setObject((java.lang.Object) keyedObjects2D58, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D67 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D67.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj74 = keyedObjects2D67.getObject(0, 0);
        boolean boolean75 = keyedObjects2D58.equals((java.lang.Object) 0);
        java.lang.Object obj76 = keyedObjects2D58.clone();
        keyedObjects2D58.removeObject((java.lang.Comparable) 1, (java.lang.Comparable) (short) 100);
        boolean boolean80 = keyedObjects2D0.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D6 and keyedObjects2D67", keyedObjects2D6.equals(keyedObjects2D67) ? keyedObjects2D6.hashCode() == keyedObjects2D67.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        int int8 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D9.getRowCount();
        int int12 = keyedObjects2D9.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D9.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int16 = keyedObjects2D9.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D17.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj24 = keyedObjects2D17.getObject(0, 0);
        int int25 = keyedObjects2D17.getRowCount();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D17, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        boolean boolean29 = keyedObjects2D0.equals((java.lang.Object) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D30.addObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        int int37 = keyedObjects2D35.getColumnIndex((java.lang.Comparable) 0.0d);
        int int39 = keyedObjects2D35.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D35.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D43 = new org.jfree.data.KeyedObjects2D();
        int int45 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) 0.0d);
        int int47 = keyedObjects2D43.getRowIndex((java.lang.Comparable) 'a');
        int int49 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list50 = keyedObjects2D43.getRowKeys();
        keyedObjects2D35.setObject((java.lang.Object) keyedObjects2D43, (java.lang.Comparable) false, (java.lang.Comparable) (short) 1);
        int int55 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) 100);
        boolean boolean56 = keyedObjects2D31.equals((java.lang.Object) keyedObjects2D43);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) true, (java.lang.Comparable) (short) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D60 = new org.jfree.data.KeyedObjects2D();
        int int62 = keyedObjects2D60.getColumnIndex((java.lang.Comparable) 0.0d);
        int int64 = keyedObjects2D60.getRowIndex((java.lang.Comparable) 'a');
        int int66 = keyedObjects2D60.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list67 = keyedObjects2D60.getRowKeys();
        java.util.List list68 = keyedObjects2D60.getColumnKeys();
        int int69 = keyedObjects2D60.getColumnCount();
        java.util.List list70 = keyedObjects2D60.getRowKeys();
        boolean boolean71 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D60);
        java.lang.Object obj72 = keyedObjects2D0.clone();
        java.util.List list73 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj72", keyedObjects2D0.equals(obj72) ? keyedObjects2D0.hashCode() == obj72.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        java.util.List list21 = keyedObjects2D20.getRowKeys();
        java.lang.Object obj22 = keyedObjects2D20.clone();
        keyedObjects2D0.setObject(obj22, (java.lang.Comparable) false, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        int int28 = keyedObjects2D26.getColumnIndex((java.lang.Comparable) 0.0d);
        int int30 = keyedObjects2D26.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D26.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list34 = keyedObjects2D26.getColumnKeys();
        keyedObjects2D26.removeObject((java.lang.Comparable) 'a', (java.lang.Comparable) 0.0f);
        boolean boolean38 = keyedObjects2D0.equals((java.lang.Object) 'a');
        java.util.List list39 = keyedObjects2D0.getColumnKeys();
        int int41 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj42 = keyedObjects2D0.clone();
        int int43 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj42", keyedObjects2D0.equals(obj42) ? keyedObjects2D0.hashCode() == obj42.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0.0d);
        int int23 = keyedObjects2D19.getRowIndex((java.lang.Comparable) 'a');
        int int25 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 10.0d);
        int int26 = keyedObjects2D19.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) int26, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1L));
        java.util.List list30 = keyedObjects2D0.getColumnKeys();
        java.util.List list31 = keyedObjects2D0.getRowKeys();
        java.util.List list32 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj33 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = new org.jfree.data.KeyedObjects2D();
        int int36 = keyedObjects2D34.getColumnIndex((java.lang.Comparable) 0.0d);
        int int37 = keyedObjects2D34.getColumnCount();
        java.lang.Object obj38 = keyedObjects2D34.clone();
        keyedObjects2D34.removeObject((java.lang.Comparable) 1.0f, (java.lang.Comparable) 10.0f);
        java.lang.Object obj42 = keyedObjects2D34.clone();
        boolean boolean43 = keyedObjects2D0.equals(obj42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj33", keyedObjects2D0.equals(obj33) ? keyedObjects2D0.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        int int8 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.addObject((java.lang.Object) 0L, (java.lang.Comparable) 100.0d, (java.lang.Comparable) false);
        java.lang.Object obj13 = keyedObjects2D0.clone();
        java.lang.Comparable comparable15 = keyedObjects2D0.getRowKey((int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj13", keyedObjects2D0.equals(obj13) ? keyedObjects2D0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj5 = keyedObjects2D1.clone();
        int int6 = keyedObjects2D1.getColumnCount();
        int int8 = keyedObjects2D1.getRowIndex((java.lang.Comparable) (short) 10);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        int int11 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 0.0d);
        int int13 = keyedObjects2D9.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D9.setObject((java.lang.Object) 10.0f, (java.lang.Comparable) 'a', (java.lang.Comparable) 10L);
        java.lang.Class<?> wildcardClass18 = keyedObjects2D9.getClass();
        keyedObjects2D1.setObject((java.lang.Object) wildcardClass18, (java.lang.Comparable) (-1L), (java.lang.Comparable) 3);
        java.util.List list22 = keyedObjects2D1.getRowKeys();
        java.lang.Object obj23 = keyedObjects2D1.clone();
        int int25 = keyedObjects2D1.getRowIndex((java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D1 and obj23", keyedObjects2D1.equals(obj23) ? keyedObjects2D1.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        int int9 = keyedObjects2D0.getColumnCount();
        int int10 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D11.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj18 = keyedObjects2D11.getObject(0, 0);
        keyedObjects2D11.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) (-1.0d));
        java.lang.Object obj22 = keyedObjects2D11.clone();
        boolean boolean23 = keyedObjects2D0.equals(obj22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D11 and obj22", keyedObjects2D11.equals(obj22) ? keyedObjects2D11.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        java.util.List list21 = keyedObjects2D20.getRowKeys();
        java.lang.Object obj22 = keyedObjects2D20.clone();
        keyedObjects2D0.setObject(obj22, (java.lang.Comparable) false, (java.lang.Comparable) "hi!");
        java.lang.Object obj26 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D27.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list32 = keyedObjects2D27.getRowKeys();
        int int33 = keyedObjects2D27.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D34.addObject((java.lang.Object) keyedObjects2D35, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj39 = keyedObjects2D35.clone();
        int int40 = keyedObjects2D35.getColumnCount();
        int int42 = keyedObjects2D35.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean43 = keyedObjects2D27.equals((java.lang.Object) (short) 10);
        java.util.List list44 = keyedObjects2D27.getRowKeys();
        keyedObjects2D27.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D48 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D48.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list53 = keyedObjects2D48.getRowKeys();
        int int54 = keyedObjects2D48.getColumnCount();
        java.util.List list55 = keyedObjects2D48.getColumnKeys();
        keyedObjects2D48.setObject((java.lang.Object) 10L, (java.lang.Comparable) 100.0d, (java.lang.Comparable) true);
        keyedObjects2D48.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) 0.0d);
        int int63 = keyedObjects2D48.getColumnCount();
        java.lang.Comparable comparable64 = null;
        int int65 = keyedObjects2D48.getRowIndex(comparable64);
        keyedObjects2D27.setObject((java.lang.Object) keyedObjects2D48, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) "");
        boolean boolean69 = keyedObjects2D0.equals((java.lang.Object) "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj26", keyedObjects2D0.equals(obj26) ? keyedObjects2D0.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int25 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        java.util.List list26 = keyedObjects2D0.getColumnKeys();
        int int27 = keyedObjects2D0.getColumnCount();
        int int28 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.removeObject((java.lang.Comparable) 'a', (java.lang.Comparable) ' ');
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = new org.jfree.data.KeyedObjects2D();
        int int34 = keyedObjects2D32.getColumnIndex((java.lang.Comparable) 0.0d);
        int int35 = keyedObjects2D32.getColumnCount();
        int int36 = keyedObjects2D32.getColumnCount();
        java.lang.Object obj37 = keyedObjects2D32.clone();
        int int39 = keyedObjects2D32.getColumnIndex((java.lang.Comparable) (short) 10);
        org.jfree.data.KeyedObjects2D keyedObjects2D40 = new org.jfree.data.KeyedObjects2D();
        int int42 = keyedObjects2D40.getColumnIndex((java.lang.Comparable) 0.0d);
        int int44 = keyedObjects2D40.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D40.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D48 = new org.jfree.data.KeyedObjects2D();
        int int50 = keyedObjects2D48.getColumnIndex((java.lang.Comparable) 0.0d);
        int int52 = keyedObjects2D48.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj53 = keyedObjects2D48.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D54 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D54.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int60 = keyedObjects2D54.getColumnIndex((java.lang.Comparable) 0L);
        int int61 = keyedObjects2D54.getRowCount();
        keyedObjects2D48.setObject((java.lang.Object) int61, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int66 = keyedObjects2D48.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D67 = new org.jfree.data.KeyedObjects2D();
        java.util.List list68 = keyedObjects2D67.getRowKeys();
        keyedObjects2D48.setObject((java.lang.Object) keyedObjects2D67, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D72 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D73 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D72.addObject((java.lang.Object) keyedObjects2D73, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int77 = keyedObjects2D73.getRowCount();
        boolean boolean78 = keyedObjects2D48.equals((java.lang.Object) int77);
        org.jfree.data.KeyedObjects2D keyedObjects2D79 = new org.jfree.data.KeyedObjects2D();
        int int80 = keyedObjects2D79.getRowCount();
        boolean boolean82 = keyedObjects2D79.equals((java.lang.Object) 10.0d);
        keyedObjects2D48.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean87 = keyedObjects2D48.equals((java.lang.Object) 10L);
        boolean boolean88 = keyedObjects2D40.equals((java.lang.Object) keyedObjects2D48);
        java.util.List list89 = keyedObjects2D48.getColumnKeys();
        boolean boolean90 = keyedObjects2D32.equals((java.lang.Object) keyedObjects2D48);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D48, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D6 and keyedObjects2D54", keyedObjects2D6.equals(keyedObjects2D54) ? keyedObjects2D6.hashCode() == keyedObjects2D54.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = new org.jfree.data.KeyedObjects2D();
        java.util.List list4 = keyedObjects2D3.getRowKeys();
        boolean boolean6 = keyedObjects2D3.equals((java.lang.Object) (byte) 100);
        int int8 = keyedObjects2D3.getColumnIndex((java.lang.Comparable) (byte) -1);
        boolean boolean9 = keyedObjects2D0.equals((java.lang.Object) int8);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int11 = keyedObjects2D10.getRowCount();
        int int13 = keyedObjects2D10.getRowIndex((java.lang.Comparable) (byte) -1);
        int int15 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D10.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        int int22 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list23 = keyedObjects2D20.getRowKeys();
        keyedObjects2D10.addObject((java.lang.Object) keyedObjects2D20, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D27.addObject((java.lang.Object) keyedObjects2D28, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj32 = keyedObjects2D28.clone();
        keyedObjects2D28.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        keyedObjects2D28.removeObject((java.lang.Comparable) 100, (java.lang.Comparable) (short) 100);
        int int41 = keyedObjects2D28.getRowIndex((java.lang.Comparable) "");
        int int42 = keyedObjects2D28.getRowCount();
        keyedObjects2D20.setObject((java.lang.Object) int42, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 'a');
        keyedObjects2D0.addObject((java.lang.Object) 'a', (java.lang.Comparable) 1.0d, (java.lang.Comparable) (short) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D49 = new org.jfree.data.KeyedObjects2D();
        int int50 = keyedObjects2D49.getRowCount();
        int int52 = keyedObjects2D49.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D49.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        java.util.List list56 = keyedObjects2D49.getColumnKeys();
        java.util.List list57 = keyedObjects2D49.getRowKeys();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D49, (java.lang.Comparable) (-1), (java.lang.Comparable) 10.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D61 = new org.jfree.data.KeyedObjects2D();
        int int63 = keyedObjects2D61.getColumnIndex((java.lang.Comparable) 0.0d);
        int int65 = keyedObjects2D61.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj66 = keyedObjects2D61.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D67 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D67.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int73 = keyedObjects2D67.getColumnIndex((java.lang.Comparable) 0L);
        int int74 = keyedObjects2D67.getRowCount();
        keyedObjects2D61.setObject((java.lang.Object) int74, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int79 = keyedObjects2D61.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D80 = new org.jfree.data.KeyedObjects2D();
        java.util.List list81 = keyedObjects2D80.getRowKeys();
        keyedObjects2D61.setObject((java.lang.Object) keyedObjects2D80, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj85 = null;
        boolean boolean86 = keyedObjects2D61.equals(obj85);
        keyedObjects2D61.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        java.lang.Object obj90 = keyedObjects2D61.clone();
        boolean boolean91 = keyedObjects2D49.equals(obj90);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D61 and obj90", keyedObjects2D61.equals(obj90) ? keyedObjects2D61.hashCode() == obj90.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D5.addObject((java.lang.Object) keyedObjects2D6, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int11 = keyedObjects2D5.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.List list12 = keyedObjects2D5.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) list12, (java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 0);
        int int17 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        int int19 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (short) 100);
        keyedObjects2D0.removeObject((java.lang.Comparable) 0, (java.lang.Comparable) (-1.0f));
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = new org.jfree.data.KeyedObjects2D();
        int int25 = keyedObjects2D23.getColumnIndex((java.lang.Comparable) 0.0d);
        int int27 = keyedObjects2D23.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj28 = keyedObjects2D23.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D29.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int35 = keyedObjects2D29.getColumnIndex((java.lang.Comparable) 0L);
        int int36 = keyedObjects2D29.getRowCount();
        keyedObjects2D23.setObject((java.lang.Object) int36, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int41 = keyedObjects2D23.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        java.util.List list43 = keyedObjects2D42.getRowKeys();
        keyedObjects2D23.setObject((java.lang.Object) keyedObjects2D42, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj47 = null;
        boolean boolean48 = keyedObjects2D23.equals(obj47);
        keyedObjects2D23.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D23.removeRow((int) (short) 0);
        keyedObjects2D23.removeRow((int) (byte) 0);
        java.lang.Class<?> wildcardClass56 = keyedObjects2D23.getClass();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D23, (java.lang.Comparable) (-1L), (java.lang.Comparable) true);
        org.jfree.data.KeyedObjects2D keyedObjects2D60 = new org.jfree.data.KeyedObjects2D();
        int int61 = keyedObjects2D60.getRowCount();
        int int63 = keyedObjects2D60.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D60.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int67 = keyedObjects2D60.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D68 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D68.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj75 = keyedObjects2D68.getObject(0, 0);
        int int76 = keyedObjects2D68.getRowCount();
        keyedObjects2D60.setObject((java.lang.Object) keyedObjects2D68, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D80 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D80.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list85 = keyedObjects2D80.getRowKeys();
        int int86 = keyedObjects2D80.getRowCount();
        java.util.List list87 = keyedObjects2D80.getColumnKeys();
        keyedObjects2D80.addObject((java.lang.Object) 10.0f, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) 0.0f);
        int int93 = keyedObjects2D80.getColumnIndex((java.lang.Comparable) '4');
        boolean boolean94 = keyedObjects2D68.equals((java.lang.Object) int93);
        keyedObjects2D23.addObject((java.lang.Object) int93, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D29 and keyedObjects2D68", keyedObjects2D29.equals(keyedObjects2D68) ? keyedObjects2D29.hashCode() == keyedObjects2D68.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        int int20 = keyedObjects2D0.getColumnCount();
        java.util.List list21 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        int int24 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 0.0d);
        int int26 = keyedObjects2D22.getRowIndex((java.lang.Comparable) 'a');
        int int28 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 10.0d);
        int int29 = keyedObjects2D22.getRowCount();
        keyedObjects2D22.addObject((java.lang.Object) (short) 100, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) -1);
        int int35 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 10.0f);
        int int36 = keyedObjects2D22.getColumnCount();
        java.util.List list37 = keyedObjects2D22.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D38 = new org.jfree.data.KeyedObjects2D();
        int int40 = keyedObjects2D38.getColumnIndex((java.lang.Comparable) 0.0d);
        int int42 = keyedObjects2D38.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj43 = keyedObjects2D38.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D44 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D44.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int50 = keyedObjects2D44.getColumnIndex((java.lang.Comparable) 0L);
        int int51 = keyedObjects2D44.getRowCount();
        keyedObjects2D38.setObject((java.lang.Object) int51, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int56 = keyedObjects2D38.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D57 = new org.jfree.data.KeyedObjects2D();
        int int59 = keyedObjects2D57.getColumnIndex((java.lang.Comparable) 0.0d);
        int int61 = keyedObjects2D57.getRowIndex((java.lang.Comparable) 'a');
        int int63 = keyedObjects2D57.getColumnIndex((java.lang.Comparable) 10.0d);
        int int64 = keyedObjects2D57.getColumnCount();
        int int65 = keyedObjects2D57.getRowCount();
        int int67 = keyedObjects2D57.getRowIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D57.removeObject((java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 0);
        int int71 = keyedObjects2D57.getColumnCount();
        keyedObjects2D38.addObject((java.lang.Object) int71, (java.lang.Comparable) 100.0f, (java.lang.Comparable) (-1.0f));
        keyedObjects2D22.addObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 0L, (java.lang.Comparable) "");
        java.lang.Comparable comparable78 = null;
        int int79 = keyedObjects2D22.getColumnIndex(comparable78);
        boolean boolean80 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D8 and keyedObjects2D44", keyedObjects2D8.equals(keyedObjects2D44) ? keyedObjects2D8.hashCode() == keyedObjects2D44.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        int int8 = keyedObjects2D0.getRowCount();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        int int15 = keyedObjects2D14.getRowCount();
        boolean boolean17 = keyedObjects2D14.equals((java.lang.Object) 10.0d);
        int int19 = keyedObjects2D14.getRowIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        int int22 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) 0.0d);
        int int24 = keyedObjects2D20.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D20.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list28 = keyedObjects2D20.getColumnKeys();
        boolean boolean29 = keyedObjects2D14.equals((java.lang.Object) list28);
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D30.addObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj35 = keyedObjects2D31.clone();
        keyedObjects2D31.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.util.List list40 = keyedObjects2D31.getColumnKeys();
        boolean boolean41 = keyedObjects2D14.equals((java.lang.Object) keyedObjects2D31);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) 3, (java.lang.Comparable) 100);
        java.lang.Object obj45 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass46 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj45", keyedObjects2D0.equals(obj45) ? keyedObjects2D0.hashCode() == obj45.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj12 = keyedObjects2D8.clone();
        int int13 = keyedObjects2D8.getColumnCount();
        int int15 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean16 = keyedObjects2D0.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable18 = keyedObjects2D0.getColumnKey(0);
        int int19 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D20.getRowCount();
        int int23 = keyedObjects2D20.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D20.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int27 = keyedObjects2D20.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D28.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj35 = keyedObjects2D28.getObject(0, 0);
        int int36 = keyedObjects2D28.getRowCount();
        keyedObjects2D20.setObject((java.lang.Object) keyedObjects2D28, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D40 = new org.jfree.data.KeyedObjects2D();
        java.util.List list41 = keyedObjects2D40.getRowKeys();
        java.lang.Object obj42 = keyedObjects2D40.clone();
        keyedObjects2D20.setObject(obj42, (java.lang.Comparable) false, (java.lang.Comparable) "hi!");
        java.lang.Object obj46 = keyedObjects2D20.clone();
        keyedObjects2D0.setObject(obj46, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D20 and obj46", keyedObjects2D20.equals(obj46) ? keyedObjects2D20.hashCode() == obj46.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D24.addObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int29 = keyedObjects2D25.getRowCount();
        boolean boolean30 = keyedObjects2D0.equals((java.lang.Object) int29);
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        int int32 = keyedObjects2D31.getRowCount();
        boolean boolean34 = keyedObjects2D31.equals((java.lang.Object) 10.0d);
        keyedObjects2D0.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean39 = keyedObjects2D0.equals((java.lang.Object) 10L);
        org.jfree.data.KeyedObjects2D keyedObjects2D40 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D40.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D40.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        java.util.List list48 = keyedObjects2D40.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D40, (java.lang.Comparable) true, (java.lang.Comparable) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D52 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D52.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list57 = keyedObjects2D52.getRowKeys();
        int int58 = keyedObjects2D52.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D59 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D60 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D59.addObject((java.lang.Object) keyedObjects2D60, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D64 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D65 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D64.addObject((java.lang.Object) keyedObjects2D65, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int70 = keyedObjects2D64.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.List list71 = keyedObjects2D64.getColumnKeys();
        keyedObjects2D59.addObject((java.lang.Object) list71, (java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 0);
        keyedObjects2D52.addObject((java.lang.Object) keyedObjects2D59, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 1);
        keyedObjects2D59.removeObject((java.lang.Comparable) 0.0d, (java.lang.Comparable) ' ');
        int int82 = keyedObjects2D59.getColumnIndex((java.lang.Comparable) (byte) -1);
        int int83 = keyedObjects2D59.getRowCount();
        keyedObjects2D40.addObject((java.lang.Object) int83, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D24 and keyedObjects2D64", keyedObjects2D24.equals(keyedObjects2D64) ? keyedObjects2D24.hashCode() == keyedObjects2D64.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list6 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 10, (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj15 = keyedObjects2D10.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D16.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int22 = keyedObjects2D16.getColumnIndex((java.lang.Comparable) 0L);
        int int23 = keyedObjects2D16.getRowCount();
        keyedObjects2D10.setObject((java.lang.Object) int23, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int28 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        java.util.List list30 = keyedObjects2D29.getRowKeys();
        keyedObjects2D10.setObject((java.lang.Object) keyedObjects2D29, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.util.List list34 = keyedObjects2D10.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        int int39 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj40 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D41 = new org.jfree.data.KeyedObjects2D();
        int int43 = keyedObjects2D41.getColumnIndex((java.lang.Comparable) 0.0d);
        int int45 = keyedObjects2D41.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj46 = keyedObjects2D41.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D47 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D47.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int53 = keyedObjects2D47.getColumnIndex((java.lang.Comparable) 0L);
        int int54 = keyedObjects2D47.getRowCount();
        keyedObjects2D41.setObject((java.lang.Object) int54, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int59 = keyedObjects2D41.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D60 = new org.jfree.data.KeyedObjects2D();
        java.util.List list61 = keyedObjects2D60.getRowKeys();
        keyedObjects2D41.setObject((java.lang.Object) keyedObjects2D60, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D65 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D66 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D65.addObject((java.lang.Object) keyedObjects2D66, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int70 = keyedObjects2D66.getRowCount();
        boolean boolean71 = keyedObjects2D41.equals((java.lang.Object) int70);
        org.jfree.data.KeyedObjects2D keyedObjects2D72 = new org.jfree.data.KeyedObjects2D();
        int int73 = keyedObjects2D72.getRowCount();
        boolean boolean75 = keyedObjects2D72.equals((java.lang.Object) 10.0d);
        keyedObjects2D41.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean80 = keyedObjects2D41.equals((java.lang.Object) 10L);
        int int82 = keyedObjects2D41.getColumnIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D0.addObject((java.lang.Object) 100.0f, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D16 and keyedObjects2D47", keyedObjects2D16.equals(keyedObjects2D47) ? keyedObjects2D16.hashCode() == keyedObjects2D47.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list6 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 10, (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj15 = keyedObjects2D10.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D16.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int22 = keyedObjects2D16.getColumnIndex((java.lang.Comparable) 0L);
        int int23 = keyedObjects2D16.getRowCount();
        keyedObjects2D10.setObject((java.lang.Object) int23, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int28 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        java.util.List list30 = keyedObjects2D29.getRowKeys();
        keyedObjects2D10.setObject((java.lang.Object) keyedObjects2D29, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.util.List list34 = keyedObjects2D10.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        int int39 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj40 = keyedObjects2D0.clone();
        int int41 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj40", keyedObjects2D0.equals(obj40) ? keyedObjects2D0.hashCode() == obj40.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        int int19 = keyedObjects2D0.getRowCount();
        java.lang.Object obj20 = keyedObjects2D0.clone();
        int int22 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj20", keyedObjects2D0.equals(obj20) ? keyedObjects2D0.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        boolean boolean3 = keyedObjects2D0.equals((java.lang.Object) 10.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D4.addObject((java.lang.Object) keyedObjects2D5, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj9 = keyedObjects2D5.clone();
        int int10 = keyedObjects2D5.getColumnCount();
        int int12 = keyedObjects2D5.getRowIndex((java.lang.Comparable) (short) 10);
        int int13 = keyedObjects2D5.getColumnCount();
        int int14 = keyedObjects2D5.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D5, (java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) 10);
        java.lang.Object obj18 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass19 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj18", keyedObjects2D0.equals(obj18) ? keyedObjects2D0.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        java.util.List list21 = keyedObjects2D20.getRowKeys();
        java.lang.Object obj22 = keyedObjects2D20.clone();
        keyedObjects2D0.setObject(obj22, (java.lang.Comparable) false, (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        int int28 = keyedObjects2D26.getColumnIndex((java.lang.Comparable) 0.0d);
        int int30 = keyedObjects2D26.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D26.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list34 = keyedObjects2D26.getColumnKeys();
        keyedObjects2D26.removeObject((java.lang.Comparable) 'a', (java.lang.Comparable) 0.0f);
        boolean boolean38 = keyedObjects2D0.equals((java.lang.Object) 'a');
        java.util.List list39 = keyedObjects2D0.getColumnKeys();
        int int41 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        int int44 = keyedObjects2D42.getColumnIndex((java.lang.Comparable) 0.0d);
        int int46 = keyedObjects2D42.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj47 = keyedObjects2D42.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D48 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D48.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int54 = keyedObjects2D48.getColumnIndex((java.lang.Comparable) 0L);
        int int55 = keyedObjects2D48.getRowCount();
        keyedObjects2D42.setObject((java.lang.Object) int55, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int60 = keyedObjects2D42.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D61 = new org.jfree.data.KeyedObjects2D();
        java.util.List list62 = keyedObjects2D61.getRowKeys();
        keyedObjects2D42.setObject((java.lang.Object) keyedObjects2D61, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj66 = null;
        boolean boolean67 = keyedObjects2D42.equals(obj66);
        int int69 = keyedObjects2D42.getColumnIndex((java.lang.Comparable) (short) 100);
        int int70 = keyedObjects2D42.getRowCount();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D42, (java.lang.Comparable) 4, (java.lang.Comparable) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D8 and keyedObjects2D48", keyedObjects2D8.equals(keyedObjects2D48) ? keyedObjects2D8.hashCode() == keyedObjects2D48.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D24.addObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int29 = keyedObjects2D25.getRowCount();
        boolean boolean30 = keyedObjects2D0.equals((java.lang.Object) int29);
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        int int32 = keyedObjects2D31.getRowCount();
        boolean boolean34 = keyedObjects2D31.equals((java.lang.Object) 10.0d);
        keyedObjects2D0.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean39 = keyedObjects2D0.equals((java.lang.Object) 10L);
        org.jfree.data.KeyedObjects2D keyedObjects2D40 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D40.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D40.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        java.util.List list48 = keyedObjects2D40.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D40, (java.lang.Comparable) true, (java.lang.Comparable) (short) 0);
        java.lang.Object obj52 = keyedObjects2D40.clone();
        int int54 = keyedObjects2D40.getColumnIndex((java.lang.Comparable) 1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D40 and obj52", keyedObjects2D40.equals(obj52) ? keyedObjects2D40.hashCode() == obj52.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        int int10 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 100L);
        java.util.List list11 = keyedObjects2D7.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        int int14 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 0.0d);
        int int16 = keyedObjects2D12.getRowIndex((java.lang.Comparable) 'a');
        int int18 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 10.0d);
        int int19 = keyedObjects2D12.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D20.addObject((java.lang.Object) keyedObjects2D21, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj25 = keyedObjects2D21.clone();
        keyedObjects2D21.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj30 = null;
        boolean boolean31 = keyedObjects2D21.equals(obj30);
        boolean boolean32 = keyedObjects2D12.equals((java.lang.Object) boolean31);
        int int34 = keyedObjects2D12.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D7.addObject((java.lang.Object) (byte) -1, (java.lang.Comparable) (-1L), (java.lang.Comparable) (byte) 100);
        keyedObjects2D7.removeObject((java.lang.Comparable) 100L, (java.lang.Comparable) (-1));
        java.lang.Object obj41 = keyedObjects2D7.clone();
        java.lang.Comparable comparable42 = null;
        int int43 = keyedObjects2D7.getRowIndex(comparable42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D7 and obj41", keyedObjects2D7.equals(obj41) ? keyedObjects2D7.hashCode() == obj41.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D19.addObject((java.lang.Object) keyedObjects2D20, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj24 = keyedObjects2D20.clone();
        int int25 = keyedObjects2D20.getColumnCount();
        java.lang.Object obj26 = keyedObjects2D20.clone();
        java.util.List list27 = keyedObjects2D20.getRowKeys();
        boolean boolean28 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D20);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        int int30 = keyedObjects2D29.getRowCount();
        int int32 = keyedObjects2D29.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D29.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int37 = keyedObjects2D29.getColumnIndex((java.lang.Comparable) 0.0f);
        java.util.List list38 = keyedObjects2D29.getColumnKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D29, (java.lang.Comparable) 'a', (java.lang.Comparable) 3);
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        int int43 = keyedObjects2D42.getRowCount();
        int int45 = keyedObjects2D42.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D42.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D49 = new org.jfree.data.KeyedObjects2D();
        boolean boolean50 = keyedObjects2D42.equals((java.lang.Object) keyedObjects2D49);
        int int52 = keyedObjects2D49.getColumnIndex((java.lang.Comparable) 100L);
        java.util.List list53 = keyedObjects2D49.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D54 = new org.jfree.data.KeyedObjects2D();
        int int56 = keyedObjects2D54.getColumnIndex((java.lang.Comparable) 0.0d);
        int int58 = keyedObjects2D54.getRowIndex((java.lang.Comparable) 'a');
        int int60 = keyedObjects2D54.getColumnIndex((java.lang.Comparable) 10.0d);
        int int61 = keyedObjects2D54.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D62 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D63 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D62.addObject((java.lang.Object) keyedObjects2D63, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj67 = keyedObjects2D63.clone();
        keyedObjects2D63.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj72 = null;
        boolean boolean73 = keyedObjects2D63.equals(obj72);
        boolean boolean74 = keyedObjects2D54.equals((java.lang.Object) boolean73);
        int int76 = keyedObjects2D54.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D49.addObject((java.lang.Object) (byte) -1, (java.lang.Comparable) (-1L), (java.lang.Comparable) (byte) 100);
        keyedObjects2D49.removeObject((java.lang.Comparable) 100L, (java.lang.Comparable) (-1));
        java.lang.Object obj83 = keyedObjects2D49.clone();
        keyedObjects2D29.setObject(obj83, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D49 and obj83", keyedObjects2D49.equals(obj83) ? keyedObjects2D49.hashCode() == obj83.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj12 = keyedObjects2D8.clone();
        int int13 = keyedObjects2D8.getColumnCount();
        int int15 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean16 = keyedObjects2D0.equals((java.lang.Object) (short) 10);
        java.lang.Object obj17 = keyedObjects2D0.clone();
        int int19 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj17", keyedObjects2D0.equals(obj17) ? keyedObjects2D0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        int int8 = keyedObjects2D0.getRowCount();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        int int15 = keyedObjects2D14.getRowCount();
        boolean boolean17 = keyedObjects2D14.equals((java.lang.Object) 10.0d);
        int int19 = keyedObjects2D14.getRowIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        int int22 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) 0.0d);
        int int24 = keyedObjects2D20.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D20.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list28 = keyedObjects2D20.getColumnKeys();
        boolean boolean29 = keyedObjects2D14.equals((java.lang.Object) list28);
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D30.addObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj35 = keyedObjects2D31.clone();
        keyedObjects2D31.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.util.List list40 = keyedObjects2D31.getColumnKeys();
        boolean boolean41 = keyedObjects2D14.equals((java.lang.Object) keyedObjects2D31);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) 3, (java.lang.Comparable) 100);
        java.lang.Object obj45 = keyedObjects2D0.clone();
        java.util.List list46 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj45", keyedObjects2D0.equals(obj45) ? keyedObjects2D0.hashCode() == obj45.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.addObject((java.lang.Object) keyedObjects2D9, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj13 = keyedObjects2D9.clone();
        keyedObjects2D9.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj18 = null;
        boolean boolean19 = keyedObjects2D9.equals(obj18);
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) boolean19);
        int int21 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = new org.jfree.data.KeyedObjects2D();
        int int24 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 0.0d);
        int int26 = keyedObjects2D22.getRowIndex((java.lang.Comparable) 'a');
        int int28 = keyedObjects2D22.getColumnIndex((java.lang.Comparable) 10.0d);
        int int29 = keyedObjects2D22.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D30.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D30.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D22.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        keyedObjects2D22.setObject((java.lang.Object) 1, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1));
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D22, (java.lang.Comparable) (-1L), (java.lang.Comparable) (-1.0f));
        java.util.List list48 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj49 = keyedObjects2D0.clone();
        int int50 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj49", keyedObjects2D0.equals(obj49) ? keyedObjects2D0.hashCode() == obj49.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        int int29 = keyedObjects2D0.getRowCount();
        int int30 = keyedObjects2D0.getRowCount();
        java.lang.Object obj31 = keyedObjects2D0.clone();
        java.util.List list32 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj31", keyedObjects2D0.equals(obj31) ? keyedObjects2D0.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        int int8 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D9.getRowCount();
        int int12 = keyedObjects2D9.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D9.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int16 = keyedObjects2D9.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D17.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj24 = keyedObjects2D17.getObject(0, 0);
        int int25 = keyedObjects2D17.getRowCount();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D17, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        boolean boolean29 = keyedObjects2D0.equals((java.lang.Object) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D30.addObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        int int37 = keyedObjects2D35.getColumnIndex((java.lang.Comparable) 0.0d);
        int int39 = keyedObjects2D35.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D35.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D43 = new org.jfree.data.KeyedObjects2D();
        int int45 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) 0.0d);
        int int47 = keyedObjects2D43.getRowIndex((java.lang.Comparable) 'a');
        int int49 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list50 = keyedObjects2D43.getRowKeys();
        keyedObjects2D35.setObject((java.lang.Object) keyedObjects2D43, (java.lang.Comparable) false, (java.lang.Comparable) (short) 1);
        int int55 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) 100);
        boolean boolean56 = keyedObjects2D31.equals((java.lang.Object) keyedObjects2D43);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) true, (java.lang.Comparable) (short) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D60 = new org.jfree.data.KeyedObjects2D();
        int int62 = keyedObjects2D60.getColumnIndex((java.lang.Comparable) 0.0d);
        int int64 = keyedObjects2D60.getRowIndex((java.lang.Comparable) 'a');
        int int66 = keyedObjects2D60.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list67 = keyedObjects2D60.getRowKeys();
        java.util.List list68 = keyedObjects2D60.getColumnKeys();
        int int69 = keyedObjects2D60.getColumnCount();
        java.util.List list70 = keyedObjects2D60.getRowKeys();
        boolean boolean71 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D60);
        java.lang.Object obj72 = keyedObjects2D0.clone();
        int int74 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj72", keyedObjects2D0.equals(obj72) ? keyedObjects2D0.hashCode() == obj72.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj12 = keyedObjects2D8.clone();
        keyedObjects2D8.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        boolean boolean17 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D8);
        java.util.List list18 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0.0d);
        int int23 = keyedObjects2D19.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj24 = keyedObjects2D19.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D25.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int31 = keyedObjects2D25.getColumnIndex((java.lang.Comparable) 0L);
        int int32 = keyedObjects2D25.getRowCount();
        keyedObjects2D19.setObject((java.lang.Object) int32, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int37 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D38 = new org.jfree.data.KeyedObjects2D();
        java.util.List list39 = keyedObjects2D38.getRowKeys();
        keyedObjects2D19.setObject((java.lang.Object) keyedObjects2D38, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj43 = null;
        boolean boolean44 = keyedObjects2D19.equals(obj43);
        keyedObjects2D19.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D19.removeRow((int) (short) 0);
        java.lang.Object obj50 = keyedObjects2D19.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D51 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D51.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list56 = keyedObjects2D51.getRowKeys();
        keyedObjects2D51.removeRow((int) (byte) 0);
        java.lang.Class<?> wildcardClass59 = keyedObjects2D51.getClass();
        keyedObjects2D19.setObject((java.lang.Object) wildcardClass59, (java.lang.Comparable) (short) 0, (java.lang.Comparable) 1.0d);
        java.util.List list63 = keyedObjects2D19.getColumnKeys();
        boolean boolean64 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and keyedObjects2D25", keyedObjects2D0.equals(keyedObjects2D25) ? keyedObjects2D0.hashCode() == keyedObjects2D25.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        java.util.List list8 = keyedObjects2D7.getRowKeys();
        java.lang.Object obj9 = keyedObjects2D7.clone();
        boolean boolean10 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        int int12 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) "");
        int int13 = keyedObjects2D7.getRowCount();
        java.util.List list14 = keyedObjects2D7.getColumnKeys();
        int int16 = keyedObjects2D7.getRowIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D17.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list22 = keyedObjects2D17.getRowKeys();
        int int23 = keyedObjects2D17.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D24.addObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj29 = keyedObjects2D25.clone();
        int int30 = keyedObjects2D25.getColumnCount();
        int int32 = keyedObjects2D25.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean33 = keyedObjects2D17.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable35 = keyedObjects2D17.getColumnKey(0);
        int int36 = keyedObjects2D17.getColumnCount();
        java.lang.Object obj37 = keyedObjects2D17.clone();
        keyedObjects2D7.setObject((java.lang.Object) keyedObjects2D17, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D17 and obj37", keyedObjects2D17.equals(obj37) ? keyedObjects2D17.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        int int10 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 100L);
        java.util.List list11 = keyedObjects2D7.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        int int14 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 0.0d);
        int int16 = keyedObjects2D12.getRowIndex((java.lang.Comparable) 'a');
        int int18 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 10.0d);
        int int19 = keyedObjects2D12.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D20.addObject((java.lang.Object) keyedObjects2D21, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj25 = keyedObjects2D21.clone();
        keyedObjects2D21.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj30 = null;
        boolean boolean31 = keyedObjects2D21.equals(obj30);
        boolean boolean32 = keyedObjects2D12.equals((java.lang.Object) boolean31);
        int int34 = keyedObjects2D12.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D7.addObject((java.lang.Object) (byte) -1, (java.lang.Comparable) (-1L), (java.lang.Comparable) (byte) 100);
        keyedObjects2D7.removeObject((java.lang.Comparable) 100L, (java.lang.Comparable) (-1));
        java.lang.Object obj41 = keyedObjects2D7.clone();
        java.util.List list42 = keyedObjects2D7.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D7 and obj41", keyedObjects2D7.equals(obj41) ? keyedObjects2D7.hashCode() == obj41.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        java.lang.Object obj8 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass9 = keyedObjects2D0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj8", keyedObjects2D0.equals(obj8) ? keyedObjects2D0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        int int20 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj21 = keyedObjects2D0.clone();
        java.lang.Comparable comparable23 = keyedObjects2D0.getColumnKey(0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj21", keyedObjects2D0.equals(obj21) ? keyedObjects2D0.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D0.removeRow((int) (short) 0);
        java.util.List list31 = keyedObjects2D0.getColumnKeys();
        java.util.List list32 = keyedObjects2D0.getColumnKeys();
        java.lang.Object obj33 = keyedObjects2D0.clone();
        int int35 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj33", keyedObjects2D0.equals(obj33) ? keyedObjects2D0.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        java.util.List list19 = keyedObjects2D0.getColumnKeys();
        int int20 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        int int23 = keyedObjects2D21.getColumnIndex((java.lang.Comparable) 0.0d);
        int int24 = keyedObjects2D21.getColumnCount();
        int int25 = keyedObjects2D21.getColumnCount();
        java.lang.Object obj26 = keyedObjects2D21.clone();
        int int28 = keyedObjects2D21.getColumnIndex((java.lang.Comparable) (short) 10);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        int int31 = keyedObjects2D29.getColumnIndex((java.lang.Comparable) 0.0d);
        int int33 = keyedObjects2D29.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D29.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D37 = new org.jfree.data.KeyedObjects2D();
        int int39 = keyedObjects2D37.getColumnIndex((java.lang.Comparable) 0.0d);
        int int41 = keyedObjects2D37.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj42 = keyedObjects2D37.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D43 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D43.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int49 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) 0L);
        int int50 = keyedObjects2D43.getRowCount();
        keyedObjects2D37.setObject((java.lang.Object) int50, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int55 = keyedObjects2D37.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D56 = new org.jfree.data.KeyedObjects2D();
        java.util.List list57 = keyedObjects2D56.getRowKeys();
        keyedObjects2D37.setObject((java.lang.Object) keyedObjects2D56, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D61 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D62 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D61.addObject((java.lang.Object) keyedObjects2D62, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int66 = keyedObjects2D62.getRowCount();
        boolean boolean67 = keyedObjects2D37.equals((java.lang.Object) int66);
        org.jfree.data.KeyedObjects2D keyedObjects2D68 = new org.jfree.data.KeyedObjects2D();
        int int69 = keyedObjects2D68.getRowCount();
        boolean boolean71 = keyedObjects2D68.equals((java.lang.Object) 10.0d);
        keyedObjects2D37.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean76 = keyedObjects2D37.equals((java.lang.Object) 10L);
        boolean boolean77 = keyedObjects2D29.equals((java.lang.Object) keyedObjects2D37);
        java.util.List list78 = keyedObjects2D37.getColumnKeys();
        boolean boolean79 = keyedObjects2D21.equals((java.lang.Object) keyedObjects2D37);
        boolean boolean80 = keyedObjects2D0.equals((java.lang.Object) boolean79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D6 and keyedObjects2D43", keyedObjects2D6.equals(keyedObjects2D43) ? keyedObjects2D6.hashCode() == keyedObjects2D43.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        int int29 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D30.addObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj35 = keyedObjects2D31.clone();
        int int36 = keyedObjects2D31.getColumnCount();
        int int38 = keyedObjects2D31.getRowIndex((java.lang.Comparable) (short) 10);
        int int39 = keyedObjects2D31.getColumnCount();
        int int40 = keyedObjects2D31.getRowCount();
        int int42 = keyedObjects2D31.getColumnIndex((java.lang.Comparable) ' ');
        keyedObjects2D0.setObject((java.lang.Object) ' ', (java.lang.Comparable) 100.0d, (java.lang.Comparable) true);
        org.jfree.data.KeyedObjects2D keyedObjects2D46 = new org.jfree.data.KeyedObjects2D();
        java.util.List list47 = keyedObjects2D46.getRowKeys();
        keyedObjects2D46.addObject((java.lang.Object) (byte) 0, (java.lang.Comparable) 2, (java.lang.Comparable) 1.0f);
        int int52 = keyedObjects2D46.getColumnCount();
        boolean boolean53 = keyedObjects2D0.equals((java.lang.Object) int52);
        org.jfree.data.KeyedObjects2D keyedObjects2D54 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D55 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D54.addObject((java.lang.Object) keyedObjects2D55, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int60 = keyedObjects2D54.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.List list61 = keyedObjects2D54.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D62 = new org.jfree.data.KeyedObjects2D();
        int int64 = keyedObjects2D62.getColumnIndex((java.lang.Comparable) 0.0d);
        int int66 = keyedObjects2D62.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj67 = keyedObjects2D62.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D68 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D68.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int74 = keyedObjects2D68.getColumnIndex((java.lang.Comparable) 0L);
        int int75 = keyedObjects2D68.getRowCount();
        keyedObjects2D62.setObject((java.lang.Object) int75, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int80 = keyedObjects2D62.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D81 = new org.jfree.data.KeyedObjects2D();
        java.util.List list82 = keyedObjects2D81.getRowKeys();
        keyedObjects2D62.setObject((java.lang.Object) keyedObjects2D81, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj86 = null;
        boolean boolean87 = keyedObjects2D62.equals(obj86);
        int int89 = keyedObjects2D62.getColumnIndex((java.lang.Comparable) (short) 100);
        keyedObjects2D54.addObject((java.lang.Object) keyedObjects2D62, (java.lang.Comparable) 'a', (java.lang.Comparable) 2);
        java.lang.Object obj93 = keyedObjects2D62.clone();
        keyedObjects2D0.setObject(obj93, (java.lang.Comparable) 100.0d, (java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D6 and keyedObjects2D68", keyedObjects2D6.equals(keyedObjects2D68) ? keyedObjects2D6.hashCode() == keyedObjects2D68.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list7 = keyedObjects2D0.getRowKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        keyedObjects2D0.removeObject((java.lang.Comparable) 100L, (java.lang.Comparable) 100);
        java.util.List list12 = keyedObjects2D0.getColumnKeys();
        java.util.List list13 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj14 = keyedObjects2D0.clone();
        int int16 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) ' ');
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = new org.jfree.data.KeyedObjects2D();
        int int18 = keyedObjects2D17.getRowCount();
        int int20 = keyedObjects2D17.getRowIndex((java.lang.Comparable) (byte) -1);
        int int22 = keyedObjects2D17.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D17.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        int int29 = keyedObjects2D27.getColumnIndex((java.lang.Comparable) 0.0d);
        int int31 = keyedObjects2D27.getRowIndex((java.lang.Comparable) 'a');
        int int33 = keyedObjects2D27.getColumnIndex((java.lang.Comparable) 10.0d);
        int int34 = keyedObjects2D27.getColumnCount();
        int int35 = keyedObjects2D27.getRowCount();
        java.lang.Object obj36 = keyedObjects2D27.clone();
        boolean boolean37 = keyedObjects2D17.equals((java.lang.Object) keyedObjects2D27);
        java.lang.Comparable comparable38 = null;
        int int39 = keyedObjects2D17.getColumnIndex(comparable38);
        java.lang.Object obj40 = keyedObjects2D17.clone();
        boolean boolean41 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D17 and obj40", keyedObjects2D17.equals(obj40) ? keyedObjects2D17.hashCode() == obj40.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        int int8 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D9.getRowCount();
        int int12 = keyedObjects2D9.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D9.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int16 = keyedObjects2D9.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D17.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj24 = keyedObjects2D17.getObject(0, 0);
        int int25 = keyedObjects2D17.getRowCount();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D17, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        boolean boolean29 = keyedObjects2D0.equals((java.lang.Object) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D30.addObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        int int37 = keyedObjects2D35.getColumnIndex((java.lang.Comparable) 0.0d);
        int int39 = keyedObjects2D35.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D35.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D43 = new org.jfree.data.KeyedObjects2D();
        int int45 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) 0.0d);
        int int47 = keyedObjects2D43.getRowIndex((java.lang.Comparable) 'a');
        int int49 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list50 = keyedObjects2D43.getRowKeys();
        keyedObjects2D35.setObject((java.lang.Object) keyedObjects2D43, (java.lang.Comparable) false, (java.lang.Comparable) (short) 1);
        int int55 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) 100);
        boolean boolean56 = keyedObjects2D31.equals((java.lang.Object) keyedObjects2D43);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) true, (java.lang.Comparable) (short) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D60 = new org.jfree.data.KeyedObjects2D();
        int int62 = keyedObjects2D60.getColumnIndex((java.lang.Comparable) 0.0d);
        int int64 = keyedObjects2D60.getRowIndex((java.lang.Comparable) 'a');
        int int66 = keyedObjects2D60.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list67 = keyedObjects2D60.getRowKeys();
        java.util.List list68 = keyedObjects2D60.getColumnKeys();
        int int69 = keyedObjects2D60.getColumnCount();
        java.util.List list70 = keyedObjects2D60.getRowKeys();
        boolean boolean71 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D60);
        java.lang.Object obj72 = keyedObjects2D0.clone();
        int int73 = keyedObjects2D0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj72", keyedObjects2D0.equals(obj72) ? keyedObjects2D0.hashCode() == obj72.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D24.addObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int29 = keyedObjects2D25.getRowCount();
        boolean boolean30 = keyedObjects2D0.equals((java.lang.Object) int29);
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        int int32 = keyedObjects2D31.getRowCount();
        boolean boolean34 = keyedObjects2D31.equals((java.lang.Object) 10.0d);
        keyedObjects2D0.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean39 = keyedObjects2D0.equals((java.lang.Object) 10L);
        org.jfree.data.KeyedObjects2D keyedObjects2D40 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D40.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D40.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        java.util.List list48 = keyedObjects2D40.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D40, (java.lang.Comparable) true, (java.lang.Comparable) (short) 0);
        int int53 = keyedObjects2D40.getColumnIndex((java.lang.Comparable) '#');
        int int55 = keyedObjects2D40.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D40.removeObject((java.lang.Comparable) 0L, (java.lang.Comparable) 0.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D59 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D60 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D59.addObject((java.lang.Object) keyedObjects2D60, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int64 = keyedObjects2D60.getRowCount();
        int int65 = keyedObjects2D60.getRowCount();
        java.util.List list66 = keyedObjects2D60.getRowKeys();
        boolean boolean67 = keyedObjects2D40.equals((java.lang.Object) list66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D24 and keyedObjects2D59", keyedObjects2D24.equals(keyedObjects2D59) ? keyedObjects2D24.hashCode() == keyedObjects2D59.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.util.List list4 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        int int8 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0.0d);
        int int10 = keyedObjects2D6.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj11 = keyedObjects2D6.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D12.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int18 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 0L);
        int int19 = keyedObjects2D12.getRowCount();
        keyedObjects2D6.setObject((java.lang.Object) int19, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int24 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        java.util.List list26 = keyedObjects2D25.getRowKeys();
        keyedObjects2D6.setObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj30 = null;
        boolean boolean31 = keyedObjects2D6.equals(obj30);
        keyedObjects2D6.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D6.removeRow((int) (short) 0);
        java.util.List list37 = keyedObjects2D6.getColumnKeys();
        java.util.List list38 = keyedObjects2D6.getColumnKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D6, (java.lang.Comparable) 10.0d, (java.lang.Comparable) ' ');
        keyedObjects2D6.removeColumn((int) (short) 1);
        keyedObjects2D6.removeObject((java.lang.Comparable) (-1.0f), (java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D47 = new org.jfree.data.KeyedObjects2D();
        int int49 = keyedObjects2D47.getColumnIndex((java.lang.Comparable) 0.0d);
        int int51 = keyedObjects2D47.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj52 = keyedObjects2D47.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D53 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D53.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int59 = keyedObjects2D53.getColumnIndex((java.lang.Comparable) 0L);
        int int60 = keyedObjects2D53.getRowCount();
        keyedObjects2D47.setObject((java.lang.Object) int60, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int65 = keyedObjects2D47.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D66 = new org.jfree.data.KeyedObjects2D();
        java.util.List list67 = keyedObjects2D66.getRowKeys();
        keyedObjects2D47.setObject((java.lang.Object) keyedObjects2D66, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int72 = keyedObjects2D47.getRowIndex((java.lang.Comparable) (-1.0f));
        int int73 = keyedObjects2D47.getColumnCount();
        java.lang.Object obj74 = keyedObjects2D47.clone();
        keyedObjects2D47.removeRow((int) (short) 1);
        java.lang.Object obj77 = keyedObjects2D47.clone();
        boolean boolean78 = keyedObjects2D6.equals((java.lang.Object) keyedObjects2D47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D12 and keyedObjects2D53", keyedObjects2D12.equals(keyedObjects2D53) ? keyedObjects2D12.hashCode() == keyedObjects2D53.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj12 = keyedObjects2D8.clone();
        keyedObjects2D8.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        boolean boolean17 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D8);
        int int19 = keyedObjects2D8.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj20 = keyedObjects2D8.clone();
        java.util.List list21 = keyedObjects2D8.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D8 and obj20", keyedObjects2D8.equals(obj20) ? keyedObjects2D8.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        java.lang.Object obj8 = keyedObjects2D0.clone();
        int int10 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj8", keyedObjects2D0.equals(obj8) ? keyedObjects2D0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        java.util.List list9 = keyedObjects2D0.getColumnKeys();
        java.lang.Comparable comparable11 = keyedObjects2D0.getColumnKey((int) (byte) 0);
        java.lang.Object obj12 = keyedObjects2D0.clone();
        int int14 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) '#');
        keyedObjects2D0.removeObject((java.lang.Comparable) "hi!", (java.lang.Comparable) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D18.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list23 = keyedObjects2D18.getRowKeys();
        int int24 = keyedObjects2D18.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D25.addObject((java.lang.Object) keyedObjects2D26, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj30 = keyedObjects2D26.clone();
        int int31 = keyedObjects2D26.getColumnCount();
        int int33 = keyedObjects2D26.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean34 = keyedObjects2D18.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable36 = keyedObjects2D18.getColumnKey(0);
        int int37 = keyedObjects2D18.getColumnCount();
        java.lang.Object obj38 = keyedObjects2D18.clone();
        keyedObjects2D0.addObject(obj38, (java.lang.Comparable) (-1L), (java.lang.Comparable) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D18 and obj38", keyedObjects2D18.equals(obj38) ? keyedObjects2D18.hashCode() == obj38.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D24.addObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int29 = keyedObjects2D25.getRowCount();
        boolean boolean30 = keyedObjects2D0.equals((java.lang.Object) int29);
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        int int32 = keyedObjects2D31.getRowCount();
        boolean boolean34 = keyedObjects2D31.equals((java.lang.Object) 10.0d);
        keyedObjects2D0.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean39 = keyedObjects2D0.equals((java.lang.Object) 10L);
        java.util.List list40 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D41 = new org.jfree.data.KeyedObjects2D();
        int int43 = keyedObjects2D41.getColumnIndex((java.lang.Comparable) 0.0d);
        int int45 = keyedObjects2D41.getRowIndex((java.lang.Comparable) 'a');
        int int47 = keyedObjects2D41.getRowIndex((java.lang.Comparable) '4');
        java.lang.Object obj48 = keyedObjects2D41.clone();
        boolean boolean49 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D41);
        org.jfree.data.KeyedObjects2D keyedObjects2D50 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D51 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D50.addObject((java.lang.Object) keyedObjects2D51, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj55 = keyedObjects2D51.clone();
        keyedObjects2D51.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        int int60 = keyedObjects2D51.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D61 = new org.jfree.data.KeyedObjects2D();
        int int62 = keyedObjects2D61.getRowCount();
        int int64 = keyedObjects2D61.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D51.setObject((java.lang.Object) keyedObjects2D61, (java.lang.Comparable) 0.0d, (java.lang.Comparable) (byte) 1);
        int int69 = keyedObjects2D61.getColumnIndex((java.lang.Comparable) 0.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D70 = new org.jfree.data.KeyedObjects2D();
        int int72 = keyedObjects2D70.getColumnIndex((java.lang.Comparable) 0.0d);
        int int74 = keyedObjects2D70.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj75 = keyedObjects2D70.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D76 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D76.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int82 = keyedObjects2D76.getColumnIndex((java.lang.Comparable) 0L);
        int int83 = keyedObjects2D76.getRowCount();
        keyedObjects2D70.setObject((java.lang.Object) int83, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int88 = keyedObjects2D70.getColumnIndex((java.lang.Comparable) 100.0f);
        java.util.List list89 = keyedObjects2D70.getColumnKeys();
        java.util.List list90 = keyedObjects2D70.getColumnKeys();
        boolean boolean91 = keyedObjects2D61.equals((java.lang.Object) list90);
        keyedObjects2D41.setObject((java.lang.Object) list90, (java.lang.Comparable) 1L, (java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D6 and keyedObjects2D76", keyedObjects2D6.equals(keyedObjects2D76) ? keyedObjects2D6.hashCode() == keyedObjects2D76.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int25 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        int int26 = keyedObjects2D0.getColumnCount();
        int int28 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        int int30 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10L);
        keyedObjects2D0.removeRow((int) (byte) 1);
        keyedObjects2D0.removeObject((java.lang.Comparable) 100.0f, (java.lang.Comparable) 1.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        int int38 = keyedObjects2D36.getColumnIndex((java.lang.Comparable) 0.0d);
        int int40 = keyedObjects2D36.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj41 = keyedObjects2D36.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D42.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int48 = keyedObjects2D42.getColumnIndex((java.lang.Comparable) 0L);
        int int49 = keyedObjects2D42.getRowCount();
        keyedObjects2D36.setObject((java.lang.Object) int49, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int54 = keyedObjects2D36.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D55 = new org.jfree.data.KeyedObjects2D();
        java.util.List list56 = keyedObjects2D55.getRowKeys();
        keyedObjects2D36.setObject((java.lang.Object) keyedObjects2D55, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.util.List list60 = keyedObjects2D55.getColumnKeys();
        int int61 = keyedObjects2D55.getColumnCount();
        java.lang.Object obj62 = keyedObjects2D55.clone();
        boolean boolean63 = keyedObjects2D0.equals(obj62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D6 and keyedObjects2D42", keyedObjects2D6.equals(keyedObjects2D42) ? keyedObjects2D6.hashCode() == keyedObjects2D42.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int8 = keyedObjects2D0.getRowCount();
        int int9 = keyedObjects2D0.getRowCount();
        int int11 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) ' ');
        java.util.List list12 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = new org.jfree.data.KeyedObjects2D();
        int int15 = keyedObjects2D13.getColumnIndex((java.lang.Comparable) 0.0d);
        int int17 = keyedObjects2D13.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj18 = keyedObjects2D13.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D19.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int25 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0L);
        int int26 = keyedObjects2D19.getRowCount();
        keyedObjects2D13.setObject((java.lang.Object) int26, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int31 = keyedObjects2D13.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = new org.jfree.data.KeyedObjects2D();
        java.util.List list33 = keyedObjects2D32.getRowKeys();
        keyedObjects2D13.setObject((java.lang.Object) keyedObjects2D32, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj37 = null;
        boolean boolean38 = keyedObjects2D13.equals(obj37);
        org.jfree.data.KeyedObjects2D keyedObjects2D39 = new org.jfree.data.KeyedObjects2D();
        int int40 = keyedObjects2D39.getRowCount();
        int int42 = keyedObjects2D39.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj43 = keyedObjects2D39.clone();
        int int44 = keyedObjects2D39.getColumnCount();
        keyedObjects2D13.setObject((java.lang.Object) keyedObjects2D39, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0f);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D39, (java.lang.Comparable) 1, (java.lang.Comparable) '4');
        java.lang.Object obj51 = keyedObjects2D0.clone();
        int int53 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj51", keyedObjects2D0.equals(obj51) ? keyedObjects2D0.hashCode() == obj51.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj13 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int21 = keyedObjects2D14.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int21, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int26 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.util.List list28 = keyedObjects2D27.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj32 = null;
        boolean boolean33 = keyedObjects2D8.equals(obj32);
        int int35 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) (short) 100);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 'a', (java.lang.Comparable) 2);
        java.lang.Object obj39 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D40 = new org.jfree.data.KeyedObjects2D();
        int int42 = keyedObjects2D40.getColumnIndex((java.lang.Comparable) 0.0d);
        int int44 = keyedObjects2D40.getRowIndex((java.lang.Comparable) 'a');
        int int45 = keyedObjects2D40.getColumnCount();
        int int47 = keyedObjects2D40.getRowIndex((java.lang.Comparable) (-1L));
        boolean boolean48 = keyedObjects2D8.equals((java.lang.Object) keyedObjects2D40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D8 and obj39", keyedObjects2D8.equals(obj39) ? keyedObjects2D8.hashCode() == obj39.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        int int9 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) 10);
        keyedObjects2D0.removeObject((java.lang.Comparable) true, (java.lang.Comparable) 10);
        java.lang.Object obj13 = keyedObjects2D0.clone();
        int int14 = keyedObjects2D0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj13", keyedObjects2D0.equals(obj13) ? keyedObjects2D0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        int int8 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.addObject((java.lang.Object) 0L, (java.lang.Comparable) 100.0d, (java.lang.Comparable) false);
        int int14 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1.0f));
        java.util.List list15 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D16.addObject((java.lang.Object) keyedObjects2D17, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int21 = keyedObjects2D17.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D17, (java.lang.Comparable) true, (java.lang.Comparable) 0);
        java.util.List list25 = keyedObjects2D0.getRowKeys();
        int int26 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        int int29 = keyedObjects2D27.getColumnIndex((java.lang.Comparable) 0.0d);
        int int31 = keyedObjects2D27.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj32 = keyedObjects2D27.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D33.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int39 = keyedObjects2D33.getColumnIndex((java.lang.Comparable) 0L);
        int int40 = keyedObjects2D33.getRowCount();
        keyedObjects2D27.setObject((java.lang.Object) int40, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int45 = keyedObjects2D27.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D46 = new org.jfree.data.KeyedObjects2D();
        java.util.List list47 = keyedObjects2D46.getRowKeys();
        keyedObjects2D27.setObject((java.lang.Object) keyedObjects2D46, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int52 = keyedObjects2D27.getRowIndex((java.lang.Comparable) (-1.0f));
        int int53 = keyedObjects2D27.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D54 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D55 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D54.addObject((java.lang.Object) keyedObjects2D55, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int59 = keyedObjects2D55.getRowCount();
        int int60 = keyedObjects2D55.getRowCount();
        java.util.List list61 = keyedObjects2D55.getColumnKeys();
        keyedObjects2D27.setObject((java.lang.Object) keyedObjects2D55, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (-1L));
        keyedObjects2D27.removeObject((java.lang.Comparable) (-1), (java.lang.Comparable) 10);
        java.util.List list68 = keyedObjects2D27.getColumnKeys();
        boolean boolean69 = keyedObjects2D0.equals((java.lang.Object) list68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D16 and keyedObjects2D54", keyedObjects2D16.equals(keyedObjects2D54) ? keyedObjects2D16.hashCode() == keyedObjects2D54.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        int int11 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 0.0d);
        int int13 = keyedObjects2D9.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj14 = keyedObjects2D9.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D15.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int21 = keyedObjects2D15.getColumnIndex((java.lang.Comparable) 0L);
        int int22 = keyedObjects2D15.getRowCount();
        keyedObjects2D9.setObject((java.lang.Object) int22, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int27 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        java.util.List list29 = keyedObjects2D28.getRowKeys();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D28, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj33 = null;
        boolean boolean34 = keyedObjects2D9.equals(obj33);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        int int36 = keyedObjects2D35.getRowCount();
        int int38 = keyedObjects2D35.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj39 = keyedObjects2D35.clone();
        int int40 = keyedObjects2D35.getColumnCount();
        keyedObjects2D9.setObject((java.lang.Object) keyedObjects2D35, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0f);
        boolean boolean44 = keyedObjects2D7.equals((java.lang.Object) keyedObjects2D9);
        int int45 = keyedObjects2D9.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D46 = new org.jfree.data.KeyedObjects2D();
        int int47 = keyedObjects2D46.getRowCount();
        int int49 = keyedObjects2D46.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D46.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D53 = new org.jfree.data.KeyedObjects2D();
        boolean boolean54 = keyedObjects2D46.equals((java.lang.Object) keyedObjects2D53);
        int int56 = keyedObjects2D53.getColumnIndex((java.lang.Comparable) 100L);
        java.util.List list57 = keyedObjects2D53.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D58 = new org.jfree.data.KeyedObjects2D();
        int int60 = keyedObjects2D58.getColumnIndex((java.lang.Comparable) 0.0d);
        int int62 = keyedObjects2D58.getRowIndex((java.lang.Comparable) 'a');
        int int64 = keyedObjects2D58.getColumnIndex((java.lang.Comparable) 10.0d);
        int int65 = keyedObjects2D58.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D66 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D67 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D66.addObject((java.lang.Object) keyedObjects2D67, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj71 = keyedObjects2D67.clone();
        keyedObjects2D67.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj76 = null;
        boolean boolean77 = keyedObjects2D67.equals(obj76);
        boolean boolean78 = keyedObjects2D58.equals((java.lang.Object) boolean77);
        int int80 = keyedObjects2D58.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D53.addObject((java.lang.Object) (byte) -1, (java.lang.Comparable) (-1L), (java.lang.Comparable) (byte) 100);
        java.lang.Comparable comparable85 = keyedObjects2D53.getColumnKey((int) (short) 0);
        keyedObjects2D9.setObject((java.lang.Object) comparable85, (java.lang.Comparable) 2, (java.lang.Comparable) 0.0d);
        int int90 = keyedObjects2D9.getRowIndex((java.lang.Comparable) (-1));
        java.lang.Object obj91 = keyedObjects2D9.clone();
        java.util.List list92 = keyedObjects2D9.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D9 and obj91", keyedObjects2D9.equals(obj91) ? keyedObjects2D9.hashCode() == obj91.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        boolean boolean8 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        int int10 = keyedObjects2D7.getColumnIndex((java.lang.Comparable) 100L);
        java.util.List list11 = keyedObjects2D7.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        int int14 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 0.0d);
        int int16 = keyedObjects2D12.getRowIndex((java.lang.Comparable) 'a');
        int int18 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 10.0d);
        int int19 = keyedObjects2D12.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D20.addObject((java.lang.Object) keyedObjects2D21, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj25 = keyedObjects2D21.clone();
        keyedObjects2D21.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj30 = null;
        boolean boolean31 = keyedObjects2D21.equals(obj30);
        boolean boolean32 = keyedObjects2D12.equals((java.lang.Object) boolean31);
        int int34 = keyedObjects2D12.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D7.addObject((java.lang.Object) (byte) -1, (java.lang.Comparable) (-1L), (java.lang.Comparable) (byte) 100);
        keyedObjects2D7.removeObject((java.lang.Comparable) 100L, (java.lang.Comparable) (-1));
        java.lang.Object obj41 = keyedObjects2D7.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D42.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D47 = new org.jfree.data.KeyedObjects2D();
        int int49 = keyedObjects2D47.getColumnIndex((java.lang.Comparable) 0.0d);
        int int51 = keyedObjects2D47.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj52 = keyedObjects2D47.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D53 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D53.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int59 = keyedObjects2D53.getColumnIndex((java.lang.Comparable) 0L);
        int int60 = keyedObjects2D53.getRowCount();
        keyedObjects2D47.setObject((java.lang.Object) int60, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        keyedObjects2D42.addObject((java.lang.Object) (short) 0, (java.lang.Comparable) 10.0d, (java.lang.Comparable) (-1L));
        java.lang.Object obj67 = keyedObjects2D42.clone();
        boolean boolean68 = keyedObjects2D7.equals(obj67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D7 and obj41", keyedObjects2D7.equals(obj41) ? keyedObjects2D7.hashCode() == obj41.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        java.util.List list3 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = new org.jfree.data.KeyedObjects2D();
        int int6 = keyedObjects2D4.getColumnIndex((java.lang.Comparable) 0.0d);
        int int8 = keyedObjects2D4.getRowIndex((java.lang.Comparable) 'a');
        int int10 = keyedObjects2D4.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list11 = keyedObjects2D4.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) list11, (java.lang.Comparable) 100L, (java.lang.Comparable) 0);
        int int15 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj16 = keyedObjects2D0.clone();
        int int17 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj16", keyedObjects2D0.equals(obj16) ? keyedObjects2D0.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        java.util.List list6 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 10, (java.lang.Comparable) (short) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj15 = keyedObjects2D10.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D16.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int22 = keyedObjects2D16.getColumnIndex((java.lang.Comparable) 0L);
        int int23 = keyedObjects2D16.getRowCount();
        keyedObjects2D10.setObject((java.lang.Object) int23, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int28 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        java.util.List list30 = keyedObjects2D29.getRowKeys();
        keyedObjects2D10.setObject((java.lang.Object) keyedObjects2D29, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.util.List list34 = keyedObjects2D10.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D10, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 0L);
        int int39 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj40 = keyedObjects2D0.clone();
        java.util.List list41 = keyedObjects2D0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj40", keyedObjects2D0.equals(obj40) ? keyedObjects2D0.hashCode() == obj40.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        int int8 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.addObject((java.lang.Object) 0L, (java.lang.Comparable) 100.0d, (java.lang.Comparable) false);
        java.lang.Object obj13 = keyedObjects2D0.clone();
        java.util.List list14 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj13", keyedObjects2D0.equals(obj13) ? keyedObjects2D0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        int int8 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.addObject((java.lang.Object) 0L, (java.lang.Comparable) 100.0d, (java.lang.Comparable) false);
        java.lang.Object obj13 = keyedObjects2D0.clone();
        java.util.List list14 = keyedObjects2D0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj13", keyedObjects2D0.equals(obj13) ? keyedObjects2D0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0.0d);
        int int23 = keyedObjects2D19.getRowIndex((java.lang.Comparable) 'a');
        int int25 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 10.0d);
        int int26 = keyedObjects2D19.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) int26, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1L));
        java.util.List list30 = keyedObjects2D0.getColumnKeys();
        java.util.List list31 = keyedObjects2D0.getRowKeys();
        java.util.List list32 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj33 = keyedObjects2D0.clone();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj33", keyedObjects2D0.equals(obj33) ? keyedObjects2D0.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        int int5 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D0.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int12 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 0.0d);
        int int14 = keyedObjects2D10.getRowIndex((java.lang.Comparable) 'a');
        int int16 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 10.0d);
        int int17 = keyedObjects2D10.getColumnCount();
        int int18 = keyedObjects2D10.getRowCount();
        java.lang.Object obj19 = keyedObjects2D10.clone();
        boolean boolean20 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D10);
        java.lang.Comparable comparable21 = null;
        int int22 = keyedObjects2D0.getColumnIndex(comparable21);
        java.lang.Object obj23 = keyedObjects2D0.clone();
        int int25 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj23", keyedObjects2D0.equals(obj23) ? keyedObjects2D0.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        int int8 = keyedObjects2D0.getRowCount();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        int int15 = keyedObjects2D14.getRowCount();
        boolean boolean17 = keyedObjects2D14.equals((java.lang.Object) 10.0d);
        int int19 = keyedObjects2D14.getRowIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        int int22 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) 0.0d);
        int int24 = keyedObjects2D20.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D20.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list28 = keyedObjects2D20.getColumnKeys();
        boolean boolean29 = keyedObjects2D14.equals((java.lang.Object) list28);
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D30.addObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj35 = keyedObjects2D31.clone();
        keyedObjects2D31.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.util.List list40 = keyedObjects2D31.getColumnKeys();
        boolean boolean41 = keyedObjects2D14.equals((java.lang.Object) keyedObjects2D31);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) 3, (java.lang.Comparable) 100);
        int int45 = keyedObjects2D31.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D46 = new org.jfree.data.KeyedObjects2D();
        int int47 = keyedObjects2D46.getRowCount();
        int int49 = keyedObjects2D46.getRowIndex((java.lang.Comparable) (byte) -1);
        int int51 = keyedObjects2D46.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D46.addObject((java.lang.Object) 1L, (java.lang.Comparable) 100L, (java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D56 = new org.jfree.data.KeyedObjects2D();
        int int58 = keyedObjects2D56.getColumnIndex((java.lang.Comparable) 0.0d);
        int int60 = keyedObjects2D56.getRowIndex((java.lang.Comparable) 'a');
        int int62 = keyedObjects2D56.getColumnIndex((java.lang.Comparable) 10.0d);
        int int63 = keyedObjects2D56.getColumnCount();
        int int64 = keyedObjects2D56.getRowCount();
        java.lang.Object obj65 = keyedObjects2D56.clone();
        boolean boolean66 = keyedObjects2D46.equals((java.lang.Object) keyedObjects2D56);
        java.lang.Comparable comparable67 = null;
        int int68 = keyedObjects2D46.getColumnIndex(comparable67);
        keyedObjects2D31.addObject((java.lang.Object) int68, (java.lang.Comparable) (-1), (java.lang.Comparable) (short) 0);
        java.lang.Object obj72 = keyedObjects2D31.clone();
        java.util.List list73 = keyedObjects2D31.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D31 and obj72", keyedObjects2D31.equals(obj72) ? keyedObjects2D31.hashCode() == obj72.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj7 = keyedObjects2D0.clone();
        int int8 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj7", keyedObjects2D0.equals(obj7) ? keyedObjects2D0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list5 = keyedObjects2D0.getRowKeys();
        int int6 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D7.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list12 = keyedObjects2D7.getRowKeys();
        int int13 = keyedObjects2D7.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.addObject((java.lang.Object) keyedObjects2D15, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj19 = keyedObjects2D15.clone();
        int int20 = keyedObjects2D15.getColumnCount();
        int int22 = keyedObjects2D15.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean23 = keyedObjects2D7.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable25 = keyedObjects2D7.getColumnKey((int) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        int int28 = keyedObjects2D26.getColumnIndex((java.lang.Comparable) 0.0d);
        int int30 = keyedObjects2D26.getRowIndex((java.lang.Comparable) 'a');
        int int32 = keyedObjects2D26.getRowIndex((java.lang.Comparable) '4');
        keyedObjects2D7.addObject((java.lang.Object) int32, (java.lang.Comparable) '4', (java.lang.Comparable) 'a');
        java.lang.Class<?> wildcardClass36 = keyedObjects2D7.getClass();
        boolean boolean37 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D7);
        org.jfree.data.KeyedObjects2D keyedObjects2D38 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D38.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj45 = keyedObjects2D38.getObject(0, 0);
        int int46 = keyedObjects2D38.getRowCount();
        int int47 = keyedObjects2D38.getRowCount();
        java.util.List list48 = keyedObjects2D38.getColumnKeys();
        boolean boolean49 = keyedObjects2D0.equals((java.lang.Object) list48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and keyedObjects2D38", keyedObjects2D0.equals(keyedObjects2D38) ? keyedObjects2D0.hashCode() == keyedObjects2D38.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        keyedObjects2D0.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        int int31 = keyedObjects2D29.getColumnIndex((java.lang.Comparable) 0.0d);
        int int33 = keyedObjects2D29.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj34 = keyedObjects2D29.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D35.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int41 = keyedObjects2D35.getColumnIndex((java.lang.Comparable) 0L);
        int int42 = keyedObjects2D35.getRowCount();
        keyedObjects2D29.setObject((java.lang.Object) int42, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int47 = keyedObjects2D29.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D48 = new org.jfree.data.KeyedObjects2D();
        java.util.List list49 = keyedObjects2D48.getRowKeys();
        keyedObjects2D29.setObject((java.lang.Object) keyedObjects2D48, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj53 = null;
        boolean boolean54 = keyedObjects2D29.equals(obj53);
        org.jfree.data.KeyedObjects2D keyedObjects2D55 = new org.jfree.data.KeyedObjects2D();
        int int56 = keyedObjects2D55.getRowCount();
        int int58 = keyedObjects2D55.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj59 = keyedObjects2D55.clone();
        int int60 = keyedObjects2D55.getColumnCount();
        keyedObjects2D29.setObject((java.lang.Object) keyedObjects2D55, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0f);
        keyedObjects2D55.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D67 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D68 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D67.addObject((java.lang.Object) keyedObjects2D68, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj72 = keyedObjects2D68.clone();
        int int74 = keyedObjects2D68.getRowIndex((java.lang.Comparable) false);
        java.util.List list75 = keyedObjects2D68.getRowKeys();
        keyedObjects2D55.addObject((java.lang.Object) keyedObjects2D68, (java.lang.Comparable) 100.0d, (java.lang.Comparable) (short) 1);
        keyedObjects2D0.setObject((java.lang.Object) (short) 1, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D6 and keyedObjects2D35", keyedObjects2D6.equals(keyedObjects2D35) ? keyedObjects2D6.hashCode() == keyedObjects2D35.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int8 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0f);
        java.util.List list9 = keyedObjects2D0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D10.addObject((java.lang.Object) keyedObjects2D11, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D15.addObject((java.lang.Object) keyedObjects2D16, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int21 = keyedObjects2D15.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.List list22 = keyedObjects2D15.getColumnKeys();
        keyedObjects2D10.addObject((java.lang.Object) list22, (java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 0);
        java.lang.Object obj26 = keyedObjects2D10.clone();
        keyedObjects2D0.setObject(obj26, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D10 and obj26", keyedObjects2D10.equals(obj26) ? keyedObjects2D10.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getRowCount();
        keyedObjects2D0.addObject((java.lang.Object) (short) 100, (java.lang.Comparable) 10.0f, (java.lang.Comparable) (byte) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        int int14 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) 0.0d);
        int int16 = keyedObjects2D12.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj17 = keyedObjects2D12.clone();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D12, (java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        int int22 = keyedObjects2D21.getRowCount();
        int int24 = keyedObjects2D21.getRowIndex((java.lang.Comparable) (byte) -1);
        int int26 = keyedObjects2D21.getColumnIndex((java.lang.Comparable) 1.0f);
        int int27 = keyedObjects2D21.getRowCount();
        java.lang.Object obj28 = keyedObjects2D21.clone();
        keyedObjects2D12.addObject(obj28, (java.lang.Comparable) (-1), (java.lang.Comparable) true);
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D32.addObject((java.lang.Object) keyedObjects2D33, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj37 = keyedObjects2D33.clone();
        int int38 = keyedObjects2D33.getColumnCount();
        int int40 = keyedObjects2D33.getRowIndex((java.lang.Comparable) (short) 10);
        int int41 = keyedObjects2D33.getColumnCount();
        int int42 = keyedObjects2D33.getRowCount();
        int int44 = keyedObjects2D33.getColumnIndex((java.lang.Comparable) ' ');
        keyedObjects2D12.setObject((java.lang.Object) int44, (java.lang.Comparable) 0L, (java.lang.Comparable) 100);
        int int49 = keyedObjects2D12.getColumnIndex((java.lang.Comparable) "hi!");
        org.jfree.data.KeyedObjects2D keyedObjects2D50 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D50.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int56 = keyedObjects2D50.getColumnIndex((java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D57 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D58 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D57.addObject((java.lang.Object) keyedObjects2D58, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj62 = keyedObjects2D58.clone();
        keyedObjects2D58.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        boolean boolean67 = keyedObjects2D50.equals((java.lang.Object) keyedObjects2D58);
        int int69 = keyedObjects2D58.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj70 = keyedObjects2D58.clone();
        boolean boolean71 = keyedObjects2D12.equals((java.lang.Object) keyedObjects2D58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D58 and obj70", keyedObjects2D58.equals(obj70) ? keyedObjects2D58.hashCode() == obj70.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0.0d);
        int int23 = keyedObjects2D19.getRowIndex((java.lang.Comparable) 'a');
        int int25 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 10.0d);
        int int26 = keyedObjects2D19.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) int26, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1L));
        java.util.List list30 = keyedObjects2D0.getColumnKeys();
        java.util.List list31 = keyedObjects2D0.getRowKeys();
        java.util.List list32 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj33 = keyedObjects2D0.clone();
        int int34 = keyedObjects2D0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj33", keyedObjects2D0.equals(obj33) ? keyedObjects2D0.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        int int27 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (short) 100);
        int int28 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        int int31 = keyedObjects2D29.getColumnIndex((java.lang.Comparable) 0.0d);
        int int33 = keyedObjects2D29.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj34 = keyedObjects2D29.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D35.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int41 = keyedObjects2D35.getColumnIndex((java.lang.Comparable) 0L);
        int int42 = keyedObjects2D35.getRowCount();
        keyedObjects2D29.setObject((java.lang.Object) int42, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int47 = keyedObjects2D29.getColumnIndex((java.lang.Comparable) 100.0f);
        java.util.List list48 = keyedObjects2D29.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D49 = new org.jfree.data.KeyedObjects2D();
        int int51 = keyedObjects2D49.getColumnIndex((java.lang.Comparable) 0.0d);
        int int53 = keyedObjects2D49.getRowIndex((java.lang.Comparable) 'a');
        int int55 = keyedObjects2D49.getColumnIndex((java.lang.Comparable) 10.0d);
        int int56 = keyedObjects2D49.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D57 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D57.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D57.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D49.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        keyedObjects2D49.setObject((java.lang.Object) 1, (java.lang.Comparable) 0L, (java.lang.Comparable) (-1));
        keyedObjects2D49.removeRow(0);
        boolean boolean74 = keyedObjects2D29.equals((java.lang.Object) 0);
        int int76 = keyedObjects2D29.getRowIndex((java.lang.Comparable) 100.0d);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D29, (java.lang.Comparable) (-1), (java.lang.Comparable) 1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D6 and keyedObjects2D35", keyedObjects2D6.equals(keyedObjects2D35) ? keyedObjects2D6.hashCode() == keyedObjects2D35.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.util.List list24 = keyedObjects2D0.getRowKeys();
        keyedObjects2D0.removeObject((java.lang.Comparable) (byte) 100, (java.lang.Comparable) 100);
        keyedObjects2D0.removeObject((java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        java.lang.Object obj31 = keyedObjects2D0.clone();
        java.util.List list32 = keyedObjects2D0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj31", keyedObjects2D0.equals(obj31) ? keyedObjects2D0.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        int int8 = keyedObjects2D0.getRowCount();
        int int10 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D0.removeObject((java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        int int15 = keyedObjects2D14.getRowCount();
        boolean boolean17 = keyedObjects2D14.equals((java.lang.Object) 10.0d);
        int int19 = keyedObjects2D14.getRowIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        int int22 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) 0.0d);
        int int24 = keyedObjects2D20.getRowIndex((java.lang.Comparable) 'a');
        keyedObjects2D20.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) (short) 100);
        java.util.List list28 = keyedObjects2D20.getColumnKeys();
        boolean boolean29 = keyedObjects2D14.equals((java.lang.Object) list28);
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D30.addObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj35 = keyedObjects2D31.clone();
        keyedObjects2D31.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.util.List list40 = keyedObjects2D31.getColumnKeys();
        boolean boolean41 = keyedObjects2D14.equals((java.lang.Object) keyedObjects2D31);
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D31, (java.lang.Comparable) 3, (java.lang.Comparable) 100);
        java.lang.Object obj45 = keyedObjects2D0.clone();
        int int46 = keyedObjects2D0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj45", keyedObjects2D0.equals(obj45) ? keyedObjects2D0.hashCode() == obj45.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        int int10 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 0.0d);
        int int12 = keyedObjects2D8.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj13 = keyedObjects2D8.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D14.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int20 = keyedObjects2D14.getColumnIndex((java.lang.Comparable) 0L);
        int int21 = keyedObjects2D14.getRowCount();
        keyedObjects2D8.setObject((java.lang.Object) int21, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int26 = keyedObjects2D8.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = new org.jfree.data.KeyedObjects2D();
        java.util.List list28 = keyedObjects2D27.getRowKeys();
        keyedObjects2D8.setObject((java.lang.Object) keyedObjects2D27, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj32 = null;
        boolean boolean33 = keyedObjects2D8.equals(obj32);
        keyedObjects2D8.removeObject((java.lang.Comparable) (-1L), (java.lang.Comparable) false);
        keyedObjects2D8.removeRow((int) (short) 0);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) 0.0f, (java.lang.Comparable) 100L);
        keyedObjects2D8.addObject((java.lang.Object) ' ', (java.lang.Comparable) "hi!", (java.lang.Comparable) 2);
        org.jfree.data.KeyedObjects2D keyedObjects2D46 = new org.jfree.data.KeyedObjects2D();
        int int48 = keyedObjects2D46.getColumnIndex((java.lang.Comparable) 0.0d);
        int int50 = keyedObjects2D46.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj51 = keyedObjects2D46.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D52 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D52.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int58 = keyedObjects2D52.getColumnIndex((java.lang.Comparable) 0L);
        int int59 = keyedObjects2D52.getRowCount();
        keyedObjects2D46.setObject((java.lang.Object) int59, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int64 = keyedObjects2D46.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D65 = new org.jfree.data.KeyedObjects2D();
        java.util.List list66 = keyedObjects2D65.getRowKeys();
        keyedObjects2D46.setObject((java.lang.Object) keyedObjects2D65, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D70 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D71 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D70.addObject((java.lang.Object) keyedObjects2D71, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int75 = keyedObjects2D71.getRowCount();
        boolean boolean76 = keyedObjects2D46.equals((java.lang.Object) int75);
        org.jfree.data.KeyedObjects2D keyedObjects2D77 = new org.jfree.data.KeyedObjects2D();
        int int78 = keyedObjects2D77.getRowCount();
        boolean boolean80 = keyedObjects2D77.equals((java.lang.Object) 10.0d);
        keyedObjects2D46.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean85 = keyedObjects2D46.equals((java.lang.Object) 10L);
        keyedObjects2D46.removeRow((java.lang.Comparable) (short) 0);
        int int89 = keyedObjects2D46.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D8.addObject((java.lang.Object) keyedObjects2D46, (java.lang.Comparable) 100.0f, (java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D14 and keyedObjects2D52", keyedObjects2D14.equals(keyedObjects2D52) ? keyedObjects2D14.hashCode() == keyedObjects2D52.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        java.util.List list6 = keyedObjects2D5.getRowKeys();
        java.lang.Object obj7 = keyedObjects2D5.clone();
        keyedObjects2D0.addObject(obj7, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 100);
        java.lang.Object obj11 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        int int13 = keyedObjects2D12.getRowCount();
        java.lang.Object obj14 = keyedObjects2D12.clone();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D12, (java.lang.Comparable) (byte) 10, (java.lang.Comparable) 1.0d);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D18.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list23 = keyedObjects2D18.getRowKeys();
        int int24 = keyedObjects2D18.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D25.addObject((java.lang.Object) keyedObjects2D26, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj30 = keyedObjects2D26.clone();
        int int31 = keyedObjects2D26.getColumnCount();
        int int33 = keyedObjects2D26.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean34 = keyedObjects2D18.equals((java.lang.Object) (short) 10);
        java.lang.Comparable comparable36 = keyedObjects2D18.getColumnKey(0);
        int int37 = keyedObjects2D18.getColumnCount();
        int int38 = keyedObjects2D18.getColumnCount();
        keyedObjects2D12.addObject((java.lang.Object) keyedObjects2D18, (java.lang.Comparable) 2, (java.lang.Comparable) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        int int44 = keyedObjects2D42.getColumnIndex((java.lang.Comparable) 0.0d);
        int int46 = keyedObjects2D42.getRowIndex((java.lang.Comparable) 'a');
        int int48 = keyedObjects2D42.getColumnIndex((java.lang.Comparable) 10.0d);
        int int49 = keyedObjects2D42.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D50 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D50.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D50.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D42.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D61 = new org.jfree.data.KeyedObjects2D();
        int int63 = keyedObjects2D61.getColumnIndex((java.lang.Comparable) 0.0d);
        int int65 = keyedObjects2D61.getRowIndex((java.lang.Comparable) 'a');
        int int67 = keyedObjects2D61.getColumnIndex((java.lang.Comparable) 10.0d);
        int int68 = keyedObjects2D61.getColumnCount();
        keyedObjects2D42.setObject((java.lang.Object) int68, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1L));
        int int73 = keyedObjects2D42.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list74 = keyedObjects2D42.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D75 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D76 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D75.addObject((java.lang.Object) keyedObjects2D76, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj80 = keyedObjects2D76.clone();
        int int81 = keyedObjects2D76.getColumnCount();
        int int83 = keyedObjects2D76.getRowIndex((java.lang.Comparable) (short) 10);
        int int84 = keyedObjects2D76.getColumnCount();
        java.lang.Object obj85 = keyedObjects2D76.clone();
        keyedObjects2D42.addObject((java.lang.Object) keyedObjects2D76, (java.lang.Comparable) ' ', (java.lang.Comparable) 0L);
        int int89 = keyedObjects2D42.getRowCount();
        keyedObjects2D42.removeObject((java.lang.Comparable) (-1), (java.lang.Comparable) (short) -1);
        keyedObjects2D12.setObject((java.lang.Object) keyedObjects2D42, (java.lang.Comparable) (byte) -1, (java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D25 and keyedObjects2D75", keyedObjects2D25.equals(keyedObjects2D75) ? keyedObjects2D25.hashCode() == keyedObjects2D75.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj7 = keyedObjects2D0.getObject(0, 0);
        keyedObjects2D0.removeObject((java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) -1);
        java.lang.Object obj11 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D12.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj19 = keyedObjects2D12.getObject(0, 0);
        keyedObjects2D12.removeObject((java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) -1);
        java.util.List list23 = keyedObjects2D12.getColumnKeys();
        java.lang.Object obj24 = keyedObjects2D12.clone();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D12, (java.lang.Comparable) 10.0d, (java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and keyedObjects2D12", obj11.equals(keyedObjects2D12) ? obj11.hashCode() == keyedObjects2D12.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        int int8 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D9.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = new org.jfree.data.KeyedObjects2D();
        java.util.List list15 = keyedObjects2D14.getRowKeys();
        java.lang.Object obj16 = keyedObjects2D14.clone();
        keyedObjects2D9.addObject(obj16, (java.lang.Comparable) 1.0f, (java.lang.Comparable) (byte) 100);
        int int20 = keyedObjects2D9.getRowCount();
        java.lang.Comparable comparable22 = keyedObjects2D9.getRowKey(1);
        int int24 = keyedObjects2D9.getColumnIndex((java.lang.Comparable) 100.0f);
        boolean boolean25 = keyedObjects2D0.equals((java.lang.Object) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D26.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int32 = keyedObjects2D26.getColumnIndex((java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D33.addObject((java.lang.Object) keyedObjects2D34, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj38 = keyedObjects2D34.clone();
        keyedObjects2D34.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        boolean boolean43 = keyedObjects2D26.equals((java.lang.Object) keyedObjects2D34);
        int int45 = keyedObjects2D34.getRowIndex((java.lang.Comparable) (short) 0);
        java.lang.Object obj46 = keyedObjects2D34.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D47 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D48 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D47.addObject((java.lang.Object) keyedObjects2D48, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int52 = keyedObjects2D47.getColumnCount();
        java.util.List list53 = keyedObjects2D47.getRowKeys();
        int int54 = keyedObjects2D47.getRowCount();
        java.lang.Comparable comparable56 = keyedObjects2D47.getRowKey(0);
        int int57 = keyedObjects2D47.getColumnCount();
        keyedObjects2D34.setObject((java.lang.Object) keyedObjects2D47, (java.lang.Comparable) 10, (java.lang.Comparable) "hi!");
        int int61 = keyedObjects2D34.getColumnCount();
        java.util.List list62 = keyedObjects2D34.getRowKeys();
        boolean boolean63 = keyedObjects2D0.equals((java.lang.Object) list62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and keyedObjects2D26", keyedObjects2D0.equals(keyedObjects2D26) ? keyedObjects2D0.hashCode() == keyedObjects2D26.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.util.List list24 = keyedObjects2D19.getColumnKeys();
        keyedObjects2D19.removeObject((java.lang.Comparable) true, (java.lang.Comparable) '#');
        java.util.List list28 = keyedObjects2D19.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D29.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.util.List list34 = keyedObjects2D29.getRowKeys();
        int int35 = keyedObjects2D29.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D37 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D36.addObject((java.lang.Object) keyedObjects2D37, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj41 = keyedObjects2D37.clone();
        int int42 = keyedObjects2D37.getColumnCount();
        int int44 = keyedObjects2D37.getRowIndex((java.lang.Comparable) (short) 10);
        boolean boolean45 = keyedObjects2D29.equals((java.lang.Object) (short) 10);
        java.util.List list46 = keyedObjects2D29.getRowKeys();
        keyedObjects2D29.removeObject((java.lang.Comparable) ' ', (java.lang.Comparable) 10.0f);
        int int50 = keyedObjects2D29.getRowCount();
        int int52 = keyedObjects2D29.getColumnIndex((java.lang.Comparable) 1.0f);
        keyedObjects2D19.setObject((java.lang.Object) keyedObjects2D29, (java.lang.Comparable) 100, (java.lang.Comparable) 1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D6 and keyedObjects2D29", keyedObjects2D6.equals(keyedObjects2D29) ? keyedObjects2D6.hashCode() == keyedObjects2D29.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int25 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        int int26 = keyedObjects2D0.getColumnCount();
        int int28 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0L);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = new org.jfree.data.KeyedObjects2D();
        int int31 = keyedObjects2D29.getColumnIndex((java.lang.Comparable) 0.0d);
        int int33 = keyedObjects2D29.getRowIndex((java.lang.Comparable) 'a');
        int int35 = keyedObjects2D29.getColumnIndex((java.lang.Comparable) 10.0d);
        int int36 = keyedObjects2D29.getColumnCount();
        int int37 = keyedObjects2D29.getRowCount();
        int int39 = keyedObjects2D29.getRowIndex((java.lang.Comparable) 100.0f);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D29, (java.lang.Comparable) 100.0f, (java.lang.Comparable) 100L);
        org.jfree.data.KeyedObjects2D keyedObjects2D43 = new org.jfree.data.KeyedObjects2D();
        int int45 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) 0.0d);
        int int47 = keyedObjects2D43.getRowIndex((java.lang.Comparable) 'a');
        int int49 = keyedObjects2D43.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list50 = keyedObjects2D43.getRowKeys();
        java.util.List list51 = keyedObjects2D43.getColumnKeys();
        int int53 = keyedObjects2D43.getRowIndex((java.lang.Comparable) (byte) 100);
        org.jfree.data.KeyedObjects2D keyedObjects2D54 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D55 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D54.addObject((java.lang.Object) keyedObjects2D55, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj59 = keyedObjects2D55.clone();
        int int60 = keyedObjects2D55.getColumnCount();
        int int62 = keyedObjects2D55.getRowIndex((java.lang.Comparable) (short) 10);
        int int63 = keyedObjects2D55.getColumnCount();
        java.lang.Class<?> wildcardClass64 = keyedObjects2D55.getClass();
        boolean boolean65 = keyedObjects2D43.equals((java.lang.Object) wildcardClass64);
        keyedObjects2D29.setObject((java.lang.Object) keyedObjects2D43, (java.lang.Comparable) (short) 1, (java.lang.Comparable) (short) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D69 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D69.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D69.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int77 = keyedObjects2D69.getRowCount();
        int int78 = keyedObjects2D69.getRowCount();
        java.util.List list79 = keyedObjects2D69.getColumnKeys();
        keyedObjects2D29.addObject((java.lang.Object) keyedObjects2D69, (java.lang.Comparable) 0.0f, (java.lang.Comparable) (byte) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D83 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D84 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D83.addObject((java.lang.Object) keyedObjects2D84, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int88 = keyedObjects2D84.getRowCount();
        java.util.List list89 = keyedObjects2D84.getColumnKeys();
        keyedObjects2D29.addObject((java.lang.Object) list89, (java.lang.Comparable) (-1L), (java.lang.Comparable) (-1L));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D54 and keyedObjects2D83", keyedObjects2D54.equals(keyedObjects2D83) ? keyedObjects2D54.hashCode() == keyedObjects2D83.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D24.addObject((java.lang.Object) keyedObjects2D25, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int29 = keyedObjects2D25.getRowCount();
        boolean boolean30 = keyedObjects2D0.equals((java.lang.Object) int29);
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = new org.jfree.data.KeyedObjects2D();
        int int32 = keyedObjects2D31.getRowCount();
        boolean boolean34 = keyedObjects2D31.equals((java.lang.Object) 10.0d);
        keyedObjects2D0.setObject((java.lang.Object) 10.0d, (java.lang.Comparable) 1, (java.lang.Comparable) 10L);
        boolean boolean39 = keyedObjects2D0.equals((java.lang.Object) 10L);
        org.jfree.data.KeyedObjects2D keyedObjects2D40 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D40.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D40.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        java.util.List list48 = keyedObjects2D40.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D40, (java.lang.Comparable) true, (java.lang.Comparable) (short) 0);
        int int53 = keyedObjects2D40.getColumnIndex((java.lang.Comparable) '#');
        int int55 = keyedObjects2D40.getColumnIndex((java.lang.Comparable) 1.0f);
        int int56 = keyedObjects2D40.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D57 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D58 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D57.addObject((java.lang.Object) keyedObjects2D58, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int63 = keyedObjects2D57.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.List list64 = keyedObjects2D57.getColumnKeys();
        boolean boolean65 = keyedObjects2D40.equals((java.lang.Object) list64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D24 and keyedObjects2D57", keyedObjects2D24.equals(keyedObjects2D57) ? keyedObjects2D24.hashCode() == keyedObjects2D57.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        java.lang.Object obj9 = null;
        keyedObjects2D0.addObject(obj9, (java.lang.Comparable) 10L, (java.lang.Comparable) 2);
        java.lang.Comparable comparable14 = keyedObjects2D0.getColumnKey((int) (byte) 0);
        int int16 = keyedObjects2D0.getRowIndex((java.lang.Comparable) "");
        java.lang.Object obj17 = keyedObjects2D0.clone();
        java.util.List list18 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj17", keyedObjects2D0.equals(obj17) ? keyedObjects2D0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int5 = keyedObjects2D1.getRowCount();
        java.lang.Object obj6 = keyedObjects2D1.clone();
        keyedObjects2D1.removeObject((java.lang.Comparable) true, (java.lang.Comparable) 1L);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = new org.jfree.data.KeyedObjects2D();
        int int11 = keyedObjects2D10.getRowCount();
        int int13 = keyedObjects2D10.getRowIndex((java.lang.Comparable) (byte) -1);
        int int15 = keyedObjects2D10.getColumnIndex((java.lang.Comparable) 1.0f);
        java.lang.Object obj16 = keyedObjects2D10.clone();
        keyedObjects2D1.setObject((java.lang.Object) keyedObjects2D10, (java.lang.Comparable) 'a', (java.lang.Comparable) false);
        java.lang.Object obj20 = keyedObjects2D10.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D21.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj28 = keyedObjects2D21.getObject(0, 0);
        int int29 = keyedObjects2D21.getRowCount();
        java.util.List list30 = keyedObjects2D21.getColumnKeys();
        java.lang.Comparable comparable32 = keyedObjects2D21.getRowKey(0);
        java.util.List list33 = keyedObjects2D21.getRowKeys();
        boolean boolean34 = keyedObjects2D10.equals((java.lang.Object) keyedObjects2D21);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        int int37 = keyedObjects2D35.getColumnIndex((java.lang.Comparable) 0.0d);
        int int39 = keyedObjects2D35.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj40 = keyedObjects2D35.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D41 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D41.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int47 = keyedObjects2D41.getColumnIndex((java.lang.Comparable) 0L);
        int int48 = keyedObjects2D41.getRowCount();
        keyedObjects2D35.setObject((java.lang.Object) int48, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int53 = keyedObjects2D35.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D54 = new org.jfree.data.KeyedObjects2D();
        java.util.List list55 = keyedObjects2D54.getRowKeys();
        keyedObjects2D35.setObject((java.lang.Object) keyedObjects2D54, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int60 = keyedObjects2D35.getRowIndex((java.lang.Comparable) (-1.0f));
        java.util.List list61 = keyedObjects2D35.getColumnKeys();
        int int62 = keyedObjects2D35.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D63 = new org.jfree.data.KeyedObjects2D();
        int int65 = keyedObjects2D63.getColumnIndex((java.lang.Comparable) 0.0d);
        keyedObjects2D35.addObject((java.lang.Object) keyedObjects2D63, (java.lang.Comparable) 1.0f, (java.lang.Comparable) false);
        keyedObjects2D10.setObject((java.lang.Object) keyedObjects2D35, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D21 and keyedObjects2D41", keyedObjects2D21.equals(keyedObjects2D41) ? keyedObjects2D21.hashCode() == keyedObjects2D41.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj15 = keyedObjects2D8.getObject(0, 0);
        int int16 = keyedObjects2D8.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D8, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) "hi!");
        int int20 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj21 = keyedObjects2D0.clone();
        java.lang.Comparable comparable23 = keyedObjects2D0.getRowKey(0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj21", keyedObjects2D0.equals(obj21) ? keyedObjects2D0.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 10.0d);
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D8.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D8.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D0.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        int int21 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 0.0d);
        int int23 = keyedObjects2D19.getRowIndex((java.lang.Comparable) 'a');
        int int25 = keyedObjects2D19.getColumnIndex((java.lang.Comparable) 10.0d);
        int int26 = keyedObjects2D19.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) int26, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1L));
        java.util.List list30 = keyedObjects2D0.getColumnKeys();
        java.util.List list31 = keyedObjects2D0.getRowKeys();
        java.util.List list32 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj33 = keyedObjects2D0.clone();
        int int35 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj33", keyedObjects2D0.equals(obj33) ? keyedObjects2D0.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        int int3 = keyedObjects2D1.getColumnIndex((java.lang.Comparable) 0.0d);
        int int5 = keyedObjects2D1.getRowIndex((java.lang.Comparable) 'a');
        int int7 = keyedObjects2D1.getColumnIndex((java.lang.Comparable) 10.0d);
        int int8 = keyedObjects2D1.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D9.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D9.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D1.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = new org.jfree.data.KeyedObjects2D();
        int int22 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) 0.0d);
        int int24 = keyedObjects2D20.getRowIndex((java.lang.Comparable) 'a');
        int int26 = keyedObjects2D20.getColumnIndex((java.lang.Comparable) 10.0d);
        int int27 = keyedObjects2D20.getColumnCount();
        keyedObjects2D1.setObject((java.lang.Object) int27, (java.lang.Comparable) (-1.0d), (java.lang.Comparable) (-1L));
        int int32 = keyedObjects2D1.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list33 = keyedObjects2D1.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D34.addObject((java.lang.Object) keyedObjects2D35, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj39 = keyedObjects2D35.clone();
        int int40 = keyedObjects2D35.getColumnCount();
        int int42 = keyedObjects2D35.getRowIndex((java.lang.Comparable) (short) 10);
        int int43 = keyedObjects2D35.getColumnCount();
        java.lang.Object obj44 = keyedObjects2D35.clone();
        keyedObjects2D1.addObject((java.lang.Object) keyedObjects2D35, (java.lang.Comparable) ' ', (java.lang.Comparable) 0L);
        int int48 = keyedObjects2D1.getRowCount();
        boolean boolean49 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D1);
        int int51 = keyedObjects2D1.getColumnIndex((java.lang.Comparable) 10);
        org.jfree.data.KeyedObjects2D keyedObjects2D52 = new org.jfree.data.KeyedObjects2D();
        int int54 = keyedObjects2D52.getColumnIndex((java.lang.Comparable) 0.0d);
        int int56 = keyedObjects2D52.getRowIndex((java.lang.Comparable) 'a');
        int int58 = keyedObjects2D52.getColumnIndex((java.lang.Comparable) 10.0d);
        int int59 = keyedObjects2D52.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D60 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D60.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D60.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        keyedObjects2D52.setObject((java.lang.Object) 0.0d, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) 0);
        org.jfree.data.KeyedObjects2D keyedObjects2D71 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D72 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D71.addObject((java.lang.Object) keyedObjects2D72, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj76 = keyedObjects2D72.clone();
        int int77 = keyedObjects2D72.getColumnCount();
        java.lang.Object obj78 = keyedObjects2D72.clone();
        java.util.List list79 = keyedObjects2D72.getRowKeys();
        boolean boolean80 = keyedObjects2D52.equals((java.lang.Object) keyedObjects2D72);
        org.jfree.data.KeyedObjects2D keyedObjects2D81 = new org.jfree.data.KeyedObjects2D();
        int int82 = keyedObjects2D81.getRowCount();
        int int84 = keyedObjects2D81.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D81.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int89 = keyedObjects2D81.getColumnIndex((java.lang.Comparable) 0.0f);
        java.util.List list90 = keyedObjects2D81.getColumnKeys();
        keyedObjects2D52.setObject((java.lang.Object) keyedObjects2D81, (java.lang.Comparable) 'a', (java.lang.Comparable) 3);
        keyedObjects2D1.setObject((java.lang.Object) 'a', (java.lang.Comparable) 1.0d, (java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D9 and keyedObjects2D60", keyedObjects2D9.equals(keyedObjects2D60) ? keyedObjects2D9.hashCode() == keyedObjects2D60.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj7 = keyedObjects2D0.clone();
        java.lang.Object obj8 = null;
        boolean boolean9 = keyedObjects2D0.equals(obj8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj7", keyedObjects2D0.equals(obj7) ? keyedObjects2D0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int6 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.lang.Object obj7 = keyedObjects2D0.clone();
        int int8 = keyedObjects2D0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj7", keyedObjects2D0.equals(obj7) ? keyedObjects2D0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        int int25 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1.0f));
        java.util.List list26 = keyedObjects2D0.getColumnKeys();
        int int27 = keyedObjects2D0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = new org.jfree.data.KeyedObjects2D();
        int int30 = keyedObjects2D28.getColumnIndex((java.lang.Comparable) 0.0d);
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D28, (java.lang.Comparable) 1.0f, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = new org.jfree.data.KeyedObjects2D();
        int int36 = keyedObjects2D34.getColumnIndex((java.lang.Comparable) 0.0d);
        int int38 = keyedObjects2D34.getRowIndex((java.lang.Comparable) 'a');
        int int40 = keyedObjects2D34.getColumnIndex((java.lang.Comparable) (-1));
        java.util.List list41 = keyedObjects2D34.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D42.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        keyedObjects2D42.removeObject((java.lang.Comparable) (short) 100, (java.lang.Comparable) 0.0d);
        int int51 = keyedObjects2D42.getRowIndex((java.lang.Comparable) (short) 1);
        boolean boolean52 = keyedObjects2D34.equals((java.lang.Object) keyedObjects2D42);
        org.jfree.data.KeyedObjects2D keyedObjects2D53 = new org.jfree.data.KeyedObjects2D();
        int int55 = keyedObjects2D53.getColumnIndex((java.lang.Comparable) 0.0d);
        int int57 = keyedObjects2D53.getRowIndex((java.lang.Comparable) 'a');
        int int59 = keyedObjects2D53.getColumnIndex((java.lang.Comparable) 10.0d);
        int int60 = keyedObjects2D53.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D61 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D62 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D61.addObject((java.lang.Object) keyedObjects2D62, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        java.lang.Object obj66 = keyedObjects2D62.clone();
        keyedObjects2D62.setObject((java.lang.Object) 1.0d, (java.lang.Comparable) "hi!", (java.lang.Comparable) 'a');
        java.lang.Object obj71 = null;
        boolean boolean72 = keyedObjects2D62.equals(obj71);
        boolean boolean73 = keyedObjects2D53.equals((java.lang.Object) boolean72);
        int int75 = keyedObjects2D53.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Class<?> wildcardClass76 = keyedObjects2D53.getClass();
        keyedObjects2D34.setObject((java.lang.Object) wildcardClass76, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 10);
        keyedObjects2D0.addObject((java.lang.Object) wildcardClass76, (java.lang.Comparable) '4', (java.lang.Comparable) 0.0f);
        int int84 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) "");
        java.util.List list85 = keyedObjects2D0.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D86 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D86.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int92 = keyedObjects2D86.getColumnIndex((java.lang.Comparable) "");
        java.util.List list93 = keyedObjects2D86.getColumnKeys();
        int int95 = keyedObjects2D86.getColumnIndex((java.lang.Comparable) 100L);
        boolean boolean96 = keyedObjects2D0.equals((java.lang.Object) keyedObjects2D86);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D6 and keyedObjects2D86", keyedObjects2D6.equals(keyedObjects2D86) ? keyedObjects2D6.hashCode() == keyedObjects2D86.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int1 = keyedObjects2D0.getRowCount();
        int int3 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (byte) -1);
        keyedObjects2D0.removeObject((java.lang.Comparable) (short) 0, (java.lang.Comparable) 100.0d);
        int int7 = keyedObjects2D0.getRowCount();
        int int8 = keyedObjects2D0.getRowCount();
        java.lang.Comparable comparable9 = null;
        int int10 = keyedObjects2D0.getColumnIndex(comparable9);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D11.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        java.lang.Object obj18 = keyedObjects2D11.getObject(0, 0);
        keyedObjects2D11.removeObject((java.lang.Comparable) 0.0d, (java.lang.Comparable) (short) -1);
        java.lang.Object obj22 = keyedObjects2D11.clone();
        keyedObjects2D0.setObject(obj22, (java.lang.Comparable) 10.0d, (java.lang.Comparable) 4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D11 and obj22", keyedObjects2D11.equals(obj22) ? keyedObjects2D11.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 0.0d);
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 'a');
        java.lang.Object obj5 = keyedObjects2D0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D6.setObject((java.lang.Object) (-1.0f), (java.lang.Comparable) 100L, (java.lang.Comparable) 10.0f);
        int int12 = keyedObjects2D6.getColumnIndex((java.lang.Comparable) 0L);
        int int13 = keyedObjects2D6.getRowCount();
        keyedObjects2D0.setObject((java.lang.Object) int13, (java.lang.Comparable) (short) 0, (java.lang.Comparable) false);
        int int18 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = new org.jfree.data.KeyedObjects2D();
        java.util.List list20 = keyedObjects2D19.getRowKeys();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D19, (java.lang.Comparable) 0.0d, (java.lang.Comparable) 0);
        java.lang.Object obj24 = null;
        boolean boolean25 = keyedObjects2D0.equals(obj24);
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = new org.jfree.data.KeyedObjects2D();
        int int27 = keyedObjects2D26.getRowCount();
        int int29 = keyedObjects2D26.getRowIndex((java.lang.Comparable) (byte) -1);
        java.lang.Object obj30 = keyedObjects2D26.clone();
        int int31 = keyedObjects2D26.getColumnCount();
        keyedObjects2D0.setObject((java.lang.Object) keyedObjects2D26, (java.lang.Comparable) (byte) 0, (java.lang.Comparable) 100.0f);
        java.lang.Object obj35 = keyedObjects2D0.clone();
        java.lang.Object obj38 = keyedObjects2D0.getObject(2, (int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj35", keyedObjects2D0.equals(obj35) ? keyedObjects2D0.hashCode() == obj35.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.addObject((java.lang.Object) keyedObjects2D1, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = new org.jfree.data.KeyedObjects2D();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D5.addObject((java.lang.Object) keyedObjects2D6, (java.lang.Comparable) 100.0f, (java.lang.Comparable) false);
        int int11 = keyedObjects2D5.getColumnIndex((java.lang.Comparable) (byte) 1);
        java.util.List list12 = keyedObjects2D5.getColumnKeys();
        keyedObjects2D0.addObject((java.lang.Object) list12, (java.lang.Comparable) (-1L), (java.lang.Comparable) (short) 0);
        java.util.List list16 = keyedObjects2D0.getColumnKeys();
        java.lang.Object obj17 = keyedObjects2D0.clone();
        java.lang.Comparable comparable18 = null;
        int int19 = keyedObjects2D0.getRowIndex(comparable18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on keyedObjects2D0 and obj17", keyedObjects2D0.equals(obj17) ? keyedObjects2D0.hashCode() == obj17.hashCode() : true);
    }
}

