package org.jfree.data.xy;

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
        java.util.List list22 = xYSeries3.data;
        boolean boolean23 = xYSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener33);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertNotNull(xYDataItem31);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener33);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
            xYSeries3.update((java.lang.Number) 10, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        xYSeries3.delete(2147483647, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener60 = null;
        xYSeries59.removePropertyChangeListener(propertyChangeListener60);
        java.util.List list62 = xYSeries59.getItems();
        xYSeries45.data = list62;
        org.jfree.data.xy.XYSeries xYSeries67 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        xYSeries67.removePropertyChangeListener(propertyChangeListener68);
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        xYSeries67.removePropertyChangeListener(propertyChangeListener70);
        xYSeries67.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int77 = xYSeries67.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries81 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener82 = null;
        xYSeries81.removePropertyChangeListener(propertyChangeListener82);
        java.util.List list84 = xYSeries81.getItems();
        xYSeries67.data = list84;
        xYSeries45.data = list84;
        xYSeries3.data = list84;
        java.lang.String str88 = xYSeries3.getDescription();
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(list84);
        org.junit.Assert.assertNull(str88);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        java.lang.String str7 = xYSeries3.getDescription();
        double[][] doubleArray8 = xYSeries3.toArray();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-5908509288197150436L));
        java.lang.String str2 = xYSeries1.getDescription();
        java.lang.Class<?> wildcardClass3 = xYSeries1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", true, true);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((double) (-5908509288197150436L), 0.0d);
        java.util.List list7 = xYSeries3.data;
        boolean boolean8 = xYSeries3.getAutoSort();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.removeChangeListener(seriesChangeListener9);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        java.lang.Number number24 = xYSeries3.getY((int) (byte) 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 1.0d + "'", number22, 1.0d);
        org.junit.Assert.assertEquals("'" + number24 + "' != '" + 1.0d + "'", number24, 1.0d);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
            org.jfree.data.xy.XYSeries xYSeries29 = xYSeries3.createCopy(1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        java.lang.String str7 = xYSeries3.getDescription();
        java.lang.Object obj8 = xYSeries3.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.removeChangeListener(seriesChangeListener9);
        xYSeries3.add((java.lang.Number) (byte) 1, (java.lang.Number) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        xYSeries3.setDescription("");
        java.lang.Class<?> wildcardClass15 = xYSeries3.getClass();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) 1, (int) 'a');
        int int5 = xYSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (byte) -1, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        xYSeries3.fireSeriesChanged();
        double[][] doubleArray13 = xYSeries3.toArray();
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        java.util.List list22 = xYSeries3.data;
        java.lang.Class<?> wildcardClass23 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
            xYSeries3.add((java.lang.Number) 10.0d, (java.lang.Number) 2);
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
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        double[][] doubleArray6 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = xYSeries3.getX((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
            org.jfree.data.xy.XYSeries xYSeries51 = xYSeries3.createCopy((int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.fireSeriesChanged();
        java.util.List list14 = xYSeries3.getItems();
        java.lang.Class<?> wildcardClass15 = xYSeries3.getClass();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        java.lang.Class<?> wildcardClass8 = xYSeries3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries3.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries6.addOrUpdate((double) 100.0f, (double) 0);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries13.removePropertyChangeListener(propertyChangeListener16);
        xYSeries13.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int23 = xYSeries13.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener28);
        java.util.List list30 = xYSeries27.getItems();
        xYSeries13.data = list30;
        xYSeries13.fireSeriesChanged();
        java.util.List list33 = xYSeries13.data;
        xYSeries6.data = list33;
        xYSeries2.data = list33;
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener30);
        int int32 = xYSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), true);
        boolean boolean3 = xYSeries2.isEmpty();
        xYSeries2.add((java.lang.Number) 0.0f, (java.lang.Number) (byte) 100);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries2.addOrUpdate((double) 100, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries2.remove((java.lang.Number) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(xYDataItem9);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, true, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries3.removeChangeListener(seriesChangeListener4);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        org.jfree.data.xy.XYDataItem xYDataItem60 = xYSeries57.addOrUpdate((java.lang.Number) 1.0d, (java.lang.Number) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertNull(xYDataItem60);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries23.remove((java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        java.lang.Comparable comparable21 = xYSeries3.getKey();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 0L + "'", comparable21, 0L);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) 100, 3);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (short) 10);
        xYSeries3.updateByIndex(0, (java.lang.Number) (byte) 10);
        boolean boolean13 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries24 = xYSeries3.createCopy((-2), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 1.0f, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(xYDataItem66);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertNotNull(list76);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        java.lang.Object obj22 = xYSeries3.clone();
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries3.getDataItem((int) (byte) 0);
        xYSeries3.setNotify(false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(xYDataItem24);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        java.lang.Number number21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries3.addOrUpdate(number21, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        xYSeries48.clear();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true);
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries2.createCopy((int) 'a', (int) (byte) 1);
        java.lang.Object obj6 = xYSeries5.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries5.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) (-1), (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        double[][] doubleArray47 = xYSeries3.toArray();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(doubleArray47);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        xYSeries3.add((double) '#', (java.lang.Number) (short) -1);
        boolean boolean37 = xYSeries3.isEmpty();
        java.lang.Comparable comparable38 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setKey(comparable38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem26);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) 100, true);
        int int12 = xYSeries3.indexOf((java.lang.Number) (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
            org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries3.remove((java.lang.Number) (-1));
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
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) 1, (int) 'a');
        int int6 = xYSeries1.indexOf((java.lang.Number) 1.0f);
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        xYSeries3.fireSeriesChanged();
        boolean boolean15 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries3.getDataItem(0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYDataItem17);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        boolean boolean21 = xYSeries3.getAutoSort();
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((double) '4', 1.0d);
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (short) 1, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        xYSeries3.add(1.0d, (java.lang.Number) (-3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        org.jfree.data.xy.XYSeries xYSeries99 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem85, true, false);
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
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, false);
        boolean boolean3 = xYSeries2.getAutoSort();
        int int4 = xYSeries2.getMaximumItemCount();
        xYSeries2.add((double) 100L, (java.lang.Number) 0, false);
        xYSeries2.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        xYSeries2.removeChangeListener(seriesChangeListener11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        java.util.List list12 = xYSeries3.getItems();
        xYSeries3.setDescription("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        boolean boolean71 = xYSeries3.getAllowDuplicateXValues();
        java.beans.PropertyChangeListener propertyChangeListener72 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener72);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        java.util.List list56 = xYSeries1.getItems();
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
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "", true);
        boolean boolean3 = xYSeries2.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries7.add((double) 0.0f, 0.0d);
        xYSeries7.add((double) (short) 100, (java.lang.Number) (-1L), true);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries18.setNotify(false);
        boolean boolean21 = xYSeries18.getNotify();
        java.lang.String str22 = xYSeries18.getDescription();
        boolean boolean23 = xYSeries7.equals((java.lang.Object) xYSeries18);
        org.jfree.data.xy.XYSeries xYSeries26 = xYSeries7.createCopy((int) (byte) 10, (int) (short) -1);
        xYSeries7.setNotify(true);
        java.util.List list29 = xYSeries7.getItems();
        xYSeries2.data = list29;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(xYSeries26);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L);
        double[][] doubleArray2 = xYSeries1.toArray();
        java.lang.String str3 = xYSeries1.getDescription();
        xYSeries1.setDescription("hi!");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add((-1.0d), (java.lang.Number) (byte) -1, true);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0, false, false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem30);
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2147483647, true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener12);
        xYSeries3.clear();
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (-1L), (double) (byte) 1);
        xYSeries3.clear();
        boolean boolean16 = xYSeries3.getNotify();
        xYSeries3.delete(2, (int) (byte) -1);
        xYSeries3.add((java.lang.Number) (-3), (java.lang.Number) (short) 1, false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        xYSeries3.setKey((java.lang.Comparable) 10);
        int int13 = xYSeries3.indexOf((java.lang.Number) 1L);
        int int14 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
            java.lang.Number number19 = xYSeries3.getX((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 100 + "'", comparable15, (short) 100);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = xYSeries3.getX((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        java.lang.Comparable comparable8 = xYSeries3.getKey();
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 0L + "'", comparable8, 0L);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) -1, (int) '#');
        boolean boolean5 = xYSeries1.isEmpty();
        java.util.List list6 = xYSeries1.data;
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        xYSeries3.update((java.lang.Number) 0.0f, (java.lang.Number) (byte) 1);
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
        xYSeries3.setKey((java.lang.Comparable) xYDataItem68);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertNotNull(xYDataItem68);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        int int23 = xYSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries3.getDataItem(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries2.createCopy(2, (int) ' ');
        xYSeries5.setMaximumItemCount(0);
        int int8 = xYSeries5.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries5.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        java.lang.String str7 = xYSeries3.getDescription();
        java.lang.Object obj8 = xYSeries3.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries14.add((double) 0.0f, 0.0d);
        xYSeries14.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean22 = xYSeries14.getAllowDuplicateXValues();
        xYSeries14.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener30);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener32);
        xYSeries29.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        java.util.List list38 = xYSeries29.data;
        xYSeries14.data = list38;
        xYSeries3.data = list38;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.lang.Number number9 = xYSeries3.getY((int) (short) 0);
        boolean boolean10 = xYSeries3.getNotify();
        java.lang.Object obj11 = xYSeries3.clone();
        int int12 = xYSeries3.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries3.removeChangeListener(seriesChangeListener13);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true);
        java.util.List list3 = xYSeries2.data;
        xYSeries2.add((java.lang.Number) 2, (java.lang.Number) 2147483647);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries2.removePropertyChangeListener(propertyChangeListener7);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100);
        int int2 = xYSeries1.getMaximumItemCount();
        xYSeries1.fireSeriesChanged();
        xYSeries1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        xYSeries1.setMaximumItemCount((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.setMaximumItemCount((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Object obj39 = xYSeries38.clone();
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries38.addPropertyChangeListener(propertyChangeListener40);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        xYSeries38.removeChangeListener(seriesChangeListener42);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries38.addPropertyChangeListener(propertyChangeListener44);
        int int46 = xYSeries38.getItemCount();
        java.lang.String str47 = xYSeries38.getDescription();
        boolean boolean48 = xYSeries36.equals((java.lang.Object) str47);
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) 100, 3);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (short) 10);
        boolean boolean10 = xYSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.clear();
        int int9 = xYSeries3.indexOf((java.lang.Number) 100.0f);
        int int10 = xYSeries3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.addChangeListener(seriesChangeListener9);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "", true);
        java.util.List list17 = xYSeries16.getItems();
        xYSeries13.data = list17;
        xYSeries3.data = list17;
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.fireSeriesChanged();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((double) (byte) 10, (java.lang.Number) (-1.0d));
        xYSeries1.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (short) -1 + "'", comparable3, (short) -1);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
            xYSeries3.add((java.lang.Number) (-1.0d), (java.lang.Number) (byte) 10, true);
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
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        boolean boolean75 = xYSeries29.getAutoSort();
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
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", true, true);
        java.lang.Object obj4 = xYSeries3.clone();
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries3.addOrUpdate((java.lang.Number) 0.0f, (java.lang.Number) (byte) 0);
        int int9 = xYSeries3.indexOf((java.lang.Number) (byte) 1);
        java.util.List list10 = xYSeries3.data;
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(xYDataItem7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) 10.0f, (double) (short) 1, true);
        boolean boolean11 = xYSeries3.getNotify();
        boolean boolean12 = xYSeries3.getAutoSort();
        xYSeries3.setNotify(false);
        int int15 = xYSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        int int30 = xYSeries3.indexOf((java.lang.Number) (-1.0d));
        boolean boolean31 = xYSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2) + "'", int28 == (-2));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries3.addOrUpdate((java.lang.Number) (short) 10, (java.lang.Number) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex(2147483647, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem7);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number37 = xYSeries35.getY((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
            java.lang.Number number41 = xYSeries38.getX((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
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
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        java.lang.Comparable comparable36 = xYSeries23.getKey();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + 0L + "'", comparable36, 0L);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        int int12 = xYSeries3.indexOf((java.lang.Number) (-2));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries3.addChangeListener(seriesChangeListener13);
        boolean boolean15 = xYSeries3.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = xYSeries3.getX((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        xYSeries3.add((java.lang.Number) 100, (java.lang.Number) 2147483647);
        java.lang.Object obj23 = xYSeries3.clone();
        xYSeries3.clear();
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 100 + "'", comparable15, (short) 100);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        java.lang.Object obj13 = xYSeries3.clone();
        java.lang.Object obj14 = xYSeries3.clone();
        xYSeries3.add((java.lang.Number) 2, (java.lang.Number) 2);
        java.lang.String str18 = xYSeries3.getDescription();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        xYSeries1.setKey((java.lang.Comparable) 100.0d);
        java.lang.String str4 = xYSeries1.getDescription();
        double[][] doubleArray5 = xYSeries1.toArray();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(doubleArray5);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        java.lang.Object obj13 = xYSeries3.clone();
        java.lang.Object obj14 = xYSeries3.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        xYSeries3.removeChangeListener(seriesChangeListener15);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        xYSeries19.addChangeListener(seriesChangeListener22);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem17);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, false);
        int int3 = xYSeries2.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = xYSeries3.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.addOrUpdate((java.lang.Number) 100, (java.lang.Number) 1);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100);
        int int14 = xYSeries13.getMaximumItemCount();
        xYSeries13.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        java.lang.String str20 = xYSeries19.getDescription();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries24.removePropertyChangeListener(propertyChangeListener25);
        java.util.List list27 = xYSeries24.getItems();
        xYSeries24.clear();
        xYSeries24.setNotify(true);
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
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem52, false);
        xYSeries24.add(xYDataItem52);
        xYSeries19.setKey((java.lang.Comparable) xYDataItem52);
        xYSeries13.add(xYDataItem52);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem52);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 0L + "'", comparable8, 0L);
        org.junit.Assert.assertNull(xYDataItem11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(xYDataItem52);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.setDescription("hi!");
        xYSeries3.add((java.lang.Number) (-2), (java.lang.Number) (byte) 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
            java.lang.Number number36 = xYSeries30.getY((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNull(xYDataItem34);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        xYSeries3.setNotify(false);
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries3.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries3.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYDataItem31);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0f, false);
        java.lang.Comparable comparable3 = xYSeries2.getKey();
        int int4 = xYSeries2.getMaximumItemCount();
        int int6 = xYSeries2.indexOf((java.lang.Number) 100L);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries2.addOrUpdate((double) (byte) 10, (double) 2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 0.0f + "'", comparable3, 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(xYDataItem9);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener27);
        java.util.List list29 = xYSeries26.getItems();
        xYSeries26.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean34 = xYSeries26.getAllowDuplicateXValues();
        xYSeries26.add((double) (-1L), (double) (byte) 1);
        xYSeries26.add((double) 2147483647, (double) 'a', true);
        boolean boolean42 = xYSeries26.getNotify();
        java.util.List list43 = xYSeries26.getItems();
        java.lang.Number number45 = xYSeries26.getY(0);
        java.util.List list46 = xYSeries26.getItems();
        xYSeries3.data = list46;
        java.lang.String str48 = xYSeries3.getDescription();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertEquals("'" + number45 + "' != '" + 1.0d + "'", number45, 1.0d);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0f), false, false);
        xYSeries3.add((double) 0.0f, (double) 1L);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.add(0.0d, (java.lang.Number) 0.0d, false);
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem7, false);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem7, true);
        org.junit.Assert.assertNotNull(xYDataItem7);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        int int12 = xYSeries3.indexOf((java.lang.Number) (-2));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = xYSeries3.getY((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        xYSeries3.add(10.0d, (java.lang.Number) (-1.0d));
        java.lang.String str9 = xYSeries3.getDescription();
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        java.lang.Number number13 = xYSeries3.getX((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = xYSeries3.getY(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 1.0d + "'", number13, 1.0d);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        xYSeries3.setNotify(false);
        boolean boolean26 = xYSeries3.getAutoSort();
        java.lang.Class<?> wildcardClass27 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) 100.0f, (java.lang.Number) (-1.0d), true);
        java.util.List list6 = xYSeries1.data;
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) 2);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((java.lang.Number) (short) 1, (java.lang.Number) 3);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        int int7 = xYSeries6.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = xYSeries6.getY((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        java.util.List list29 = xYSeries27.getItems();
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(xYSeries27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        xYSeries3.add((double) 100.0f, (double) '4');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries3.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries6.addOrUpdate((java.lang.Number) (short) -1, (java.lang.Number) 0L);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries6.addPropertyChangeListener(propertyChangeListener10);
        java.util.List list12 = xYSeries6.data;
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries6.addOrUpdate((double) (byte) 10, (double) (short) 10);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(xYDataItem15);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        xYSeries31.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable35 = xYSeries34.getKey();
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
        org.jfree.data.xy.XYSeries xYSeries65 = xYSeries39.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem67 = xYSeries39.remove(0);
        xYSeries34.setKey((java.lang.Comparable) xYDataItem67);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem67, false, false);
        xYSeries31.add(xYDataItem67);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem67);
        java.lang.Class<?> wildcardClass74 = xYDataItem67.getClass();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + '#' + "'", comparable35, '#');
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(xYDataItem61);
        org.junit.Assert.assertNotNull(xYSeries65);
        org.junit.Assert.assertNotNull(xYDataItem67);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy(100, (int) (byte) 10);
        boolean boolean10 = xYSeries9.getAllowDuplicateXValues();
        boolean boolean11 = xYSeries9.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries9.removeChangeListener(seriesChangeListener12);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        xYSeries1.removeChangeListener(seriesChangeListener23);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem20);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries29.remove((java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        boolean boolean27 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries30 = xYSeries3.createCopy(0, (int) (byte) -1);
        xYSeries30.add((double) (byte) 0, (double) (byte) 0, false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(xYSeries30);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener34);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener36);
        xYSeries33.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries33.remove((int) (byte) 0);
        xYSeries3.add(xYDataItem42);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0.0d, (java.lang.Number) 10);
        xYSeries1.add((java.lang.Number) 10, (java.lang.Number) 100.0d, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries1.remove((java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        java.util.List list14 = xYSeries3.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries3.addOrUpdate((java.lang.Number) 2147483647, (java.lang.Number) 1L);
        xYSeries3.add((java.lang.Number) 1, (java.lang.Number) 0.0d);
        int int21 = xYSeries3.getItemCount();
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        xYSeries1.setNotify(false);
        xYSeries1.fireSeriesChanged();
        boolean boolean9 = xYSeries1.isEmpty();
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true, true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((java.lang.Number) 2147483647, (java.lang.Number) 10L, false);
        double[][] doubleArray16 = xYSeries3.toArray();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        java.lang.String str20 = xYSeries3.getDescription();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        java.lang.Object obj24 = xYSeries3.clone();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        java.lang.Number number41 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries38.update((java.lang.Number) (byte) 0, number41);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        xYSeries3.setMaximumItemCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem20);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        xYSeries3.add((double) 0.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem16);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(xYDataItem45);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem50);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem50);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYSeries24);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(xYDataItem50);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-5908509288197150436L));
        xYSeries1.add((double) 0.0f, (java.lang.Number) 0.0d, true);
        boolean boolean6 = xYSeries1.getAllowDuplicateXValues();
        xYSeries1.setDescription("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        xYSeries1.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.util.List list14 = xYSeries11.getItems();
        xYSeries11.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean19 = xYSeries11.getAllowDuplicateXValues();
        int int21 = xYSeries11.indexOf((java.lang.Number) 2);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries25.setDescription("");
        java.lang.String str28 = xYSeries25.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries25.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries35.add((double) 0.0f, 0.0d);
        xYSeries35.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean43 = xYSeries35.getAllowDuplicateXValues();
        xYSeries35.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
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
        xYSeries48.add(xYDataItem74, false);
        xYSeries35.setKey((java.lang.Comparable) xYDataItem74);
        xYSeries25.add(xYDataItem74, true);
        xYSeries11.add(xYDataItem74, true);
        org.jfree.data.xy.XYSeries xYSeries85 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74, true, false);
        org.jfree.data.xy.XYSeries xYSeries87 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74, true);
        xYSeries1.add(xYDataItem74);
        xYSeries1.setMaximumItemCount((int) '4');
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(xYDataItem74);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        xYSeries3.add(1.0d, (java.lang.Number) 0.0d);
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
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        xYSeries1.add((double) '4', (java.lang.Number) (byte) 0, true);
        xYSeries1.add((double) (short) 1, (double) (byte) 10, true);
        org.junit.Assert.assertNull(xYDataItem4);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = xYSeries3.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.addOrUpdate((java.lang.Number) 100, (java.lang.Number) 1);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener12);
        xYSeries3.clear();
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 0L + "'", comparable8, 0L);
        org.junit.Assert.assertNull(xYDataItem11);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        java.lang.Comparable comparable3 = xYSeries2.getKey();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries2.removePropertyChangeListener(propertyChangeListener4);
        xYSeries2.add((java.lang.Number) 1.0f, (java.lang.Number) 0.0d);
        double[][] doubleArray9 = xYSeries2.toArray();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (short) 1 + "'", comparable3, (short) 1);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries3.remove((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0f, false, true);
        boolean boolean19 = xYSeries18.getNotify();
        org.junit.Assert.assertNotNull(xYDataItem15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(10, (-1));
        xYSeries3.setMaximumItemCount((int) (byte) 100);
        xYSeries3.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(xYSeries9);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", true, true);
        xYSeries3.setMaximumItemCount((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 10, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        double[][] doubleArray41 = xYSeries40.toArray();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(xYDataItem36);
        org.junit.Assert.assertNotNull(doubleArray41);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        java.lang.String str16 = xYSeries3.getDescription();
        double[][] doubleArray17 = xYSeries3.toArray();
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 1.0d, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(doubleArray40);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        java.lang.Object obj6 = xYSeries1.clone();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy((int) (byte) 10, (-2));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries9.addChangeListener(seriesChangeListener10);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener16);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries15.removePropertyChangeListener(propertyChangeListener18);
        xYSeries15.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray24 = xYSeries15.toArray();
        xYSeries15.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries15.setKey((java.lang.Comparable) 10.0f);
        xYSeries15.add((java.lang.Number) (byte) 10, (java.lang.Number) 0, false);
        java.util.List list35 = xYSeries15.getItems();
        boolean boolean36 = xYSeries15.getNotify();
        boolean boolean37 = xYSeries15.isEmpty();
        java.util.List list38 = xYSeries15.data;
        xYSeries9.data = list38;
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        xYSeries3.add((java.lang.Number) 100L, (java.lang.Number) (byte) -1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(xYDataItem32);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem42, false, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        xYSeries3.add((java.lang.Number) (byte) 10, (java.lang.Number) 0, true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem51, true);
        xYSeries55.add((java.lang.Number) (byte) 1, (java.lang.Number) 1.0f, false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertNotNull(xYDataItem51);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        int int49 = xYSeries3.indexOf((java.lang.Number) 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        java.lang.String str32 = xYSeries30.getDescription();
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        boolean boolean45 = xYSeries29.getAutoSort();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertNotNull(xYSeries44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem3 = xYSeries1.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        xYSeries3.add((java.lang.Number) (-1L), (java.lang.Number) 0.0f);
        int int31 = xYSeries3.indexOf((java.lang.Number) 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-2) + "'", int31 == (-2));
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        xYSeries3.add(10.0d, (java.lang.Number) (-1.0d));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.addChangeListener(seriesChangeListener9);
        xYSeries3.add((java.lang.Number) 0, (java.lang.Number) 0.0f, false);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        int int4 = xYSeries3.getMaximumItemCount();
        java.lang.Number number5 = null;
        int int6 = xYSeries3.indexOf(number5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        xYSeries3.add((double) 3, (double) 4, false);
        int int14 = xYSeries3.indexOf((java.lang.Number) 0.0d);
        xYSeries3.add((double) 'a', (java.lang.Number) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem38, false);
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem38);
        boolean boolean42 = xYSeries3.equals((java.lang.Object) xYSeries41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number44 = xYSeries3.getY((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        org.jfree.data.xy.XYSeries xYSeries49 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries49.updateByIndex((int) (short) 0, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        int int22 = xYSeries3.getItemCount();
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true);
        java.util.List list3 = xYSeries2.data;
        xYSeries2.add((java.lang.Number) 2, (java.lang.Number) 2147483647);
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener13);
        xYSeries10.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        xYSeries10.addChangeListener(seriesChangeListener19);
        xYSeries10.add((java.lang.Number) 0.0d, (java.lang.Number) (byte) -1);
        xYSeries10.setNotify(true);
        boolean boolean26 = xYSeries2.equals((java.lang.Object) true);
        java.util.List list27 = xYSeries2.getItems();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        xYSeries3.setNotify(true);
        xYSeries3.add(0.0d, (double) (short) -1, false);
        java.lang.Object obj12 = xYSeries3.clone();
        int int13 = xYSeries3.getItemCount();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 10);
        xYSeries1.setNotify(true);
        int int4 = xYSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        xYSeries1.setMaximumItemCount(0);
        xYSeries1.add((double) 4, (double) (-1L));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries1.addChangeListener(seriesChangeListener7);
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 1 + "'", comparable9, 1);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        int int34 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.fireSeriesChanged();
        java.lang.Object obj3 = null;
        boolean boolean4 = xYSeries1.equals(obj3);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(4, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        org.jfree.data.xy.XYSeries xYSeries83 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem69, true);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(xYDataItem69);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        java.lang.Object obj69 = xYSeries3.clone();
        int int70 = xYSeries3.getItemCount();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(xYDataItem61);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 3 + "'", int70 == 3);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries55.addPropertyChangeListener(propertyChangeListener56);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener58 = null;
        xYSeries55.removeChangeListener(seriesChangeListener58);
        java.lang.Comparable comparable60 = xYSeries55.getKey();
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0L + "'", comparable15, 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(xYDataItem41);
        org.junit.Assert.assertNotNull(xYSeries45);
        org.junit.Assert.assertNotNull(xYDataItem47);
        org.junit.Assert.assertNotNull(comparable54);
        org.junit.Assert.assertNotNull(comparable60);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy(100, (int) (byte) 10);
        boolean boolean10 = xYSeries9.getAllowDuplicateXValues();
        boolean boolean11 = xYSeries9.isEmpty();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable14 = xYSeries13.getKey();
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
        org.jfree.data.xy.XYSeries xYSeries44 = xYSeries18.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem46 = xYSeries18.remove(0);
        xYSeries13.setKey((java.lang.Comparable) xYDataItem46);
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem46, false, false);
        boolean boolean51 = xYSeries9.equals((java.lang.Object) xYSeries50);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + '#' + "'", comparable14, '#');
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(xYDataItem40);
        org.junit.Assert.assertNotNull(xYSeries44);
        org.junit.Assert.assertNotNull(xYDataItem46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        int int4 = xYSeries3.getMaximumItemCount();
        java.lang.Number number5 = null;
        int int6 = xYSeries3.indexOf(number5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        java.lang.Number number9 = null;
        int int10 = xYSeries3.indexOf(number9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        java.util.List list5 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener10);
        int int13 = xYSeries9.indexOf((java.lang.Number) (short) 10);
        java.util.List list14 = xYSeries9.data;
        xYSeries3.data = list14;
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries3.createCopy((int) (short) 0, (int) (short) 10);
        xYSeries3.add(100.0d, (double) (byte) 100, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(xYSeries18);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.util.List list14 = xYSeries3.getItems();
        java.lang.Comparable comparable15 = xYSeries3.getKey();
        java.lang.Number number17 = null;
        xYSeries3.add((double) 3, number17);
        java.lang.Number number20 = xYSeries3.getX(0);
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries3.addOrUpdate(10.0d, 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0L + "'", comparable15, 0L);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + (byte) 0 + "'", number20, (byte) 0);
        org.junit.Assert.assertNull(xYDataItem23);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        xYSeries29.add((double) 4, (java.lang.Number) (byte) -1);
        java.util.List list33 = xYSeries29.data;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem26, false, false);
        xYSeries33.setNotify(true);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false);
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(xYDataItem69);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        java.lang.Number number35 = null;
        xYSeries3.add((java.lang.Number) (short) 10, number35);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 0L + "'", comparable6, 0L);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        boolean boolean28 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-2));
        java.lang.String str2 = xYSeries1.getDescription();
        xYSeries1.clear();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries3.createCopy((int) (byte) 10, 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYSeries18);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries23.updateByIndex((int) ' ', (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount((int) 'a');
        xYSeries3.delete((int) (byte) 100, 0);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        xYSeries3.removeChangeListener(seriesChangeListener39);
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
        org.jfree.data.xy.XYSeries xYSeries70 = xYSeries44.createCopy(100, 1);
        xYSeries70.add((java.lang.Number) 0, (java.lang.Number) 1);
        java.util.List list74 = xYSeries70.getItems();
        xYSeries3.data = list74;
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(xYDataItem66);
        org.junit.Assert.assertNotNull(xYSeries70);
        org.junit.Assert.assertNotNull(list74);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries3.getDataItem(10);
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
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        xYSeries3.add((java.lang.Number) 10.0f, (java.lang.Number) 1L);
        boolean boolean23 = xYSeries3.isEmpty();
        xYSeries3.setNotify(false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) 1, (int) 'a');
        java.util.List list5 = xYSeries4.getItems();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries4.addPropertyChangeListener(propertyChangeListener6);
        double[][] doubleArray8 = xYSeries4.toArray();
        xYSeries4.setDescription("hi!");
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.lang.Number number9 = xYSeries3.getY((int) (short) 0);
        double[][] doubleArray10 = xYSeries3.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (short) 100);
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 100, (java.lang.Number) 1L);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1L, true);
        java.lang.String str19 = xYSeries18.getDescription();
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener27);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries26.removePropertyChangeListener(propertyChangeListener29);
        xYSeries26.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray35 = xYSeries26.toArray();
        xYSeries26.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries26.add(1.0d, (java.lang.Number) 2);
        xYSeries26.fireSeriesChanged();
        java.lang.String str44 = xYSeries26.getDescription();
        boolean boolean45 = xYSeries3.equals((java.lang.Object) str44);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        xYSeries1.setMaximumItemCount(0);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener4);
        java.lang.Comparable comparable6 = xYSeries1.getKey();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1 + "'", comparable6, 1);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        java.util.List list50 = xYSeries49.data;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(xYSeries49);
        org.junit.Assert.assertNotNull(list50);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        int int4 = xYSeries3.getMaximumItemCount();
        int int5 = xYSeries3.getItemCount();
        xYSeries3.add(0.0d, (double) 1.0f, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.addOrUpdate((double) '#', (double) 100.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(xYDataItem14);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries3.addOrUpdate((java.lang.Number) (short) -1, (java.lang.Number) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(xYDataItem8);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        boolean boolean12 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((java.lang.Number) (short) 1, (java.lang.Number) (short) -1, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries3.removeChangeListener(seriesChangeListener17);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        xYSeries20.add((double) (byte) 10, (double) 0, false);
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
        org.jfree.data.xy.XYSeries xYSeries95 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem86, true);
        xYSeries20.add(xYDataItem86, false);
        xYSeries3.add(xYDataItem86, true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(xYDataItem86);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.util.List list6 = xYSeries1.data;
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries3.remove(0);
        xYSeries3.add((double) (short) 1, (double) (short) 10, false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(xYDataItem23);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        int int13 = xYSeries3.getItemCount();
        xYSeries3.add((java.lang.Number) 1.0d, (java.lang.Number) 0.0d);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        org.jfree.data.xy.XYSeries xYSeries89 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem77, false, true);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(xYDataItem77);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true);
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries2.createCopy((int) 'a', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries5.remove((java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries5);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        java.util.List list5 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener10);
        int int13 = xYSeries9.indexOf((java.lang.Number) (short) 10);
        java.util.List list14 = xYSeries9.data;
        xYSeries3.data = list14;
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries3.createCopy((int) (short) 0, (int) (short) 10);
        xYSeries3.clear();
        boolean boolean20 = xYSeries3.isEmpty();
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
        xYSeries44.fireSeriesChanged();
        xYSeries44.setNotify(false);
        org.jfree.data.xy.XYDataItem xYDataItem72 = xYSeries44.remove(0);
        xYSeries24.add(xYDataItem72, true);
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72, true);
        xYSeries3.add(xYDataItem72, false);
        org.jfree.data.xy.XYSeries xYSeries80 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem72, true);
        double[][] doubleArray81 = xYSeries80.toArray();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(xYDataItem66);
        org.junit.Assert.assertNotNull(xYDataItem72);
        org.junit.Assert.assertNotNull(doubleArray81);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(0, (int) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.addOrUpdate(0.0d, (double) (-3));
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.removeChangeListener(seriesChangeListener9);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) 1L);
        xYSeries3.setMaximumItemCount(2147483647);
        java.util.List list17 = xYSeries3.getItems();
        int int18 = xYSeries3.getItemCount();
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        int int4 = xYSeries3.getMaximumItemCount();
        int int5 = xYSeries3.getItemCount();
        xYSeries3.add(0.0d, (double) 1.0f, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener10);
        xYSeries3.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        boolean boolean38 = xYSeries37.getNotify();
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries29.add((double) '4', 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        int int14 = xYSeries3.getItemCount();
        int int15 = xYSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries3.removeChangeListener(seriesChangeListener20);
        org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries3.addOrUpdate((double) 1, 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(xYDataItem24);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", true, true);
        xYSeries3.setDescription("hi!");
        double[][] doubleArray6 = xYSeries3.toArray();
        xYSeries3.add((double) (-2), (java.lang.Number) 10.0d);
        java.lang.Object obj10 = xYSeries3.clone();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        xYSeries3.setDescription("");
        xYSeries3.add((double) (-1), (double) (byte) 1, false);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = xYSeries3.getKey();
        xYSeries3.setKey((java.lang.Comparable) ' ');
        xYSeries3.add(0.0d, (java.lang.Number) (-3), false);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 0L + "'", comparable8, 0L);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        xYSeries2.add((double) 10, (double) (byte) 100, false);
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
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        java.lang.Object obj14 = xYSeries3.clone();
        xYSeries3.add((double) 10, (double) 10, false);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener79 = null;
        xYSeries3.addChangeListener(seriesChangeListener79);
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
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        xYSeries3.setDescription("");
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries27.removePropertyChangeListener(propertyChangeListener28);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener34);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener36);
        xYSeries33.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray42 = xYSeries33.toArray();
        xYSeries33.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries33.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries33.remove((int) (short) 1);
        xYSeries27.add(xYDataItem50);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem50, false, false);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem50, false, false);
        boolean boolean58 = xYSeries3.equals((java.lang.Object) false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(xYDataItem50);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        xYSeries3.fireSeriesChanged();
        xYSeries3.add((double) (short) 10, (double) (short) 1);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (byte) 0 + "'", number14, (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2) + "'", int19 == (-2));
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        boolean boolean45 = xYSeries3.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + '#' + "'", comparable7, '#');
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertNotNull(xYSeries37);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add(10.0d, (java.lang.Number) 0.0d);
        java.lang.Object obj15 = xYSeries3.clone();
        xYSeries3.add((double) 10, (java.lang.Number) 10.0f);
        java.lang.Number number20 = xYSeries3.getY((int) (short) 0);
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries3.remove((java.lang.Number) 10);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem22);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + 0.0d + "'", number20, 0.0d);
        org.junit.Assert.assertNotNull(xYDataItem22);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries14.setNotify(false);
        boolean boolean17 = xYSeries14.getNotify();
        java.lang.String str18 = xYSeries14.getDescription();
        boolean boolean19 = xYSeries3.equals((java.lang.Object) xYSeries14);
        org.jfree.data.xy.XYSeries xYSeries22 = xYSeries3.createCopy((int) (byte) 10, (int) (short) -1);
        double[][] doubleArray23 = xYSeries3.toArray();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries23.getDataItem(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNull(xYDataItem26);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        xYSeries3.setMaximumItemCount(0);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(xYSeries37);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(xYDataItem63);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.add((double) 'a', (double) 10.0f, true);
        xYSeries1.add((java.lang.Number) (byte) 0, (java.lang.Number) 100);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
        xYSeries4.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        xYSeries4.addPropertyChangeListener(propertyChangeListener70);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem73 = xYSeries4.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + 0L + "'", comparable31, 0L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(xYDataItem57);
        org.junit.Assert.assertNotNull(xYSeries61);
        org.junit.Assert.assertNotNull(xYDataItem63);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        xYSeries3.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem16);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(xYDataItem82);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number37 = xYSeries35.getY((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number55 = xYSeries3.getY(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries3.addOrUpdate((double) '#', 10.0d);
        org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries3.addOrUpdate((double) (short) 100, (double) '#');
        xYSeries3.setMaximumItemCount(0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertNull(xYDataItem22);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) -1, (int) '#');
        xYSeries4.add((double) 0, 10.0d, true);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries4.addPropertyChangeListener(propertyChangeListener9);
        xYSeries4.add((double) ' ', (double) 0L);
        org.junit.Assert.assertNotNull(xYSeries4);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        java.lang.Number number13 = xYSeries3.getX((int) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        xYSeries3.addChangeListener(seriesChangeListener14);
        java.util.List list16 = xYSeries3.getItems();
        boolean boolean17 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 1.0d + "'", number13, 1.0d);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.addOrUpdate((java.lang.Number) (-1.0d), (java.lang.Number) 100.0f);
        java.lang.String str7 = xYSeries1.getDescription();
        xYSeries1.add((double) (short) -1, (java.lang.Number) (short) 0);
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Object obj2 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries1.removeChangeListener(seriesChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener7);
        int int9 = xYSeries1.getItemCount();
        xYSeries1.add((java.lang.Number) 100L, (java.lang.Number) 10.0f, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = xYSeries1.getX((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        int int23 = xYSeries3.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        xYSeries3.addChangeListener(seriesChangeListener24);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 0L + "'", number22, 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        double[][] doubleArray51 = xYSeries29.toArray();
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
        boolean boolean89 = xYSeries81.isEmpty();
        java.util.List list90 = xYSeries81.data;
        xYSeries29.data = list90;
        boolean boolean92 = xYSeries29.getAutoSort();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(xYDataItem77);
        org.junit.Assert.assertNotNull(xYSeries81);
        org.junit.Assert.assertNull(xYDataItem84);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(list90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        org.jfree.data.xy.XYSeries xYSeries81 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem67, false, true);
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        xYSeries82.add((double) (-3), (double) (-1), false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(xYDataItem67);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries3.getY(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(xYSeries9);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.xy.XYSeries xYSeries10 = xYSeries3.createCopy((-2), 1);
        xYSeries3.add((java.lang.Number) 10.0f, (java.lang.Number) 2147483647);
        org.junit.Assert.assertNotNull(xYSeries10);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        xYSeries3.add((java.lang.Number) 10.0f, (java.lang.Number) 0, true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        int int24 = xYSeries3.getItemCount();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem18);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        xYSeries3.setDescription("hi!");
        xYSeries3.setNotify(true);
        int int31 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener33);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries32.removePropertyChangeListener(propertyChangeListener35);
        java.lang.Comparable comparable37 = xYSeries32.getKey();
        java.lang.Object obj38 = xYSeries32.clone();
        java.util.List list39 = xYSeries32.data;
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
        xYSeries32.add(xYDataItem82);
        org.jfree.data.xy.XYSeries xYSeries88 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem82);
        xYSeries1.add(xYDataItem82);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 0L + "'", comparable37, 0L);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(xYDataItem82);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = xYSeries3.getY((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) 100.0f, (java.lang.Number) (-1.0d), true);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((double) (-1), (double) 100.0f);
        int int9 = xYSeries1.getItemCount();
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.fireSeriesChanged();
        boolean boolean10 = xYSeries3.getAllowDuplicateXValues();
        int int12 = xYSeries3.indexOf((java.lang.Number) 10);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries3.addOrUpdate((double) 1.0f, (double) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        xYSeries3.addChangeListener(seriesChangeListener16);
        xYSeries3.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(xYDataItem15);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        boolean boolean20 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener6);
        xYSeries1.add((double) (short) 0, (double) 100L);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener11);
        boolean boolean13 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        xYSeries47.setMaximumItemCount((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + '#' + "'", comparable7, '#');
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertNotNull(xYSeries37);
        org.junit.Assert.assertNotNull(xYDataItem39);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertNotNull(xYDataItem68);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries10.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.xy.XYSeries xYSeries16 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener17);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries16.removePropertyChangeListener(propertyChangeListener19);
        xYSeries16.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray25 = xYSeries16.toArray();
        xYSeries16.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries16.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem33 = xYSeries16.remove((int) (short) 1);
        xYSeries10.add(xYDataItem33);
        xYSeries3.add(xYDataItem33, true);
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
        xYSeries3.setKey((java.lang.Comparable) xYDataItem58);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(xYDataItem33);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(xYDataItem58);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        xYSeries30.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries56.add(0.0d, (java.lang.Number) 0.0d, false);
        org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries56.remove((int) (byte) 0);
        xYSeries30.setKey((java.lang.Comparable) xYDataItem62);
        xYSeries3.add(xYDataItem62);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(xYDataItem52);
        org.junit.Assert.assertNotNull(xYDataItem62);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.addChangeListener(seriesChangeListener4);
        java.lang.Comparable comparable6 = xYSeries1.getKey();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10 + "'", comparable6, 10);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy(100, (int) (byte) 10);
        int int10 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy((int) 'a', (int) (byte) 0);
        xYSeries1.add((double) 100L, (java.lang.Number) 1, true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(xYSeries13);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.fireSeriesChanged();
        java.lang.Comparable comparable3 = xYSeries1.getKey();
        xYSeries1.add((double) (byte) 10, (java.lang.Number) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.remove((java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (short) -1 + "'", comparable3, (short) -1);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.addOrUpdate((java.lang.Number) 10.0d, (java.lang.Number) 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(xYDataItem21);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true);
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries2.createCopy((int) 'a', (int) (byte) 1);
        java.lang.Comparable comparable6 = xYSeries5.getKey();
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + '4' + "'", comparable6, '4');
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        xYSeries3.setNotify(false);
        xYSeries3.setMaximumItemCount(100);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        java.util.List list33 = xYSeries3.getItems();
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        xYSeries1.setKey((java.lang.Comparable) 2);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener7);
        org.junit.Assert.assertNull(xYDataItem4);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        int int7 = xYSeries3.indexOf((java.lang.Number) (short) 10);
        java.util.List list8 = xYSeries3.data;
        xYSeries3.add((java.lang.Number) 2147483647, (java.lang.Number) (-2), false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((int) (short) -1, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        java.lang.Number number88 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(number88, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        boolean boolean12 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((java.lang.Number) (short) 1, (java.lang.Number) (short) -1, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries48.add((double) 0.0f, 0.0d);
        xYSeries48.add((double) (short) 100, (java.lang.Number) (-1L), true);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries59.setNotify(false);
        boolean boolean62 = xYSeries59.getNotify();
        java.lang.String str63 = xYSeries59.getDescription();
        boolean boolean64 = xYSeries48.equals((java.lang.Object) xYSeries59);
        org.jfree.data.xy.XYSeries xYSeries67 = xYSeries48.createCopy((int) (byte) 10, (int) (short) -1);
        xYSeries48.setNotify(true);
        java.util.List list70 = xYSeries48.getItems();
        xYSeries3.data = list70;
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(xYSeries67);
        org.junit.Assert.assertNotNull(list70);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        java.lang.String str6 = xYSeries3.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.addChangeListener(seriesChangeListener7);
        java.lang.Comparable comparable9 = xYSeries3.getKey();
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries11.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list15 = xYSeries11.data;
        xYSeries11.setNotify(false);
        int int18 = xYSeries11.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries23 = xYSeries20.createCopy((int) (short) 1, (int) 'a');
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
        xYSeries20.add(xYDataItem49);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem49, false);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem49);
        xYSeries11.add(xYDataItem49);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem49);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + true + "'", comparable9, true);
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(xYDataItem49);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.lang.Number number9 = xYSeries3.getY((int) (short) 0);
        double[][] doubleArray10 = xYSeries3.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (short) 100);
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 100, (java.lang.Number) 1L);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100, true);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries18.addPropertyChangeListener(propertyChangeListener19);
        boolean boolean21 = xYSeries18.getAllowDuplicateXValues();
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100);
        int int2 = xYSeries1.getMaximumItemCount();
        java.lang.String str3 = xYSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, false);
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener30);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener32);
        xYSeries29.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable38 = xYSeries29.getKey();
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        xYSeries46.removePropertyChangeListener(propertyChangeListener47);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries46.removePropertyChangeListener(propertyChangeListener49);
        xYSeries46.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int56 = xYSeries46.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        xYSeries46.addPropertyChangeListener(propertyChangeListener57);
        xYSeries46.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem64 = xYSeries46.remove(1);
        xYSeries42.add(xYDataItem64);
        org.jfree.data.xy.XYSeries xYSeries68 = xYSeries42.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem70 = xYSeries42.remove(0);
        xYSeries29.add(xYDataItem70);
        xYSeries25.setKey((java.lang.Comparable) xYDataItem70);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(xYDataItem70);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + 0L + "'", comparable38, 0L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(xYDataItem64);
        org.junit.Assert.assertNotNull(xYSeries68);
        org.junit.Assert.assertNotNull(xYDataItem70);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        xYSeries3.fireSeriesChanged();
        int int22 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem18);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        java.lang.String str17 = xYSeries3.getDescription();
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((double) 100.0f, (double) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        int int23 = xYSeries3.getItemCount();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0f, false);
        xYSeries2.fireSeriesChanged();
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        int int14 = xYSeries3.getItemCount();
        xYSeries3.add((java.lang.Number) 2147483647, (java.lang.Number) 1L, true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        org.jfree.data.xy.XYSeries xYSeries25 = xYSeries3.createCopy((int) (short) 10, 3);
        xYSeries3.clear();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(xYSeries25);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(10, (-1));
        xYSeries9.delete((int) (byte) 10, (int) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener13);
        boolean boolean15 = xYSeries9.isEmpty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((-3), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        boolean boolean23 = xYSeries15.isEmpty();
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem18);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = xYSeries3.getY((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 0L + "'", comparable6, 0L);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        int int32 = xYSeries6.indexOf((java.lang.Number) 10);
        xYSeries6.fireSeriesChanged();
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
            xYSeries3.add((double) (short) 1, (double) (byte) -1);
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
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem91 = xYSeries3.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(list86);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem41 = xYSeries6.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        int int7 = xYSeries3.indexOf((java.lang.Number) 0.0d);
        boolean boolean9 = xYSeries3.equals((java.lang.Object) 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100.0f);
        xYSeries3.clear();
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
        boolean boolean35 = xYSeries17.getAutoSort();
        java.util.List list36 = xYSeries17.data;
        xYSeries3.data = list36;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(xYDataItem34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) 100.0f, (java.lang.Number) (-1.0d), true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener6);
        xYSeries1.setDescription("hi!");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        xYSeries3.setKey((java.lang.Comparable) 10);
        int int13 = xYSeries3.indexOf((java.lang.Number) 1L);
        boolean boolean14 = xYSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        xYSeries3.fireSeriesChanged();
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        org.jfree.data.xy.XYSeries xYSeries26 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21, true, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries26.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener7);
        xYSeries3.setKey((java.lang.Comparable) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem28, true, true);
        org.jfree.data.xy.XYSeries xYSeries38 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries38.add(10.0d, (java.lang.Number) 10L, true);
        xYSeries38.setDescription("");
        boolean boolean45 = xYSeries36.equals((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 100, false, false);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        java.lang.String str33 = xYSeries29.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries29.update((java.lang.Number) 0L, (java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        double[][] doubleArray4 = xYSeries3.toArray();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        int int7 = xYSeries3.indexOf((java.lang.Number) (byte) 100);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries11.removePropertyChangeListener(propertyChangeListener14);
        xYSeries11.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray20 = xYSeries11.toArray();
        xYSeries11.fireSeriesChanged();
        java.util.List list22 = xYSeries11.getItems();
        xYSeries3.data = list22;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        double[][] doubleArray6 = xYSeries3.toArray();
        java.lang.Object obj7 = xYSeries3.clone();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        xYSeries9.add((double) (byte) 10, (double) 0, false);
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
        org.jfree.data.xy.XYSeries xYSeries84 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem75, true);
        xYSeries9.add(xYDataItem75, false);
        xYSeries3.setKey((java.lang.Comparable) false);
        boolean boolean88 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(xYDataItem75);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem28, true, false);
        xYSeries36.setNotify(false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.add((java.lang.Number) (short) -1, (java.lang.Number) (short) 0);
        boolean boolean9 = xYSeries3.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        xYSeries1.setNotify(false);
        xYSeries1.fireSeriesChanged();
        boolean boolean9 = xYSeries1.getAutoSort();
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries1.addOrUpdate((java.lang.Number) 2, (java.lang.Number) (-2));
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        java.lang.String str22 = xYSeries3.getDescription();
        xYSeries3.add((double) (short) 0, (java.lang.Number) 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 0L + "'", comparable18, 0L);
        org.junit.Assert.assertNull(xYDataItem21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
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
        xYSeries3.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries3.remove((java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries35.add((double) 0.0f, 0.0d);
        xYSeries35.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean43 = xYSeries35.getAllowDuplicateXValues();
        xYSeries35.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
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
        xYSeries48.add(xYDataItem74, false);
        xYSeries35.setKey((java.lang.Comparable) xYDataItem74);
        org.jfree.data.xy.XYSeries xYSeries80 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74, false);
        org.jfree.data.xy.XYSeries xYSeries81 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem74);
        xYSeries6.setKey((java.lang.Comparable) xYDataItem74);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(xYDataItem74);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        xYSeries2.add((java.lang.Number) 2147483647, (java.lang.Number) 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(xYDataItem38);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        xYSeries6.add((double) (byte) -1, 100.0d);
        xYSeries6.add((double) '4', (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries6.remove((java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries3.addChangeListener(seriesChangeListener17);
        java.util.List list19 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Object obj22 = xYSeries21.clone();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries21.addPropertyChangeListener(propertyChangeListener23);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries21.removeChangeListener(seriesChangeListener25);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        xYSeries21.addPropertyChangeListener(propertyChangeListener27);
        int int29 = xYSeries21.getItemCount();
        java.lang.String str30 = xYSeries21.getDescription();
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries34.removePropertyChangeListener(propertyChangeListener35);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries34.removePropertyChangeListener(propertyChangeListener37);
        xYSeries34.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray43 = xYSeries34.toArray();
        xYSeries34.add((double) 0, 1.0d, true);
        org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries34.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) (byte) 100);
        xYSeries34.fireSeriesChanged();
        xYSeries34.add((double) (short) 0, (java.lang.Number) 2);
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
        xYSeries58.setDescription("hi!");
        xYSeries58.setNotify(false);
        boolean boolean79 = xYSeries58.getAllowDuplicateXValues();
        org.jfree.data.xy.XYDataItem xYDataItem81 = xYSeries58.remove(0);
        xYSeries34.setKey((java.lang.Comparable) xYDataItem81);
        org.jfree.data.xy.XYSeries xYSeries84 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem81, false);
        xYSeries21.add(xYDataItem81);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(xYDataItem81);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNull(xYDataItem50);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(xYDataItem81);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        java.util.List list5 = xYSeries3.getItems();
        java.lang.Comparable comparable6 = xYSeries3.getKey();
        xYSeries3.add((double) 0, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10L + "'", comparable6, 10L);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, false, false);
        xYSeries33.add((double) ' ', (java.lang.Number) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(xYDataItem24);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries1.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (byte) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(xYDataItem32);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        xYSeries3.removeChangeListener(seriesChangeListener48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(list47);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries1.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNull(xYDataItem36);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        int int7 = xYSeries3.indexOf((java.lang.Number) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = xYSeries3.getY((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        boolean boolean37 = xYSeries28.getAutoSort();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        java.lang.Object obj13 = xYSeries3.clone();
        java.lang.Object obj14 = xYSeries3.clone();
        xYSeries3.add((java.lang.Number) 2, (java.lang.Number) 2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries3.getDataItem(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
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
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem58, false);
        xYSeries32.add(xYDataItem58);
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem58, true, false);
        xYSeries3.setKey((java.lang.Comparable) false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener67 = null;
        xYSeries3.addChangeListener(seriesChangeListener67);
        double[][] doubleArray69 = xYSeries3.toArray();
        java.beans.PropertyChangeListener propertyChangeListener70 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener70);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(xYDataItem58);
        org.junit.Assert.assertNotNull(doubleArray69);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        java.lang.String str18 = xYSeries3.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.addOrUpdate((java.lang.Number) 1.0d, (java.lang.Number) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries3.remove((java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 100 + "'", comparable15, (short) 100);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(xYDataItem21);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        xYSeries3.fireSeriesChanged();
        boolean boolean15 = xYSeries3.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries3.createCopy((int) (short) 0, (-2));
        org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries18.addOrUpdate(0.0d, (double) 10);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener26);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener32);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries31.removePropertyChangeListener(propertyChangeListener34);
        xYSeries31.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray40 = xYSeries31.toArray();
        xYSeries31.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries31.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem48 = xYSeries31.remove((int) (short) 1);
        xYSeries25.add(xYDataItem48);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem48, true, false);
        java.util.List list53 = xYSeries52.getItems();
        org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries52.addOrUpdate((double) 'a', 0.0d);
        boolean boolean57 = xYSeries18.equals((java.lang.Object) xYSeries52);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertNull(xYDataItem21);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(xYDataItem48);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNull(xYDataItem56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) 'a', (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.removeChangeListener(seriesChangeListener2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        double[][] doubleArray6 = xYSeries3.toArray();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) (-1L));
        xYSeries3.add((java.lang.Number) (short) 10, (java.lang.Number) (-1L), false);
        xYSeries3.add((double) (-1), (java.lang.Number) 1.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries3.removeChangeListener(seriesChangeListener17);
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        boolean boolean90 = xYSeries3.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number92 = xYSeries3.getX((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(list86);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        int int8 = xYSeries3.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries3.createCopy((int) '#', (int) (byte) -1);
        int int12 = xYSeries11.getItemCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        int int3 = xYSeries2.getItemCount();
        java.lang.Object obj4 = xYSeries2.clone();
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        xYSeries8.removePropertyChangeListener(propertyChangeListener9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries8.removePropertyChangeListener(propertyChangeListener11);
        xYSeries8.add((double) 1, (double) 3, false);
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
        xYSeries8.setKey((java.lang.Comparable) xYDataItem48);
        xYSeries2.add(xYDataItem48, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertNotNull(xYSeries46);
        org.junit.Assert.assertNotNull(xYDataItem48);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", true, true);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((double) (-5908509288197150436L), 0.0d);
        java.util.List list7 = xYSeries3.data;
        boolean boolean8 = xYSeries3.getAutoSort();
        java.util.List list9 = xYSeries3.getItems();
        boolean boolean10 = xYSeries3.getNotify();
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) 100, 3);
        boolean boolean7 = xYSeries6.getAutoSort();
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem50, false);
        boolean boolean54 = xYSeries53.getNotify();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(xYDataItem50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        boolean boolean46 = xYSeries3.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1);
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) -1, (int) '#');
        java.util.List list5 = xYSeries4.data;
        xYSeries4.add((double) (-5908509288197150436L), (java.lang.Number) 1.0f, false);
        java.lang.Class<?> wildcardClass10 = xYSeries4.getClass();
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.add((double) 1, 100.0d, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = xYSeries1.getY(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries6.addOrUpdate((java.lang.Number) (short) -1, (java.lang.Number) 0L);
        boolean boolean10 = xYSeries6.getAutoSort();
        java.lang.Number number12 = xYSeries6.getY((int) (short) 0);
        boolean boolean13 = xYSeries6.getNotify();
        xYSeries6.add(0.0d, (double) (short) 0, false);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 0L + "'", number12, 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries29.delete(4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertEquals("'" + comparable39 + "' != '" + true + "'", comparable39, true);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        xYSeries3.addChangeListener(seriesChangeListener38);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries18.createCopy((int) (short) 1, (int) 'a');
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
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47, false);
        xYSeries18.add(xYDataItem47);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem47, false);
        xYSeries3.add(xYDataItem47);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(xYDataItem47);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((double) 1L, (double) 100.0f);
        xYSeries3.add((double) 'a', (double) (short) 0);
        java.lang.Comparable comparable14 = xYSeries3.getKey();
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + true + "'", comparable14, true);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener72 = null;
        xYSeries70.removeChangeListener(seriesChangeListener72);
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
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries15.updateByIndex((-2), (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.isEmpty();
        boolean boolean12 = xYSeries3.getAllowDuplicateXValues();
        java.util.List list13 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 10.0d, (java.lang.Number) (byte) 10, false);
        boolean boolean18 = xYSeries3.getNotify();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        int int25 = xYSeries3.getItemCount();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        boolean boolean9 = xYSeries8.getNotify();
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
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem31, false);
        xYSeries8.add(xYDataItem31, false);
        xYSeries3.add(xYDataItem31, false);
        xYSeries3.fireSeriesChanged();
        boolean boolean41 = xYSeries3.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100);
        int int2 = xYSeries1.getMaximumItemCount();
        xYSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        xYSeries56.removePropertyChangeListener(propertyChangeListener57);
        java.util.List list59 = xYSeries56.getItems();
        xYSeries56.clear();
        xYSeries56.setNotify(true);
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
        org.jfree.data.xy.XYSeries xYSeries86 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem84, false);
        xYSeries56.add(xYDataItem84);
        xYSeries52.add(xYDataItem84, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries92 = xYSeries52.createCopy((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(xYSeries52);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(xYDataItem84);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        xYSeries2.add((java.lang.Number) (short) 100, (java.lang.Number) 0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNotNull(list45);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        java.lang.String str42 = xYSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number44 = xYSeries3.getX((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries29.addOrUpdate((java.lang.Number) 10L, (java.lang.Number) (byte) 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(xYDataItem47);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-2), false);
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        double[][] doubleArray7 = xYSeries6.toArray();
        boolean boolean8 = xYSeries2.equals((java.lang.Object) doubleArray7);
        org.jfree.data.xy.XYSeries xYSeries12 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        xYSeries12.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable16 = xYSeries15.getKey();
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
        xYSeries15.setKey((java.lang.Comparable) xYDataItem48);
        org.jfree.data.xy.XYSeries xYSeries52 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem48, false, false);
        xYSeries12.add(xYDataItem48);
        org.jfree.data.xy.XYSeries xYSeries56 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem48, false, true);
        xYSeries2.add(xYDataItem48);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + '#' + "'", comparable16, '#');
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertNotNull(xYSeries46);
        org.junit.Assert.assertNotNull(xYDataItem48);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        xYSeries9.removeChangeListener(seriesChangeListener36);
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
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, true, false);
        org.jfree.data.xy.XYSeries xYSeries6 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
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
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem32, false);
        xYSeries6.add(xYDataItem32);
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem32);
        boolean boolean38 = xYSeries3.equals((java.lang.Object) xYSeries37);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int28 = xYSeries27.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries27.addPropertyChangeListener(propertyChangeListener29);
        org.jfree.data.xy.XYSeries xYSeries32 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        boolean boolean33 = xYSeries32.getNotify();
        org.jfree.data.xy.XYSeries xYSeries37 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries37.removePropertyChangeListener(propertyChangeListener40);
        xYSeries37.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int47 = xYSeries37.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        xYSeries37.addPropertyChangeListener(propertyChangeListener48);
        xYSeries37.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries37.remove(1);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem55, false);
        org.jfree.data.xy.XYSeries xYSeries59 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem55, false);
        xYSeries32.add(xYDataItem55, false);
        xYSeries27.add(xYDataItem55, false);
        xYSeries27.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem67 = xYSeries27.addOrUpdate((double) 4, (double) 4);
        java.util.List list68 = xYSeries27.data;
        xYSeries3.data = list68;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(xYDataItem55);
        org.junit.Assert.assertNull(xYDataItem67);
        org.junit.Assert.assertNotNull(list68);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
            xYSeries3.add((java.lang.Number) 0.0f, (java.lang.Number) 2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(xYSeries49);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        double[][] doubleArray33 = xYSeries30.toArray();
        java.lang.Class<?> wildcardClass34 = xYSeries30.getClass();
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener43 = null;
        xYSeries3.removeChangeListener(seriesChangeListener43);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener45);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(xYSeries41);
        org.junit.Assert.assertNotNull(list42);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries3.remove(0);
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0);
        boolean boolean25 = xYSeries24.isEmpty();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        java.lang.String str22 = xYSeries3.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        xYSeries3.addChangeListener(seriesChangeListener23);
        java.lang.Class<?> wildcardClass25 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 0L + "'", comparable18, 0L);
        org.junit.Assert.assertNull(xYDataItem21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        double[][] doubleArray54 = xYSeries45.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem56 = xYSeries45.getDataItem((int) (short) 0);
        xYSeries3.add(xYDataItem56);
        xYSeries3.add((double) (byte) -1, (java.lang.Number) 1);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertNotNull(xYDataItem56);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        boolean boolean19 = xYSeries3.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.remove((java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries3.addChangeListener(seriesChangeListener4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.removeChangeListener(seriesChangeListener6);
        boolean boolean8 = xYSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, false);
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        boolean boolean5 = xYSeries2.equals((java.lang.Object) (-1.0d));
        int int6 = xYSeries2.getMaximumItemCount();
        java.util.List list7 = xYSeries2.data;
        boolean boolean8 = xYSeries2.getAllowDuplicateXValues();
        boolean boolean9 = xYSeries2.getNotify();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries31 = xYSeries28.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYSeries xYSeries34 = xYSeries28.createCopy(0, (int) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries36.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        xYSeries36.removeChangeListener(seriesChangeListener39);
        java.lang.String str41 = xYSeries36.getDescription();
        org.jfree.data.xy.XYSeries xYSeries44 = xYSeries36.createCopy(100, (int) (byte) 10);
        int int45 = xYSeries36.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries48 = xYSeries36.createCopy((int) 'a', (int) (byte) 0);
        boolean boolean49 = xYSeries34.equals((java.lang.Object) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries53.setDescription("");
        java.lang.String str56 = xYSeries53.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener57 = null;
        xYSeries53.addChangeListener(seriesChangeListener57);
        java.util.List list59 = xYSeries53.getItems();
        boolean boolean60 = xYSeries34.equals((java.lang.Object) list59);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        xYSeries64.removePropertyChangeListener(propertyChangeListener65);
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        xYSeries64.removePropertyChangeListener(propertyChangeListener67);
        xYSeries64.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int74 = xYSeries64.indexOf((java.lang.Number) 0.0f);
        xYSeries64.add((double) (-1), (java.lang.Number) 1.0d, false);
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener83 = null;
        xYSeries82.removePropertyChangeListener(propertyChangeListener83);
        java.beans.PropertyChangeListener propertyChangeListener85 = null;
        xYSeries82.removePropertyChangeListener(propertyChangeListener85);
        xYSeries82.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray91 = xYSeries82.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem93 = xYSeries82.getDataItem((int) (short) 0);
        xYSeries64.add(xYDataItem93);
        xYSeries34.add(xYDataItem93, true);
        xYSeries23.setKey((java.lang.Comparable) true);
        java.util.List list98 = xYSeries23.getItems();
        java.lang.Class<?> wildcardClass99 = xYSeries23.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(xYSeries31);
        org.junit.Assert.assertNotNull(xYSeries34);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(xYSeries44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(xYSeries48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertNotNull(xYDataItem93);
        org.junit.Assert.assertNotNull(list98);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        java.lang.Object obj13 = xYSeries3.clone();
        java.lang.Object obj14 = xYSeries3.clone();
        boolean boolean15 = xYSeries3.isEmpty();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L);
        double[][] doubleArray2 = xYSeries1.toArray();
        java.lang.String str3 = xYSeries1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Object obj2 = xYSeries1.clone();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        xYSeries1.removeChangeListener(seriesChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        xYSeries1.addPropertyChangeListener(propertyChangeListener7);
        int int9 = xYSeries1.getItemCount();
        xYSeries1.add((double) (-1), (double) 10, false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", true, true);
        java.lang.Object obj4 = xYSeries3.clone();
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries3.addOrUpdate((java.lang.Number) 0.0f, (java.lang.Number) (byte) 0);
        int int9 = xYSeries3.indexOf((java.lang.Number) (byte) 1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(xYDataItem7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, true, false);
        java.util.List list4 = xYSeries3.data;
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        org.jfree.data.xy.XYSeries xYSeries81 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem67, false, true);
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true);
        xYSeries82.add((double) (-5908509288197150436L), (java.lang.Number) (-1), true);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(xYDataItem67);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable12 = xYSeries3.getKey();
        xYSeries3.add((double) (-3), (double) 10L);
        int int17 = xYSeries3.indexOf((java.lang.Number) (-1L));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number41 = xYSeries39.getX((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertNotNull(comparable38);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        xYSeries3.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((java.lang.Number) (short) 100, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        double[][] doubleArray23 = xYSeries3.toArray();
        java.lang.Object obj24 = xYSeries3.clone();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + number22 + "' != '" + 0L + "'", number22, 0L);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f, true);
        java.util.List list23 = xYSeries22.data;
        int int25 = xYSeries22.indexOf((java.lang.Number) 10.0d);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem18);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        xYSeries3.add((double) (byte) 0, 0.0d, false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener22);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener24);
        xYSeries21.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int31 = xYSeries21.indexOf((java.lang.Number) 0.0f);
        xYSeries21.add((double) (-1), (java.lang.Number) 1.0d, false);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener40);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener42);
        xYSeries39.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray48 = xYSeries39.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem50 = xYSeries39.getDataItem((int) (short) 0);
        xYSeries21.add(xYDataItem50);
        xYSeries3.add(xYDataItem50, false);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 100 + "'", comparable15, (short) 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(xYDataItem50);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((-1.0d), (double) 10);
        java.lang.Object obj10 = null;
        boolean boolean11 = xYSeries3.equals(obj10);
        xYSeries3.delete(0, (int) (short) -1);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        xYSeries3.add((java.lang.Number) (short) -1, (java.lang.Number) 0.0d);
        boolean boolean8 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) 10.0f, (double) (short) 1, true);
        boolean boolean11 = xYSeries3.getNotify();
        boolean boolean12 = xYSeries3.getAutoSort();
        java.lang.Comparable comparable13 = xYSeries3.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries3.addOrUpdate((java.lang.Number) (-2), (java.lang.Number) (-5908509288197150436L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 0L + "'", comparable13, 0L);
        org.junit.Assert.assertNull(xYDataItem16);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        org.jfree.data.xy.XYSeries xYSeries51 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        xYSeries51.addChangeListener(seriesChangeListener52);
        boolean boolean54 = xYSeries51.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener59 = null;
        xYSeries58.removePropertyChangeListener(propertyChangeListener59);
        java.beans.PropertyChangeListener propertyChangeListener61 = null;
        xYSeries58.removePropertyChangeListener(propertyChangeListener61);
        xYSeries58.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int68 = xYSeries58.indexOf((java.lang.Number) 0.0f);
        xYSeries58.add((double) (-1), (java.lang.Number) 1.0d, false);
        org.jfree.data.xy.XYSeries xYSeries76 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener77 = null;
        xYSeries76.removePropertyChangeListener(propertyChangeListener77);
        java.beans.PropertyChangeListener propertyChangeListener79 = null;
        xYSeries76.removePropertyChangeListener(propertyChangeListener79);
        xYSeries76.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray85 = xYSeries76.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem87 = xYSeries76.getDataItem((int) (short) 0);
        xYSeries58.add(xYDataItem87);
        xYSeries51.add(xYDataItem87, false);
        xYSeries48.add(xYDataItem87, false);
        org.jfree.data.xy.XYSeries xYSeries95 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) false, true, true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertNotNull(xYDataItem87);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        xYSeries3.add((double) 10, (java.lang.Number) (-2), true);
        xYSeries3.delete(10, (int) (byte) 0);
        xYSeries3.add((java.lang.Number) 0, (java.lang.Number) (-2), true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem73);
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
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        xYSeries3.update((java.lang.Number) 0.0f, (java.lang.Number) (byte) 1);
        xYSeries3.setNotify(true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int20 = xYSeries19.getItemCount();
        java.util.List list21 = xYSeries19.getItems();
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener26);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener28);
        xYSeries25.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        xYSeries25.addChangeListener(seriesChangeListener34);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener40);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener42);
        org.jfree.data.xy.XYSeries xYSeries47 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        xYSeries47.removePropertyChangeListener(propertyChangeListener48);
        java.util.List list50 = xYSeries47.getItems();
        xYSeries39.data = list50;
        xYSeries25.data = list50;
        xYSeries19.data = list50;
        xYSeries3.data = list50;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list50);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        xYSeries3.add((double) '4', (java.lang.Number) (byte) 0, true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) true);
        xYSeries1.add((double) 1.0f, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (-1L), (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        xYSeries49.setDescription("hi!");
        int int68 = xYSeries49.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries72 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        xYSeries72.removePropertyChangeListener(propertyChangeListener73);
        java.util.List list75 = xYSeries72.getItems();
        xYSeries72.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean80 = xYSeries72.getAllowDuplicateXValues();
        xYSeries72.add((double) (-1L), (double) (byte) 1);
        xYSeries72.add((double) 2147483647, (double) 'a', true);
        boolean boolean88 = xYSeries72.getNotify();
        java.util.List list89 = xYSeries72.getItems();
        java.lang.Number number91 = xYSeries72.getY(0);
        java.util.List list92 = xYSeries72.getItems();
        xYSeries49.data = list92;
        xYSeries45.data = list92;
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertNotNull(xYSeries45);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2147483647 + "'", int68 == 2147483647);
        org.junit.Assert.assertNotNull(list75);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(list89);
        org.junit.Assert.assertEquals("'" + number91 + "' != '" + 1.0d + "'", number91, 1.0d);
        org.junit.Assert.assertNotNull(list92);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        boolean boolean7 = xYSeries3.isEmpty();
        boolean boolean8 = xYSeries3.getAllowDuplicateXValues();
        java.util.List list9 = xYSeries3.getItems();
        double[][] doubleArray10 = xYSeries3.toArray();
        xYSeries3.add((double) 100L, (double) (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        java.lang.String str27 = xYSeries3.getDescription();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        java.lang.Comparable comparable22 = xYSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(0.0d, (double) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + 0L + "'", comparable22, 0L);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        xYSeries39.add((java.lang.Number) (-1.0f), (java.lang.Number) 2147483647, true);
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        xYSeries3.setDescription("");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + 0L + "'", comparable25, 0L);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate(0.0d, (double) 1L);
        xYSeries1.add((double) 10.0f, (java.lang.Number) 1L);
        org.junit.Assert.assertNull(xYDataItem4);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        xYSeries3.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries3.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        double[][] doubleArray19 = xYSeries3.toArray();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(xYDataItem18);
        org.junit.Assert.assertNotNull(doubleArray19);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.isEmpty();
        boolean boolean12 = xYSeries3.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        int int27 = xYSeries22.indexOf((java.lang.Number) 4);
        xYSeries22.clear();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem31);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries35.remove((java.lang.Number) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(xYDataItem31);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((double) 1L, (double) 100.0f);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (short) 0);
        boolean boolean14 = xYSeries3.isEmpty();
        java.util.List list15 = xYSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((double) 1, (java.lang.Number) 100, true);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        xYSeries3.addChangeListener(seriesChangeListener29);
        xYSeries3.setMaximumItemCount(3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        org.jfree.data.xy.XYSeries xYSeries84 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem73, true, false);
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
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        boolean boolean43 = xYSeries29.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number66 = xYSeries3.getX((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(xYDataItem54);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.lang.Number number9 = xYSeries3.getY((int) (short) 0);
        boolean boolean10 = xYSeries3.getNotify();
        java.lang.Object obj11 = xYSeries3.clone();
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int16 = xYSeries15.getItemCount();
        java.util.List list17 = xYSeries15.getItems();
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries21.removePropertyChangeListener(propertyChangeListener22);
        int int25 = xYSeries21.indexOf((java.lang.Number) (short) 10);
        java.util.List list26 = xYSeries21.data;
        xYSeries15.data = list26;
        java.util.List list28 = xYSeries15.getItems();
        xYSeries15.add((double) (short) 1, (java.lang.Number) 10L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        xYSeries15.addChangeListener(seriesChangeListener32);
        boolean boolean34 = xYSeries3.equals((java.lang.Object) seriesChangeListener32);
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        xYSeries1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = xYSeries1.getX(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        boolean boolean27 = xYSeries3.isEmpty();
        xYSeries3.delete((int) '4', 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (short) 10, (double) 'a', false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        xYSeries1.setMaximumItemCount((int) (byte) 0);
        java.util.List list4 = xYSeries1.getItems();
        int int6 = xYSeries1.indexOf((java.lang.Number) (byte) 1);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.fireSeriesChanged();
        java.lang.Object obj3 = null;
        boolean boolean4 = xYSeries1.equals(obj3);
        org.jfree.data.xy.XYSeries xYSeries8 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        xYSeries8.add((double) 'a', (double) 100.0f);
        java.util.List list12 = xYSeries8.getItems();
        xYSeries1.data = list12;
        boolean boolean14 = xYSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, false);
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        boolean boolean5 = xYSeries2.equals((java.lang.Object) (-1.0d));
        int int6 = xYSeries2.getMaximumItemCount();
        java.util.List list7 = xYSeries2.data;
        boolean boolean8 = xYSeries2.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries2.remove((java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(10, (-1));
        xYSeries9.delete((int) (byte) 10, (int) (byte) 0);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener13);
        org.jfree.data.xy.XYSeries xYSeries18 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries21 = xYSeries18.createCopy((int) (byte) -1, 1);
        java.util.List list22 = xYSeries21.getItems();
        xYSeries9.data = list22;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNotNull(xYSeries21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0, false, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries3.addChangeListener(seriesChangeListener4);
        xYSeries3.setMaximumItemCount(2147483647);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries10.createCopy((int) (short) 1, (int) 'a');
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
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39, false);
        xYSeries10.add(xYDataItem39);
        org.jfree.data.xy.XYSeries xYSeries46 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem39, false, false);
        xYSeries3.add(xYDataItem39);
        org.junit.Assert.assertNotNull(xYSeries13);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(xYDataItem39);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        boolean boolean34 = xYSeries28.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        java.util.List list5 = xYSeries3.getItems();
        java.lang.Comparable comparable6 = xYSeries3.getKey();
        xYSeries3.setDescription("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10L + "'", comparable6, 10L);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        xYSeries5.delete((int) (short) 10, (int) (short) 0);
        xYSeries5.add((double) (-1L), (java.lang.Number) 2, false);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener36);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener38);
        xYSeries35.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries45 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        boolean boolean46 = xYSeries35.equals((java.lang.Object) false);
        xYSeries35.add((double) (byte) 10, (double) (byte) 10, true);
        org.jfree.data.xy.XYSeries xYSeries54 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener55 = null;
        xYSeries54.removePropertyChangeListener(propertyChangeListener55);
        java.beans.PropertyChangeListener propertyChangeListener57 = null;
        xYSeries54.removePropertyChangeListener(propertyChangeListener57);
        xYSeries54.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int64 = xYSeries54.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        xYSeries54.addPropertyChangeListener(propertyChangeListener65);
        org.jfree.data.xy.XYDataItem xYDataItem68 = xYSeries54.remove((int) (short) 0);
        org.jfree.data.xy.XYSeries xYSeries70 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem68, true);
        xYSeries35.add(xYDataItem68);
        org.jfree.data.xy.XYSeries xYSeries74 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem68, false, true);
        xYSeries5.add(xYDataItem68, true);
        xYSeries1.setKey((java.lang.Comparable) true);
        boolean boolean78 = xYSeries1.getAutoSort();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(xYDataItem68);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        int int8 = xYSeries3.getMaximumItemCount();
        org.jfree.data.xy.XYSeries xYSeries11 = xYSeries3.createCopy((int) '#', (int) (byte) -1);
        int int12 = xYSeries11.getMaximumItemCount();
        java.lang.String str13 = xYSeries11.getDescription();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(xYSeries11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        xYSeries3.add((java.lang.Number) 2147483647, (java.lang.Number) 10L, false);
        java.lang.Number number17 = xYSeries3.getY(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + number17 + "' != '" + 10L + "'", number17, 10L);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.util.List list14 = xYSeries3.getItems();
        java.lang.Comparable comparable15 = xYSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = xYSeries3.getX((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0L + "'", comparable15, 0L);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        org.jfree.data.xy.XYSeries xYSeries77 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem66, true, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries77.updateByIndex((int) (byte) 10, (java.lang.Number) (-5908509288197150436L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
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
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        xYSeries3.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem20);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries3.addOrUpdate((java.lang.Number) 0L, (java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        java.util.List list31 = xYSeries3.getItems();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) 10.0f, (double) (short) 1, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.addOrUpdate((java.lang.Number) (short) 0, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        java.util.List list5 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener10);
        int int13 = xYSeries9.indexOf((java.lang.Number) (short) 10);
        java.util.List list14 = xYSeries9.data;
        xYSeries3.data = list14;
        java.util.List list16 = xYSeries3.getItems();
        java.util.List list17 = xYSeries3.getItems();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
            java.lang.Number number25 = xYSeries3.getX((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.util.List list14 = xYSeries3.getItems();
        double[][] doubleArray15 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 2, (java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 2");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        boolean boolean6 = xYSeries1.getAutoSort();
        xYSeries1.setDescription("");
        java.lang.Comparable comparable9 = xYSeries1.getKey();
        xYSeries1.add((java.lang.Number) (short) 1, (java.lang.Number) 0L);
        boolean boolean13 = xYSeries1.isEmpty();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (short) -1 + "'", comparable9, (short) -1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable2 = xYSeries1.getKey();
        xYSeries1.clear();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(3, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + '#' + "'", comparable2, '#');
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries3.addChangeListener(seriesChangeListener4);
        int int6 = xYSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        java.lang.Class<?> wildcardClass47 = list44.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((-1.0d), (double) 10);
        xYSeries3.setMaximumItemCount(2147483647);
        xYSeries3.clear();
        xYSeries3.setMaximumItemCount(4);
        int int15 = xYSeries3.getItemCount();
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        java.lang.String str6 = xYSeries3.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.addChangeListener(seriesChangeListener7);
        java.util.List list9 = xYSeries3.getItems();
        boolean boolean10 = xYSeries3.getNotify();
        boolean boolean11 = xYSeries3.getNotify();
        java.lang.String str12 = xYSeries3.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        int int23 = xYSeries22.getItemCount();
        java.lang.Comparable comparable24 = xYSeries22.getKey();
        xYSeries22.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        xYSeries22.removeChangeListener(seriesChangeListener26);
        org.jfree.data.xy.XYSeries xYSeries31 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int32 = xYSeries31.getItemCount();
        xYSeries31.add((java.lang.Number) (short) -1, (java.lang.Number) 0.0d);
        java.lang.Comparable comparable36 = xYSeries31.getKey();
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
        xYSeries40.fireSeriesChanged();
        java.util.List list65 = xYSeries40.getItems();
        xYSeries31.data = list65;
        xYSeries22.data = list65;
        xYSeries3.data = list65;
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(xYSeries14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + 100.0d + "'", comparable24, 100.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + 10L + "'", comparable36, 10L);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(xYDataItem62);
        org.junit.Assert.assertNotNull(list65);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        java.lang.Class<?> wildcardClass32 = xYDataItem31.getClass();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 1L, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        java.lang.Object obj25 = xYSeries3.clone();
        xYSeries3.clear();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.removeChangeListener(seriesChangeListener9);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) 1L);
        xYSeries3.setMaximumItemCount(2147483647);
        java.util.List list17 = xYSeries3.getItems();
        boolean boolean18 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertNull(xYDataItem14);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        xYSeries3.delete(0, (-2));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        xYSeries3.addChangeListener(seriesChangeListener35);
        xYSeries3.setDescription("");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        int int4 = xYSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.remove((java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        org.jfree.data.xy.XYDataItem xYDataItem79 = xYSeries5.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(xYDataItem71);
        org.junit.Assert.assertNull(xYDataItem79);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        java.lang.Number number13 = xYSeries3.getX((int) (byte) 0);
        xYSeries3.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 1.0d + "'", number13, 1.0d);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.fireSeriesChanged();
        java.lang.Comparable comparable13 = xYSeries3.getKey();
        xYSeries3.add((double) 3, (double) (byte) 10, true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 0L + "'", comparable13, 0L);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        int int7 = xYSeries6.getMaximumItemCount();
        int int8 = xYSeries6.getMaximumItemCount();
        int int9 = xYSeries6.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries13.setDescription("");
        java.lang.String str16 = xYSeries13.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries13.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100);
        org.jfree.data.xy.XYSeries xYSeries23 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries23.add((double) 0.0f, 0.0d);
        xYSeries23.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean31 = xYSeries23.getAllowDuplicateXValues();
        xYSeries23.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
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
        xYSeries36.add(xYDataItem62, false);
        xYSeries23.setKey((java.lang.Comparable) xYDataItem62);
        xYSeries13.add(xYDataItem62, true);
        org.jfree.data.xy.XYSeries xYSeries71 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem62, true, false);
        xYSeries6.setKey((java.lang.Comparable) xYDataItem62);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(xYDataItem62);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        xYSeries3.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.lang.Number number9 = xYSeries3.getY((int) (short) 0);
        double[][] doubleArray10 = xYSeries3.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.addOrUpdate((java.lang.Number) (short) 100, (java.lang.Number) (short) 100);
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 100, (java.lang.Number) 1L);
        java.lang.String str17 = xYSeries3.getDescription();
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNull(xYDataItem13);
        org.junit.Assert.assertNotNull(xYDataItem16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        xYSeries3.setNotify(false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 10.0f + "'", comparable21, 10.0f);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener23);
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        xYSeries22.removePropertyChangeListener(propertyChangeListener25);
        int int27 = xYSeries22.getItemCount();
        boolean boolean28 = xYSeries22.getNotify();
        int int30 = xYSeries22.indexOf((java.lang.Number) 0.0f);
        xYSeries22.add((double) (byte) 100, (java.lang.Number) (short) -1);
        xYSeries22.add((java.lang.Number) 0L, (java.lang.Number) 0L);
        java.lang.Comparable comparable37 = xYSeries22.getKey();
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries22.addPropertyChangeListener(propertyChangeListener38);
        boolean boolean40 = xYSeries22.getNotify();
        boolean boolean41 = xYSeries3.equals((java.lang.Object) boolean40);
        boolean boolean42 = xYSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 1.0d + "'", number13, 1.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 0L + "'", comparable37, 0L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        java.lang.Comparable comparable49 = xYSeries3.getKey();
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + 0L + "'", comparable49, 0L);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number69 = xYSeries4.getY(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + 0L + "'", comparable31, 0L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(xYDataItem57);
        org.junit.Assert.assertNotNull(xYSeries61);
        org.junit.Assert.assertNotNull(xYDataItem63);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        boolean boolean21 = xYSeries3.getAutoSort();
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        org.jfree.data.xy.XYSeries xYSeries27 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem21, true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries24.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(xYSeries24);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        xYSeries34.removePropertyChangeListener(propertyChangeListener35);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        xYSeries34.removePropertyChangeListener(propertyChangeListener37);
        xYSeries34.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int44 = xYSeries34.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries48 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        xYSeries48.removePropertyChangeListener(propertyChangeListener49);
        java.util.List list51 = xYSeries48.getItems();
        xYSeries34.data = list51;
        xYSeries34.fireSeriesChanged();
        double[][] doubleArray54 = xYSeries34.toArray();
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries61 = xYSeries58.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYSeries xYSeries64 = xYSeries58.createCopy(0, (int) (short) -1);
        boolean boolean65 = xYSeries34.equals((java.lang.Object) xYSeries64);
        java.util.List list66 = xYSeries34.getItems();
        xYSeries3.data = list66;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertNotNull(xYSeries61);
        org.junit.Assert.assertNotNull(xYSeries64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(list66);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        org.jfree.data.xy.XYSeries xYSeries43 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem36, true, false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(xYDataItem36);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        xYSeries1.setNotify(false);
        int int8 = xYSeries1.getMaximumItemCount();
        xYSeries1.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        xYSeries1.addChangeListener(seriesChangeListener10);
        java.lang.Comparable comparable12 = xYSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries1.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (short) -1 + "'", comparable12, (short) -1);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        int int7 = xYSeries3.indexOf((java.lang.Number) (short) 10);
        java.util.List list8 = xYSeries3.data;
        java.util.List list9 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries12 = xYSeries3.createCopy((-2), 0);
        xYSeries12.add((double) (-5908509288197150436L), (java.lang.Number) 4, true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(xYSeries12);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((java.lang.Number) (byte) -1, (java.lang.Number) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        xYSeries3.removeChangeListener(seriesChangeListener20);
        double[][] doubleArray22 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries3.addOrUpdate((double) 100.0f, (double) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -2, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray22);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAutoSort();
        boolean boolean12 = xYSeries3.getAutoSort();
        xYSeries3.add((java.lang.Number) (byte) 10, (java.lang.Number) (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) 10.0f, (double) (short) 1, true);
        boolean boolean11 = xYSeries3.getNotify();
        int int13 = xYSeries3.indexOf((java.lang.Number) 0);
        java.util.List list14 = xYSeries3.getItems();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries2.addChangeListener(seriesChangeListener3);
        int int5 = xYSeries2.getMaximumItemCount();
        xYSeries2.add((double) (-1.0f), (double) (short) -1, true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        java.util.List list3 = xYSeries2.getItems();
        boolean boolean4 = xYSeries2.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = xYSeries2.getX((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        xYSeries2.add((double) (-3), 100.0d);
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
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries3.addOrUpdate((java.lang.Number) 100, (java.lang.Number) (-5908509288197150436L));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        xYSeries3.addChangeListener(seriesChangeListener36);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertNull(xYDataItem35);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        java.lang.Comparable comparable23 = xYSeries3.getKey();
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries3.getDataItem((int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + 10.0f + "'", comparable23, 10.0f);
        org.junit.Assert.assertNotNull(xYDataItem25);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries15.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYDataItem12);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries31 = xYSeries28.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYSeries xYSeries34 = xYSeries28.createCopy(0, (int) (short) -1);
        org.jfree.data.xy.XYSeries xYSeries36 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries36.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        xYSeries36.removeChangeListener(seriesChangeListener39);
        java.lang.String str41 = xYSeries36.getDescription();
        org.jfree.data.xy.XYSeries xYSeries44 = xYSeries36.createCopy(100, (int) (byte) 10);
        int int45 = xYSeries36.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries48 = xYSeries36.createCopy((int) 'a', (int) (byte) 0);
        boolean boolean49 = xYSeries34.equals((java.lang.Object) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries53 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries53.setDescription("");
        java.lang.String str56 = xYSeries53.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener57 = null;
        xYSeries53.addChangeListener(seriesChangeListener57);
        java.util.List list59 = xYSeries53.getItems();
        boolean boolean60 = xYSeries34.equals((java.lang.Object) list59);
        org.jfree.data.xy.XYSeries xYSeries64 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        xYSeries64.removePropertyChangeListener(propertyChangeListener65);
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        xYSeries64.removePropertyChangeListener(propertyChangeListener67);
        xYSeries64.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int74 = xYSeries64.indexOf((java.lang.Number) 0.0f);
        xYSeries64.add((double) (-1), (java.lang.Number) 1.0d, false);
        org.jfree.data.xy.XYSeries xYSeries82 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener83 = null;
        xYSeries82.removePropertyChangeListener(propertyChangeListener83);
        java.beans.PropertyChangeListener propertyChangeListener85 = null;
        xYSeries82.removePropertyChangeListener(propertyChangeListener85);
        xYSeries82.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray91 = xYSeries82.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem93 = xYSeries82.getDataItem((int) (short) 0);
        xYSeries64.add(xYDataItem93);
        xYSeries34.add(xYDataItem93, true);
        xYSeries23.setKey((java.lang.Comparable) true);
        xYSeries23.setDescription("");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(xYSeries31);
        org.junit.Assert.assertNotNull(xYSeries34);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(xYSeries44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(xYSeries48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertNotNull(xYDataItem93);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        org.jfree.data.xy.XYSeries xYSeries42 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        xYSeries42.removePropertyChangeListener(propertyChangeListener43);
        java.beans.PropertyChangeListener propertyChangeListener45 = null;
        xYSeries42.removePropertyChangeListener(propertyChangeListener45);
        xYSeries42.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray51 = xYSeries42.toArray();
        xYSeries42.add((double) 0, 1.0d, true);
        org.jfree.data.xy.XYDataItem xYDataItem58 = xYSeries42.addOrUpdate((java.lang.Number) 100.0f, (java.lang.Number) (byte) 100);
        xYSeries42.fireSeriesChanged();
        xYSeries42.add((double) (short) 0, (java.lang.Number) 2);
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
        xYSeries66.setDescription("hi!");
        xYSeries66.setNotify(false);
        boolean boolean87 = xYSeries66.getAllowDuplicateXValues();
        org.jfree.data.xy.XYDataItem xYDataItem89 = xYSeries66.remove(0);
        xYSeries42.setKey((java.lang.Comparable) xYDataItem89);
        org.jfree.data.xy.XYSeries xYSeries92 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem89, false);
        xYSeries3.add(xYDataItem89);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertNull(xYDataItem58);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(xYDataItem89);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        xYSeries3.add((double) 1, (java.lang.Number) (-5908509288197150436L));
        java.util.List list12 = xYSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = xYSeries3.getX((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        int int20 = xYSeries3.indexOf((java.lang.Number) (short) 1);
        java.lang.Object obj21 = xYSeries3.clone();
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (byte) 0 + "'", number14, (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        org.jfree.data.xy.XYSeries xYSeries97 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem86);
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
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0f, true);
        java.util.List list23 = xYSeries22.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = xYSeries22.getY((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem18);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        xYSeries9.addChangeListener(seriesChangeListener26);
        xYSeries9.setNotify(false);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(xYSeries19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        xYSeries1.clear();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(xYDataItem69);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        int int8 = xYSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 1, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        java.util.List list5 = xYSeries3.getItems();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries9.removePropertyChangeListener(propertyChangeListener10);
        int int13 = xYSeries9.indexOf((java.lang.Number) (short) 10);
        java.util.List list14 = xYSeries9.data;
        xYSeries3.data = list14;
        org.jfree.data.xy.XYSeries xYSeries18 = xYSeries3.createCopy((int) (short) 0, (int) (short) 10);
        xYSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(xYSeries18);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        org.jfree.data.xy.XYSeries xYSeries58 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem49, false);
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(xYDataItem49);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add(10.0d, (java.lang.Number) 10L, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((-3), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        org.jfree.data.xy.XYDataItem xYDataItem38 = xYSeries35.addOrUpdate((double) 100.0f, (double) 0);
        java.util.List list39 = xYSeries35.getItems();
        xYSeries6.data = list39;
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(xYDataItem38);
        org.junit.Assert.assertNotNull(list39);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        boolean boolean33 = xYSeries29.getAutoSort();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        xYSeries3.add((java.lang.Number) (byte) 100, (java.lang.Number) 0.0f);
        java.lang.Object obj31 = xYSeries3.clone();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries3.getDataItem(0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYDataItem35);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        int int16 = xYSeries3.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener17);
        boolean boolean19 = xYSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
            org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries3.remove(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 3, false, false);
        java.lang.Comparable comparable4 = xYSeries3.getKey();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 3 + "'", comparable4, 3);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        xYSeries23.setMaximumItemCount((int) (short) 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem18);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertNotNull(xYSeries23);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + 0L + "'", comparable24, 0L);
        org.junit.Assert.assertNotNull(xYDataItem32);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem3 = xYSeries1.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        xYSeries29.add((double) '4', (java.lang.Number) 0);
        java.beans.PropertyChangeListener propertyChangeListener48 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener48);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
        org.jfree.data.xy.XYSeries xYSeries21 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries21.setDescription("");
        xYSeries21.setNotify(true);
        java.util.List list26 = xYSeries21.data;
        xYSeries3.data = list26;
        xYSeries3.setNotify(true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        int int78 = xYSeries3.getItemCount();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(xYDataItem23);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(xYDataItem66);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2 + "'", int78 == 2);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        java.util.List list83 = xYSeries9.getItems();
        java.lang.String str84 = xYSeries9.getDescription();
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
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        java.lang.Number number29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem30 = xYSeries28.remove(number29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        org.jfree.data.xy.XYSeries xYSeries31 = xYSeries5.createCopy((int) (byte) 100, 1);
        java.util.List list32 = xYSeries31.data;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(xYSeries31);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries2.addChangeListener(seriesChangeListener3);
        xYSeries2.clear();
        boolean boolean6 = xYSeries2.getAutoSort();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        boolean boolean6 = xYSeries3.isEmpty();
        java.lang.String str7 = xYSeries3.getDescription();
        org.jfree.data.xy.XYSeries xYSeries9 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries9.add(0.0d, (java.lang.Number) 0.0d, false);
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries9.remove((int) (byte) 0);
        xYSeries3.add(xYDataItem15);
        boolean boolean17 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(xYDataItem15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries6.addOrUpdate((java.lang.Number) (short) -1, (java.lang.Number) 0L);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries6.addPropertyChangeListener(propertyChangeListener10);
        java.util.List list12 = xYSeries6.data;
        int int14 = xYSeries6.indexOf((java.lang.Number) 0);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        boolean boolean33 = xYSeries11.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = xYSeries11.getY(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 0L + "'", comparable6, 0L);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        xYSeries3.setNotify(true);
        xYSeries3.add(0.0d, (double) (short) -1, false);
        java.lang.Object obj12 = xYSeries3.clone();
        org.jfree.data.xy.XYSeries xYSeries15 = xYSeries3.createCopy((int) ' ', (-3));
        boolean boolean16 = xYSeries15.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries15.update((java.lang.Number) (short) 0, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(xYSeries15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.removeChangeListener(seriesChangeListener6);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries3.addChangeListener(seriesChangeListener8);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries3.setKey((java.lang.Comparable) 10.0f);
        java.lang.String str19 = xYSeries3.getDescription();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((double) 1L, (double) 100.0f);
        xYSeries3.add((java.lang.Number) (-1), (java.lang.Number) (short) 0);
        boolean boolean14 = xYSeries3.isEmpty();
        java.util.List list15 = xYSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) ' ', (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        boolean boolean19 = xYSeries15.getAutoSort();
        xYSeries15.setMaximumItemCount((int) '4');
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        int int4 = xYSeries3.getMaximumItemCount();
        java.lang.Number number5 = null;
        int int6 = xYSeries3.indexOf(number5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        java.lang.String str9 = xYSeries3.getDescription();
        boolean boolean10 = xYSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener29);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(doubleArray28);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.util.List list14 = xYSeries3.getItems();
        java.lang.Comparable comparable15 = xYSeries3.getKey();
        java.lang.Number number17 = null;
        xYSeries3.add((double) 3, number17);
        java.lang.Number number20 = xYSeries3.getX(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries3.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0L + "'", comparable15, 0L);
        org.junit.Assert.assertEquals("'" + number20 + "' != '" + (byte) 0 + "'", number20, (byte) 0);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries3.addChangeListener(seriesChangeListener17);
        java.util.List list19 = xYSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = xYSeries3.getX(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy(100, (int) (byte) 10);
        boolean boolean10 = xYSeries9.getAllowDuplicateXValues();
        boolean boolean11 = xYSeries9.isEmpty();
        boolean boolean12 = xYSeries9.getNotify();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.clear();
        boolean boolean8 = xYSeries3.getAutoSort();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        xYSeries1.setNotify(true);
        xYSeries1.add((double) (short) 100, (double) (short) 0);
        xYSeries1.setDescription("hi!");
        xYSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        org.jfree.data.xy.XYSeries xYSeries50 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem44, true);
        org.junit.Assert.assertNull(xYDataItem12);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(xYDataItem44);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
        java.lang.Class<?> wildcardClass25 = xYSeries24.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) 100, 3);
        xYSeries3.add(1.0d, (double) (byte) 100);
        java.lang.Object obj10 = xYSeries3.clone();
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNotNull(obj10);
    }
}

