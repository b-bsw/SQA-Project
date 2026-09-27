package org.jfree.data.xy;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries14.setNotify(false);
        boolean boolean17 = xYSeries14.getNotify();
        java.lang.String str18 = xYSeries14.getDescription();
        boolean boolean19 = xYSeries3.equals((java.lang.Object) xYSeries14);
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries3.createCopy((int) (byte) 10, (int) (short) -1);
        xYSeries22.add((double) '4', (java.lang.Number) 3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        xYSeries22.removeChangeListener(seriesChangeListener26);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        xYSeries3.add((double) 10, (double) 100L);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 100 + "'", comparable15, (short) 100);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) 100, (int) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener20);
        xYSeries17.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int27 = xYSeries17.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries17.addPropertyChangeListener(propertyChangeListener28);
        xYSeries17.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries17.remove(1);
        xYSeries13.add(xYDataItem35);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem35, false);
        xYSeries9.add(xYDataItem35);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem35, true, false);
        xYSeries3.setKey((java.lang.Comparable) true);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(xYDataItem35);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        int int4 = xYSeries3.getMaximumItemCount();
        int int5 = xYSeries3.getItemCount();
        xYSeries3.add(0.0d, (double) 1.0f, true);
        double[][] doubleArray10 = xYSeries3.toArray();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries14.removePropertyChangeListener(propertyChangeListener15);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries14.removePropertyChangeListener(propertyChangeListener17);
        xYSeries14.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int24 = xYSeries14.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries14.addPropertyChangeListener(propertyChangeListener25);
        double[][] doubleArray27 = xYSeries14.toArray();
        boolean boolean28 = xYSeries14.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries32.setDescription("");
        xYSeries32.setNotify(true);
        java.util.List list37 = xYSeries32.data;
        xYSeries14.data = list37;
        xYSeries3.data = list37;
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener40);
        java.lang.Object obj42 = xYSeries3.clone();
        java.lang.Class<?> wildcardClass43 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        java.lang.Object obj19 = xYSeries3.clone();
        xYSeries3.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 1.0d + "'", number13, 1.0d);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        xYSeries29.add((java.lang.Number) 2, (java.lang.Number) 10.0d, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries29.add((double) (short) 100, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(xYDataItem43);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        java.lang.Object obj6 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 10, (-2));
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries9.addOrUpdate((double) 0, (double) '#');
        boolean boolean13 = xYSeries9.getAutoSort();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        xYSeries3.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        xYSeries3.addChangeListener(seriesChangeListener42);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        xYSeries3.fireSeriesChanged();
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries43.delete(4, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(xYDataItem36);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        xYSeries3.setDescription("");
        java.lang.String str10 = xYSeries3.getDescription();
        java.lang.String str11 = xYSeries3.getDescription();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
            org.jfree.data.xy.XYDataItem xYDataItem51 = xYSeries29.getDataItem((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -4 out of bounds for length 2");
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
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        xYSeries2.addChangeListener(seriesChangeListener33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = xYSeries3.getKey();
        xYSeries3.setKey((java.lang.Comparable) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries3.addChangeListener(seriesChangeListener11);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 0L + "'", comparable8, 0L);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        xYSeries3.add((java.lang.Number) 0L, (java.lang.Number) (byte) -1, false);
        boolean boolean29 = xYSeries3.isEmpty();
        xYSeries3.add((-1.0d), (java.lang.Number) 0.0f, true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.add((double) 1, 100.0d, true);
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.getDataItem((int) (byte) 0);
        org.junit.Assert.assertNotNull(xYDataItem7);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        boolean boolean25 = xYSeries24.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
        org.junit.Assert.assertNotNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.removeChangeListener(seriesChangeListener9);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries3.createCopy((int) (short) 10, 0);
        boolean boolean15 = xYSeries14.getNotify();
        xYSeries14.fireSeriesChanged();
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39);
        boolean boolean46 = xYSeries45.getAutoSort();
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + '#' + "'", comparable7, '#');
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertNotNull(xYSeries37);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.lang.Number number9 = xYSeries3.getY((int) (short) 0);
        boolean boolean10 = xYSeries3.getNotify();
        java.lang.Object obj11 = xYSeries3.clone();
        boolean boolean12 = xYSeries3.getNotify();
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        xYSeries3.add((double) '#', (double) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries3.removeChangeListener(seriesChangeListener25);
        boolean boolean27 = xYSeries3.isEmpty();
        xYSeries3.fireSeriesChanged();
        java.lang.Object obj29 = xYSeries3.clone();
        double[][] doubleArray30 = xYSeries3.toArray();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(doubleArray30);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        int int7 = xYSeries6.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries6.removeChangeListener(seriesChangeListener8);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        int int12 = xYSeries3.indexOf((java.lang.Number) (-2));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries3.addChangeListener(seriesChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 10.0f, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((java.lang.Number) (short) 0, (java.lang.Number) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.lang.Number number9 = xYSeries3.getY((int) (short) 0);
        boolean boolean10 = xYSeries3.getNotify();
        java.lang.Object obj11 = xYSeries3.clone();
        xYSeries3.add((double) 10L, (java.lang.Number) 10.0d);
        java.lang.Object obj15 = xYSeries3.clone();
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries3.addOrUpdate((double) 4, (double) ' ');
        boolean boolean56 = xYSeries3.isEmpty();
        java.lang.Comparable comparable57 = xYSeries3.getKey();
        boolean boolean58 = xYSeries3.getAutoSort();
        xYSeries3.add((double) 100L, (java.lang.Number) (short) 10);
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNull(xYDataItem55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + 0L + "'", comparable57, 0L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.addOrUpdate((java.lang.Number) (-1.0f), (java.lang.Number) 0);
        xYSeries3.add((double) (byte) 1, (-1.0d));
        boolean boolean16 = xYSeries3.isEmpty();
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries3.remove((int) (byte) 0);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(xYDataItem18);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        int int14 = xYSeries3.getItemCount();
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries19.setDescription("");
        java.lang.String str22 = xYSeries19.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries19.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries29.add((double) 0.0f, 0.0d);
        xYSeries29.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean37 = xYSeries29.getAllowDuplicateXValues();
        xYSeries29.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        xYSeries50.removePropertyChangeListener(propertyChangeListener51);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        xYSeries50.removePropertyChangeListener(propertyChangeListener53);
        xYSeries50.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int60 = xYSeries50.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        xYSeries50.addPropertyChangeListener(propertyChangeListener61);
        xYSeries50.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem68 = xYSeries50.remove(1);
        xYSeries46.add(xYDataItem68);
        xYSeries42.add(xYDataItem68, false);
        xYSeries29.setKey((java.lang.Comparable) xYDataItem68);
        xYSeries19.add(xYDataItem68, true);
        boolean boolean75 = xYSeries3.equals((java.lang.Object) xYSeries19);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(xYDataItem68);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        java.util.List list33 = xYSeries29.getItems();
        xYSeries29.setMaximumItemCount((int) ' ');
        java.util.List list36 = xYSeries29.getItems();
        double[][] doubleArray37 = xYSeries29.toArray();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(doubleArray37);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        xYSeries30.addChangeListener(seriesChangeListener31);
        boolean boolean33 = xYSeries30.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener40);
        xYSeries37.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int47 = xYSeries37.indexOf((java.lang.Number) 0.0f);
        xYSeries37.add((double) (-1), (java.lang.Number) 1.0d, false);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries55.removePropertyChangeListener(propertyChangeListener56);
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        xYSeries55.removePropertyChangeListener(propertyChangeListener58);
        xYSeries55.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray64 = xYSeries55.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem66 = xYSeries55.getDataItem((int) (short) 0);
        xYSeries37.add(xYDataItem66);
        xYSeries30.add(xYDataItem66, false);
        xYSeries3.add(xYDataItem66, false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertNotNull(xYDataItem66);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        xYSeries3.addChangeListener(seriesChangeListener19);
        boolean boolean21 = xYSeries3.isEmpty();
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem20, false, false);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false);
        java.util.List list26 = xYSeries25.data;
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        xYSeries22.add((double) ' ', (java.lang.Number) 10.0f, false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener39);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        xYSeries3.add((java.lang.Number) (short) -1, (java.lang.Number) (byte) 0);
        boolean boolean42 = xYSeries3.getNotify();
        double[][] doubleArray43 = xYSeries3.toArray();
        boolean boolean44 = xYSeries3.isEmpty();
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 1, (java.lang.Number) (short) 1, true);
        int int18 = xYSeries3.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries22.add((double) 0.0f, 0.0d);
        xYSeries22.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean30 = xYSeries22.getAllowDuplicateXValues();
        xYSeries22.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries43.removePropertyChangeListener(propertyChangeListener44);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        xYSeries43.removePropertyChangeListener(propertyChangeListener46);
        xYSeries43.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int53 = xYSeries43.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener54 = null;
        xYSeries43.addPropertyChangeListener(propertyChangeListener54);
        xYSeries43.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem61 = xYSeries43.remove(1);
        xYSeries39.add(xYDataItem61);
        xYSeries35.add(xYDataItem61, false);
        xYSeries22.setKey((java.lang.Comparable) xYDataItem61);
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem61, false);
        xYSeries3.add(xYDataItem61);
        org.jfree.data.xy.XYSeries xYSeries70 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem61, true);
        xYSeries70.delete((int) (short) 10, (int) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener74 = null;
        xYSeries70.addChangeListener(seriesChangeListener74);
        int int76 = xYSeries70.getItemCount();
        xYSeries70.add((double) 0, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(xYDataItem61);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        java.lang.String str6 = xYSeries3.getDescription();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, false);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener16);
        xYSeries13.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable22 = xYSeries13.getKey();
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
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
        xYSeries26.add(xYDataItem48);
        org.jfree.data.xy.XYSeries xYSeries52 = xYSeries26.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries26.remove(0);
        xYSeries13.add(xYDataItem54);
        xYSeries9.setKey((java.lang.Comparable) xYDataItem54);
        xYSeries3.add(xYDataItem54, true);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true);
        java.lang.Object obj61 = xYSeries60.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + 0L + "'", comparable22, 0L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(xYDataItem48);
        org.junit.Assert.assertNotNull(xYSeries52);
        org.junit.Assert.assertNotNull(xYDataItem54);
        org.junit.Assert.assertNotNull(obj61);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        xYSeries1.setNotify(false);
        xYSeries1.fireSeriesChanged();
        boolean boolean9 = xYSeries1.getAutoSort();
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (byte) 10, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries39.remove((java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(xYDataItem33);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        xYSeries3.removeChangeListener(seriesChangeListener38);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        java.lang.Comparable comparable7 = xYSeries1.getKey();
        java.lang.String str8 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 0 + "'", comparable7, (byte) 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (-1.0d), (java.lang.Number) 100.0f);
        xYSeries1.add((java.lang.Number) 2, (java.lang.Number) 100L, true);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        boolean boolean18 = xYSeries3.getAutoSort();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 0L + "'", comparable13, 0L);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem26);
        int int31 = xYSeries30.getMaximumItemCount();
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        int int39 = xYSeries35.indexOf((java.lang.Number) 0L);
        xYSeries35.add((java.lang.Number) 0, (java.lang.Number) (short) 1, false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        java.lang.Comparable comparable60 = xYSeries3.getKey();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + comparable60 + "' != '" + 0L + "'", comparable60, 0L);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        xYSeries3.setDescription("");
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
        xYSeries3.add(xYDataItem57, true);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + 0L + "'", comparable25, 0L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(xYDataItem51);
        org.junit.Assert.assertNotNull(xYSeries55);
        org.junit.Assert.assertNotNull(xYDataItem57);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        org.jfree.data.xy.XYSeries xYSeries30 = xYSeries3.createCopy((int) (short) 1, 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(xYSeries30);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries3.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.addChangeListener(seriesChangeListener6);
        xYSeries1.setMaximumItemCount((int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        java.util.List list12 = xYSeries1.data;
        boolean boolean13 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        boolean boolean35 = xYSeries29.getNotify();
        xYSeries29.add((double) 1.0f, (java.lang.Number) (short) 10, false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        int int29 = xYSeries3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener30);
        boolean boolean32 = xYSeries3.getAutoSort();
        boolean boolean33 = xYSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        xYSeries1.setKey((java.lang.Comparable) 100.0d);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((double) 0.0f, (double) 2);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener7);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        xYSeries46.removePropertyChangeListener(propertyChangeListener47);
        java.util.List list49 = xYSeries46.getItems();
        xYSeries46.clear();
        xYSeries46.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        xYSeries56.removePropertyChangeListener(propertyChangeListener57);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        xYSeries56.removePropertyChangeListener(propertyChangeListener59);
        xYSeries56.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int66 = xYSeries56.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        xYSeries56.addPropertyChangeListener(propertyChangeListener67);
        xYSeries56.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries56.remove(1);
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74, false);
        xYSeries46.add(xYDataItem74);
        org.jfree.data.xy.XYSeries xYSeries78 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries29.add(xYDataItem74, true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(xYDataItem74);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, false);
        boolean boolean3 = xYSeries2.getAutoSort();
        int int4 = xYSeries2.getMaximumItemCount();
        xYSeries2.add((double) 100L, (java.lang.Number) 0, false);
        xYSeries2.setMaximumItemCount(100);
        boolean boolean11 = xYSeries2.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        xYSeries41.add((double) (byte) 100, 1.0d);
        xYSeries41.add((double) 100L, (java.lang.Number) 0);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        xYSeries41.addPropertyChangeListener(propertyChangeListener48);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(xYSeries41);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        xYSeries3.removeChangeListener(seriesChangeListener21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries3.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        boolean boolean22 = xYSeries3.getAutoSort();
        xYSeries3.clear();
        org.junit.Assert.assertNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries3.addOrUpdate((double) (byte) 10, (double) (-4));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 0L + "'", comparable18, 0L);
        org.junit.Assert.assertNull(xYDataItem21);
        org.junit.Assert.assertNull(xYDataItem24);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAutoSort();
        boolean boolean12 = xYSeries3.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries3.removeChangeListener(seriesChangeListener13);
        boolean boolean15 = xYSeries3.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        org.jfree.data.xy.XYSeries xYSeries80 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem69, false, true);
        java.lang.Number number82 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries80.update((java.lang.Number) 0L, number82);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(xYDataItem69);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true);
        boolean boolean3 = xYSeries2.getAutoSort();
        boolean boolean4 = xYSeries2.isEmpty();
        int int5 = xYSeries2.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        int int7 = xYSeries3.indexOf((java.lang.Number) (short) 10);
        java.util.List list8 = xYSeries3.data;
        java.util.List list9 = xYSeries3.getItems();
        boolean boolean10 = xYSeries3.getAutoSort();
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        double[][] doubleArray28 = xYSeries3.toArray();
        java.lang.Object obj29 = xYSeries3.clone();
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries(comparable54, true, false);
        int int60 = xYSeries58.indexOf((java.lang.Number) (byte) 100);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0L + "'", comparable15, 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(xYDataItem41);
        org.junit.Assert.assertNotNull(xYSeries45);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertNotNull(comparable54);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        boolean boolean44 = xYSeries29.getAutoSort();
        xYSeries29.add((double) ' ', (java.lang.Number) 10L, true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        boolean boolean2 = xYSeries1.getNotify();
        xYSeries1.setDescription("");
        java.lang.String str5 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((-4), (java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) -1, true, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries3.addChangeListener(seriesChangeListener4);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
            java.lang.Number number13 = xYSeries1.getY(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        xYSeries52.removePropertyChangeListener(propertyChangeListener53);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        xYSeries52.removePropertyChangeListener(propertyChangeListener55);
        xYSeries52.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries62 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        boolean boolean63 = xYSeries52.equals((java.lang.Object) false);
        xYSeries52.add((double) (byte) 10, (double) (byte) 10, true);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener72 = null;
        xYSeries71.removePropertyChangeListener(propertyChangeListener72);
        java.beans.PropertyChangeListener propertyChangeListener74 = null;
        xYSeries71.removePropertyChangeListener(propertyChangeListener74);
        xYSeries71.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int81 = xYSeries71.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener82 = null;
        xYSeries71.addPropertyChangeListener(propertyChangeListener82);
        org.jfree.data.xy.XYDataItem xYDataItem85 = xYSeries71.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries87 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85, true);
        xYSeries52.add(xYDataItem85);
        org.jfree.data.xy.XYSeries xYSeries91 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85, false, true);
        xYSeries48.setKey((java.lang.Comparable) false);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + '#' + "'", comparable7, '#');
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertNotNull(xYSeries37);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(xYDataItem85);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        java.lang.String str26 = xYSeries1.getDescription();
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        java.util.List list23 = xYSeries3.getItems();
        boolean boolean24 = xYSeries3.getNotify();
        boolean boolean25 = xYSeries3.isEmpty();
        xYSeries3.add((double) 10.0f, (java.lang.Number) (byte) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries3.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries3.removeChangeListener(seriesChangeListener20);
        xYSeries3.clear();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        int int7 = xYSeries3.indexOf((java.lang.Number) 0.0d);
        boolean boolean9 = xYSeries3.equals((java.lang.Object) 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100.0f);
        xYSeries3.setMaximumItemCount(2147483647);
        java.lang.Object obj15 = xYSeries3.clone();
        xYSeries3.add((double) (byte) 0, (java.lang.Number) (-3), false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener83 = null;
        xYSeries2.addChangeListener(seriesChangeListener83);
        xYSeries2.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem87 = xYSeries2.getDataItem(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
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
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((java.lang.Number) (-1L), (java.lang.Number) 10.0f);
        xYSeries3.add((double) '4', (java.lang.Number) (short) -1, false);
        org.junit.Assert.assertNull(xYDataItem9);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        int int37 = xYSeries23.indexOf((java.lang.Number) (short) 1);
        xYSeries23.add((double) (byte) 100, (java.lang.Number) 10.0f, true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2) + "'", int37 == (-2));
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        xYSeries3.setMaximumItemCount((int) '#');
        xYSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 10.0f, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener53 = null;
        xYSeries52.removeChangeListener(seriesChangeListener53);
        double[][] doubleArray55 = xYSeries52.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries52.addOrUpdate((java.lang.Number) (-4), (java.lang.Number) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(xYSeries52);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertNull(xYDataItem58);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        java.util.List list56 = xYSeries35.getItems();
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + number53 + "' != '" + (byte) 10 + "'", number53, (byte) 10);
        org.junit.Assert.assertEquals("'" + comparable54 + "' != '" + 0L + "'", comparable54, 0L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(list56);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.getDataItem((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(xYDataItem14);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) 100, 3);
        int int7 = xYSeries6.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries6.createCopy((int) (byte) 1, (int) (short) 10);
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
        xYSeries14.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        xYSeries14.addChangeListener(seriesChangeListener33);
        xYSeries14.setMaximumItemCount((int) (byte) 1);
        java.util.List list37 = xYSeries14.data;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        xYSeries14.removeChangeListener(seriesChangeListener38);
        java.util.List list40 = xYSeries14.data;
        boolean boolean41 = xYSeries10.equals((java.lang.Object) xYSeries14);
        xYSeries14.add((double) (-5908509288197150436L), (java.lang.Number) (short) 10);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(xYSeries10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        java.util.List list32 = xYSeries3.getItems();
        boolean boolean33 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.setNotify(true);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        xYSeries14.addChangeListener(seriesChangeListener23);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries14.addChangeListener(seriesChangeListener25);
        org.junit.Assert.assertNotNull(xYDataItem12);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        xYSeries17.add((double) 1, (double) 3, false);
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
        xYSeries17.setKey((java.lang.Comparable) xYDataItem57);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem57);
        org.jfree.data.xy.XYSeries xYSeries63 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        xYSeries63.removePropertyChangeListener(propertyChangeListener64);
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        xYSeries63.removePropertyChangeListener(propertyChangeListener66);
        xYSeries63.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray72 = xYSeries63.toArray();
        xYSeries63.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries63.setKey((java.lang.Comparable) 10.0f);
        xYSeries63.add((java.lang.Number) (byte) 10, (java.lang.Number) 0, false);
        xYSeries63.setNotify(false);
        boolean boolean85 = xYSeries3.equals((java.lang.Object) xYSeries63);
        xYSeries3.add((double) (-3), (double) (byte) 1, true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(xYDataItem51);
        org.junit.Assert.assertNotNull(xYSeries55);
        org.junit.Assert.assertNotNull(xYDataItem57);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries30.addOrUpdate((double) 'a', 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number36 = xYSeries30.getX(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNull(xYDataItem34);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.fireSeriesChanged();
        boolean boolean14 = xYSeries3.getNotify();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true);
        java.util.List list3 = xYSeries2.data;
        xYSeries2.setNotify(false);
        xYSeries2.add((double) (short) 10, (java.lang.Number) 0L, false);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        boolean boolean20 = xYSeries3.getAllowDuplicateXValues();
        int int21 = xYSeries3.getMaximumItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries3.addOrUpdate((double) 'a', (double) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem24);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries60 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        xYSeries60.removePropertyChangeListener(propertyChangeListener61);
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        xYSeries60.removePropertyChangeListener(propertyChangeListener63);
        xYSeries60.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int70 = xYSeries60.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener71 = null;
        xYSeries60.addPropertyChangeListener(propertyChangeListener71);
        xYSeries60.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem78 = xYSeries60.remove(1);
        xYSeries56.add(xYDataItem78);
        org.jfree.data.xy.XYSeries xYSeries81 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem78, false);
        xYSeries52.add(xYDataItem78);
        org.jfree.data.xy.XYSeries xYSeries83 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem78);
        org.jfree.data.xy.XYSeries xYSeries85 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem78, true);
        xYSeries2.setKey((java.lang.Comparable) true);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0L + "'", comparable15, 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(xYDataItem41);
        org.junit.Assert.assertNotNull(xYSeries45);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(xYDataItem78);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        boolean boolean26 = xYSeries3.getAllowDuplicateXValues();
        boolean boolean27 = xYSeries3.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries3.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + 0L + "'", comparable25, 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries38.delete((-3), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.addChangeListener(seriesChangeListener6);
        xYSeries1.setMaximumItemCount((int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        xYSeries1.add(1.0d, (java.lang.Number) 1.0f, true);
        java.lang.Comparable comparable16 = xYSeries1.getKey();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) -1 + "'", comparable16, (short) -1);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries3.remove(0);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener23);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(xYDataItem22);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        boolean boolean19 = xYSeries3.getNotify();
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener24);
        java.util.List list26 = xYSeries23.getItems();
        xYSeries23.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean31 = xYSeries23.getAllowDuplicateXValues();
        xYSeries23.add((double) (-1L), (double) (byte) 1);
        xYSeries23.add((double) 2147483647, (double) 'a', true);
        boolean boolean39 = xYSeries23.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries23.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries23.removePropertyChangeListener(propertyChangeListener43);
        xYSeries23.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries49 = xYSeries23.createCopy((int) ' ', (-1));
        boolean boolean50 = xYSeries3.equals((java.lang.Object) (-1));
        int int52 = xYSeries3.indexOf((java.lang.Number) 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 1.0d + "'", number13, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(xYDataItem42);
        org.junit.Assert.assertNotNull(xYSeries49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-3) + "'", int52 == (-3));
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        double[][] doubleArray38 = xYSeries2.toArray();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(xYDataItem27);
        org.junit.Assert.assertEquals("'" + number37 + "' != '" + (byte) 10 + "'", number37, (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray38);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        xYSeries3.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number34 = xYSeries3.getX((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add(10.0d, (java.lang.Number) 0.0d);
        java.lang.Number number16 = xYSeries3.getY(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries3.addChangeListener(seriesChangeListener17);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + number16 + "' != '" + 0.0d + "'", number16, 0.0d);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (-1), (java.lang.Number) 1.0d, false);
        java.util.List list18 = xYSeries3.data;
        int int19 = xYSeries3.getItemCount();
        xYSeries3.add((double) 0, (java.lang.Number) (-5908509288197150436L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) 2147483647);
        xYSeries3.add((double) 0.0f, (double) 100.0f, true);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries41.setDescription("hi!");
        xYSeries41.setMaximumItemCount(100);
        xYSeries41.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener47 = null;
        xYSeries41.removeChangeListener(seriesChangeListener47);
        xYSeries41.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries41.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) 1L);
        xYSeries41.setMaximumItemCount(2147483647);
        java.util.List list55 = xYSeries41.getItems();
        xYSeries3.data = list55;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(xYDataItem52);
        org.junit.Assert.assertNotNull(list55);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.add((double) 1, 100.0d, true);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((double) (short) -1, (double) (short) 10);
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.addOrUpdate((java.lang.Number) 100L, (java.lang.Number) 1.0d);
        xYSeries1.add((double) (short) 100, (double) '#');
        xYSeries1.add((java.lang.Number) 10.0d, (java.lang.Number) 1.0f);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertNull(xYDataItem11);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add(10.0d, (java.lang.Number) 10L, true);
        java.util.List list6 = xYSeries1.data;
        int int8 = xYSeries1.indexOf((java.lang.Number) (short) -1);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0f, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = xYSeries2.getX((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        xYSeries36.add(10.0d, (double) 3);
        xYSeries36.add((double) 4, (java.lang.Number) 0L, true);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        java.lang.Object obj79 = xYSeries1.clone();
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(xYDataItem67);
        org.junit.Assert.assertNotNull(obj79);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((-1.0d), (double) 10);
        boolean boolean10 = xYSeries3.getNotify();
        java.lang.Class<?> wildcardClass11 = xYSeries3.getClass();
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        java.util.List list23 = xYSeries3.getItems();
        boolean boolean24 = xYSeries3.getNotify();
        int int26 = xYSeries3.indexOf((java.lang.Number) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        java.lang.Number number17 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update(number17, (java.lang.Number) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        xYSeries6.add((java.lang.Number) 100, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable40 = xYSeries6.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries6.remove((java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + "hi!" + "'", comparable40, "hi!");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        java.util.List list83 = xYSeries9.data;
        xYSeries9.add((double) 4, (double) (short) 0, false);
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
        org.junit.Assert.assertNotNull(list83);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((-1.0d), (double) 10);
        xYSeries3.setMaximumItemCount(2147483647);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries3.addOrUpdate((double) (-1L), (double) (-5908509288197150436L));
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 1.0d, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNull(xYDataItem17);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        xYSeries29.add((double) (-1), (double) 'a', false);
        java.lang.Class<?> wildcardClass34 = xYSeries29.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.lang.Number number9 = xYSeries3.getY((int) (short) 0);
        int int10 = xYSeries3.getItemCount();
        xYSeries3.add((java.lang.Number) (short) 10, (java.lang.Number) 0, true);
        xYSeries3.add((java.lang.Number) 4, (java.lang.Number) 1);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.clear();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener14);
        xYSeries11.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int21 = xYSeries11.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries11.addPropertyChangeListener(propertyChangeListener22);
        xYSeries11.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries11.remove(1);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem29, false);
        xYSeries3.add(xYDataItem29, false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(xYDataItem29);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        xYSeries3.clear();
        java.lang.Comparable comparable15 = xYSeries3.getKey();
        boolean boolean16 = xYSeries3.getAutoSort();
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 100 + "'", comparable15, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d);
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean7 = xYSeries3.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener16);
        xYSeries13.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray22 = xYSeries13.toArray();
        xYSeries13.add((double) 1, (java.lang.Number) (short) 1, true);
        int int28 = xYSeries13.indexOf((java.lang.Number) 1.0d);
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
        org.jfree.data.xy.XYSeries xYSeries77 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem71, false);
        xYSeries13.add(xYDataItem71);
        xYSeries3.add(xYDataItem71);
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem71, false, true);
        xYSeries1.add(xYDataItem71);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(xYDataItem71);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number30 = xYSeries3.getY(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(0, 2);
        java.util.List list10 = xYSeries9.getItems();
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        java.lang.Object obj19 = xYSeries3.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries3.addChangeListener(seriesChangeListener20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 1.0d + "'", number13, 1.0d);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        int int20 = xYSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        java.util.List list5 = xYSeries3.getItems();
        java.lang.Comparable comparable6 = xYSeries3.getKey();
        xYSeries3.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10L + "'", comparable6, 10L);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', false, false);
        java.util.List list4 = xYSeries3.data;
        java.lang.Class<?> wildcardClass5 = xYSeries3.getClass();
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries3.addOrUpdate((java.lang.Number) 0, (java.lang.Number) (-5908509288197150436L));
        double[][] doubleArray40 = xYSeries3.toArray();
        int int41 = xYSeries3.getItemCount();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertNull(xYDataItem39);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.lang.Number number9 = xYSeries3.getY((int) (short) 0);
        boolean boolean10 = xYSeries3.getNotify();
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        int int16 = xYSeries15.getMaximumItemCount();
        double[][] doubleArray17 = xYSeries15.toArray();
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener24);
        xYSeries21.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int31 = xYSeries21.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener36);
        java.util.List list38 = xYSeries35.getItems();
        xYSeries21.data = list38;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        xYSeries21.addChangeListener(seriesChangeListener40);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries43.add(10.0d, (java.lang.Number) 10L, true);
        java.util.List list48 = xYSeries43.data;
        xYSeries21.data = list48;
        xYSeries15.data = list48;
        xYSeries3.data = list48;
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list48);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        org.jfree.data.xy.XYSeries xYSeries31 = xYSeries3.createCopy((int) '4', 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(xYSeries31);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.util.List list8 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener15);
        xYSeries12.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray21 = xYSeries12.toArray();
        xYSeries12.add((double) 1, (java.lang.Number) (short) 1, true);
        org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries12.addOrUpdate((java.lang.Number) 10.0d, (java.lang.Number) (-1L));
        java.lang.Object obj29 = xYSeries12.clone();
        xYSeries12.add(1.0d, (java.lang.Number) 100.0f, true);
        int int35 = xYSeries12.indexOf((java.lang.Number) 1L);
        java.util.List list36 = xYSeries12.getItems();
        boolean boolean37 = xYSeries3.equals((java.lang.Object) list36);
        java.lang.Comparable comparable38 = xYSeries3.getKey();
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNull(xYDataItem28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + true + "'", comparable38, true);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        xYSeries29.setMaximumItemCount(1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries6.addOrUpdate((java.lang.Number) (short) -1, (java.lang.Number) 0L);
        boolean boolean10 = xYSeries6.getAutoSort();
        java.util.List list11 = xYSeries6.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries6.remove((java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (-1L), (double) (byte) 1);
        xYSeries3.clear();
        org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries3.addOrUpdate((double) 100L, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete(4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem18);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        java.util.List list76 = xYSeries3.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem78 = xYSeries3.getDataItem((int) (byte) 0);
        xYSeries3.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(xYDataItem66);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertNotNull(xYDataItem78);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem17);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.removeChangeListener(seriesChangeListener9);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries3.createCopy((int) (short) 10, 0);
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries3.createCopy(0, (int) (short) 1);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertNotNull(xYSeries17);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        int int4 = xYSeries3.getItemCount();
        boolean boolean5 = xYSeries3.getNotify();
        xYSeries3.add((double) 0, (java.lang.Number) 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        java.lang.Comparable comparable6 = xYSeries3.getKey();
        double[][] doubleArray7 = xYSeries3.toArray();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener14);
        xYSeries11.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray20 = xYSeries11.toArray();
        xYSeries11.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries11.setKey((java.lang.Comparable) 10.0f);
        xYSeries11.add((java.lang.Number) (byte) 10, (java.lang.Number) 0, false);
        java.util.List list31 = xYSeries11.getItems();
        boolean boolean32 = xYSeries3.equals((java.lang.Object) xYSeries11);
        xYSeries3.clear();
        xYSeries3.add(0.0d, (-1.0d), true);
        xYSeries3.add((double) 1, (java.lang.Number) (byte) 0);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 0L + "'", comparable6, 0L);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) boolean69, false);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(xYSeries37);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(xYDataItem63);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        java.lang.Object obj6 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 10, (-2));
        boolean boolean10 = xYSeries9.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries9.remove((java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        boolean boolean16 = xYSeries3.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries20.setNotify(false);
        boolean boolean23 = xYSeries20.getNotify();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener30);
        java.util.List list32 = xYSeries29.getItems();
        xYSeries25.data = list32;
        boolean boolean34 = xYSeries20.equals((java.lang.Object) xYSeries25);
        boolean boolean35 = xYSeries3.equals((java.lang.Object) boolean34);
        boolean boolean36 = xYSeries3.getAutoSort();
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener37);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        boolean boolean12 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.setNotify(true);
        xYSeries3.add((double) (byte) 10, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        java.lang.String str7 = xYSeries3.getDescription();
        java.lang.Object obj8 = xYSeries3.clone();
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
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30, false);
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries32.addOrUpdate((double) '4', (double) (short) 100);
        boolean boolean36 = xYSeries3.equals((java.lang.Object) xYSeries32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = xYSeries3.getX((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertNull(xYDataItem35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        xYSeries3.setNotify(true);
        java.util.List list8 = xYSeries3.data;
        xYSeries3.add(1.0d, (double) 0L, true);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-2), false);
        org.jfree.data.xy.XYSeries xYSeries86 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        double[][] doubleArray87 = xYSeries86.toArray();
        boolean boolean88 = xYSeries82.equals((java.lang.Object) doubleArray87);
        boolean boolean89 = xYSeries79.equals((java.lang.Object) xYSeries82);
        int int91 = xYSeries79.indexOf((java.lang.Number) (-3));
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(xYDataItem69);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", true, true);
        xYSeries3.setDescription("hi!");
        double[][] doubleArray6 = xYSeries3.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate(100.0d, 100.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNull(xYDataItem9);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        int int7 = xYSeries3.indexOf((java.lang.Number) 0.0d);
        boolean boolean9 = xYSeries3.equals((java.lang.Object) 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100.0f);
        xYSeries3.clear();
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries3.addOrUpdate((double) 10, (double) 1L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNull(xYDataItem16);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        boolean boolean7 = xYSeries3.isEmpty();
        xYSeries3.add((java.lang.Number) 100.0d, (java.lang.Number) 0L);
        xYSeries3.add((double) 1L, (java.lang.Number) 10.0d, true);
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries3.addOrUpdate((double) 0L, (double) (-2));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = xYSeries3.getX((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(xYDataItem17);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries3.addChangeListener(seriesChangeListener4);
        xYSeries3.setMaximumItemCount(2147483647);
        xYSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) (short) 10, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        xYSeries3.clear();
        xYSeries3.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 0L + "'", comparable18, 0L);
        org.junit.Assert.assertNull(xYDataItem21);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        xYSeries24.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 0, false, false);
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener20);
        java.util.List list22 = xYSeries19.getItems();
        xYSeries19.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean27 = xYSeries19.isEmpty();
        boolean boolean28 = xYSeries19.getAllowDuplicateXValues();
        boolean boolean29 = xYSeries15.equals((java.lang.Object) xYSeries19);
        xYSeries19.add((java.lang.Number) 1.0f, (java.lang.Number) (byte) 1, true);
        xYSeries19.add((double) 0, (double) 10);
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        java.lang.String str6 = xYSeries3.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.addChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.getDataItem(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        xYSeries3.setKey((java.lang.Comparable) 10.0f);
        boolean boolean65 = xYSeries3.getAutoSort();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(xYDataItem54);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number37 = xYSeries1.getY((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(xYDataItem27);
        org.junit.Assert.assertNotNull(xYSeries31);
        org.junit.Assert.assertNotNull(xYDataItem33);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
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
        xYSeries34.add(xYDataItem66, false);
        xYSeries32.setKey((java.lang.Comparable) false);
        java.lang.Object obj70 = xYSeries32.clone();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYSeries32);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(xYDataItem60);
        org.junit.Assert.assertNotNull(xYSeries64);
        org.junit.Assert.assertNotNull(xYDataItem66);
        org.junit.Assert.assertNotNull(obj70);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        xYSeries3.add((double) '#', (double) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries3.removeChangeListener(seriesChangeListener25);
        boolean boolean27 = xYSeries3.isEmpty();
        xYSeries3.fireSeriesChanged();
        java.lang.Object obj29 = xYSeries3.clone();
        int int30 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39, true, false);
        boolean boolean48 = xYSeries47.getAllowDuplicateXValues();
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries47.addPropertyChangeListener(propertyChangeListener49);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + '#' + "'", comparable7, '#');
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertNotNull(xYSeries37);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, false);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        boolean boolean23 = xYSeries20.equals((java.lang.Object) (-1.0d));
        int int24 = xYSeries20.getMaximumItemCount();
        java.util.List list25 = xYSeries20.data;
        xYSeries3.data = list25;
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries3.addOrUpdate((double) (short) 10, (double) (-1));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 0L + "'", comparable13, 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNull(xYDataItem29);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        xYSeries29.clear();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries29.update((java.lang.Number) 0, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', false, false);
        java.util.List list4 = xYSeries3.data;
        xYSeries3.add((double) 0.0f, (double) (-1L));
        int int8 = xYSeries3.getItemCount();
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        boolean boolean8 = xYSeries3.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 'a');
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem32, true);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries37.addPropertyChangeListener(propertyChangeListener38);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(xYDataItem32);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        int int28 = xYSeries3.indexOf((java.lang.Number) (byte) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        xYSeries3.removeChangeListener(seriesChangeListener29);
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries3.createCopy((int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
        org.junit.Assert.assertNotNull(xYSeries33);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries(comparable54, false, false);
        int int58 = xYSeries57.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0L + "'", comparable15, 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(xYDataItem41);
        org.junit.Assert.assertNotNull(xYSeries45);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertNotNull(comparable54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        xYSeries3.clear();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(xYDataItem39);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
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
        int int39 = xYSeries35.indexOf((java.lang.Number) 0L);
        xYSeries35.setNotify(false);
        java.lang.Comparable comparable42 = xYSeries35.getKey();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(comparable42);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener83 = null;
        xYSeries2.addChangeListener(seriesChangeListener83);
        boolean boolean85 = xYSeries2.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(xYDataItem73);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        org.jfree.data.xy.XYSeries xYSeries98 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem87, false);
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
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) 100, 3);
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.addOrUpdate((double) (byte) 0, (double) 4);
        xYSeries3.add((double) (short) 0, (double) (byte) 10);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem11);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((java.lang.Number) (byte) 10, (java.lang.Number) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries3.createCopy((-2), 1);
        xYSeries3.add((java.lang.Number) 0, (java.lang.Number) 2147483647, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries10);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        xYSeries3.add((double) 0, (double) 2, false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        xYSeries3.add((java.lang.Number) (short) -1, (java.lang.Number) (byte) 0);
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
        xYSeries45.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener64 = null;
        xYSeries45.addChangeListener(seriesChangeListener64);
        org.jfree.data.xy.XYSeries xYSeries69 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        xYSeries69.removePropertyChangeListener(propertyChangeListener70);
        java.beans.PropertyChangeListener propertyChangeListener72 = null;
        xYSeries69.removePropertyChangeListener(propertyChangeListener72);
        xYSeries69.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int79 = xYSeries69.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries83 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener84 = null;
        xYSeries83.removePropertyChangeListener(propertyChangeListener84);
        java.util.List list86 = xYSeries83.getItems();
        xYSeries69.data = list86;
        xYSeries45.data = list86;
        xYSeries3.data = list86;
        int int90 = xYSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 1.0d, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(list86);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        xYSeries3.add(0.0d, (java.lang.Number) 0.0d, false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener53 = null;
        xYSeries3.removeChangeListener(seriesChangeListener53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(xYDataItem50);
        org.junit.Assert.assertNotNull(list51);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        boolean boolean43 = xYSeries36.isEmpty();
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        xYSeries1.setNotify(false);
        int int8 = xYSeries1.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true);
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
        xYSeries11.setKey((java.lang.Comparable) xYDataItem38);
        xYSeries1.add(xYDataItem38);
        org.jfree.data.xy.XYDataItem xYDataItem44 = xYSeries1.addOrUpdate((double) (-3), (double) ' ');
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNull(xYDataItem44);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), true, false);
        xYSeries3.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries3.addChangeListener(seriesChangeListener5);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries1.getDataItem(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + '#' + "'", comparable2, '#');
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(xYDataItem48);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
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
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Object obj34 = xYSeries33.clone();
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries33.addPropertyChangeListener(propertyChangeListener35);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener37 = null;
        xYSeries33.removeChangeListener(seriesChangeListener37);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries33.addPropertyChangeListener(propertyChangeListener39);
        int int41 = xYSeries33.getItemCount();
        java.lang.String str42 = xYSeries33.getDescription();
        java.util.List list43 = xYSeries33.data;
        boolean boolean44 = xYSeries1.equals((java.lang.Object) list43);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(xYDataItem27);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0, false, false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(xYDataItem37);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.addOrUpdate((java.lang.Number) (-1.0f), (java.lang.Number) 0);
        xYSeries3.add((double) (byte) 1, (-1.0d));
        xYSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 0.0f, (java.lang.Number) (-4));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = xYSeries3.getX((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        xYSeries3.add((double) '4', (java.lang.Number) 100.0d, true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.isEmpty();
        boolean boolean12 = xYSeries3.getAllowDuplicateXValues();
        java.util.List list13 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 10.0d, (java.lang.Number) (byte) 10, false);
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
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem54, false, false);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem54);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(xYDataItem54);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        xYSeries3.setMaximumItemCount(0);
        xYSeries3.clear();
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
        xYSeries14.setDescription("hi!");
        int int33 = xYSeries14.getMaximumItemCount();
        xYSeries14.add((double) (-1), (java.lang.Number) (short) 100, false);
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries14.getDataItem(0);
        xYSeries3.add(xYDataItem39);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(xYDataItem39);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem3 = xYSeries1.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        xYSeries3.clear();
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
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
        xYSeries40.setKey((java.lang.Comparable) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener43 = null;
        xYSeries40.addChangeListener(seriesChangeListener43);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(xYDataItem36);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.removeChangeListener(seriesChangeListener9);
        xYSeries3.fireSeriesChanged();
        xYSeries3.setDescription("hi!");
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.util.List list20 = xYSeries17.getItems();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener25);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener33);
        xYSeries30.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray39 = xYSeries30.toArray();
        xYSeries30.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries30.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries30.remove((int) (short) 1);
        xYSeries24.add(xYDataItem47);
        xYSeries17.add(xYDataItem47, true);
        xYSeries3.add(xYDataItem47, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener53 = null;
        xYSeries3.addChangeListener(seriesChangeListener53);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(xYDataItem47);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        xYSeries3.add((double) '#', (double) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries3.removeChangeListener(seriesChangeListener25);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Object obj29 = xYSeries28.clone();
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries28.addPropertyChangeListener(propertyChangeListener30);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries28.removeChangeListener(seriesChangeListener32);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries28.addPropertyChangeListener(propertyChangeListener34);
        int int36 = xYSeries28.getItemCount();
        java.lang.String str37 = xYSeries28.getDescription();
        java.util.List list38 = xYSeries28.data;
        java.util.List list39 = xYSeries28.getItems();
        xYSeries3.data = list39;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list39);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
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
        xYSeries23.clear();
        xYSeries23.add(100.0d, (java.lang.Number) 10, false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNull(xYDataItem26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
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
        java.beans.PropertyChangeListener propertyChangeListener78 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener78);
        org.jfree.data.xy.XYDataItem xYDataItem82 = xYSeries3.addOrUpdate((double) 2147483647, 0.0d);
        org.jfree.data.xy.XYSeries xYSeries86 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener87 = null;
        xYSeries86.removePropertyChangeListener(propertyChangeListener87);
        int int90 = xYSeries86.indexOf((java.lang.Number) (short) 10);
        java.util.List list91 = xYSeries86.data;
        java.util.List list92 = xYSeries86.getItems();
        xYSeries3.data = list92;
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(xYDataItem23);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(xYDataItem66);
        org.junit.Assert.assertNull(xYDataItem82);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(list91);
        org.junit.Assert.assertNotNull(list92);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        java.util.List list14 = xYSeries3.getItems();
        boolean boolean15 = xYSeries3.getNotify();
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        xYSeries3.add((double) (short) 100, (java.lang.Number) 100.0d, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries3.removeChangeListener(seriesChangeListener22);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
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
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        java.lang.String str42 = xYSeries41.getDescription();
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        xYSeries46.removePropertyChangeListener(propertyChangeListener47);
        java.util.List list49 = xYSeries46.getItems();
        xYSeries46.clear();
        xYSeries46.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        xYSeries56.removePropertyChangeListener(propertyChangeListener57);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        xYSeries56.removePropertyChangeListener(propertyChangeListener59);
        xYSeries56.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int66 = xYSeries56.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        xYSeries56.addPropertyChangeListener(propertyChangeListener67);
        xYSeries56.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries56.remove(1);
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74, false);
        xYSeries46.add(xYDataItem74);
        xYSeries41.setKey((java.lang.Comparable) xYDataItem74);
        org.jfree.data.xy.XYSeries xYSeries79 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74);
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74, false, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries6.add(xYDataItem74, true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(xYDataItem74);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
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
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
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
        xYSeries3.add((java.lang.Number) (short) -1, (java.lang.Number) (byte) 0);
        boolean boolean42 = xYSeries3.getNotify();
        double[][] doubleArray43 = xYSeries3.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries3.remove((java.lang.Number) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(xYDataItem45);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        java.beans.PropertyChangeListener propertyChangeListener78 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener78);
        boolean boolean80 = xYSeries3.isEmpty();
        java.util.List list81 = xYSeries3.data;
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(xYDataItem23);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(xYDataItem66);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(list81);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
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
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int48 = xYSeries46.indexOf((java.lang.Number) (byte) -1);
        int int50 = xYSeries46.indexOf((java.lang.Number) 0.0d);
        boolean boolean52 = xYSeries46.equals((java.lang.Object) 0.0d);
        xYSeries46.clear();
        boolean boolean54 = xYSeries36.equals((java.lang.Object) xYSeries46);
        boolean boolean55 = xYSeries36.getNotify();
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        org.jfree.data.xy.XYSeries xYSeries33 = xYSeries28.createCopy((int) (short) 100, (int) (byte) 100);
        int int35 = xYSeries28.indexOf((java.lang.Number) (short) 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(xYSeries33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
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
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(xYDataItem32);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10);
        xYSeries1.add((double) (byte) 100, (java.lang.Number) 4, false);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        int int7 = xYSeries3.indexOf((java.lang.Number) 0.0d);
        boolean boolean9 = xYSeries3.equals((java.lang.Object) 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100.0f);
        xYSeries3.add((double) 3, (double) ' ', true);
        java.lang.Comparable comparable17 = xYSeries3.getKey();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (-1L) + "'", comparable17, (-1L));
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries12.removePropertyChangeListener(propertyChangeListener15);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener21);
        java.util.List list23 = xYSeries20.getItems();
        xYSeries12.data = list23;
        xYSeries3.data = list23;
        boolean boolean26 = xYSeries3.getAutoSort();
        boolean boolean27 = xYSeries3.getAutoSort();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        xYSeries3.clear();
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) (byte) 1, 0.0d);
        int int11 = xYSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener53 = null;
        xYSeries52.removeChangeListener(seriesChangeListener53);
        double[][] doubleArray55 = xYSeries52.toArray();
        xYSeries52.add((double) 100.0f, (double) 10L, true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(xYSeries52);
        org.junit.Assert.assertNotNull(doubleArray55);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        xYSeries3.addChangeListener(seriesChangeListener41);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries46.setDescription("");
        java.lang.String str49 = xYSeries46.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener50 = null;
        xYSeries46.addChangeListener(seriesChangeListener50);
        boolean boolean52 = xYSeries3.equals((java.lang.Object) xYSeries46);
        xYSeries46.setNotify(false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries17 = xYSeries3.createCopy((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(xYSeries17);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries3.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries3.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(xYDataItem50);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries8.removePropertyChangeListener(propertyChangeListener9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries8.removePropertyChangeListener(propertyChangeListener11);
        xYSeries8.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int18 = xYSeries8.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries8.addPropertyChangeListener(propertyChangeListener19);
        xYSeries8.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        xYSeries8.setDescription("hi!");
        int int27 = xYSeries8.getMaximumItemCount();
        xYSeries8.clear();
        xYSeries8.add((double) (short) 10, (java.lang.Number) 0L, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        xYSeries8.addChangeListener(seriesChangeListener33);
        boolean boolean35 = xYSeries3.equals((java.lang.Object) xYSeries8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        double[][] doubleArray28 = xYSeries3.toArray();
        java.lang.Comparable comparable29 = xYSeries3.getKey();
        xYSeries3.update((java.lang.Number) (byte) 10, (java.lang.Number) 10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + 0L + "'", comparable29, 0L);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        xYSeries1.add((double) 3, (java.lang.Number) (short) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (short) -1, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(xYDataItem27);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.removeChangeListener(seriesChangeListener6);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries3.addChangeListener(seriesChangeListener8);
        xYSeries3.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 10.0f, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.lang.Number number9 = xYSeries3.getY((int) (short) 0);
        double[][] doubleArray10 = xYSeries3.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (short) 100);
        java.lang.Number number15 = xYSeries3.getX((int) (short) 1);
        xYSeries3.add((double) 'a', (java.lang.Number) 0L, true);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (short) 100 + "'", number15, (short) 100);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
        boolean boolean26 = xYSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries3.remove((java.lang.Number) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Object obj2 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries1.removeChangeListener(seriesChangeListener5);
        java.util.List list7 = xYSeries1.getItems();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
        xYSeries15.delete((int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 0L + "'", comparable20, 0L);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(xYDataItem65);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) 100, 3);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (short) 10);
        boolean boolean10 = xYSeries3.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        xYSeries14.removePropertyChangeListener(propertyChangeListener15);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries14.removePropertyChangeListener(propertyChangeListener17);
        xYSeries14.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int24 = xYSeries14.indexOf((java.lang.Number) 0.0f);
        xYSeries14.add((double) (-1), (java.lang.Number) 1.0d, false);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener33);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener35);
        xYSeries32.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray41 = xYSeries32.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries32.getDataItem((int) (short) 0);
        xYSeries14.add(xYDataItem43);
        xYSeries3.add(xYDataItem43);
        org.jfree.data.xy.XYSeries xYSeries48 = xYSeries3.createCopy((int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertNotNull(xYDataItem43);
        org.junit.Assert.assertNotNull(xYSeries48);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
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
        java.lang.Object obj40 = xYSeries38.clone();
        org.jfree.data.xy.XYSeries xYSeries43 = xYSeries38.createCopy(3, (int) '4');
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(xYSeries43);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        int int7 = xYSeries3.indexOf((java.lang.Number) (short) 10);
        java.util.List list8 = xYSeries3.data;
        xYSeries3.add((java.lang.Number) 2147483647, (java.lang.Number) (-2), false);
        java.util.List list13 = xYSeries3.getItems();
        java.lang.String str14 = xYSeries3.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries3.getDataItem((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(xYDataItem16);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
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
        java.lang.Object obj54 = xYSeries3.clone();
        xYSeries3.add((java.lang.Number) (-2), (java.lang.Number) (-1), true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertNotNull(xYSeries43);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(obj54);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        xYSeries3.fireSeriesChanged();
        int int13 = xYSeries3.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries3.addChangeListener(seriesChangeListener14);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
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
        org.jfree.data.xy.XYSeries xYSeries23 = xYSeries3.createCopy((int) (byte) 10, (int) '4');
        org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries3.addOrUpdate((double) (-5908509288197150436L), (double) (byte) 100);
        java.lang.String str27 = xYSeries3.getDescription();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem18);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertNull(xYDataItem26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) -1, (int) '#');
        java.util.List list5 = xYSeries4.data;
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries4.addOrUpdate((java.lang.Number) (-1.0d), (java.lang.Number) 100.0f);
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(xYDataItem8);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.removeChangeListener(seriesChangeListener9);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries14 = xYSeries3.createCopy((int) (short) 10, 0);
        java.lang.Number number15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries14.update(number15, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries14);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((java.lang.Number) (-1L), (java.lang.Number) 10.0f);
        boolean boolean10 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.setMaximumItemCount((int) (byte) 0);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries3.addOrUpdate((double) '4', (double) 100L);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries24.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        xYSeries24.removeChangeListener(seriesChangeListener27);
        java.lang.String str29 = xYSeries24.getDescription();
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries33.setDescription("");
        java.lang.String str36 = xYSeries33.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries33.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries43.add((double) 0.0f, 0.0d);
        xYSeries43.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean51 = xYSeries43.getAllowDuplicateXValues();
        xYSeries43.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
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
        xYSeries56.add(xYDataItem82, false);
        xYSeries43.setKey((java.lang.Comparable) xYDataItem82);
        xYSeries33.add(xYDataItem82, true);
        xYSeries24.setKey((java.lang.Comparable) xYDataItem82);
        org.jfree.data.xy.XYSeries xYSeries92 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem82, true, true);
        xYSeries3.setKey((java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem95 = xYSeries3.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(xYDataItem39);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(xYDataItem82);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        boolean boolean33 = xYSeries29.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        int int26 = xYSeries3.indexOf((java.lang.Number) 1L);
        java.lang.Class<?> wildcardClass27 = xYSeries3.getClass();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) 100.0f, (java.lang.Number) (-1.0d), true);
        xYSeries1.add((double) '4', (double) (-2));
        boolean boolean9 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener16);
        xYSeries13.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int23 = xYSeries13.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries13.addPropertyChangeListener(propertyChangeListener24);
        org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries13.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem27, true, true);
        xYSeries1.add(xYDataItem27);
        java.util.List list32 = xYSeries1.getItems();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(xYDataItem27);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        java.util.List list23 = xYSeries15.data;
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries15.addPropertyChangeListener(propertyChangeListener24);
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 0 + "'", comparable16, (byte) 0);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number83 = xYSeries1.getX((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(xYDataItem69);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false);
        int int77 = xYSeries76.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(xYDataItem66);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2147483647 + "'", int77 == 2147483647);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
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
        org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries30.addOrUpdate((double) 'a', 0.0d);
        xYSeries30.fireSeriesChanged();
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNull(xYDataItem34);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener23);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener29);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener31);
        xYSeries28.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray37 = xYSeries28.toArray();
        xYSeries28.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries28.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries28.remove((int) (short) 1);
        xYSeries22.add(xYDataItem45);
        xYSeries18.setKey((java.lang.Comparable) xYDataItem45);
        xYSeries3.add(xYDataItem45, false);
        xYSeries3.add((double) (byte) 10, (double) (short) 100, false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(xYDataItem45);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
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
        java.lang.String str29 = xYSeries1.getDescription();
        boolean boolean30 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
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
        xYSeries3.add((double) ' ', (double) ' ', true);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener28);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener30);
        xYSeries27.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int37 = xYSeries27.indexOf((java.lang.Number) 0.0f);
        xYSeries27.add((double) (-1), (java.lang.Number) 1.0d, false);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries27.addPropertyChangeListener(propertyChangeListener42);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries48 = xYSeries45.createCopy((int) (short) 1, (int) 'a');
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        xYSeries56.removePropertyChangeListener(propertyChangeListener57);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        xYSeries56.removePropertyChangeListener(propertyChangeListener59);
        xYSeries56.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int66 = xYSeries56.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        xYSeries56.addPropertyChangeListener(propertyChangeListener67);
        xYSeries56.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries56.remove(1);
        xYSeries52.add(xYDataItem74);
        org.jfree.data.xy.XYSeries xYSeries77 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74, false);
        xYSeries45.add(xYDataItem74);
        xYSeries27.setKey((java.lang.Comparable) xYDataItem74);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem74);
        xYSeries3.setDescription("");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(xYSeries48);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(xYDataItem74);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
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
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener38);
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries43.removePropertyChangeListener(propertyChangeListener44);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        xYSeries43.removePropertyChangeListener(propertyChangeListener46);
        xYSeries43.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray52 = xYSeries43.toArray();
        xYSeries43.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries43.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries43.remove((int) (short) 1);
        xYSeries37.add(xYDataItem60);
        xYSeries33.setKey((java.lang.Comparable) xYDataItem60);
        xYSeries28.add(xYDataItem60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertNotNull(xYDataItem60);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        int int4 = xYSeries3.getItemCount();
        java.lang.Comparable comparable5 = xYSeries3.getKey();
        xYSeries3.add((double) ' ', (double) 0L, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 100.0d + "'", comparable5, 100.0d);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
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
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44, false);
        int int52 = xYSeries51.getItemCount();
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
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
        xYSeries48.add((java.lang.Number) 1L, (java.lang.Number) (-5908509288197150436L), false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
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
        xYSeries3.clear();
        boolean boolean15 = xYSeries3.getAllowDuplicateXValues();
        java.util.List list16 = xYSeries3.data;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
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
        org.jfree.data.xy.XYSeries xYSeries23 = xYSeries3.createCopy((int) (byte) 10, (int) '4');
        java.lang.Comparable comparable24 = xYSeries23.getKey();
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries26.add(0.0d, (java.lang.Number) 0.0d, false);
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries26.remove((int) (byte) 0);
        xYSeries23.add(xYDataItem32);
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem32);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem18);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + 0L + "'", comparable24, 0L);
        org.junit.Assert.assertNotNull(xYDataItem32);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 100);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        xYSeries5.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable9 = xYSeries8.getKey();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener20);
        xYSeries17.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int27 = xYSeries17.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries17.addPropertyChangeListener(propertyChangeListener28);
        xYSeries17.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries17.remove(1);
        xYSeries13.add(xYDataItem35);
        org.jfree.data.xy.XYSeries xYSeries39 = xYSeries13.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries13.remove(0);
        xYSeries8.setKey((java.lang.Comparable) xYDataItem41);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem41, false, false);
        xYSeries5.add(xYDataItem41);
        xYSeries1.add(xYDataItem41);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + '#' + "'", comparable9, '#');
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(xYDataItem35);
        org.junit.Assert.assertNotNull(xYSeries39);
        org.junit.Assert.assertNotNull(xYDataItem41);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.delete((int) (byte) 10, 2);
        xYSeries3.setMaximumItemCount((int) (short) 100);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.addOrUpdate((java.lang.Number) 100L, (java.lang.Number) (-2));
        xYSeries3.add((double) 1.0f, (java.lang.Number) (-1L), false);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 100, true);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        org.jfree.data.xy.XYSeries xYSeries8 = xYSeries5.createCopy(2, (int) ' ');
        xYSeries8.setMaximumItemCount(0);
        int int11 = xYSeries8.getItemCount();
        boolean boolean12 = xYSeries2.equals((java.lang.Object) int11);
        int int13 = xYSeries2.getItemCount();
        org.junit.Assert.assertNotNull(xYSeries8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries9.getX((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(xYSeries9);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        xYSeries1.setNotify(false);
        int int8 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        java.lang.Class<?> wildcardClass10 = xYSeries1.getClass();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
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
        org.jfree.data.xy.XYSeries xYSeries44 = xYSeries29.createCopy((int) '4', (int) ' ');
        xYSeries29.setMaximumItemCount(2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertNotNull(xYSeries44);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add(10.0d, (java.lang.Number) 10L, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.addChangeListener(seriesChangeListener6);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.lang.Number number9 = xYSeries3.getY((int) (short) 0);
        int int10 = xYSeries3.getItemCount();
        xYSeries3.add((java.lang.Number) (short) 10, (java.lang.Number) 0, true);
        java.lang.String str15 = xYSeries3.getDescription();
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.clear();
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener20);
        xYSeries17.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int27 = xYSeries17.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries17.addPropertyChangeListener(propertyChangeListener28);
        xYSeries17.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries17.remove(1);
        xYSeries13.add(xYDataItem35);
        org.jfree.data.xy.XYSeries xYSeries39 = xYSeries13.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries39.addOrUpdate((double) (short) 100, (double) (byte) 1);
        xYSeries39.add((double) 0L, (java.lang.Number) 1.0d, false);
        boolean boolean47 = xYSeries39.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        xYSeries39.addPropertyChangeListener(propertyChangeListener48);
        boolean boolean50 = xYSeries39.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        org.jfree.data.xy.XYDataItem xYDataItem57 = xYSeries54.addOrUpdate((double) 100.0f, (double) 0);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        xYSeries61.removePropertyChangeListener(propertyChangeListener62);
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        xYSeries61.removePropertyChangeListener(propertyChangeListener64);
        xYSeries61.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int71 = xYSeries61.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries75 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener76 = null;
        xYSeries75.removePropertyChangeListener(propertyChangeListener76);
        java.util.List list78 = xYSeries75.getItems();
        xYSeries61.data = list78;
        xYSeries61.fireSeriesChanged();
        java.util.List list81 = xYSeries61.data;
        xYSeries54.data = list81;
        java.util.List list83 = xYSeries54.getItems();
        xYSeries39.data = list83;
        xYSeries3.data = list83;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number87 = xYSeries3.getX(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(xYDataItem35);
        org.junit.Assert.assertNotNull(xYSeries39);
        org.junit.Assert.assertNull(xYDataItem42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(xYDataItem57);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(list78);
        org.junit.Assert.assertNotNull(list81);
        org.junit.Assert.assertNotNull(list83);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.add(0.0d, (java.lang.Number) 0.0d, false);
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.remove((int) (byte) 0);
        xYSeries1.setNotify(true);
        org.junit.Assert.assertNotNull(xYDataItem7);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        boolean boolean25 = xYSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(10.0d, 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        org.jfree.data.xy.XYSeries xYSeries45 = xYSeries36.createCopy((int) (byte) 100, 3);
        xYSeries36.add((double) 10.0f, (java.lang.Number) 10L, true);
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertNotNull(xYSeries45);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = xYSeries1.getX(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        java.lang.String str7 = xYSeries3.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 100.0d);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries12.createCopy((int) (short) 1, (int) 'a');
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
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem41, false);
        xYSeries12.add(xYDataItem41);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem41, false);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem41);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem41, true);
        xYSeries3.add(xYDataItem41);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(xYDataItem41);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.setNotify(true);
        xYSeries3.add((double) 1, (double) (byte) -1, true);
        xYSeries3.add((java.lang.Number) 0.0f, (java.lang.Number) 100);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "", true);
        int int3 = xYSeries2.getMaximumItemCount();
        xYSeries2.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener10);
        java.util.List list12 = xYSeries9.getItems();
        xYSeries9.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean17 = xYSeries9.isEmpty();
        boolean boolean18 = xYSeries9.getAllowDuplicateXValues();
        java.util.List list19 = xYSeries9.getItems();
        xYSeries2.data = list19;
        boolean boolean21 = xYSeries2.getAutoSort();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
        boolean boolean38 = xYSeries1.equals((java.lang.Object) (-3));
        xYSeries1.update((java.lang.Number) 1.0f, (java.lang.Number) 100);
        java.lang.String str42 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number44 = xYSeries1.getX(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        boolean boolean7 = xYSeries3.isEmpty();
        boolean boolean8 = xYSeries3.getAllowDuplicateXValues();
        java.lang.Comparable comparable9 = xYSeries3.getKey();
        int int10 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 0L + "'", comparable9, 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
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
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(xYDataItem36);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
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
        java.util.List list22 = xYSeries3.data;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        int int6 = xYSeries3.getItemCount();
        xYSeries3.clear();
        xYSeries3.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
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
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem45, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem16);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(xYDataItem45);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.removeChangeListener(seriesChangeListener9);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
        boolean boolean30 = xYSeries1.isEmpty();
        java.util.List list31 = xYSeries1.data;
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
        java.lang.Object obj25 = xYSeries22.clone();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
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
        xYSeries3.clear();
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener32);
        int int35 = xYSeries31.indexOf((java.lang.Number) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener40);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener42);
        xYSeries39.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray48 = xYSeries39.toArray();
        xYSeries39.fireSeriesChanged();
        java.util.List list50 = xYSeries39.getItems();
        xYSeries31.data = list50;
        java.util.List list52 = xYSeries31.getItems();
        xYSeries3.data = list52;
        xYSeries3.setDescription("");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(list52);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-5908509288197150436L));
        boolean boolean2 = xYSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
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
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0, true, false);
        boolean boolean40 = xYSeries39.getAutoSort();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
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
        java.lang.Comparable comparable42 = xYSeries41.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number44 = xYSeries41.getY(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertNotNull(comparable42);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 0, true);
        xYSeries14.add((double) 10L, (double) 10.0f, true);
        java.lang.String str19 = xYSeries14.getDescription();
        double[][] doubleArray20 = xYSeries14.toArray();
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        java.lang.Number number13 = xYSeries3.getX((int) (byte) 0);
        java.lang.String str14 = xYSeries3.getDescription();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 1.0d + "'", number13, 1.0d);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        double[][] doubleArray6 = xYSeries3.toArray();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener11);
        java.util.List list13 = xYSeries10.getItems();
        xYSeries10.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean18 = xYSeries10.getAllowDuplicateXValues();
        xYSeries10.add((double) (-1L), (double) (byte) 1);
        xYSeries10.add((double) 2147483647, (double) 'a', true);
        boolean boolean26 = xYSeries10.getNotify();
        org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries10.addOrUpdate((java.lang.Number) (byte) 10, (java.lang.Number) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        xYSeries10.removeChangeListener(seriesChangeListener30);
        xYSeries10.add((java.lang.Number) (byte) 0, (java.lang.Number) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        xYSeries38.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable42 = xYSeries41.getKey();
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        xYSeries50.removePropertyChangeListener(propertyChangeListener51);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        xYSeries50.removePropertyChangeListener(propertyChangeListener53);
        xYSeries50.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int60 = xYSeries50.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        xYSeries50.addPropertyChangeListener(propertyChangeListener61);
        xYSeries50.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem68 = xYSeries50.remove(1);
        xYSeries46.add(xYDataItem68);
        org.jfree.data.xy.XYSeries xYSeries72 = xYSeries46.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem74 = xYSeries46.remove(0);
        xYSeries41.setKey((java.lang.Comparable) xYDataItem74);
        org.jfree.data.xy.XYSeries xYSeries78 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74, false, false);
        xYSeries38.add(xYDataItem74);
        xYSeries10.setKey((java.lang.Comparable) xYDataItem74);
        xYSeries3.add(xYDataItem74);
        org.jfree.data.xy.XYSeries xYSeries84 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74, true, false);
        org.jfree.data.xy.XYSeries xYSeries87 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true, true);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(xYDataItem29);
        org.junit.Assert.assertEquals("'" + comparable42 + "' != '" + '#' + "'", comparable42, '#');
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(xYDataItem68);
        org.junit.Assert.assertNotNull(xYSeries72);
        org.junit.Assert.assertNotNull(xYDataItem74);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        xYSeries3.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener7);
        java.lang.Comparable comparable9 = xYSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries3.getY(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1L) + "'", comparable9, (-1L));
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        java.lang.String str7 = xYSeries3.getDescription();
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        boolean boolean13 = xYSeries3.equals((java.lang.Object) false);
        xYSeries3.add((double) '#', (double) (-2), true);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-2), false);
        org.jfree.data.xy.XYSeries xYSeries23 = xYSeries20.createCopy((int) (short) 1, (int) (short) 100);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries27.add(0.0d, (double) (short) -1, true);
        java.lang.Number number33 = xYSeries27.getY((int) (short) 0);
        double[][] doubleArray34 = xYSeries27.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries27.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (short) 100);
        boolean boolean38 = xYSeries20.equals((java.lang.Object) xYSeries27);
        boolean boolean39 = xYSeries3.equals((java.lang.Object) boolean38);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertEquals("'" + number33 + "' != '" + (-1.0d) + "'", number33, (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNull(xYDataItem37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        boolean boolean2 = xYSeries1.getNotify();
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener9);
        xYSeries6.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int16 = xYSeries6.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries6.addPropertyChangeListener(propertyChangeListener17);
        xYSeries6.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries6.remove(1);
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem24, false);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem24, false);
        xYSeries1.add(xYDataItem24, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(4, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(xYDataItem24);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        int int4 = xYSeries3.getItemCount();
        java.lang.Object obj5 = xYSeries3.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries3.getDataItem((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, true, false);
        int int34 = xYSeries33.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries38.removePropertyChangeListener(propertyChangeListener39);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries38.removePropertyChangeListener(propertyChangeListener41);
        xYSeries38.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int48 = xYSeries38.indexOf((java.lang.Number) 0.0f);
        xYSeries38.add((double) (-1), (java.lang.Number) 1.0d, false);
        java.util.List list53 = xYSeries38.data;
        xYSeries33.data = list53;
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + true + "'", comparable27, true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(list53);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
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
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem48);
        xYSeries55.add((double) (short) 1, 0.0d, true);
        int int61 = xYSeries55.indexOf((java.lang.Number) (byte) 0);
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + '#' + "'", comparable2, '#');
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(xYDataItem48);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
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
        boolean boolean74 = xYSeries73.isEmpty();
        xYSeries73.setMaximumItemCount((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.fireSeriesChanged();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((double) (byte) 10, (java.lang.Number) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable9 = xYSeries8.getKey();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener18);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries17.removePropertyChangeListener(propertyChangeListener20);
        xYSeries17.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int27 = xYSeries17.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries17.addPropertyChangeListener(propertyChangeListener28);
        xYSeries17.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries17.remove(1);
        xYSeries13.add(xYDataItem35);
        org.jfree.data.xy.XYSeries xYSeries39 = xYSeries13.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries13.remove(0);
        xYSeries8.setKey((java.lang.Comparable) xYDataItem41);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem41);
        java.lang.String str44 = xYSeries1.getDescription();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (short) -1 + "'", comparable3, (short) -1);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + '#' + "'", comparable9, '#');
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(xYDataItem35);
        org.junit.Assert.assertNotNull(xYSeries39);
        org.junit.Assert.assertNotNull(xYDataItem41);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
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
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem48);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem48, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries57.delete((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + '#' + "'", comparable2, '#');
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(xYDataItem48);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem86 = xYSeries9.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "", true);
        java.util.List list3 = xYSeries2.getItems();
        int int4 = xYSeries2.getMaximumItemCount();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
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
        xYSeries3.add((double) 2147483647, (java.lang.Number) 1, false);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener39);
        int int42 = xYSeries3.indexOf((java.lang.Number) (-1.0f));
        boolean boolean43 = xYSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
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
        xYSeries28.setMaximumItemCount((int) (short) 0);
        xYSeries28.add((double) (-1.0f), (double) (-5908509288197150436L));
        xYSeries28.setDescription("");
        xYSeries28.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem39 = xYSeries28.addOrUpdate((java.lang.Number) 1.0f, (java.lang.Number) (short) -1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNull(xYDataItem39);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (-1), (java.lang.Number) 1.0d, false);
        java.util.List list18 = xYSeries3.data;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
        xYSeries30.add((double) 0, (java.lang.Number) (byte) 100);
        boolean boolean36 = xYSeries30.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener41);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries40.removePropertyChangeListener(propertyChangeListener43);
        xYSeries40.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int50 = xYSeries40.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        xYSeries40.addPropertyChangeListener(propertyChangeListener51);
        org.jfree.data.xy.XYDataItem xYDataItem54 = xYSeries40.remove((int) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        xYSeries40.addPropertyChangeListener(propertyChangeListener55);
        xYSeries40.add((double) (short) -1, (double) 2147483647);
        java.util.List list60 = xYSeries40.data;
        xYSeries30.data = list60;
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(xYDataItem54);
        org.junit.Assert.assertNotNull(list60);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.lang.Number number9 = xYSeries3.getY((int) (short) 0);
        double[][] doubleArray10 = xYSeries3.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (short) 100);
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 100, (java.lang.Number) 1L);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100, true);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries18.addPropertyChangeListener(propertyChangeListener19);
        boolean boolean21 = xYSeries18.isEmpty();
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
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
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21, false);
        java.lang.Comparable comparable26 = xYSeries25.getKey();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(comparable26);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
        int int32 = xYSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(0.0d, (java.lang.Number) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener6);
        xYSeries1.add((double) (short) 0, (double) 100L);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        int int14 = xYSeries1.indexOf((java.lang.Number) (byte) 1);
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-3) + "'", int14 == (-3));
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries15.setDescription("");
        java.lang.String str18 = xYSeries15.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries15.addChangeListener(seriesChangeListener19);
        java.util.List list21 = xYSeries15.getItems();
        xYSeries3.data = list21;
        int int23 = xYSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) (short) 100, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem59 = xYSeries56.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list60 = xYSeries56.data;
        java.lang.Object obj61 = xYSeries56.clone();
        org.jfree.data.xy.XYSeries xYSeries64 = xYSeries56.createCopy((int) (byte) 10, (-2));
        boolean boolean65 = xYSeries56.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem67 = xYSeries56.remove((int) (short) 0);
        xYSeries1.add(xYDataItem67);
        int int69 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + '#' + "'", comparable2, '#');
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(xYDataItem48);
        org.junit.Assert.assertNull(xYDataItem59);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(xYSeries64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(xYDataItem67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2147483647 + "'", int69 == 2147483647);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
            java.lang.Number number31 = xYSeries29.getY(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(xYSeries29);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        boolean boolean8 = xYSeries3.isEmpty();
        java.lang.Comparable comparable9 = xYSeries3.getKey();
        boolean boolean10 = xYSeries3.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 0L + "'", comparable9, 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        int int8 = xYSeries3.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries3.createCopy((int) '#', (int) (byte) -1);
        int int12 = xYSeries11.getMaximumItemCount();
        xYSeries11.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
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
        boolean boolean83 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(xYSeries49);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(xYDataItem75);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        int int6 = xYSeries3.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy((-2), (int) (byte) 0);
        xYSeries9.setDescription("");
        xYSeries9.add((double) 1L, (double) 10.0f);
        xYSeries9.fireSeriesChanged();
        xYSeries9.add((double) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries9);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries15.add(0.0d, (java.lang.Number) 0.0d, false);
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries15.remove((int) (byte) 0);
        xYSeries3.add(xYDataItem21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries3.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
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
        int int26 = xYSeries3.indexOf((java.lang.Number) 1L);
        java.util.List list27 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0f, (java.lang.Number) (-1L), false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        int int4 = xYSeries2.indexOf((java.lang.Number) (-1L));
        xYSeries2.setNotify(true);
        java.util.List list7 = xYSeries2.getItems();
        xYSeries2.add((double) (-1L), (java.lang.Number) (short) 10, true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        xYSeries1.setKey((java.lang.Comparable) 100.0d);
        java.lang.String str4 = xYSeries1.getDescription();
        java.lang.Object obj5 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries9.add((double) 0.0f, 0.0d);
        xYSeries9.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean17 = xYSeries9.getAllowDuplicateXValues();
        xYSeries9.fireSeriesChanged();
        xYSeries9.clear();
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries9.addOrUpdate((double) 2147483647, (-1.0d));
        java.util.List list23 = xYSeries9.getItems();
        xYSeries1.data = list23;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable2 = xYSeries1.getKey();
        xYSeries1.setMaximumItemCount(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.remove((java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + '#' + "'", comparable2, '#');
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
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
        double[][] doubleArray40 = xYSeries3.toArray();
        xYSeries3.setDescription("hi!");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(doubleArray40);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setNotify(true);
        xYSeries3.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = xYSeries3.getKey();
        java.lang.Object obj9 = xYSeries3.clone();
        java.util.List list10 = xYSeries3.data;
        double[][] doubleArray11 = xYSeries3.toArray();
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 0L + "'", comparable8, 0L);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
        int int34 = xYSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem36 = xYSeries1.remove((java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47, true, true);
        xYSeries57.add((double) 4, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(xYDataItem47);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        boolean boolean14 = xYSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
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
        java.lang.String str56 = xYSeries1.getDescription();
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + '#' + "'", comparable2, '#');
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(xYDataItem48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.clear();
        int int9 = xYSeries3.indexOf((java.lang.Number) 100.0f);
        int int10 = xYSeries3.getItemCount();
        xYSeries3.add((java.lang.Number) 0.0f, (java.lang.Number) (byte) 10);
        int int14 = xYSeries3.getMaximumItemCount();
        java.lang.Class<?> wildcardClass15 = xYSeries3.getClass();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
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
        xYSeries3.add((double) 1.0f, (java.lang.Number) (-1), false);
        java.lang.Object obj32 = xYSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem34 = xYSeries3.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        java.lang.String str6 = xYSeries3.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100);
        java.lang.Number number11 = xYSeries3.getY(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertEquals("'" + number11 + "' != '" + 100 + "'", number11, 100);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
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
        org.jfree.data.xy.XYSeries xYSeries77 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem69, false);
        org.jfree.data.xy.XYSeries xYSeries78 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
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
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
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
        boolean boolean38 = xYSeries1.equals((java.lang.Object) (-3));
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((double) (-1), (java.lang.Number) 1.0d, false);
        xYSeries3.clear();
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-5908509288197150436L));
        java.lang.String str21 = xYSeries20.getDescription();
        boolean boolean22 = xYSeries3.equals((java.lang.Object) xYSeries20);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
        boolean boolean46 = xYSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }
}

