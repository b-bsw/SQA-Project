package org.jfree.data.statistics;

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
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double6 = defaultBoxAndWhiskerCategoryDataset4.getRangeUpperBound(true);
        double double8 = defaultBoxAndWhiskerCategoryDataset4.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset4.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D9;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset4", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset4.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup5 = defaultBoxAndWhiskerCategoryDataset4.getGroup();
        int int6 = defaultBoxAndWhiskerCategoryDataset4.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset4.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset4", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset4.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset3 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset3.getGroup();
        int int5 = defaultBoxAndWhiskerCategoryDataset3.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset3.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset3", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset3) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset3.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        int int8 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset3 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double5 = defaultBoxAndWhiskerCategoryDataset3.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset3.validateObject();
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset3", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset3) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset3.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj8", defaultBoxAndWhiskerCategoryDataset0.equals(obj8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset5.removeChangeListener(datasetChangeListener6);
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) datasetChangeListener6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset3 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double5 = defaultBoxAndWhiskerCategoryDataset3.getRangeUpperBound(true);
        double double7 = defaultBoxAndWhiskerCategoryDataset3.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset3.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D8;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset3", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset3) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset3.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(true);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) range15);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset17.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D18;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset5.getGroup();
        int int7 = defaultBoxAndWhiskerCategoryDataset5.getColumnCount();
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset5.getRangeBounds(false);
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener19);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset21 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultBoxAndWhiskerCategoryDataset21.getGroup();
        int int23 = defaultBoxAndWhiskerCategoryDataset21.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultBoxAndWhiskerCategoryDataset21.getGroup();
        defaultBoxAndWhiskerCategoryDataset8.setGroup(datasetGroup24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and defaultBoxAndWhiskerCategoryDataset21", defaultBoxAndWhiskerCategoryDataset8.equals(defaultBoxAndWhiskerCategoryDataset21) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == defaultBoxAndWhiskerCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.Range range18 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset19 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset19.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset19.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and defaultBoxAndWhiskerCategoryDataset19", defaultBoxAndWhiskerCategoryDataset8.equals(defaultBoxAndWhiskerCategoryDataset19) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == defaultBoxAndWhiskerCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset5.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D6;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset5.hasListener(eventListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset5.removeChangeListener(datasetChangeListener8);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset5.getColumnKeys();
        int int12 = defaultBoxAndWhiskerCategoryDataset5.getRowIndex((java.lang.Comparable) (byte) 1);
        double double14 = defaultBoxAndWhiskerCategoryDataset5.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset5.removeChangeListener(datasetChangeListener15);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset5.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D17;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset19 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double21 = defaultBoxAndWhiskerCategoryDataset19.getRangeUpperBound(true);
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) double21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and defaultBoxAndWhiskerCategoryDataset19", defaultBoxAndWhiskerCategoryDataset8.equals(defaultBoxAndWhiskerCategoryDataset19) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == defaultBoxAndWhiskerCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D10;
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D12;
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener14);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset9.data;
        double double18 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset9.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset20 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset20.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultBoxAndWhiskerCategoryDataset20.getGroup();
        defaultBoxAndWhiskerCategoryDataset9.setGroup(datasetGroup22);
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset20", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset20) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener6);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        double double11 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) datasetGroup15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        int int8 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) list9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (byte) 1);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double8 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D11;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = null;
        defaultBoxAndWhiskerCategoryDataset5.data = keyedObjects2D6;
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = null;
        defaultBoxAndWhiskerCategoryDataset5.data = keyedObjects2D8;
        double double11 = defaultBoxAndWhiskerCategoryDataset5.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset5.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset13.hasListener(eventListener14);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener16);
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset13.getColumnKeys();
        int int20 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset5.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset13);
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = defaultBoxAndWhiskerCategoryDataset13.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D22;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = null;
        defaultBoxAndWhiskerCategoryDataset7.data = keyedObjects2D8;
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = null;
        defaultBoxAndWhiskerCategoryDataset7.data = keyedObjects2D10;
        double double13 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset7.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset15.hasListener(eventListener16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener18);
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset15.getColumnKeys();
        int int22 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset7.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset15);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = defaultBoxAndWhiskerCategoryDataset15.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D24;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset5.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D6;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double8 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D11;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener13);
        int int16 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = null;
        defaultBoxAndWhiskerCategoryDataset10.data = keyedObjects2D17;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset19 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset19.getGroup();
        double double22 = defaultBoxAndWhiskerCategoryDataset19.getRangeLowerBound(false);
        java.util.List list23 = defaultBoxAndWhiskerCategoryDataset19.getRowKeys();
        org.jfree.data.Range range25 = defaultBoxAndWhiskerCategoryDataset19.getRangeBounds(true);
        boolean boolean26 = defaultBoxAndWhiskerCategoryDataset10.equals((java.lang.Object) range25);
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) range25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset19", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset19) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.equals(obj8);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset6.data = keyedObjects2D7;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = null;
        defaultBoxAndWhiskerCategoryDataset6.data = keyedObjects2D9;
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset6.hasListener(eventListener11);
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset6.data;
        double double15 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset16.hasListener(eventListener17);
        int int19 = defaultBoxAndWhiskerCategoryDataset16.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        defaultBoxAndWhiskerCategoryDataset6.setGroup(datasetGroup20);
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double9 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(true);
        double double11 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D12;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        double double19 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset20 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset20.data;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and defaultBoxAndWhiskerCategoryDataset20", defaultBoxAndWhiskerCategoryDataset8.equals(defaultBoxAndWhiskerCategoryDataset20) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == defaultBoxAndWhiskerCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset5.hasListener(eventListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset5.getColumnCount();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset5.getRowKeys();
        double double11 = defaultBoxAndWhiskerCategoryDataset5.getRangeUpperBound(true);
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) double11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double9 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(true);
        double double11 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D12;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset6.data = keyedObjects2D7;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = null;
        defaultBoxAndWhiskerCategoryDataset6.data = keyedObjects2D9;
        double double12 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset6.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset14.hasListener(eventListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener17);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset14.getColumnKeys();
        int int21 = defaultBoxAndWhiskerCategoryDataset14.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset6.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset14);
        int int24 = defaultBoxAndWhiskerCategoryDataset14.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultBoxAndWhiskerCategoryDataset14.addChangeListener(datasetChangeListener25);
        java.util.List list27 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        boolean boolean28 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) list27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup13);
        org.jfree.data.Range range16 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset17.hasListener(eventListener18);
        int int20 = defaultBoxAndWhiskerCategoryDataset17.getColumnCount();
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset17.getRowKeys();
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) list21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset11 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset11.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset11.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.Range range10 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj8", defaultBoxAndWhiskerCategoryDataset0.equals(obj8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int14 = defaultBoxAndWhiskerCategoryDataset13.getRowCount();
        double double16 = defaultBoxAndWhiskerCategoryDataset13.getRangeLowerBound(true);
        int int17 = defaultBoxAndWhiskerCategoryDataset13.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset13.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D18;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double9 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(true);
        double double11 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D12;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(true);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) range15);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener17);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset19 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double21 = defaultBoxAndWhiskerCategoryDataset19.getRangeUpperBound(true);
        double double23 = defaultBoxAndWhiskerCategoryDataset19.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = defaultBoxAndWhiskerCategoryDataset19.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D24;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset6.hasListener(eventListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 10L);
        int int11 = defaultBoxAndWhiskerCategoryDataset6.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double9 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(true);
        double double11 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(true);
        double double13 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        double double20 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset21 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset21.hasListener(eventListener22);
        int int25 = defaultBoxAndWhiskerCategoryDataset21.getRowIndex((java.lang.Comparable) 10L);
        int int26 = defaultBoxAndWhiskerCategoryDataset21.getRowCount();
        int int27 = defaultBoxAndWhiskerCategoryDataset21.getColumnCount();
        int int28 = defaultBoxAndWhiskerCategoryDataset21.getColumnCount();
        double double30 = defaultBoxAndWhiskerCategoryDataset21.getRangeUpperBound(false);
        boolean boolean31 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and defaultBoxAndWhiskerCategoryDataset21", defaultBoxAndWhiskerCategoryDataset8.equals(defaultBoxAndWhiskerCategoryDataset21) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == defaultBoxAndWhiskerCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener8);
        int int10 = defaultBoxAndWhiskerCategoryDataset7.getRowCount();
        defaultBoxAndWhiskerCategoryDataset7.validateObject();
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass9 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj8", defaultBoxAndWhiskerCategoryDataset0.equals(obj8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double11 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener12);
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup13);
        org.jfree.data.Range range16 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double19 = defaultBoxAndWhiskerCategoryDataset17.getRangeUpperBound(true);
        double double21 = defaultBoxAndWhiskerCategoryDataset17.getRangeLowerBound(true);
        double double23 = defaultBoxAndWhiskerCategoryDataset17.getRangeLowerBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultBoxAndWhiskerCategoryDataset17.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset11 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset11.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset11.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset3 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double5 = defaultBoxAndWhiskerCategoryDataset3.getRangeUpperBound(true);
        double double7 = defaultBoxAndWhiskerCategoryDataset3.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset3.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D8;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset3", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset3) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset3.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener11);
        int int14 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) 10L);
        int int15 = defaultBoxAndWhiskerCategoryDataset10.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D16;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener10);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset7.getColumnKeys();
        int int14 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) (byte) 1);
        double double16 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D19;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Object obj7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.equals(obj7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj4 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset5.getGroup();
        double double8 = defaultBoxAndWhiskerCategoryDataset5.getRangeLowerBound(false);
        int int10 = defaultBoxAndWhiskerCategoryDataset5.getRowIndex((java.lang.Comparable) Double.NaN);
        double double12 = defaultBoxAndWhiskerCategoryDataset5.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset5.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D13;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj4", defaultBoxAndWhiskerCategoryDataset0.equals(obj4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset5.hasListener(eventListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset5.getRowIndex((java.lang.Comparable) 10L);
        int int10 = defaultBoxAndWhiskerCategoryDataset5.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset5.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D11;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int9 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset6.hasListener(eventListener7);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener9);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset6.getColumnKeys();
        int int13 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) (byte) 1);
        double double15 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset6.validateObject();
        int int17 = defaultBoxAndWhiskerCategoryDataset6.getRowCount();
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = null;
        defaultBoxAndWhiskerCategoryDataset7.data = keyedObjects2D8;
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = null;
        defaultBoxAndWhiskerCategoryDataset7.data = keyedObjects2D10;
        double double13 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset7.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset15.hasListener(eventListener16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener18);
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset15.getColumnKeys();
        int int22 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset7.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultBoxAndWhiskerCategoryDataset15.addChangeListener(datasetChangeListener24);
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = defaultBoxAndWhiskerCategoryDataset15.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D26;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener8);
        int int11 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) 10L);
        int int12 = defaultBoxAndWhiskerCategoryDataset7.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double6 = defaultBoxAndWhiskerCategoryDataset4.getRangeUpperBound(true);
        double double8 = defaultBoxAndWhiskerCategoryDataset4.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset4.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset4.addChangeListener(datasetChangeListener10);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset4.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset4.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset4", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset4.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double12 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(true);
        double double14 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset10.validateObject();
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double10 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        double double12 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset8.data;
        int int14 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D16;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(true);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) range15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener17);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset19 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset19.hasListener(eventListener20);
        int int22 = defaultBoxAndWhiskerCategoryDataset19.getRowCount();
        int int24 = defaultBoxAndWhiskerCategoryDataset19.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultBoxAndWhiskerCategoryDataset19.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset9 and defaultBoxAndWhiskerCategoryDataset19", defaultBoxAndWhiskerCategoryDataset9.equals(defaultBoxAndWhiskerCategoryDataset19) ? defaultBoxAndWhiskerCategoryDataset9.hashCode() == defaultBoxAndWhiskerCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int8 = defaultBoxAndWhiskerCategoryDataset7.getRowCount();
        double double10 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(true);
        int int11 = defaultBoxAndWhiskerCategoryDataset7.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D12;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = null;
        defaultBoxAndWhiskerCategoryDataset5.data = keyedObjects2D6;
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = null;
        defaultBoxAndWhiskerCategoryDataset5.data = keyedObjects2D8;
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset5.hasListener(eventListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset5.data;
        double double14 = defaultBoxAndWhiskerCategoryDataset5.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset15.hasListener(eventListener16);
        int int18 = defaultBoxAndWhiskerCategoryDataset15.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        defaultBoxAndWhiskerCategoryDataset5.setGroup(datasetGroup19);
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = null;
        defaultBoxAndWhiskerCategoryDataset10.data = keyedObjects2D11;
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = null;
        defaultBoxAndWhiskerCategoryDataset10.data = keyedObjects2D13;
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener15);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset10.data;
        double double19 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset20 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset20.hasListener(eventListener21);
        int int23 = defaultBoxAndWhiskerCategoryDataset20.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultBoxAndWhiskerCategoryDataset20.getGroup();
        defaultBoxAndWhiskerCategoryDataset10.setGroup(datasetGroup24);
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset20", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset20) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D10;
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D12;
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener14);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset9.data;
        double double18 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset9.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset20 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset20.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultBoxAndWhiskerCategoryDataset20.getGroup();
        defaultBoxAndWhiskerCategoryDataset9.setGroup(datasetGroup22);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = defaultBoxAndWhiskerCategoryDataset9.data;
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) keyedObjects2D24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj8", defaultBoxAndWhiskerCategoryDataset0.equals(obj8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj8", defaultBoxAndWhiskerCategoryDataset0.equals(obj8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D10;
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D12;
        double double15 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset9.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset17.hasListener(eventListener18);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultBoxAndWhiskerCategoryDataset17.removeChangeListener(datasetChangeListener20);
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset17.getColumnKeys();
        int int24 = defaultBoxAndWhiskerCategoryDataset17.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset9.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultBoxAndWhiskerCategoryDataset17.addChangeListener(datasetChangeListener26);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = defaultBoxAndWhiskerCategoryDataset17.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D28;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener15);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int18 = defaultBoxAndWhiskerCategoryDataset17.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset17.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset11 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset11.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset11.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        int int12 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset10.equals((java.lang.Object) (byte) 1);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj9", defaultBoxAndWhiskerCategoryDataset0.equals(obj9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double12 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(true);
        double double14 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(true);
        double double16 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset4.hasListener(eventListener5);
        int int8 = defaultBoxAndWhiskerCategoryDataset4.getRowIndex((java.lang.Comparable) 10L);
        int int9 = defaultBoxAndWhiskerCategoryDataset4.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset4.getColumnCount();
        int int11 = defaultBoxAndWhiskerCategoryDataset4.getColumnCount();
        double double13 = defaultBoxAndWhiskerCategoryDataset4.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset4.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D14;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset4", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset4.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup5 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass7 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset2 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset2.getGroup();
        double double5 = defaultBoxAndWhiskerCategoryDataset2.getRangeLowerBound(false);
        int int7 = defaultBoxAndWhiskerCategoryDataset2.getRowIndex((java.lang.Comparable) Double.NaN);
        double double9 = defaultBoxAndWhiskerCategoryDataset2.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset2.data;
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset2.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset2.getGroup();
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) datasetGroup13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset2", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset2) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset2.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = null;
        defaultBoxAndWhiskerCategoryDataset17.data = keyedObjects2D18;
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = null;
        defaultBoxAndWhiskerCategoryDataset17.data = keyedObjects2D20;
        double double23 = defaultBoxAndWhiskerCategoryDataset17.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = defaultBoxAndWhiskerCategoryDataset17.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset25 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset25.hasListener(eventListener26);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultBoxAndWhiskerCategoryDataset25.removeChangeListener(datasetChangeListener28);
        java.util.List list30 = defaultBoxAndWhiskerCategoryDataset25.getColumnKeys();
        int int32 = defaultBoxAndWhiskerCategoryDataset25.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean33 = defaultBoxAndWhiskerCategoryDataset17.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset25);
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = defaultBoxAndWhiskerCategoryDataset25.data;
        double double36 = defaultBoxAndWhiskerCategoryDataset25.getRangeLowerBound(false);
        java.lang.Class<?> wildcardClass37 = defaultBoxAndWhiskerCategoryDataset25.getClass();
        boolean boolean38 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener11);
        int int13 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D11;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double8 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset6.data;
        int int12 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D14;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(true);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) range15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener17);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset19 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset19.hasListener(eventListener20);
        int int23 = defaultBoxAndWhiskerCategoryDataset19.getRowIndex((java.lang.Comparable) 10L);
        int int24 = defaultBoxAndWhiskerCategoryDataset19.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultBoxAndWhiskerCategoryDataset19.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = defaultBoxAndWhiskerCategoryDataset19.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D26;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset5.getGroup();
        double double8 = defaultBoxAndWhiskerCategoryDataset5.getRangeLowerBound(false);
        int int10 = defaultBoxAndWhiskerCategoryDataset5.getRowIndex((java.lang.Comparable) "hi!");
        int int11 = defaultBoxAndWhiskerCategoryDataset5.getColumnCount();
        int int13 = defaultBoxAndWhiskerCategoryDataset5.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset5.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        double double11 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        int int13 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) "hi!");
        int int14 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        int int16 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        int int19 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset23 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultBoxAndWhiskerCategoryDataset23.getGroup();
        int int25 = defaultBoxAndWhiskerCategoryDataset23.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultBoxAndWhiskerCategoryDataset23.getGroup();
        boolean boolean28 = defaultBoxAndWhiskerCategoryDataset23.equals((java.lang.Object) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = defaultBoxAndWhiskerCategoryDataset23.data;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D29;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and defaultBoxAndWhiskerCategoryDataset23", defaultBoxAndWhiskerCategoryDataset8.equals(defaultBoxAndWhiskerCategoryDataset23) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == defaultBoxAndWhiskerCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double12 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener13);
        int int15 = defaultBoxAndWhiskerCategoryDataset10.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        int int15 = defaultBoxAndWhiskerCategoryDataset13.getColumnCount();
        org.jfree.data.Range range17 = defaultBoxAndWhiskerCategoryDataset13.getRangeBounds(false);
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        int int20 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) (byte) -1);
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj4 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj4", defaultBoxAndWhiskerCategoryDataset0.equals(obj4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int10 = defaultBoxAndWhiskerCategoryDataset9.getRowCount();
        double double12 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(true);
        int int13 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset9.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D14;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset13.hasListener(eventListener14);
        int int17 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) 10L);
        int int18 = defaultBoxAndWhiskerCategoryDataset13.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset13.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D20;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup5 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int8 = defaultBoxAndWhiskerCategoryDataset7.getRowCount();
        double double10 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(true);
        int int12 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) 10.0d);
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener13);
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D10;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset9.addChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener10);
        int int13 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) 10L);
        int int14 = defaultBoxAndWhiskerCategoryDataset9.getRowCount();
        int int15 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        int int17 = defaultBoxAndWhiskerCategoryDataset9.getColumnIndex((java.lang.Comparable) 10.0f);
        int int19 = defaultBoxAndWhiskerCategoryDataset9.getColumnIndex((java.lang.Comparable) 100L);
        int int21 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) 0.0d);
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double11 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        int int14 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) (-1L));
        double double16 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset9.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D19;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup5 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset5.hasListener(eventListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset5.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset5.getRowIndex((java.lang.Comparable) 10L);
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.lang.Comparable comparable7 = null;
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex(comparable7);
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj9", defaultBoxAndWhiskerCategoryDataset0.equals(obj9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset6.data = keyedObjects2D7;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = null;
        defaultBoxAndWhiskerCategoryDataset6.data = keyedObjects2D9;
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset6.hasListener(eventListener11);
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset6.data;
        double double15 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset16.hasListener(eventListener17);
        int int19 = defaultBoxAndWhiskerCategoryDataset16.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        defaultBoxAndWhiskerCategoryDataset6.setGroup(datasetGroup20);
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        double double13 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(false);
        int int14 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 1);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D10;
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D12;
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener14);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset9.data;
        double double18 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset19 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset19.hasListener(eventListener20);
        int int22 = defaultBoxAndWhiskerCategoryDataset19.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset19.getGroup();
        defaultBoxAndWhiskerCategoryDataset9.setGroup(datasetGroup23);
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset19", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset19) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener9);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        java.lang.Object obj19 = defaultBoxAndWhiskerCategoryDataset8.clone();
        double double21 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and obj19", defaultBoxAndWhiskerCategoryDataset8.equals(obj19) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset6.hasListener(eventListener7);
        int int9 = defaultBoxAndWhiskerCategoryDataset6.getRowCount();
        int int11 = defaultBoxAndWhiskerCategoryDataset6.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double11 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        double double13 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset9.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset9.addChangeListener(datasetChangeListener15);
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        double double20 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) double20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset6.hasListener(eventListener7);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener9);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset6.getColumnKeys();
        int int13 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) (byte) 1);
        double double15 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener16);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D18;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        java.lang.Object obj19 = defaultBoxAndWhiskerCategoryDataset8.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset20 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double22 = defaultBoxAndWhiskerCategoryDataset20.getRangeUpperBound(true);
        double double24 = defaultBoxAndWhiskerCategoryDataset20.getRangeLowerBound(true);
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultBoxAndWhiskerCategoryDataset20.hasListener(eventListener25);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultBoxAndWhiskerCategoryDataset20.addChangeListener(datasetChangeListener27);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = defaultBoxAndWhiskerCategoryDataset20.data;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D29;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and obj19", defaultBoxAndWhiskerCategoryDataset8.equals(obj19) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener8);
        int int11 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) 10L);
        int int12 = defaultBoxAndWhiskerCategoryDataset7.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D13;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 1);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D8;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        double double19 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset20 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset20.getGroup();
        double double23 = defaultBoxAndWhiskerCategoryDataset20.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultBoxAndWhiskerCategoryDataset20.removeChangeListener(datasetChangeListener24);
        int int26 = defaultBoxAndWhiskerCategoryDataset20.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultBoxAndWhiskerCategoryDataset20.addChangeListener(datasetChangeListener27);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultBoxAndWhiskerCategoryDataset20.getGroup();
        defaultBoxAndWhiskerCategoryDataset8.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and defaultBoxAndWhiskerCategoryDataset20", defaultBoxAndWhiskerCategoryDataset8.equals(defaultBoxAndWhiskerCategoryDataset20) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == defaultBoxAndWhiskerCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        double double13 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener14);
        int int16 = defaultBoxAndWhiskerCategoryDataset10.getRowCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset2 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double4 = defaultBoxAndWhiskerCategoryDataset2.getRangeUpperBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset2.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset2.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset2", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset2) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset2.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = null;
        defaultBoxAndWhiskerCategoryDataset4.data = keyedObjects2D5;
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset4.data = keyedObjects2D7;
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset4.hasListener(eventListener9);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset4.data;
        double double13 = defaultBoxAndWhiskerCategoryDataset4.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset4.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset15.hasListener(eventListener16);
        int int19 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) 10L);
        int int20 = defaultBoxAndWhiskerCategoryDataset15.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        defaultBoxAndWhiskerCategoryDataset4.setGroup(datasetGroup21);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset4.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        double double11 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        int int13 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) Double.NaN);
        double double15 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.jfree.data.Range range18 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup5 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.lang.Comparable comparable7 = null;
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex(comparable7);
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj9", defaultBoxAndWhiskerCategoryDataset0.equals(obj9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        int int16 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 1);
        java.lang.Object obj17 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj17", defaultBoxAndWhiskerCategoryDataset0.equals(obj17) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        double double19 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset20 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = null;
        defaultBoxAndWhiskerCategoryDataset20.data = keyedObjects2D21;
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = null;
        defaultBoxAndWhiskerCategoryDataset20.data = keyedObjects2D23;
        double double26 = defaultBoxAndWhiskerCategoryDataset20.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = defaultBoxAndWhiskerCategoryDataset20.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset28 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultBoxAndWhiskerCategoryDataset28.hasListener(eventListener29);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultBoxAndWhiskerCategoryDataset28.removeChangeListener(datasetChangeListener31);
        java.util.List list33 = defaultBoxAndWhiskerCategoryDataset28.getColumnKeys();
        int int35 = defaultBoxAndWhiskerCategoryDataset28.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean36 = defaultBoxAndWhiskerCategoryDataset20.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset28);
        org.jfree.data.KeyedObjects2D keyedObjects2D37 = defaultBoxAndWhiskerCategoryDataset28.data;
        defaultBoxAndWhiskerCategoryDataset28.validateObject();
        org.jfree.data.Range range40 = defaultBoxAndWhiskerCategoryDataset28.getRangeBounds(false);
        boolean boolean41 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) range40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset20", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset20) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset6.data = keyedObjects2D7;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = null;
        defaultBoxAndWhiskerCategoryDataset6.data = keyedObjects2D9;
        double double12 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset6.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset14.hasListener(eventListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener17);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset14.getColumnKeys();
        int int21 = defaultBoxAndWhiskerCategoryDataset14.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset6.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset14);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset14.addChangeListener(datasetChangeListener23);
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = defaultBoxAndWhiskerCategoryDataset14.data;
        java.util.List list26 = defaultBoxAndWhiskerCategoryDataset14.getRowKeys();
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) list26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        double double16 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double18 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset19 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = null;
        defaultBoxAndWhiskerCategoryDataset19.data = keyedObjects2D20;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultBoxAndWhiskerCategoryDataset19.addChangeListener(datasetChangeListener22);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset24 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultBoxAndWhiskerCategoryDataset24.hasListener(eventListener25);
        int int28 = defaultBoxAndWhiskerCategoryDataset24.getRowIndex((java.lang.Comparable) 10L);
        int int30 = defaultBoxAndWhiskerCategoryDataset24.getRowIndex((java.lang.Comparable) "hi!");
        boolean boolean31 = defaultBoxAndWhiskerCategoryDataset19.equals((java.lang.Object) int30);
        org.jfree.data.general.DatasetGroup datasetGroup32 = defaultBoxAndWhiskerCategoryDataset19.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset24", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset24) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset24.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double13 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(true);
        double double15 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(true);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset11.hasListener(eventListener16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener18);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D20;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj8", defaultBoxAndWhiskerCategoryDataset0.equals(obj8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset13.hasListener(eventListener14);
        int int17 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) 10L);
        int int18 = defaultBoxAndWhiskerCategoryDataset13.getRowCount();
        int int19 = defaultBoxAndWhiskerCategoryDataset13.getColumnCount();
        int int20 = defaultBoxAndWhiskerCategoryDataset13.getColumnCount();
        int int22 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list23 = defaultBoxAndWhiskerCategoryDataset13.getColumnKeys();
        org.jfree.data.Range range25 = defaultBoxAndWhiskerCategoryDataset13.getRangeBounds(false);
        org.jfree.data.Range range27 = defaultBoxAndWhiskerCategoryDataset13.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        int int8 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset6.equals((java.lang.Object) (byte) 1);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100L);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double11 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener12);
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj8", defaultBoxAndWhiskerCategoryDataset0.equals(obj8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup5 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.Range range7 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (-1.0d));
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        int int12 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double12 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(true);
        int int13 = defaultBoxAndWhiskerCategoryDataset10.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = null;
        defaultBoxAndWhiskerCategoryDataset14.data = keyedObjects2D15;
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = null;
        defaultBoxAndWhiskerCategoryDataset14.data = keyedObjects2D17;
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset14.hasListener(eventListener19);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset14.data;
        double double23 = defaultBoxAndWhiskerCategoryDataset14.getRangeUpperBound(true);
        boolean boolean24 = defaultBoxAndWhiskerCategoryDataset10.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset14);
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj9", defaultBoxAndWhiskerCategoryDataset0.equals(obj9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset8.data;
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        int int21 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        java.lang.Object obj22 = defaultBoxAndWhiskerCategoryDataset8.clone();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and obj22", defaultBoxAndWhiskerCategoryDataset8.equals(obj22) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset8.data;
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        java.lang.Object obj21 = defaultBoxAndWhiskerCategoryDataset8.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset22 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultBoxAndWhiskerCategoryDataset22.hasListener(eventListener23);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultBoxAndWhiskerCategoryDataset22.removeChangeListener(datasetChangeListener25);
        java.util.List list27 = defaultBoxAndWhiskerCategoryDataset22.getColumnKeys();
        int int29 = defaultBoxAndWhiskerCategoryDataset22.getRowIndex((java.lang.Comparable) (byte) 1);
        double double31 = defaultBoxAndWhiskerCategoryDataset22.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener32 = null;
        defaultBoxAndWhiskerCategoryDataset22.removeChangeListener(datasetChangeListener32);
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = defaultBoxAndWhiskerCategoryDataset22.data;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D34;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and obj21", defaultBoxAndWhiskerCategoryDataset8.equals(obj21) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        double double15 = defaultBoxAndWhiskerCategoryDataset12.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener16);
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset12.hasListener(eventListener18);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset12.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D20;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int13 = defaultBoxAndWhiskerCategoryDataset12.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        double double18 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(false);
        int int20 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) Double.NaN);
        double double22 = defaultBoxAndWhiskerCategoryDataset15.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset15.data;
        org.jfree.data.Range range25 = defaultBoxAndWhiskerCategoryDataset15.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener8);
        int int11 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) 10L);
        int int13 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        int int14 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = null;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D15;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset17.hasListener(eventListener18);
        int int21 = defaultBoxAndWhiskerCategoryDataset17.getRowIndex((java.lang.Comparable) 10L);
        int int22 = defaultBoxAndWhiskerCategoryDataset17.getRowCount();
        int int23 = defaultBoxAndWhiskerCategoryDataset17.getColumnCount();
        int int24 = defaultBoxAndWhiskerCategoryDataset17.getColumnCount();
        int int26 = defaultBoxAndWhiskerCategoryDataset17.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list27 = defaultBoxAndWhiskerCategoryDataset17.getColumnKeys();
        boolean boolean28 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset17);
        boolean boolean29 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) boolean28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double12 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(true);
        double double14 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(true);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D19;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset12.hasListener(eventListener13);
        int int16 = defaultBoxAndWhiskerCategoryDataset12.getRowIndex((java.lang.Comparable) 10L);
        int int18 = defaultBoxAndWhiskerCategoryDataset12.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double10 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        double double12 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        double double14 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D15;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup5 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D9;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj9", defaultBoxAndWhiskerCategoryDataset0.equals(obj9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset8.data;
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset21 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = null;
        defaultBoxAndWhiskerCategoryDataset21.data = keyedObjects2D22;
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = null;
        defaultBoxAndWhiskerCategoryDataset21.data = keyedObjects2D24;
        double double27 = defaultBoxAndWhiskerCategoryDataset21.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = defaultBoxAndWhiskerCategoryDataset21.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset29 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultBoxAndWhiskerCategoryDataset29.hasListener(eventListener30);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener32 = null;
        defaultBoxAndWhiskerCategoryDataset29.removeChangeListener(datasetChangeListener32);
        java.util.List list34 = defaultBoxAndWhiskerCategoryDataset29.getColumnKeys();
        int int36 = defaultBoxAndWhiskerCategoryDataset29.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean37 = defaultBoxAndWhiskerCategoryDataset21.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset29);
        int int39 = defaultBoxAndWhiskerCategoryDataset29.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener40 = null;
        defaultBoxAndWhiskerCategoryDataset29.addChangeListener(datasetChangeListener40);
        java.util.List list42 = defaultBoxAndWhiskerCategoryDataset29.getRowKeys();
        boolean boolean43 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset21", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset21) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double15 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup13);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = null;
        defaultBoxAndWhiskerCategoryDataset16.data = keyedObjects2D17;
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = null;
        defaultBoxAndWhiskerCategoryDataset16.data = keyedObjects2D19;
        double double22 = defaultBoxAndWhiskerCategoryDataset16.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset16.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset24 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultBoxAndWhiskerCategoryDataset24.hasListener(eventListener25);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultBoxAndWhiskerCategoryDataset24.removeChangeListener(datasetChangeListener27);
        java.util.List list29 = defaultBoxAndWhiskerCategoryDataset24.getColumnKeys();
        int int31 = defaultBoxAndWhiskerCategoryDataset24.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean32 = defaultBoxAndWhiskerCategoryDataset16.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset24);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener33 = null;
        defaultBoxAndWhiskerCategoryDataset24.addChangeListener(datasetChangeListener33);
        org.jfree.data.KeyedObjects2D keyedObjects2D35 = defaultBoxAndWhiskerCategoryDataset24.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D35;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener10);
        int int13 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) 10L);
        int int14 = defaultBoxAndWhiskerCategoryDataset9.getRowCount();
        int int15 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        int int16 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        int int18 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset9);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset21 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = null;
        defaultBoxAndWhiskerCategoryDataset21.data = keyedObjects2D22;
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = null;
        defaultBoxAndWhiskerCategoryDataset21.data = keyedObjects2D24;
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = defaultBoxAndWhiskerCategoryDataset21.data;
        double double28 = defaultBoxAndWhiskerCategoryDataset21.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = defaultBoxAndWhiskerCategoryDataset21.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultBoxAndWhiskerCategoryDataset21.addChangeListener(datasetChangeListener30);
        defaultBoxAndWhiskerCategoryDataset21.validateObject();
        boolean boolean33 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset21", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset21) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset6.data = keyedObjects2D7;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = null;
        defaultBoxAndWhiskerCategoryDataset6.data = keyedObjects2D9;
        double double12 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset6.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset14.hasListener(eventListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener17);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset14.getColumnKeys();
        int int21 = defaultBoxAndWhiskerCategoryDataset14.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset6.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset14);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset14.addChangeListener(datasetChangeListener23);
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = defaultBoxAndWhiskerCategoryDataset14.data;
        java.lang.Class<?> wildcardClass26 = defaultBoxAndWhiskerCategoryDataset14.getClass();
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) wildcardClass26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double8 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(true);
        int int9 = defaultBoxAndWhiskerCategoryDataset6.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset6.getRowCount();
        int int11 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D12;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener13);
        int int16 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener17);
        int int20 = defaultBoxAndWhiskerCategoryDataset10.getColumnIndex((java.lang.Comparable) 1.0d);
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener12);
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        int int16 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) (byte) 1);
        double double18 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener19);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset9.data;
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener22);
        double double25 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultBoxAndWhiskerCategoryDataset9.addChangeListener(datasetChangeListener26);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = defaultBoxAndWhiskerCategoryDataset9.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D28;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = null;
        defaultBoxAndWhiskerCategoryDataset7.data = keyedObjects2D8;
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = null;
        defaultBoxAndWhiskerCategoryDataset7.data = keyedObjects2D10;
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener12);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset7.data;
        double double16 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset7.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset18 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset18.hasListener(eventListener19);
        int int22 = defaultBoxAndWhiskerCategoryDataset18.getRowIndex((java.lang.Comparable) 10L);
        int int23 = defaultBoxAndWhiskerCategoryDataset18.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultBoxAndWhiskerCategoryDataset18.getGroup();
        defaultBoxAndWhiskerCategoryDataset7.setGroup(datasetGroup24);
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset18", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset18) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj9", defaultBoxAndWhiskerCategoryDataset0.equals(obj9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener10);
        int int12 = defaultBoxAndWhiskerCategoryDataset9.getRowCount();
        int int14 = defaultBoxAndWhiskerCategoryDataset9.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.Range range16 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(false);
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = null;
        defaultBoxAndWhiskerCategoryDataset4.data = keyedObjects2D5;
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset4.data = keyedObjects2D7;
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset4.hasListener(eventListener9);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset4.data;
        double double13 = defaultBoxAndWhiskerCategoryDataset4.getRangeUpperBound(true);
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset4);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = null;
        defaultBoxAndWhiskerCategoryDataset15.data = keyedObjects2D16;
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = null;
        defaultBoxAndWhiskerCategoryDataset15.data = keyedObjects2D18;
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset15.hasListener(eventListener20);
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        defaultBoxAndWhiskerCategoryDataset4.setGroup(datasetGroup22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset4 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset4.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset4.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        double double14 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(false);
        int int16 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) "hi!");
        int int17 = defaultBoxAndWhiskerCategoryDataset11.getColumnCount();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset11.hasListener(eventListener18);
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) boolean19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener9);
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = null;
        defaultBoxAndWhiskerCategoryDataset13.data = keyedObjects2D14;
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = null;
        defaultBoxAndWhiskerCategoryDataset13.data = keyedObjects2D16;
        double double19 = defaultBoxAndWhiskerCategoryDataset13.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset13.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset21 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset21.hasListener(eventListener22);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultBoxAndWhiskerCategoryDataset21.removeChangeListener(datasetChangeListener24);
        java.util.List list26 = defaultBoxAndWhiskerCategoryDataset21.getColumnKeys();
        int int28 = defaultBoxAndWhiskerCategoryDataset21.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean29 = defaultBoxAndWhiskerCategoryDataset13.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset21);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultBoxAndWhiskerCategoryDataset21.addChangeListener(datasetChangeListener30);
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = defaultBoxAndWhiskerCategoryDataset21.data;
        java.util.List list33 = defaultBoxAndWhiskerCategoryDataset21.getRowKeys();
        boolean boolean34 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = null;
        defaultBoxAndWhiskerCategoryDataset10.data = keyedObjects2D11;
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = null;
        defaultBoxAndWhiskerCategoryDataset10.data = keyedObjects2D13;
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener15);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset10.data;
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener18);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset10.data;
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset11.hasListener(eventListener12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener14);
        int int17 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset11.getColumnKeys();
        int int19 = defaultBoxAndWhiskerCategoryDataset11.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D20;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener9);
        int int12 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) "");
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D13;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D10;
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D12;
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener14);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset9.data;
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset9.data;
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj8", defaultBoxAndWhiskerCategoryDataset0.equals(obj8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset6.hasListener(eventListener7);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener9);
        int int12 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset6.getColumnKeys();
        int int14 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        java.lang.Object obj15 = defaultBoxAndWhiskerCategoryDataset6.clone();
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals(obj15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset6 and obj15", defaultBoxAndWhiskerCategoryDataset6.equals(obj15) ? defaultBoxAndWhiskerCategoryDataset6.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset5.hasListener(eventListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset5.getRowIndex((java.lang.Comparable) 10L);
        int int11 = defaultBoxAndWhiskerCategoryDataset5.getRowIndex((java.lang.Comparable) "hi!");
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int11);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double15 = defaultBoxAndWhiskerCategoryDataset13.getRangeUpperBound(true);
        double double17 = defaultBoxAndWhiskerCategoryDataset13.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset13.data;
        int int19 = defaultBoxAndWhiskerCategoryDataset13.getColumnCount();
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset13.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        double double20 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        int int21 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset22 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultBoxAndWhiskerCategoryDataset22.hasListener(eventListener23);
        int int26 = defaultBoxAndWhiskerCategoryDataset22.getRowIndex((java.lang.Comparable) 10L);
        int int28 = defaultBoxAndWhiskerCategoryDataset22.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = defaultBoxAndWhiskerCategoryDataset22.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = defaultBoxAndWhiskerCategoryDataset22.data;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D30;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and defaultBoxAndWhiskerCategoryDataset22", defaultBoxAndWhiskerCategoryDataset8.equals(defaultBoxAndWhiskerCategoryDataset22) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == defaultBoxAndWhiskerCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = null;
        defaultBoxAndWhiskerCategoryDataset10.data = keyedObjects2D11;
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = null;
        defaultBoxAndWhiskerCategoryDataset10.data = keyedObjects2D13;
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener15);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup17);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset19 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = null;
        defaultBoxAndWhiskerCategoryDataset19.data = keyedObjects2D20;
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = null;
        defaultBoxAndWhiskerCategoryDataset19.data = keyedObjects2D22;
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = defaultBoxAndWhiskerCategoryDataset19.data;
        double double26 = defaultBoxAndWhiskerCategoryDataset19.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = defaultBoxAndWhiskerCategoryDataset19.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset28 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultBoxAndWhiskerCategoryDataset28.getGroup();
        int int30 = defaultBoxAndWhiskerCategoryDataset28.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultBoxAndWhiskerCategoryDataset28.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener32 = null;
        defaultBoxAndWhiskerCategoryDataset28.removeChangeListener(datasetChangeListener32);
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultBoxAndWhiskerCategoryDataset28.getGroup();
        defaultBoxAndWhiskerCategoryDataset19.setGroup(datasetGroup34);
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset28", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset28) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset28.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        int int8 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        org.jfree.data.Range range10 = defaultBoxAndWhiskerCategoryDataset6.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) datasetGroup11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj10", defaultBoxAndWhiskerCategoryDataset0.equals(obj10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener16);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset15.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D18;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        java.lang.Object obj19 = defaultBoxAndWhiskerCategoryDataset8.clone();
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and obj19", defaultBoxAndWhiskerCategoryDataset8.equals(obj19) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double10 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        double double12 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        double double14 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) datasetGroup15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double9 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset7.validateObject();
        int int12 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) (-1L));
        double double14 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(true);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener15);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset7.data;
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener6);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        double double11 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        int int13 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) "hi!");
        int int14 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        int int16 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener18);
        int int20 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener10);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset7.getColumnKeys();
        int int14 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.Range range16 = defaultBoxAndWhiskerCategoryDataset7.getRangeBounds(false);
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range16 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double19 = defaultBoxAndWhiskerCategoryDataset17.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset17.validateObject();
        int int22 = defaultBoxAndWhiskerCategoryDataset17.getRowIndex((java.lang.Comparable) (-1L));
        double double24 = defaultBoxAndWhiskerCategoryDataset17.getRangeUpperBound(true);
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultBoxAndWhiskerCategoryDataset17.hasListener(eventListener25);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = defaultBoxAndWhiskerCategoryDataset17.data;
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultBoxAndWhiskerCategoryDataset17.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener17);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset20 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = null;
        defaultBoxAndWhiskerCategoryDataset20.data = keyedObjects2D21;
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = null;
        defaultBoxAndWhiskerCategoryDataset20.data = keyedObjects2D23;
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultBoxAndWhiskerCategoryDataset20.hasListener(eventListener25);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = defaultBoxAndWhiskerCategoryDataset20.data;
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultBoxAndWhiskerCategoryDataset20.hasListener(eventListener28);
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = defaultBoxAndWhiskerCategoryDataset20.data;
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultBoxAndWhiskerCategoryDataset20.getGroup();
        defaultBoxAndWhiskerCategoryDataset8.setGroup(datasetGroup31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset20", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset20) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        boolean boolean4 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) 100L);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset6.data = keyedObjects2D7;
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = null;
        defaultBoxAndWhiskerCategoryDataset6.data = keyedObjects2D9;
        double double12 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset6.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset14.hasListener(eventListener15);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener17);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset14.getColumnKeys();
        int int21 = defaultBoxAndWhiskerCategoryDataset14.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset6.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset14);
        int int24 = defaultBoxAndWhiskerCategoryDataset14.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultBoxAndWhiskerCategoryDataset14.removeChangeListener(datasetChangeListener25);
        int int28 = defaultBoxAndWhiskerCategoryDataset14.getColumnIndex((java.lang.Comparable) (-1.0d));
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultBoxAndWhiskerCategoryDataset14.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        double double16 = defaultBoxAndWhiskerCategoryDataset13.getRangeLowerBound(false);
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener18);
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset13.hasListener(eventListener14);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener16);
        int int19 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = null;
        defaultBoxAndWhiskerCategoryDataset13.data = keyedObjects2D20;
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup1 and datasetGroup22", datasetGroup1.equals(datasetGroup22) ? datasetGroup1.hashCode() == datasetGroup22.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double8 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset6.data;
        int int12 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D14;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset6.hasListener(eventListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 10L);
        int int11 = defaultBoxAndWhiskerCategoryDataset6.getRowCount();
        int int12 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        int int13 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        int int15 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset6.getColumnKeys();
        org.jfree.data.Range range18 = defaultBoxAndWhiskerCategoryDataset6.getRangeBounds(false);
        org.jfree.data.Range range20 = defaultBoxAndWhiskerCategoryDataset6.getRangeBounds(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener19);
        int int22 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int24 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset25 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int26 = defaultBoxAndWhiskerCategoryDataset25.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultBoxAndWhiskerCategoryDataset25.getGroup();
        defaultBoxAndWhiskerCategoryDataset8.setGroup(datasetGroup27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and defaultBoxAndWhiskerCategoryDataset25", defaultBoxAndWhiskerCategoryDataset8.equals(defaultBoxAndWhiskerCategoryDataset25) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == defaultBoxAndWhiskerCategoryDataset25.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        double double11 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        int int13 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) "hi!");
        int int14 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener15);
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = null;
        defaultBoxAndWhiskerCategoryDataset12.data = keyedObjects2D13;
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = null;
        defaultBoxAndWhiskerCategoryDataset12.data = keyedObjects2D15;
        double double18 = defaultBoxAndWhiskerCategoryDataset12.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset12.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset20 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset20.hasListener(eventListener21);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset20.removeChangeListener(datasetChangeListener23);
        java.util.List list25 = defaultBoxAndWhiskerCategoryDataset20.getColumnKeys();
        int int27 = defaultBoxAndWhiskerCategoryDataset20.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean28 = defaultBoxAndWhiskerCategoryDataset12.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset20);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultBoxAndWhiskerCategoryDataset20.removeChangeListener(datasetChangeListener29);
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = defaultBoxAndWhiskerCategoryDataset20.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D31;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset20", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset20) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double11 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        double double13 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset9.data;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset9);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double19 = defaultBoxAndWhiskerCategoryDataset17.getRangeUpperBound(true);
        double double21 = defaultBoxAndWhiskerCategoryDataset17.getRangeLowerBound(true);
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset17.hasListener(eventListener22);
        double double25 = defaultBoxAndWhiskerCategoryDataset17.getRangeLowerBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultBoxAndWhiskerCategoryDataset17.getGroup();
        defaultBoxAndWhiskerCategoryDataset9.setGroup(datasetGroup26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset9 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset9.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset9.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener12);
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset9.getColumnKeys();
        int int16 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) (byte) 1);
        double double18 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener19);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset9.data;
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener22);
        int int25 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) (short) 1);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = null;
        defaultBoxAndWhiskerCategoryDataset4.data = keyedObjects2D5;
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset4.data = keyedObjects2D7;
        double double10 = defaultBoxAndWhiskerCategoryDataset4.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset4.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset12.hasListener(eventListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener15);
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset12.getColumnKeys();
        int int19 = defaultBoxAndWhiskerCategoryDataset12.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset4.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener21);
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset12.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D23;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener10);
        int int12 = defaultBoxAndWhiskerCategoryDataset9.getRowCount();
        int int14 = defaultBoxAndWhiskerCategoryDataset9.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener17);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset21 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = null;
        defaultBoxAndWhiskerCategoryDataset21.data = keyedObjects2D22;
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = null;
        defaultBoxAndWhiskerCategoryDataset21.data = keyedObjects2D24;
        double double27 = defaultBoxAndWhiskerCategoryDataset21.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = defaultBoxAndWhiskerCategoryDataset21.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset29 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener30 = null;
        boolean boolean31 = defaultBoxAndWhiskerCategoryDataset29.hasListener(eventListener30);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener32 = null;
        defaultBoxAndWhiskerCategoryDataset29.removeChangeListener(datasetChangeListener32);
        java.util.List list34 = defaultBoxAndWhiskerCategoryDataset29.getColumnKeys();
        int int36 = defaultBoxAndWhiskerCategoryDataset29.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean37 = defaultBoxAndWhiskerCategoryDataset21.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset29);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener38 = null;
        defaultBoxAndWhiskerCategoryDataset29.addChangeListener(datasetChangeListener38);
        org.jfree.data.KeyedObjects2D keyedObjects2D40 = defaultBoxAndWhiskerCategoryDataset29.data;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D40;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset21", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset21) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0.0f);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset6.hasListener(eventListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 10L);
        int int11 = defaultBoxAndWhiskerCategoryDataset6.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D12;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = null;
        defaultBoxAndWhiskerCategoryDataset13.data = keyedObjects2D14;
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = null;
        defaultBoxAndWhiskerCategoryDataset13.data = keyedObjects2D16;
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset13.hasListener(eventListener18);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset13.data;
        double double22 = defaultBoxAndWhiskerCategoryDataset13.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset13.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset24 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultBoxAndWhiskerCategoryDataset24.hasListener(eventListener25);
        int int28 = defaultBoxAndWhiskerCategoryDataset24.getRowIndex((java.lang.Comparable) 10L);
        int int29 = defaultBoxAndWhiskerCategoryDataset24.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultBoxAndWhiskerCategoryDataset24.getGroup();
        defaultBoxAndWhiskerCategoryDataset13.setGroup(datasetGroup30);
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset24", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset24) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset24.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener10);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset7.getColumnKeys();
        int int14 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) (byte) 1);
        double double16 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D19;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        double double13 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(false);
        int int15 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) "hi!");
        int int16 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener17);
        defaultBoxAndWhiskerCategoryDataset10.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup20 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj9", defaultBoxAndWhiskerCategoryDataset0.equals(obj9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        int int8 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        org.jfree.data.Range range10 = defaultBoxAndWhiskerCategoryDataset6.getRangeBounds(false);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D12;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = null;
        defaultBoxAndWhiskerCategoryDataset10.data = keyedObjects2D11;
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = null;
        defaultBoxAndWhiskerCategoryDataset10.data = keyedObjects2D13;
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener15);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset10.data;
        double double19 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset10.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset21 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultBoxAndWhiskerCategoryDataset21.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset21.getGroup();
        defaultBoxAndWhiskerCategoryDataset10.setGroup(datasetGroup23);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset21", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset21) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        int int10 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(false);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        double double10 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener11);
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener13);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D15;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double7 = defaultBoxAndWhiskerCategoryDataset5.getRangeUpperBound(true);
        double double9 = defaultBoxAndWhiskerCategoryDataset5.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset5.data;
        int int12 = defaultBoxAndWhiskerCategoryDataset5.getRowIndex((java.lang.Comparable) (-1L));
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset5.hasListener(eventListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset5.getRowIndex((java.lang.Comparable) 10L);
        int int10 = defaultBoxAndWhiskerCategoryDataset5.getRowCount();
        int int11 = defaultBoxAndWhiskerCategoryDataset5.getColumnCount();
        int int12 = defaultBoxAndWhiskerCategoryDataset5.getColumnCount();
        int int14 = defaultBoxAndWhiskerCategoryDataset5.getRowIndex((java.lang.Comparable) 100.0d);
        int int16 = defaultBoxAndWhiskerCategoryDataset5.getColumnIndex((java.lang.Comparable) 1.0f);
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (byte) 1);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset5.hasListener(eventListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset5.getRowIndex((java.lang.Comparable) 10L);
        int int10 = defaultBoxAndWhiskerCategoryDataset5.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset5.data;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) keyedObjects2D11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener13);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset12.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D15;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        int int10 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(false);
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener9);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = null;
        defaultBoxAndWhiskerCategoryDataset11.data = keyedObjects2D12;
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = null;
        defaultBoxAndWhiskerCategoryDataset11.data = keyedObjects2D14;
        double double17 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset11.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset19 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset19.hasListener(eventListener20);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultBoxAndWhiskerCategoryDataset19.removeChangeListener(datasetChangeListener22);
        java.util.List list24 = defaultBoxAndWhiskerCategoryDataset19.getColumnKeys();
        int int26 = defaultBoxAndWhiskerCategoryDataset19.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset11.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset19);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultBoxAndWhiskerCategoryDataset19.addChangeListener(datasetChangeListener28);
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = defaultBoxAndWhiskerCategoryDataset19.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = defaultBoxAndWhiskerCategoryDataset19.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D31;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset19", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset19) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        double double20 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        int int21 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = null;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D22;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener3);
        org.jfree.data.general.DatasetGroup datasetGroup5 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        int int8 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        org.jfree.data.Range range10 = defaultBoxAndWhiskerCategoryDataset6.getRangeBounds(false);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        int int13 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup5 and datasetGroup14", datasetGroup5.equals(datasetGroup14) ? datasetGroup5.hashCode() == datasetGroup14.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener6);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = null;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D9;
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = null;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D11;
        double double14 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset16.hasListener(eventListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset16.removeChangeListener(datasetChangeListener19);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset16.getColumnKeys();
        int int23 = defaultBoxAndWhiskerCategoryDataset16.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean24 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset16);
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = defaultBoxAndWhiskerCategoryDataset16.data;
        defaultBoxAndWhiskerCategoryDataset16.validateObject();
        double double28 = defaultBoxAndWhiskerCategoryDataset16.getRangeUpperBound(true);
        int int29 = defaultBoxAndWhiskerCategoryDataset16.getColumnCount();
        int int31 = defaultBoxAndWhiskerCategoryDataset16.getRowIndex((java.lang.Comparable) '#');
        java.util.List list32 = defaultBoxAndWhiskerCategoryDataset16.getRowKeys();
        int int33 = defaultBoxAndWhiskerCategoryDataset16.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D34 = defaultBoxAndWhiskerCategoryDataset16.data;
        boolean boolean35 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) ' ');
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener13);
        int int16 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset10.getColumnKeys();
        int int18 = defaultBoxAndWhiskerCategoryDataset10.getRowCount();
        int int20 = defaultBoxAndWhiskerCategoryDataset10.getColumnIndex((java.lang.Comparable) '4');
        int int21 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        double double16 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double18 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset19 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double21 = defaultBoxAndWhiskerCategoryDataset19.getRangeUpperBound(true);
        int int22 = defaultBoxAndWhiskerCategoryDataset19.getRowCount();
        int int23 = defaultBoxAndWhiskerCategoryDataset19.getRowCount();
        int int24 = defaultBoxAndWhiskerCategoryDataset19.getColumnCount();
        int int26 = defaultBoxAndWhiskerCategoryDataset19.getRowIndex((java.lang.Comparable) 0L);
        double double28 = defaultBoxAndWhiskerCategoryDataset19.getRangeUpperBound(true);
        boolean boolean29 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset19", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset19) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = null;
        defaultBoxAndWhiskerCategoryDataset7.data = keyedObjects2D8;
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = null;
        defaultBoxAndWhiskerCategoryDataset7.data = keyedObjects2D10;
        double double13 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset7.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset15.hasListener(eventListener16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener18);
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset15.getColumnKeys();
        int int22 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset7.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset15);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = defaultBoxAndWhiskerCategoryDataset15.data;
        defaultBoxAndWhiskerCategoryDataset15.validateObject();
        double double27 = defaultBoxAndWhiskerCategoryDataset15.getRangeUpperBound(true);
        int int28 = defaultBoxAndWhiskerCategoryDataset15.getColumnCount();
        int int30 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) '#');
        java.util.List list31 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        int int32 = defaultBoxAndWhiskerCategoryDataset15.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = defaultBoxAndWhiskerCategoryDataset15.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D33;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "");
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        int int8 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        org.jfree.data.Range range10 = defaultBoxAndWhiskerCategoryDataset6.getRangeBounds(false);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset6.getRowKeys();
        int int13 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset5.hasListener(eventListener6);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset5.removeChangeListener(datasetChangeListener8);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset5.getColumnKeys();
        int int12 = defaultBoxAndWhiskerCategoryDataset5.getRowIndex((java.lang.Comparable) (byte) 1);
        double double14 = defaultBoxAndWhiskerCategoryDataset5.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset5.removeChangeListener(datasetChangeListener15);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset5.data;
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset5.hasListener(eventListener18);
        double double21 = defaultBoxAndWhiskerCategoryDataset5.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultBoxAndWhiskerCategoryDataset5.addChangeListener(datasetChangeListener22);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = defaultBoxAndWhiskerCategoryDataset5.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D24;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset5", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset5.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int11 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) 0L);
        int int12 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener14);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        double double19 = defaultBoxAndWhiskerCategoryDataset16.getRangeLowerBound(false);
        int int21 = defaultBoxAndWhiskerCategoryDataset16.getRowIndex((java.lang.Comparable) Double.NaN);
        double double23 = defaultBoxAndWhiskerCategoryDataset16.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = defaultBoxAndWhiskerCategoryDataset16.data;
        org.jfree.data.Range range26 = defaultBoxAndWhiskerCategoryDataset16.getRangeBounds(true);
        int int27 = defaultBoxAndWhiskerCategoryDataset16.getRowCount();
        boolean boolean28 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener11);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int15 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) 0L);
        int int17 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener18);
        defaultBoxAndWhiskerCategoryDataset13.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset13.addChangeListener(datasetChangeListener21);
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset13.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D23;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener16);
        double double19 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset20 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset20.hasListener(eventListener21);
        int int24 = defaultBoxAndWhiskerCategoryDataset20.getRowIndex((java.lang.Comparable) 10L);
        int int26 = defaultBoxAndWhiskerCategoryDataset20.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultBoxAndWhiskerCategoryDataset20.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset20", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset20) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener4);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset6.hasListener(eventListener7);
        int int10 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 10L);
        int int12 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        int int14 = defaultBoxAndWhiskerCategoryDataset6.getRowCount();
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset6);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset16.hasListener(eventListener17);
        int int20 = defaultBoxAndWhiskerCategoryDataset16.getRowIndex((java.lang.Comparable) 10L);
        int int21 = defaultBoxAndWhiskerCategoryDataset16.getRowCount();
        int int22 = defaultBoxAndWhiskerCategoryDataset16.getColumnCount();
        int int24 = defaultBoxAndWhiskerCategoryDataset16.getColumnIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = defaultBoxAndWhiskerCategoryDataset16.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D25;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int8 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 0L);
        int int10 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener11);
        defaultBoxAndWhiskerCategoryDataset6.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset6.addChangeListener(datasetChangeListener14);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = null;
        defaultBoxAndWhiskerCategoryDataset16.data = keyedObjects2D17;
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = null;
        defaultBoxAndWhiskerCategoryDataset16.data = keyedObjects2D19;
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset16.hasListener(eventListener21);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        defaultBoxAndWhiskerCategoryDataset6.setGroup(datasetGroup23);
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        double double10 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(false);
        int int12 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) "hi!");
        int int13 = defaultBoxAndWhiskerCategoryDataset7.getColumnCount();
        int int15 = defaultBoxAndWhiskerCategoryDataset7.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj8", defaultBoxAndWhiskerCategoryDataset0.equals(obj8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj11 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj11", defaultBoxAndWhiskerCategoryDataset0.equals(obj11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset0.data;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double12 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(true);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset10.getRangeBounds(true);
        int int15 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset10.getColumnKeys();
        int int17 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset10.validateObject();
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener8);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener13);
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset10.getColumnKeys();
        int int17 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) (byte) 1);
        double double19 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset10.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener21);
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D23;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener11);
        int int14 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) 10L);
        int int15 = defaultBoxAndWhiskerCategoryDataset10.getRowCount();
        int int16 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        int int17 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        int int19 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset10.getColumnKeys();
        org.jfree.data.Range range22 = defaultBoxAndWhiskerCategoryDataset10.getRangeBounds(false);
        org.jfree.data.Range range24 = defaultBoxAndWhiskerCategoryDataset10.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        double double18 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener19);
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset15.hasListener(eventListener21);
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset15.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D23;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double10 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        int int13 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (-1L));
        double double15 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup7 and datasetGroup18", datasetGroup7.equals(datasetGroup18) ? datasetGroup7.hashCode() == datasetGroup18.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener8);
        int int11 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) 10L);
        int int12 = defaultBoxAndWhiskerCategoryDataset7.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D14;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        double double9 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(false);
        int int11 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) Double.NaN);
        double double13 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D14;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double11 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        double double13 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        int int15 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener19);
        int int21 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        java.lang.Object obj22 = defaultBoxAndWhiskerCategoryDataset8.clone();
        int int24 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) Double.NaN);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and obj22", defaultBoxAndWhiskerCategoryDataset8.equals(obj22) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = null;
        defaultBoxAndWhiskerCategoryDataset4.data = keyedObjects2D5;
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset4.data = keyedObjects2D7;
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset4.hasListener(eventListener9);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset4.data;
        double double13 = defaultBoxAndWhiskerCategoryDataset4.getRangeUpperBound(true);
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset4);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        double double18 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(false);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset15.getRowKeys();
        org.jfree.data.Range range21 = defaultBoxAndWhiskerCategoryDataset15.getRangeBounds(true);
        defaultBoxAndWhiskerCategoryDataset15.validateObject();
        java.util.List list23 = defaultBoxAndWhiskerCategoryDataset15.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset4.equals((java.lang.Object) datasetGroup24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        int int9 = defaultBoxAndWhiskerCategoryDataset7.getColumnCount();
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset7.equals((java.lang.Object) 100L);
        org.jfree.data.Range range13 = defaultBoxAndWhiskerCategoryDataset7.getRangeBounds(false);
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        int int19 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        int int20 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        double double22 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset23 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset23.hasListener(eventListener24);
        int int27 = defaultBoxAndWhiskerCategoryDataset23.getRowIndex((java.lang.Comparable) 10L);
        int int28 = defaultBoxAndWhiskerCategoryDataset23.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = defaultBoxAndWhiskerCategoryDataset23.data;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D29;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and defaultBoxAndWhiskerCategoryDataset23", defaultBoxAndWhiskerCategoryDataset8.equals(defaultBoxAndWhiskerCategoryDataset23) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == defaultBoxAndWhiskerCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        double double10 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(false);
        int int12 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) "hi!");
        int int13 = defaultBoxAndWhiskerCategoryDataset7.getColumnCount();
        int int15 = defaultBoxAndWhiskerCategoryDataset7.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D17;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj10", defaultBoxAndWhiskerCategoryDataset0.equals(obj10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (byte) 1);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = null;
        defaultBoxAndWhiskerCategoryDataset12.data = keyedObjects2D13;
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = null;
        defaultBoxAndWhiskerCategoryDataset12.data = keyedObjects2D15;
        double double18 = defaultBoxAndWhiskerCategoryDataset12.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset12.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset20 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener21 = null;
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset20.hasListener(eventListener21);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset20.removeChangeListener(datasetChangeListener23);
        java.util.List list25 = defaultBoxAndWhiskerCategoryDataset20.getColumnKeys();
        int int27 = defaultBoxAndWhiskerCategoryDataset20.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean28 = defaultBoxAndWhiskerCategoryDataset12.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset20);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultBoxAndWhiskerCategoryDataset20.addChangeListener(datasetChangeListener29);
        org.jfree.data.KeyedObjects2D keyedObjects2D31 = defaultBoxAndWhiskerCategoryDataset20.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D32 = defaultBoxAndWhiskerCategoryDataset20.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D32;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset20", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset20) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset8.data;
        java.lang.Object obj20 = defaultBoxAndWhiskerCategoryDataset8.clone();
        double double22 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and obj20", defaultBoxAndWhiskerCategoryDataset8.equals(obj20) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        double double11 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double15 = defaultBoxAndWhiskerCategoryDataset13.getRangeUpperBound(true);
        org.jfree.data.Range range17 = defaultBoxAndWhiskerCategoryDataset13.getRangeBounds(true);
        int int18 = defaultBoxAndWhiskerCategoryDataset13.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset13.addChangeListener(datasetChangeListener19);
        int int21 = defaultBoxAndWhiskerCategoryDataset13.getRowCount();
        double double23 = defaultBoxAndWhiskerCategoryDataset13.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset13.validateObject();
        java.util.List list25 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        java.lang.Class<?> wildcardClass26 = defaultBoxAndWhiskerCategoryDataset13.getClass();
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener13);
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset10.getColumnKeys();
        int int17 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) (byte) 1);
        double double19 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset10.validateObject();
        double double22 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(true);
        int int23 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        java.util.List list24 = defaultBoxAndWhiskerCategoryDataset10.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D25;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener12);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.lang.Object obj15 = defaultBoxAndWhiskerCategoryDataset14.clone();
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener19);
        int int22 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1.0d));
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset24 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultBoxAndWhiskerCategoryDataset24.getGroup();
        int int26 = defaultBoxAndWhiskerCategoryDataset24.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultBoxAndWhiskerCategoryDataset24.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultBoxAndWhiskerCategoryDataset24.removeChangeListener(datasetChangeListener28);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultBoxAndWhiskerCategoryDataset24.getGroup();
        defaultBoxAndWhiskerCategoryDataset8.setGroup(datasetGroup30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and defaultBoxAndWhiskerCategoryDataset24", defaultBoxAndWhiskerCategoryDataset8.equals(defaultBoxAndWhiskerCategoryDataset24) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == defaultBoxAndWhiskerCategoryDataset24.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double5 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.Range range9 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset15.hasListener(eventListener16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener18);
        int int21 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) (byte) 1);
        double double23 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(true);
        double double25 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(true);
        java.util.List list26 = defaultBoxAndWhiskerCategoryDataset15.getColumnKeys();
        int int28 = defaultBoxAndWhiskerCategoryDataset15.getColumnIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener29 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener29);
        double double32 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(true);
        java.util.List list33 = defaultBoxAndWhiskerCategoryDataset15.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener10);
        int int13 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = null;
        defaultBoxAndWhiskerCategoryDataset7.data = keyedObjects2D14;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double18 = defaultBoxAndWhiskerCategoryDataset16.getRangeUpperBound(true);
        double double20 = defaultBoxAndWhiskerCategoryDataset16.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset16.data;
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset7.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset16);
        java.util.List list23 = defaultBoxAndWhiskerCategoryDataset16.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = defaultBoxAndWhiskerCategoryDataset16.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D24;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double15 = defaultBoxAndWhiskerCategoryDataset13.getRangeUpperBound(true);
        int int16 = defaultBoxAndWhiskerCategoryDataset13.getRowCount();
        int int17 = defaultBoxAndWhiskerCategoryDataset13.getRowCount();
        int int18 = defaultBoxAndWhiskerCategoryDataset13.getColumnCount();
        int int20 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) 0L);
        double double22 = defaultBoxAndWhiskerCategoryDataset13.getRangeUpperBound(true);
        int int23 = defaultBoxAndWhiskerCategoryDataset13.getRowCount();
        boolean boolean24 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj16 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass17 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj16", defaultBoxAndWhiskerCategoryDataset0.equals(obj16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.Range range5 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) -1);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        double double17 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        double double20 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(true);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener22);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj16 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int18 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj16", defaultBoxAndWhiskerCategoryDataset0.equals(obj16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D6 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.Range range8 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        int int14 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) "hi!");
        int int15 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        int int17 = defaultBoxAndWhiskerCategoryDataset9.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D10;
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D12;
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset9.data;
        double double16 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset9.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset18 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset18.getGroup();
        int int20 = defaultBoxAndWhiskerCategoryDataset18.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset18.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultBoxAndWhiskerCategoryDataset18.removeChangeListener(datasetChangeListener22);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultBoxAndWhiskerCategoryDataset18.getGroup();
        defaultBoxAndWhiskerCategoryDataset9.setGroup(datasetGroup24);
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        boolean boolean28 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset18", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset18) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener17);
        java.util.List list19 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset20 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = null;
        defaultBoxAndWhiskerCategoryDataset20.data = keyedObjects2D21;
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = null;
        defaultBoxAndWhiskerCategoryDataset20.data = keyedObjects2D23;
        double double26 = defaultBoxAndWhiskerCategoryDataset20.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = defaultBoxAndWhiskerCategoryDataset20.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset28 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultBoxAndWhiskerCategoryDataset28.hasListener(eventListener29);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultBoxAndWhiskerCategoryDataset28.removeChangeListener(datasetChangeListener31);
        java.util.List list33 = defaultBoxAndWhiskerCategoryDataset28.getColumnKeys();
        int int35 = defaultBoxAndWhiskerCategoryDataset28.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean36 = defaultBoxAndWhiskerCategoryDataset20.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset28);
        int int38 = defaultBoxAndWhiskerCategoryDataset28.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultBoxAndWhiskerCategoryDataset28.removeChangeListener(datasetChangeListener39);
        int int42 = defaultBoxAndWhiskerCategoryDataset28.getColumnIndex((java.lang.Comparable) (-1.0d));
        org.jfree.data.general.DatasetGroup datasetGroup43 = defaultBoxAndWhiskerCategoryDataset28.getGroup();
        defaultBoxAndWhiskerCategoryDataset8.setGroup(datasetGroup43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset20", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset20) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int9 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        int int13 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) 1.0d);
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double16 = defaultBoxAndWhiskerCategoryDataset14.getRangeUpperBound(true);
        double double18 = defaultBoxAndWhiskerCategoryDataset14.getRangeLowerBound(true);
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset14.hasListener(eventListener19);
        int int21 = defaultBoxAndWhiskerCategoryDataset14.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = defaultBoxAndWhiskerCategoryDataset14.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D22;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double15 = defaultBoxAndWhiskerCategoryDataset13.getRangeUpperBound(true);
        double double17 = defaultBoxAndWhiskerCategoryDataset13.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset13.data;
        int int19 = defaultBoxAndWhiskerCategoryDataset13.getColumnCount();
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset13.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        double double18 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(false);
        int int20 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) Double.NaN);
        double double22 = defaultBoxAndWhiskerCategoryDataset15.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset15.data;
        org.jfree.data.Range range25 = defaultBoxAndWhiskerCategoryDataset15.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        double double20 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        int int21 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        int int23 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) '#');
        java.util.List list24 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        int int25 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) 0);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener28 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener28);
        double double31 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset32 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int34 = defaultBoxAndWhiskerCategoryDataset32.getRowIndex((java.lang.Comparable) 0L);
        int int36 = defaultBoxAndWhiskerCategoryDataset32.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener37 = null;
        defaultBoxAndWhiskerCategoryDataset32.removeChangeListener(datasetChangeListener37);
        defaultBoxAndWhiskerCategoryDataset32.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener40 = null;
        defaultBoxAndWhiskerCategoryDataset32.addChangeListener(datasetChangeListener40);
        org.jfree.data.KeyedObjects2D keyedObjects2D42 = defaultBoxAndWhiskerCategoryDataset32.data;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D42;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and defaultBoxAndWhiskerCategoryDataset32", defaultBoxAndWhiskerCategoryDataset8.equals(defaultBoxAndWhiskerCategoryDataset32) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == defaultBoxAndWhiskerCategoryDataset32.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        java.lang.Object obj6 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj6", defaultBoxAndWhiskerCategoryDataset0.equals(obj6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.Range range10 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj8", defaultBoxAndWhiskerCategoryDataset0.equals(obj8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.lang.Object obj1 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Object obj2 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj1", defaultBoxAndWhiskerCategoryDataset0.equals(obj1) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset8.data;
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        java.lang.Object obj21 = defaultBoxAndWhiskerCategoryDataset8.clone();
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and obj21", defaultBoxAndWhiskerCategoryDataset8.equals(obj21) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        double double11 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        int int13 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) Double.NaN);
        double double15 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.jfree.data.Range range18 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double12 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(true);
        double double14 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset10.data;
        int int16 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset10.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D18;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double11 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        double double13 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset9.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D14;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = null;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D9;
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = null;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D11;
        double double14 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset16.hasListener(eventListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset16.removeChangeListener(datasetChangeListener19);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset16.getColumnKeys();
        int int23 = defaultBoxAndWhiskerCategoryDataset16.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean24 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset16);
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultBoxAndWhiskerCategoryDataset16.hasListener(eventListener25);
        java.util.List list27 = defaultBoxAndWhiskerCategoryDataset16.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = defaultBoxAndWhiskerCategoryDataset16.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D28;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = null;
        defaultBoxAndWhiskerCategoryDataset11.data = keyedObjects2D12;
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = null;
        defaultBoxAndWhiskerCategoryDataset11.data = keyedObjects2D14;
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset11.hasListener(eventListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup18);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset20 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = null;
        defaultBoxAndWhiskerCategoryDataset20.data = keyedObjects2D21;
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = null;
        defaultBoxAndWhiskerCategoryDataset20.data = keyedObjects2D23;
        double double26 = defaultBoxAndWhiskerCategoryDataset20.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = defaultBoxAndWhiskerCategoryDataset20.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset28 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = defaultBoxAndWhiskerCategoryDataset28.hasListener(eventListener29);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultBoxAndWhiskerCategoryDataset28.removeChangeListener(datasetChangeListener31);
        java.util.List list33 = defaultBoxAndWhiskerCategoryDataset28.getColumnKeys();
        int int35 = defaultBoxAndWhiskerCategoryDataset28.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean36 = defaultBoxAndWhiskerCategoryDataset20.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset28);
        int int38 = defaultBoxAndWhiskerCategoryDataset28.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener39 = null;
        defaultBoxAndWhiskerCategoryDataset28.removeChangeListener(datasetChangeListener39);
        int int42 = defaultBoxAndWhiskerCategoryDataset28.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int44 = defaultBoxAndWhiskerCategoryDataset28.getColumnIndex((java.lang.Comparable) "hi!");
        int int45 = defaultBoxAndWhiskerCategoryDataset28.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup46 = defaultBoxAndWhiskerCategoryDataset28.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset28", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset28) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset28.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset8.validateObject();
        double double20 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        double double22 = defaultBoxAndWhiskerCategoryDataset8.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener23);
        org.jfree.data.general.DatasetGroup datasetGroup25 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset26 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D27 = null;
        defaultBoxAndWhiskerCategoryDataset26.data = keyedObjects2D27;
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = null;
        defaultBoxAndWhiskerCategoryDataset26.data = keyedObjects2D29;
        double double32 = defaultBoxAndWhiskerCategoryDataset26.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = defaultBoxAndWhiskerCategoryDataset26.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset34 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener35 = null;
        boolean boolean36 = defaultBoxAndWhiskerCategoryDataset34.hasListener(eventListener35);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener37 = null;
        defaultBoxAndWhiskerCategoryDataset34.removeChangeListener(datasetChangeListener37);
        java.util.List list39 = defaultBoxAndWhiskerCategoryDataset34.getColumnKeys();
        int int41 = defaultBoxAndWhiskerCategoryDataset34.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean42 = defaultBoxAndWhiskerCategoryDataset26.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset34);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener43 = null;
        defaultBoxAndWhiskerCategoryDataset34.addChangeListener(datasetChangeListener43);
        org.jfree.data.KeyedObjects2D keyedObjects2D45 = defaultBoxAndWhiskerCategoryDataset34.data;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D45;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset26", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset26) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset26.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener13);
        java.util.List list15 = defaultBoxAndWhiskerCategoryDataset10.getColumnKeys();
        int int17 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj10", defaultBoxAndWhiskerCategoryDataset0.equals(obj10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        double double15 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = null;
        defaultBoxAndWhiskerCategoryDataset4.data = keyedObjects2D5;
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset4.data = keyedObjects2D7;
        double double10 = defaultBoxAndWhiskerCategoryDataset4.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = defaultBoxAndWhiskerCategoryDataset4.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset12.hasListener(eventListener13);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset12.removeChangeListener(datasetChangeListener15);
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset12.getColumnKeys();
        int int19 = defaultBoxAndWhiskerCategoryDataset12.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset4.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset12);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset12.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset16.hasListener(eventListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset16.removeChangeListener(datasetChangeListener19);
        int int22 = defaultBoxAndWhiskerCategoryDataset16.getRowIndex((java.lang.Comparable) (byte) 1);
        double double24 = defaultBoxAndWhiskerCategoryDataset16.getRangeLowerBound(true);
        double double26 = defaultBoxAndWhiskerCategoryDataset16.getRangeLowerBound(true);
        java.util.List list27 = defaultBoxAndWhiskerCategoryDataset16.getColumnKeys();
        boolean boolean28 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) list27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener7 = null;
        boolean boolean8 = defaultBoxAndWhiskerCategoryDataset6.hasListener(eventListener7);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener9);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset6.getColumnKeys();
        int int13 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) (byte) 1);
        double double15 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset6.validateObject();
        double double18 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(true);
        int int19 = defaultBoxAndWhiskerCategoryDataset6.getColumnCount();
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset6.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener8);
        int int11 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) "");
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D12;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double8 = defaultBoxAndWhiskerCategoryDataset6.getRangeUpperBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(true);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset6.hasListener(eventListener11);
        double double14 = defaultBoxAndWhiskerCategoryDataset6.getRangeLowerBound(true);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset6.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj10", defaultBoxAndWhiskerCategoryDataset0.equals(obj10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener17);
        org.jfree.data.KeyedObjects2D keyedObjects2D19 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset20 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset20.getGroup();
        double double23 = defaultBoxAndWhiskerCategoryDataset20.getRangeLowerBound(false);
        int int25 = defaultBoxAndWhiskerCategoryDataset20.getRowIndex((java.lang.Comparable) "hi!");
        int int26 = defaultBoxAndWhiskerCategoryDataset20.getColumnCount();
        int int28 = defaultBoxAndWhiskerCategoryDataset20.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultBoxAndWhiskerCategoryDataset20.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultBoxAndWhiskerCategoryDataset20.addChangeListener(datasetChangeListener30);
        int int32 = defaultBoxAndWhiskerCategoryDataset20.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultBoxAndWhiskerCategoryDataset20.getGroup();
        defaultBoxAndWhiskerCategoryDataset8.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and defaultBoxAndWhiskerCategoryDataset20", defaultBoxAndWhiskerCategoryDataset8.equals(defaultBoxAndWhiskerCategoryDataset20) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == defaultBoxAndWhiskerCategoryDataset20.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 'a');
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.Range range10 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset12.hasListener(eventListener13);
        int int16 = defaultBoxAndWhiskerCategoryDataset12.getRowIndex((java.lang.Comparable) 10L);
        int int17 = defaultBoxAndWhiskerCategoryDataset12.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D18 = defaultBoxAndWhiskerCategoryDataset12.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D18;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.Range range7 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener10 = null;
        boolean boolean11 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener10);
        int int13 = defaultBoxAndWhiskerCategoryDataset9.getRowIndex((java.lang.Comparable) 10L);
        int int14 = defaultBoxAndWhiskerCategoryDataset9.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset9.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D15;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj4 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset5.getGroup();
        int int7 = defaultBoxAndWhiskerCategoryDataset5.getColumnCount();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset5.getRowKeys();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset5.getRowKeys();
        org.jfree.data.Range range11 = defaultBoxAndWhiskerCategoryDataset5.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset5.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D12;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj4", defaultBoxAndWhiskerCategoryDataset0.equals(obj4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        double double16 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int18 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset19 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = null;
        defaultBoxAndWhiskerCategoryDataset19.data = keyedObjects2D20;
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = null;
        defaultBoxAndWhiskerCategoryDataset19.data = keyedObjects2D22;
        double double25 = defaultBoxAndWhiskerCategoryDataset19.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = defaultBoxAndWhiskerCategoryDataset19.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset27 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultBoxAndWhiskerCategoryDataset27.hasListener(eventListener28);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultBoxAndWhiskerCategoryDataset27.removeChangeListener(datasetChangeListener30);
        java.util.List list32 = defaultBoxAndWhiskerCategoryDataset27.getColumnKeys();
        int int34 = defaultBoxAndWhiskerCategoryDataset27.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean35 = defaultBoxAndWhiskerCategoryDataset19.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset27);
        org.jfree.data.KeyedObjects2D keyedObjects2D36 = defaultBoxAndWhiskerCategoryDataset27.data;
        defaultBoxAndWhiskerCategoryDataset27.validateObject();
        double double39 = defaultBoxAndWhiskerCategoryDataset27.getRangeUpperBound(true);
        int int40 = defaultBoxAndWhiskerCategoryDataset27.getColumnCount();
        int int42 = defaultBoxAndWhiskerCategoryDataset27.getRowIndex((java.lang.Comparable) '#');
        java.util.List list43 = defaultBoxAndWhiskerCategoryDataset27.getRowKeys();
        int int44 = defaultBoxAndWhiskerCategoryDataset27.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D45 = defaultBoxAndWhiskerCategoryDataset27.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D45;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset27", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset27) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset27.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = defaultBoxAndWhiskerCategoryDataset0.data;
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        int int16 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 1);
        java.lang.Object obj17 = defaultBoxAndWhiskerCategoryDataset0.clone();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj17", defaultBoxAndWhiskerCategoryDataset0.equals(obj17) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int12 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) 0L);
        int int14 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener15 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener15);
        defaultBoxAndWhiskerCategoryDataset10.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener18);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset20 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = null;
        defaultBoxAndWhiskerCategoryDataset20.data = keyedObjects2D21;
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = null;
        defaultBoxAndWhiskerCategoryDataset20.data = keyedObjects2D23;
        java.util.EventListener eventListener25 = null;
        boolean boolean26 = defaultBoxAndWhiskerCategoryDataset20.hasListener(eventListener25);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultBoxAndWhiskerCategoryDataset20.getGroup();
        defaultBoxAndWhiskerCategoryDataset10.setGroup(datasetGroup27);
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D10;
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D12;
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset9.data;
        double double16 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset9.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset18 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset18.getGroup();
        int int20 = defaultBoxAndWhiskerCategoryDataset18.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset18.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultBoxAndWhiskerCategoryDataset18.removeChangeListener(datasetChangeListener22);
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultBoxAndWhiskerCategoryDataset18.getGroup();
        defaultBoxAndWhiskerCategoryDataset9.setGroup(datasetGroup24);
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset18", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset18) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range12 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int8 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 0L);
        int int10 = defaultBoxAndWhiskerCategoryDataset6.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset6.removeChangeListener(datasetChangeListener11);
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset6.hasListener(eventListener13);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset6.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D15;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset6", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset6) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset6.hashCode() : true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double12 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset10.validateObject();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener14);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset10.getColumnKeys();
        int int18 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) 100L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener19);
        int int21 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        boolean boolean22 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) int21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj9", defaultBoxAndWhiskerCategoryDataset0.equals(obj9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener9);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset11.hasListener(eventListener12);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener14);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset11.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D17;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj12 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj12", defaultBoxAndWhiskerCategoryDataset0.equals(obj12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup3 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener8);
        int int11 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) 10L);
        int int12 = defaultBoxAndWhiskerCategoryDataset7.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D13;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) false);
        java.lang.Object obj8 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj8", defaultBoxAndWhiskerCategoryDataset0.equals(obj8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener13);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener15);
        int int17 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) ' ');
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        int int17 = defaultBoxAndWhiskerCategoryDataset15.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener19);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultBoxAndWhiskerCategoryDataset15.addChangeListener(datasetChangeListener22);
        boolean boolean24 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) datasetChangeListener22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) (-1));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = null;
        defaultBoxAndWhiskerCategoryDataset12.data = keyedObjects2D13;
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = null;
        defaultBoxAndWhiskerCategoryDataset12.data = keyedObjects2D15;
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset12.data;
        double double19 = defaultBoxAndWhiskerCategoryDataset12.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset12.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset21 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup22 = defaultBoxAndWhiskerCategoryDataset21.getGroup();
        int int23 = defaultBoxAndWhiskerCategoryDataset21.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultBoxAndWhiskerCategoryDataset21.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultBoxAndWhiskerCategoryDataset21.removeChangeListener(datasetChangeListener25);
        org.jfree.data.general.DatasetGroup datasetGroup27 = defaultBoxAndWhiskerCategoryDataset21.getGroup();
        defaultBoxAndWhiskerCategoryDataset12.setGroup(datasetGroup27);
        defaultBoxAndWhiskerCategoryDataset12.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset21", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset21) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D4 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener8);
        int int11 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) 10L);
        int int12 = defaultBoxAndWhiskerCategoryDataset7.getRowCount();
        int int13 = defaultBoxAndWhiskerCategoryDataset7.getColumnCount();
        int int14 = defaultBoxAndWhiskerCategoryDataset7.getColumnCount();
        int int16 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list17 = defaultBoxAndWhiskerCategoryDataset7.getColumnKeys();
        org.jfree.data.Range range19 = defaultBoxAndWhiskerCategoryDataset7.getRangeBounds(false);
        org.jfree.data.Range range21 = defaultBoxAndWhiskerCategoryDataset7.getRangeBounds(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D22;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj9", defaultBoxAndWhiskerCategoryDataset0.equals(obj9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double9 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset7.validateObject();
        int int12 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) (-1L));
        double double14 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(true);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener15);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D17;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list10 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup13 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        double double15 = defaultBoxAndWhiskerCategoryDataset12.getRangeLowerBound(false);
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset12.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener17 = null;
        defaultBoxAndWhiskerCategoryDataset12.addChangeListener(datasetChangeListener17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset12.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset12", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset12) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset12.hashCode() : true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) "hi!");
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = null;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D9;
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = null;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D11;
        double double14 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset16.hasListener(eventListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset16.removeChangeListener(datasetChangeListener19);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset16.getColumnKeys();
        int int23 = defaultBoxAndWhiskerCategoryDataset16.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean24 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset16);
        int int26 = defaultBoxAndWhiskerCategoryDataset16.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener27 = null;
        defaultBoxAndWhiskerCategoryDataset16.removeChangeListener(datasetChangeListener27);
        int int30 = defaultBoxAndWhiskerCategoryDataset16.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int32 = defaultBoxAndWhiskerCategoryDataset16.getColumnIndex((java.lang.Comparable) "hi!");
        int int33 = defaultBoxAndWhiskerCategoryDataset16.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup34 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        boolean boolean35 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) datasetGroup34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener9);
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener11);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double15 = defaultBoxAndWhiskerCategoryDataset13.getRangeUpperBound(true);
        int int16 = defaultBoxAndWhiskerCategoryDataset13.getRowCount();
        int int17 = defaultBoxAndWhiskerCategoryDataset13.getRowCount();
        int int18 = defaultBoxAndWhiskerCategoryDataset13.getColumnCount();
        int int20 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) 0L);
        double double22 = defaultBoxAndWhiskerCategoryDataset13.getRangeUpperBound(true);
        int int23 = defaultBoxAndWhiskerCategoryDataset13.getRowCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = defaultBoxAndWhiskerCategoryDataset13.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D24;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100.0f);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener13);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset15.hasListener(eventListener16);
        int int18 = defaultBoxAndWhiskerCategoryDataset15.getRowCount();
        int int20 = defaultBoxAndWhiskerCategoryDataset15.getColumnIndex((java.lang.Comparable) 100.0f);
        org.jfree.data.general.DatasetGroup datasetGroup21 = defaultBoxAndWhiskerCategoryDataset15.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list3 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.Range range6 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        int int10 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset8.addChangeListener(datasetChangeListener19);
        double double22 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset23 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup24 = defaultBoxAndWhiskerCategoryDataset23.getGroup();
        int int25 = defaultBoxAndWhiskerCategoryDataset23.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultBoxAndWhiskerCategoryDataset23.getGroup();
        boolean boolean28 = defaultBoxAndWhiskerCategoryDataset23.equals((java.lang.Object) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = defaultBoxAndWhiskerCategoryDataset23.data;
        boolean boolean30 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) keyedObjects2D29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and defaultBoxAndWhiskerCategoryDataset23", defaultBoxAndWhiskerCategoryDataset8.equals(defaultBoxAndWhiskerCategoryDataset23) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == defaultBoxAndWhiskerCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj15 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int17 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj15", defaultBoxAndWhiskerCategoryDataset0.equals(obj15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(true);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) range15);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener17);
        double double20 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener21);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset23 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = null;
        defaultBoxAndWhiskerCategoryDataset23.data = keyedObjects2D24;
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = null;
        defaultBoxAndWhiskerCategoryDataset23.data = keyedObjects2D26;
        java.util.EventListener eventListener28 = null;
        boolean boolean29 = defaultBoxAndWhiskerCategoryDataset23.hasListener(eventListener28);
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultBoxAndWhiskerCategoryDataset23.getGroup();
        org.jfree.data.Range range32 = defaultBoxAndWhiskerCategoryDataset23.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultBoxAndWhiskerCategoryDataset23.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset23", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset23) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.Range range11 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj9", defaultBoxAndWhiskerCategoryDataset0.equals(obj9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener14 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener14);
        double double17 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset19 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener20 = null;
        boolean boolean21 = defaultBoxAndWhiskerCategoryDataset19.hasListener(eventListener20);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener22 = null;
        defaultBoxAndWhiskerCategoryDataset19.removeChangeListener(datasetChangeListener22);
        int int25 = defaultBoxAndWhiskerCategoryDataset19.getRowIndex((java.lang.Comparable) (byte) 1);
        double double27 = defaultBoxAndWhiskerCategoryDataset19.getRangeLowerBound(true);
        double double29 = defaultBoxAndWhiskerCategoryDataset19.getRangeLowerBound(true);
        java.util.List list30 = defaultBoxAndWhiskerCategoryDataset19.getColumnKeys();
        java.util.List list31 = defaultBoxAndWhiskerCategoryDataset19.getRowKeys();
        org.jfree.data.Range range33 = defaultBoxAndWhiskerCategoryDataset19.getRangeBounds(true);
        boolean boolean34 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset19", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset19) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset19.hashCode() : true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        int int13 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list14 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj15 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj15", defaultBoxAndWhiskerCategoryDataset0.equals(obj15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = null;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D9;
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = null;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D11;
        double double14 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset16.hasListener(eventListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset16.removeChangeListener(datasetChangeListener19);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset16.getColumnKeys();
        int int23 = defaultBoxAndWhiskerCategoryDataset16.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean24 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset16);
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = defaultBoxAndWhiskerCategoryDataset16.data;
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset16.hasListener(eventListener26);
        boolean boolean28 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) eventListener26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener10);
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultBoxAndWhiskerCategoryDataset13.getGroup();
        int int15 = defaultBoxAndWhiskerCategoryDataset13.getColumnCount();
        org.jfree.data.Range range17 = defaultBoxAndWhiskerCategoryDataset13.getRangeBounds(false);
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset13.getRowKeys();
        int int20 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) (byte) -1);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset13.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup2 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1.0f));
        java.lang.Object obj7 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj7", defaultBoxAndWhiskerCategoryDataset0.equals(obj7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) '4');
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener5);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener8);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener10);
        int int13 = defaultBoxAndWhiskerCategoryDataset7.getRowIndex((java.lang.Comparable) (byte) 1);
        double double15 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(true);
        double double17 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(true);
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset7.getColumnKeys();
        int int20 = defaultBoxAndWhiskerCategoryDataset7.getColumnIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener21);
        double double24 = defaultBoxAndWhiskerCategoryDataset7.getRangeLowerBound(true);
        java.util.List list25 = defaultBoxAndWhiskerCategoryDataset7.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup26 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double17 = defaultBoxAndWhiskerCategoryDataset15.getRangeUpperBound(true);
        double double19 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(true);
        double double21 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = defaultBoxAndWhiskerCategoryDataset15.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener23);
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = defaultBoxAndWhiskerCategoryDataset15.data;
        boolean boolean26 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int1 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.lang.Object obj5 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj5", defaultBoxAndWhiskerCategoryDataset0.equals(obj5) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener9);
        java.lang.Object obj11 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass12 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj11", defaultBoxAndWhiskerCategoryDataset0.equals(obj11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener4);
        java.util.List list6 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 100L);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener9);
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset13.hasListener(eventListener14);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener16);
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset13.getColumnKeys();
        int int20 = defaultBoxAndWhiskerCategoryDataset13.getRowIndex((java.lang.Comparable) (byte) 1);
        double double22 = defaultBoxAndWhiskerCategoryDataset13.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset13.removeChangeListener(datasetChangeListener23);
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = defaultBoxAndWhiskerCategoryDataset13.data;
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = defaultBoxAndWhiskerCategoryDataset13.hasListener(eventListener26);
        double double29 = defaultBoxAndWhiskerCategoryDataset13.getRangeLowerBound(true);
        java.util.List list30 = defaultBoxAndWhiskerCategoryDataset13.getColumnKeys();
        boolean boolean31 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) list30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset13", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset13.hashCode() : true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double12 = defaultBoxAndWhiskerCategoryDataset10.getRangeUpperBound(true);
        double double14 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset10.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset10.addChangeListener(datasetChangeListener16);
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset10.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        int int20 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        int int22 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) 10);
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D23;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj9", defaultBoxAndWhiskerCategoryDataset0.equals(obj9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener4 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener4);
        java.util.EventListener eventListener6 = null;
        boolean boolean7 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double11 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        double double13 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        int int15 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset9.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (-1L));
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double13 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(true);
        double double15 = defaultBoxAndWhiskerCategoryDataset11.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D16;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener9 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener9);
        java.lang.Object obj11 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj11", defaultBoxAndWhiskerCategoryDataset0.equals(obj11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) '4');
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj10", defaultBoxAndWhiskerCategoryDataset0.equals(obj10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D9 = null;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D9;
        org.jfree.data.KeyedObjects2D keyedObjects2D11 = null;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D11;
        double double14 = defaultBoxAndWhiskerCategoryDataset8.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = defaultBoxAndWhiskerCategoryDataset8.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset16.hasListener(eventListener17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset16.removeChangeListener(datasetChangeListener19);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset16.getColumnKeys();
        int int23 = defaultBoxAndWhiskerCategoryDataset16.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean24 = defaultBoxAndWhiskerCategoryDataset8.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset16);
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = defaultBoxAndWhiskerCategoryDataset16.data;
        defaultBoxAndWhiskerCategoryDataset16.validateObject();
        double double28 = defaultBoxAndWhiskerCategoryDataset16.getRangeUpperBound(true);
        double double30 = defaultBoxAndWhiskerCategoryDataset16.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultBoxAndWhiskerCategoryDataset16.removeChangeListener(datasetChangeListener31);
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultBoxAndWhiskerCategoryDataset16.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset16", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset16) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset16.hashCode() : true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D7;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        double double12 = defaultBoxAndWhiskerCategoryDataset9.getRangeLowerBound(false);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset9.getRowKeys();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(true);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) range15);
        java.util.EventListener eventListener17 = null;
        boolean boolean18 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener17);
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener19);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset21 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D22 = null;
        defaultBoxAndWhiskerCategoryDataset21.data = keyedObjects2D22;
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = null;
        defaultBoxAndWhiskerCategoryDataset21.data = keyedObjects2D24;
        org.jfree.data.KeyedObjects2D keyedObjects2D26 = defaultBoxAndWhiskerCategoryDataset21.data;
        double double28 = defaultBoxAndWhiskerCategoryDataset21.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = defaultBoxAndWhiskerCategoryDataset21.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset30 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup31 = defaultBoxAndWhiskerCategoryDataset30.getGroup();
        int int32 = defaultBoxAndWhiskerCategoryDataset30.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultBoxAndWhiskerCategoryDataset30.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener34 = null;
        defaultBoxAndWhiskerCategoryDataset30.removeChangeListener(datasetChangeListener34);
        org.jfree.data.general.DatasetGroup datasetGroup36 = defaultBoxAndWhiskerCategoryDataset30.getGroup();
        defaultBoxAndWhiskerCategoryDataset21.setGroup(datasetGroup36);
        defaultBoxAndWhiskerCategoryDataset21.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup39 = defaultBoxAndWhiskerCategoryDataset21.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset21", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset21) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (short) 100);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener11);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener13);
        int int16 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) (byte) 1);
        double double18 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(true);
        double double20 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(true);
        java.util.List list21 = defaultBoxAndWhiskerCategoryDataset10.getColumnKeys();
        int int23 = defaultBoxAndWhiskerCategoryDataset10.getColumnIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener24 = null;
        defaultBoxAndWhiskerCategoryDataset10.removeChangeListener(datasetChangeListener24);
        double double27 = defaultBoxAndWhiskerCategoryDataset10.getRangeLowerBound(true);
        java.util.List list28 = defaultBoxAndWhiskerCategoryDataset10.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.List list11 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.util.List list12 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        double double14 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int16 = defaultBoxAndWhiskerCategoryDataset15.getRowCount();
        double double18 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(true);
        int int20 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) 10.0d);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener21 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener21);
        boolean boolean23 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup9 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int12 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10);
        org.jfree.data.KeyedObjects2D keyedObjects2D13 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset14.getGroup();
        int int16 = defaultBoxAndWhiskerCategoryDataset14.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset14.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset14", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset14) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset14.hashCode() : true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener12 = null;
        boolean boolean13 = defaultBoxAndWhiskerCategoryDataset11.hasListener(eventListener12);
        int int15 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) 10L);
        int int16 = defaultBoxAndWhiskerCategoryDataset11.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        int int18 = defaultBoxAndWhiskerCategoryDataset11.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener19);
        double double22 = defaultBoxAndWhiskerCategoryDataset11.getRangeUpperBound(true);
        java.util.List list23 = defaultBoxAndWhiskerCategoryDataset11.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = defaultBoxAndWhiskerCategoryDataset11.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D24;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) Double.NaN);
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.Range range10 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup11 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset14 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D15 = null;
        defaultBoxAndWhiskerCategoryDataset14.data = keyedObjects2D15;
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = null;
        defaultBoxAndWhiskerCategoryDataset14.data = keyedObjects2D17;
        double double20 = defaultBoxAndWhiskerCategoryDataset14.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset14.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset22 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener23 = null;
        boolean boolean24 = defaultBoxAndWhiskerCategoryDataset22.hasListener(eventListener23);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener25 = null;
        defaultBoxAndWhiskerCategoryDataset22.removeChangeListener(datasetChangeListener25);
        java.util.List list27 = defaultBoxAndWhiskerCategoryDataset22.getColumnKeys();
        int int29 = defaultBoxAndWhiskerCategoryDataset22.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean30 = defaultBoxAndWhiskerCategoryDataset14.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset22);
        int int32 = defaultBoxAndWhiskerCategoryDataset22.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener33 = null;
        defaultBoxAndWhiskerCategoryDataset22.removeChangeListener(datasetChangeListener33);
        int int36 = defaultBoxAndWhiskerCategoryDataset22.getColumnIndex((java.lang.Comparable) (-1.0d));
        int int38 = defaultBoxAndWhiskerCategoryDataset22.getColumnIndex((java.lang.Comparable) "hi!");
        int int39 = defaultBoxAndWhiskerCategoryDataset22.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup40 = defaultBoxAndWhiskerCategoryDataset22.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset22", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset22) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset22.hashCode() : true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int2 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 0L);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        int int12 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) 10L);
        int int13 = defaultBoxAndWhiskerCategoryDataset8.getRowCount();
        int int14 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getColumnCount();
        int int17 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) 100.0d);
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        org.jfree.data.Range range20 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(false);
        org.jfree.data.Range range22 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D23 = defaultBoxAndWhiskerCategoryDataset8.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D23;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset8", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset8) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset8.hashCode() : true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        org.jfree.data.Range range14 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset15.hasListener(eventListener16);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener18 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener18);
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset15.getColumnKeys();
        int int22 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) (byte) 1);
        double double24 = defaultBoxAndWhiskerCategoryDataset15.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset15.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultBoxAndWhiskerCategoryDataset15.removeChangeListener(datasetChangeListener26);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = defaultBoxAndWhiskerCategoryDataset15.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D28;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener7);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D10;
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D12;
        double double15 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset9.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset17.hasListener(eventListener18);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultBoxAndWhiskerCategoryDataset17.removeChangeListener(datasetChangeListener20);
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset17.getColumnKeys();
        int int24 = defaultBoxAndWhiskerCategoryDataset17.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset9.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset17);
        int int27 = defaultBoxAndWhiskerCategoryDataset17.getColumnIndex((java.lang.Comparable) (-1L));
        int int28 = defaultBoxAndWhiskerCategoryDataset17.getColumnCount();
        int int29 = defaultBoxAndWhiskerCategoryDataset17.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup30 = defaultBoxAndWhiskerCategoryDataset17.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset8.data;
        java.util.List list18 = defaultBoxAndWhiskerCategoryDataset8.getRowKeys();
        org.jfree.data.Range range20 = defaultBoxAndWhiskerCategoryDataset8.getRangeBounds(false);
        int int22 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset23 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double25 = defaultBoxAndWhiskerCategoryDataset23.getRangeUpperBound(true);
        double double27 = defaultBoxAndWhiskerCategoryDataset23.getRangeLowerBound(true);
        double double29 = defaultBoxAndWhiskerCategoryDataset23.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D30 = defaultBoxAndWhiskerCategoryDataset23.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener31 = null;
        defaultBoxAndWhiskerCategoryDataset23.removeChangeListener(datasetChangeListener31);
        org.jfree.data.KeyedObjects2D keyedObjects2D33 = defaultBoxAndWhiskerCategoryDataset23.data;
        defaultBoxAndWhiskerCategoryDataset8.data = keyedObjects2D33;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and defaultBoxAndWhiskerCategoryDataset23", defaultBoxAndWhiskerCategoryDataset8.equals(defaultBoxAndWhiskerCategoryDataset23) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == defaultBoxAndWhiskerCategoryDataset23.hashCode() : true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener5);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        int int11 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset9.addChangeListener(datasetChangeListener16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset9", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset9.hashCode() : true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D10;
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D12;
        double double15 = defaultBoxAndWhiskerCategoryDataset9.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset9.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset17 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset17.hasListener(eventListener18);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener20 = null;
        defaultBoxAndWhiskerCategoryDataset17.removeChangeListener(datasetChangeListener20);
        java.util.List list22 = defaultBoxAndWhiskerCategoryDataset17.getColumnKeys();
        int int24 = defaultBoxAndWhiskerCategoryDataset17.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset9.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset17);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener26 = null;
        defaultBoxAndWhiskerCategoryDataset17.addChangeListener(datasetChangeListener26);
        org.jfree.data.KeyedObjects2D keyedObjects2D28 = defaultBoxAndWhiskerCategoryDataset17.data;
        java.util.List list29 = defaultBoxAndWhiskerCategoryDataset17.getRowKeys();
        int int30 = defaultBoxAndWhiskerCategoryDataset17.getRowCount();
        java.lang.Object obj31 = defaultBoxAndWhiskerCategoryDataset17.clone();
        boolean boolean32 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset17", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset17) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset17.hashCode() : true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        double double8 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        java.lang.Object obj10 = defaultBoxAndWhiskerCategoryDataset0.clone();
        java.lang.Class<?> wildcardClass11 = defaultBoxAndWhiskerCategoryDataset0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj10", defaultBoxAndWhiskerCategoryDataset0.equals(obj10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener12);
        int int15 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 1);
        int int17 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) false);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset18 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double20 = defaultBoxAndWhiskerCategoryDataset18.getRangeUpperBound(true);
        int int21 = defaultBoxAndWhiskerCategoryDataset18.getRowCount();
        int int22 = defaultBoxAndWhiskerCategoryDataset18.getRowCount();
        int int23 = defaultBoxAndWhiskerCategoryDataset18.getColumnCount();
        org.jfree.data.KeyedObjects2D keyedObjects2D24 = defaultBoxAndWhiskerCategoryDataset18.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D25 = defaultBoxAndWhiskerCategoryDataset18.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D25;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset18", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset18) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset18.hashCode() : true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        java.util.List list4 = defaultBoxAndWhiskerCategoryDataset0.getRowKeys();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.util.List list8 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D10;
        org.jfree.data.KeyedObjects2D keyedObjects2D12 = null;
        defaultBoxAndWhiskerCategoryDataset9.data = keyedObjects2D12;
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = defaultBoxAndWhiskerCategoryDataset9.hasListener(eventListener14);
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        org.jfree.data.Range range18 = defaultBoxAndWhiskerCategoryDataset9.getRangeBounds(true);
        org.jfree.data.general.DatasetGroup datasetGroup19 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup1 and datasetGroup19", datasetGroup1.equals(datasetGroup19) ? datasetGroup1.hashCode() == datasetGroup19.hashCode() : true);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener11);
        java.util.EventListener eventListener13 = null;
        boolean boolean14 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener13);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset15.hasListener(eventListener16);
        int int19 = defaultBoxAndWhiskerCategoryDataset15.getRowIndex((java.lang.Comparable) (short) 100);
        java.util.List list20 = defaultBoxAndWhiskerCategoryDataset15.getColumnKeys();
        double double22 = defaultBoxAndWhiskerCategoryDataset15.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener23 = null;
        defaultBoxAndWhiskerCategoryDataset15.addChangeListener(datasetChangeListener23);
        boolean boolean25 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset15);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset26 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int27 = defaultBoxAndWhiskerCategoryDataset26.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup28 = defaultBoxAndWhiskerCategoryDataset26.getGroup();
        int int29 = defaultBoxAndWhiskerCategoryDataset26.getRowCount();
        java.util.List list30 = defaultBoxAndWhiskerCategoryDataset26.getRowKeys();
        boolean boolean31 = defaultBoxAndWhiskerCategoryDataset15.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset15 and defaultBoxAndWhiskerCategoryDataset26", defaultBoxAndWhiskerCategoryDataset15.equals(defaultBoxAndWhiskerCategoryDataset26) ? defaultBoxAndWhiskerCategoryDataset15.hashCode() == defaultBoxAndWhiskerCategoryDataset26.hashCode() : true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        java.util.List list7 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        java.lang.Object obj9 = defaultBoxAndWhiskerCategoryDataset0.clone();
        int int11 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj9", defaultBoxAndWhiskerCategoryDataset0.equals(obj9) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        double double6 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D7 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = defaultBoxAndWhiskerCategoryDataset8.hasListener(eventListener9);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener11);
        java.util.List list13 = defaultBoxAndWhiskerCategoryDataset8.getColumnKeys();
        int int15 = defaultBoxAndWhiskerCategoryDataset8.getRowIndex((java.lang.Comparable) (byte) 1);
        boolean boolean16 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset8);
        int int18 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1L));
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset8.removeChangeListener(datasetChangeListener19);
        int int22 = defaultBoxAndWhiskerCategoryDataset8.getColumnIndex((java.lang.Comparable) (-1.0d));
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset8.getGroup();
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset24 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double26 = defaultBoxAndWhiskerCategoryDataset24.getRangeUpperBound(true);
        double double28 = defaultBoxAndWhiskerCategoryDataset24.getRangeLowerBound(true);
        org.jfree.data.KeyedObjects2D keyedObjects2D29 = defaultBoxAndWhiskerCategoryDataset24.data;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener30 = null;
        defaultBoxAndWhiskerCategoryDataset24.addChangeListener(datasetChangeListener30);
        java.util.List list32 = defaultBoxAndWhiskerCategoryDataset24.getColumnKeys();
        org.jfree.data.general.DatasetGroup datasetGroup33 = defaultBoxAndWhiskerCategoryDataset24.getGroup();
        defaultBoxAndWhiskerCategoryDataset8.setGroup(datasetGroup33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset8 and defaultBoxAndWhiskerCategoryDataset24", defaultBoxAndWhiskerCategoryDataset8.equals(defaultBoxAndWhiskerCategoryDataset24) ? defaultBoxAndWhiskerCategoryDataset8.hashCode() == defaultBoxAndWhiskerCategoryDataset24.hashCode() : true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        double double3 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        int int9 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 1);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener11);
        int int14 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) 10L);
        int int15 = defaultBoxAndWhiskerCategoryDataset10.getColumnCount();
        java.util.List list16 = defaultBoxAndWhiskerCategoryDataset10.getColumnKeys();
        boolean boolean17 = defaultBoxAndWhiskerCategoryDataset0.equals((java.lang.Object) defaultBoxAndWhiskerCategoryDataset10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D1 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D1;
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = null;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D3;
        org.jfree.data.KeyedObjects2D keyedObjects2D5 = defaultBoxAndWhiskerCategoryDataset0.data;
        double double7 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        int int11 = defaultBoxAndWhiskerCategoryDataset9.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener13 = null;
        defaultBoxAndWhiskerCategoryDataset9.removeChangeListener(datasetChangeListener13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = defaultBoxAndWhiskerCategoryDataset9.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup15);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener18);
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset21 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double23 = defaultBoxAndWhiskerCategoryDataset21.getRangeUpperBound(true);
        double double25 = defaultBoxAndWhiskerCategoryDataset21.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset21.validateObject();
        int int27 = defaultBoxAndWhiskerCategoryDataset21.getColumnCount();
        defaultBoxAndWhiskerCategoryDataset21.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup29 = defaultBoxAndWhiskerCategoryDataset21.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset9 and defaultBoxAndWhiskerCategoryDataset21", defaultBoxAndWhiskerCategoryDataset9.equals(defaultBoxAndWhiskerCategoryDataset21) ? defaultBoxAndWhiskerCategoryDataset9.hashCode() == defaultBoxAndWhiskerCategoryDataset21.hashCode() : true);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) 10.0f);
        int int10 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 10);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        int int13 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) 0L);
        int int15 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) 1.0f);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener16 = null;
        defaultBoxAndWhiskerCategoryDataset11.removeChangeListener(datasetChangeListener16);
        defaultBoxAndWhiskerCategoryDataset11.validateObject();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener19 = null;
        defaultBoxAndWhiskerCategoryDataset11.addChangeListener(datasetChangeListener19);
        int int22 = defaultBoxAndWhiskerCategoryDataset11.getRowIndex((java.lang.Comparable) false);
        org.jfree.data.general.DatasetGroup datasetGroup23 = defaultBoxAndWhiskerCategoryDataset11.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset11", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset11) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset11.hashCode() : true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        org.jfree.data.Range range4 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(true);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener6 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener6);
        int int8 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        double double10 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener11 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener11);
        int int14 = defaultBoxAndWhiskerCategoryDataset0.getColumnIndex((java.lang.Comparable) (short) 0);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D16 = defaultBoxAndWhiskerCategoryDataset15.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = defaultBoxAndWhiskerCategoryDataset15.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D17;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset15", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset15) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset15.hashCode() : true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int3 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetGroup datasetGroup4 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        java.lang.Comparable comparable5 = null;
        int int6 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex(comparable5);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.KeyedObjects2D keyedObjects2D8 = null;
        defaultBoxAndWhiskerCategoryDataset7.data = keyedObjects2D8;
        org.jfree.data.general.DatasetChangeListener datasetChangeListener10 = null;
        defaultBoxAndWhiskerCategoryDataset7.addChangeListener(datasetChangeListener10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = defaultBoxAndWhiskerCategoryDataset7.getGroup();
        defaultBoxAndWhiskerCategoryDataset0.setGroup(datasetGroup12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup4 and datasetGroup12", datasetGroup4.equals(datasetGroup12) ? datasetGroup4.hashCode() == datasetGroup12.hashCode() : true);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener1 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener1);
        org.jfree.data.KeyedObjects2D keyedObjects2D3 = defaultBoxAndWhiskerCategoryDataset0.data;
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = defaultBoxAndWhiskerCategoryDataset4.hasListener(eventListener5);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener7 = null;
        defaultBoxAndWhiskerCategoryDataset4.removeChangeListener(datasetChangeListener7);
        java.util.List list9 = defaultBoxAndWhiskerCategoryDataset4.getColumnKeys();
        org.jfree.data.KeyedObjects2D keyedObjects2D10 = defaultBoxAndWhiskerCategoryDataset4.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D10;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset4", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset4) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset4.hashCode() : true);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        int int4 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) 10L);
        int int5 = defaultBoxAndWhiskerCategoryDataset0.getRowCount();
        org.jfree.data.general.DatasetGroup datasetGroup6 = defaultBoxAndWhiskerCategoryDataset0.getGroup();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getColumnCount();
        org.jfree.data.general.DatasetChangeListener datasetChangeListener8 = null;
        defaultBoxAndWhiskerCategoryDataset0.addChangeListener(datasetChangeListener8);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset10 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener11 = null;
        boolean boolean12 = defaultBoxAndWhiskerCategoryDataset10.hasListener(eventListener11);
        int int14 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) 10L);
        int int16 = defaultBoxAndWhiskerCategoryDataset10.getRowIndex((java.lang.Comparable) (-1.0f));
        org.jfree.data.general.DatasetGroup datasetGroup17 = defaultBoxAndWhiskerCategoryDataset10.getGroup();
        int int18 = defaultBoxAndWhiskerCategoryDataset10.getRowCount();
        defaultBoxAndWhiskerCategoryDataset10.validateObject();
        org.jfree.data.KeyedObjects2D keyedObjects2D20 = defaultBoxAndWhiskerCategoryDataset10.data;
        org.jfree.data.KeyedObjects2D keyedObjects2D21 = defaultBoxAndWhiskerCategoryDataset10.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D21;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset10", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset10) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset10.hashCode() : true);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        double double2 = defaultBoxAndWhiskerCategoryDataset0.getRangeUpperBound(true);
        double double4 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener5 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener5);
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener8 = null;
        boolean boolean9 = defaultBoxAndWhiskerCategoryDataset7.hasListener(eventListener8);
        double double11 = defaultBoxAndWhiskerCategoryDataset7.getRangeUpperBound(false);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener12 = null;
        defaultBoxAndWhiskerCategoryDataset7.removeChangeListener(datasetChangeListener12);
        org.jfree.data.KeyedObjects2D keyedObjects2D14 = defaultBoxAndWhiskerCategoryDataset7.data;
        defaultBoxAndWhiskerCategoryDataset0.data = keyedObjects2D14;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and defaultBoxAndWhiskerCategoryDataset7", defaultBoxAndWhiskerCategoryDataset0.equals(defaultBoxAndWhiskerCategoryDataset7) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == defaultBoxAndWhiskerCategoryDataset7.hashCode() : true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
        java.util.EventListener eventListener1 = null;
        boolean boolean2 = defaultBoxAndWhiskerCategoryDataset0.hasListener(eventListener1);
        org.jfree.data.general.DatasetChangeListener datasetChangeListener3 = null;
        defaultBoxAndWhiskerCategoryDataset0.removeChangeListener(datasetChangeListener3);
        java.util.List list5 = defaultBoxAndWhiskerCategoryDataset0.getColumnKeys();
        int int7 = defaultBoxAndWhiskerCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 1);
        double double9 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        defaultBoxAndWhiskerCategoryDataset0.validateObject();
        double double12 = defaultBoxAndWhiskerCategoryDataset0.getRangeLowerBound(true);
        java.lang.Object obj13 = defaultBoxAndWhiskerCategoryDataset0.clone();
        org.jfree.data.Range range15 = defaultBoxAndWhiskerCategoryDataset0.getRangeBounds(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultBoxAndWhiskerCategoryDataset0 and obj13", defaultBoxAndWhiskerCategoryDataset0.equals(obj13) ? defaultBoxAndWhiskerCategoryDataset0.hashCode() == obj13.hashCode() : true);
    }
}

