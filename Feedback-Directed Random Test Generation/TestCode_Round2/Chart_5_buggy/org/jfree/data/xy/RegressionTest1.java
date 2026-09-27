package org.jfree.data.xy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(10, (-1));
        xYSeries9.add((double) 100.0f, (double) (short) 100, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(xYSeries9);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        xYSeries1.add((double) '4', (java.lang.Number) (byte) 0, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable7 = xYSeries6.getKey();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener18);
        xYSeries15.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int25 = xYSeries15.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries15.addPropertyChangeListener(propertyChangeListener26);
        xYSeries15.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries15.remove(1);
        xYSeries11.add(xYDataItem33);
        org.jfree.data.xy.XYSeries xYSeries37 = xYSeries11.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries11.remove(0);
        xYSeries6.setKey((java.lang.Comparable) xYDataItem39);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39, false, false);
        xYSeries3.add(xYDataItem39);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39, false, true);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        xYSeries51.removePropertyChangeListener(propertyChangeListener52);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries51.removePropertyChangeListener(propertyChangeListener54);
        xYSeries51.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray60 = xYSeries51.toArray();
        xYSeries51.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries51.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem68 = xYSeries51.remove((int) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem68, false, false);
        xYSeries47.setKey((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries47.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + '#' + "'", comparable7, '#');
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertNotNull(xYSeries37);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertNotNull(xYDataItem68);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        java.util.List list5 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener12);
        xYSeries9.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries9.addChangeListener(seriesChangeListener18);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener24);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener26);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener32);
        java.util.List list34 = xYSeries31.getItems();
        xYSeries23.data = list34;
        xYSeries9.data = list34;
        xYSeries3.data = list34;
        int int38 = xYSeries3.getItemCount();
        java.lang.Number number39 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(number39, (java.lang.Number) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) 100.0f, (java.lang.Number) (-1.0d), true);
        java.util.List list6 = xYSeries1.getItems();
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        java.util.List list5 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener12);
        xYSeries9.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray18 = xYSeries9.toArray();
        xYSeries9.fireSeriesChanged();
        java.util.List list20 = xYSeries9.getItems();
        boolean boolean21 = xYSeries3.equals((java.lang.Object) list20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        xYSeries3.setKey((java.lang.Comparable) 10);
        double[][] doubleArray12 = xYSeries3.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries3.addOrUpdate((double) 100.0f, (double) (-5908509288197150436L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem15);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) 100, true);
        java.lang.Class<?> wildcardClass11 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.setNotify(false);
        xYSeries3.add((double) 10, (double) 'a', false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries16 = xYSeries3.createCopy(100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries14.setNotify(false);
        boolean boolean17 = xYSeries14.getNotify();
        java.lang.String str18 = xYSeries14.getDescription();
        boolean boolean19 = xYSeries3.equals((java.lang.Object) xYSeries14);
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries3.createCopy((int) (byte) 10, (int) (short) -1);
        xYSeries3.setNotify(true);
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener33);
        int int35 = xYSeries30.getItemCount();
        xYSeries30.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        java.util.List list39 = xYSeries30.getItems();
        xYSeries3.data = list39;
        xYSeries3.setNotify(false);
        boolean boolean43 = xYSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries3.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.util.List list14 = xYSeries11.getItems();
        xYSeries3.data = list14;
        boolean boolean16 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.setMaximumItemCount(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries3.removeChangeListener(seriesChangeListener19);
        int int21 = xYSeries3.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener26);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener28);
        xYSeries25.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable34 = xYSeries25.getKey();
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries42.removePropertyChangeListener(propertyChangeListener43);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries42.removePropertyChangeListener(propertyChangeListener45);
        xYSeries42.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int52 = xYSeries42.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        xYSeries42.addPropertyChangeListener(propertyChangeListener53);
        xYSeries42.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries42.remove(1);
        xYSeries38.add(xYDataItem60);
        org.jfree.data.xy.XYSeries xYSeries64 = xYSeries38.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem66 = xYSeries38.remove(0);
        xYSeries25.add(xYDataItem66);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(xYDataItem66);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + 0L + "'", comparable34, 0L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(xYDataItem60);
        org.junit.Assert.assertNotNull(xYSeries64);
        org.junit.Assert.assertNotNull(xYDataItem66);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        int int13 = xYSeries3.indexOf((java.lang.Number) 2);
        xYSeries3.setMaximumItemCount((int) '#');
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        boolean boolean6 = xYSeries3.isEmpty();
        java.lang.String str7 = xYSeries3.getDescription();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener19);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener21);
        xYSeries18.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int28 = xYSeries18.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries18.addPropertyChangeListener(propertyChangeListener29);
        xYSeries18.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries18.remove(1);
        xYSeries14.add(xYDataItem36);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem36, false);
        xYSeries10.add(xYDataItem36);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem36, true, false);
        xYSeries3.setKey((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(xYDataItem36);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = xYSeries3.getKey();
        java.lang.Object obj9 = xYSeries3.clone();
        java.util.List list10 = xYSeries3.data;
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries14.add((double) 0.0f, 0.0d);
        xYSeries14.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean22 = xYSeries14.getAllowDuplicateXValues();
        xYSeries14.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener36);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener38);
        xYSeries35.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int45 = xYSeries35.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        xYSeries35.addPropertyChangeListener(propertyChangeListener46);
        xYSeries35.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries35.remove(1);
        xYSeries31.add(xYDataItem53);
        xYSeries27.add(xYDataItem53, false);
        xYSeries14.setKey((java.lang.Comparable) xYDataItem53);
        xYSeries3.add(xYDataItem53);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem53);
        java.util.List list60 = xYSeries59.getItems();
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 0L + "'", comparable8, 0L);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(xYDataItem53);
        org.junit.Assert.assertNotNull(list60);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        boolean boolean12 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((java.lang.Number) (short) 1, (java.lang.Number) (short) -1, false);
        xYSeries3.add((java.lang.Number) 100.0d, (java.lang.Number) 2, false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        java.lang.Comparable comparable13 = xYSeries3.getKey();
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries20 = xYSeries17.createCopy((int) (byte) -1, 1);
        boolean boolean21 = xYSeries3.equals((java.lang.Object) xYSeries20);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries20.remove((java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 0L + "'", comparable13, 0L);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 0, 1.0d, true);
        xYSeries3.fireSeriesChanged();
        xYSeries3.fireSeriesChanged();
        xYSeries3.add((double) 3, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries14.setNotify(false);
        boolean boolean17 = xYSeries14.getNotify();
        java.lang.String str18 = xYSeries14.getDescription();
        boolean boolean19 = xYSeries3.equals((java.lang.Object) xYSeries14);
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries3.createCopy((int) (byte) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries22.delete((int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        java.util.List list14 = xYSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries3.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.util.List list14 = xYSeries3.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries3.removeChangeListener(seriesChangeListener15);
        int int17 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (-1L), (double) (byte) 1);
        xYSeries3.add((double) 2147483647, (double) 'a', true);
        boolean boolean19 = xYSeries3.getNotify();
        java.util.List list20 = xYSeries3.getItems();
        java.lang.Number number22 = xYSeries3.getY(0);
        java.util.List list23 = xYSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries3.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 1.0d + "'", number22, 1.0d);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        int int7 = xYSeries6.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener8);
        java.lang.Comparable comparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries6.setKey(comparable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false, false);
        xYSeries3.setMaximumItemCount(2147483647);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) 100.0f, (java.lang.Number) (-1.0d), true);
        xYSeries1.add((double) '4', (double) (-2));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener9);
        xYSeries6.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray15 = xYSeries6.toArray();
        xYSeries6.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries6.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries6.remove((int) (short) 1);
        xYSeries1.add(xYDataItem23, true);
        java.lang.Class<?> wildcardClass26 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries3.addChangeListener(seriesChangeListener22);
        xYSeries3.setMaximumItemCount((int) (byte) 1);
        java.util.List list26 = xYSeries3.data;
        boolean boolean27 = xYSeries3.getNotify();
        xYSeries3.clear();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener13);
        java.lang.Comparable comparable15 = xYSeries10.getKey();
        java.lang.Object obj16 = xYSeries10.clone();
        java.util.List list17 = xYSeries10.data;
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries21.add((double) 0.0f, 0.0d);
        xYSeries21.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean29 = xYSeries21.getAllowDuplicateXValues();
        xYSeries21.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries42.removePropertyChangeListener(propertyChangeListener43);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries42.removePropertyChangeListener(propertyChangeListener45);
        xYSeries42.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int52 = xYSeries42.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        xYSeries42.addPropertyChangeListener(propertyChangeListener53);
        xYSeries42.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries42.remove(1);
        xYSeries38.add(xYDataItem60);
        xYSeries34.add(xYDataItem60, false);
        xYSeries21.setKey((java.lang.Comparable) xYDataItem60);
        xYSeries10.add(xYDataItem60);
        xYSeries3.add(xYDataItem60);
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem60);
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem60);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0L + "'", comparable15, 0L);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(xYDataItem60);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = xYSeries3.getKey();
        java.lang.Object obj9 = xYSeries3.clone();
        xYSeries3.add((double) ' ', 0.0d, false);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 0L + "'", comparable8, 0L);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        int int13 = xYSeries3.indexOf((java.lang.Number) 2);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries17.setDescription("");
        java.lang.String str20 = xYSeries17.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries17.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries27.add((double) 0.0f, 0.0d);
        xYSeries27.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean35 = xYSeries27.getAllowDuplicateXValues();
        xYSeries27.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries48.removePropertyChangeListener(propertyChangeListener49);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        xYSeries48.removePropertyChangeListener(propertyChangeListener51);
        xYSeries48.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int58 = xYSeries48.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        xYSeries48.addPropertyChangeListener(propertyChangeListener59);
        xYSeries48.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem66 = xYSeries48.remove(1);
        xYSeries44.add(xYDataItem66);
        xYSeries40.add(xYDataItem66, false);
        xYSeries27.setKey((java.lang.Comparable) xYDataItem66);
        xYSeries17.add(xYDataItem66, true);
        xYSeries3.add(xYDataItem66, true);
        xYSeries3.delete((int) (byte) 100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete(2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(xYDataItem23);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(xYDataItem66);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (-1L), (double) (byte) 1);
        xYSeries3.clear();
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries3.addOrUpdate((double) 100L, (double) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries3.remove((java.lang.Number) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) (short) 100, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem18);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries3.addChangeListener(seriesChangeListener22);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries3.removeChangeListener(seriesChangeListener24);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        xYSeries3.addChangeListener(seriesChangeListener26);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.fireSeriesChanged();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((double) (byte) 10, (java.lang.Number) (-1.0d));
        java.util.List list7 = xYSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (short) -1 + "'", comparable3, (short) -1);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries3.remove(0);
        xYSeries3.add((double) (-1), (java.lang.Number) 10.0f, false);
        xYSeries3.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYDataItem31);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f, false, false);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        int int7 = xYSeries6.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener8);
        int int10 = xYSeries6.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries6.add(xYDataItem11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) (byte) 100, true);
        boolean boolean10 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 1.0d);
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener13);
        xYSeries10.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int20 = xYSeries10.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries10.addPropertyChangeListener(propertyChangeListener21);
        xYSeries10.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries10.remove(1);
        xYSeries6.add(xYDataItem28);
        boolean boolean30 = xYSeries6.getAllowDuplicateXValues();
        boolean boolean31 = xYSeries2.equals((java.lang.Object) xYSeries6);
        int int32 = xYSeries6.getItemCount();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries3.createCopy((-2), 1);
        xYSeries3.add((double) (short) 10, (java.lang.Number) 100.0f, false);
        org.junit.Assert.assertNotNull(xYSeries10);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener20);
        xYSeries17.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray26 = xYSeries17.toArray();
        xYSeries17.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries17.setKey((java.lang.Comparable) 10.0f);
        xYSeries17.add((java.lang.Number) (byte) 10, (java.lang.Number) 0, false);
        java.util.List list37 = xYSeries17.getItems();
        boolean boolean38 = xYSeries3.equals((java.lang.Object) list37);
        org.jfree.data.xy.XYSeries xYSeries41 = xYSeries3.createCopy(1, 0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries41.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(xYSeries41);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        boolean boolean14 = xYSeries3.equals((java.lang.Object) false);
        xYSeries3.add((double) (byte) 10, (double) (byte) 10, true);
        boolean boolean19 = xYSeries3.getAutoSort();
        xYSeries3.setDescription("");
        xYSeries3.add((double) 'a', (java.lang.Number) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) -1);
        xYSeries3.add((java.lang.Number) 0L, (java.lang.Number) 0L);
        xYSeries3.add((double) 10, (java.lang.Number) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries3.addOrUpdate((java.lang.Number) 100L, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -3, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        double[][] doubleArray6 = xYSeries3.toArray();
        java.util.List list7 = xYSeries3.data;
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        double[][] doubleArray6 = xYSeries3.toArray();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) (-1L));
        java.lang.Object obj10 = xYSeries3.clone();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener11);
        java.lang.String str13 = xYSeries3.getDescription();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        java.util.List list5 = xYSeries3.getItems();
        java.lang.Comparable comparable6 = xYSeries3.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((int) (byte) 0, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10L + "'", comparable6, 10L);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.add(0.0d, (java.lang.Number) 0.0d, false);
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.remove((int) (byte) 0);
        boolean boolean8 = xYSeries1.getAutoSort();
        java.lang.Object obj9 = xYSeries1.clone();
        org.junit.Assert.assertNotNull(xYDataItem7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        boolean boolean2 = xYSeries1.getAllowDuplicateXValues();
        double[][] doubleArray3 = xYSeries1.toArray();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray3);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        boolean boolean8 = xYSeries3.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries14.removePropertyChangeListener(propertyChangeListener15);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener23);
        xYSeries20.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray29 = xYSeries20.toArray();
        xYSeries20.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries20.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries20.remove((int) (short) 1);
        xYSeries14.add(xYDataItem37);
        xYSeries10.setKey((java.lang.Comparable) xYDataItem37);
        xYSeries3.add(xYDataItem37);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem37, true);
        xYSeries42.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(xYDataItem37);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.remove(1);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21, false);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21);
        boolean boolean25 = xYSeries24.getAutoSort();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) -1);
        xYSeries3.add((java.lang.Number) 0L, (java.lang.Number) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = xYSeries3.getY((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.setNotify(true);
        xYSeries3.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries18 = xYSeries3.createCopy(0, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries29.addOrUpdate((double) (short) 100, (double) (byte) 1);
        xYSeries29.add((double) 0L, (java.lang.Number) 1.0d, false);
        boolean boolean37 = xYSeries29.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries29.addPropertyChangeListener(propertyChangeListener38);
        boolean boolean40 = xYSeries29.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int45 = xYSeries44.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        xYSeries44.addPropertyChangeListener(propertyChangeListener46);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        boolean boolean50 = xYSeries49.getNotify();
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        xYSeries54.removePropertyChangeListener(propertyChangeListener55);
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        xYSeries54.removePropertyChangeListener(propertyChangeListener57);
        xYSeries54.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int64 = xYSeries54.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        xYSeries54.addPropertyChangeListener(propertyChangeListener65);
        xYSeries54.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem72 = xYSeries54.remove(1);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72, false);
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72, false);
        xYSeries49.add(xYDataItem72, false);
        xYSeries44.add(xYDataItem72, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries29.add(xYDataItem72, true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(xYDataItem72);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 1.0f, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 0, false, false);
        java.lang.Comparable comparable16 = xYSeries15.getKey();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries15.delete((int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 0 + "'", comparable16, (byte) 0);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.util.List list14 = xYSeries11.getItems();
        xYSeries3.data = list14;
        boolean boolean16 = xYSeries3.getAllowDuplicateXValues();
        boolean boolean17 = xYSeries3.getNotify();
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener24);
        xYSeries21.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray30 = xYSeries21.toArray();
        xYSeries21.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries21.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries21.remove((int) (short) 1);
        xYSeries3.setKey((java.lang.Comparable) (short) 1);
        xYSeries3.setMaximumItemCount((int) (short) 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(xYDataItem38);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.removeChangeListener(seriesChangeListener9);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) 1L);
        xYSeries3.add((java.lang.Number) 0, (java.lang.Number) 1L, true);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(100, 1);
        java.lang.Class<?> wildcardClass30 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.util.List list14 = xYSeries11.getItems();
        xYSeries3.data = list14;
        boolean boolean16 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, true, false);
        int int21 = xYSeries20.getMaximumItemCount();
        boolean boolean22 = xYSeries3.equals((java.lang.Object) int21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = xYSeries3.getY((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        xYSeries3.setDescription("");
        int int15 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable12 = xYSeries3.getKey();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener23);
        xYSeries20.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int30 = xYSeries20.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries20.addPropertyChangeListener(propertyChangeListener31);
        xYSeries20.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries20.remove(1);
        xYSeries16.add(xYDataItem38);
        org.jfree.data.xy.XYSeries xYSeries42 = xYSeries16.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries16.remove(0);
        xYSeries3.add(xYDataItem44);
        xYSeries3.add((double) '#', (java.lang.Number) 1.0f, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 10, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertNotNull(xYDataItem44);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (-1), (java.lang.Number) 1.0d, false);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener18);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex(100, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries3.remove(0);
        int int33 = xYSeries3.indexOf((java.lang.Number) 0L);
        java.lang.String str34 = xYSeries3.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries3.addOrUpdate((double) (-5908509288197150436L), (double) 100.0f);
        java.lang.Number number38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries3.remove(number38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(xYDataItem37);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        xYSeries3.fireSeriesChanged();
        xYSeries3.fireSeriesChanged();
        boolean boolean29 = xYSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.util.List list14 = xYSeries11.getItems();
        xYSeries3.data = list14;
        boolean boolean16 = xYSeries3.getAllowDuplicateXValues();
        boolean boolean17 = xYSeries3.getNotify();
        xYSeries3.setDescription("");
        boolean boolean20 = xYSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = xYSeries3.getX((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener8);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100);
        int int2 = xYSeries1.getMaximumItemCount();
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        java.lang.String str8 = xYSeries7.getDescription();
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener13);
        java.util.List list15 = xYSeries12.getItems();
        xYSeries12.clear();
        xYSeries12.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener23);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener25);
        xYSeries22.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int32 = xYSeries22.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries22.addPropertyChangeListener(propertyChangeListener33);
        xYSeries22.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries22.remove(1);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem40, false);
        xYSeries12.add(xYDataItem40);
        xYSeries7.setKey((java.lang.Comparable) xYDataItem40);
        xYSeries1.add(xYDataItem40);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((-1), (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(xYDataItem40);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) -1);
        xYSeries3.add(100.0d, (java.lang.Number) (short) 100, false);
        boolean boolean19 = xYSeries3.getAutoSort();
        xYSeries3.add((-1.0d), (java.lang.Number) 10.0d, true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable7 = xYSeries6.getKey();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener18);
        xYSeries15.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int25 = xYSeries15.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries15.addPropertyChangeListener(propertyChangeListener26);
        xYSeries15.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries15.remove(1);
        xYSeries11.add(xYDataItem33);
        org.jfree.data.xy.XYSeries xYSeries37 = xYSeries11.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries11.remove(0);
        xYSeries6.setKey((java.lang.Comparable) xYDataItem39);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39, false, false);
        xYSeries3.add(xYDataItem39);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39, false, true);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true, true);
        int int52 = xYSeries50.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries50.addOrUpdate((double) 'a', 0.0d);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + '#' + "'", comparable7, '#');
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertNotNull(xYSeries37);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(xYDataItem55);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        boolean boolean7 = xYSeries3.isEmpty();
        xYSeries3.add((double) (byte) 100, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries3.addChangeListener(seriesChangeListener22);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener28);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener30);
        xYSeries27.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int37 = xYSeries27.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries41.removePropertyChangeListener(propertyChangeListener42);
        java.util.List list44 = xYSeries41.getItems();
        xYSeries27.data = list44;
        xYSeries3.data = list44;
        java.util.List list47 = xYSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries3.remove((java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(list47);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener20);
        xYSeries17.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray26 = xYSeries17.toArray();
        xYSeries17.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries17.setKey((java.lang.Comparable) 10.0f);
        xYSeries17.add((java.lang.Number) (byte) 10, (java.lang.Number) 0, false);
        java.util.List list37 = xYSeries17.getItems();
        boolean boolean38 = xYSeries3.equals((java.lang.Object) list37);
        double[][] doubleArray39 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries3.getDataItem((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.remove(1);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21, false);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21, false);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries26.createCopy((int) (short) 100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries29.remove((java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(xYSeries29);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        int int9 = xYSeries3.indexOf((java.lang.Number) 10.0f);
        xYSeries3.add((java.lang.Number) 10, (java.lang.Number) (byte) 0, false);
        boolean boolean14 = xYSeries3.getAutoSort();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.fireSeriesChanged();
        java.lang.Number number15 = null;
        xYSeries3.add((java.lang.Number) (short) -1, number15);
        xYSeries3.update((java.lang.Number) (short) 0, (java.lang.Number) 10.0d);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener24);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener26);
        xYSeries23.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries23.addChangeListener(seriesChangeListener32);
        java.util.List list34 = xYSeries23.getItems();
        boolean boolean35 = xYSeries3.equals((java.lang.Object) xYSeries23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries3.remove((java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.setNotify(false);
        java.util.List list10 = xYSeries3.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        boolean boolean12 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((java.lang.Number) (short) 1, (java.lang.Number) (short) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries3.remove((java.lang.Number) 1.0d);
        int int19 = xYSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        java.util.List list5 = xYSeries3.getItems();
        int int6 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.fireSeriesChanged();
        xYSeries3.clear();
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries3.addOrUpdate((double) 2147483647, (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener28);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener30);
        xYSeries27.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int37 = xYSeries27.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries27.addPropertyChangeListener(propertyChangeListener38);
        xYSeries27.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries27.remove(1);
        xYSeries23.add(xYDataItem45);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem45, false);
        xYSeries19.add(xYDataItem45);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem45, true, false);
        xYSeries3.add(xYDataItem45);
        boolean boolean54 = xYSeries3.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem16);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.clear();
        int int9 = xYSeries3.indexOf((java.lang.Number) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.remove((java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener25);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener27);
        xYSeries24.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int34 = xYSeries24.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries24.addPropertyChangeListener(propertyChangeListener35);
        xYSeries24.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries24.remove(1);
        xYSeries20.add(xYDataItem42);
        xYSeries16.add(xYDataItem42, false);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem42);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem42, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        xYSeries48.addChangeListener(seriesChangeListener49);
        xYSeries48.setMaximumItemCount(2147483647);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries3.add(1.0d, (java.lang.Number) 2);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener24);
        java.util.List list26 = xYSeries23.getItems();
        xYSeries23.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean31 = xYSeries23.getAllowDuplicateXValues();
        int int33 = xYSeries23.indexOf((java.lang.Number) 2);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries37.setDescription("");
        java.lang.String str40 = xYSeries37.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries37.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries47.add((double) 0.0f, 0.0d);
        xYSeries47.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean55 = xYSeries47.getAllowDuplicateXValues();
        xYSeries47.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener69 = null;
        xYSeries68.removePropertyChangeListener(propertyChangeListener69);
        java.beans.PropertyChangeListener propertyChangeListener71 = null;
        xYSeries68.removePropertyChangeListener(propertyChangeListener71);
        xYSeries68.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int78 = xYSeries68.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener79 = null;
        xYSeries68.addPropertyChangeListener(propertyChangeListener79);
        xYSeries68.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem86 = xYSeries68.remove(1);
        xYSeries64.add(xYDataItem86);
        xYSeries60.add(xYDataItem86, false);
        xYSeries47.setKey((java.lang.Comparable) xYDataItem86);
        xYSeries37.add(xYDataItem86, true);
        xYSeries23.add(xYDataItem86, true);
        xYSeries3.add(xYDataItem86, true);
        xYSeries3.setMaximumItemCount((int) 'a');
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(xYDataItem43);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(xYDataItem86);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (-1L), (double) (byte) 1);
        xYSeries3.add((double) 2147483647, (double) 'a', true);
        boolean boolean19 = xYSeries3.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) 100);
        xYSeries3.add((double) (-1L), (double) 'a');
        xYSeries3.setMaximumItemCount((int) '4');
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        java.util.List list7 = xYSeries3.data;
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(100, 1);
        xYSeries29.add((java.lang.Number) 0, (java.lang.Number) 1);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener37);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener39);
        int int41 = xYSeries36.getItemCount();
        boolean boolean42 = xYSeries36.getNotify();
        int int44 = xYSeries36.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries48.add((double) 0.0f, 0.0d);
        xYSeries48.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean56 = xYSeries48.getAllowDuplicateXValues();
        xYSeries48.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        xYSeries69.removePropertyChangeListener(propertyChangeListener70);
        java.beans.PropertyChangeListener propertyChangeListener72 = null;
        xYSeries69.removePropertyChangeListener(propertyChangeListener72);
        xYSeries69.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int79 = xYSeries69.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener80 = null;
        xYSeries69.addPropertyChangeListener(propertyChangeListener80);
        xYSeries69.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem87 = xYSeries69.remove(1);
        xYSeries65.add(xYDataItem87);
        xYSeries61.add(xYDataItem87, false);
        xYSeries48.setKey((java.lang.Comparable) xYDataItem87);
        org.jfree.data.xy.XYSeries xYSeries93 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem87, false);
        xYSeries36.add(xYDataItem87, false);
        boolean boolean96 = xYSeries29.equals((java.lang.Object) xYDataItem87);
        org.jfree.data.xy.XYSeries xYSeries98 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) boolean96, true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(xYDataItem87);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        int int13 = xYSeries3.indexOf((java.lang.Number) 2);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries17.setDescription("");
        java.lang.String str20 = xYSeries17.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries17.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries27.add((double) 0.0f, 0.0d);
        xYSeries27.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean35 = xYSeries27.getAllowDuplicateXValues();
        xYSeries27.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries48.removePropertyChangeListener(propertyChangeListener49);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        xYSeries48.removePropertyChangeListener(propertyChangeListener51);
        xYSeries48.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int58 = xYSeries48.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        xYSeries48.addPropertyChangeListener(propertyChangeListener59);
        xYSeries48.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem66 = xYSeries48.remove(1);
        xYSeries44.add(xYDataItem66);
        xYSeries40.add(xYDataItem66, false);
        xYSeries27.setKey((java.lang.Comparable) xYDataItem66);
        xYSeries17.add(xYDataItem66, true);
        xYSeries3.add(xYDataItem66, true);
        xYSeries3.add((double) 10.0f, (double) (short) -1, false);
        java.beans.PropertyChangeListener propertyChangeListener79 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener79);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(xYDataItem23);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(xYDataItem66);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable12 = xYSeries3.getKey();
        java.lang.Number number14 = xYSeries3.getX((int) (short) 0);
        int int15 = xYSeries3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener16);
        int int19 = xYSeries3.indexOf((java.lang.Number) 1L);
        xYSeries3.add((double) 'a', (java.lang.Number) 10.0f);
        int int23 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (byte) 0 + "'", number14, (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, false);
        boolean boolean3 = xYSeries2.getAutoSort();
        int int4 = xYSeries2.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries8.add((double) 0.0f, 0.0d);
        xYSeries8.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean16 = xYSeries8.getAllowDuplicateXValues();
        xYSeries8.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener30);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener32);
        xYSeries29.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int39 = xYSeries29.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries29.addPropertyChangeListener(propertyChangeListener40);
        xYSeries29.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries29.remove(1);
        xYSeries25.add(xYDataItem47);
        xYSeries21.add(xYDataItem47, false);
        xYSeries8.setKey((java.lang.Comparable) xYDataItem47);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47, true);
        xYSeries2.add(xYDataItem47);
        int int55 = xYSeries2.getItemCount();
        java.lang.String str56 = xYSeries2.getDescription();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(10, (-1));
        boolean boolean10 = xYSeries9.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries12.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries12.removeChangeListener(seriesChangeListener15);
        java.lang.String str17 = xYSeries12.getDescription();
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries21.setDescription("");
        java.lang.String str24 = xYSeries21.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries21.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries31.add((double) 0.0f, 0.0d);
        xYSeries31.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean39 = xYSeries31.getAllowDuplicateXValues();
        xYSeries31.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        xYSeries52.removePropertyChangeListener(propertyChangeListener53);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        xYSeries52.removePropertyChangeListener(propertyChangeListener55);
        xYSeries52.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int62 = xYSeries52.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        xYSeries52.addPropertyChangeListener(propertyChangeListener63);
        xYSeries52.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem70 = xYSeries52.remove(1);
        xYSeries48.add(xYDataItem70);
        xYSeries44.add(xYDataItem70, false);
        xYSeries31.setKey((java.lang.Comparable) xYDataItem70);
        xYSeries21.add(xYDataItem70, true);
        xYSeries12.setKey((java.lang.Comparable) xYDataItem70);
        xYSeries9.add(xYDataItem70, false);
        boolean boolean80 = xYSeries9.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(xYDataItem27);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(xYDataItem70);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries29.addOrUpdate((double) (short) 100, (double) (byte) 1);
        xYSeries29.add((double) 0L, (java.lang.Number) 1.0d, false);
        boolean boolean37 = xYSeries29.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries29.addPropertyChangeListener(propertyChangeListener38);
        boolean boolean40 = xYSeries29.getAllowDuplicateXValues();
        xYSeries29.add((java.lang.Number) 2147483647, (java.lang.Number) 10L, true);
        xYSeries29.add((double) 10.0f, (java.lang.Number) (-1.0f), false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        int int4 = xYSeries2.indexOf((java.lang.Number) (-1L));
        xYSeries2.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries2.addChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries2.remove((java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        int int7 = xYSeries3.indexOf((java.lang.Number) 0.0d);
        boolean boolean9 = xYSeries3.equals((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.remove((java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", true, true);
        java.lang.Object obj4 = xYSeries3.clone();
        int int5 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        boolean boolean7 = xYSeries3.isEmpty();
        boolean boolean8 = xYSeries3.getAllowDuplicateXValues();
        java.util.List list9 = xYSeries3.getItems();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) 100.0f, (java.lang.Number) (-1.0d), true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = xYSeries1.getY(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.lang.Number number9 = xYSeries3.getY((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries3.getX(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((double) 1L, (double) 100.0f);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.getDataItem((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener19);
        xYSeries16.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int26 = xYSeries16.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries16.addPropertyChangeListener(propertyChangeListener27);
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries16.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, true);
        xYSeries3.add(xYDataItem30, false);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, true);
        boolean boolean37 = xYSeries36.getNotify();
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.remove(1);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, true, false);
        xYSeries24.add((double) 100, (java.lang.Number) 0, true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "", true);
        boolean boolean3 = xYSeries2.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries5.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean9 = xYSeries5.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries5.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener18);
        xYSeries15.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray24 = xYSeries15.toArray();
        xYSeries15.add((double) 1, (java.lang.Number) (short) 1, true);
        int int30 = xYSeries15.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries34.add((double) 0.0f, 0.0d);
        xYSeries34.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean42 = xYSeries34.getAllowDuplicateXValues();
        xYSeries34.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries55.removePropertyChangeListener(propertyChangeListener56);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries55.removePropertyChangeListener(propertyChangeListener58);
        xYSeries55.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int65 = xYSeries55.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        xYSeries55.addPropertyChangeListener(propertyChangeListener66);
        xYSeries55.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem73 = xYSeries55.remove(1);
        xYSeries51.add(xYDataItem73);
        xYSeries47.add(xYDataItem73, false);
        xYSeries34.setKey((java.lang.Comparable) xYDataItem73);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem73, false);
        xYSeries15.add(xYDataItem73);
        xYSeries5.add(xYDataItem73);
        xYSeries2.setKey((java.lang.Comparable) xYDataItem73);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem84 = xYSeries2.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(xYDataItem73);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener2);
        xYSeries1.setDescription("");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        xYSeries3.add((java.lang.Number) 1L, (java.lang.Number) 2147483647, false);
        java.lang.Object obj12 = xYSeries3.clone();
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener25);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener27);
        xYSeries24.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int34 = xYSeries24.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries24.addPropertyChangeListener(propertyChangeListener35);
        xYSeries24.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries24.remove(1);
        xYSeries20.add(xYDataItem42);
        xYSeries16.add(xYDataItem42, false);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem42);
        double[][] doubleArray47 = xYSeries3.toArray();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertNotNull(doubleArray47);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries2.getDataItem(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries3.addChangeListener(seriesChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries3.getY((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((double) 1L, (double) 100.0f);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.getDataItem((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = xYSeries3.getClass();
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable2 = xYSeries1.getKey();
        xYSeries1.clear();
        xYSeries1.add((double) (-1.0f), (double) (short) 10, false);
        xYSeries1.add((double) (byte) -1, (java.lang.Number) 10L);
        java.util.List list11 = xYSeries1.data;
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + '#' + "'", comparable2, '#');
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 0, 1.0d, true);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries3.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) (byte) 100);
        xYSeries3.setMaximumItemCount(1);
        java.lang.Comparable comparable22 = xYSeries3.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries3.addOrUpdate((double) 10.0f, (double) '#');
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, false);
        boolean boolean29 = xYSeries28.getAutoSort();
        int int30 = xYSeries28.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries34.add((double) 0.0f, 0.0d);
        xYSeries34.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean42 = xYSeries34.getAllowDuplicateXValues();
        xYSeries34.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries55.removePropertyChangeListener(propertyChangeListener56);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries55.removePropertyChangeListener(propertyChangeListener58);
        xYSeries55.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int65 = xYSeries55.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        xYSeries55.addPropertyChangeListener(propertyChangeListener66);
        xYSeries55.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem73 = xYSeries55.remove(1);
        xYSeries51.add(xYDataItem73);
        xYSeries47.add(xYDataItem73, false);
        xYSeries34.setKey((java.lang.Comparable) xYDataItem73);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem73, true);
        xYSeries28.add(xYDataItem73);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem73);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem83 = xYSeries3.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + 0L + "'", comparable22, 0L);
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(xYDataItem73);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries3.add(1.0d, (java.lang.Number) 2);
        xYSeries3.fireSeriesChanged();
        java.lang.Class<?> wildcardClass21 = xYSeries3.getClass();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries2.createCopy(2, (int) ' ');
        boolean boolean6 = xYSeries2.getAllowDuplicateXValues();
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable12 = xYSeries3.getKey();
        java.lang.Number number14 = xYSeries3.getX((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener23);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener25);
        xYSeries22.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int32 = xYSeries22.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries22.addPropertyChangeListener(propertyChangeListener33);
        xYSeries22.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries22.remove(1);
        xYSeries18.add(xYDataItem40);
        xYSeries18.fireSeriesChanged();
        xYSeries18.setNotify(false);
        org.jfree.data.xy.XYDataItem xYDataItem46 = xYSeries18.remove(0);
        xYSeries3.add(xYDataItem46, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries3.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (byte) 0 + "'", number14, (byte) 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertNotNull(xYDataItem46);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.fireSeriesChanged();
        java.lang.Number number15 = null;
        xYSeries3.add((java.lang.Number) (short) -1, number15);
        xYSeries3.update((java.lang.Number) (short) 0, (java.lang.Number) 10.0d);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener24);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener26);
        xYSeries23.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries23.addChangeListener(seriesChangeListener32);
        java.util.List list34 = xYSeries23.getItems();
        boolean boolean35 = xYSeries3.equals((java.lang.Object) xYSeries23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries3.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        xYSeries3.clear();
        java.lang.Comparable comparable15 = xYSeries3.getKey();
        xYSeries3.setNotify(false);
        xYSeries3.add(100.0d, (java.lang.Number) (short) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = xYSeries3.getX((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 100 + "'", comparable15, (short) 100);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        int int7 = xYSeries3.indexOf((java.lang.Number) (short) 10);
        boolean boolean8 = xYSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.addOrUpdate((java.lang.Number) (-1.0f), (java.lang.Number) 0);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener19);
        xYSeries16.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int26 = xYSeries16.indexOf((java.lang.Number) 0.0f);
        xYSeries16.add((double) (-1), (java.lang.Number) 1.0d, false);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries16.addPropertyChangeListener(propertyChangeListener31);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries37 = xYSeries34.createCopy((int) (short) 1, (int) 'a');
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        xYSeries45.removePropertyChangeListener(propertyChangeListener46);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        xYSeries45.removePropertyChangeListener(propertyChangeListener48);
        xYSeries45.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int55 = xYSeries45.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries45.addPropertyChangeListener(propertyChangeListener56);
        xYSeries45.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries45.remove(1);
        xYSeries41.add(xYDataItem63);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem63, false);
        xYSeries34.add(xYDataItem63);
        xYSeries16.setKey((java.lang.Comparable) xYDataItem63);
        boolean boolean69 = xYSeries3.equals((java.lang.Object) xYDataItem63);
        java.lang.Comparable comparable70 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setKey(comparable70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(xYSeries37);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(xYDataItem63);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add(10.0d, (java.lang.Number) 10L, true);
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.remove((java.lang.Number) (byte) 10);
        xYSeries1.add((double) 2, (-1.0d), true);
        int int12 = xYSeries1.getItemCount();
        org.junit.Assert.assertNotNull(xYDataItem7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        int int7 = xYSeries3.indexOf((java.lang.Number) (short) 10);
        java.util.List list8 = xYSeries3.data;
        java.util.List list9 = xYSeries3.getItems();
        boolean boolean10 = xYSeries3.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", true, true);
        java.lang.Object obj4 = xYSeries3.clone();
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries3.addOrUpdate((java.lang.Number) 0.0f, (java.lang.Number) (byte) 0);
        java.lang.String str8 = xYSeries3.getDescription();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(xYDataItem7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        int int13 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries3.setDescription("hi!");
        int int22 = xYSeries3.getMaximumItemCount();
        xYSeries3.add((double) (-1), (java.lang.Number) (short) 100, false);
        xYSeries3.fireSeriesChanged();
        java.lang.String str28 = xYSeries3.getDescription();
        xYSeries3.clear();
        xYSeries3.add((java.lang.Number) 1.0d, (java.lang.Number) 10.0d);
        xYSeries3.add((double) 1L, (double) 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries14.setNotify(false);
        boolean boolean17 = xYSeries14.getNotify();
        java.lang.String str18 = xYSeries14.getDescription();
        boolean boolean19 = xYSeries3.equals((java.lang.Object) xYSeries14);
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries3.createCopy((int) (byte) 10, (int) (short) -1);
        xYSeries3.setNotify(true);
        xYSeries3.updateByIndex((int) (short) 0, (java.lang.Number) 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries6.addOrUpdate((java.lang.Number) (short) -1, (java.lang.Number) 0L);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener16);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener22);
        java.util.List list24 = xYSeries21.getItems();
        xYSeries13.data = list24;
        xYSeries13.setMaximumItemCount((int) (short) 0);
        java.lang.Class<?> wildcardClass28 = xYSeries13.getClass();
        boolean boolean29 = xYSeries6.equals((java.lang.Object) wildcardClass28);
        java.util.List list30 = xYSeries6.data;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries6.update((java.lang.Number) (byte) 10, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable7 = xYSeries6.getKey();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener18);
        xYSeries15.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int25 = xYSeries15.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries15.addPropertyChangeListener(propertyChangeListener26);
        xYSeries15.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries15.remove(1);
        xYSeries11.add(xYDataItem33);
        org.jfree.data.xy.XYSeries xYSeries37 = xYSeries11.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries11.remove(0);
        xYSeries6.setKey((java.lang.Comparable) xYDataItem39);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39, false, false);
        xYSeries3.add(xYDataItem39);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39, false, true);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true, true);
        int int52 = xYSeries50.indexOf((java.lang.Number) 1.0d);
        xYSeries50.add((double) (short) 100, (java.lang.Number) (byte) -1);
        xYSeries50.setMaximumItemCount((int) ' ');
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + '#' + "'", comparable7, '#');
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertNotNull(xYSeries37);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener13);
        xYSeries10.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int20 = xYSeries10.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries10.addPropertyChangeListener(propertyChangeListener21);
        xYSeries10.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries10.remove(1);
        xYSeries6.add(xYDataItem28);
        boolean boolean30 = xYSeries6.getAllowDuplicateXValues();
        boolean boolean31 = xYSeries2.equals((java.lang.Object) xYSeries6);
        boolean boolean32 = xYSeries2.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries2.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.remove(1);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, true, false);
        int int26 = xYSeries24.indexOf((java.lang.Number) 100L);
        java.lang.Number number28 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries24.update((java.lang.Number) (-1), number28);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = xYSeries3.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.addOrUpdate((java.lang.Number) 100, (java.lang.Number) 1);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener12);
        int int14 = xYSeries3.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 0L + "'", comparable8, 0L);
        org.junit.Assert.assertNull(xYDataItem11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        boolean boolean12 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((java.lang.Number) (short) 1, (java.lang.Number) (short) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries3.remove((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem18);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem25, false);
        xYSeries28.add((double) (-1L), (double) (short) 100);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener36);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener38);
        xYSeries35.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int45 = xYSeries35.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        xYSeries35.addPropertyChangeListener(propertyChangeListener46);
        xYSeries35.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        xYSeries59.removePropertyChangeListener(propertyChangeListener60);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries59.removePropertyChangeListener(propertyChangeListener62);
        xYSeries59.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int69 = xYSeries59.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        xYSeries59.addPropertyChangeListener(propertyChangeListener70);
        xYSeries59.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem77 = xYSeries59.remove(1);
        xYSeries55.add(xYDataItem77);
        xYSeries55.fireSeriesChanged();
        xYSeries55.setNotify(false);
        org.jfree.data.xy.XYDataItem xYDataItem83 = xYSeries55.remove(0);
        xYSeries35.add(xYDataItem83, true);
        org.jfree.data.xy.XYSeries xYSeries87 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem83, true);
        xYSeries28.setKey((java.lang.Comparable) xYDataItem83);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(xYDataItem77);
        org.junit.Assert.assertNotNull(xYDataItem83);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) 1, (double) 3, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.remove(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        double[][] doubleArray16 = xYSeries3.toArray();
        int int18 = xYSeries3.indexOf((java.lang.Number) 0.0d);
        xYSeries3.add((java.lang.Number) (-1L), (java.lang.Number) (short) 1, true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        boolean boolean6 = xYSeries3.isEmpty();
        boolean boolean7 = xYSeries3.getAllowDuplicateXValues();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        double[][] doubleArray6 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = xYSeries3.getX((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(0, (int) (short) -1);
        boolean boolean10 = xYSeries9.getAutoSort();
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) -1);
        xYSeries3.add(100.0d, (java.lang.Number) (short) 100, false);
        boolean boolean19 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries3.addOrUpdate((double) (byte) 0, (double) (-1));
        xYSeries3.setMaximumItemCount((int) 'a');
        xYSeries3.setNotify(true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable2 = xYSeries1.getKey();
        xYSeries1.clear();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener4);
        xYSeries1.clear();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + '#' + "'", comparable2, '#');
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener9);
        xYSeries6.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray15 = xYSeries6.toArray();
        xYSeries6.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries6.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries6.remove((int) (short) 1);
        xYSeries1.add(xYDataItem23, true);
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (short) -1, true);
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries1.getDataItem(0);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener36);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener38);
        xYSeries35.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int45 = xYSeries35.indexOf((java.lang.Number) 0.0f);
        xYSeries35.add((double) (-1), (java.lang.Number) 1.0d, false);
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        xYSeries35.addPropertyChangeListener(propertyChangeListener50);
        java.lang.Number number53 = xYSeries35.getY((int) (byte) 1);
        java.lang.Comparable comparable54 = xYSeries35.getKey();
        boolean boolean55 = xYSeries1.equals((java.lang.Object) xYSeries35);
        xYSeries1.delete((int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + number53 + "' != '" + (byte) 10 + "'", number53, (byte) 10);
        org.junit.Assert.assertEquals("'" + comparable54 + "' != '" + 0L + "'", comparable54, 0L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener18);
        xYSeries15.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int25 = xYSeries15.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener30);
        java.util.List list32 = xYSeries29.getItems();
        xYSeries15.data = list32;
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener40);
        xYSeries37.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int47 = xYSeries37.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        xYSeries51.removePropertyChangeListener(propertyChangeListener52);
        java.util.List list54 = xYSeries51.getItems();
        xYSeries37.data = list54;
        xYSeries15.data = list54;
        xYSeries3.data = list54;
        int int58 = xYSeries3.getItemCount();
        xYSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = xYSeries3.getKey();
        java.lang.Object obj9 = xYSeries3.clone();
        java.util.List list10 = xYSeries3.data;
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries14.add((double) 0.0f, 0.0d);
        xYSeries14.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean22 = xYSeries14.getAllowDuplicateXValues();
        xYSeries14.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener36);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener38);
        xYSeries35.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int45 = xYSeries35.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        xYSeries35.addPropertyChangeListener(propertyChangeListener46);
        xYSeries35.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries35.remove(1);
        xYSeries31.add(xYDataItem53);
        xYSeries27.add(xYDataItem53, false);
        xYSeries14.setKey((java.lang.Comparable) xYDataItem53);
        xYSeries3.add(xYDataItem53);
        boolean boolean59 = xYSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((-1), (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 0L + "'", comparable8, 0L);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(xYDataItem53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries6.addOrUpdate((java.lang.Number) (short) -1, (java.lang.Number) 0L);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener16);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener22);
        java.util.List list24 = xYSeries21.getItems();
        xYSeries13.data = list24;
        xYSeries13.setMaximumItemCount((int) (short) 0);
        java.lang.Class<?> wildcardClass28 = xYSeries13.getClass();
        boolean boolean29 = xYSeries6.equals((java.lang.Object) wildcardClass28);
        java.util.List list30 = xYSeries6.data;
        java.lang.Object obj31 = xYSeries6.clone();
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) 1, (int) 'a');
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener15);
        xYSeries12.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int22 = xYSeries12.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener23);
        xYSeries12.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries12.remove(1);
        xYSeries8.add(xYDataItem30);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, false);
        xYSeries1.add(xYDataItem30);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, false);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, true, false);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.util.List list14 = xYSeries11.getItems();
        xYSeries3.data = list14;
        boolean boolean16 = xYSeries3.getAllowDuplicateXValues();
        boolean boolean17 = xYSeries3.getNotify();
        xYSeries3.setDescription("");
        boolean boolean20 = xYSeries3.getNotify();
        boolean boolean21 = xYSeries3.getNotify();
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "");
        xYSeries1.add((double) 100L, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        int int10 = xYSeries3.getItemCount();
        boolean boolean11 = xYSeries3.isEmpty();
        int int12 = xYSeries3.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries3.createCopy((int) (short) -1, 4);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries19.createCopy((int) (byte) -1, 1);
        int int23 = xYSeries22.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener32);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener34);
        xYSeries31.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int41 = xYSeries31.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries31.addPropertyChangeListener(propertyChangeListener42);
        xYSeries31.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries31.remove(1);
        xYSeries27.add(xYDataItem49);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem49, false);
        xYSeries22.add(xYDataItem49);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem49, true);
        xYSeries15.setKey((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(xYDataItem49);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        xYSeries1.add((double) (byte) 10, (double) 0, false);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener12);
        xYSeries9.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray18 = xYSeries9.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries9.getDataItem((int) (short) 0);
        xYSeries1.add(xYDataItem20, true);
        java.util.List list23 = xYSeries1.data;
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        int int7 = xYSeries6.getMaximumItemCount();
        int int8 = xYSeries6.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        int int7 = xYSeries6.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener18);
        xYSeries15.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int25 = xYSeries15.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries15.addPropertyChangeListener(propertyChangeListener26);
        xYSeries15.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries15.remove(1);
        xYSeries11.add(xYDataItem33);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem33, false);
        xYSeries6.add(xYDataItem33);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem33, true);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries44 = xYSeries41.createCopy((int) (short) 1, (int) 'a');
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        xYSeries52.removePropertyChangeListener(propertyChangeListener53);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        xYSeries52.removePropertyChangeListener(propertyChangeListener55);
        xYSeries52.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int62 = xYSeries52.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        xYSeries52.addPropertyChangeListener(propertyChangeListener63);
        xYSeries52.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem70 = xYSeries52.remove(1);
        xYSeries48.add(xYDataItem70);
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem70, false);
        xYSeries41.add(xYDataItem70);
        xYSeries39.add(xYDataItem70, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries39.updateByIndex((-1), (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertNotNull(xYSeries44);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(xYDataItem70);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        int int12 = xYSeries3.indexOf((java.lang.Number) (-2));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries3.addChangeListener(seriesChangeListener13);
        double[][] doubleArray15 = xYSeries3.toArray();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy(100, (int) (byte) 10);
        int int10 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy((int) 'a', (int) (byte) 0);
        xYSeries1.setNotify(true);
        java.lang.Class<?> wildcardClass16 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) 1, (int) 'a');
        java.util.List list5 = xYSeries4.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries9.add((double) 0.0f, 0.0d);
        xYSeries9.add((double) (short) 100, (java.lang.Number) (-1L), true);
        xYSeries9.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener23);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener25);
        xYSeries22.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable31 = xYSeries22.getKey();
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener40);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener42);
        xYSeries39.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int49 = xYSeries39.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        xYSeries39.addPropertyChangeListener(propertyChangeListener50);
        xYSeries39.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem57 = xYSeries39.remove(1);
        xYSeries35.add(xYDataItem57);
        org.jfree.data.xy.XYSeries xYSeries61 = xYSeries35.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries35.remove(0);
        xYSeries22.add(xYDataItem63);
        xYSeries9.add(xYDataItem63, true);
        xYSeries4.add(xYDataItem63);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        xYSeries4.addPropertyChangeListener(propertyChangeListener68);
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + 0L + "'", comparable31, 0L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(xYDataItem57);
        org.junit.Assert.assertNotNull(xYSeries61);
        org.junit.Assert.assertNotNull(xYDataItem63);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        java.lang.Number number13 = xYSeries3.getX((int) (byte) 0);
        xYSeries3.add((double) (short) 1, (java.lang.Number) (byte) 0, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 1.0d + "'", number13, 1.0d);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (-1), (java.lang.Number) 1.0d, false);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener18);
        java.lang.Number number21 = xYSeries3.getY((int) (byte) 1);
        xYSeries3.setNotify(false);
        xYSeries3.add((double) (short) -1, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + number21 + "' != '" + (byte) 10 + "'", number21, (byte) 10);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries3.setDescription("hi!");
        int int22 = xYSeries3.getMaximumItemCount();
        xYSeries3.add((double) (-1), (java.lang.Number) (short) 100, false);
        xYSeries3.fireSeriesChanged();
        java.lang.String str28 = xYSeries3.getDescription();
        xYSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries3.remove((java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.remove(1);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21, false);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21, false);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false, true);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries32.add((double) 0.0f, 0.0d);
        xYSeries32.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean40 = xYSeries32.getAllowDuplicateXValues();
        xYSeries32.add(10.0d, (java.lang.Number) 0.0d);
        java.lang.Object obj44 = xYSeries32.clone();
        boolean boolean45 = xYSeries28.equals((java.lang.Object) xYSeries32);
        xYSeries32.add((double) 1, (double) '4', false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.util.List list20 = xYSeries17.getItems();
        xYSeries3.data = list20;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries3.addChangeListener(seriesChangeListener22);
        int int25 = xYSeries3.indexOf((java.lang.Number) (short) 10);
        int int26 = xYSeries3.getMaximumItemCount();
        java.lang.Number number27 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(number27, (java.lang.Number) (-1.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        double[][] doubleArray6 = xYSeries3.toArray();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener15);
        xYSeries12.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int22 = xYSeries12.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener23);
        xYSeries12.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries12.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        xYSeries12.addChangeListener(seriesChangeListener31);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener37);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener39);
        xYSeries36.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int46 = xYSeries36.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        xYSeries50.removePropertyChangeListener(propertyChangeListener51);
        java.util.List list53 = xYSeries50.getItems();
        xYSeries36.data = list53;
        xYSeries12.data = list53;
        java.util.List list56 = xYSeries12.getItems();
        xYSeries3.data = list56;
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(list56);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener12);
        xYSeries9.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int19 = xYSeries9.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries9.addPropertyChangeListener(propertyChangeListener20);
        xYSeries9.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries9.remove(1);
        xYSeries5.add(xYDataItem27);
        org.jfree.data.xy.XYSeries xYSeries31 = xYSeries5.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries5.remove(0);
        xYSeries1.add(xYDataItem33, false);
        xYSeries1.setMaximumItemCount(10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(xYDataItem27);
        org.junit.Assert.assertNotNull(xYSeries31);
        org.junit.Assert.assertNotNull(xYDataItem33);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true);
        java.util.List list3 = xYSeries2.data;
        xYSeries2.setNotify(false);
        xYSeries2.add((double) (short) 10, (double) (byte) -1);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        xYSeries1.setNotify(false);
        xYSeries1.fireSeriesChanged();
        boolean boolean9 = xYSeries1.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries13.add((double) 0.0f, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries13.addOrUpdate((-1.0d), (double) 10);
        java.util.List list20 = xYSeries13.data;
        xYSeries1.data = list20;
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.add((double) 'a', (double) 10.0f, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "", true);
        boolean boolean3 = xYSeries2.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.delete(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        int int4 = xYSeries2.indexOf((java.lang.Number) (-1L));
        xYSeries2.setNotify(true);
        java.util.List list7 = xYSeries2.getItems();
        boolean boolean8 = xYSeries2.getNotify();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        xYSeries3.fireSeriesChanged();
        java.util.List list28 = xYSeries3.getItems();
        java.lang.Object obj29 = xYSeries3.clone();
        int int30 = xYSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) (byte) 1, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        java.lang.String str4 = xYSeries3.getDescription();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries8.removePropertyChangeListener(propertyChangeListener9);
        java.util.List list11 = xYSeries8.getItems();
        xYSeries8.clear();
        xYSeries8.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener19);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener21);
        xYSeries18.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int28 = xYSeries18.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries18.addPropertyChangeListener(propertyChangeListener29);
        xYSeries18.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries18.remove(1);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem36, false);
        xYSeries8.add(xYDataItem36);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem36);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem36, false, true);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(xYDataItem36);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) -1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = xYSeries1.getY((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries4);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Object obj2 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries1.removeChangeListener(seriesChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener7);
        int int9 = xYSeries1.getItemCount();
        java.lang.String str10 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy((int) '4', (int) (byte) 10);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(xYSeries13);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        xYSeries1.delete((int) (byte) -1, (-2));
        java.lang.Class<?> wildcardClass5 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 'a', true, false);
        java.lang.Class<?> wildcardClass4 = xYSeries3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        boolean boolean27 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries3.addOrUpdate((double) (-1L), (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(xYDataItem30);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1);
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update(number2, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener9);
        xYSeries6.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray15 = xYSeries6.toArray();
        xYSeries6.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries6.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries6.remove((int) (short) 1);
        xYSeries1.add(xYDataItem23, true);
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (short) -1, true);
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries1.getDataItem(0);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener36);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener38);
        xYSeries35.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int45 = xYSeries35.indexOf((java.lang.Number) 0.0f);
        xYSeries35.add((double) (-1), (java.lang.Number) 1.0d, false);
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        xYSeries35.addPropertyChangeListener(propertyChangeListener50);
        java.lang.Number number53 = xYSeries35.getY((int) (byte) 1);
        java.lang.Comparable comparable54 = xYSeries35.getKey();
        boolean boolean55 = xYSeries1.equals((java.lang.Object) xYSeries35);
        int int56 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem59 = xYSeries1.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + number53 + "' != '" + (byte) 10 + "'", number53, (byte) 10);
        org.junit.Assert.assertEquals("'" + comparable54 + "' != '" + 0L + "'", comparable54, 0L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertNull(xYDataItem59);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete(2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        xYSeries3.fireSeriesChanged();
        boolean boolean15 = xYSeries3.getAutoSort();
        java.lang.Object obj16 = xYSeries3.clone();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        xYSeries1.setMaximumItemCount(0);
        xYSeries1.add((double) 10, (double) (-1), true);
        java.util.List list8 = xYSeries1.data;
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.setNotify(true);
        xYSeries3.add((double) 10, (java.lang.Number) 100);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.fireSeriesChanged();
        boolean boolean10 = xYSeries3.getAllowDuplicateXValues();
        int int12 = xYSeries3.indexOf((java.lang.Number) 10);
        boolean boolean13 = xYSeries3.getAutoSort();
        int int14 = xYSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        double[][] doubleArray16 = xYSeries3.toArray();
        xYSeries3.setKey((java.lang.Comparable) 100.0f);
        int int19 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 1, (java.lang.Number) (short) 1, true);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries3.addOrUpdate((double) 2, 100.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) (-1.0f), (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        int int9 = xYSeries3.indexOf((java.lang.Number) 10.0f);
        xYSeries3.add((java.lang.Number) 10, (java.lang.Number) (byte) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((java.lang.Number) (short) 10, (java.lang.Number) 0.0d, false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, false, true);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries3.setDescription("hi!");
        int int22 = xYSeries3.getMaximumItemCount();
        xYSeries3.add((double) (-1), (java.lang.Number) (short) 100, false);
        xYSeries3.fireSeriesChanged();
        xYSeries3.add(10.0d, (java.lang.Number) 1.0d);
        xYSeries3.setNotify(false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (-1L), (double) (byte) 1);
        xYSeries3.add((double) 2147483647, (double) 'a', true);
        boolean boolean19 = xYSeries3.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener23);
        xYSeries3.add((double) (short) 0, (double) 3);
        xYSeries3.setKey((java.lang.Comparable) (-1));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        xYSeries3.add(0.0d, (java.lang.Number) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = xYSeries3.getX(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add(10.0d, (java.lang.Number) 0.0d);
        java.lang.Number number16 = xYSeries3.getY(0);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener17);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener19);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 0.0d + "'", number16, 0.0d);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add(0.0d, (double) 1, true);
        int int17 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        xYSeries1.add((double) (byte) 10, (double) 0, false);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener12);
        xYSeries9.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray18 = xYSeries9.toArray();
        xYSeries9.add((double) 1, (java.lang.Number) (short) 1, true);
        int int24 = xYSeries9.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries28.add((double) 0.0f, 0.0d);
        xYSeries28.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean36 = xYSeries28.getAllowDuplicateXValues();
        xYSeries28.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener50);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener52);
        xYSeries49.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int59 = xYSeries49.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        xYSeries49.addPropertyChangeListener(propertyChangeListener60);
        xYSeries49.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem67 = xYSeries49.remove(1);
        xYSeries45.add(xYDataItem67);
        xYSeries41.add(xYDataItem67, false);
        xYSeries28.setKey((java.lang.Comparable) xYDataItem67);
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem67, false);
        xYSeries9.add(xYDataItem67);
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem67, true);
        xYSeries1.add(xYDataItem67, false);
        java.lang.Comparable comparable79 = xYSeries1.getKey();
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(xYDataItem67);
        org.junit.Assert.assertEquals("'" + comparable79 + "' != '" + '#' + "'", comparable79, '#');
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries29.addOrUpdate((double) (short) 100, (double) (byte) 1);
        xYSeries29.add((double) 0L, (java.lang.Number) 1.0d, false);
        boolean boolean37 = xYSeries29.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries29.addPropertyChangeListener(propertyChangeListener38);
        boolean boolean40 = xYSeries29.getAllowDuplicateXValues();
        xYSeries29.delete((int) (byte) 100, (int) (byte) 0);
        int int44 = xYSeries29.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries3.remove(0);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener32);
        int int35 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        xYSeries3.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.fireSeriesChanged();
        java.lang.Object obj3 = null;
        boolean boolean4 = xYSeries1.equals(obj3);
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        xYSeries8.add((double) 'a', (double) 100.0f);
        java.util.List list12 = xYSeries8.getItems();
        xYSeries1.data = list12;
        boolean boolean14 = xYSeries1.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries1.remove((java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 4, true, true);
        boolean boolean4 = xYSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 0, 1.0d, true);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries3.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) (byte) 100);
        xYSeries3.fireSeriesChanged();
        xYSeries3.add((double) 10.0f, (double) (-1L));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.delete((int) (byte) 10, 2);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries13.createCopy((int) (byte) 100, 3);
        int int17 = xYSeries16.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries20 = xYSeries16.createCopy((int) (byte) 1, (int) (short) 10);
        boolean boolean21 = xYSeries3.equals((java.lang.Object) (byte) 1);
        xYSeries3.add((java.lang.Number) (-2), (java.lang.Number) (-1.0d));
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (-1), (java.lang.Number) 1.0d, false);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries19.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries19.removeChangeListener(seriesChangeListener22);
        java.lang.String str24 = xYSeries19.getDescription();
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries28.setDescription("");
        java.lang.String str31 = xYSeries28.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries28.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries38.add((double) 0.0f, 0.0d);
        xYSeries38.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean46 = xYSeries38.getAllowDuplicateXValues();
        xYSeries38.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        xYSeries59.removePropertyChangeListener(propertyChangeListener60);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries59.removePropertyChangeListener(propertyChangeListener62);
        xYSeries59.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int69 = xYSeries59.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        xYSeries59.addPropertyChangeListener(propertyChangeListener70);
        xYSeries59.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem77 = xYSeries59.remove(1);
        xYSeries55.add(xYDataItem77);
        xYSeries51.add(xYDataItem77, false);
        xYSeries38.setKey((java.lang.Comparable) xYDataItem77);
        xYSeries28.add(xYDataItem77, true);
        xYSeries19.setKey((java.lang.Comparable) xYDataItem77);
        xYSeries3.add(xYDataItem77);
        xYSeries3.add((double) 10, (java.lang.Number) (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(xYDataItem34);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(xYDataItem77);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) -1);
        xYSeries3.add(100.0d, (java.lang.Number) (short) 100, false);
        boolean boolean19 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries3.addOrUpdate((double) (byte) 0, (double) (-1));
        xYSeries3.setMaximumItemCount((int) 'a');
        int int26 = xYSeries3.indexOf((java.lang.Number) (byte) 100);
        xYSeries3.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) -1);
        xYSeries3.add(100.0d, (java.lang.Number) (short) 100, false);
        boolean boolean19 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries3.addOrUpdate((double) (byte) 0, (double) (-1));
        xYSeries3.update((java.lang.Number) (short) 100, (java.lang.Number) 2147483647);
        java.lang.Number number27 = null;
        xYSeries3.add((java.lang.Number) 10.0f, number27);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, false);
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        boolean boolean5 = xYSeries2.equals((java.lang.Object) (-1.0d));
        int int6 = xYSeries2.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries2.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries15.add((double) 0.0f, 0.0d);
        xYSeries15.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean23 = xYSeries15.getAllowDuplicateXValues();
        xYSeries15.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener37);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener39);
        xYSeries36.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int46 = xYSeries36.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        xYSeries36.addPropertyChangeListener(propertyChangeListener47);
        xYSeries36.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries36.remove(1);
        xYSeries32.add(xYDataItem54);
        xYSeries28.add(xYDataItem54, false);
        xYSeries15.setKey((java.lang.Comparable) xYDataItem54);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem54, false);
        xYSeries3.add(xYDataItem54, false);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem54, true);
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(xYDataItem54);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.remove(1);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21, false);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21, false);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false, true);
        xYSeries28.add((java.lang.Number) (-1), (java.lang.Number) 100);
        xYSeries28.add((java.lang.Number) (byte) -1, (java.lang.Number) 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener25);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener27);
        xYSeries24.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int34 = xYSeries24.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries24.addPropertyChangeListener(propertyChangeListener35);
        xYSeries24.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries24.remove(1);
        xYSeries20.add(xYDataItem42);
        xYSeries16.add(xYDataItem42, false);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem42);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem42, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        xYSeries48.removeChangeListener(seriesChangeListener49);
        int int51 = xYSeries48.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        boolean boolean7 = xYSeries3.isEmpty();
        xYSeries3.add((double) (byte) 100, 10.0d);
        xYSeries3.add((double) (byte) 1, (java.lang.Number) (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) 1, (int) 'a');
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener15);
        xYSeries12.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int22 = xYSeries12.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener23);
        xYSeries12.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries12.remove(1);
        xYSeries8.add(xYDataItem30);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, false);
        xYSeries1.add(xYDataItem30);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, false);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number39 = xYSeries37.getY((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries29.addOrUpdate((double) (short) 100, (double) (byte) 1);
        xYSeries29.setMaximumItemCount(1);
        xYSeries29.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        xYSeries1.add((double) (byte) 10, (double) 0, false);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener12);
        xYSeries9.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray18 = xYSeries9.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries9.getDataItem((int) (short) 0);
        xYSeries1.add(xYDataItem20, true);
        xYSeries1.add((double) (byte) -1, (java.lang.Number) 0.0d, true);
        xYSeries1.add((double) (byte) 100, (java.lang.Number) 0);
        java.lang.String str30 = xYSeries1.getDescription();
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) 1, (int) 'a');
        java.util.List list5 = xYSeries4.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries9.add((double) 0.0f, 0.0d);
        xYSeries9.add((double) (short) 100, (java.lang.Number) (-1L), true);
        xYSeries9.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener23);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener25);
        xYSeries22.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable31 = xYSeries22.getKey();
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener40);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener42);
        xYSeries39.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int49 = xYSeries39.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        xYSeries39.addPropertyChangeListener(propertyChangeListener50);
        xYSeries39.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem57 = xYSeries39.remove(1);
        xYSeries35.add(xYDataItem57);
        org.jfree.data.xy.XYSeries xYSeries61 = xYSeries35.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries35.remove(0);
        xYSeries22.add(xYDataItem63);
        xYSeries9.add(xYDataItem63, true);
        xYSeries4.add(xYDataItem63);
        org.jfree.data.xy.XYSeries xYSeries70 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem63, true, true);
        xYSeries70.add((java.lang.Number) 1.0d, (java.lang.Number) 0L);
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + 0L + "'", comparable31, 0L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(xYDataItem57);
        org.junit.Assert.assertNotNull(xYSeries61);
        org.junit.Assert.assertNotNull(xYDataItem63);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries3.addChangeListener(seriesChangeListener22);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener28);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener30);
        xYSeries27.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int37 = xYSeries27.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries41.removePropertyChangeListener(propertyChangeListener42);
        java.util.List list44 = xYSeries41.getItems();
        xYSeries27.data = list44;
        xYSeries3.data = list44;
        org.jfree.data.xy.XYSeries xYSeries49 = xYSeries3.createCopy((int) (byte) -1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number51 = xYSeries3.getX(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(xYSeries49);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable12 = xYSeries3.getKey();
        java.lang.Number number14 = xYSeries3.getX((int) (short) 0);
        int int15 = xYSeries3.getItemCount();
        xYSeries3.add((java.lang.Number) 0, (java.lang.Number) (byte) 0);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (byte) 0 + "'", number14, (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        java.lang.Comparable comparable27 = xYSeries3.getKey();
        xYSeries3.add((java.lang.Number) 10, (java.lang.Number) 0.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + true + "'", comparable27, true);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        xYSeries1.setNotify(false);
        int int8 = xYSeries1.getMaximumItemCount();
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) -1 + "'", comparable9, (short) -1);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) -1);
        xYSeries3.add((java.lang.Number) 0L, (java.lang.Number) 0L);
        xYSeries3.add((double) 10, (java.lang.Number) (-1.0f));
        java.lang.Number number22 = xYSeries3.getY(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries3.addOrUpdate((java.lang.Number) 10, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -2, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 0L + "'", number22, 0L);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries3.addChangeListener(seriesChangeListener22);
        boolean boolean24 = xYSeries3.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = xYSeries3.getX(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        java.lang.Comparable comparable3 = xYSeries2.getKey();
        xYSeries2.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable8 = xYSeries7.getKey();
        xYSeries7.clear();
        xYSeries7.add((double) (-1.0f), (double) (short) 10, false);
        java.lang.Number number15 = null;
        xYSeries7.add((double) 0L, number15, false);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        java.lang.String str22 = xYSeries21.getDescription();
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener27);
        java.util.List list29 = xYSeries26.getItems();
        xYSeries26.clear();
        xYSeries26.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener37);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener39);
        xYSeries36.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int46 = xYSeries36.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        xYSeries36.addPropertyChangeListener(propertyChangeListener47);
        xYSeries36.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries36.remove(1);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem54, false);
        xYSeries26.add(xYDataItem54);
        xYSeries21.setKey((java.lang.Comparable) xYDataItem54);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem54);
        xYSeries7.add(xYDataItem54);
        xYSeries2.add(xYDataItem54, false);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (-1.0d) + "'", comparable3, (-1.0d));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + '#' + "'", comparable8, '#');
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(xYDataItem54);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        java.lang.String str7 = xYSeries3.getDescription();
        java.lang.Class<?> wildcardClass8 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.fireSeriesChanged();
        double[][] doubleArray10 = xYSeries3.toArray();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem3 = xYSeries1.remove(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries29.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener37);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener39);
        xYSeries36.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries36.remove((int) (byte) 0);
        xYSeries29.setKey((java.lang.Comparable) (byte) 0);
        xYSeries29.add(0.0d, (java.lang.Number) 0, false);
        int int51 = xYSeries29.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries6.addOrUpdate((java.lang.Number) (short) -1, (java.lang.Number) 0L);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener16);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener22);
        java.util.List list24 = xYSeries21.getItems();
        xYSeries13.data = list24;
        xYSeries13.setMaximumItemCount((int) (short) 0);
        java.lang.Class<?> wildcardClass28 = xYSeries13.getClass();
        boolean boolean29 = xYSeries6.equals((java.lang.Object) wildcardClass28);
        java.util.List list30 = xYSeries6.getItems();
        xYSeries6.add((java.lang.Number) 4, (java.lang.Number) 0);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "", true);
        int int3 = xYSeries2.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries2.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries3.removeChangeListener(seriesChangeListener22);
        xYSeries3.clear();
        java.lang.Comparable comparable25 = xYSeries3.getKey();
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-5908509288197150436L));
        java.lang.Class<?> wildcardClass29 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + 0L + "'", comparable25, 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries14.setNotify(false);
        boolean boolean17 = xYSeries14.getNotify();
        java.lang.String str18 = xYSeries14.getDescription();
        boolean boolean19 = xYSeries3.equals((java.lang.Object) xYSeries14);
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries3.createCopy((int) (byte) 10, (int) (short) -1);
        xYSeries3.updateByIndex((int) (byte) 0, (java.lang.Number) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        java.lang.String str7 = xYSeries3.getDescription();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener20);
        xYSeries17.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray26 = xYSeries17.toArray();
        xYSeries17.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries17.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries17.remove((int) (short) 1);
        xYSeries11.add(xYDataItem34);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem34, true, false);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem34);
        xYSeries3.add((double) 0, (double) (short) 0, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex(2147483647, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(xYDataItem34);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((double) 1L, (double) 100.0f);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (short) 0);
        boolean boolean14 = xYSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((double) 1.0f, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.add((double) 1, 100.0d, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (-1), (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries5.removePropertyChangeListener(propertyChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries5.removePropertyChangeListener(propertyChangeListener8);
        xYSeries5.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int15 = xYSeries5.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries5.addPropertyChangeListener(propertyChangeListener16);
        xYSeries5.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries5.setDescription("hi!");
        int int24 = xYSeries5.getMaximumItemCount();
        boolean boolean25 = xYSeries1.equals((java.lang.Object) xYSeries5);
        xYSeries5.add((double) (byte) 10, (double) (-1.0f));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        xYSeries5.removeChangeListener(seriesChangeListener29);
        xYSeries5.setNotify(false);
        xYSeries5.add((java.lang.Number) 3, (java.lang.Number) 0, true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener19);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener21);
        xYSeries18.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        java.util.List list27 = xYSeries18.data;
        xYSeries3.data = list27;
        java.lang.Comparable comparable29 = xYSeries3.getKey();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + 0L + "'", comparable29, 0L);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) -1);
        xYSeries3.add((java.lang.Number) 0L, (java.lang.Number) 0L);
        java.lang.Comparable comparable18 = xYSeries3.getKey();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener19);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 10L, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 0L + "'", comparable18, 0L);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries3.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries3.remove((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries3.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener13);
        java.lang.Comparable comparable15 = xYSeries10.getKey();
        java.lang.Object obj16 = xYSeries10.clone();
        java.util.List list17 = xYSeries10.data;
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries21.add((double) 0.0f, 0.0d);
        xYSeries21.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean29 = xYSeries21.getAllowDuplicateXValues();
        xYSeries21.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries42.removePropertyChangeListener(propertyChangeListener43);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries42.removePropertyChangeListener(propertyChangeListener45);
        xYSeries42.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int52 = xYSeries42.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        xYSeries42.addPropertyChangeListener(propertyChangeListener53);
        xYSeries42.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries42.remove(1);
        xYSeries38.add(xYDataItem60);
        xYSeries34.add(xYDataItem60, false);
        xYSeries21.setKey((java.lang.Comparable) xYDataItem60);
        xYSeries10.add(xYDataItem60);
        xYSeries3.add(xYDataItem60);
        java.lang.String str67 = xYSeries3.getDescription();
        xYSeries3.setKey((java.lang.Comparable) (byte) 0);
        xYSeries3.setNotify(false);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0L + "'", comparable15, 0L);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(xYDataItem60);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries29.addOrUpdate((double) (short) 100, (double) (byte) 1);
        xYSeries29.add((double) 0L, (java.lang.Number) 1.0d, false);
        boolean boolean37 = xYSeries29.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries29.addPropertyChangeListener(propertyChangeListener38);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries29.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        int int14 = xYSeries3.getItemCount();
        xYSeries3.setNotify(false);
        boolean boolean17 = xYSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex(3, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', false, false);
        java.util.List list4 = xYSeries3.data;
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener5);
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries8.createCopy((int) (short) -1, (int) '#');
        boolean boolean12 = xYSeries3.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.util.List list20 = xYSeries17.getItems();
        xYSeries3.data = list20;
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener26);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener28);
        xYSeries25.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int35 = xYSeries25.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener40);
        java.util.List list42 = xYSeries39.getItems();
        xYSeries25.data = list42;
        xYSeries3.data = list42;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener45 = null;
        xYSeries3.addChangeListener(seriesChangeListener45);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(list42);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.setNotify(false);
        xYSeries3.add((double) 10, (double) 'a', false);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries15.createCopy((int) (short) 1, (int) 'a');
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener27);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener29);
        xYSeries26.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int36 = xYSeries26.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries26.addPropertyChangeListener(propertyChangeListener37);
        xYSeries26.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries26.remove(1);
        xYSeries22.add(xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44, false);
        xYSeries15.add(xYDataItem44);
        xYSeries3.add(xYDataItem44);
        java.lang.Object obj50 = xYSeries3.clone();
        java.lang.String str51 = xYSeries3.getDescription();
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        xYSeries3.add(10.0d, (java.lang.Number) (-1.0d));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.addChangeListener(seriesChangeListener9);
        java.lang.Object obj11 = xYSeries3.clone();
        xYSeries3.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries3.remove((java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        int int12 = xYSeries3.indexOf((java.lang.Number) (-2));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries3.addChangeListener(seriesChangeListener13);
        xYSeries3.setDescription("");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        boolean boolean12 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((java.lang.Number) (short) 1, (java.lang.Number) (short) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries3.remove((java.lang.Number) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries3.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem18);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        xYSeries1.setNotify(false);
        int int8 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray9 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = xYSeries1.getX((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries3.setDescription("hi!");
        xYSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries3.remove(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        double[][] doubleArray4 = xYSeries3.toArray();
        java.lang.Comparable comparable5 = xYSeries3.getKey();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (-1L) + "'", comparable5, (-1L));
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries5.removePropertyChangeListener(propertyChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries5.removePropertyChangeListener(propertyChangeListener8);
        xYSeries5.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int15 = xYSeries5.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries5.addPropertyChangeListener(propertyChangeListener16);
        xYSeries5.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries5.setDescription("hi!");
        int int24 = xYSeries5.getMaximumItemCount();
        boolean boolean25 = xYSeries1.equals((java.lang.Object) xYSeries5);
        xYSeries1.add((double) (-1.0f), 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (byte) 100, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (-1), (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) -1);
        xYSeries3.add((java.lang.Number) 0L, (java.lang.Number) 0L);
        xYSeries3.add((double) 10, (java.lang.Number) (-1.0f));
        java.lang.Object obj21 = xYSeries3.clone();
        xYSeries3.setDescription("hi!");
        double[][] doubleArray24 = xYSeries3.toArray();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        boolean boolean12 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((java.lang.Number) (short) 1, (java.lang.Number) (short) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries3.remove((java.lang.Number) 1.0d);
        xYSeries3.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem18);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        boolean boolean2 = xYSeries1.getAllowDuplicateXValues();
        int int3 = xYSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = xYSeries1.getY((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        int int10 = xYSeries3.getItemCount();
        boolean boolean11 = xYSeries3.isEmpty();
        int int12 = xYSeries3.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries3.createCopy((int) (short) -1, 4);
        xYSeries3.add((double) '4', (double) '4', true);
        java.lang.String str20 = xYSeries3.getDescription();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.setNotify(false);
        xYSeries3.add((double) 10, (double) 'a', false);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries15.createCopy((int) (short) 1, (int) 'a');
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener27);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener29);
        xYSeries26.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int36 = xYSeries26.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries26.addPropertyChangeListener(propertyChangeListener37);
        xYSeries26.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries26.remove(1);
        xYSeries22.add(xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44, false);
        xYSeries15.add(xYDataItem44);
        xYSeries3.add(xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44, true);
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(xYDataItem44);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        double[][] doubleArray16 = xYSeries3.toArray();
        xYSeries3.add((double) (short) 100, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.remove((java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true);
        boolean boolean3 = xYSeries2.getAutoSort();
        xYSeries2.add((double) (byte) 100, (double) 1L, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.updateByIndex(3, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener12);
        xYSeries9.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray18 = xYSeries9.toArray();
        xYSeries9.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries9.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries9.remove((int) (short) 1);
        xYSeries3.add(xYDataItem26);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem26, true, false);
        xYSeries30.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener41);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener43);
        xYSeries40.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int50 = xYSeries40.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        xYSeries40.addPropertyChangeListener(propertyChangeListener51);
        xYSeries40.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries40.remove(1);
        xYSeries36.add(xYDataItem58);
        org.jfree.data.xy.XYSeries xYSeries62 = xYSeries36.createCopy(100, 1);
        xYSeries62.add((java.lang.Number) 0, (java.lang.Number) 1);
        java.util.List list66 = xYSeries62.getItems();
        xYSeries30.data = list66;
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertNotNull(xYSeries62);
        org.junit.Assert.assertNotNull(list66);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            xYSeries4.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries4);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable12 = xYSeries3.getKey();
        xYSeries3.setNotify(true);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = xYSeries1.getY((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", true, true);
        xYSeries3.setMaximumItemCount((int) ' ');
        xYSeries3.fireSeriesChanged();
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(0, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.util.List list14 = xYSeries11.getItems();
        xYSeries3.data = list14;
        boolean boolean16 = xYSeries3.getAllowDuplicateXValues();
        boolean boolean17 = xYSeries3.getNotify();
        xYSeries3.setDescription("");
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        org.jfree.data.xy.XYSeries xYSeries24 = xYSeries3.createCopy((int) (byte) 100, (int) (byte) 10);
        boolean boolean25 = xYSeries24.getAllowDuplicateXValues();
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(xYSeries24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        java.lang.String str6 = xYSeries3.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100);
        xYSeries3.setKey((java.lang.Comparable) "hi!");
        xYSeries3.setDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(xYDataItem9);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.remove(1);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21, false);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21, false);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false, true);
        xYSeries28.add((java.lang.Number) (-1), (java.lang.Number) 100);
        xYSeries28.setNotify(true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries2.createCopy(2, (int) ' ');
        xYSeries2.setDescription("hi!");
        int int8 = xYSeries2.getMaximumItemCount();
        xYSeries2.add((double) 0.0f, (double) 4);
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        int int7 = xYSeries6.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener18);
        xYSeries15.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int25 = xYSeries15.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries15.addPropertyChangeListener(propertyChangeListener26);
        xYSeries15.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries15.remove(1);
        xYSeries11.add(xYDataItem33);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem33, false);
        xYSeries6.add(xYDataItem33);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem33, true);
        java.lang.Class<?> wildcardClass40 = xYSeries39.getClass();
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = xYSeries1.getY(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAutoSort();
        boolean boolean12 = xYSeries3.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) '4', (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener12);
        xYSeries9.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int19 = xYSeries9.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries9.addPropertyChangeListener(propertyChangeListener20);
        xYSeries9.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries9.remove(1);
        xYSeries5.add(xYDataItem27);
        xYSeries1.add(xYDataItem27, false);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true, false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(xYDataItem27);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener9);
        xYSeries6.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray15 = xYSeries6.toArray();
        xYSeries6.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries6.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries6.remove((int) (short) 1);
        xYSeries1.add(xYDataItem23, true);
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (short) -1, true);
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries1.getDataItem(0);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener32);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertNotNull(xYDataItem31);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.clear();
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener16);
        xYSeries13.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int23 = xYSeries13.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries13.addPropertyChangeListener(propertyChangeListener24);
        xYSeries13.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries13.remove(1);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem31, false);
        xYSeries3.add(xYDataItem31);
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries3.remove((java.lang.Number) 0);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertNotNull(xYDataItem36);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L);
        double[][] doubleArray2 = xYSeries1.toArray();
        xYSeries1.add(100.0d, (double) '#');
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries3.addChangeListener(seriesChangeListener22);
        xYSeries3.setMaximumItemCount((int) (byte) 1);
        java.util.List list26 = xYSeries3.data;
        int int27 = xYSeries3.getItemCount();
        java.lang.Object obj28 = xYSeries3.clone();
        xYSeries3.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 0, false, false);
        xYSeries15.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener17);
        xYSeries15.fireSeriesChanged();
        xYSeries15.add((double) '4', (java.lang.Number) 0);
        org.junit.Assert.assertNotNull(xYDataItem12);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true);
        java.util.List list3 = xYSeries2.data;
        xYSeries2.add((java.lang.Number) 2, (java.lang.Number) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0f, false);
        xYSeries9.setMaximumItemCount((int) (byte) 10);
        xYSeries9.add((double) '4', (double) (byte) 10);
        boolean boolean15 = xYSeries9.getNotify();
        boolean boolean16 = xYSeries2.equals((java.lang.Object) boolean15);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        int int12 = xYSeries3.indexOf((java.lang.Number) (-2));
        xYSeries3.add((double) (byte) 0, (java.lang.Number) 1.0f);
        int int16 = xYSeries3.getItemCount();
        xYSeries3.setMaximumItemCount((int) (short) 1);
        xYSeries3.add((double) (-1), 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2, false, false);
        xYSeries3.setDescription("hi!");
        xYSeries3.setNotify(true);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", true, true);
        xYSeries3.setDescription("hi!");
        boolean boolean6 = xYSeries3.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries3.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) 100, 3);
        xYSeries3.add(1.0d, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.remove((java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(10, (-1));
        boolean boolean10 = xYSeries3.getAutoSort();
        java.lang.Object obj11 = xYSeries3.clone();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries(comparable0, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        java.lang.String str4 = xYSeries3.getDescription();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries8.removePropertyChangeListener(propertyChangeListener9);
        java.util.List list11 = xYSeries8.getItems();
        xYSeries8.clear();
        xYSeries8.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener19);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener21);
        xYSeries18.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int28 = xYSeries18.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries18.addPropertyChangeListener(propertyChangeListener29);
        xYSeries18.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries18.remove(1);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem36, false);
        xYSeries8.add(xYDataItem36);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem36);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem36);
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries41.addOrUpdate((java.lang.Number) (byte) -1, (java.lang.Number) 1L);
        xYSeries41.delete(1, 0);
        xYSeries41.delete(4, 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertNull(xYDataItem44);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        xYSeries3.add(0.0d, (java.lang.Number) 1.0d);
        java.lang.Object obj9 = xYSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries3.getY(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries5.removePropertyChangeListener(propertyChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries5.removePropertyChangeListener(propertyChangeListener8);
        xYSeries5.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int15 = xYSeries5.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries5.addPropertyChangeListener(propertyChangeListener16);
        xYSeries5.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries5.setDescription("hi!");
        int int24 = xYSeries5.getMaximumItemCount();
        boolean boolean25 = xYSeries1.equals((java.lang.Object) xYSeries5);
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries5.addOrUpdate((java.lang.Number) 1, (java.lang.Number) 100.0f);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries32.add((double) 0.0f, 0.0d);
        xYSeries32.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean40 = xYSeries32.getAllowDuplicateXValues();
        xYSeries32.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries53.removePropertyChangeListener(propertyChangeListener54);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries53.removePropertyChangeListener(propertyChangeListener56);
        xYSeries53.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int63 = xYSeries53.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        xYSeries53.addPropertyChangeListener(propertyChangeListener64);
        xYSeries53.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem71 = xYSeries53.remove(1);
        xYSeries49.add(xYDataItem71);
        xYSeries45.add(xYDataItem71, false);
        xYSeries32.setKey((java.lang.Comparable) xYDataItem71);
        xYSeries5.setKey((java.lang.Comparable) xYDataItem71);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem71, false, false);
        org.jfree.data.xy.XYSeries xYSeries81 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(xYDataItem71);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        java.lang.String str7 = xYSeries3.getDescription();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener20);
        xYSeries17.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray26 = xYSeries17.toArray();
        xYSeries17.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries17.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries17.remove((int) (short) 1);
        xYSeries11.add(xYDataItem34);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem34, true, false);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem34);
        xYSeries3.add((java.lang.Number) (byte) -1, (java.lang.Number) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(xYDataItem34);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries14.setNotify(false);
        boolean boolean17 = xYSeries14.getNotify();
        java.lang.String str18 = xYSeries14.getDescription();
        boolean boolean19 = xYSeries3.equals((java.lang.Object) xYSeries14);
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries3.createCopy((int) (byte) 10, (int) (short) -1);
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener29);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener31);
        xYSeries28.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int38 = xYSeries28.indexOf((java.lang.Number) 0.0f);
        xYSeries28.add((double) (-1), (java.lang.Number) 1.0d, false);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries28.addPropertyChangeListener(propertyChangeListener43);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries49 = xYSeries46.createCopy((int) (short) 1, (int) 'a');
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries57.removePropertyChangeListener(propertyChangeListener58);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        xYSeries57.removePropertyChangeListener(propertyChangeListener60);
        xYSeries57.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int67 = xYSeries57.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        xYSeries57.addPropertyChangeListener(propertyChangeListener68);
        xYSeries57.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem75 = xYSeries57.remove(1);
        xYSeries53.add(xYDataItem75);
        org.jfree.data.xy.XYSeries xYSeries78 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem75, false);
        xYSeries46.add(xYDataItem75);
        xYSeries28.setKey((java.lang.Comparable) xYDataItem75);
        xYSeries3.add(xYDataItem75, false);
        java.lang.Class<?> wildcardClass83 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(xYSeries49);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(xYDataItem75);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L);
        boolean boolean2 = xYSeries1.getAllowDuplicateXValues();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        java.lang.Number number5 = null;
        xYSeries1.add((java.lang.Number) (-2), number5, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 10L + "'", comparable3, 10L);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        java.lang.Object obj6 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        java.lang.String str6 = xYSeries3.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.addChangeListener(seriesChangeListener7);
        java.util.List list9 = xYSeries3.getItems();
        boolean boolean10 = xYSeries3.getNotify();
        boolean boolean11 = xYSeries3.getNotify();
        xYSeries3.setMaximumItemCount(1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries3.removeChangeListener(seriesChangeListener14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.addChangeListener(seriesChangeListener9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.setNotify(false);
        xYSeries3.add((double) 10, (double) 'a', false);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries15.createCopy((int) (short) 1, (int) 'a');
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener27);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener29);
        xYSeries26.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int36 = xYSeries26.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries26.addPropertyChangeListener(propertyChangeListener37);
        xYSeries26.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries26.remove(1);
        xYSeries22.add(xYDataItem44);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44, false);
        xYSeries15.add(xYDataItem44);
        xYSeries3.add(xYDataItem44);
        java.lang.Object obj50 = xYSeries3.clone();
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener51);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener53);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number56 = xYSeries3.getX(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.remove(1);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21);
        boolean boolean23 = xYSeries22.getAutoSort();
        xYSeries22.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries22.update((java.lang.Number) 100L, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        double[][] doubleArray16 = xYSeries3.toArray();
        int int18 = xYSeries3.indexOf((java.lang.Number) 0.0d);
        java.lang.Class<?> wildcardClass19 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.util.List list20 = xYSeries17.getItems();
        xYSeries3.data = list20;
        xYSeries3.fireSeriesChanged();
        double[][] doubleArray23 = xYSeries3.toArray();
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries30 = xYSeries27.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries27.createCopy(0, (int) (short) -1);
        boolean boolean34 = xYSeries3.equals((java.lang.Object) xYSeries33);
        java.util.List list35 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries39.setDescription("hi!");
        xYSeries39.setMaximumItemCount(100);
        xYSeries39.setNotify(false);
        xYSeries39.add((double) 10, (double) 'a', false);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries54 = xYSeries51.createCopy((int) (short) 1, (int) 'a');
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        xYSeries62.removePropertyChangeListener(propertyChangeListener63);
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        xYSeries62.removePropertyChangeListener(propertyChangeListener65);
        xYSeries62.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int72 = xYSeries62.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        xYSeries62.addPropertyChangeListener(propertyChangeListener73);
        xYSeries62.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem80 = xYSeries62.remove(1);
        xYSeries58.add(xYDataItem80);
        org.jfree.data.xy.XYSeries xYSeries83 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem80, false);
        xYSeries51.add(xYDataItem80);
        xYSeries39.add(xYDataItem80);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(xYDataItem80);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(xYSeries30);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(xYSeries54);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(xYDataItem80);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 4, true, true);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 4 + "'", comparable4, 4);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        xYSeries1.setMaximumItemCount((int) (byte) 0);
        java.util.List list4 = xYSeries1.getItems();
        int int6 = xYSeries1.indexOf((java.lang.Number) 1);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        xYSeries1.setKey((java.lang.Comparable) 2);
        java.lang.String str7 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2, false, false);
        java.lang.Comparable comparable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setKey(comparable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        java.lang.Comparable comparable3 = xYSeries2.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = xYSeries2.getY((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (-1.0d) + "'", comparable3, (-1.0d));
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.add((java.lang.Number) (short) -1, (java.lang.Number) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 10.0f, (java.lang.Number) (-5908509288197150436L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        double[][] doubleArray12 = xYSeries3.toArray();
        java.lang.Number number13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = xYSeries3.indexOf(number13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (-1L), (double) (byte) 1);
        xYSeries3.add((double) 2147483647, (double) 'a', true);
        boolean boolean19 = xYSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries5.removePropertyChangeListener(propertyChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries5.removePropertyChangeListener(propertyChangeListener8);
        xYSeries5.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int15 = xYSeries5.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries5.addPropertyChangeListener(propertyChangeListener16);
        xYSeries5.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries5.setDescription("hi!");
        int int24 = xYSeries5.getMaximumItemCount();
        boolean boolean25 = xYSeries1.equals((java.lang.Object) xYSeries5);
        xYSeries1.add((double) (-1.0f), 0.0d);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener29);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries33 = xYSeries1.createCopy((int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) 1, (int) 'a');
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener15);
        xYSeries12.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int22 = xYSeries12.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener23);
        xYSeries12.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries12.remove(1);
        xYSeries8.add(xYDataItem30);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, false);
        xYSeries1.add(xYDataItem30);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, false);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries39.delete((int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.removeChangeListener(seriesChangeListener9);
        xYSeries3.fireSeriesChanged();
        xYSeries3.setDescription("hi!");
        xYSeries3.add((double) (short) 100, (double) 1);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        xYSeries3.add((double) (short) 0, (java.lang.Number) 0, true);
        boolean boolean16 = xYSeries3.getNotify();
        java.lang.Class<?> wildcardClass17 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.util.List list14 = xYSeries11.getItems();
        xYSeries3.data = list14;
        boolean boolean16 = xYSeries3.getAllowDuplicateXValues();
        boolean boolean17 = xYSeries3.getNotify();
        xYSeries3.setDescription("");
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries3.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 0, 1.0d, true);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries3.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) (byte) 100);
        xYSeries3.fireSeriesChanged();
        xYSeries3.add((double) (short) 0, (java.lang.Number) 2);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener28);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener30);
        xYSeries27.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int37 = xYSeries27.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries27.addPropertyChangeListener(propertyChangeListener38);
        xYSeries27.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries27.setDescription("hi!");
        xYSeries27.setNotify(false);
        boolean boolean48 = xYSeries27.getAllowDuplicateXValues();
        org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries27.remove(0);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem50);
        xYSeries3.add((double) 0, (double) '4');
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xYDataItem50);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true, true);
        int int4 = xYSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        int int4 = xYSeries2.indexOf((java.lang.Number) (-1L));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries2.removeChangeListener(seriesChangeListener5);
        int int7 = xYSeries2.getMaximumItemCount();
        java.util.List list8 = xYSeries2.data;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(100, 1);
        xYSeries3.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener32);
        boolean boolean34 = xYSeries3.getNotify();
        xYSeries3.add((java.lang.Number) 10.0f, (java.lang.Number) 100.0f);
        xYSeries3.add((java.lang.Number) 3, (java.lang.Number) (short) 100, true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        java.lang.Comparable comparable13 = xYSeries3.getKey();
        xYSeries3.add((double) (-5908509288197150436L), (java.lang.Number) (-1));
        int int17 = xYSeries3.getItemCount();
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (byte) -1);
        xYSeries3.setMaximumItemCount(2147483647);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 0L + "'", comparable13, 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 0, false, false);
        xYSeries15.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries15.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYDataItem12);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries3.setKey((java.lang.Comparable) 10.0f);
        xYSeries3.add((java.lang.Number) (byte) 10, (java.lang.Number) 0, false);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener27);
        java.util.List list29 = xYSeries26.getItems();
        xYSeries26.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener36);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener38);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries43.removePropertyChangeListener(propertyChangeListener44);
        java.util.List list46 = xYSeries43.getItems();
        xYSeries35.data = list46;
        xYSeries26.data = list46;
        xYSeries3.data = list46;
        org.jfree.data.xy.XYSeries xYSeries52 = xYSeries3.createCopy((int) (byte) -1, (int) '4');
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        xYSeries52.addPropertyChangeListener(propertyChangeListener53);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(xYSeries52);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAutoSort();
        boolean boolean12 = xYSeries3.getAutoSort();
        boolean boolean13 = xYSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (-1L), (double) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int20 = xYSeries18.indexOf((java.lang.Number) (byte) -1);
        xYSeries18.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries24 = xYSeries18.createCopy(10, (-1));
        boolean boolean25 = xYSeries24.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries27.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        xYSeries27.removeChangeListener(seriesChangeListener30);
        java.lang.String str32 = xYSeries27.getDescription();
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries36.setDescription("");
        java.lang.String str39 = xYSeries36.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries36.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries46.add((double) 0.0f, 0.0d);
        xYSeries46.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean54 = xYSeries46.getAllowDuplicateXValues();
        xYSeries46.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        xYSeries67.removePropertyChangeListener(propertyChangeListener68);
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        xYSeries67.removePropertyChangeListener(propertyChangeListener70);
        xYSeries67.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int77 = xYSeries67.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener78 = null;
        xYSeries67.addPropertyChangeListener(propertyChangeListener78);
        xYSeries67.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem85 = xYSeries67.remove(1);
        xYSeries63.add(xYDataItem85);
        xYSeries59.add(xYDataItem85, false);
        xYSeries46.setKey((java.lang.Comparable) xYDataItem85);
        xYSeries36.add(xYDataItem85, true);
        xYSeries27.setKey((java.lang.Comparable) xYDataItem85);
        xYSeries24.add(xYDataItem85, false);
        xYSeries3.add(xYDataItem85, false);
        org.jfree.data.xy.XYDataItem xYDataItem99 = xYSeries3.addOrUpdate(100.0d, (double) 'a');
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(xYSeries24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(xYDataItem42);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(xYDataItem85);
        org.junit.Assert.assertNull(xYDataItem99);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries3.setKey((java.lang.Comparable) 10.0f);
        xYSeries3.add((java.lang.Number) (byte) 10, (java.lang.Number) 0, false);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener27);
        java.util.List list29 = xYSeries26.getItems();
        xYSeries26.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener36);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener38);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries43.removePropertyChangeListener(propertyChangeListener44);
        java.util.List list46 = xYSeries43.getItems();
        xYSeries35.data = list46;
        xYSeries26.data = list46;
        xYSeries3.data = list46;
        org.jfree.data.xy.XYSeries xYSeries52 = xYSeries3.createCopy((int) (byte) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            xYSeries52.update((java.lang.Number) (short) 0, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(xYSeries52);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        xYSeries1.add((double) (byte) 10, (double) 0, false);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener12);
        xYSeries9.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray18 = xYSeries9.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries9.getDataItem((int) (short) 0);
        xYSeries1.add(xYDataItem20, true);
        xYSeries1.add((double) (byte) -1, (java.lang.Number) 0.0d, true);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener27);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries1.remove((java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable12 = xYSeries3.getKey();
        java.lang.Number number14 = xYSeries3.getX((int) (short) 0);
        int int15 = xYSeries3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener16);
        java.lang.String str18 = xYSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) (-2), (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -2");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (byte) 0 + "'", number14, (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.util.List list20 = xYSeries17.getItems();
        xYSeries3.data = list20;
        java.lang.Comparable comparable22 = xYSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries3.addOrUpdate((double) (-1L), (double) (-5908509288197150436L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + 0L + "'", comparable22, 0L);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener12);
        xYSeries9.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int19 = xYSeries9.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries9.addPropertyChangeListener(propertyChangeListener20);
        xYSeries9.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries9.remove(1);
        xYSeries5.add(xYDataItem27);
        org.jfree.data.xy.XYSeries xYSeries31 = xYSeries5.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries5.remove(0);
        xYSeries1.add(xYDataItem33, false);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(xYDataItem27);
        org.junit.Assert.assertNotNull(xYSeries31);
        org.junit.Assert.assertNotNull(xYDataItem33);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        boolean boolean12 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((java.lang.Number) (short) 1, (java.lang.Number) (short) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries3.remove((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener23);
        java.util.List list25 = xYSeries22.getItems();
        xYSeries22.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean30 = xYSeries22.getAllowDuplicateXValues();
        int int32 = xYSeries22.indexOf((java.lang.Number) 2);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries36.setDescription("");
        java.lang.String str39 = xYSeries36.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries36.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries46.add((double) 0.0f, 0.0d);
        xYSeries46.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean54 = xYSeries46.getAllowDuplicateXValues();
        xYSeries46.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        xYSeries67.removePropertyChangeListener(propertyChangeListener68);
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        xYSeries67.removePropertyChangeListener(propertyChangeListener70);
        xYSeries67.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int77 = xYSeries67.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener78 = null;
        xYSeries67.addPropertyChangeListener(propertyChangeListener78);
        xYSeries67.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem85 = xYSeries67.remove(1);
        xYSeries63.add(xYDataItem85);
        xYSeries59.add(xYDataItem85, false);
        xYSeries46.setKey((java.lang.Comparable) xYDataItem85);
        xYSeries36.add(xYDataItem85, true);
        xYSeries22.add(xYDataItem85, true);
        org.jfree.data.xy.XYSeries xYSeries96 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85, true, false);
        org.jfree.data.xy.XYSeries xYSeries97 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem85);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem18);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-2) + "'", int32 == (-2));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(xYDataItem42);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(xYDataItem85);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener18);
        xYSeries15.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int25 = xYSeries15.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener30);
        java.util.List list32 = xYSeries29.getItems();
        xYSeries15.data = list32;
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener40);
        xYSeries37.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int47 = xYSeries37.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        xYSeries51.removePropertyChangeListener(propertyChangeListener52);
        java.util.List list54 = xYSeries51.getItems();
        xYSeries37.data = list54;
        xYSeries15.data = list54;
        xYSeries3.data = list54;
        int int58 = xYSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((double) (-1), (double) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "", true);
        java.util.List list3 = xYSeries2.getItems();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable16 = xYSeries7.getKey();
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener25);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener27);
        xYSeries24.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int34 = xYSeries24.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries24.addPropertyChangeListener(propertyChangeListener35);
        xYSeries24.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries24.remove(1);
        xYSeries20.add(xYDataItem42);
        org.jfree.data.xy.XYSeries xYSeries46 = xYSeries20.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem48 = xYSeries20.remove(0);
        xYSeries7.add(xYDataItem48);
        xYSeries2.add(xYDataItem48, true);
        boolean boolean52 = xYSeries2.getAllowDuplicateXValues();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 0L + "'", comparable16, 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertNotNull(xYSeries46);
        org.junit.Assert.assertNotNull(xYDataItem48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        xYSeries3.fireSeriesChanged();
        int int13 = xYSeries3.getItemCount();
        xYSeries3.add(0.0d, (double) 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries3.setDescription("hi!");
        int int22 = xYSeries3.getMaximumItemCount();
        xYSeries3.add((double) (-1), (java.lang.Number) (short) 100, false);
        boolean boolean27 = xYSeries3.getAutoSort();
        boolean boolean28 = xYSeries3.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 1, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        java.lang.String str7 = xYSeries3.getDescription();
        xYSeries3.fireSeriesChanged();
        xYSeries3.setMaximumItemCount((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        double[][] doubleArray6 = xYSeries3.toArray();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) (-1L));
        xYSeries3.add((java.lang.Number) (short) 10, (java.lang.Number) (-1L), false);
        xYSeries3.add((double) (-1), (java.lang.Number) 1.0f);
        xYSeries3.add((java.lang.Number) (-1.0f), (java.lang.Number) (-1.0f), false);
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        double[][] doubleArray4 = xYSeries3.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries3.addChangeListener(seriesChangeListener5);
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add(10.0d, (java.lang.Number) 0.0d);
        java.lang.Object obj15 = xYSeries3.clone();
        xYSeries3.add((double) 10, (java.lang.Number) 10.0f);
        java.lang.Number number20 = xYSeries3.getY((int) (short) 0);
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries3.remove((java.lang.Number) 10);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10, false);
        java.util.List list25 = xYSeries24.getItems();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) 100.0f, (java.lang.Number) (-1.0d), true);
        java.util.List list6 = xYSeries1.data;
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) 2);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((java.lang.Number) (short) 1, (java.lang.Number) 3);
        xYSeries1.fireSeriesChanged();
        java.util.List list14 = xYSeries1.getItems();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener12);
        xYSeries3.add((double) 10.0f, (java.lang.Number) (short) 100);
        int int17 = xYSeries3.getMaximumItemCount();
        double[][] doubleArray18 = xYSeries3.toArray();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(3, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(10, (-1));
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.addOrUpdate((double) 10.0f, (double) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) -1, (int) '#');
        boolean boolean5 = xYSeries1.isEmpty();
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries3.addChangeListener(seriesChangeListener22);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries3.removeChangeListener(seriesChangeListener24);
        boolean boolean26 = xYSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries2.createCopy(2, (int) ' ');
        xYSeries5.setMaximumItemCount(0);
        int int8 = xYSeries5.getItemCount();
        java.lang.String str9 = xYSeries5.getDescription();
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) -1);
        boolean boolean15 = xYSeries3.getAllowDuplicateXValues();
        java.lang.Class<?> wildcardClass16 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", true, true);
        xYSeries3.setDescription("hi!");
        double[][] doubleArray6 = xYSeries3.toArray();
        xYSeries3.add((double) (-1), (double) ' ', true);
        java.lang.Class<?> wildcardClass11 = xYSeries3.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries3.setDescription("hi!");
        int int22 = xYSeries3.getMaximumItemCount();
        xYSeries3.clear();
        xYSeries3.add((double) (short) 10, (java.lang.Number) 0L, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.remove((java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        java.lang.Comparable comparable13 = xYSeries3.getKey();
        xYSeries3.add((double) (-5908509288197150436L), (java.lang.Number) (-1));
        java.util.List list17 = xYSeries3.data;
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener18);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 0L + "'", comparable13, 0L);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        java.lang.Object obj6 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 10, (-2));
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries9.addOrUpdate((double) 0, (double) '#');
        xYSeries9.add((double) 'a', (java.lang.Number) 100L);
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (-1.0d), (java.lang.Number) 100.0f);
        double[][] doubleArray7 = xYSeries1.toArray();
        xYSeries1.add((java.lang.Number) 10.0f, (java.lang.Number) 10, false);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0f, false);
        java.lang.Comparable comparable3 = xYSeries2.getKey();
        int int4 = xYSeries2.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries8.removePropertyChangeListener(propertyChangeListener9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries8.removePropertyChangeListener(propertyChangeListener11);
        xYSeries8.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray17 = xYSeries8.toArray();
        xYSeries8.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries8.setKey((java.lang.Comparable) 10.0f);
        xYSeries8.add((java.lang.Number) (byte) 10, (java.lang.Number) 0, false);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener32);
        java.util.List list34 = xYSeries31.getItems();
        xYSeries31.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener41);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener43);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries48.removePropertyChangeListener(propertyChangeListener49);
        java.util.List list51 = xYSeries48.getItems();
        xYSeries40.data = list51;
        xYSeries31.data = list51;
        xYSeries8.data = list51;
        xYSeries2.data = list51;
        org.jfree.data.xy.XYSeries xYSeries58 = xYSeries2.createCopy((int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 0.0f + "'", comparable3, 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(xYSeries58);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        boolean boolean14 = xYSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        boolean boolean7 = xYSeries3.isEmpty();
        xYSeries3.add((java.lang.Number) 100.0d, (java.lang.Number) 0L);
        xYSeries3.add((double) 1L, (java.lang.Number) 10.0d, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries3.getY(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) 1, (int) 'a');
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener15);
        xYSeries12.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int22 = xYSeries12.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener23);
        xYSeries12.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries12.remove(1);
        xYSeries8.add(xYDataItem30);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, false);
        xYSeries1.add(xYDataItem30);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, false);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, true, false);
        java.lang.Number number41 = null;
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries39.addOrUpdate((java.lang.Number) 100, number41);
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertNull(xYDataItem42);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) -1, (int) '#');
        java.util.List list5 = xYSeries4.data;
        xYSeries4.add((double) (-5908509288197150436L), (java.lang.Number) 1.0f, false);
        xYSeries4.add((double) (-2), (java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries4.createCopy((int) (short) 100, (-1));
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(xYSeries15);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries29.addOrUpdate((double) (short) 100, (double) (byte) 1);
        xYSeries29.add((double) 0L, (java.lang.Number) 1.0d, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener37 = null;
        xYSeries29.removeChangeListener(seriesChangeListener37);
        java.lang.Comparable comparable39 = xYSeries29.getKey();
        xYSeries29.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertEquals("'" + comparable39 + "' != '" + true + "'", comparable39, true);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) '4', (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2, false, false);
        xYSeries3.setDescription("hi!");
        xYSeries3.add((java.lang.Number) 1L, (java.lang.Number) 3, false);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.isEmpty();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) 100.0d);
        xYSeries3.add((java.lang.Number) 2147483647, (java.lang.Number) 1.0d, false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (-1L), (double) (byte) 1);
        xYSeries3.add((double) 2147483647, (double) 'a', true);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener19);
        int int21 = xYSeries3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener22);
        xYSeries3.add((java.lang.Number) 0L, (java.lang.Number) (short) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        xYSeries3.removeChangeListener(seriesChangeListener28);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 'a', true, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) '4', 3);
        java.lang.Number number8 = null;
        xYSeries3.add((double) (short) 10, number8, false);
        org.junit.Assert.assertNotNull(xYSeries6);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.util.List list14 = xYSeries11.getItems();
        xYSeries3.data = list14;
        boolean boolean16 = xYSeries3.getAllowDuplicateXValues();
        boolean boolean17 = xYSeries3.getNotify();
        xYSeries3.setDescription("");
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries3.addChangeListener(seriesChangeListener22);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener12);
        xYSeries9.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int19 = xYSeries9.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries9.addPropertyChangeListener(propertyChangeListener20);
        xYSeries9.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries9.remove(1);
        xYSeries5.add(xYDataItem27);
        xYSeries1.add(xYDataItem27, false);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries34.removePropertyChangeListener(propertyChangeListener35);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries34.removePropertyChangeListener(propertyChangeListener37);
        int int39 = xYSeries34.getItemCount();
        xYSeries34.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        java.util.List list43 = xYSeries34.getItems();
        xYSeries1.data = list43;
        java.lang.Number number45 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(number45, (java.lang.Number) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(xYDataItem27);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(list43);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        int int4 = xYSeries3.getMaximumItemCount();
        int int5 = xYSeries3.getItemCount();
        xYSeries3.add(0.0d, (double) 1.0f, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries13.add(0.0d, (java.lang.Number) 0.0d, false);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries13.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(xYDataItem19, false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(xYDataItem19);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        boolean boolean7 = xYSeries3.isEmpty();
        xYSeries3.add((java.lang.Number) 100.0d, (java.lang.Number) 0L);
        xYSeries3.add((double) 1L, (java.lang.Number) 10.0d, true);
        xYSeries3.setNotify(true);
        xYSeries3.add((double) 1, (java.lang.Number) 10L, false);
        java.lang.Number number22 = xYSeries3.getX(0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 1.0d + "'", number22, 1.0d);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        java.lang.String str7 = xYSeries3.getDescription();
        java.lang.Object obj8 = xYSeries3.clone();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.fireSeriesChanged();
        java.lang.Number number15 = null;
        xYSeries3.add((java.lang.Number) (short) -1, number15);
        xYSeries3.update((java.lang.Number) (short) 0, (java.lang.Number) 10.0d);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener24);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener26);
        xYSeries23.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries23.addChangeListener(seriesChangeListener32);
        java.util.List list34 = xYSeries23.getItems();
        boolean boolean35 = xYSeries3.equals((java.lang.Object) xYSeries23);
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries23.remove((java.lang.Number) 0);
        xYSeries23.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number41 = xYSeries23.getY((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(xYDataItem37);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.clear();
        xYSeries3.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener18);
        xYSeries15.setKey((java.lang.Comparable) (short) 100);
        xYSeries15.add((double) (-1.0f), (double) 0L, false);
        xYSeries15.clear();
        boolean boolean27 = xYSeries3.equals((java.lang.Object) xYSeries15);
        xYSeries3.add(0.0d, (java.lang.Number) (-2), false);
        int int32 = xYSeries3.getItemCount();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.util.List list14 = xYSeries11.getItems();
        xYSeries3.data = list14;
        boolean boolean16 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.setMaximumItemCount(0);
        double[][] doubleArray19 = xYSeries3.toArray();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener20);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries3.addOrUpdate((double) 1.0f, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener15);
        double[][] doubleArray17 = xYSeries3.toArray();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries29.addOrUpdate((double) (short) 100, (double) (byte) 1);
        xYSeries29.add((double) 0L, (java.lang.Number) 1.0d, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener37 = null;
        xYSeries29.removeChangeListener(seriesChangeListener37);
        org.jfree.data.xy.XYSeries xYSeries41 = xYSeries29.createCopy((int) (byte) 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number43 = xYSeries29.getY((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertNotNull(xYSeries41);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.util.List list20 = xYSeries17.getItems();
        xYSeries3.data = list20;
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener26);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener28);
        xYSeries25.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int35 = xYSeries25.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener40);
        java.util.List list42 = xYSeries39.getItems();
        xYSeries25.data = list42;
        xYSeries3.data = list42;
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener45);
        java.lang.Number number48 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) (byte) 10, number48);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(list42);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) 100, true);
        boolean boolean11 = xYSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (-1L), (double) (byte) 1);
        xYSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 10L, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener20);
        xYSeries17.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray26 = xYSeries17.toArray();
        xYSeries17.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries17.setKey((java.lang.Comparable) 10.0f);
        xYSeries17.add((java.lang.Number) (byte) 10, (java.lang.Number) 0, false);
        java.util.List list37 = xYSeries17.getItems();
        boolean boolean38 = xYSeries3.equals((java.lang.Object) list37);
        boolean boolean39 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) 1L, (java.lang.Number) 100L);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 0.0d, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) -1, true, false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.fireSeriesChanged();
        java.lang.Comparable comparable14 = xYSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 0L + "'", comparable14, 0L);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) 100.0f, (java.lang.Number) (-1.0d), true);
        java.util.List list6 = xYSeries1.data;
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) 2);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((java.lang.Number) (short) 1, (java.lang.Number) 3);
        int int13 = xYSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener16);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener9);
        xYSeries6.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray15 = xYSeries6.toArray();
        xYSeries6.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries6.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries6.remove((int) (short) 1);
        xYSeries1.add(xYDataItem23, true);
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) (short) -1, true);
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries1.getDataItem(0);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener36);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener38);
        xYSeries35.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int45 = xYSeries35.indexOf((java.lang.Number) 0.0f);
        xYSeries35.add((double) (-1), (java.lang.Number) 1.0d, false);
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        xYSeries35.addPropertyChangeListener(propertyChangeListener50);
        java.lang.Number number53 = xYSeries35.getY((int) (byte) 1);
        java.lang.Comparable comparable54 = xYSeries35.getKey();
        boolean boolean55 = xYSeries1.equals((java.lang.Object) xYSeries35);
        xYSeries35.add((java.lang.Number) (short) 0, (java.lang.Number) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + number53 + "' != '" + (byte) 10 + "'", number53, (byte) 10);
        org.junit.Assert.assertEquals("'" + comparable54 + "' != '" + 0L + "'", comparable54, 0L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L);
        double[][] doubleArray2 = xYSeries1.toArray();
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries3.setDescription("hi!");
        xYSeries3.setNotify(false);
        xYSeries3.clear();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) 1, (int) 'a');
        java.util.List list5 = xYSeries4.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries9.add((double) 0.0f, 0.0d);
        xYSeries9.add((double) (short) 100, (java.lang.Number) (-1L), true);
        xYSeries9.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener23);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener25);
        xYSeries22.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable31 = xYSeries22.getKey();
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener40);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener42);
        xYSeries39.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int49 = xYSeries39.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        xYSeries39.addPropertyChangeListener(propertyChangeListener50);
        xYSeries39.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem57 = xYSeries39.remove(1);
        xYSeries35.add(xYDataItem57);
        org.jfree.data.xy.XYSeries xYSeries61 = xYSeries35.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries35.remove(0);
        xYSeries22.add(xYDataItem63);
        xYSeries9.add(xYDataItem63, true);
        xYSeries4.add(xYDataItem63);
        org.jfree.data.xy.XYSeries xYSeries70 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem63, true, true);
        int int71 = xYSeries70.getItemCount();
        xYSeries70.add((double) 10, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries70.update((java.lang.Number) 0.0f, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + 0L + "'", comparable31, 0L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(xYDataItem57);
        org.junit.Assert.assertNotNull(xYSeries61);
        org.junit.Assert.assertNotNull(xYDataItem63);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries3.removeChangeListener(seriesChangeListener22);
        int int25 = xYSeries3.indexOf((java.lang.Number) 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-3) + "'", int25 == (-3));
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries2.addChangeListener(seriesChangeListener3);
        int int6 = xYSeries2.indexOf((java.lang.Number) (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        int int7 = xYSeries3.indexOf((java.lang.Number) 0.0d);
        boolean boolean9 = xYSeries3.equals((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) (byte) 100, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.remove(1);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21);
        int int24 = xYSeries22.indexOf((java.lang.Number) (-2));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries22.remove((java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.util.List list20 = xYSeries17.getItems();
        xYSeries3.data = list20;
        xYSeries3.fireSeriesChanged();
        double[][] doubleArray23 = xYSeries3.toArray();
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0f, false);
        java.lang.Comparable comparable27 = xYSeries26.getKey();
        int int28 = xYSeries26.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener33);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener35);
        xYSeries32.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray41 = xYSeries32.toArray();
        xYSeries32.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries32.setKey((java.lang.Comparable) 10.0f);
        xYSeries32.add((java.lang.Number) (byte) 10, (java.lang.Number) 0, false);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries55.removePropertyChangeListener(propertyChangeListener56);
        java.util.List list58 = xYSeries55.getItems();
        xYSeries55.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        xYSeries64.removePropertyChangeListener(propertyChangeListener65);
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        xYSeries64.removePropertyChangeListener(propertyChangeListener67);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        xYSeries72.removePropertyChangeListener(propertyChangeListener73);
        java.util.List list75 = xYSeries72.getItems();
        xYSeries64.data = list75;
        xYSeries55.data = list75;
        xYSeries32.data = list75;
        xYSeries26.data = list75;
        xYSeries3.data = list75;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + 0.0f + "'", comparable27, 0.0f);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(list75);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries5.removePropertyChangeListener(propertyChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries5.removePropertyChangeListener(propertyChangeListener8);
        xYSeries5.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int15 = xYSeries5.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries5.addPropertyChangeListener(propertyChangeListener16);
        xYSeries5.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries5.setDescription("hi!");
        int int24 = xYSeries5.getMaximumItemCount();
        boolean boolean25 = xYSeries1.equals((java.lang.Object) xYSeries5);
        java.lang.Object obj26 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener27);
        xYSeries1.add((double) 1.0f, 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.updateByIndex(1, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        int int13 = xYSeries3.indexOf((java.lang.Number) 2);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries17.setDescription("");
        java.lang.String str20 = xYSeries17.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries17.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries27.add((double) 0.0f, 0.0d);
        xYSeries27.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean35 = xYSeries27.getAllowDuplicateXValues();
        xYSeries27.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries48.removePropertyChangeListener(propertyChangeListener49);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        xYSeries48.removePropertyChangeListener(propertyChangeListener51);
        xYSeries48.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int58 = xYSeries48.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        xYSeries48.addPropertyChangeListener(propertyChangeListener59);
        xYSeries48.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem66 = xYSeries48.remove(1);
        xYSeries44.add(xYDataItem66);
        xYSeries40.add(xYDataItem66, false);
        xYSeries27.setKey((java.lang.Comparable) xYDataItem66);
        xYSeries17.add(xYDataItem66, true);
        xYSeries3.add(xYDataItem66, true);
        xYSeries3.delete((int) (byte) 100, (int) '#');
        xYSeries3.add((java.lang.Number) (-1.0d), (java.lang.Number) (short) 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(xYDataItem23);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(xYDataItem66);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries29.addOrUpdate((double) (short) 100, (double) (byte) 1);
        xYSeries29.setMaximumItemCount(1);
        boolean boolean35 = xYSeries29.getAutoSort();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable12 = xYSeries3.getKey();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener23);
        xYSeries20.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int30 = xYSeries20.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries20.addPropertyChangeListener(propertyChangeListener31);
        xYSeries20.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries20.remove(1);
        xYSeries16.add(xYDataItem38);
        org.jfree.data.xy.XYSeries xYSeries42 = xYSeries16.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries16.remove(0);
        xYSeries3.add(xYDataItem44);
        xYSeries3.add((double) '#', (java.lang.Number) 1.0f, false);
        org.jfree.data.xy.XYSeries xYSeries52 = xYSeries3.createCopy(3, 1);
        int int53 = xYSeries52.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertNotNull(xYSeries52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true);
        boolean boolean3 = xYSeries2.getAutoSort();
        java.lang.Comparable comparable4 = xYSeries2.getKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (short) 10 + "'", comparable4, (short) 10);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries14.setNotify(false);
        boolean boolean17 = xYSeries14.getNotify();
        java.lang.String str18 = xYSeries14.getDescription();
        boolean boolean19 = xYSeries3.equals((java.lang.Object) xYSeries14);
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries3.createCopy((int) (byte) 10, (int) (short) -1);
        xYSeries22.add((double) (byte) 1, (java.lang.Number) 10);
        int int26 = xYSeries22.getItemCount();
        boolean boolean27 = xYSeries22.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries22.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        double[][] doubleArray16 = xYSeries3.toArray();
        xYSeries3.add((double) (short) 100, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = xYSeries3.getX((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy(100, (int) (byte) 10);
        int int10 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy((int) 'a', (int) (byte) 0);
        xYSeries1.setNotify(true);
        boolean boolean16 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener23);
        xYSeries20.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray29 = xYSeries20.toArray();
        xYSeries20.add((double) 0, 1.0d, true);
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries20.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) (byte) 100);
        xYSeries20.setMaximumItemCount(1);
        java.lang.Class<?> wildcardClass39 = xYSeries20.getClass();
        boolean boolean40 = xYSeries1.equals((java.lang.Object) wildcardClass39);
        boolean boolean41 = xYSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener42);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNull(xYDataItem36);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        double[][] doubleArray6 = xYSeries3.toArray();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) (-1L));
        xYSeries3.add((java.lang.Number) (short) 10, (java.lang.Number) (-1L), false);
        boolean boolean14 = xYSeries3.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries3.getY((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries3.removeChangeListener(seriesChangeListener22);
        xYSeries3.clear();
        java.lang.Comparable comparable25 = xYSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries3.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + 0L + "'", comparable25, 0L);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        java.lang.Comparable comparable13 = xYSeries3.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries3.removeChangeListener(seriesChangeListener14);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 0L + "'", comparable13, 0L);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Object obj2 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.removeChangeListener(seriesChangeListener7);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener20);
        xYSeries17.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray26 = xYSeries17.toArray();
        xYSeries17.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries17.setKey((java.lang.Comparable) 10.0f);
        xYSeries17.add((java.lang.Number) (byte) 10, (java.lang.Number) 0, false);
        java.util.List list37 = xYSeries17.getItems();
        boolean boolean38 = xYSeries3.equals((java.lang.Object) list37);
        org.jfree.data.xy.XYSeries xYSeries41 = xYSeries3.createCopy(1, 0);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        xYSeries45.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable49 = xYSeries48.getKey();
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries57.removePropertyChangeListener(propertyChangeListener58);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        xYSeries57.removePropertyChangeListener(propertyChangeListener60);
        xYSeries57.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int67 = xYSeries57.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        xYSeries57.addPropertyChangeListener(propertyChangeListener68);
        xYSeries57.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem75 = xYSeries57.remove(1);
        xYSeries53.add(xYDataItem75);
        org.jfree.data.xy.XYSeries xYSeries79 = xYSeries53.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem81 = xYSeries53.remove(0);
        xYSeries48.setKey((java.lang.Comparable) xYDataItem81);
        org.jfree.data.xy.XYSeries xYSeries85 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem81, false, false);
        xYSeries45.add(xYDataItem81);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem81);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + '#' + "'", comparable49, '#');
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(xYDataItem75);
        org.junit.Assert.assertNotNull(xYSeries79);
        org.junit.Assert.assertNotNull(xYDataItem81);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(10, (-1));
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries9.createCopy((int) (byte) 100, 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(xYSeries12);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries29.addOrUpdate((double) (short) 100, (double) (byte) 1);
        xYSeries29.add((double) 0L, (java.lang.Number) 1.0d, false);
        boolean boolean37 = xYSeries29.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries29.addOrUpdate((double) (byte) 1, (double) 1);
        xYSeries29.clear();
        org.jfree.data.xy.XYSeries xYSeries44 = xYSeries29.createCopy((int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(xYDataItem40);
        org.junit.Assert.assertNotNull(xYSeries44);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) -1);
        xYSeries3.add((java.lang.Number) 0L, (java.lang.Number) 0L);
        xYSeries3.add((double) 10, (java.lang.Number) (-1.0f));
        java.lang.Number number22 = xYSeries3.getY(0);
        java.util.List list23 = xYSeries3.getItems();
        double[][] doubleArray24 = xYSeries3.toArray();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 0L + "'", number22, 0L);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        java.lang.Comparable comparable13 = xYSeries3.getKey();
        xYSeries3.add((double) (-5908509288197150436L), (java.lang.Number) (-1));
        int int17 = xYSeries3.getItemCount();
        xYSeries3.clear();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 0L + "'", comparable13, 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        xYSeries3.add(0.0d, (java.lang.Number) 1.0d);
        int int10 = xYSeries3.indexOf((java.lang.Number) 100.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        java.util.List list5 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener10);
        int int13 = xYSeries9.indexOf((java.lang.Number) (short) 10);
        java.util.List list14 = xYSeries9.data;
        xYSeries3.data = list14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = xYSeries3.getX((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.clear();
        xYSeries3.add((double) 0L, (double) 'a', true);
        xYSeries3.add(100.0d, (java.lang.Number) (-3), false);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) 100.0f, (java.lang.Number) (-1.0d), true);
        xYSeries1.add((double) '4', (double) (-2));
        boolean boolean9 = xYSeries1.getNotify();
        int int10 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener20);
        xYSeries17.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray26 = xYSeries17.toArray();
        xYSeries17.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries17.setKey((java.lang.Comparable) 10.0f);
        xYSeries17.add((java.lang.Number) (byte) 10, (java.lang.Number) 0, false);
        java.util.List list37 = xYSeries17.getItems();
        boolean boolean38 = xYSeries3.equals((java.lang.Object) list37);
        org.jfree.data.xy.XYSeries xYSeries41 = xYSeries3.createCopy(1, 0);
        java.util.List list42 = xYSeries3.getItems();
        java.lang.String str43 = xYSeries3.getDescription();
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.addOrUpdate((double) (-5908509288197150436L), (double) (byte) 100);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 0, 1.0d, true);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries3.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) (byte) 100);
        xYSeries3.setMaximumItemCount(1);
        boolean boolean22 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener29);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener31);
        xYSeries28.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int38 = xYSeries28.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries28.addPropertyChangeListener(propertyChangeListener39);
        xYSeries28.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem46 = xYSeries28.remove(1);
        java.util.List list47 = xYSeries28.data;
        xYSeries24.data = list47;
        xYSeries3.data = list47;
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(xYDataItem46);
        org.junit.Assert.assertNotNull(list47);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries29.addOrUpdate((double) (short) 100, (double) (byte) 1);
        xYSeries29.add((double) 0L, (java.lang.Number) 1.0d, false);
        boolean boolean37 = xYSeries29.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries29.addPropertyChangeListener(propertyChangeListener38);
        boolean boolean40 = xYSeries29.getAllowDuplicateXValues();
        xYSeries29.add((java.lang.Number) 2147483647, (java.lang.Number) 10L, true);
        boolean boolean45 = xYSeries29.getNotify();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries3.removeChangeListener(seriesChangeListener15);
        java.util.List list17 = xYSeries3.getItems();
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100);
        xYSeries1.add((double) 100L, (java.lang.Number) (-1));
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (byte) 100, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true);
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries2.addOrUpdate((java.lang.Number) 1.0f, (java.lang.Number) 10.0d);
        org.junit.Assert.assertNull(xYDataItem5);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        java.util.List list3 = xYSeries2.getItems();
        boolean boolean4 = xYSeries2.isEmpty();
        xYSeries2.delete(2147483647, (int) (byte) 100);
        java.lang.Number number9 = null;
        xYSeries2.add((java.lang.Number) (byte) 10, number9);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        int int7 = xYSeries3.indexOf((java.lang.Number) (short) 10);
        java.util.List list8 = xYSeries3.data;
        int int9 = xYSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.fireSeriesChanged();
        java.lang.Number number15 = null;
        xYSeries3.add((java.lang.Number) (short) -1, number15);
        xYSeries3.update((java.lang.Number) (short) 0, (java.lang.Number) 10.0d);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener24);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener26);
        xYSeries23.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries23.addChangeListener(seriesChangeListener32);
        java.util.List list34 = xYSeries23.getItems();
        boolean boolean35 = xYSeries3.equals((java.lang.Object) xYSeries23);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener36);
        java.lang.String str38 = xYSeries23.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries23.updateByIndex(2147483647, (java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) 100, 3);
        xYSeries3.add(1.0d, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(0, (int) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries11.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries11.removeChangeListener(seriesChangeListener14);
        java.lang.String str16 = xYSeries11.getDescription();
        org.jfree.data.xy.XYSeries xYSeries19 = xYSeries11.createCopy(100, (int) (byte) 10);
        int int20 = xYSeries11.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries23 = xYSeries11.createCopy((int) 'a', (int) (byte) 0);
        boolean boolean24 = xYSeries9.equals((java.lang.Object) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries28.setDescription("");
        java.lang.String str31 = xYSeries28.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries28.addChangeListener(seriesChangeListener32);
        java.util.List list34 = xYSeries28.getItems();
        boolean boolean35 = xYSeries9.equals((java.lang.Object) list34);
        xYSeries9.add((double) (-1.0f), (java.lang.Number) (-2), false);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 0, true);
        xYSeries14.add((double) 10L, (double) 10.0f, true);
        xYSeries14.add(1.0d, (-1.0d), false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = xYSeries14.getX(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYDataItem12);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries5.removePropertyChangeListener(propertyChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries5.removePropertyChangeListener(propertyChangeListener8);
        xYSeries5.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int15 = xYSeries5.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries5.addPropertyChangeListener(propertyChangeListener16);
        xYSeries5.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries5.setDescription("hi!");
        int int24 = xYSeries5.getMaximumItemCount();
        boolean boolean25 = xYSeries1.equals((java.lang.Object) xYSeries5);
        xYSeries1.add((double) (-1.0f), 0.0d);
        boolean boolean29 = xYSeries1.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener30);
        xYSeries1.add((double) 4, (java.lang.Number) 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (-1), (java.lang.Number) 1.0d, false);
        xYSeries3.clear();
        xYSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((int) (byte) 1, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) 1, (int) 'a');
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener15);
        xYSeries12.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int22 = xYSeries12.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener23);
        xYSeries12.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries12.remove(1);
        xYSeries8.add(xYDataItem30);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, false);
        xYSeries1.add(xYDataItem30);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, false);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, true, false);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        xYSeries47.removePropertyChangeListener(propertyChangeListener48);
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        xYSeries47.removePropertyChangeListener(propertyChangeListener50);
        xYSeries47.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int57 = xYSeries47.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries47.addPropertyChangeListener(propertyChangeListener58);
        xYSeries47.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem65 = xYSeries47.remove(1);
        xYSeries43.add(xYDataItem65);
        org.jfree.data.xy.XYSeries xYSeries69 = xYSeries43.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem72 = xYSeries69.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) 100L);
        java.lang.String str73 = xYSeries69.getDescription();
        java.util.List list74 = xYSeries69.getItems();
        xYSeries39.data = list74;
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(xYDataItem65);
        org.junit.Assert.assertNotNull(xYSeries69);
        org.junit.Assert.assertNull(xYDataItem72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(list74);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        java.lang.Class<?> wildcardClass3 = xYSeries2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) 1, (int) 'a');
        java.util.List list5 = xYSeries4.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries9.add((double) 0.0f, 0.0d);
        xYSeries9.add((double) (short) 100, (java.lang.Number) (-1L), true);
        xYSeries9.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener23);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener25);
        xYSeries22.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable31 = xYSeries22.getKey();
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener40);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener42);
        xYSeries39.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int49 = xYSeries39.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        xYSeries39.addPropertyChangeListener(propertyChangeListener50);
        xYSeries39.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem57 = xYSeries39.remove(1);
        xYSeries35.add(xYDataItem57);
        org.jfree.data.xy.XYSeries xYSeries61 = xYSeries35.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem63 = xYSeries35.remove(0);
        xYSeries22.add(xYDataItem63);
        xYSeries9.add(xYDataItem63, true);
        xYSeries4.add(xYDataItem63);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem63, false);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true, false);
        boolean boolean73 = xYSeries72.getNotify();
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + 0L + "'", comparable31, 0L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(xYDataItem57);
        org.junit.Assert.assertNotNull(xYSeries61);
        org.junit.Assert.assertNotNull(xYDataItem63);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Object obj2 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries1.removeChangeListener(seriesChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener7);
        int int9 = xYSeries1.getItemCount();
        java.lang.String str10 = xYSeries1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries1.removeChangeListener(seriesChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        boolean boolean14 = xYSeries3.equals((java.lang.Object) false);
        xYSeries3.add((double) (byte) 10, (double) (byte) 10, true);
        boolean boolean19 = xYSeries3.getAutoSort();
        xYSeries3.setDescription("hi!");
        xYSeries3.clear();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((double) 100.0f, (double) 0);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener13);
        xYSeries10.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int20 = xYSeries10.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener25);
        java.util.List list27 = xYSeries24.getItems();
        xYSeries10.data = list27;
        xYSeries10.fireSeriesChanged();
        java.util.List list30 = xYSeries10.data;
        xYSeries3.data = list30;
        java.lang.String str32 = xYSeries3.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener33);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 100.0f, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0.0d, (java.lang.Number) 10);
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries8.add((double) 0.0f, 0.0d);
        xYSeries8.add((double) (short) 100, (java.lang.Number) (-1L), true);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries19.setNotify(false);
        boolean boolean22 = xYSeries19.getNotify();
        java.lang.String str23 = xYSeries19.getDescription();
        boolean boolean24 = xYSeries8.equals((java.lang.Object) xYSeries19);
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries8.createCopy((int) (byte) 10, (int) (short) -1);
        xYSeries8.setNotify(true);
        xYSeries8.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener36);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener38);
        int int40 = xYSeries35.getItemCount();
        xYSeries35.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        java.util.List list44 = xYSeries35.getItems();
        xYSeries8.data = list44;
        xYSeries1.data = list44;
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(list44);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.remove(1);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21);
        boolean boolean23 = xYSeries22.getAutoSort();
        xYSeries22.setNotify(true);
        xYSeries22.add((java.lang.Number) 1.0d, (java.lang.Number) 0L, true);
        boolean boolean30 = xYSeries22.getAutoSort();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) -1, (int) '#');
        java.util.List list5 = xYSeries4.data;
        xYSeries4.add((double) (-5908509288197150436L), (java.lang.Number) 1.0f, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries4.getY(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 100, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = xYSeries2.getX((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(10, (-1));
        boolean boolean10 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.addOrUpdate((java.lang.Number) (short) -1, (java.lang.Number) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries16 = xYSeries3.createCopy((int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(xYDataItem13);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        boolean boolean7 = xYSeries3.isEmpty();
        java.lang.Number number9 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex(10, number9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries29.addOrUpdate((double) (short) 100, (double) (byte) 1);
        xYSeries29.add((double) 0L, (java.lang.Number) 1.0d, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener37 = null;
        xYSeries29.removeChangeListener(seriesChangeListener37);
        xYSeries29.update((java.lang.Number) 0L, (java.lang.Number) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number43 = xYSeries29.getX((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries3.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries3.remove((int) (short) 1);
        boolean boolean21 = xYSeries3.getAutoSort();
        java.util.List list22 = xYSeries3.data;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        xYSeries3.addChangeListener(seriesChangeListener23);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.remove(1);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21, false);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21, false);
        java.lang.Comparable comparable26 = xYSeries25.getKey();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(comparable26);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.util.List list20 = xYSeries17.getItems();
        xYSeries3.data = list20;
        xYSeries3.fireSeriesChanged();
        double[][] doubleArray23 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = xYSeries3.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Failed to clone.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 0, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries14.addChangeListener(seriesChangeListener15);
        org.junit.Assert.assertNotNull(xYDataItem12);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', false, false);
        java.util.List list4 = xYSeries3.data;
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries3.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 10, false, true);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (-1L), (double) (byte) 1);
        xYSeries3.add((double) 2147483647, (double) 'a', true);
        boolean boolean19 = xYSeries3.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        xYSeries3.removeChangeListener(seriesChangeListener23);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        xYSeries28.fireSeriesChanged();
        boolean boolean30 = xYSeries3.equals((java.lang.Object) xYSeries28);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        xYSeries3.removeChangeListener(seriesChangeListener31);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        java.lang.String str7 = xYSeries3.getDescription();
        java.lang.Object obj8 = xYSeries3.clone();
        xYSeries3.setNotify(false);
        int int11 = xYSeries3.getMaximumItemCount();
        boolean boolean12 = xYSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) 100, 3);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (short) 10);
        xYSeries3.updateByIndex(0, (java.lang.Number) (byte) 10);
        xYSeries3.add((java.lang.Number) 1.0d, (java.lang.Number) 2);
        org.junit.Assert.assertNotNull(xYSeries6);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        xYSeries3.setNotify(true);
        java.util.List list8 = xYSeries3.data;
        java.lang.String str9 = xYSeries3.getDescription();
        xYSeries3.add(0.0d, (double) 100, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((-1), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        java.lang.String str6 = xYSeries3.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries13.add((double) 0.0f, 0.0d);
        xYSeries13.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean21 = xYSeries13.getAllowDuplicateXValues();
        xYSeries13.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries34.removePropertyChangeListener(propertyChangeListener35);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries34.removePropertyChangeListener(propertyChangeListener37);
        xYSeries34.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int44 = xYSeries34.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries34.addPropertyChangeListener(propertyChangeListener45);
        xYSeries34.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries34.remove(1);
        xYSeries30.add(xYDataItem52);
        xYSeries26.add(xYDataItem52, false);
        xYSeries13.setKey((java.lang.Comparable) xYDataItem52);
        xYSeries3.add(xYDataItem52, true);
        xYSeries3.add((java.lang.Number) 10, (java.lang.Number) 1.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(xYDataItem52);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        java.lang.Comparable comparable13 = xYSeries3.getKey();
        java.lang.String str14 = xYSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries3.getY((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 0L + "'", comparable13, 0L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100, true, true);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        xYSeries1.setMaximumItemCount((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (-3), (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -3");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 'a', true, false);
        double[][] doubleArray4 = xYSeries3.toArray();
        java.lang.Number number6 = null;
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 10, number6);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNull(xYDataItem7);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries3.remove((int) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener18);
        xYSeries3.add((double) (short) -1, (double) 2147483647);
        java.util.List list23 = xYSeries3.data;
        java.lang.Class<?> wildcardClass24 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", true);
        boolean boolean3 = xYSeries2.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries2.addOrUpdate((java.lang.Number) (-5908509288197150436L), (java.lang.Number) 2147483647);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries3.setDescription("hi!");
        int int22 = xYSeries3.getMaximumItemCount();
        xYSeries3.add((double) (-1), (java.lang.Number) (short) 100, false);
        xYSeries3.fireSeriesChanged();
        java.lang.String str28 = xYSeries3.getDescription();
        xYSeries3.clear();
        xYSeries3.clear();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener20);
        xYSeries17.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray26 = xYSeries17.toArray();
        xYSeries17.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries17.setKey((java.lang.Comparable) 10.0f);
        xYSeries17.add((java.lang.Number) (byte) 10, (java.lang.Number) 0, false);
        java.util.List list37 = xYSeries17.getItems();
        boolean boolean38 = xYSeries3.equals((java.lang.Object) list37);
        org.jfree.data.xy.XYSeries xYSeries41 = xYSeries3.createCopy(1, 0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries41.updateByIndex((int) (byte) 100, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(xYSeries41);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy(100, (int) (byte) 10);
        int int10 = xYSeries1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        xYSeries3.fireSeriesChanged();
        java.lang.String str15 = xYSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries3.remove((java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) (byte) 100, true);
        xYSeries1.add((double) 1, 1.0d);
        boolean boolean13 = xYSeries1.isEmpty();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(100, 1);
        boolean boolean30 = xYSeries29.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = xYSeries29.getY((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = xYSeries3.getY((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) -1);
        xYSeries3.add((java.lang.Number) 0L, (java.lang.Number) 0L);
        java.lang.Comparable comparable18 = xYSeries3.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.addOrUpdate((double) (-1.0f), (double) (byte) 10);
        xYSeries3.add((double) (short) -1, (java.lang.Number) (short) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 0L + "'", comparable18, 0L);
        org.junit.Assert.assertNull(xYDataItem21);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener12);
        xYSeries9.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray18 = xYSeries9.toArray();
        xYSeries9.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries9.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries9.remove((int) (short) 1);
        xYSeries3.add(xYDataItem26);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem26, false);
        xYSeries29.add((double) (-2), (double) (byte) 10, false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.util.List list20 = xYSeries17.getItems();
        xYSeries3.data = list20;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries3.addChangeListener(seriesChangeListener22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = xYSeries3.getY((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.add((double) 'a', (double) 10.0f, true);
        java.util.List list6 = xYSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.fireSeriesChanged();
        xYSeries3.clear();
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries3.addOrUpdate((double) 2147483647, (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener28);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener30);
        xYSeries27.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int37 = xYSeries27.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries27.addPropertyChangeListener(propertyChangeListener38);
        xYSeries27.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries27.remove(1);
        xYSeries23.add(xYDataItem45);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem45, false);
        xYSeries19.add(xYDataItem45);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem45, true, false);
        xYSeries3.add(xYDataItem45);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        xYSeries64.removePropertyChangeListener(propertyChangeListener65);
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        xYSeries64.removePropertyChangeListener(propertyChangeListener67);
        xYSeries64.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int74 = xYSeries64.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener75 = null;
        xYSeries64.addPropertyChangeListener(propertyChangeListener75);
        xYSeries64.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem82 = xYSeries64.remove(1);
        xYSeries60.add(xYDataItem82);
        org.jfree.data.xy.XYSeries xYSeries85 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem82, false);
        xYSeries56.add(xYDataItem82);
        org.jfree.data.xy.XYSeries xYSeries87 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem82);
        org.jfree.data.xy.XYSeries xYSeries89 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem82, true);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem82);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem16);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(xYDataItem82);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        xYSeries3.setKey((java.lang.Comparable) 10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) (short) 100, (java.lang.Number) (-3));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.util.List list14 = xYSeries11.getItems();
        xYSeries3.data = list14;
        boolean boolean16 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.setMaximumItemCount(0);
        xYSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = xYSeries3.getY((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener25);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener27);
        xYSeries24.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int34 = xYSeries24.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries24.addPropertyChangeListener(propertyChangeListener35);
        xYSeries24.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries24.remove(1);
        xYSeries20.add(xYDataItem42);
        xYSeries16.add(xYDataItem42, false);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem42);
        java.util.List list47 = xYSeries3.data;
        java.lang.Class<?> wildcardClass48 = list47.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) 1, (int) 'a');
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener15);
        xYSeries12.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int22 = xYSeries12.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries12.addPropertyChangeListener(propertyChangeListener23);
        xYSeries12.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries12.remove(1);
        xYSeries8.add(xYDataItem30);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, false);
        xYSeries1.add(xYDataItem30);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, false, false);
        boolean boolean38 = xYSeries37.isEmpty();
        java.lang.Comparable comparable39 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries37.setKey(comparable39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        int int4 = xYSeries3.getMaximumItemCount();
        java.lang.Number number5 = null;
        int int6 = xYSeries3.indexOf(number5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        boolean boolean9 = xYSeries3.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        boolean boolean6 = xYSeries3.isEmpty();
        java.lang.String str7 = xYSeries3.getDescription();
        java.lang.Object obj8 = xYSeries3.clone();
        java.lang.Number number9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.addOrUpdate(number9, (java.lang.Number) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.util.List list14 = xYSeries11.getItems();
        xYSeries3.data = list14;
        boolean boolean16 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.setMaximumItemCount(0);
        java.lang.String str19 = xYSeries3.getDescription();
        int int20 = xYSeries3.getItemCount();
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        java.lang.Object obj6 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 10, (-2));
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries13.createCopy((int) (byte) -1, 1);
        java.lang.String str17 = xYSeries13.getDescription();
        boolean boolean18 = xYSeries1.equals((java.lang.Object) str17);
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries15.add((double) 0.0f, 0.0d);
        xYSeries15.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean23 = xYSeries15.getAllowDuplicateXValues();
        xYSeries15.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener37);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener39);
        xYSeries36.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int46 = xYSeries36.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        xYSeries36.addPropertyChangeListener(propertyChangeListener47);
        xYSeries36.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries36.remove(1);
        xYSeries32.add(xYDataItem54);
        xYSeries28.add(xYDataItem54, false);
        xYSeries15.setKey((java.lang.Comparable) xYDataItem54);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem54, false);
        xYSeries3.add(xYDataItem54, false);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem54, true);
        java.lang.Object obj65 = new java.lang.Object();
        boolean boolean66 = xYSeries64.equals(obj65);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(xYDataItem54);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem3 = xYSeries1.remove((java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        boolean boolean3 = xYSeries2.getNotify();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.util.List list14 = xYSeries11.getItems();
        xYSeries3.data = list14;
        xYSeries3.setMaximumItemCount((int) (short) 0);
        java.util.List list18 = xYSeries3.getItems();
        int int19 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true);
        boolean boolean3 = xYSeries2.getAutoSort();
        java.lang.String str4 = xYSeries2.getDescription();
        xYSeries2.add((double) 100, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(0, (int) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries11.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries11.removeChangeListener(seriesChangeListener14);
        java.lang.String str16 = xYSeries11.getDescription();
        org.jfree.data.xy.XYSeries xYSeries19 = xYSeries11.createCopy(100, (int) (byte) 10);
        int int20 = xYSeries11.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries23 = xYSeries11.createCopy((int) 'a', (int) (byte) 0);
        boolean boolean24 = xYSeries9.equals((java.lang.Object) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries9.createCopy((int) (byte) -1, 2147483647);
        boolean boolean28 = xYSeries27.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = xYSeries27.getX((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100);
        int int2 = xYSeries1.getMaximumItemCount();
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        java.lang.String str8 = xYSeries7.getDescription();
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener13);
        java.util.List list15 = xYSeries12.getItems();
        xYSeries12.clear();
        xYSeries12.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener23);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener25);
        xYSeries22.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int32 = xYSeries22.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries22.addPropertyChangeListener(propertyChangeListener33);
        xYSeries22.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries22.remove(1);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem40, false);
        xYSeries12.add(xYDataItem40);
        xYSeries7.setKey((java.lang.Comparable) xYDataItem40);
        xYSeries1.add(xYDataItem40);
        int int46 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        int int14 = xYSeries3.getItemCount();
        xYSeries3.setNotify(false);
        int int17 = xYSeries3.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries3.addOrUpdate((double) '4', (double) (-1L));
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener21);
        java.lang.Number number24 = null;
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries3.addOrUpdate((java.lang.Number) 100.0d, number24);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem20);
        org.junit.Assert.assertNull(xYDataItem25);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries14.setNotify(false);
        boolean boolean17 = xYSeries14.getNotify();
        java.lang.String str18 = xYSeries14.getDescription();
        boolean boolean19 = xYSeries3.equals((java.lang.Object) xYSeries14);
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries3.createCopy((int) (byte) 10, (int) (short) -1);
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener29);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener31);
        xYSeries28.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int38 = xYSeries28.indexOf((java.lang.Number) 0.0f);
        xYSeries28.add((double) (-1), (java.lang.Number) 1.0d, false);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries28.addPropertyChangeListener(propertyChangeListener43);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries49 = xYSeries46.createCopy((int) (short) 1, (int) 'a');
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries57.removePropertyChangeListener(propertyChangeListener58);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        xYSeries57.removePropertyChangeListener(propertyChangeListener60);
        xYSeries57.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int67 = xYSeries57.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        xYSeries57.addPropertyChangeListener(propertyChangeListener68);
        xYSeries57.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem75 = xYSeries57.remove(1);
        xYSeries53.add(xYDataItem75);
        org.jfree.data.xy.XYSeries xYSeries78 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem75, false);
        xYSeries46.add(xYDataItem75);
        xYSeries28.setKey((java.lang.Comparable) xYDataItem75);
        xYSeries3.add(xYDataItem75, false);
        java.lang.String str83 = xYSeries3.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener84 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener84);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(xYSeries49);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(xYDataItem75);
        org.junit.Assert.assertNull(str83);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.fireSeriesChanged();
        java.util.List list10 = xYSeries3.getItems();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.util.List list20 = xYSeries17.getItems();
        xYSeries3.data = list20;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries3.addChangeListener(seriesChangeListener22);
        int int25 = xYSeries3.indexOf((java.lang.Number) (short) 10);
        int int26 = xYSeries3.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        boolean boolean32 = xYSeries31.getNotify();
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener37);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener39);
        xYSeries36.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int46 = xYSeries36.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        xYSeries36.addPropertyChangeListener(propertyChangeListener47);
        xYSeries36.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries36.remove(1);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem54, false);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem54, false);
        xYSeries31.add(xYDataItem54, false);
        xYSeries29.add(xYDataItem54, false);
        xYSeries3.setKey((java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(xYDataItem54);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Object obj2 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries1.removeChangeListener(seriesChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener7);
        int int9 = xYSeries1.getItemCount();
        java.lang.String str10 = xYSeries1.getDescription();
        java.util.List list11 = xYSeries1.data;
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener12);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener18);
        xYSeries7.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries7.remove(1);
        xYSeries3.add(xYDataItem25);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries29.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener37);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries36.removePropertyChangeListener(propertyChangeListener39);
        xYSeries36.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries36.remove((int) (byte) 0);
        xYSeries29.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', false, false);
        java.util.List list54 = xYSeries53.data;
        xYSeries49.data = list54;
        xYSeries29.data = list54;
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertNotNull(list54);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        java.lang.Comparable comparable13 = xYSeries3.getKey();
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries20 = xYSeries17.createCopy((int) (byte) -1, 1);
        boolean boolean21 = xYSeries3.equals((java.lang.Object) xYSeries20);
        xYSeries3.add((double) 2147483647, (java.lang.Number) (-1), true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries3.remove((java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 0L + "'", comparable13, 0L);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (-1L), (double) (byte) 1);
        xYSeries3.add((double) 2147483647, (double) 'a', true);
        boolean boolean19 = xYSeries3.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        xYSeries3.removeChangeListener(seriesChangeListener23);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        xYSeries28.fireSeriesChanged();
        boolean boolean30 = xYSeries3.equals((java.lang.Object) xYSeries28);
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries3.addOrUpdate((java.lang.Number) 4, (java.lang.Number) (byte) 100);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(xYDataItem33);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        java.lang.Object obj6 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 10, (-2));
        boolean boolean10 = xYSeries9.isEmpty();
        xYSeries9.add((double) (-1.0f), (double) 10L);
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        boolean boolean12 = xYSeries3.getAllowDuplicateXValues();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener13);
        xYSeries3.add((double) '4', (java.lang.Number) (byte) -1, false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        xYSeries1.setKey((java.lang.Comparable) 2);
        xYSeries1.add((java.lang.Number) (-2), (java.lang.Number) (-2), true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.remove((java.lang.Number) (-5908509288197150436L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener20);
        xYSeries17.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray26 = xYSeries17.toArray();
        xYSeries17.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries17.setKey((java.lang.Comparable) 10.0f);
        xYSeries17.add((java.lang.Number) (byte) 10, (java.lang.Number) 0, false);
        java.util.List list37 = xYSeries17.getItems();
        boolean boolean38 = xYSeries3.equals((java.lang.Object) list37);
        boolean boolean39 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) 1L, (java.lang.Number) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries3.remove((java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 1, (java.lang.Number) (short) 1, true);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries3.addOrUpdate((java.lang.Number) 10.0d, (java.lang.Number) (-1L));
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener24);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener26);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener32);
        java.util.List list34 = xYSeries31.getItems();
        xYSeries23.data = list34;
        boolean boolean36 = xYSeries23.getAllowDuplicateXValues();
        boolean boolean37 = xYSeries23.getNotify();
        xYSeries23.setDescription("");
        boolean boolean40 = xYSeries3.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) (byte) 100, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.remove(1);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21);
        xYSeries23.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries23.addPropertyChangeListener(propertyChangeListener25);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        boolean boolean7 = xYSeries3.isEmpty();
        boolean boolean8 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (short) 1, (double) (-1L));
        int int12 = xYSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.remove((java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) -1);
        xYSeries3.add(100.0d, (java.lang.Number) (short) 100, false);
        boolean boolean19 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries3.addOrUpdate((double) (byte) 0, (double) (-1));
        xYSeries3.setMaximumItemCount((int) 'a');
        int int26 = xYSeries3.indexOf((java.lang.Number) (byte) 100);
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) 100.0d, true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries3.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries3.addChangeListener(seriesChangeListener22);
        xYSeries3.setMaximumItemCount((int) (byte) 1);
        java.util.List list26 = xYSeries3.data;
        int int27 = xYSeries3.getItemCount();
        java.lang.Comparable comparable28 = xYSeries3.getKey();
        xYSeries3.add((double) (-1.0f), (java.lang.Number) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = xYSeries3.getY(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + 0L + "'", comparable28, 0L);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable7 = xYSeries6.getKey();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener18);
        xYSeries15.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int25 = xYSeries15.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries15.addPropertyChangeListener(propertyChangeListener26);
        xYSeries15.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries15.remove(1);
        xYSeries11.add(xYDataItem33);
        org.jfree.data.xy.XYSeries xYSeries37 = xYSeries11.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries11.remove(0);
        xYSeries6.setKey((java.lang.Comparable) xYDataItem39);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39, false, false);
        xYSeries3.add(xYDataItem39);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39, true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + '#' + "'", comparable7, '#');
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertNotNull(xYSeries37);
        org.junit.Assert.assertNotNull(xYDataItem39);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) -1);
        xYSeries3.add((java.lang.Number) 0L, (java.lang.Number) 0L);
        java.lang.Comparable comparable18 = xYSeries3.getKey();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener19);
        xYSeries3.add(0.0d, (java.lang.Number) 1L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 0L + "'", comparable18, 0L);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries3.setKey((java.lang.Comparable) 10.0f);
        xYSeries3.add((java.lang.Number) (byte) 10, (java.lang.Number) 0, false);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener27);
        java.util.List list29 = xYSeries26.getItems();
        xYSeries26.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener36);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener38);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries43.removePropertyChangeListener(propertyChangeListener44);
        java.util.List list46 = xYSeries43.getItems();
        xYSeries35.data = list46;
        xYSeries26.data = list46;
        xYSeries3.data = list46;
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries53.removePropertyChangeListener(propertyChangeListener54);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries53.removePropertyChangeListener(propertyChangeListener56);
        xYSeries53.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int63 = xYSeries53.indexOf((java.lang.Number) 0.0f);
        xYSeries53.add((double) (-1), (java.lang.Number) 1.0d, false);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        xYSeries53.removePropertyChangeListener(propertyChangeListener68);
        boolean boolean70 = xYSeries3.equals((java.lang.Object) xYSeries53);
        java.lang.Number number72 = xYSeries53.getX((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries53.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + number72 + "' != '" + (-1.0d) + "'", number72, (-1.0d));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        java.lang.Number number13 = xYSeries3.getX((int) (byte) 0);
        xYSeries3.add((double) (short) 1, (java.lang.Number) (byte) 0, true);
        xYSeries3.fireSeriesChanged();
        java.util.List list19 = xYSeries3.data;
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 1.0d + "'", number13, 1.0d);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries14.setNotify(false);
        boolean boolean17 = xYSeries14.getNotify();
        java.lang.String str18 = xYSeries14.getDescription();
        boolean boolean19 = xYSeries3.equals((java.lang.Object) xYSeries14);
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries3.createCopy((int) (byte) 10, (int) (short) -1);
        xYSeries3.setNotify(true);
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener33);
        int int35 = xYSeries30.getItemCount();
        xYSeries30.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        java.util.List list39 = xYSeries30.getItems();
        xYSeries3.data = list39;
        xYSeries3.setNotify(false);
        xYSeries3.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 100L, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(list39);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), true);
        boolean boolean3 = xYSeries2.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.updateByIndex((int) '#', (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-2), false);
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        double[][] doubleArray7 = xYSeries6.toArray();
        boolean boolean8 = xYSeries2.equals((java.lang.Object) doubleArray7);
        int int9 = xYSeries2.getMaximumItemCount();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener13);
        java.lang.Comparable comparable15 = xYSeries10.getKey();
        java.lang.Object obj16 = xYSeries10.clone();
        java.util.List list17 = xYSeries10.data;
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries21.add((double) 0.0f, 0.0d);
        xYSeries21.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean29 = xYSeries21.getAllowDuplicateXValues();
        xYSeries21.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries42.removePropertyChangeListener(propertyChangeListener43);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries42.removePropertyChangeListener(propertyChangeListener45);
        xYSeries42.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int52 = xYSeries42.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        xYSeries42.addPropertyChangeListener(propertyChangeListener53);
        xYSeries42.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries42.remove(1);
        xYSeries38.add(xYDataItem60);
        xYSeries34.add(xYDataItem60, false);
        xYSeries21.setKey((java.lang.Comparable) xYDataItem60);
        xYSeries10.add(xYDataItem60);
        xYSeries3.add(xYDataItem60);
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem60);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener68 = null;
        xYSeries67.addChangeListener(seriesChangeListener68);
        xYSeries67.clear();
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0L + "'", comparable15, 0L);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(xYDataItem60);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        boolean boolean2 = xYSeries1.getAllowDuplicateXValues();
        double[][] doubleArray3 = xYSeries1.toArray();
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries5.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list9 = xYSeries5.data;
        boolean boolean10 = xYSeries5.getAutoSort();
        xYSeries5.setDescription("");
        java.lang.Comparable comparable13 = xYSeries5.getKey();
        java.util.List list14 = xYSeries5.data;
        xYSeries1.data = list14;
        xYSeries1.add((java.lang.Number) 3, (java.lang.Number) 2, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (short) -1 + "'", comparable13, (short) -1);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((java.lang.Number) (-1L), (java.lang.Number) 10.0f);
        java.lang.String str10 = xYSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-5908509288197150436L), false, false);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        xYSeries1.add((double) (byte) 10, (double) 0, false);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((java.lang.Number) (-2), (java.lang.Number) 0.0f);
        java.util.List list9 = xYSeries1.data;
        java.lang.Number number10 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(number10, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0.0d, (java.lang.Number) 10);
        xYSeries1.add(10.0d, (java.lang.Number) 100.0d, false);
        xYSeries1.clear();
        org.junit.Assert.assertNull(xYDataItem4);
    }
}

