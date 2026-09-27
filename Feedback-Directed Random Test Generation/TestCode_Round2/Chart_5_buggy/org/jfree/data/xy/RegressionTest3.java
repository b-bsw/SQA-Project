package org.jfree.data.xy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L);
        double[][] doubleArray2 = xYSeries1.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.addOrUpdate((java.lang.Number) 2, (java.lang.Number) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNull(xYDataItem5);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        java.lang.Comparable comparable21 = xYSeries3.getKey();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener22);
        org.jfree.data.xy.XYSeries xYSeries26 = xYSeries3.createCopy(4, 3);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 10.0f + "'", comparable21, 10.0f);
        org.junit.Assert.assertNotNull(xYSeries26);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries3.removeChangeListener(seriesChangeListener27);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener33);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener35);
        xYSeries32.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int42 = xYSeries32.indexOf((java.lang.Number) 0.0f);
        java.util.List list43 = xYSeries32.getItems();
        xYSeries3.data = list43;
        xYSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = xYSeries3.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Failed to clone.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(list43);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        java.lang.String str35 = xYSeries3.getDescription();
        int int37 = xYSeries3.indexOf((java.lang.Number) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries41.removePropertyChangeListener(propertyChangeListener42);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries41.removePropertyChangeListener(propertyChangeListener44);
        xYSeries41.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        boolean boolean52 = xYSeries41.equals((java.lang.Object) false);
        xYSeries41.add((double) (byte) 10, (double) (byte) 10, true);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        xYSeries60.removePropertyChangeListener(propertyChangeListener61);
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        xYSeries60.removePropertyChangeListener(propertyChangeListener63);
        xYSeries60.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int70 = xYSeries60.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener71 = null;
        xYSeries60.addPropertyChangeListener(propertyChangeListener71);
        org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries60.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74, true);
        xYSeries41.add(xYDataItem74);
        org.jfree.data.xy.XYSeries xYSeries78 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74);
        org.jfree.data.xy.XYSeries xYSeries81 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74, false, false);
        xYSeries3.add(xYDataItem74, true);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(xYDataItem74);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) 100, 3);
        int int7 = xYSeries6.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries6.createCopy((int) (byte) 1, (int) (short) 10);
        boolean boolean11 = xYSeries6.getAutoSort();
        xYSeries6.add((double) (-3), 100.0d, false);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        boolean boolean6 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "", true);
        java.util.List list12 = xYSeries11.getItems();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener19);
        xYSeries16.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable25 = xYSeries16.getKey();
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener34);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener36);
        xYSeries33.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int43 = xYSeries33.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries33.addPropertyChangeListener(propertyChangeListener44);
        xYSeries33.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem51 = xYSeries33.remove(1);
        xYSeries29.add(xYDataItem51);
        org.jfree.data.xy.XYSeries xYSeries55 = xYSeries29.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem57 = xYSeries29.remove(0);
        xYSeries16.add(xYDataItem57);
        xYSeries11.add(xYDataItem57, true);
        xYSeries1.add(xYDataItem57, true);
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + 0L + "'", comparable25, 0L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(xYDataItem51);
        org.junit.Assert.assertNotNull(xYSeries55);
        org.junit.Assert.assertNotNull(xYDataItem57);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((-1.0d), (double) 10);
        xYSeries3.setMaximumItemCount(2147483647);
        java.lang.Object obj12 = xYSeries3.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries3.removeChangeListener(seriesChangeListener13);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        xYSeries3.add(0.0d, (java.lang.Number) 1.0d);
        xYSeries3.add((java.lang.Number) 3, (java.lang.Number) 0.0d);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 10);
        xYSeries1.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) 'a', 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries6.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        xYSeries3.clear();
        java.lang.Comparable comparable15 = xYSeries3.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries3.removeChangeListener(seriesChangeListener16);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 100 + "'", comparable15, (short) 100);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener14);
        xYSeries11.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray20 = xYSeries11.toArray();
        xYSeries11.add((double) 1, (java.lang.Number) (short) 1, true);
        int int26 = xYSeries11.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries30.add((double) 0.0f, 0.0d);
        xYSeries30.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean38 = xYSeries30.getAllowDuplicateXValues();
        xYSeries30.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        xYSeries51.removePropertyChangeListener(propertyChangeListener52);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries51.removePropertyChangeListener(propertyChangeListener54);
        xYSeries51.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int61 = xYSeries51.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries51.addPropertyChangeListener(propertyChangeListener62);
        xYSeries51.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem69 = xYSeries51.remove(1);
        xYSeries47.add(xYDataItem69);
        xYSeries43.add(xYDataItem69, false);
        xYSeries30.setKey((java.lang.Comparable) xYDataItem69);
        org.jfree.data.xy.XYSeries xYSeries75 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem69, false);
        xYSeries11.add(xYDataItem69);
        xYSeries1.add(xYDataItem69);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem69, false);
        org.jfree.data.xy.XYSeries xYSeries80 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem69);
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(xYDataItem69);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add(10.0d, (java.lang.Number) 0.0d);
        java.lang.Number number16 = xYSeries3.getY(0);
        java.lang.Comparable comparable17 = xYSeries3.getKey();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 0.0d + "'", number16, 0.0d);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 0L + "'", comparable17, 0L);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        xYSeries1.add((double) 1, (java.lang.Number) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertNotNull(xYDataItem31);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries3.addChangeListener(seriesChangeListener13);
        java.lang.Object obj15 = xYSeries3.clone();
        xYSeries3.setDescription("hi!");
        xYSeries3.add((double) (byte) 1, 100.0d);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 4, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 4");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(xYDataItem34);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(xYDataItem77);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.lang.Number number9 = xYSeries3.getY((int) (short) 0);
        double[][] doubleArray10 = xYSeries3.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (short) 100);
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 100, (java.lang.Number) 1L);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100, true);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries18.addPropertyChangeListener(propertyChangeListener19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = xYSeries18.getY((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertNotNull(xYDataItem16);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) (byte) 100, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) '#', (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        int int36 = xYSeries33.indexOf((java.lang.Number) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries39 = xYSeries33.createCopy((int) (short) 100, 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(xYSeries30);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(xYSeries39);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "");
        xYSeries1.add((double) 100L, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (byte) 10, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        boolean boolean7 = xYSeries1.getAutoSort();
        xYSeries1.add((java.lang.Number) (short) -1, (java.lang.Number) 1L, true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        int int4 = xYSeries3.getMaximumItemCount();
        xYSeries3.add((double) (-1.0f), (java.lang.Number) 1.0d, true);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, false);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener18);
        xYSeries15.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable24 = xYSeries15.getKey();
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener33);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener35);
        xYSeries32.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int42 = xYSeries32.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries32.addPropertyChangeListener(propertyChangeListener43);
        xYSeries32.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries32.remove(1);
        xYSeries28.add(xYDataItem50);
        org.jfree.data.xy.XYSeries xYSeries54 = xYSeries28.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries28.remove(0);
        xYSeries15.add(xYDataItem56);
        xYSeries11.setKey((java.lang.Comparable) xYDataItem56);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem56);
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem56, false, false);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem56);
        xYSeries3.add(xYDataItem56, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + 0L + "'", comparable24, 0L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(xYDataItem50);
        org.junit.Assert.assertNotNull(xYSeries54);
        org.junit.Assert.assertNotNull(xYDataItem56);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int13 = xYSeries12.getItemCount();
        java.util.List list14 = xYSeries12.getItems();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener19);
        int int22 = xYSeries18.indexOf((java.lang.Number) (short) 10);
        java.util.List list23 = xYSeries18.data;
        xYSeries12.data = list23;
        org.jfree.data.xy.XYSeries xYSeries27 = xYSeries12.createCopy((int) (short) 0, (int) (short) 10);
        xYSeries12.clear();
        boolean boolean29 = xYSeries12.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener34);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener36);
        xYSeries33.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int43 = xYSeries33.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries33.addPropertyChangeListener(propertyChangeListener44);
        xYSeries33.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
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
        xYSeries53.fireSeriesChanged();
        xYSeries53.setNotify(false);
        org.jfree.data.xy.XYDataItem xYDataItem81 = xYSeries53.remove(0);
        xYSeries33.add(xYDataItem81, true);
        org.jfree.data.xy.XYSeries xYSeries85 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem81, true);
        xYSeries12.add(xYDataItem81, false);
        xYSeries3.setKey((java.lang.Comparable) false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(xYDataItem75);
        org.junit.Assert.assertNotNull(xYDataItem81);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        xYSeries3.delete((int) (short) 10, (int) (short) 0);
        xYSeries3.update((java.lang.Number) (-1), (java.lang.Number) 1.0f);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener33);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener35);
        xYSeries32.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int42 = xYSeries32.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries32.addPropertyChangeListener(propertyChangeListener43);
        xYSeries32.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries32.remove(1);
        java.util.List list51 = xYSeries32.data;
        xYSeries3.data = list51;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number54 = xYSeries3.getX(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(xYDataItem50);
        org.junit.Assert.assertNotNull(list51);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.delete((int) (byte) 10, 2);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries13.createCopy((int) (byte) 100, 3);
        int int17 = xYSeries16.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries20 = xYSeries16.createCopy((int) (byte) 1, (int) (short) 10);
        boolean boolean21 = xYSeries3.equals((java.lang.Object) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries3.addChangeListener(seriesChangeListener22);
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true);
        java.util.List list3 = xYSeries2.data;
        xYSeries2.add((java.lang.Number) 2, (java.lang.Number) 2147483647);
        xYSeries2.fireSeriesChanged();
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem42, false);
        xYSeries48.clear();
        xYSeries48.add((double) '#', (double) (-1.0f), true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0f, false);
        java.lang.Comparable comparable3 = xYSeries2.getKey();
        int int4 = xYSeries2.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.delete((int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 0.0f + "'", comparable3, 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries3.removeChangeListener(seriesChangeListener27);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener33);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener35);
        xYSeries32.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int42 = xYSeries32.indexOf((java.lang.Number) 0.0f);
        java.util.List list43 = xYSeries32.getItems();
        xYSeries3.data = list43;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener45 = null;
        xYSeries3.addChangeListener(seriesChangeListener45);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(list43);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        java.lang.Class<?> wildcardClass16 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        xYSeries3.clear();
        xYSeries3.delete(10, (int) (short) 1);
        int int43 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener34);
        java.util.List list36 = xYSeries33.getItems();
        xYSeries33.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean41 = xYSeries33.getAllowDuplicateXValues();
        xYSeries33.add((double) (-1L), (double) (byte) 1);
        xYSeries33.add((double) 2147483647, (double) 'a', true);
        boolean boolean49 = xYSeries33.getNotify();
        java.util.List list50 = xYSeries33.getItems();
        java.lang.Number number52 = xYSeries33.getY(0);
        java.util.List list53 = xYSeries33.getItems();
        xYSeries3.data = list53;
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries59 = xYSeries56.createCopy((int) (short) 1, (int) 'a');
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
        org.jfree.data.xy.XYSeries xYSeries88 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85, false);
        xYSeries56.add(xYDataItem85);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem85);
        java.util.List list91 = xYSeries3.data;
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertEquals("'" + number52 + "' != '" + 1.0d + "'", number52, 1.0d);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(xYSeries59);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(xYDataItem85);
        org.junit.Assert.assertNotNull(list91);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, true, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        java.util.List list58 = xYSeries3.data;
        int int60 = xYSeries3.indexOf((java.lang.Number) 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable15 = xYSeries14.getKey();
        xYSeries14.clear();
        xYSeries14.add((double) (-1.0f), (double) (short) 10, false);
        java.lang.Number number22 = null;
        xYSeries14.update((java.lang.Number) (-1.0d), number22);
        java.lang.Comparable comparable24 = xYSeries14.getKey();
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener29);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener31);
        xYSeries28.add((double) 1, (double) 3, false);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries44.removePropertyChangeListener(propertyChangeListener45);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        xYSeries44.removePropertyChangeListener(propertyChangeListener47);
        xYSeries44.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int54 = xYSeries44.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        xYSeries44.addPropertyChangeListener(propertyChangeListener55);
        xYSeries44.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries44.remove(1);
        xYSeries40.add(xYDataItem62);
        org.jfree.data.xy.XYSeries xYSeries66 = xYSeries40.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem68 = xYSeries40.remove(0);
        xYSeries28.setKey((java.lang.Comparable) xYDataItem68);
        xYSeries14.add(xYDataItem68, false);
        xYSeries3.add(xYDataItem68);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + '#' + "'", comparable15, '#');
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + '#' + "'", comparable24, '#');
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(xYDataItem62);
        org.junit.Assert.assertNotNull(xYSeries66);
        org.junit.Assert.assertNotNull(xYDataItem68);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
            xYSeries1.update((java.lang.Number) 10.0f, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.delete((int) (byte) 10, 2);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.xy.XYSeries xYSeries16 = xYSeries13.createCopy((int) (byte) 100, 3);
        int int17 = xYSeries16.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries20 = xYSeries16.createCopy((int) (byte) 1, (int) (short) 10);
        boolean boolean21 = xYSeries3.equals((java.lang.Object) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener26);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener28);
        xYSeries25.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries25.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 0, false, false);
        java.lang.Comparable comparable38 = xYSeries37.getKey();
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener39);
        xYSeries37.add((double) (byte) 100, (double) (-5908509288197150436L), false);
        java.util.List list45 = xYSeries37.data;
        xYSeries3.data = list45;
        org.junit.Assert.assertNotNull(xYSeries16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + (byte) 0 + "'", comparable38, (byte) 0);
        org.junit.Assert.assertNotNull(list45);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 'a', true, false);
        double[][] doubleArray4 = xYSeries3.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries3.addChangeListener(seriesChangeListener5);
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        xYSeries3.setMaximumItemCount(2);
        boolean boolean24 = xYSeries3.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener25);
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries3.addOrUpdate((double) (byte) 0, (double) 4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(xYDataItem29);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((java.lang.Number) 10, (java.lang.Number) 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries3.addOrUpdate((double) 10, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -3, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        xYSeries48.add((double) (-5908509288197150436L), (double) (short) 10, true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries29.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) 100L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        xYSeries29.addChangeListener(seriesChangeListener33);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener35);
        boolean boolean37 = xYSeries29.isEmpty();
        boolean boolean38 = xYSeries29.getAutoSort();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener24);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener26);
        xYSeries23.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int33 = xYSeries23.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries41.removePropertyChangeListener(propertyChangeListener42);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries41.removePropertyChangeListener(propertyChangeListener44);
        xYSeries41.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int51 = xYSeries41.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        xYSeries41.addPropertyChangeListener(propertyChangeListener52);
        xYSeries41.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem59 = xYSeries41.remove(1);
        xYSeries37.add(xYDataItem59);
        org.jfree.data.xy.XYSeries xYSeries63 = xYSeries37.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem65 = xYSeries37.remove(0);
        int int67 = xYSeries37.indexOf((java.lang.Number) 0L);
        java.lang.String str68 = xYSeries37.getDescription();
        xYSeries37.add((double) 2147483647, (java.lang.Number) 1, false);
        boolean boolean73 = xYSeries23.equals((java.lang.Object) 1);
        boolean boolean74 = xYSeries3.equals((java.lang.Object) xYSeries23);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete(10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 1.0d + "'", number13, 1.0d);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(xYDataItem59);
        org.junit.Assert.assertNotNull(xYSeries63);
        org.junit.Assert.assertNotNull(xYDataItem65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-5908509288197150436L));
        xYSeries1.add((double) 0.0f, (java.lang.Number) 0.0d, true);
        xYSeries1.add((double) 1L, (double) (byte) 1);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries3.createCopy((-2), 1);
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
        xYSeries3.setKey((java.lang.Comparable) false);
        java.lang.Comparable comparable41 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setKey(comparable41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(xYDataItem36);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        boolean boolean19 = xYSeries3.getAutoSort();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        double[][] doubleArray27 = xYSeries3.toArray();
        xYSeries3.delete(3, (-2));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray27);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries2.addChangeListener(seriesChangeListener3);
        boolean boolean5 = xYSeries2.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener12);
        xYSeries9.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int19 = xYSeries9.indexOf((java.lang.Number) 0.0f);
        xYSeries9.add((double) (-1), (java.lang.Number) 1.0d, false);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener28);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener30);
        xYSeries27.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray36 = xYSeries27.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries27.getDataItem((int) (short) 0);
        xYSeries9.add(xYDataItem38);
        xYSeries2.add(xYDataItem38, false);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries42.getDataItem((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(xYDataItem38);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        int int6 = xYSeries3.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy((-2), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries3.getX((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        xYSeries3.clear();
        xYSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((double) 1, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        xYSeries1.setNotify(false);
        int int8 = xYSeries1.getMaximumItemCount();
        double[][] doubleArray9 = xYSeries1.toArray();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        xYSeries1.add((java.lang.Number) (byte) 1, (java.lang.Number) 0);
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener34);
        java.util.List list36 = xYSeries33.getItems();
        xYSeries33.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean41 = xYSeries33.getAllowDuplicateXValues();
        xYSeries33.add((double) (-1L), (double) (byte) 1);
        xYSeries33.add((double) 2147483647, (double) 'a', true);
        boolean boolean49 = xYSeries33.getNotify();
        java.util.List list50 = xYSeries33.getItems();
        java.lang.Number number52 = xYSeries33.getY(0);
        java.util.List list53 = xYSeries33.getItems();
        xYSeries3.data = list53;
        xYSeries3.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertEquals("'" + number52 + "' != '" + 1.0d + "'", number52, 1.0d);
        org.junit.Assert.assertNotNull(list53);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.fireSeriesChanged();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (short) -1 + "'", comparable3, (short) -1);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        xYSeries6.setMaximumItemCount((int) (byte) 100);
        xYSeries6.add((java.lang.Number) 100.0f, (java.lang.Number) 10.0d, false);
        xYSeries6.add((double) 1L, (java.lang.Number) (short) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        xYSeries6.removeChangeListener(seriesChangeListener39);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries30.addOrUpdate((double) 1, (double) 3);
        xYSeries30.setKey((java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries30.getDataItem((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
        org.junit.Assert.assertNull(xYDataItem35);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.fireSeriesChanged();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((double) (byte) 10, (java.lang.Number) (-1.0d));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((java.lang.Number) 3, (java.lang.Number) 100.0f);
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (short) -1 + "'", comparable3, (short) -1);
        org.junit.Assert.assertNull(xYDataItem9);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        boolean boolean7 = xYSeries3.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener14);
        int int16 = xYSeries11.getItemCount();
        xYSeries11.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        java.util.List list20 = xYSeries11.getItems();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener25);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener27);
        xYSeries24.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries24.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 0, true);
        java.util.List list36 = xYSeries35.getItems();
        xYSeries11.data = list36;
        boolean boolean38 = xYSeries3.equals((java.lang.Object) xYSeries11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        xYSeries28.setDescription("");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries2.addOrUpdate((java.lang.Number) (short) -1, (java.lang.Number) 0.0d);
        boolean boolean36 = xYSeries2.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(xYDataItem35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        double[][] doubleArray4 = xYSeries3.toArray();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = xYSeries3.getY((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        boolean boolean5 = xYSeries4.getNotify();
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
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem27, false);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem27, false);
        xYSeries4.add(xYDataItem27, false);
        xYSeries2.add(xYDataItem27, false);
        java.lang.Number number37 = xYSeries2.getY(0);
        xYSeries2.add((double) (short) 1, (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(xYDataItem27);
        org.junit.Assert.assertEquals("'" + number37 + "' != '" + (byte) 10 + "'", number37, (byte) 10);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        java.lang.String str7 = xYSeries3.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries3.getX(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener32);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener34);
        xYSeries31.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        java.util.List list40 = xYSeries31.data;
        xYSeries3.data = list40;
        xYSeries3.add((double) (byte) 100, 0.0d, true);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(list40);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries2.addOrUpdate((java.lang.Number) (short) -1, (java.lang.Number) 0.0d);
        xYSeries2.setDescription("");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(xYDataItem35);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        int int10 = xYSeries3.getItemCount();
        boolean boolean11 = xYSeries3.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener18);
        java.lang.Comparable comparable20 = xYSeries15.getKey();
        java.lang.Object obj21 = xYSeries15.clone();
        java.util.List list22 = xYSeries15.data;
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries26.add((double) 0.0f, 0.0d);
        xYSeries26.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean34 = xYSeries26.getAllowDuplicateXValues();
        xYSeries26.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
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
        xYSeries39.add(xYDataItem65, false);
        xYSeries26.setKey((java.lang.Comparable) xYDataItem65);
        xYSeries15.add(xYDataItem65);
        boolean boolean71 = xYSeries3.equals((java.lang.Object) xYSeries15);
        boolean boolean72 = xYSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 0L + "'", comparable20, 0L);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(xYDataItem65);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        xYSeries4.removePropertyChangeListener(propertyChangeListener68);
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + 0L + "'", comparable31, 0L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(xYDataItem57);
        org.junit.Assert.assertNotNull(xYSeries61);
        org.junit.Assert.assertNotNull(xYDataItem63);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
            xYSeries3.delete((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', false, false);
        java.util.List list4 = xYSeries3.data;
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener5);
        xYSeries3.add((double) (short) 1, (java.lang.Number) (byte) 100);
        xYSeries3.setDescription("");
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem42, false);
        xYSeries48.clear();
        int int51 = xYSeries48.indexOf((java.lang.Number) 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (-1), (java.lang.Number) 1.0d, false);
        java.util.List list18 = xYSeries3.data;
        xYSeries3.add((java.lang.Number) (short) 1, (java.lang.Number) (short) 100, true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        java.lang.Number number80 = null;
        int int81 = xYSeries79.indexOf(number80);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(xYDataItem71);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem42, false);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem42, true);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem42);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        xYSeries3.fireSeriesChanged();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertNotNull(xYDataItem36);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(10, (-1));
        int int10 = xYSeries9.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        xYSeries3.fireSeriesChanged();
        xYSeries3.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        int int24 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries28 = xYSeries25.createCopy((int) (short) -1, (int) '#');
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries25.addPropertyChangeListener(propertyChangeListener29);
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
        xYSeries25.setKey((java.lang.Comparable) xYDataItem73);
        org.jfree.data.xy.XYSeries xYSeries81 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem73);
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem73);
        xYSeries3.add(xYDataItem73);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYSeries28);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(xYDataItem73);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        xYSeries3.setMaximumItemCount((int) (byte) 100);
        java.lang.Object obj8 = null;
        boolean boolean9 = xYSeries3.equals(obj8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100L, true);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        xYSeries29.removeChangeListener(seriesChangeListener38);
        java.lang.String str40 = xYSeries29.getDescription();
        java.lang.Number number42 = null;
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries29.addOrUpdate((java.lang.Number) 4, number42);
        xYSeries29.setMaximumItemCount((int) (byte) 10);
        java.lang.String str46 = xYSeries29.getDescription();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(xYDataItem43);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        xYSeries23.add((java.lang.Number) (short) 0, (java.lang.Number) (-1.0d), true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        int int6 = xYSeries3.getItemCount();
        xYSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.remove((java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        xYSeries3.add((java.lang.Number) 1L, (java.lang.Number) 2147483647, false);
        xYSeries3.setMaximumItemCount(3);
        xYSeries3.add((double) (-2), (double) 1);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        double[][] doubleArray19 = xYSeries3.toArray();
        xYSeries3.clear();
        xYSeries3.setDescription("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray19);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries30 = xYSeries27.createCopy((int) (short) 1, (int) 'a');
        java.util.List list31 = xYSeries30.getItems();
        xYSeries5.data = list31;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(xYSeries30);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
            java.lang.Number number17 = xYSeries3.getY((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, false);
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        boolean boolean5 = xYSeries2.equals((java.lang.Object) (-1.0d));
        int int6 = xYSeries2.getMaximumItemCount();
        java.util.List list7 = xYSeries2.data;
        boolean boolean8 = xYSeries2.getAllowDuplicateXValues();
        xYSeries2.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        boolean boolean7 = xYSeries3.getAllowDuplicateXValues();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((-1.0d), (double) 10);
        java.lang.Object obj10 = null;
        boolean boolean11 = xYSeries3.equals(obj10);
        java.lang.Class<?> wildcardClass12 = xYSeries3.getClass();
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        int int7 = xYSeries6.getMaximumItemCount();
        boolean boolean8 = xYSeries6.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries6.updateByIndex((int) (short) -1, (java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        xYSeries3.add((double) (short) -1, (double) (short) 1);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 0L + "'", comparable8, 0L);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(xYDataItem53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        xYSeries3.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries3.removeChangeListener(seriesChangeListener8);
        double[][] doubleArray10 = xYSeries3.toArray();
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy(100, (int) (byte) 10);
        int int10 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy((int) 'a', (int) (byte) 0);
        xYSeries1.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries1.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(xYSeries13);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        java.lang.Comparable comparable38 = xYSeries37.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries37.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertNotNull(comparable38);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        double[][] doubleArray6 = xYSeries3.toArray();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) (-1L));
        xYSeries3.add((java.lang.Number) (short) 10, (java.lang.Number) (-1L), false);
        xYSeries3.updateByIndex(0, (java.lang.Number) (-1));
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener23);
        xYSeries20.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray29 = xYSeries20.toArray();
        xYSeries20.add((double) 1, (java.lang.Number) (short) 1, true);
        boolean boolean34 = xYSeries20.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries36.add((double) 100.0f, (java.lang.Number) (-1.0d), true);
        java.util.List list41 = xYSeries36.data;
        boolean boolean42 = xYSeries20.equals((java.lang.Object) list41);
        xYSeries3.data = list41;
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable2 = xYSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = xYSeries1.getX((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + '#' + "'", comparable2, '#');
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        double[][] doubleArray6 = xYSeries3.toArray();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener7);
        int int9 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (-1.0d), (java.lang.Number) 100.0f);
        boolean boolean7 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy(100, (int) (byte) 10);
        java.lang.String str10 = xYSeries1.getDescription();
        xYSeries1.setMaximumItemCount((int) (short) 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries3.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable2 = xYSeries1.getKey();
        xYSeries1.clear();
        xYSeries1.add((double) (-1.0f), (double) (short) 10, false);
        int int8 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + '#' + "'", comparable2, '#');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (-1), (java.lang.Number) 1.0d, false);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener24);
        xYSeries21.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray30 = xYSeries21.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries21.getDataItem((int) (short) 0);
        xYSeries3.add(xYDataItem32);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem32, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries35.remove((java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(xYDataItem32);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        double[][] doubleArray4 = xYSeries3.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries3.addOrUpdate((java.lang.Number) 100.0d, (java.lang.Number) 1.0f);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((double) 1L, (double) 4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNull(xYDataItem7);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        boolean boolean37 = xYSeries29.getNotify();
        java.util.List list38 = xYSeries29.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries29.addOrUpdate((java.lang.Number) 10.0d, (java.lang.Number) 0.0f);
        xYSeries29.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNull(xYDataItem41);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 0, false, false);
        java.lang.Comparable comparable16 = xYSeries15.getKey();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener17);
        xYSeries15.add((double) (byte) 100, (double) (-5908509288197150436L), false);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries15.addPropertyChangeListener(propertyChangeListener23);
        java.util.List list25 = xYSeries15.data;
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 0 + "'", comparable16, (byte) 0);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 0, false, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries15.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYDataItem12);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        xYSeries1.add((double) 1, (java.lang.Number) 100.0d);
        xYSeries1.setMaximumItemCount((int) '4');
        xYSeries1.clear();
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertNotNull(xYDataItem31);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        int int43 = xYSeries3.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener44);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem17, true);
        xYSeries19.setDescription("hi!");
        boolean boolean22 = xYSeries19.getAllowDuplicateXValues();
        xYSeries19.add((double) (byte) 1, (java.lang.Number) 10L, false);
        java.lang.Number number28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries19.addOrUpdate((java.lang.Number) 1, number28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries3.removeChangeListener(seriesChangeListener27);
        xYSeries3.add((-1.0d), (double) 1L, false);
        xYSeries3.add((double) 'a', (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number42 = xYSeries29.getX(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        xYSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries3.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 1.0d + "'", number13, 1.0d);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
        xYSeries1.delete(2, (int) (short) 0);
        xYSeries1.delete((int) 'a', (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + number53 + "' != '" + (byte) 10 + "'", number53, (byte) 10);
        org.junit.Assert.assertEquals("'" + comparable54 + "' != '" + 0L + "'", comparable54, 0L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        java.lang.Class<?> wildcardClass42 = xYSeries29.getClass();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        xYSeries3.setMaximumItemCount((int) ' ');
        xYSeries3.add((double) (byte) 100, (double) 2147483647, true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((-1.0d), (double) 10);
        xYSeries3.setMaximumItemCount(2147483647);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener13);
        java.lang.Number number16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) (byte) 0, number16);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem9);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        boolean boolean37 = xYSeries29.getNotify();
        java.util.List list38 = xYSeries29.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries29.addOrUpdate((java.lang.Number) 10.0d, (java.lang.Number) 0.0f);
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries29.addOrUpdate((double) 100.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNull(xYDataItem41);
        org.junit.Assert.assertNotNull(xYDataItem44);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        xYSeries48.removeChangeListener(seriesChangeListener49);
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries48.addOrUpdate((java.lang.Number) (-1.0d), (java.lang.Number) 100.0f);
        int int54 = xYSeries48.getItemCount();
        boolean boolean55 = xYSeries1.equals((java.lang.Object) int54);
        java.util.List list56 = xYSeries1.getItems();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertNull(xYDataItem53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(list56);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = xYSeries1.getX((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries4);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener6);
        xYSeries1.add((double) (short) 0, (double) 100L);
        boolean boolean11 = xYSeries1.getNotify();
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        xYSeries1.add((double) (byte) 10, (double) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        xYSeries3.updateByIndex((int) (short) 0, (java.lang.Number) 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        java.lang.Comparable comparable3 = xYSeries2.getKey();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries2.removePropertyChangeListener(propertyChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries2.remove((java.lang.Number) (-5908509288197150436L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (short) 1 + "'", comparable3, (short) 1);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) 100.0f, (java.lang.Number) (-1.0d), true);
        xYSeries1.add((double) '4', (double) (-2));
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        int int13 = xYSeries11.indexOf((java.lang.Number) (-1L));
        xYSeries11.setNotify(true);
        java.util.List list16 = xYSeries11.getItems();
        boolean boolean17 = xYSeries1.equals((java.lang.Object) list16);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries1.removeChangeListener(seriesChangeListener18);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        xYSeries3.setNotify(false);
        int int20 = xYSeries3.getMaximumItemCount();
        xYSeries3.clear();
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem36, false, false);
        xYSeries44.setDescription("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(xYDataItem36);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        xYSeries24.add((double) 'a', (double) 0.0f, false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        int int7 = xYSeries3.indexOf((java.lang.Number) (short) 10);
        java.util.List list8 = xYSeries3.data;
        java.util.List list9 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries3.createCopy((-2), 0);
        xYSeries12.add((double) (-1), 10.0d, true);
        java.lang.Class<?> wildcardClass17 = xYSeries12.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(xYSeries12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        xYSeries3.add((double) (short) 10, (java.lang.Number) 1.0d, false);
        java.util.List list18 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int23 = xYSeries22.getItemCount();
        xYSeries22.add((java.lang.Number) (short) -1, (java.lang.Number) 0.0d);
        java.lang.Comparable comparable27 = xYSeries22.getKey();
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
        xYSeries31.fireSeriesChanged();
        java.util.List list56 = xYSeries31.getItems();
        xYSeries22.data = list56;
        xYSeries3.data = list56;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number60 = xYSeries3.getY((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + 10L + "'", comparable27, 10L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(xYDataItem53);
        org.junit.Assert.assertNotNull(list56);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        java.util.List list33 = xYSeries3.getItems();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries11.createCopy(2, (int) ' ');
        xYSeries11.setDescription("hi!");
        int int17 = xYSeries11.getMaximumItemCount();
        boolean boolean18 = xYSeries3.equals((java.lang.Object) xYSeries11);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener19);
        boolean boolean21 = xYSeries3.getNotify();
        java.lang.String str22 = xYSeries3.getDescription();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        int int4 = xYSeries2.indexOf((java.lang.Number) (-1L));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries2.removeChangeListener(seriesChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = xYSeries2.getY(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries44.addOrUpdate((double) 100.0f, (double) 0);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        xYSeries51.removePropertyChangeListener(propertyChangeListener52);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries51.removePropertyChangeListener(propertyChangeListener54);
        xYSeries51.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int61 = xYSeries51.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        xYSeries65.removePropertyChangeListener(propertyChangeListener66);
        java.util.List list68 = xYSeries65.getItems();
        xYSeries51.data = list68;
        xYSeries51.fireSeriesChanged();
        java.util.List list71 = xYSeries51.data;
        xYSeries44.data = list71;
        java.util.List list73 = xYSeries44.getItems();
        xYSeries29.data = list73;
        java.lang.Comparable comparable75 = xYSeries29.getKey();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(xYDataItem47);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertEquals("'" + comparable75 + "' != '" + true + "'", comparable75, true);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        xYSeries3.delete((int) (short) 10, (int) (short) 0);
        xYSeries3.add((double) (-1L), (java.lang.Number) 2, false);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener34);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener36);
        xYSeries33.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        boolean boolean44 = xYSeries33.equals((java.lang.Object) false);
        xYSeries33.add((double) (byte) 10, (double) (byte) 10, true);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        xYSeries52.removePropertyChangeListener(propertyChangeListener53);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        xYSeries52.removePropertyChangeListener(propertyChangeListener55);
        xYSeries52.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int62 = xYSeries52.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        xYSeries52.addPropertyChangeListener(propertyChangeListener63);
        org.jfree.data.xy.XYDataItem xYDataItem66 = xYSeries52.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem66, true);
        xYSeries33.add(xYDataItem66);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem66, false, true);
        xYSeries3.add(xYDataItem66, true);
        java.lang.Object obj75 = xYSeries3.clone();
        java.lang.Object obj76 = xYSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem79 = xYSeries3.addOrUpdate((java.lang.Number) (byte) -1, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -2, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(xYDataItem66);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertNotNull(obj76);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        int int13 = xYSeries3.indexOf((java.lang.Number) 2);
        double[][] doubleArray14 = xYSeries3.toArray();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        java.util.List list42 = xYSeries29.data;
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        xYSeries46.removePropertyChangeListener(propertyChangeListener47);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries46.removePropertyChangeListener(propertyChangeListener49);
        xYSeries46.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int56 = xYSeries46.indexOf((java.lang.Number) 0.0f);
        xYSeries46.add((double) (-1), (java.lang.Number) 1.0d, false);
        java.util.List list61 = xYSeries46.data;
        xYSeries29.data = list61;
        xYSeries29.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        xYSeries29.addPropertyChangeListener(propertyChangeListener64);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(list61);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = xYSeries30.getY(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries24.createCopy(3, (int) '4');
        xYSeries24.add((double) 10L, 10.0d, true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(xYSeries29);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        boolean boolean68 = xYSeries67.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener69 = null;
        xYSeries67.removeChangeListener(seriesChangeListener69);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0L + "'", comparable15, 0L);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(xYDataItem60);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        xYSeries3.setDescription("hi!");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        java.util.List list31 = xYSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = xYSeries1.getY((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(xYDataItem27);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries3.removeChangeListener(seriesChangeListener27);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener33);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener35);
        xYSeries32.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int42 = xYSeries32.indexOf((java.lang.Number) 0.0f);
        java.util.List list43 = xYSeries32.getItems();
        xYSeries3.data = list43;
        xYSeries3.setNotify(false);
        boolean boolean47 = xYSeries3.getAutoSort();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        xYSeries1.setMaximumItemCount(0);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener6);
        boolean boolean8 = xYSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable2 = xYSeries1.getKey();
        xYSeries1.clear();
        xYSeries1.add((double) (-1.0f), (double) (short) 10, false);
        java.lang.Number number9 = null;
        xYSeries1.update((java.lang.Number) (-1.0d), number9);
        java.lang.Comparable comparable11 = xYSeries1.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.remove((java.lang.Number) (-1));
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + '#' + "'", comparable2, '#');
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + '#' + "'", comparable11, '#');
        org.junit.Assert.assertNotNull(xYDataItem13);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        xYSeries3.clear();
        java.lang.Number number21 = null;
        xYSeries3.add((double) (byte) 1, number21, true);
        java.lang.Comparable comparable24 = xYSeries3.getKey();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + 0L + "'", comparable24, 0L);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        xYSeries3.setKey((java.lang.Comparable) 10);
        double[][] doubleArray12 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        java.util.List list58 = xYSeries3.data;
        org.jfree.data.xy.XYSeries xYSeries61 = xYSeries3.createCopy((int) '4', (-2));
        xYSeries61.add((java.lang.Number) 0.0f, (java.lang.Number) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(xYSeries61);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries24 = xYSeries21.createCopy((int) (short) 1, (int) 'a');
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener33);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener35);
        xYSeries32.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int42 = xYSeries32.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries32.addPropertyChangeListener(propertyChangeListener43);
        xYSeries32.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries32.remove(1);
        xYSeries28.add(xYDataItem50);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem50, false);
        xYSeries21.add(xYDataItem50);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem50);
        xYSeries3.add((double) 1, (java.lang.Number) 10L, true);
        xYSeries3.delete(0, 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYSeries24);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(xYDataItem50);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        java.lang.Comparable comparable6 = xYSeries3.getKey();
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
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries10.remove(0);
        xYSeries3.add(xYDataItem30);
        java.lang.Object obj32 = xYSeries3.clone();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 0L + "'", comparable6, 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, false);
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener9);
        xYSeries6.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable15 = xYSeries6.getKey();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener24);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener26);
        xYSeries23.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int33 = xYSeries23.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries23.addPropertyChangeListener(propertyChangeListener34);
        xYSeries23.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries23.remove(1);
        xYSeries19.add(xYDataItem41);
        org.jfree.data.xy.XYSeries xYSeries45 = xYSeries19.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries19.remove(0);
        xYSeries6.add(xYDataItem47);
        xYSeries2.setKey((java.lang.Comparable) xYDataItem47);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47, true);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0L + "'", comparable15, 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(xYDataItem41);
        org.junit.Assert.assertNotNull(xYSeries45);
        org.junit.Assert.assertNotNull(xYDataItem47);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries3.addChangeListener(seriesChangeListener14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries3.removeChangeListener(seriesChangeListener16);
        xYSeries3.fireSeriesChanged();
        xYSeries3.clear();
        int int20 = xYSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener67 = null;
        xYSeries3.addChangeListener(seriesChangeListener67);
        int int70 = xYSeries3.indexOf((java.lang.Number) 10.0f);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0L + "'", comparable15, 0L);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(xYDataItem60);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-2) + "'", int70 == (-2));
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        xYSeries3.delete((int) (short) 10, (int) (short) 0);
        xYSeries3.add((double) (-1L), (java.lang.Number) 2, false);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener34);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener36);
        xYSeries33.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        boolean boolean44 = xYSeries33.equals((java.lang.Object) false);
        xYSeries33.add((double) (byte) 10, (double) (byte) 10, true);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        xYSeries52.removePropertyChangeListener(propertyChangeListener53);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        xYSeries52.removePropertyChangeListener(propertyChangeListener55);
        xYSeries52.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int62 = xYSeries52.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        xYSeries52.addPropertyChangeListener(propertyChangeListener63);
        org.jfree.data.xy.XYDataItem xYDataItem66 = xYSeries52.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem66, true);
        xYSeries33.add(xYDataItem66);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem66, false, true);
        xYSeries3.add(xYDataItem66, true);
        java.lang.Object obj75 = xYSeries3.clone();
        xYSeries3.add((double) 2, (double) 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(xYDataItem66);
        org.junit.Assert.assertNotNull(obj75);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener40);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener42);
        xYSeries39.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int49 = xYSeries39.indexOf((java.lang.Number) 0.0f);
        xYSeries39.add((double) (-1), (java.lang.Number) 1.0d, false);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries57.removePropertyChangeListener(propertyChangeListener58);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        xYSeries57.removePropertyChangeListener(propertyChangeListener60);
        xYSeries57.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray66 = xYSeries57.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem68 = xYSeries57.getDataItem((int) (short) 0);
        xYSeries39.add(xYDataItem68);
        xYSeries9.add(xYDataItem68, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number73 = xYSeries9.getX(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertNotNull(xYDataItem68);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener20);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener26);
        java.util.List list28 = xYSeries25.getItems();
        xYSeries17.data = list28;
        xYSeries3.data = list28;
        boolean boolean32 = xYSeries3.equals((java.lang.Object) (byte) 10);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        xYSeries35.addChangeListener(seriesChangeListener36);
        boolean boolean38 = xYSeries35.getAutoSort();
        boolean boolean39 = xYSeries3.equals((java.lang.Object) xYSeries35);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((double) (-1.0f), (double) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        java.lang.String str13 = xYSeries3.getDescription();
        boolean boolean14 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener19);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener21);
        xYSeries18.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray27 = xYSeries18.toArray();
        xYSeries18.fireSeriesChanged();
        java.util.List list29 = xYSeries18.getItems();
        xYSeries3.data = list29;
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener22);
        java.util.List list24 = xYSeries21.getItems();
        xYSeries7.data = list24;
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener30);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener32);
        xYSeries29.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int39 = xYSeries29.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries43.removePropertyChangeListener(propertyChangeListener44);
        java.util.List list46 = xYSeries43.getItems();
        xYSeries29.data = list46;
        xYSeries7.data = list46;
        boolean boolean49 = xYSeries3.equals((java.lang.Object) list46);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0.0d, (java.lang.Number) 10);
        xYSeries1.add((double) 3, (java.lang.Number) (-5908509288197150436L));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.addOrUpdate(0.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        int int7 = xYSeries3.indexOf((java.lang.Number) (byte) 100);
        boolean boolean8 = xYSeries3.getAllowDuplicateXValues();
        java.lang.Number number9 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update(number9, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "");
        xYSeries1.add((double) 100L, (double) (-1));
        int int5 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries7.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean11 = xYSeries7.isEmpty();
        xYSeries7.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.util.List list20 = xYSeries17.getItems();
        xYSeries17.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean25 = xYSeries17.getAllowDuplicateXValues();
        int int27 = xYSeries17.indexOf((java.lang.Number) 2);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries31.setDescription("");
        java.lang.String str34 = xYSeries31.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries31.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries41.add((double) 0.0f, 0.0d);
        xYSeries41.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean49 = xYSeries41.getAllowDuplicateXValues();
        xYSeries41.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
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
        xYSeries54.add(xYDataItem80, false);
        xYSeries41.setKey((java.lang.Comparable) xYDataItem80);
        xYSeries31.add(xYDataItem80, true);
        xYSeries17.add(xYDataItem80, true);
        org.jfree.data.xy.XYSeries xYSeries91 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem80, true, false);
        org.jfree.data.xy.XYSeries xYSeries93 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem80, true);
        xYSeries7.add(xYDataItem80);
        xYSeries1.add(xYDataItem80, false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(xYDataItem37);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(xYDataItem80);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        int int7 = xYSeries3.indexOf((java.lang.Number) (byte) 100);
        boolean boolean8 = xYSeries3.getNotify();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 1, false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        xYSeries1.setNotify(true);
        xYSeries1.add((double) (short) 100, (double) (short) 0);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries1.addOrUpdate((java.lang.Number) (-2), (java.lang.Number) (short) 0);
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(xYDataItem13);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        xYSeries1.setNotify(false);
        int int8 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries1.createCopy((int) '#', 2);
        java.lang.String str12 = xYSeries1.getDescription();
        xYSeries1.add((double) 1L, (double) 3);
        xYSeries1.setNotify(true);
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable12 = xYSeries3.getKey();
        java.lang.Number number14 = xYSeries3.getX((int) (short) 0);
        java.lang.Number number16 = xYSeries3.getY((int) (short) 0);
        java.lang.Object obj17 = xYSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (byte) 0 + "'", number14, (byte) 0);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + (byte) 10 + "'", number16, (byte) 10);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        java.lang.String str18 = xYSeries3.getDescription();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries6.addPropertyChangeListener(propertyChangeListener31);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add(10.0d, (java.lang.Number) 0.0d);
        xYSeries3.delete((int) (byte) 100, (int) (short) 10);
        boolean boolean18 = xYSeries3.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries3.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) -1);
        java.util.List list15 = xYSeries3.getItems();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 1, (java.lang.Number) (short) 1, true);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries3.addOrUpdate((java.lang.Number) 10.0d, (java.lang.Number) (-1L));
        xYSeries3.setNotify(true);
        xYSeries3.add((double) '4', (java.lang.Number) 100.0f);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.addChangeListener(seriesChangeListener6);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries1.removeChangeListener(seriesChangeListener8);
        java.lang.String str10 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        boolean boolean23 = xYSeries3.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener24);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + 0L + "'", comparable22, 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        xYSeries5.add((double) 100, (java.lang.Number) 10.0f, false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(0, 2);
        boolean boolean10 = xYSeries9.getAllowDuplicateXValues();
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2, false, false);
        java.lang.String str4 = xYSeries3.getDescription();
        xYSeries3.add((double) ' ', (double) 0.0f);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        int int19 = xYSeries3.indexOf((java.lang.Number) 10.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries3.removeChangeListener(seriesChangeListener20);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries3.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.add((double) 1, 100.0d, true);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((double) (short) -1, (double) (short) 10);
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.addOrUpdate((java.lang.Number) 100L, (java.lang.Number) 1.0d);
        xYSeries1.add((double) (short) 100, (double) '#');
        xYSeries1.clear();
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertNull(xYDataItem11);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        xYSeries1.setNotify(false);
        int int8 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries1.createCopy((int) '#', 2);
        boolean boolean12 = xYSeries11.getNotify();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
            org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries37.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        xYSeries6.removeChangeListener(seriesChangeListener30);
        xYSeries6.add((double) '4', 0.0d);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries3.addChangeListener(seriesChangeListener14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries3.removeChangeListener(seriesChangeListener16);
        boolean boolean18 = xYSeries3.getNotify();
        boolean boolean19 = xYSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        int int4 = xYSeries3.getMaximumItemCount();
        double[][] doubleArray5 = xYSeries3.toArray();
        boolean boolean6 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((-1.0d), (double) (byte) 10, true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "", false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
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
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries15.addOrUpdate((java.lang.Number) (byte) 0, (java.lang.Number) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener26);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener28);
        xYSeries25.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries25.remove((int) (byte) 0);
        xYSeries15.add(xYDataItem34);
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertNull(xYDataItem21);
        org.junit.Assert.assertNotNull(xYDataItem34);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0.0d, (java.lang.Number) 10);
        xYSeries1.add((double) 3, (java.lang.Number) (-5908509288197150436L));
        xYSeries1.add((double) 3, (java.lang.Number) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = xYSeries1.getX(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Object obj2 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener7);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        java.util.List list23 = xYSeries3.data;
        xYSeries3.setDescription("");
        boolean boolean26 = xYSeries3.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((-1.0d), (double) 0.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        xYSeries1.setNotify(false);
        int int8 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        boolean boolean12 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.clear();
        int int9 = xYSeries3.indexOf((java.lang.Number) 100.0f);
        int int10 = xYSeries3.getItemCount();
        xYSeries3.add((java.lang.Number) 0.0f, (java.lang.Number) (byte) 10);
        java.util.List list14 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener19);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries18.removePropertyChangeListener(propertyChangeListener21);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener27);
        java.util.List list29 = xYSeries26.getItems();
        xYSeries18.data = list29;
        xYSeries3.data = list29;
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem3 = xYSeries1.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true);
        xYSeries2.delete((int) (short) 1, 0);
        xYSeries2.add((double) 2, (double) (-1.0f), false);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.setDescription("");
        java.lang.String str11 = xYSeries3.getDescription();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener22);
        xYSeries19.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int29 = xYSeries19.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries19.addPropertyChangeListener(propertyChangeListener30);
        xYSeries19.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries19.remove(1);
        xYSeries15.add(xYDataItem37);
        org.jfree.data.xy.XYSeries xYSeries41 = xYSeries15.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries15.remove(0);
        xYSeries3.setKey((java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(xYDataItem37);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertNotNull(xYDataItem43);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (-1), true);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener34);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener36);
        int int38 = xYSeries33.getItemCount();
        boolean boolean39 = xYSeries33.getNotify();
        int int41 = xYSeries33.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries45.add((double) 0.0f, 0.0d);
        xYSeries45.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean53 = xYSeries45.getAllowDuplicateXValues();
        xYSeries45.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        xYSeries66.removePropertyChangeListener(propertyChangeListener67);
        java.beans.PropertyChangeListener propertyChangeListener69 = null;
        xYSeries66.removePropertyChangeListener(propertyChangeListener69);
        xYSeries66.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int76 = xYSeries66.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener77 = null;
        xYSeries66.addPropertyChangeListener(propertyChangeListener77);
        xYSeries66.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem84 = xYSeries66.remove(1);
        xYSeries62.add(xYDataItem84);
        xYSeries58.add(xYDataItem84, false);
        xYSeries45.setKey((java.lang.Comparable) xYDataItem84);
        org.jfree.data.xy.XYSeries xYSeries90 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem84, false);
        xYSeries33.add(xYDataItem84, false);
        xYSeries3.setKey((java.lang.Comparable) false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(xYDataItem84);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        boolean boolean16 = xYSeries3.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries3.addChangeListener(seriesChangeListener17);
        xYSeries3.add((double) (short) 0, (double) (-1.0f), true);
        boolean boolean23 = xYSeries3.getAutoSort();
        java.lang.String str24 = xYSeries3.getDescription();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        java.lang.Number number13 = xYSeries3.getX((int) (byte) 0);
        xYSeries3.add((double) (short) 1, (java.lang.Number) (byte) 0, true);
        boolean boolean18 = xYSeries3.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.addOrUpdate((double) (byte) -1, (double) 100L);
        xYSeries3.fireSeriesChanged();
        java.lang.Number number24 = xYSeries3.getY(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 1.0d + "'", number13, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(xYDataItem21);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 100.0d + "'", number24, 100.0d);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
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
        xYSeries23.setDescription("hi!");
        xYSeries23.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener33);
        java.lang.Comparable comparable35 = xYSeries30.getKey();
        java.lang.Object obj36 = xYSeries30.clone();
        java.util.List list37 = xYSeries30.data;
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries41.add((double) 0.0f, 0.0d);
        xYSeries41.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean49 = xYSeries41.getAllowDuplicateXValues();
        xYSeries41.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
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
        xYSeries54.add(xYDataItem80, false);
        xYSeries41.setKey((java.lang.Comparable) xYDataItem80);
        xYSeries30.add(xYDataItem80);
        xYSeries23.add(xYDataItem80);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem80);
        int int88 = xYSeries3.getMaximumItemCount();
        int int90 = xYSeries3.indexOf((java.lang.Number) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + 0L + "'", comparable35, 0L);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(xYDataItem80);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 2147483647 + "'", int88 == 2147483647);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
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
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem26, false, false);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true, true);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        org.jfree.data.xy.XYSeries xYSeries44 = xYSeries41.createCopy((int) (short) 10, (int) (short) 10);
        xYSeries44.add((java.lang.Number) 10.0f, (java.lang.Number) (-1), true);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertNotNull(xYSeries44);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        int int4 = xYSeries2.indexOf((java.lang.Number) (-1L));
        xYSeries2.setNotify(true);
        java.lang.Comparable comparable7 = xYSeries2.getKey();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (-1.0d) + "'", comparable7, (-1.0d));
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true);
        boolean boolean3 = xYSeries2.getAutoSort();
        boolean boolean4 = xYSeries2.isEmpty();
        xYSeries2.add((java.lang.Number) (byte) 0, (java.lang.Number) (-2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        int int7 = xYSeries3.indexOf((java.lang.Number) 0.0d);
        boolean boolean9 = xYSeries3.equals((java.lang.Object) 0.0d);
        xYSeries3.setDescription("");
        java.util.List list12 = xYSeries3.data;
        xYSeries3.add((double) (byte) 1, (double) 1, true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        double[][] doubleArray6 = xYSeries3.toArray();
        java.lang.Object obj7 = xYSeries3.clone();
        xYSeries3.setDescription("hi!");
        xYSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries6.addOrUpdate((java.lang.Number) (short) -1, (java.lang.Number) 0L);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries6.addPropertyChangeListener(propertyChangeListener10);
        xYSeries6.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries6.removeChangeListener(seriesChangeListener14);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        xYSeries3.setKey((java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries15.addOrUpdate((java.lang.Number) (byte) 0, (java.lang.Number) 2147483647);
        boolean boolean22 = xYSeries15.getAllowDuplicateXValues();
        int int23 = xYSeries15.getItemCount();
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        xYSeries3.add(0.0d, (java.lang.Number) (short) 0);
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries3.remove((int) (short) 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertNotNull(xYDataItem39);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        xYSeries1.setKey((java.lang.Comparable) 100.0d);
        java.lang.String str4 = xYSeries1.getDescription();
        boolean boolean5 = xYSeries1.getAllowDuplicateXValues();
        java.util.List list6 = xYSeries1.data;
        xYSeries1.add((double) (byte) 100, (double) (-1L));
        xYSeries1.add((double) (-1), (java.lang.Number) (short) 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable2 = xYSeries1.getKey();
        xYSeries1.clear();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener4);
        int int6 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries14.removePropertyChangeListener(propertyChangeListener15);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries14.removePropertyChangeListener(propertyChangeListener17);
        xYSeries14.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int24 = xYSeries14.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries14.addPropertyChangeListener(propertyChangeListener25);
        xYSeries14.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries14.remove(1);
        xYSeries10.add(xYDataItem32);
        org.jfree.data.xy.XYSeries xYSeries36 = xYSeries10.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries36.addOrUpdate((double) (short) 100, (double) (byte) 1);
        xYSeries36.add((double) 0L, (java.lang.Number) 1.0d, false);
        boolean boolean44 = xYSeries36.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries36.addPropertyChangeListener(propertyChangeListener45);
        boolean boolean47 = xYSeries36.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries51.addOrUpdate((double) 100.0f, (double) 0);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        xYSeries58.removePropertyChangeListener(propertyChangeListener59);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        xYSeries58.removePropertyChangeListener(propertyChangeListener61);
        xYSeries58.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int68 = xYSeries58.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        xYSeries72.removePropertyChangeListener(propertyChangeListener73);
        java.util.List list75 = xYSeries72.getItems();
        xYSeries58.data = list75;
        xYSeries58.fireSeriesChanged();
        java.util.List list78 = xYSeries58.data;
        xYSeries51.data = list78;
        java.util.List list80 = xYSeries51.getItems();
        xYSeries36.data = list80;
        xYSeries1.data = list80;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem84 = xYSeries1.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + '#' + "'", comparable2, '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(xYDataItem32);
        org.junit.Assert.assertNotNull(xYSeries36);
        org.junit.Assert.assertNull(xYDataItem39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(xYDataItem54);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(list75);
        org.junit.Assert.assertNotNull(list78);
        org.junit.Assert.assertNotNull(list80);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add(10.0d, (java.lang.Number) 0.0d);
        java.lang.Object obj15 = xYSeries3.clone();
        xYSeries3.add((double) 10, (java.lang.Number) 10.0f);
        java.lang.Number number20 = xYSeries3.getY((int) (short) 0);
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries3.remove((java.lang.Number) 10);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10, true);
        xYSeries24.add((java.lang.Number) (short) 1, (java.lang.Number) (byte) 1, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
        org.junit.Assert.assertNotNull(xYDataItem22);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(0, (int) (short) -1);
        xYSeries3.add((double) (short) -1, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = xYSeries3.getY((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNotNull(xYSeries9);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries11.createCopy(2, (int) ' ');
        xYSeries11.setDescription("hi!");
        int int17 = xYSeries11.getMaximumItemCount();
        boolean boolean18 = xYSeries3.equals((java.lang.Object) xYSeries11);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener19);
        boolean boolean21 = xYSeries3.getNotify();
        int int22 = xYSeries3.getItemCount();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem40, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(xYDataItem40);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) 100, 3);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((java.lang.Number) 10.0f, (java.lang.Number) (-2));
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries29.getDataItem(1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        xYSeries29.addChangeListener(seriesChangeListener41);
        java.lang.Object obj43 = xYSeries29.clone();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        xYSeries23.fireSeriesChanged();
        xYSeries23.setNotify(false);
        org.jfree.data.xy.XYDataItem xYDataItem51 = xYSeries23.remove(0);
        xYSeries3.add(xYDataItem51, true);
        double[][] doubleArray54 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries3.getDataItem(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertNotNull(xYDataItem51);
        org.junit.Assert.assertNotNull(doubleArray54);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        xYSeries1.delete(2, (int) (short) 0);
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener72 = null;
        xYSeries71.removePropertyChangeListener(propertyChangeListener72);
        java.beans.PropertyChangeListener propertyChangeListener74 = null;
        xYSeries71.removePropertyChangeListener(propertyChangeListener74);
        xYSeries71.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int81 = xYSeries71.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener82 = null;
        xYSeries71.addPropertyChangeListener(propertyChangeListener82);
        xYSeries71.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem89 = xYSeries71.remove(1);
        xYSeries67.add(xYDataItem89);
        org.jfree.data.xy.XYSeries xYSeries92 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem89, false);
        xYSeries63.add(xYDataItem89);
        org.jfree.data.xy.XYSeries xYSeries94 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem89);
        org.jfree.data.xy.XYSeries xYSeries97 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem89, true, false);
        xYSeries1.add(xYDataItem89, false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + number53 + "' != '" + (byte) 10 + "'", number53, (byte) 10);
        org.junit.Assert.assertEquals("'" + comparable54 + "' != '" + 0L + "'", comparable54, 0L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(xYDataItem89);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries3.createCopy((-2), 1);
        xYSeries3.add((double) '4', (java.lang.Number) (-2), true);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener15);
        org.junit.Assert.assertNotNull(xYSeries10);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        xYSeries1.setMaximumItemCount(0);
        int int4 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
        boolean boolean21 = xYSeries3.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries3.remove(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 0L + "'", comparable18, 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(xYDataItem23);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        int int13 = xYSeries3.indexOf((java.lang.Number) 10.0f);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        xYSeries48.add((java.lang.Number) 4, (java.lang.Number) (byte) 0, true);
        xYSeries48.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add(10.0d, (java.lang.Number) 10L, true);
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.remove((java.lang.Number) (byte) 10);
        xYSeries1.add((double) 2, (-1.0d), true);
        java.lang.String str12 = xYSeries1.getDescription();
        boolean boolean13 = xYSeries1.getNotify();
        java.util.List list14 = xYSeries1.getItems();
        xYSeries1.setNotify(false);
        org.junit.Assert.assertNotNull(xYDataItem7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        int int30 = xYSeries1.getItemCount();
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        xYSeries1.add(0.0d, (double) (byte) 10, false);
        xYSeries1.add((java.lang.Number) 0L, (java.lang.Number) 1L, false);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener38);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex(3, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        xYSeries3.add((double) '4', (java.lang.Number) (byte) 0, true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) true);
        xYSeries1.add((double) 1.0f, (-1.0d));
        java.lang.Comparable comparable15 = xYSeries1.getKey();
        xYSeries1.fireSeriesChanged();
        int int17 = xYSeries1.getMaximumItemCount();
        boolean boolean18 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (byte) 1 + "'", comparable15, (byte) 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        org.jfree.data.xy.XYSeries xYSeries81 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f));
        boolean boolean82 = xYSeries9.equals((java.lang.Object) (-1.0f));
        java.beans.PropertyChangeListener propertyChangeListener83 = null;
        xYSeries9.addPropertyChangeListener(propertyChangeListener83);
        org.jfree.data.xy.XYSeries xYSeries86 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d);
        xYSeries86.add((java.lang.Number) 10.0f, (java.lang.Number) 0, false);
        boolean boolean91 = xYSeries86.getAllowDuplicateXValues();
        boolean boolean92 = xYSeries9.equals((java.lang.Object) boolean91);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(xYDataItem27);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(xYDataItem70);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) 10.0f, (double) (short) 1, true);
        boolean boolean11 = xYSeries3.getNotify();
        boolean boolean12 = xYSeries3.getAutoSort();
        xYSeries3.add((double) (-1L), (double) (byte) 1, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        java.lang.Comparable comparable80 = xYSeries79.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener81 = null;
        xYSeries79.removeChangeListener(seriesChangeListener81);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(xYDataItem71);
        org.junit.Assert.assertNotNull(comparable80);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        xYSeries3.add((java.lang.Number) 1L, (java.lang.Number) 2147483647, false);
        java.lang.Number number13 = null;
        xYSeries3.add((java.lang.Number) 10.0d, number13);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
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
        java.lang.Comparable comparable29 = xYSeries3.getKey();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + 0L + "'", comparable25, 0L);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + 0L + "'", comparable29, 0L);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        xYSeries3.add(10.0d, (java.lang.Number) (-1.0d));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.addChangeListener(seriesChangeListener9);
        xYSeries3.add((double) 100, (java.lang.Number) 10.0d, true);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Object obj2 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries1.removeChangeListener(seriesChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener7);
        int int9 = xYSeries1.getItemCount();
        boolean boolean10 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        xYSeries3.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries30.add((double) 0.0f, 0.0d);
        xYSeries30.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean38 = xYSeries30.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries42.removePropertyChangeListener(propertyChangeListener43);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries42.removePropertyChangeListener(propertyChangeListener45);
        xYSeries42.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int52 = xYSeries42.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        xYSeries56.removePropertyChangeListener(propertyChangeListener57);
        java.util.List list59 = xYSeries56.getItems();
        xYSeries42.data = list59;
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        xYSeries64.removePropertyChangeListener(propertyChangeListener65);
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        xYSeries64.removePropertyChangeListener(propertyChangeListener67);
        xYSeries64.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int74 = xYSeries64.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries78 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener79 = null;
        xYSeries78.removePropertyChangeListener(propertyChangeListener79);
        java.util.List list81 = xYSeries78.getItems();
        xYSeries64.data = list81;
        xYSeries42.data = list81;
        xYSeries30.data = list81;
        java.util.List list85 = xYSeries30.data;
        xYSeries3.data = list85;
        int int87 = xYSeries3.getItemCount();
        boolean boolean88 = xYSeries3.getAutoSort();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(list81);
        org.junit.Assert.assertNotNull(list85);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "", true);
        java.util.List list3 = xYSeries2.getItems();
        boolean boolean4 = xYSeries2.getAutoSort();
        xYSeries2.add((double) (short) 10, (java.lang.Number) (byte) 0, true);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries5.removePropertyChangeListener(propertyChangeListener6);
        java.util.List list8 = xYSeries5.getItems();
        xYSeries1.data = list8;
        int int11 = xYSeries1.indexOf((java.lang.Number) (byte) 100);
        xYSeries1.setNotify(true);
        int int15 = xYSeries1.indexOf((java.lang.Number) 4);
        int int16 = xYSeries1.getItemCount();
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        java.util.List list12 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener19);
        xYSeries16.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries16.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 0, true);
        java.util.List list28 = xYSeries27.getItems();
        xYSeries3.data = list28;
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        xYSeries32.setNotify(false);
        xYSeries32.setDescription("hi!");
        boolean boolean37 = xYSeries3.equals((java.lang.Object) xYSeries32);
        xYSeries3.setMaximumItemCount((int) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        xYSeries3.addChangeListener(seriesChangeListener40);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        java.lang.Comparable comparable21 = xYSeries3.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries3.addChangeListener(seriesChangeListener22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = xYSeries3.getX((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 10.0f + "'", comparable21, 10.0f);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.addChangeListener(seriesChangeListener6);
        xYSeries1.setMaximumItemCount((int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        boolean boolean12 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100);
        int int2 = xYSeries1.getMaximumItemCount();
        xYSeries1.setMaximumItemCount(10);
        java.lang.Comparable comparable5 = xYSeries1.getKey();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 100 + "'", comparable5, 100);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        boolean boolean16 = xYSeries3.isEmpty();
        xYSeries3.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener23);
        java.util.List list25 = xYSeries22.getItems();
        xYSeries22.clear();
        xYSeries22.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener33);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener35);
        xYSeries32.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int42 = xYSeries32.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries32.addPropertyChangeListener(propertyChangeListener43);
        xYSeries32.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries32.remove(1);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem50, false);
        xYSeries22.add(xYDataItem50);
        xYSeries3.add(xYDataItem50, true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(xYDataItem50);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44);
        xYSeries46.add(1.0d, (java.lang.Number) 100);
        xYSeries46.add((double) 10.0f, (double) 4);
        boolean boolean53 = xYSeries46.getAllowDuplicateXValues();
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false);
        java.lang.String str42 = xYSeries41.getDescription();
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((-1.0d), (double) 10);
        xYSeries3.setMaximumItemCount(2147483647);
        xYSeries3.clear();
        xYSeries3.setMaximumItemCount(4);
        xYSeries3.add(0.0d, (double) 'a');
        java.util.List list18 = xYSeries3.data;
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(0, 2);
        xYSeries9.add((double) 1.0f, (double) 1L, true);
        org.junit.Assert.assertNotNull(xYSeries9);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries39.addOrUpdate((java.lang.Number) (byte) -1, (java.lang.Number) 2147483647);
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertNull(xYDataItem42);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        java.util.List list21 = xYSeries3.getItems();
        java.lang.Object obj22 = xYSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete(2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem18);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        org.jfree.data.xy.XYSeries xYSeries44 = xYSeries41.createCopy((int) (short) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries44.update((java.lang.Number) 100, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertNotNull(xYSeries44);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        java.lang.String str13 = xYSeries3.getDescription();
        boolean boolean14 = xYSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries3.addOrUpdate((java.lang.Number) 0.0f, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        java.util.List list3 = xYSeries2.getItems();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries7.setNotify(false);
        boolean boolean10 = xYSeries7.getNotify();
        java.lang.String str11 = xYSeries7.getDescription();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener16);
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
        xYSeries15.add(xYDataItem38);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem38, true, false);
        xYSeries7.setKey((java.lang.Comparable) xYDataItem38);
        xYSeries2.add(xYDataItem38);
        java.util.List list45 = xYSeries2.data;
        java.lang.Comparable comparable46 = xYSeries2.getKey();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + (-1.0d) + "'", comparable46, (-1.0d));
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (-1L), (double) (byte) 1);
        xYSeries3.add((double) 2147483647, (double) 'a', true);
        boolean boolean19 = xYSeries3.getNotify();
        xYSeries3.fireSeriesChanged();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
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
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem28, false);
        xYSeries2.add(xYDataItem28);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem28);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem28, true);
        java.util.List list36 = xYSeries35.data;
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 0, true);
        java.util.List list15 = xYSeries14.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries14.addChangeListener(seriesChangeListener16);
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2, false, false);
        java.lang.String str4 = xYSeries3.getDescription();
        boolean boolean5 = xYSeries3.getNotify();
        xYSeries3.clear();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        xYSeries3.addChangeListener(seriesChangeListener28);
        boolean boolean30 = xYSeries3.getAutoSort();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        org.jfree.data.xy.XYSeries xYSeries32 = xYSeries26.createCopy(1, (int) (short) 0);
        java.lang.Object obj33 = xYSeries32.clone();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYSeries32);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
        java.lang.Comparable comparable38 = xYSeries37.getKey();
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries(comparable38);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries(comparable38, false, false);
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertNotNull(comparable38);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        double[][] doubleArray6 = xYSeries3.toArray();
        java.lang.Object obj7 = xYSeries3.clone();
        xYSeries3.setDescription("hi!");
        xYSeries3.add((double) (-1), (double) 100L, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) (short) 100, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 0, 1.0d, true);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries3.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) (byte) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries3.addChangeListener(seriesChangeListener20);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
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
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47, false);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47, false);
        xYSeries25.add(xYDataItem47, false);
        xYSeries3.add(xYDataItem47, false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(xYDataItem47);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false, true);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) 10.0f, (double) (short) 1, true);
        boolean boolean11 = xYSeries3.getNotify();
        int int13 = xYSeries3.indexOf((java.lang.Number) 0);
        java.util.List list14 = xYSeries3.data;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        boolean boolean25 = xYSeries3.getNotify();
        boolean boolean26 = xYSeries3.getAutoSort();
        boolean boolean27 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener32);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener34);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener40);
        java.util.List list42 = xYSeries39.getItems();
        xYSeries31.data = list42;
        boolean boolean44 = xYSeries31.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener45 = null;
        xYSeries31.addChangeListener(seriesChangeListener45);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        xYSeries31.addPropertyChangeListener(propertyChangeListener47);
        boolean boolean49 = xYSeries3.equals((java.lang.Object) xYSeries31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        int int4 = xYSeries2.indexOf((java.lang.Number) (-1L));
        xYSeries2.setNotify(true);
        boolean boolean7 = xYSeries2.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries2.addChangeListener(seriesChangeListener8);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener16);
        xYSeries13.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int23 = xYSeries13.indexOf((java.lang.Number) 0.0f);
        xYSeries13.add((double) (-1), (java.lang.Number) 1.0d, false);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries13.addPropertyChangeListener(propertyChangeListener28);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries34 = xYSeries31.createCopy((int) (short) 1, (int) 'a');
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
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem60, false);
        xYSeries31.add(xYDataItem60);
        xYSeries13.setKey((java.lang.Comparable) xYDataItem60);
        xYSeries2.add(xYDataItem60, true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(xYSeries34);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(xYDataItem60);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add(10.0d, (java.lang.Number) 10L, true);
        xYSeries1.setDescription("");
        xYSeries1.add((java.lang.Number) 0, (java.lang.Number) (-5908509288197150436L), false);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
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
        xYSeries23.fireSeriesChanged();
        xYSeries23.setNotify(false);
        org.jfree.data.xy.XYDataItem xYDataItem51 = xYSeries23.remove(0);
        xYSeries3.add(xYDataItem51, true);
        java.lang.String str54 = xYSeries3.getDescription();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertNotNull(xYDataItem51);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false);
        boolean boolean3 = xYSeries2.getNotify();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setDescription("hi!");
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) 1.0f);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.util.List list19 = xYSeries16.getItems();
        xYSeries16.clear();
        xYSeries16.setNotify(true);
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
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44, false);
        xYSeries16.add(xYDataItem44);
        xYSeries3.add(xYDataItem44);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries3.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(xYDataItem44);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.removeChangeListener(seriesChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener8);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
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
        xYSeries3.setMaximumItemCount((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        xYSeries1.setNotify(false);
        int int8 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener14);
        java.util.List list16 = xYSeries13.getItems();
        xYSeries13.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean21 = xYSeries13.getAllowDuplicateXValues();
        int int23 = xYSeries13.indexOf((java.lang.Number) 2);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries27.setDescription("");
        java.lang.String str30 = xYSeries27.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries27.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries37.add((double) 0.0f, 0.0d);
        xYSeries37.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean45 = xYSeries37.getAllowDuplicateXValues();
        xYSeries37.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        xYSeries58.removePropertyChangeListener(propertyChangeListener59);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        xYSeries58.removePropertyChangeListener(propertyChangeListener61);
        xYSeries58.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int68 = xYSeries58.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener69 = null;
        xYSeries58.addPropertyChangeListener(propertyChangeListener69);
        xYSeries58.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem76 = xYSeries58.remove(1);
        xYSeries54.add(xYDataItem76);
        xYSeries50.add(xYDataItem76, false);
        xYSeries37.setKey((java.lang.Comparable) xYDataItem76);
        xYSeries27.add(xYDataItem76, true);
        xYSeries13.add(xYDataItem76, true);
        org.jfree.data.xy.XYSeries xYSeries87 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem76, true, false);
        org.jfree.data.xy.XYSeries xYSeries88 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem76);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem76);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(3, (java.lang.Number) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2) + "'", int23 == (-2));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(xYDataItem33);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(xYDataItem76);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add(10.0d, (java.lang.Number) 10L, true);
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.remove((java.lang.Number) (byte) 10);
        xYSeries1.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries1.getX(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYDataItem7);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        int int2 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = xYSeries3.getY(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
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
        boolean boolean34 = xYSeries3.getAutoSort();
        int int35 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
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
        boolean boolean25 = xYSeries3.getNotify();
        boolean boolean26 = xYSeries3.getAutoSort();
        boolean boolean27 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (-1), (double) (-2), true);
        java.util.List list32 = xYSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries3.remove((java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        xYSeries3.add((double) ' ', (java.lang.Number) 100, false);
        java.lang.String str38 = xYSeries3.getDescription();
        xYSeries3.setDescription("");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener22);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem18);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        int int4 = xYSeries3.getMaximumItemCount();
        java.lang.Number number5 = null;
        int int6 = xYSeries3.indexOf(number5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        xYSeries3.add((double) 3, (double) 4, false);
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries3.createCopy((int) '4', 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(xYSeries15);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        boolean boolean14 = xYSeries3.equals((java.lang.Object) false);
        xYSeries3.add((double) (byte) 10, (double) (byte) 10, true);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener23);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener25);
        xYSeries22.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int32 = xYSeries22.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries22.addPropertyChangeListener(propertyChangeListener33);
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries22.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem36, true);
        xYSeries3.add(xYDataItem36);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem36);
        xYSeries40.add((double) 100, (double) 4, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries40.update((java.lang.Number) 10.0f, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(xYDataItem36);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        xYSeries29.add((java.lang.Number) (short) 100, (java.lang.Number) (-5908509288197150436L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number51 = xYSeries29.getX((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertNotNull(xYDataItem45);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        int int4 = xYSeries3.getItemCount();
        xYSeries3.add((java.lang.Number) 10.0d, (java.lang.Number) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = xYSeries3.getY((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem46, true, false);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (byte) 0 + "'", number14, (byte) 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertNotNull(xYDataItem46);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 10);
        xYSeries1.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        xYSeries7.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int17 = xYSeries7.indexOf((java.lang.Number) 0.0f);
        xYSeries7.add((double) (-1), (java.lang.Number) 1.0d, false);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener26);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener28);
        xYSeries25.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray34 = xYSeries25.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries25.getDataItem((int) (short) 0);
        xYSeries7.add(xYDataItem36);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem36, false);
        xYSeries1.setKey((java.lang.Comparable) false);
        boolean boolean41 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener14);
        xYSeries11.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray20 = xYSeries11.toArray();
        xYSeries11.add((double) 1, (java.lang.Number) (short) 1, true);
        int int26 = xYSeries11.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries30.add((double) 0.0f, 0.0d);
        xYSeries30.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean38 = xYSeries30.getAllowDuplicateXValues();
        xYSeries30.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        xYSeries51.removePropertyChangeListener(propertyChangeListener52);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries51.removePropertyChangeListener(propertyChangeListener54);
        xYSeries51.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int61 = xYSeries51.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries51.addPropertyChangeListener(propertyChangeListener62);
        xYSeries51.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem69 = xYSeries51.remove(1);
        xYSeries47.add(xYDataItem69);
        xYSeries43.add(xYDataItem69, false);
        xYSeries30.setKey((java.lang.Comparable) xYDataItem69);
        org.jfree.data.xy.XYSeries xYSeries75 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem69, false);
        xYSeries11.add(xYDataItem69);
        xYSeries1.add(xYDataItem69);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem69, false);
        double[][] doubleArray80 = xYSeries79.toArray();
        xYSeries79.add((double) (byte) 10, (java.lang.Number) (short) -1, true);
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(xYDataItem69);
        org.junit.Assert.assertNotNull(doubleArray80);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        java.lang.Comparable comparable3 = xYSeries2.getKey();
        xYSeries2.setDescription("hi!");
        java.util.List list6 = xYSeries2.getItems();
        java.lang.String str7 = xYSeries2.getDescription();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (-1.0d) + "'", comparable3, (-1.0d));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries23.addOrUpdate((double) '4', (double) (short) 100);
        xYSeries23.setMaximumItemCount((int) (byte) 10);
        xYSeries23.add((double) 1, 10.0d);
        xYSeries23.setDescription("");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNull(xYDataItem26);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        xYSeries39.removeChangeListener(seriesChangeListener40);
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
        org.jfree.data.xy.XYSeries xYSeries71 = xYSeries45.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries71.addOrUpdate((double) (short) 100, (double) (byte) 1);
        boolean boolean75 = xYSeries39.equals((java.lang.Object) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries78 = xYSeries39.createCopy(100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(xYDataItem67);
        org.junit.Assert.assertNotNull(xYSeries71);
        org.junit.Assert.assertNull(xYDataItem74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(xYSeries78);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        double[][] doubleArray6 = xYSeries3.toArray();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) (-1L));
        xYSeries3.add((java.lang.Number) (short) 10, (java.lang.Number) (-1L), false);
        xYSeries3.add((double) (-1), (java.lang.Number) 1.0f);
        boolean boolean17 = xYSeries3.isEmpty();
        xYSeries3.add((java.lang.Number) (-1L), (java.lang.Number) (-2));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries14.setNotify(false);
        boolean boolean17 = xYSeries14.getNotify();
        java.lang.String str18 = xYSeries14.getDescription();
        boolean boolean19 = xYSeries3.equals((java.lang.Object) xYSeries14);
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries3.createCopy((int) (byte) 10, (int) (short) -1);
        boolean boolean23 = xYSeries22.getNotify();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
        java.lang.Class<?> wildcardClass53 = xYSeries3.getClass();
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertNotNull(xYSeries52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        boolean boolean18 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries3.createCopy(0, (-1));
        xYSeries21.add((double) 1, (double) 1);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (byte) 0 + "'", number14, (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(xYSeries21);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
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
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem46, true, false);
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
        org.jfree.data.xy.XYSeries xYSeries81 = xYSeries55.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem84 = xYSeries81.addOrUpdate((double) (short) 100, (double) (byte) 1);
        xYSeries81.add((double) 0L, (java.lang.Number) 1.0d, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener89 = null;
        xYSeries81.removeChangeListener(seriesChangeListener89);
        org.jfree.data.xy.XYDataItem xYDataItem92 = xYSeries81.getDataItem(1);
        xYSeries51.add(xYDataItem92);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (byte) 0 + "'", number14, (byte) 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertNotNull(xYDataItem46);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(xYDataItem77);
        org.junit.Assert.assertNotNull(xYSeries81);
        org.junit.Assert.assertNull(xYDataItem84);
        org.junit.Assert.assertNotNull(xYDataItem92);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-2), false);
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        double[][] doubleArray7 = xYSeries6.toArray();
        boolean boolean8 = xYSeries2.equals((java.lang.Object) doubleArray7);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries10.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.lang.Number number15 = null;
        xYSeries10.add((java.lang.Number) (byte) 10, number15, false);
        boolean boolean18 = xYSeries2.equals((java.lang.Object) false);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add(10.0d, (java.lang.Number) 0.0d);
        java.lang.Object obj15 = xYSeries3.clone();
        xYSeries3.setMaximumItemCount(0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        xYSeries3.setKey((java.lang.Comparable) 10);
        double[][] doubleArray12 = xYSeries3.toArray();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "", true);
        boolean boolean16 = xYSeries15.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries18.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean22 = xYSeries18.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries18.addPropertyChangeListener(propertyChangeListener23);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener29);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener31);
        xYSeries28.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray37 = xYSeries28.toArray();
        xYSeries28.add((double) 1, (java.lang.Number) (short) 1, true);
        int int43 = xYSeries28.indexOf((java.lang.Number) 1.0d);
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
        org.jfree.data.xy.XYSeries xYSeries92 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem86, false);
        xYSeries28.add(xYDataItem86);
        xYSeries18.add(xYDataItem86);
        xYSeries15.setKey((java.lang.Comparable) xYDataItem86);
        xYSeries3.add(xYDataItem86);
        org.jfree.data.xy.XYSeries xYSeries98 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem86, true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(xYDataItem86);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        org.jfree.data.xy.XYSeries xYSeries70 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem63);
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + 0L + "'", comparable31, 0L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(xYDataItem57);
        org.junit.Assert.assertNotNull(xYSeries61);
        org.junit.Assert.assertNotNull(xYDataItem63);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.fireSeriesChanged();
        java.util.List list14 = xYSeries3.getItems();
        boolean boolean15 = xYSeries3.getNotify();
        int int17 = xYSeries3.indexOf((java.lang.Number) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
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
        xYSeries3.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy((int) ' ', (-1));
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener30);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertNotNull(xYSeries29);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.fireSeriesChanged();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((double) (byte) 10, (java.lang.Number) (-1.0d));
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((java.lang.Number) 3, (java.lang.Number) 100.0f);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', false, false);
        java.util.List list17 = xYSeries16.data;
        xYSeries12.data = list17;
        xYSeries1.data = list17;
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (short) -1 + "'", comparable3, (short) -1);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
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
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries44.removePropertyChangeListener(propertyChangeListener45);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        xYSeries44.removePropertyChangeListener(propertyChangeListener47);
        xYSeries44.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int54 = xYSeries44.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        xYSeries44.addPropertyChangeListener(propertyChangeListener55);
        xYSeries44.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries44.remove(1);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem62);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem62);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(xYDataItem62);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        double[][] doubleArray6 = xYSeries3.toArray();
        xYSeries3.setDescription("");
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
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
        boolean boolean46 = xYSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        java.lang.Comparable comparable16 = xYSeries3.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries3.remove((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 0L + "'", comparable16, 0L);
        org.junit.Assert.assertNotNull(xYDataItem18);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        double[][] doubleArray4 = xYSeries3.toArray();
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
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
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries28.addPropertyChangeListener(propertyChangeListener32);
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries28.addOrUpdate((java.lang.Number) 10, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries38.fireSeriesChanged();
        java.lang.Comparable comparable40 = xYSeries38.getKey();
        xYSeries38.add((double) (byte) 10, (java.lang.Number) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable46 = xYSeries45.getKey();
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
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
        xYSeries50.add(xYDataItem72);
        org.jfree.data.xy.XYSeries xYSeries76 = xYSeries50.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem78 = xYSeries50.remove(0);
        xYSeries45.setKey((java.lang.Comparable) xYDataItem78);
        xYSeries38.setKey((java.lang.Comparable) xYDataItem78);
        xYSeries28.setKey((java.lang.Comparable) xYDataItem78);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNull(xYDataItem36);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + (short) -1 + "'", comparable40, (short) -1);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + '#' + "'", comparable46, '#');
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(xYDataItem72);
        org.junit.Assert.assertNotNull(xYSeries76);
        org.junit.Assert.assertNotNull(xYDataItem78);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        boolean boolean17 = xYSeries3.getAllowDuplicateXValues();
        boolean boolean18 = xYSeries3.getAutoSort();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) 10.0f, (double) (short) 1, true);
        boolean boolean11 = xYSeries3.getNotify();
        boolean boolean12 = xYSeries3.getAutoSort();
        java.lang.Comparable comparable13 = xYSeries3.getKey();
        int int14 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 0L + "'", comparable13, 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        java.lang.String str13 = xYSeries3.getDescription();
        boolean boolean14 = xYSeries3.getNotify();
        xYSeries3.add((java.lang.Number) (-2), (java.lang.Number) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 1.0d, (java.lang.Number) (-2));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
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
        xYSeries3.setMaximumItemCount(10);
        int int30 = xYSeries3.indexOf((java.lang.Number) 100.0d);
        xYSeries3.add((java.lang.Number) (-3), (java.lang.Number) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        xYSeries1.setKey((java.lang.Comparable) 100.0d);
        xYSeries1.clear();
        xYSeries1.setMaximumItemCount((int) 'a');
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
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
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener22);
        int int24 = xYSeries3.getItemCount();
        xYSeries3.setNotify(false);
        int int27 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        boolean boolean20 = xYSeries3.getAutoSort();
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        java.lang.String str6 = xYSeries3.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.addChangeListener(seriesChangeListener7);
        java.lang.Object obj9 = null;
        boolean boolean10 = xYSeries3.equals(obj9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((-1.0d), (double) 10);
        boolean boolean10 = xYSeries3.getNotify();
        xYSeries3.add(0.0d, (double) (-1));
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        xYSeries32.delete((int) '4', 0);
        int int50 = xYSeries32.indexOf((java.lang.Number) 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-2) + "'", int50 == (-2));
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        java.lang.String str6 = xYSeries3.getDescription();
        xYSeries3.add((java.lang.Number) 4, (java.lang.Number) (byte) -1, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
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
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener40);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener42);
        xYSeries39.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int49 = xYSeries39.indexOf((java.lang.Number) 0.0f);
        xYSeries39.add((double) (-1), (java.lang.Number) 1.0d, false);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries57.removePropertyChangeListener(propertyChangeListener58);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        xYSeries57.removePropertyChangeListener(propertyChangeListener60);
        xYSeries57.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray66 = xYSeries57.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem68 = xYSeries57.getDataItem((int) (short) 0);
        xYSeries39.add(xYDataItem68);
        xYSeries9.add(xYDataItem68, true);
        org.jfree.data.xy.XYSeries xYSeries73 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false);
        java.util.List list74 = xYSeries73.data;
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertNotNull(xYDataItem68);
        org.junit.Assert.assertNotNull(list74);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((double) 100.0f, (double) 0);
        int int7 = xYSeries3.getMaximumItemCount();
        boolean boolean8 = xYSeries3.isEmpty();
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
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
        xYSeries3.setNotify(false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.clear();
        int int9 = xYSeries3.indexOf((java.lang.Number) 100.0f);
        int int10 = xYSeries3.getItemCount();
        xYSeries3.add((java.lang.Number) 0.0f, (java.lang.Number) (byte) 10);
        int int14 = xYSeries3.getMaximumItemCount();
        java.util.List list15 = xYSeries3.data;
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
        xYSeries3.setMaximumItemCount((int) (short) 100);
        int int22 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        xYSeries3.setMaximumItemCount((int) ' ');
        xYSeries3.add((double) '#', (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) 'a', (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
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
        org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(xYDataItem37);
        org.junit.Assert.assertNull(xYDataItem40);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
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
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries22.addOrUpdate((java.lang.Number) 10.0f, (java.lang.Number) (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(xYDataItem26);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.lang.Number number9 = xYSeries3.getY((int) (short) 0);
        boolean boolean10 = xYSeries3.getNotify();
        java.lang.Object obj11 = xYSeries3.clone();
        java.util.List list12 = xYSeries3.data;
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true);
        java.util.List list3 = xYSeries2.data;
        xYSeries2.add((java.lang.Number) 2, (java.lang.Number) 2147483647);
        boolean boolean7 = xYSeries2.getNotify();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
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
        xYSeries1.clear();
        boolean boolean27 = xYSeries1.isEmpty();
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
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
        boolean boolean24 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries3.addChangeListener(seriesChangeListener25);
        java.lang.Class<?> wildcardClass27 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        xYSeries1.setNotify(false);
        xYSeries1.fireSeriesChanged();
        boolean boolean9 = xYSeries1.isEmpty();
        xYSeries1.add((java.lang.Number) 0.0f, (java.lang.Number) (-1.0f), false);
        xYSeries1.setMaximumItemCount(2);
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.fireSeriesChanged();
        java.lang.Object obj3 = null;
        boolean boolean4 = xYSeries1.equals(obj3);
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        xYSeries8.add((double) 'a', (double) 100.0f);
        java.util.List list12 = xYSeries8.getItems();
        xYSeries1.data = list12;
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener24);
        xYSeries21.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int31 = xYSeries21.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries21.addPropertyChangeListener(propertyChangeListener32);
        xYSeries21.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries21.remove(1);
        xYSeries17.add(xYDataItem39);
        org.jfree.data.xy.XYSeries xYSeries43 = xYSeries17.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem46 = xYSeries43.addOrUpdate((double) (short) 100, (double) (byte) 1);
        xYSeries43.add((double) 0L, (java.lang.Number) 1.0d, false);
        boolean boolean51 = xYSeries43.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries55.add((double) 0.0f, 0.0d);
        xYSeries55.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean63 = xYSeries55.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        xYSeries55.removePropertyChangeListener(propertyChangeListener64);
        xYSeries55.add((double) 10.0f, (java.lang.Number) (short) 100);
        java.util.List list69 = xYSeries55.getItems();
        xYSeries43.data = list69;
        xYSeries1.data = list69;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj72 = xYSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Failed to clone.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertNotNull(xYSeries43);
        org.junit.Assert.assertNull(xYDataItem46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(list69);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        xYSeries1.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries6.createCopy((int) (byte) -1, 1);
        int int10 = xYSeries9.getMaximumItemCount();
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
        xYSeries9.add(xYDataItem36);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem36, true);
        xYSeries1.add(xYDataItem36, true);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(xYDataItem36);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((-1.0d), (double) 10);
        boolean boolean10 = xYSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
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
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries34.removePropertyChangeListener(propertyChangeListener35);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries34.removePropertyChangeListener(propertyChangeListener37);
        xYSeries34.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int44 = xYSeries34.indexOf((java.lang.Number) 0.0f);
        xYSeries34.add((double) (-1), (java.lang.Number) 1.0d, false);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries34.addPropertyChangeListener(propertyChangeListener49);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries55 = xYSeries52.createCopy((int) (short) 1, (int) 'a');
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        xYSeries63.removePropertyChangeListener(propertyChangeListener64);
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        xYSeries63.removePropertyChangeListener(propertyChangeListener66);
        xYSeries63.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int73 = xYSeries63.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener74 = null;
        xYSeries63.addPropertyChangeListener(propertyChangeListener74);
        xYSeries63.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem81 = xYSeries63.remove(1);
        xYSeries59.add(xYDataItem81);
        org.jfree.data.xy.XYSeries xYSeries84 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem81, false);
        xYSeries52.add(xYDataItem81);
        xYSeries34.setKey((java.lang.Comparable) xYDataItem81);
        org.jfree.data.xy.XYSeries xYSeries87 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem81);
        xYSeries6.add(xYDataItem81);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(xYSeries55);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(xYDataItem81);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
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
        int int31 = xYSeries3.getItemCount();
        xYSeries3.delete(3, 3);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) (-3), (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -3");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
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
            org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries3.addOrUpdate((java.lang.Number) (short) 10, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add(10.0d, (java.lang.Number) 0.0d);
        java.lang.Object obj15 = xYSeries3.clone();
        xYSeries3.add((double) 10, (java.lang.Number) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(xYDataItem19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        xYSeries3.add((java.lang.Number) (short) -1, (java.lang.Number) 0.0d);
        java.lang.String str8 = xYSeries3.getDescription();
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
        xYSeries32.fireSeriesChanged();
        xYSeries32.setNotify(false);
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries32.remove(0);
        xYSeries12.add(xYDataItem60, true);
        xYSeries3.add(xYDataItem60);
        int int64 = xYSeries3.getItemCount();
        xYSeries3.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(xYDataItem54);
        org.junit.Assert.assertNotNull(xYDataItem60);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        double[][] doubleArray6 = xYSeries3.toArray();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) (-1L));
        xYSeries3.add((java.lang.Number) (short) 10, (java.lang.Number) (-1L), false);
        xYSeries3.updateByIndex(0, (java.lang.Number) (-1));
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((-1), (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries23.addOrUpdate((double) '4', (double) (short) 100);
        boolean boolean27 = xYSeries23.getNotify();
        xYSeries23.add((java.lang.Number) 0L, (java.lang.Number) (short) 10);
        boolean boolean31 = xYSeries23.getNotify();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNull(xYDataItem26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries22.addPropertyChangeListener(propertyChangeListener24);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
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
        xYSeries1.delete((int) (byte) 100, (int) (byte) 0);
        java.lang.Number number30 = null;
        xYSeries1.add((java.lang.Number) 1.0f, number30);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        int int3 = xYSeries2.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries2.addOrUpdate((double) 10L, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
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
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.xy.XYSeries xYSeries48 = xYSeries45.createCopy((int) (byte) 100, 3);
        xYSeries45.add((double) (short) 100, (java.lang.Number) (short) 10);
        boolean boolean52 = xYSeries45.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        xYSeries56.removePropertyChangeListener(propertyChangeListener57);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        xYSeries56.removePropertyChangeListener(propertyChangeListener59);
        xYSeries56.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int66 = xYSeries56.indexOf((java.lang.Number) 0.0f);
        xYSeries56.add((double) (-1), (java.lang.Number) 1.0d, false);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener75 = null;
        xYSeries74.removePropertyChangeListener(propertyChangeListener75);
        java.beans.PropertyChangeListener propertyChangeListener77 = null;
        xYSeries74.removePropertyChangeListener(propertyChangeListener77);
        xYSeries74.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray83 = xYSeries74.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem85 = xYSeries74.getDataItem((int) (short) 0);
        xYSeries56.add(xYDataItem85);
        xYSeries45.add(xYDataItem85);
        xYSeries29.setKey((java.lang.Comparable) xYDataItem85);
        java.util.List list89 = xYSeries29.getItems();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertNotNull(xYSeries48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertNotNull(xYDataItem85);
        org.junit.Assert.assertNotNull(list89);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
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
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) 0.0f);
        int int45 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
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
        boolean boolean24 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries3.remove(0);
        boolean boolean27 = xYSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) (byte) 1, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(xYDataItem26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        java.lang.Object obj2 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener3);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable12 = xYSeries3.getKey();
        java.lang.Number number14 = xYSeries3.getX((int) (short) 0);
        java.lang.Number number16 = xYSeries3.getY((int) (short) 0);
        boolean boolean17 = xYSeries3.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        int int22 = xYSeries20.indexOf((java.lang.Number) (-1L));
        xYSeries20.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries28.add((double) 0.0f, 0.0d);
        xYSeries28.add((double) (short) 100, (java.lang.Number) (-1L), true);
        int int37 = xYSeries28.indexOf((java.lang.Number) (-2));
        xYSeries28.add((double) (byte) 0, (java.lang.Number) 1.0f);
        int int41 = xYSeries28.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries28.remove((int) (short) 0);
        xYSeries20.add(xYDataItem43);
        xYSeries3.add(xYDataItem43);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (byte) 0 + "'", number14, (byte) 0);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + (byte) 10 + "'", number16, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNotNull(xYDataItem43);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
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
        boolean boolean33 = xYSeries2.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener40);
        xYSeries37.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int47 = xYSeries37.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        xYSeries37.addPropertyChangeListener(propertyChangeListener48);
        org.jfree.data.xy.XYDataItem xYDataItem51 = xYSeries37.remove((int) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        xYSeries37.addPropertyChangeListener(propertyChangeListener52);
        xYSeries37.add((double) (short) -1, (double) 2147483647);
        java.util.List list57 = xYSeries37.data;
        xYSeries2.data = list57;
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(xYDataItem51);
        org.junit.Assert.assertNotNull(list57);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) (byte) 100, true);
        boolean boolean10 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.setDescription("");
        xYSeries1.clear();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        int int14 = xYSeries3.getItemCount();
        boolean boolean15 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, true, false);
        xYSeries3.add((double) 2, (double) 0L, true);
        xYSeries3.clear();
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        double[][] doubleArray6 = xYSeries3.toArray();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) (-1L));
        xYSeries3.add((java.lang.Number) (short) 10, (java.lang.Number) (-1L), false);
        boolean boolean14 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (-1L), (java.lang.Number) 1L, true);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(0, (int) (short) -1);
        xYSeries9.add((double) (byte) -1, (double) (short) -1, false);
        xYSeries9.add((java.lang.Number) (short) 100, (java.lang.Number) 10.0f, false);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNotNull(xYSeries9);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener73 = null;
        xYSeries53.addChangeListener(seriesChangeListener73);
        xYSeries53.setNotify(true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + number72 + "' != '" + (-1.0d) + "'", number72, (-1.0d));
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        xYSeries1.setKey((java.lang.Comparable) 100.0d);
        java.lang.String str4 = xYSeries1.getDescription();
        int int6 = xYSeries1.indexOf((java.lang.Number) (byte) 10);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        java.lang.String str6 = xYSeries3.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100);
        int int11 = xYSeries3.indexOf((java.lang.Number) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener24);
        xYSeries21.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int31 = xYSeries21.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries21.addPropertyChangeListener(propertyChangeListener32);
        xYSeries21.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries21.remove(1);
        xYSeries17.add(xYDataItem39);
        xYSeries13.add(xYDataItem39, false);
        xYSeries3.add(xYDataItem39, true);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(xYDataItem39);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
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
        boolean boolean25 = xYSeries3.getNotify();
        boolean boolean26 = xYSeries3.getAutoSort();
        boolean boolean27 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (-1), (double) (-2), true);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener36);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener38);
        xYSeries35.setDescription("hi!");
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries35.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) 1.0f);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries48.removePropertyChangeListener(propertyChangeListener49);
        java.util.List list51 = xYSeries48.getItems();
        xYSeries48.clear();
        xYSeries48.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        xYSeries58.removePropertyChangeListener(propertyChangeListener59);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        xYSeries58.removePropertyChangeListener(propertyChangeListener61);
        xYSeries58.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int68 = xYSeries58.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener69 = null;
        xYSeries58.addPropertyChangeListener(propertyChangeListener69);
        xYSeries58.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem76 = xYSeries58.remove(1);
        org.jfree.data.xy.XYSeries xYSeries78 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem76, false);
        xYSeries48.add(xYDataItem76);
        xYSeries35.add(xYDataItem76);
        xYSeries3.add(xYDataItem76);
        java.beans.PropertyChangeListener propertyChangeListener82 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener82);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(xYDataItem44);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(xYDataItem76);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
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
        java.lang.Object obj60 = xYSeries3.clone();
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 0L + "'", comparable8, 0L);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(xYDataItem53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(obj60);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
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
        xYSeries3.add((double) (byte) -1, (double) ' ', false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        xYSeries3.removeChangeListener(seriesChangeListener39);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
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
        java.util.List list42 = xYSeries29.data;
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries29.addOrUpdate((double) 1L, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNull(xYDataItem45);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true);
        xYSeries2.delete((int) (short) 1, 0);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries7.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean11 = xYSeries7.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener20);
        xYSeries17.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray26 = xYSeries17.toArray();
        xYSeries17.add((double) 1, (java.lang.Number) (short) 1, true);
        int int32 = xYSeries17.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries36.add((double) 0.0f, 0.0d);
        xYSeries36.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean44 = xYSeries36.getAllowDuplicateXValues();
        xYSeries36.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
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
        xYSeries49.add(xYDataItem75, false);
        xYSeries36.setKey((java.lang.Comparable) xYDataItem75);
        org.jfree.data.xy.XYSeries xYSeries81 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem75, false);
        xYSeries17.add(xYDataItem75);
        xYSeries7.add(xYDataItem75);
        org.jfree.data.xy.XYSeries xYSeries86 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem75, false, true);
        xYSeries2.setKey((java.lang.Comparable) false);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(xYDataItem75);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        xYSeries3.add((double) 100, (java.lang.Number) 10L, false);
        xYSeries3.updateByIndex(1, (java.lang.Number) 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries3.setMaximumItemCount(4);
        xYSeries3.setNotify(false);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries3.addChangeListener(seriesChangeListener20);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries5.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener14);
        xYSeries11.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray20 = xYSeries11.toArray();
        xYSeries11.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries11.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries11.remove((int) (short) 1);
        xYSeries5.add(xYDataItem28);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem28);
        xYSeries1.add((double) 1L, 0.0d);
        boolean boolean34 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((double) 1L, (double) 100.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries3.addChangeListener(seriesChangeListener11);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        int int7 = xYSeries3.indexOf((java.lang.Number) 0.0d);
        boolean boolean9 = xYSeries3.equals((java.lang.Object) 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100.0f);
        xYSeries3.setMaximumItemCount(2147483647);
        java.lang.Object obj15 = xYSeries3.clone();
        xYSeries3.setMaximumItemCount(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        boolean boolean7 = xYSeries1.getAutoSort();
        int int8 = xYSeries1.getItemCount();
        xYSeries1.setMaximumItemCount(1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.util.List list14 = xYSeries3.getItems();
        double[][] doubleArray15 = xYSeries3.toArray();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener22);
        java.lang.Comparable comparable24 = xYSeries19.getKey();
        java.lang.Object obj25 = xYSeries19.clone();
        java.util.List list26 = xYSeries19.data;
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries30.add((double) 0.0f, 0.0d);
        xYSeries30.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean38 = xYSeries30.getAllowDuplicateXValues();
        xYSeries30.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        xYSeries51.removePropertyChangeListener(propertyChangeListener52);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries51.removePropertyChangeListener(propertyChangeListener54);
        xYSeries51.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int61 = xYSeries51.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries51.addPropertyChangeListener(propertyChangeListener62);
        xYSeries51.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem69 = xYSeries51.remove(1);
        xYSeries47.add(xYDataItem69);
        xYSeries43.add(xYDataItem69, false);
        xYSeries30.setKey((java.lang.Comparable) xYDataItem69);
        xYSeries19.add(xYDataItem69);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem69);
        org.jfree.data.xy.XYSeries xYSeries77 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem69, true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + 0L + "'", comparable24, 0L);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(xYDataItem69);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
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
        xYSeries22.add((double) 10, (java.lang.Number) 2, true);
        xYSeries22.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        boolean boolean71 = xYSeries70.getNotify();
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + 0L + "'", comparable31, 0L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(xYDataItem57);
        org.junit.Assert.assertNotNull(xYSeries61);
        org.junit.Assert.assertNotNull(xYDataItem63);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
        org.jfree.data.xy.XYSeries xYSeries88 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem77, true, false);
        org.jfree.data.xy.XYSeries xYSeries91 = xYSeries88.createCopy((int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(xYDataItem34);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(xYDataItem77);
        org.junit.Assert.assertNotNull(xYSeries91);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries3.removeChangeListener(seriesChangeListener27);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener33);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener35);
        xYSeries32.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int42 = xYSeries32.indexOf((java.lang.Number) 0.0f);
        java.util.List list43 = xYSeries32.getItems();
        xYSeries3.data = list43;
        double[][] doubleArray45 = xYSeries3.toArray();
        double[][] doubleArray46 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem48 = xYSeries3.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertNotNull(doubleArray46);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener13);
        java.util.List list15 = xYSeries12.getItems();
        xYSeries8.data = list15;
        boolean boolean17 = xYSeries3.equals((java.lang.Object) xYSeries8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries3.addChangeListener(seriesChangeListener18);
        xYSeries3.add((double) '#', (java.lang.Number) (-5908509288197150436L), false);
        xYSeries3.add((double) (short) -1, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete(1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        java.lang.Comparable comparable24 = xYSeries3.getKey();
        java.util.List list25 = xYSeries3.data;
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 1.0d + "'", number22, 1.0d);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + 0L + "'", comparable24, 0L);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        java.lang.String str35 = xYSeries3.getDescription();
        boolean boolean36 = xYSeries3.getNotify();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
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
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener32);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener34);
        xYSeries31.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        java.util.List list40 = xYSeries31.data;
        xYSeries3.data = list40;
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
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem63);
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem63);
        xYSeries3.add(xYDataItem63, true);
        java.lang.Comparable comparable68 = xYSeries3.getKey();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(xYDataItem63);
        org.junit.Assert.assertEquals("'" + comparable68 + "' != '" + 0L + "'", comparable68, 0L);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
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
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f);
        xYSeries21.delete((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem18);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries3.addChangeListener(seriesChangeListener17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = xYSeries3.getX((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
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
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener50);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        xYSeries49.removePropertyChangeListener(propertyChangeListener52);
        xYSeries49.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable58 = xYSeries49.getKey();
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries66 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        xYSeries66.removePropertyChangeListener(propertyChangeListener67);
        java.beans.PropertyChangeListener propertyChangeListener69 = null;
        xYSeries66.removePropertyChangeListener(propertyChangeListener69);
        xYSeries66.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int76 = xYSeries66.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener77 = null;
        xYSeries66.addPropertyChangeListener(propertyChangeListener77);
        xYSeries66.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem84 = xYSeries66.remove(1);
        xYSeries62.add(xYDataItem84);
        org.jfree.data.xy.XYSeries xYSeries88 = xYSeries62.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem90 = xYSeries62.remove(0);
        xYSeries49.add(xYDataItem90);
        xYSeries3.add(xYDataItem90);
        org.jfree.data.xy.XYSeries xYSeries95 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem90, false, true);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertEquals("'" + comparable58 + "' != '" + 0L + "'", comparable58, 0L);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(xYDataItem84);
        org.junit.Assert.assertNotNull(xYSeries88);
        org.junit.Assert.assertNotNull(xYDataItem90);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        xYSeries3.clear();
        java.lang.Comparable comparable15 = xYSeries3.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries3.removeChangeListener(seriesChangeListener16);
        xYSeries3.setDescription("hi!");
        xYSeries3.add((double) '4', (java.lang.Number) 100.0f, true);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 100 + "'", comparable15, (short) 100);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
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
        xYSeries3.add((double) (-1), (double) (byte) 1);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0L + "'", comparable15, 0L);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(xYDataItem60);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.removeChangeListener(seriesChangeListener9);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries3.addOrUpdate((double) (short) 1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
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
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem28, false);
        xYSeries2.add(xYDataItem28);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem28, false, false);
        int int36 = xYSeries35.getItemCount();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.delete((int) (byte) 10, 2);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener10);
        java.lang.String str12 = xYSeries3.getDescription();
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
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
        boolean boolean34 = xYSeries3.getNotify();
        java.util.List list35 = xYSeries3.getItems();
        int int37 = xYSeries3.indexOf((java.lang.Number) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number39 = xYSeries3.getX((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        java.util.List list21 = xYSeries3.getItems();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener22);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem18);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries3.setMaximumItemCount(4);
        int int19 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
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
        boolean boolean28 = xYSeries3.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener29);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + true + "'", comparable27, true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (-1), (java.lang.Number) 1.0d, false);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener24);
        xYSeries21.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray30 = xYSeries21.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries21.getDataItem((int) (short) 0);
        xYSeries3.add(xYDataItem32);
        java.lang.Class<?> wildcardClass34 = xYDataItem32.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(xYDataItem32);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries3.addChangeListener(seriesChangeListener17);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.addOrUpdate((java.lang.Number) 0.0d, (java.lang.Number) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener22);
        org.junit.Assert.assertNull(xYDataItem21);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        boolean boolean12 = xYSeries3.getNotify();
        int int13 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
        boolean boolean56 = xYSeries2.getNotify();
        xYSeries2.add((double) (byte) 1, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        xYSeries3.add((java.lang.Number) 10.0d, (java.lang.Number) (short) 100);
        double[][] doubleArray14 = xYSeries3.toArray();
        java.util.List list15 = xYSeries3.data;
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        boolean boolean14 = xYSeries3.equals((java.lang.Object) false);
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
        xYSeries18.setDescription("hi!");
        int int37 = xYSeries18.getMaximumItemCount();
        xYSeries18.delete((int) (short) 10, (int) (short) 0);
        xYSeries18.add((double) (-1L), (java.lang.Number) 2, false);
        boolean boolean45 = xYSeries3.equals((java.lang.Object) (-1L));
        double[][] doubleArray46 = xYSeries3.toArray();
        org.jfree.data.xy.XYSeries xYSeries49 = xYSeries3.createCopy(1, (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertNotNull(xYSeries49);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "", true);
        boolean boolean3 = xYSeries2.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
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
            xYSeries3.update((java.lang.Number) 100L, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
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
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) -1, (int) '#');
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries10.add((double) 0.0f, 0.0d);
        xYSeries10.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean18 = xYSeries10.getAllowDuplicateXValues();
        xYSeries10.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
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
        xYSeries23.add(xYDataItem49, false);
        xYSeries10.setKey((java.lang.Comparable) xYDataItem49);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem49, true);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem49);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem49, true, false);
        boolean boolean60 = xYSeries59.getAutoSort();
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(xYDataItem49);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries20 = xYSeries3.createCopy(1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries29.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) 100L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        xYSeries29.addChangeListener(seriesChangeListener33);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = xYSeries29.getY(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
        java.lang.Class<?> wildcardClass19 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
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
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        java.util.List list41 = xYSeries40.getItems();
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries45.setNotify(false);
        boolean boolean48 = xYSeries45.getNotify();
        java.lang.String str49 = xYSeries45.getDescription();
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries53.removePropertyChangeListener(propertyChangeListener54);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        xYSeries59.removePropertyChangeListener(propertyChangeListener60);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries59.removePropertyChangeListener(propertyChangeListener62);
        xYSeries59.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray68 = xYSeries59.toArray();
        xYSeries59.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries59.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem76 = xYSeries59.remove((int) (short) 1);
        xYSeries53.add(xYDataItem76);
        org.jfree.data.xy.XYSeries xYSeries80 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem76, true, false);
        xYSeries45.setKey((java.lang.Comparable) xYDataItem76);
        xYSeries40.add(xYDataItem76);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem76);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener84 = null;
        xYSeries1.addChangeListener(seriesChangeListener84);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(xYDataItem27);
        org.junit.Assert.assertNotNull(xYSeries31);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertNotNull(xYDataItem76);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable2 = xYSeries1.getKey();
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
        org.jfree.data.xy.XYSeries xYSeries32 = xYSeries6.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries6.remove(0);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem34);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem34, false, false);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false, true);
        int int42 = xYSeries41.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + '#' + "'", comparable2, '#');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertNotNull(xYSeries32);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true);
        java.util.List list3 = xYSeries2.data;
        xYSeries2.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries9.setDescription("hi!");
        xYSeries9.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener19);
        java.lang.Comparable comparable21 = xYSeries16.getKey();
        java.lang.Object obj22 = xYSeries16.clone();
        java.util.List list23 = xYSeries16.data;
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
        xYSeries16.add(xYDataItem66);
        xYSeries9.add(xYDataItem66);
        xYSeries2.setKey((java.lang.Comparable) xYDataItem66);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 0L + "'", comparable21, 0L);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(xYDataItem66);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries24.removeChangeListener(seriesChangeListener25);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(xYSeries24);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.fireSeriesChanged();
        boolean boolean10 = xYSeries3.getAllowDuplicateXValues();
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
        java.util.List list58 = xYSeries14.data;
        xYSeries3.data = list58;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(xYDataItem53);
        org.junit.Assert.assertNotNull(list58);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        java.util.List list31 = xYSeries30.getItems();
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener36);
        java.util.List list38 = xYSeries35.getItems();
        xYSeries35.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean43 = xYSeries35.getAllowDuplicateXValues();
        xYSeries35.add((double) (-1L), (double) (byte) 1);
        xYSeries35.add((double) 2147483647, (double) 'a', true);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener51);
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries35.remove(0);
        java.util.List list55 = xYSeries35.getItems();
        xYSeries30.data = list55;
        boolean boolean57 = xYSeries30.getAllowDuplicateXValues();
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(xYDataItem54);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
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
        boolean boolean34 = xYSeries3.getNotify();
        xYSeries3.add((double) 1, (double) 'a', false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem40 = xYSeries3.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        boolean boolean25 = xYSeries3.isEmpty();
        xYSeries3.add((double) 1.0f, (double) (short) 1);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
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
        xYSeries3.setNotify(true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(xYSeries30);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.setNotify(false);
        xYSeries3.add((java.lang.Number) (byte) 100, (java.lang.Number) (short) -1, false);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 10);
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        xYSeries3.add((double) (byte) 10, (double) 0, false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener14);
        xYSeries11.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray20 = xYSeries11.toArray();
        xYSeries11.add((double) 1, (java.lang.Number) (short) 1, true);
        int int26 = xYSeries11.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries30.add((double) 0.0f, 0.0d);
        xYSeries30.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean38 = xYSeries30.getAllowDuplicateXValues();
        xYSeries30.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        xYSeries51.removePropertyChangeListener(propertyChangeListener52);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries51.removePropertyChangeListener(propertyChangeListener54);
        xYSeries51.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int61 = xYSeries51.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries51.addPropertyChangeListener(propertyChangeListener62);
        xYSeries51.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem69 = xYSeries51.remove(1);
        xYSeries47.add(xYDataItem69);
        xYSeries43.add(xYDataItem69, false);
        xYSeries30.setKey((java.lang.Comparable) xYDataItem69);
        org.jfree.data.xy.XYSeries xYSeries75 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem69, false);
        xYSeries11.add(xYDataItem69);
        org.jfree.data.xy.XYSeries xYSeries78 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem69, true);
        xYSeries3.add(xYDataItem69, false);
        xYSeries1.add(xYDataItem69);
        java.util.List list82 = xYSeries1.getItems();
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(xYDataItem69);
        org.junit.Assert.assertNotNull(list82);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        xYSeries1.setMaximumItemCount(0);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener10);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.util.List list18 = xYSeries15.getItems();
        xYSeries7.data = list18;
        xYSeries7.setMaximumItemCount((int) (short) 0);
        java.util.List list22 = xYSeries7.getItems();
        boolean boolean23 = xYSeries1.equals((java.lang.Object) xYSeries7);
        boolean boolean24 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries14.setNotify(false);
        boolean boolean17 = xYSeries14.getNotify();
        java.lang.String str18 = xYSeries14.getDescription();
        boolean boolean19 = xYSeries3.equals((java.lang.Object) xYSeries14);
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries3.createCopy((int) (byte) 10, (int) (short) -1);
        xYSeries3.add((double) (byte) 10, (java.lang.Number) 1, false);
        java.lang.String str27 = xYSeries3.getDescription();
        java.lang.Object obj28 = xYSeries3.clone();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        java.lang.String str21 = xYSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries3.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((java.lang.Number) (-3), (java.lang.Number) 10.0f, true);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries28.addOrUpdate((java.lang.Number) (byte) 100, (java.lang.Number) 1.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNull(xYDataItem31);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
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
        java.lang.Number number23 = null;
        xYSeries3.add((java.lang.Number) 100L, number23, true);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        int int12 = xYSeries3.indexOf((java.lang.Number) (-2));
        xYSeries3.add((double) (byte) 0, (java.lang.Number) 1.0f);
        int int16 = xYSeries3.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries3.remove((int) (short) 0);
        xYSeries3.add((double) 10, (double) 100L);
        java.lang.Number number23 = xYSeries3.getX(0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(xYDataItem18);
        org.junit.Assert.assertEquals("'" + number23 + "' != '" + 0.0d + "'", number23, 0.0d);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
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
        xYSeries3.add((double) 100.0f, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
        int int20 = xYSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
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
        xYSeries36.add((java.lang.Number) (short) 0, (java.lang.Number) (short) 10, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        xYSeries36.removeChangeListener(seriesChangeListener41);
        java.lang.Object obj43 = xYSeries36.clone();
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
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
        java.util.List list46 = xYSeries3.getItems();
        xYSeries3.setMaximumItemCount(100);
        org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries3.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem50);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(xYDataItem50);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
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
        xYSeries29.setMaximumItemCount(0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        boolean boolean14 = xYSeries3.equals((java.lang.Object) false);
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
        xYSeries18.setDescription("hi!");
        int int37 = xYSeries18.getMaximumItemCount();
        xYSeries18.delete((int) (short) 10, (int) (short) 0);
        xYSeries18.add((double) (-1L), (java.lang.Number) 2, false);
        boolean boolean45 = xYSeries3.equals((java.lang.Object) (-1L));
        java.util.List list46 = xYSeries3.getItems();
        xYSeries3.add((double) (short) 100, (java.lang.Number) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(list46);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((double) 1L, (double) 100.0f);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (short) 0);
        xYSeries3.add((double) (byte) 0, (java.lang.Number) (short) 10);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener24);
        xYSeries21.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int31 = xYSeries21.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries21.addPropertyChangeListener(propertyChangeListener32);
        xYSeries21.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries21.remove(1);
        xYSeries17.add(xYDataItem39);
        org.jfree.data.xy.XYSeries xYSeries43 = xYSeries17.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries17.remove(0);
        int int47 = xYSeries17.indexOf((java.lang.Number) 0L);
        java.lang.String str48 = xYSeries17.getDescription();
        xYSeries17.add((double) 2147483647, (java.lang.Number) 1, false);
        boolean boolean53 = xYSeries3.equals((java.lang.Object) 1);
        xYSeries3.setMaximumItemCount((int) (byte) 100);
        xYSeries3.add((double) 0L, (double) 0.0f, false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertNotNull(xYSeries43);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        java.lang.String str6 = xYSeries3.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.addChangeListener(seriesChangeListener7);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries12.add((double) 0.0f, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries12.addOrUpdate((-1.0d), (double) 10);
        java.util.List list19 = xYSeries12.data;
        xYSeries3.data = list19;
        int int21 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(xYDataItem18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 0, 1.0d, true);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries3.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = xYSeries3.getY((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, false);
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener9);
        xYSeries6.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable15 = xYSeries6.getKey();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener24);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener26);
        xYSeries23.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int33 = xYSeries23.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries23.addPropertyChangeListener(propertyChangeListener34);
        xYSeries23.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries23.remove(1);
        xYSeries19.add(xYDataItem41);
        org.jfree.data.xy.XYSeries xYSeries45 = xYSeries19.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries19.remove(0);
        xYSeries6.add(xYDataItem47);
        xYSeries2.setKey((java.lang.Comparable) xYDataItem47);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47, false, false);
        java.lang.Comparable comparable54 = xYSeries53.getKey();
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries(comparable54);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries55.update((java.lang.Number) 100L, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0L + "'", comparable15, 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(xYDataItem41);
        org.junit.Assert.assertNotNull(xYSeries45);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertNotNull(comparable54);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        xYSeries1.add((double) 1, (java.lang.Number) 100.0d);
        org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries1.remove(1);
        xYSeries1.clear();
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertNotNull(xYDataItem36);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
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
        org.jfree.data.xy.XYSeries xYSeries32 = xYSeries26.createCopy(1, (int) (short) 0);
        double[][] doubleArray33 = xYSeries26.toArray();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYSeries32);
        org.junit.Assert.assertNotNull(doubleArray33);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.util.List list14 = xYSeries3.getItems();
        java.lang.Comparable comparable15 = xYSeries3.getKey();
        xYSeries3.fireSeriesChanged();
        xYSeries3.delete((int) (short) 10, 4);
        xYSeries3.delete(0, 0);
        int int23 = xYSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0L + "'", comparable15, 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
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
        xYSeries14.add((double) 100.0f, (java.lang.Number) (-1.0d), false);
        xYSeries14.setKey((java.lang.Comparable) 100.0f);
        org.junit.Assert.assertNotNull(xYDataItem12);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries6.addOrUpdate((java.lang.Number) (short) -1, (java.lang.Number) 0L);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries6.addPropertyChangeListener(propertyChangeListener10);
        java.util.List list12 = xYSeries6.data;
        xYSeries6.setDescription("hi!");
        boolean boolean15 = xYSeries6.getAllowDuplicateXValues();
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) -1, (int) '#');
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries10.add((double) 0.0f, 0.0d);
        xYSeries10.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean18 = xYSeries10.getAllowDuplicateXValues();
        xYSeries10.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
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
        xYSeries23.add(xYDataItem49, false);
        xYSeries10.setKey((java.lang.Comparable) xYDataItem49);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem49, true);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem49);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem49);
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem49);
        java.lang.String str59 = xYSeries58.getDescription();
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(xYDataItem49);
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "", true);
        int int3 = xYSeries2.getMaximumItemCount();
        java.lang.Object obj4 = xYSeries2.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries2.removeChangeListener(seriesChangeListener5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries23 = xYSeries3.createCopy((int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem20);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        boolean boolean25 = xYSeries9.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries9.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (byte) 0);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(xYDataItem28);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
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
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(xYDataItem36);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        boolean boolean14 = xYSeries3.equals((java.lang.Object) false);
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
        xYSeries18.setDescription("hi!");
        int int37 = xYSeries18.getMaximumItemCount();
        xYSeries18.delete((int) (short) 10, (int) (short) 0);
        xYSeries18.add((double) (-1L), (java.lang.Number) 2, false);
        boolean boolean45 = xYSeries3.equals((java.lang.Object) (-1L));
        java.util.List list46 = xYSeries3.getItems();
        java.lang.Number number47 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(number47, (java.lang.Number) 0L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(list46);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.setNotify(true);
        xYSeries3.add((double) 100L, (-1.0d), true);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries3.addOrUpdate((java.lang.Number) (short) -1, (java.lang.Number) (short) 10);
        boolean boolean9 = xYSeries3.isEmpty();
        boolean boolean10 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        java.util.List list7 = xYSeries3.data;
        java.util.List list8 = xYSeries3.getItems();
        double[][] doubleArray9 = xYSeries3.toArray();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        xYSeries1.setNotify(false);
        int int8 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries1.createCopy(1, (int) (short) 0);
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries14);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, true, false);
        int int4 = xYSeries3.getMaximumItemCount();
        java.lang.Object obj5 = xYSeries3.clone();
        java.lang.Object obj6 = xYSeries3.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries6.addOrUpdate((java.lang.Number) (short) -1, (java.lang.Number) 0L);
        boolean boolean10 = xYSeries6.getAutoSort();
        xYSeries6.delete(2147483647, (int) (short) -1);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
        xYSeries1.add((java.lang.Number) 4, (java.lang.Number) (-1.0f), true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        xYSeries1.removeChangeListener(seriesChangeListener34);
        xYSeries1.add((java.lang.Number) (-3), (java.lang.Number) (byte) 100, false);
        xYSeries1.setDescription("hi!");
        boolean boolean42 = xYSeries1.getNotify();
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0.0d, (java.lang.Number) 10);
        xYSeries1.add((double) 3, (java.lang.Number) (-5908509288197150436L));
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.removeChangeListener(seriesChangeListener10);
        org.junit.Assert.assertNull(xYDataItem4);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 100, false);
        org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries2.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) (-1L));
        boolean boolean6 = xYSeries2.getNotify();
        org.junit.Assert.assertNull(xYDataItem5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
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
        xYSeries3.setMaximumItemCount(2);
        boolean boolean24 = xYSeries3.getAutoSort();
        xYSeries3.add((java.lang.Number) 10.0f, (java.lang.Number) (-1.0d));
        java.lang.Comparable comparable28 = xYSeries3.getKey();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + 0L + "'", comparable28, 0L);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        xYSeries3.setNotify(true);
        java.util.List list8 = xYSeries3.data;
        java.lang.String str9 = xYSeries3.getDescription();
        xYSeries3.add(0.0d, (double) 100, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries3.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        boolean boolean6 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("");
        java.util.List list9 = xYSeries1.data;
        boolean boolean10 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable2 = xYSeries1.getKey();
        xYSeries1.clear();
        xYSeries1.add((double) (-1.0f), (double) (short) 10, false);
        java.lang.Number number9 = null;
        xYSeries1.add((double) 0L, number9, false);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        java.lang.String str16 = xYSeries15.getDescription();
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener21);
        java.util.List list23 = xYSeries20.getItems();
        xYSeries20.clear();
        xYSeries20.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener33);
        xYSeries30.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int40 = xYSeries30.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries30.addPropertyChangeListener(propertyChangeListener41);
        xYSeries30.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem48 = xYSeries30.remove(1);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem48, false);
        xYSeries20.add(xYDataItem48);
        xYSeries15.setKey((java.lang.Comparable) xYDataItem48);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem48);
        xYSeries1.add(xYDataItem48);
        boolean boolean55 = xYSeries1.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem57 = xYSeries1.remove((java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -4 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + '#' + "'", comparable2, '#');
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(xYDataItem48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries3.addOrUpdate((java.lang.Number) 3, (java.lang.Number) 0.0f);
        int int24 = xYSeries3.indexOf((java.lang.Number) 100.0f);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true);
        java.util.List list3 = xYSeries2.data;
        xYSeries2.setDescription("hi!");
        xYSeries2.add((java.lang.Number) (byte) 100, (java.lang.Number) 3, false);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        xYSeries3.removeChangeListener(seriesChangeListener21);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        xYSeries3.removeChangeListener(seriesChangeListener23);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
        java.util.List list58 = xYSeries3.data;
        org.jfree.data.xy.XYSeries xYSeries61 = xYSeries3.createCopy((int) '4', (-2));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number63 = xYSeries61.getX((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(xYSeries61);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        java.util.List list25 = xYSeries22.data;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add(10.0d, (java.lang.Number) 10L, true);
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.remove((java.lang.Number) (byte) 10);
        xYSeries1.add((double) 2, (-1.0d), true);
        java.lang.String str12 = xYSeries1.getDescription();
        java.lang.Object obj13 = xYSeries1.clone();
        org.junit.Assert.assertNotNull(xYDataItem7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        xYSeries29.removeChangeListener(seriesChangeListener38);
        java.lang.String str40 = xYSeries29.getDescription();
        java.lang.Number number42 = null;
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries29.addOrUpdate((java.lang.Number) 4, number42);
        xYSeries29.updateByIndex((int) (byte) 1, (java.lang.Number) 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(xYDataItem43);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 1, (java.lang.Number) (short) 1, true);
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries3.addOrUpdate((java.lang.Number) 10.0d, (java.lang.Number) (-1L));
        java.lang.Object obj20 = xYSeries3.clone();
        xYSeries3.add(1.0d, (java.lang.Number) 100.0f, true);
        xYSeries3.add((java.lang.Number) 0L, (java.lang.Number) 2);
        xYSeries3.add((double) 1L, (java.lang.Number) (-1L));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
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
        java.lang.Number number51 = xYSeries3.getX((int) (short) 1);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertEquals("'" + number51 + "' != '" + (byte) 0 + "'", number51, (byte) 0);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        xYSeries1.setMaximumItemCount(0);
        xYSeries1.add((double) 10, (double) (-1), true);
        int int8 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener22);
        xYSeries19.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int29 = xYSeries19.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries19.addPropertyChangeListener(propertyChangeListener30);
        xYSeries19.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries19.remove(1);
        xYSeries15.add(xYDataItem37);
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem37, false);
        xYSeries11.add(xYDataItem37);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem37);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem37, true, false);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem37);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(xYDataItem37);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        xYSeries3.fireSeriesChanged();
        int int13 = xYSeries3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener14);
        xYSeries3.add((double) 1L, (java.lang.Number) 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries3.addOrUpdate(1.0d, (double) 'a');
        java.lang.String str29 = xYSeries3.getDescription();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(xYDataItem28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.clear();
        int int9 = xYSeries3.indexOf((java.lang.Number) 100.0f);
        xYSeries3.add((double) (byte) 0, (java.lang.Number) 0.0d, false);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries17.add((double) 0.0f, 0.0d);
        xYSeries17.add((double) (short) 100, (java.lang.Number) (-1L), true);
        xYSeries17.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener33);
        xYSeries30.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable39 = xYSeries30.getKey();
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
        org.jfree.data.xy.XYDataItem xYDataItem71 = xYSeries43.remove(0);
        xYSeries30.add(xYDataItem71);
        xYSeries17.add(xYDataItem71, true);
        xYSeries3.add(xYDataItem71, true);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + comparable39 + "' != '" + 0L + "'", comparable39, 0L);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(xYDataItem65);
        org.junit.Assert.assertNotNull(xYSeries69);
        org.junit.Assert.assertNotNull(xYDataItem71);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = xYSeries6.getY((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        xYSeries3.clear();
        java.lang.Comparable comparable15 = xYSeries3.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries3.removeChangeListener(seriesChangeListener16);
        xYSeries3.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries21.add((double) 1, 100.0d, true);
        boolean boolean26 = xYSeries3.equals((java.lang.Object) true);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 100 + "'", comparable15, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.add((double) 1, 100.0d, true);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((double) (short) -1, (double) (short) 10);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries12.add((double) 0.0f, 0.0d);
        xYSeries12.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean20 = xYSeries12.getAllowDuplicateXValues();
        xYSeries12.add(10.0d, (java.lang.Number) 0.0d);
        xYSeries12.delete((int) (byte) 100, (int) (short) 10);
        boolean boolean27 = xYSeries12.getAllowDuplicateXValues();
        xYSeries12.add((double) 4, 0.0d);
        boolean boolean31 = xYSeries1.equals((java.lang.Object) 4);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener32);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries30 = xYSeries27.createCopy((int) (short) 1, (int) 'a');
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries38.removePropertyChangeListener(propertyChangeListener39);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries38.removePropertyChangeListener(propertyChangeListener41);
        xYSeries38.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int48 = xYSeries38.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries38.addPropertyChangeListener(propertyChangeListener49);
        xYSeries38.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries38.remove(1);
        xYSeries34.add(xYDataItem56);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem56, false);
        xYSeries27.add(xYDataItem56);
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem56, false);
        xYSeries22.add(xYDataItem56);
        double[][] doubleArray64 = xYSeries22.toArray();
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries68.add((double) 0.0f, 0.0d);
        xYSeries68.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean76 = xYSeries68.getAllowDuplicateXValues();
        xYSeries68.add(10.0d, (java.lang.Number) 0.0d);
        java.lang.Object obj80 = xYSeries68.clone();
        xYSeries68.add((double) 10, (java.lang.Number) 10.0f);
        java.lang.Number number85 = xYSeries68.getY((int) (short) 0);
        org.jfree.data.xy.XYDataItem xYDataItem87 = xYSeries68.remove((java.lang.Number) 10);
        org.jfree.data.xy.XYSeries xYSeries89 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem87, true);
        xYSeries22.add(xYDataItem87);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertNotNull(xYSeries30);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(xYDataItem56);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertEquals("'" + number85 + "' != '" + 0.0d + "'", number85, 0.0d);
        org.junit.Assert.assertNotNull(xYDataItem87);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
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
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem36, true);
        boolean boolean39 = xYSeries38.isEmpty();
        int int41 = xYSeries38.indexOf((java.lang.Number) (short) -1);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries3.addChangeListener(seriesChangeListener13);
        java.lang.Object obj15 = xYSeries3.clone();
        java.lang.Object obj16 = xYSeries3.clone();
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries3.createCopy((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(xYSeries17);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
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
        boolean boolean18 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries3.createCopy(0, (-1));
        boolean boolean22 = xYSeries3.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (byte) 0 + "'", number14, (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
        org.jfree.data.xy.XYDataItem xYDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries28.add(xYDataItem29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        xYSeries1.setNotify(false);
        int int8 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries1.createCopy((int) '#', 2);
        java.lang.String str12 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = xYSeries1.getY(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        double[][] doubleArray6 = xYSeries3.toArray();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) (-1L));
        xYSeries3.add((java.lang.Number) (short) 10, (java.lang.Number) (-1L), false);
        xYSeries3.delete((int) 'a', (int) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) 10.0f, (double) (short) 1, true);
        boolean boolean11 = xYSeries3.getNotify();
        boolean boolean12 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) 'a', (java.lang.Number) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(10, (-1));
        java.util.List list10 = xYSeries3.getItems();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
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
        java.lang.Class<?> wildcardClass29 = xYSeries28.getClass();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
        org.jfree.data.xy.XYDataItem xYDataItem46 = xYSeries29.addOrUpdate((java.lang.Number) (-1), (java.lang.Number) (-3));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(xYDataItem46);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        int int3 = xYSeries2.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries7.removePropertyChangeListener(propertyChangeListener8);
        java.util.List list10 = xYSeries7.getItems();
        xYSeries7.clear();
        xYSeries7.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries7.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener22);
        xYSeries19.setKey((java.lang.Comparable) (short) 100);
        xYSeries19.add((double) (-1.0f), (double) 0L, false);
        xYSeries19.clear();
        boolean boolean31 = xYSeries7.equals((java.lang.Object) xYSeries19);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener36);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener38);
        xYSeries35.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        java.util.List list44 = xYSeries35.data;
        xYSeries7.data = list44;
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
        org.jfree.data.xy.XYSeries xYSeries68 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem67);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem67);
        xYSeries7.add(xYDataItem67, true);
        xYSeries2.add(xYDataItem67, false);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(xYDataItem67);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, false);
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener9);
        xYSeries6.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable15 = xYSeries6.getKey();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener24);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener26);
        xYSeries23.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int33 = xYSeries23.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries23.addPropertyChangeListener(propertyChangeListener34);
        xYSeries23.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries23.remove(1);
        xYSeries19.add(xYDataItem41);
        org.jfree.data.xy.XYSeries xYSeries45 = xYSeries19.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries19.remove(0);
        xYSeries6.add(xYDataItem47);
        xYSeries2.setKey((java.lang.Comparable) xYDataItem47);
        java.lang.Class<?> wildcardClass50 = xYDataItem47.getClass();
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0L + "'", comparable15, 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(xYDataItem41);
        org.junit.Assert.assertNotNull(xYSeries45);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.xy.XYSeries xYSeries48 = xYSeries45.createCopy((int) (byte) 100, 3);
        xYSeries45.add((double) (short) 100, (java.lang.Number) (short) 10);
        boolean boolean52 = xYSeries45.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        xYSeries56.removePropertyChangeListener(propertyChangeListener57);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        xYSeries56.removePropertyChangeListener(propertyChangeListener59);
        xYSeries56.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int66 = xYSeries56.indexOf((java.lang.Number) 0.0f);
        xYSeries56.add((double) (-1), (java.lang.Number) 1.0d, false);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener75 = null;
        xYSeries74.removePropertyChangeListener(propertyChangeListener75);
        java.beans.PropertyChangeListener propertyChangeListener77 = null;
        xYSeries74.removePropertyChangeListener(propertyChangeListener77);
        xYSeries74.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray83 = xYSeries74.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem85 = xYSeries74.getDataItem((int) (short) 0);
        xYSeries56.add(xYDataItem85);
        xYSeries45.add(xYDataItem85);
        xYSeries29.setKey((java.lang.Comparable) xYDataItem85);
        org.jfree.data.xy.XYSeries xYSeries90 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85, true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertNotNull(xYSeries48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertNotNull(xYDataItem85);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.removeChangeListener(seriesChangeListener6);
        xYSeries3.setMaximumItemCount(2147483647);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.addOrUpdate((double) 0L, (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.util.List list19 = xYSeries16.getItems();
        xYSeries16.clear();
        xYSeries16.setNotify(true);
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
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44, false);
        xYSeries16.add(xYDataItem44);
        org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries16.remove((java.lang.Number) 0);
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem49, true);
        xYSeries3.setKey((java.lang.Comparable) true);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertNotNull(xYDataItem49);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
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
        xYSeries3.setMaximumItemCount((int) ' ');
        xYSeries3.add((double) '#', (double) (short) 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        xYSeries3.removeChangeListener(seriesChangeListener34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries9.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean13 = xYSeries9.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries9.addPropertyChangeListener(propertyChangeListener14);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener22);
        xYSeries19.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray28 = xYSeries19.toArray();
        xYSeries19.add((double) 1, (java.lang.Number) (short) 1, true);
        int int34 = xYSeries19.indexOf((java.lang.Number) 1.0d);
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
        org.jfree.data.xy.XYSeries xYSeries83 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem77, false);
        xYSeries19.add(xYDataItem77);
        xYSeries9.add(xYDataItem77);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem77);
        java.util.List list87 = xYSeries3.getItems();
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(xYDataItem77);
        org.junit.Assert.assertNotNull(list87);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        int int9 = xYSeries3.indexOf((java.lang.Number) 10.0f);
        xYSeries3.add((java.lang.Number) 10, (java.lang.Number) (byte) 0, false);
        xYSeries3.delete((int) '4', (int) (byte) 0);
        xYSeries3.setNotify(false);
        int int19 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        java.util.List list38 = xYSeries29.data;
        java.util.List list39 = xYSeries29.getItems();
        xYSeries29.add(10.0d, (java.lang.Number) (-1), false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list39);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", true, true);
        xYSeries3.setMaximumItemCount((int) ' ');
        xYSeries3.add((java.lang.Number) 10, (java.lang.Number) 100.0f);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 'a', true, false);
        int int4 = xYSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries41.add((double) 0.0f, 0.0d);
        xYSeries41.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean49 = xYSeries41.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        xYSeries41.removePropertyChangeListener(propertyChangeListener50);
        xYSeries41.add((double) 10.0f, (java.lang.Number) (short) 100);
        java.util.List list55 = xYSeries41.getItems();
        xYSeries29.data = list55;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries29.add((java.lang.Number) 0, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(list55);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, true, false);
        int int4 = xYSeries3.getMaximumItemCount();
        double[][] doubleArray5 = xYSeries3.toArray();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
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
        boolean boolean53 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertNotNull(xYSeries52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
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
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem28, false);
        xYSeries2.add(xYDataItem28);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem28, true, false);
        int int37 = xYSeries35.indexOf((java.lang.Number) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        xYSeries35.removeChangeListener(seriesChangeListener38);
        boolean boolean40 = xYSeries35.isEmpty();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
        xYSeries3.add((java.lang.Number) (byte) 1, (java.lang.Number) 1.0d);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 0L + "'", comparable13, 0L);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }
}

