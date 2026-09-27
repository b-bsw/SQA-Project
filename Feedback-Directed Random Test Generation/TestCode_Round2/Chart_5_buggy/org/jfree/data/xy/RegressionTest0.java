package org.jfree.data.xy;

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
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex(10, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = xYSeries3.getY(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = xYSeries3.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Failed to clone.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries3.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries3.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = xYSeries3.getX((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
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
        org.jfree.data.xy.XYDataItem xYDataItem20 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(xYDataItem20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries3.getDataItem((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 10, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        org.jfree.data.xy.XYDataItem xYDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(xYDataItem9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        double[][] doubleArray6 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries3.remove((java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        org.jfree.data.xy.XYDataItem xYDataItem2 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.add(xYDataItem2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) (byte) 10, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = xYSeries3.getY((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries3.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
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
        boolean boolean17 = xYSeries3.getAutoSort();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.lang.Number number9 = xYSeries3.getY((int) (short) 0);
        java.lang.Number number11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((java.lang.Number) 0L, number11);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: X-value already exists.");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) '#', (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        long long0 = org.jfree.data.xy.XYSeries.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-5908509288197150436L) + "'", long0 == (-5908509288197150436L));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries3.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
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
        java.lang.Class<?> wildcardClass31 = list28.getClass();
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((double) '4', (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        boolean boolean14 = xYSeries3.equals((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) (short) 10, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = xYSeries3.getY((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.remove((java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        boolean boolean7 = xYSeries3.isEmpty();
        boolean boolean8 = xYSeries3.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) 'a', (java.lang.Number) (-5908509288197150436L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number41 = xYSeries3.getY((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(xYDataItem38);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((java.lang.Number) 0L, (java.lang.Number) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(list42);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries3.remove((java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
        java.lang.Class<?> wildcardClass27 = xYDataItem25.getClass();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries28.update((java.lang.Number) 10.0f, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = xYDataItem12.getClass();
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries3.setKey((java.lang.Comparable) 10.0f);
        int int19 = xYSeries3.getItemCount();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        int int10 = xYSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries5.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(10.0d, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries3.getY((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = xYSeries3.getClass();
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
        xYSeries3.clear();
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
        java.lang.Class<?> wildcardClass20 = xYSeries3.getClass();
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
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
            org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries3.getDataItem((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(xYDataItem26);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries3.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.lang.Number number9 = xYSeries3.getY((int) (short) 0);
        double[][] doubleArray10 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 100, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        boolean boolean4 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((int) (short) 0, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable12 = xYSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
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
        java.lang.Class<?> wildcardClass32 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries3.remove((java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries29.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries3.remove(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        int int4 = xYSeries2.indexOf((java.lang.Number) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries2.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        xYSeries3.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 1, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries3.remove((java.lang.Number) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true);
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        xYSeries2.removePropertyChangeListener(propertyChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.delete(2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        java.lang.Comparable comparable6 = xYSeries3.getKey();
        double[][] doubleArray7 = xYSeries3.toArray();
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.remove(number8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 0L + "'", comparable6, 0L);
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        boolean boolean7 = xYSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.getDataItem(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
        boolean boolean30 = xYSeries3.getAutoSort();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        int int4 = xYSeries2.indexOf((java.lang.Number) (-1L));
        boolean boolean5 = xYSeries2.getAutoSort();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        xYSeries3.add(10.0d, (java.lang.Number) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = xYSeries3.getX((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L);
        xYSeries1.add((double) (-1), (java.lang.Number) (short) 0);
        int int6 = xYSeries1.indexOf((java.lang.Number) (byte) 0);
        boolean boolean7 = xYSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
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
            xYSeries3.updateByIndex(2147483647, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) (-5908509288197150436L), (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -5908509288197150436");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
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
            org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries3.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = xYSeries3.getX((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) (short) 10, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = xYSeries1.getY(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(xYDataItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.lang.Number number9 = xYSeries3.getY((int) (short) 0);
        double[][] doubleArray10 = xYSeries3.toArray();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((-1), (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
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
        java.lang.Class<?> wildcardClass26 = xYSeries3.getClass();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(10.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
        java.lang.Number number30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries3.addOrUpdate(number30, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (-5908509288197150436L), (double) (short) 1);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        int int7 = xYSeries3.indexOf((java.lang.Number) 0.0d);
        boolean boolean9 = xYSeries3.equals((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries3.getY(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries6.addOrUpdate((java.lang.Number) (short) -1, (java.lang.Number) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries6.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries(comparable0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = xYSeries3.getX((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries3.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        java.lang.String str13 = xYSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = xYSeries3.getY((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d), false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries2.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L);
        xYSeries1.add((double) (-1), (java.lang.Number) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        int int24 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
            xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = xYSeries1.getY((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
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
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener23);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener29);
        java.util.List list31 = xYSeries28.getItems();
        xYSeries20.data = list31;
        xYSeries3.data = list31;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        xYSeries3.removeChangeListener(seriesChangeListener34);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 0.0f, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 1, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        java.lang.String str7 = xYSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = xYSeries3.getY((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = xYSeries2.getX((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem3 = xYSeries1.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        xYSeries3.setKey((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries3.remove((java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
            xYSeries29.delete((int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
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
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        java.lang.Number number50 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int51 = xYSeries3.indexOf(number50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list46);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        int int11 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.lang.Number number12 = null;
        java.lang.Number number13 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(number12, number13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) (-5908509288197150436L), (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -5908509288197150436");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        xYSeries3.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.remove((java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = xYSeries1.getY((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        xYSeries3.add((double) (-1L), (double) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
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
            java.lang.Number number33 = xYSeries2.getY((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
        xYSeries3.add((java.lang.Number) 1L, (java.lang.Number) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (-1L), (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries3.remove((java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        boolean boolean4 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = xYSeries3.getX((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        xYSeries20.removePropertyChangeListener(propertyChangeListener23);
        org.jfree.data.xy.XYSeries xYSeries28 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        xYSeries28.removePropertyChangeListener(propertyChangeListener29);
        java.util.List list31 = xYSeries28.getItems();
        xYSeries20.data = list31;
        xYSeries3.data = list31;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        xYSeries3.removeChangeListener(seriesChangeListener34);
        org.jfree.data.xy.XYSeries xYSeries39 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener40);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries39.removePropertyChangeListener(propertyChangeListener42);
        xYSeries39.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int49 = xYSeries39.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        xYSeries39.addPropertyChangeListener(propertyChangeListener50);
        org.jfree.data.xy.XYDataItem xYDataItem53 = xYSeries39.remove((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(xYDataItem53, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(xYDataItem53);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L);
        xYSeries1.add((double) (-1), (java.lang.Number) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.remove((java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem3 = xYSeries1.remove((java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        boolean boolean4 = xYSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries25 = xYSeries3.createCopy((-2), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries3.setNotify(true);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        int int10 = xYSeries3.getItemCount();
        boolean boolean11 = xYSeries3.isEmpty();
        boolean boolean12 = xYSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = xYSeries1.getX(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAutoSort();
        int int12 = xYSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
            java.lang.Object obj19 = xYSeries3.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Failed to clone.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(1.0d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list46);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable2 = xYSeries1.getKey();
        xYSeries1.clear();
        xYSeries1.add((double) (-1.0f), (double) (short) 10, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 1.0f, (java.lang.Number) 2);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + '#' + "'", comparable2, '#');
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        java.lang.Class<?> wildcardClass23 = xYSeries3.getClass();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries3.addOrUpdate((java.lang.Number) 0.0f, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(list44);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable2 = xYSeries1.getKey();
        xYSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex(1, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable2 + "' != '" + '#' + "'", comparable2, '#');
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        xYSeries3.fireSeriesChanged();
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries3.addOrUpdate((double) 10.0f, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
            xYSeries3.add((double) (short) -1, (double) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries28.update((java.lang.Number) 0.0f, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
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
        java.lang.Class<?> wildcardClass24 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = xYSeries3.getY((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries3.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = xYSeries3.getKey();
        xYSeries3.setKey((java.lang.Comparable) ' ');
        java.lang.Class<?> wildcardClass11 = xYSeries3.getClass();
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 0L + "'", comparable8, 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        java.lang.Number number22 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update(number22, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = xYSeries3.getKey();
        java.lang.Object obj9 = xYSeries3.clone();
        java.util.List list10 = xYSeries3.data;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 0L + "'", comparable8, 0L);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries10 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries10.setDescription("");
        java.lang.String str13 = xYSeries10.getDescription();
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries10.addOrUpdate((java.lang.Number) 1L, (java.lang.Number) 100);
        org.jfree.data.xy.XYSeries xYSeries20 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries20.add((double) 0.0f, 0.0d);
        xYSeries20.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean28 = xYSeries20.getAllowDuplicateXValues();
        xYSeries20.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
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
        xYSeries33.add(xYDataItem59, false);
        xYSeries20.setKey((java.lang.Comparable) xYDataItem59);
        xYSeries10.add(xYDataItem59, true);
        xYSeries1.setKey((java.lang.Comparable) xYDataItem59);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener67 = null;
        xYSeries1.removeChangeListener(seriesChangeListener67);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(xYDataItem16);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(xYDataItem59);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        java.lang.Object obj12 = xYSeries3.clone();
        java.lang.Number number13 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(number13, (java.lang.Number) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
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
        java.lang.String str21 = xYSeries3.getDescription();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = xYSeries3.getKey();
        java.lang.Object obj9 = xYSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.getDataItem(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 0L + "'", comparable8, 0L);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        java.util.List list29 = xYSeries3.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries3.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        org.jfree.data.xy.XYDataItem xYDataItem26 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(xYDataItem26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        int int7 = xYSeries3.indexOf((java.lang.Number) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) (-1.0d), (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries3.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true);
        xYSeries2.delete((int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries2.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = xYSeries3.getKey();
        java.lang.Object obj9 = xYSeries3.clone();
        java.util.List list10 = xYSeries3.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 0L + "'", comparable8, 0L);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries(comparable0, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries1.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = xYSeries5.getX((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        xYSeries3.setKey((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem13 = xYSeries3.remove((java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((java.lang.Number) (-5908509288197150436L), (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list46);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        java.util.List list7 = xYSeries3.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.remove((java.lang.Number) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        xYSeries1.add((java.lang.Number) 1.0f, (java.lang.Number) 0L, true);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        java.lang.Comparable comparable6 = xYSeries3.getKey();
        double[][] doubleArray7 = xYSeries3.toArray();
        java.lang.Comparable comparable8 = xYSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) '#', (java.lang.Number) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 0L + "'", comparable6, 0L);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 0L + "'", comparable8, 0L);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        java.lang.Class<?> wildcardClass28 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        boolean boolean19 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        xYSeries24.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener43 = null;
        xYSeries24.addChangeListener(seriesChangeListener43);
        xYSeries24.setMaximumItemCount((int) (byte) 1);
        java.util.List list47 = xYSeries24.data;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        xYSeries24.removeChangeListener(seriesChangeListener48);
        java.util.List list50 = xYSeries24.data;
        xYSeries3.data = list50;
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(list50);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = xYSeries3.getY((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) ' ', (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.setNotify(true);
        xYSeries3.setKey((java.lang.Comparable) (-5908509288197150436L));
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, false);
        org.jfree.data.xy.XYSeries xYSeries4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        boolean boolean5 = xYSeries2.equals((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries2.remove((java.lang.Number) (-5908509288197150436L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.addOrUpdate((java.lang.Number) (-1.0f), (java.lang.Number) 0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 0.0f, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem12);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2, false, false);
        java.lang.Number number5 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex(10, number5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L);
        xYSeries1.add((double) (-1), (java.lang.Number) (short) 0);
        int int6 = xYSeries1.indexOf((java.lang.Number) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = xYSeries1.getX(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        xYSeries3.updateByIndex(0, (java.lang.Number) 10.0f);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 0L + "'", comparable8, 0L);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(xYDataItem53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        xYSeries1.setMaximumItemCount((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        int int9 = xYSeries3.indexOf((java.lang.Number) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete(1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        xYSeries3.removeChangeListener(seriesChangeListener20);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number47 = xYSeries32.getY(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) 100.0f, (java.lang.Number) (-1.0d), true);
        xYSeries1.add((double) '4', (double) (-2));
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 0, true);
        xYSeries14.add((double) 10L, (double) 10.0f, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = xYSeries14.getY((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYDataItem12);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable20 = xYSeries19.getKey();
        org.jfree.data.xy.XYSeries xYSeries24 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
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
        xYSeries24.add(xYDataItem46);
        org.jfree.data.xy.XYSeries xYSeries50 = xYSeries24.createCopy(100, 1);
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries24.remove(0);
        xYSeries19.setKey((java.lang.Comparable) xYDataItem52);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(xYDataItem52, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + '#' + "'", comparable20, '#');
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(xYDataItem46);
        org.junit.Assert.assertNotNull(xYSeries50);
        org.junit.Assert.assertNotNull(xYDataItem52);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        java.lang.Object obj6 = xYSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.remove((java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        java.util.List list5 = xYSeries3.getItems();
        java.lang.Comparable comparable6 = xYSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 100.0f, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10L + "'", comparable6, 10L);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        int int10 = xYSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        java.lang.Class<?> wildcardClass19 = xYSeries18.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        xYSeries3.add((java.lang.Number) (short) -1, (java.lang.Number) 0.0d);
        java.lang.Object obj8 = xYSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 10.0f, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((-1.0d), (double) 10);
        java.util.List list10 = xYSeries3.data;
        java.lang.Number number12 = xYSeries3.getX((int) (byte) 1);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + number12 + "' != '" + 0.0d + "'", number12, 0.0d);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.delete((int) (byte) 10, 2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries3.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem49 = xYSeries3.addOrUpdate((java.lang.Number) (byte) -1, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(list44);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((-1.0d), (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        xYSeries5.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0f, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = xYSeries2.getX(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        java.lang.Object obj30 = xYSeries26.clone();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        java.util.List list14 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 10L, (java.lang.Number) (short) 0, true);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) 100, true);
        xYSeries3.add((double) '4', (double) 10.0f, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        java.lang.Comparable comparable13 = xYSeries3.getKey();
        java.lang.Comparable comparable14 = xYSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = xYSeries3.getY((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 0L + "'", comparable13, 0L);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 0L + "'", comparable14, 0L);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem28 = xYSeries3.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries16 = xYSeries3.createCopy((int) (byte) -1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        boolean boolean4 = xYSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        java.lang.Class<?> wildcardClass81 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(xYSeries48);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(xYDataItem74);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) ' ', true);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries(comparable0, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
            xYSeries3.add((double) (byte) 10, (java.lang.Number) (-1));
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 10);
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
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries5.remove(1);
        java.util.List list24 = xYSeries5.data;
        xYSeries1.data = list24;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        xYSeries1.removeChangeListener(seriesChangeListener26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(xYDataItem23);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0f, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = xYSeries2.getY((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        int int11 = xYSeries3.indexOf((java.lang.Number) (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        boolean boolean81 = xYSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(xYSeries48);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(xYDataItem74);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 0, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries14.getDataItem((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYDataItem12);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100);
        java.lang.Class<?> wildcardClass2 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        java.lang.String str6 = xYSeries3.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries(comparable0, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries3.addChangeListener(seriesChangeListener6);
        org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.addOrUpdate((double) 1L, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem10);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        org.jfree.data.xy.XYDataItem xYDataItem71 = xYSeries3.addOrUpdate((java.lang.Number) 2, (java.lang.Number) 1.0f);
        java.lang.Number number72 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int73 = xYSeries3.indexOf(number72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(xYDataItem61);
        org.junit.Assert.assertNull(xYDataItem71);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.fireSeriesChanged();
        xYSeries3.add((double) (short) 100, (java.lang.Number) 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        xYSeries3.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
            org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 1, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        java.util.List list29 = xYSeries3.data;
        boolean boolean30 = xYSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) (byte) 100, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem43 = xYSeries3.remove((java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        java.util.List list22 = xYSeries3.data;
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
            java.lang.Number number60 = xYSeries3.getX(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = xYSeries3.getX((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        java.util.List list28 = xYSeries3.data;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((int) (byte) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        java.util.List list29 = xYSeries3.data;
        boolean boolean30 = xYSeries3.isEmpty();
        xYSeries3.add((double) 100L, 1.0d, false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number50 = xYSeries48.getY((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries6.remove((java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
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
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
            org.jfree.data.xy.XYSeries xYSeries18 = xYSeries3.createCopy((int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0L + "'", comparable15, 0L);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        java.lang.Object obj6 = xYSeries1.clone();
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 1.0d, number8);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 1.0f, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(xYDataItem27);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        xYSeries2.addPropertyChangeListener(propertyChangeListener32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = xYSeries2.getY((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(xYDataItem28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        org.jfree.data.xy.XYSeries xYSeries26 = xYSeries23.createCopy(100, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(xYDataItem20);
        org.junit.Assert.assertNotNull(xYSeries26);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries14 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 0, true);
        xYSeries14.add((double) 10L, (double) 10.0f, true);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries14.addPropertyChangeListener(propertyChangeListener19);
        org.junit.Assert.assertNotNull(xYDataItem12);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        java.lang.Number number16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 1.0d, number16);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        java.lang.Object obj17 = xYSeries3.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries3.removeChangeListener(seriesChangeListener18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem22 = xYSeries3.addOrUpdate((java.lang.Number) (byte) 100, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) 2147483647, (java.lang.Number) (short) 100, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries16 = xYSeries3.createCopy((int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.clear();
        xYSeries3.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = xYSeries3.getY((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        java.util.List list5 = xYSeries3.getItems();
        java.lang.Comparable comparable6 = xYSeries3.getKey();
        xYSeries3.add((java.lang.Number) 1, (java.lang.Number) (byte) 10, true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10L + "'", comparable6, 10L);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.addOrUpdate((double) (byte) 100, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -2, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = xYSeries3.getY((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int13 = xYSeries3.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries3.remove((java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.setNotify(true);
        xYSeries3.add((double) 1, (double) (byte) -1, true);
        xYSeries3.add((double) (-1), (java.lang.Number) 1, true);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d, true, true);
        xYSeries3.add((java.lang.Number) 10.0f, (java.lang.Number) 2);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        xYSeries3.add((double) (byte) 100, (java.lang.Number) (short) 100, true);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = xYSeries3.getY((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        org.jfree.data.xy.XYDataItem xYDataItem49 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries48.add(xYDataItem49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = xYSeries22.getX((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        xYSeries3.removeChangeListener(seriesChangeListener18);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Comparable comparable12 = xYSeries3.getKey();
        java.lang.Number number14 = xYSeries3.getX((int) (short) 0);
        xYSeries3.update((java.lang.Number) 0, (java.lang.Number) 0L);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (byte) 0 + "'", number14, (byte) 0);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        xYSeries3.setNotify(false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        java.lang.Class<?> wildcardClass28 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = xYSeries1.getDescription();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries1.createCopy(100, (int) (byte) 10);
        int int10 = xYSeries1.getItemCount();
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries1.createCopy((int) 'a', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries13.updateByIndex((int) (short) 10, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(xYSeries13);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        xYSeries3.setKey((java.lang.Comparable) (-1.0f));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries49 = xYSeries3.createCopy(1, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertNotNull(list46);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = xYSeries6.getY(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
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
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) (byte) 100, true);
        boolean boolean10 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        int int7 = xYSeries3.indexOf((java.lang.Number) 0.0d);
        boolean boolean9 = xYSeries3.equals((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((-2), (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
            xYSeries15.update((java.lang.Number) (byte) 1, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 0 + "'", comparable16, (byte) 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries23.update((java.lang.Number) 10.0d, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        java.lang.Number number15 = xYSeries3.getX(0);
        org.junit.Assert.assertEquals("'" + number15 + "' != '" + (-1.0d) + "'", number15, (-1.0d));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        java.lang.Comparable comparable20 = xYSeries3.getKey();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 0L + "'", comparable20, 0L);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        boolean boolean14 = xYSeries3.equals((java.lang.Object) false);
        java.lang.String str15 = xYSeries3.getDescription();
        xYSeries3.clear();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        double[][] doubleArray24 = xYSeries23.toArray();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0.0d, (java.lang.Number) 10);
        boolean boolean5 = xYSeries1.getAutoSort();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener18);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 100 + "'", comparable15, (short) 100);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        boolean boolean6 = xYSeries3.isEmpty();
        java.util.List list7 = xYSeries3.getItems();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
            xYSeries29.updateByIndex((int) (byte) 10, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
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
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number48 = xYSeries3.getX((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        java.lang.Comparable comparable38 = xYSeries3.getKey();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + 10L + "'", comparable38, 10L);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add(10.0d, (java.lang.Number) 0.0d);
        java.lang.Object obj15 = xYSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem17 = xYSeries3.remove((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        int int4 = xYSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) 'a', (java.lang.Number) (-5908509288197150436L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries3.removeChangeListener(seriesChangeListener17);
        java.lang.Class<?> wildcardClass19 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        xYSeries3.add((double) (short) 1, (java.lang.Number) 0L, false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries3.remove((java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -4 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((java.lang.Number) 0L, (java.lang.Number) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(list44);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        boolean boolean47 = xYSeries3.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((double) 2147483647, (double) 10.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        java.lang.Number number33 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(number33, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        java.lang.Object obj12 = xYSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
            xYSeries3.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.fireSeriesChanged();
        xYSeries3.clear();
        org.jfree.data.xy.XYDataItem xYDataItem16 = xYSeries3.addOrUpdate((double) 2147483647, (-1.0d));
        java.lang.Object obj17 = xYSeries3.clone();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(xYDataItem16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        xYSeries3.add(0.0d, (java.lang.Number) 1.0d);
        int int9 = xYSeries3.getItemCount();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        xYSeries23.add((java.lang.Number) 2, (java.lang.Number) (-5908509288197150436L), true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setNotify(false);
        boolean boolean6 = xYSeries3.getNotify();
        java.lang.String str7 = xYSeries3.getDescription();
        java.lang.Object obj8 = xYSeries3.clone();
        xYSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = xYSeries3.getY((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries22.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        double[][] doubleArray24 = xYSeries23.toArray();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((-1), (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 100 + "'", comparable15, (short) 100);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries(comparable0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.setNotify(true);
        xYSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete(10, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        int int23 = xYSeries14.getMaximumItemCount();
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        xYSeries1.removeChangeListener(seriesChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 1.0f, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries1.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        int int12 = xYSeries3.indexOf((java.lang.Number) (-2));
        xYSeries3.add((double) (byte) 0, (java.lang.Number) 1.0f);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener16);
        java.lang.Class<?> wildcardClass18 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
            org.jfree.data.xy.XYDataItem xYDataItem51 = xYSeries49.remove((java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(xYSeries49);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.setNotify(false);
        java.util.List list10 = xYSeries3.data;
        org.jfree.data.xy.XYSeries xYSeries13 = xYSeries3.createCopy((int) 'a', (int) (byte) 1);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(xYSeries13);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        java.lang.Comparable comparable33 = xYSeries32.getKey();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYSeries32);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + false + "'", comparable33, false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = xYSeries3.getY((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        xYSeries1.removeChangeListener(seriesChangeListener2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem5 = xYSeries1.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries3.removeChangeListener(seriesChangeListener17);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int24 = xYSeries22.indexOf((java.lang.Number) (byte) -1);
        int int26 = xYSeries22.indexOf((java.lang.Number) 0.0d);
        boolean boolean28 = xYSeries22.equals((java.lang.Object) 0.0d);
        boolean boolean29 = xYSeries3.equals((java.lang.Object) boolean28);
        java.lang.Number number30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = xYSeries3.indexOf(number30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        boolean boolean28 = xYSeries23.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries23.update((java.lang.Number) 100, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNull(xYDataItem26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0.0d, (java.lang.Number) 10);
        xYSeries1.add(10.0d, (java.lang.Number) 100.0d, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.addChangeListener(seriesChangeListener9);
        org.junit.Assert.assertNull(xYDataItem4);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        java.lang.Class<?> wildcardClass30 = xYSeries15.getClass();
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.setKey((java.lang.Comparable) (byte) 0);
        boolean boolean4 = xYSeries1.getNotify();
        xYSeries1.add((java.lang.Number) (byte) 0, (java.lang.Number) 1L, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete(3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        int int8 = xYSeries3.getItemCount();
        boolean boolean9 = xYSeries3.getNotify();
        xYSeries3.setKey((java.lang.Comparable) 10);
        double[][] doubleArray12 = xYSeries3.toArray();
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries3.addOrUpdate((java.lang.Number) 10L, (java.lang.Number) 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem15);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        boolean boolean28 = xYSeries23.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries31 = xYSeries23.createCopy((int) (byte) 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNull(xYDataItem26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        org.jfree.data.xy.XYDataItem xYDataItem55 = xYSeries52.addOrUpdate((java.lang.Number) (-2), (java.lang.Number) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(xYSeries52);
        org.junit.Assert.assertNull(xYDataItem55);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = xYSeries1.getY(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        int int18 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 100 + "'", comparable15, (short) 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) 100.0f, (java.lang.Number) (-1.0d), true);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((double) (-1), (double) 100.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries1.removeChangeListener(seriesChangeListener9);
        org.junit.Assert.assertNull(xYDataItem8);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        xYSeries3.add((double) (-1.0f), (double) 0L, false);
        boolean boolean14 = xYSeries3.isEmpty();
        java.lang.Class<?> wildcardClass15 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        xYSeries3.add((double) 'a', (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries3.remove((java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.lang.Number number9 = xYSeries3.getY((int) (short) 0);
        double[][] doubleArray10 = xYSeries3.toArray();
        xYSeries3.add((double) 'a', (java.lang.Number) (-2), false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) (byte) 100, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + number9 + "' != '" + (-1.0d) + "'", number9, (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        java.lang.Comparable comparable20 = xYSeries3.getKey();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 0L + "'", comparable20, 0L);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray12 = xYSeries3.toArray();
        xYSeries3.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries3.add(1.0d, (java.lang.Number) 2);
        int int20 = xYSeries3.getItemCount();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        java.lang.String str29 = xYSeries3.getDescription();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        xYSeries3.setDescription("hi!");
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertNotNull(list46);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        int int10 = xYSeries3.getItemCount();
        boolean boolean11 = xYSeries3.isEmpty();
        int int12 = xYSeries3.getItemCount();
        boolean boolean13 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = xYSeries3.getY((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        org.jfree.data.xy.XYSeries xYSeries40 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem37, false, false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(xYDataItem37, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(xYDataItem37);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries3.remove((java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYDataItem31);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        boolean boolean40 = xYSeries3.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((double) 2, (java.lang.Number) 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
            xYSeries29.update((java.lang.Number) 10L, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        java.lang.Number number29 = xYSeries3.getX(0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + number29 + "' != '" + (byte) 0 + "'", number29, (byte) 0);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) 100, 3);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (short) 10);
        boolean boolean10 = xYSeries3.isEmpty();
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, true, false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        java.lang.Object obj25 = xYSeries3.clone();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(xYSeries22);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries6.setMaximumItemCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        java.lang.Class<?> wildcardClass59 = xYDataItem52.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(xYDataItem52);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        java.lang.Class<?> wildcardClass59 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.remove(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries27 = xYSeries3.createCopy(1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        org.jfree.data.xy.XYDataItem xYDataItem23 = xYSeries3.addOrUpdate((java.lang.Number) 1.0d, (java.lang.Number) (byte) 100);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNull(xYDataItem23);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        xYSeries3.add((java.lang.Number) (short) -1, (java.lang.Number) 0.0d);
        java.lang.Comparable comparable8 = xYSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.remove((java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10L + "'", comparable8, 10L);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        boolean boolean47 = xYSeries46.getAutoSort();
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem62 = xYSeries3.getDataItem((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + 0L + "'", comparable25, 0L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(xYDataItem51);
        org.junit.Assert.assertNotNull(xYSeries55);
        org.junit.Assert.assertNotNull(xYDataItem57);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        java.lang.Class<?> wildcardClass37 = xYDataItem30.getClass();
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        java.lang.String str17 = xYSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((double) 0.0f, (double) 100.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) 100.0f, (java.lang.Number) (-1.0d), true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries1.removePropertyChangeListener(propertyChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries1.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L);
        xYSeries1.add((double) (-1), (java.lang.Number) (short) 0);
        java.lang.Number number6 = null;
        xYSeries1.add((double) 10.0f, number6);
        java.lang.String str8 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        int int10 = xYSeries3.getItemCount();
        boolean boolean11 = xYSeries3.isEmpty();
        int int12 = xYSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 0.0d, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 0.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem20 = xYSeries3.remove((java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0L + "'", comparable15, 0L);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.add((double) (-1), (java.lang.Number) 10);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((java.lang.Number) (-1L), (java.lang.Number) 10.0f);
        java.lang.String str10 = xYSeries3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries13 = xYSeries3.createCopy(0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1, false);
        boolean boolean3 = xYSeries2.getAutoSort();
        int int4 = xYSeries2.getMaximumItemCount();
        java.lang.Object obj5 = xYSeries2.clone();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem29 = xYSeries3.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        xYSeries1.setMaximumItemCount(0);
        org.jfree.data.xy.XYSeries xYSeries7 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries7.add((double) 0.0f, 0.0d);
        xYSeries7.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean15 = xYSeries7.getAutoSort();
        org.jfree.data.xy.XYSeries xYSeries19 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        xYSeries19.removePropertyChangeListener(propertyChangeListener22);
        xYSeries19.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int29 = xYSeries19.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries33 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        xYSeries33.removePropertyChangeListener(propertyChangeListener34);
        java.util.List list36 = xYSeries33.getItems();
        xYSeries19.data = list36;
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        xYSeries41.removePropertyChangeListener(propertyChangeListener42);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        xYSeries41.removePropertyChangeListener(propertyChangeListener44);
        xYSeries41.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int51 = xYSeries41.indexOf((java.lang.Number) 0.0f);
        org.jfree.data.xy.XYSeries xYSeries55 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        xYSeries55.removePropertyChangeListener(propertyChangeListener56);
        java.util.List list58 = xYSeries55.getItems();
        xYSeries41.data = list58;
        xYSeries19.data = list58;
        xYSeries7.data = list58;
        java.util.List list62 = xYSeries7.data;
        xYSeries1.data = list62;
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(list62);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((-1.0d), (double) 10);
        java.util.List list10 = xYSeries3.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        xYSeries1.delete((int) (byte) -1, (-2));
        java.lang.String str5 = xYSeries1.getDescription();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        xYSeries3.setDescription("");
        java.lang.Comparable comparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setKey(comparable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.addChangeListener(seriesChangeListener6);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries1.removeChangeListener(seriesChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.updateByIndex((-2), (java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex((int) 'a', (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        xYSeries29.addChangeListener(seriesChangeListener33);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        int int7 = xYSeries3.indexOf((java.lang.Number) (short) 10);
        java.util.List list8 = xYSeries3.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
            org.jfree.data.xy.XYDataItem xYDataItem37 = xYSeries3.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add((java.lang.Number) 2, (java.lang.Number) 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        xYSeries1.setKey((java.lang.Comparable) 100.0d);
        xYSeries1.clear();
        xYSeries1.add((double) (byte) 0, 10.0d);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        boolean boolean19 = xYSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "", true);
        int int3 = xYSeries2.getMaximumItemCount();
        int int4 = xYSeries2.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        boolean boolean14 = xYSeries3.isEmpty();
        java.lang.String str15 = xYSeries3.getDescription();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.fireSeriesChanged();
        boolean boolean7 = xYSeries3.isEmpty();
        boolean boolean8 = xYSeries3.getAllowDuplicateXValues();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.addChangeListener(seriesChangeListener9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex(3, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        xYSeries3.setMaximumItemCount((int) 'a');
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 100 + "'", comparable15, (short) 100);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        int int91 = xYSeries3.getMaximumItemCount();
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(list86);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 2147483647 + "'", int91 == 2147483647);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
            org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries1.getDataItem((int) (byte) -1);
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
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        org.jfree.data.xy.XYSeries xYSeries4 = xYSeries1.createCopy((int) (short) 1, (int) 'a');
        boolean boolean5 = xYSeries1.getNotify();
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries3.remove((java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        java.lang.Object obj81 = xYSeries3.clone();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(xYSeries48);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(xYDataItem74);
        org.junit.Assert.assertNotNull(obj81);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "");
        java.lang.Object obj2 = xYSeries1.clone();
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 10, true);
        java.util.List list3 = xYSeries2.data;
        xYSeries2.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.updateByIndex((int) '#', (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        xYSeries29.removeChangeListener(seriesChangeListener30);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertNotNull(xYSeries29);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
            xYSeries14.updateByIndex((-2), (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYDataItem12);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        xYSeries3.setKey((java.lang.Comparable) 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(xYDataItem34);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries3.remove((java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(xYDataItem17);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        org.jfree.data.xy.XYSeries xYSeries49 = xYSeries23.createCopy(100, 1);
        xYSeries23.setDescription("hi!");
        int int52 = xYSeries23.getMaximumItemCount();
        boolean boolean53 = xYSeries3.equals((java.lang.Object) int52);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(xYDataItem45);
        org.junit.Assert.assertNotNull(xYSeries49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        boolean boolean33 = xYSeries29.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        xYSeries3.removeChangeListener(seriesChangeListener17);
        org.jfree.data.xy.XYSeries xYSeries22 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int24 = xYSeries22.indexOf((java.lang.Number) (byte) -1);
        int int26 = xYSeries22.indexOf((java.lang.Number) 0.0d);
        boolean boolean28 = xYSeries22.equals((java.lang.Object) 0.0d);
        boolean boolean29 = xYSeries3.equals((java.lang.Object) boolean28);
        org.jfree.data.xy.XYSeries xYSeries32 = xYSeries3.createCopy((int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(xYSeries32);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.setNotify(false);
        java.util.List list10 = xYSeries3.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = xYSeries3.getX(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 10);
        java.lang.Class<?> wildcardClass2 = xYSeries1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAutoSort();
        boolean boolean12 = xYSeries3.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem14 = xYSeries3.remove((java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        xYSeries1.add(xYDataItem55, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(xYDataItem24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(xYDataItem55);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true);
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries2.createCopy((int) 'a', (int) (byte) 1);
        java.lang.Object obj6 = xYSeries5.clone();
        xYSeries5.delete((int) (short) 100, (int) '#');
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) 10.0f, (double) (short) 1, true);
        boolean boolean11 = xYSeries3.getNotify();
        boolean boolean12 = xYSeries3.getAutoSort();
        boolean boolean13 = xYSeries3.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        boolean boolean34 = xYSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem79 = xYSeries1.remove((java.lang.Number) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -3 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        xYSeries3.removePropertyChangeListener(propertyChangeListener30);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        xYSeries29.clear();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries29.updateByIndex((int) (short) 100, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = xYSeries3.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Failed to clone.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        java.lang.Class<?> wildcardClass79 = xYSeries3.getClass();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(xYDataItem23);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(xYDataItem66);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries3.addOrUpdate((java.lang.Number) (-1), (java.lang.Number) (-1.0d));
        org.junit.Assert.assertNull(xYDataItem8);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        xYSeries29.addPropertyChangeListener(propertyChangeListener41);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        java.lang.Number number49 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries48.add(number49, (java.lang.Number) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        xYSeries3.add((double) (byte) 10, (java.lang.Number) (-1.0f), false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(xYSeries41);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (byte) -1);
        java.lang.String str17 = xYSeries3.getDescription();
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        xYSeries3.fireSeriesChanged();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem3 = xYSeries1.getDataItem((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        xYSeries3.add((double) '4', (java.lang.Number) (byte) 0, true);
        boolean boolean11 = xYSeries1.equals((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = xYSeries1.getY(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add((double) (-1L), (double) (byte) 1);
        xYSeries3.clear();
        boolean boolean16 = xYSeries3.getNotify();
        xYSeries3.add(100.0d, (double) 2);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex(2147483647, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        java.lang.Object obj23 = xYSeries3.clone();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + 0L + "'", comparable22, 0L);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        xYSeries3.setDescription("");
        boolean boolean13 = xYSeries3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        java.lang.Comparable comparable24 = xYSeries3.getKey();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + 0L + "'", comparable24, 0L);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.update((java.lang.Number) 3, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 3");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1.0d));
        xYSeries1.add((double) (short) 1, (java.lang.Number) (short) -1);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
            xYSeries3.updateByIndex((int) '#', (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 0L + "'", comparable15, 0L);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        java.util.List list8 = xYSeries3.getItems();
        xYSeries3.fireSeriesChanged();
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries1.add((double) 100.0f, (java.lang.Number) (-1.0d), true);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((double) (-1), (double) 100.0f);
        xYSeries1.add((double) (byte) 0, (double) 3, true);
        org.junit.Assert.assertNull(xYDataItem8);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        xYSeries38.fireSeriesChanged();
        xYSeries38.setNotify(false);
        org.jfree.data.xy.XYDataItem xYDataItem66 = xYSeries38.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.add(xYDataItem66);
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(xYDataItem60);
        org.junit.Assert.assertNotNull(xYDataItem66);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem27 = xYSeries1.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(xYDataItem23);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) 100, 3);
        int int7 = xYSeries6.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener8);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        int int7 = xYSeries3.indexOf((java.lang.Number) 0.0d);
        boolean boolean9 = xYSeries3.equals((java.lang.Object) 0.0d);
        xYSeries3.setDescription("");
        java.util.List list12 = xYSeries3.data;
        java.lang.Number number14 = null;
        org.jfree.data.xy.XYDataItem xYDataItem15 = xYSeries3.addOrUpdate((java.lang.Number) 100L, number14);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(xYDataItem15);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries6.removePropertyChangeListener(propertyChangeListener30);
        int int33 = xYSeries6.indexOf((java.lang.Number) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number35 = xYSeries6.getY((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false, false);
        int int4 = xYSeries3.getItemCount();
        java.util.List list5 = xYSeries3.getItems();
        java.lang.Comparable comparable6 = xYSeries3.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.removeChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem10 = xYSeries3.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10L + "'", comparable6, 10L);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        int int34 = xYSeries19.getItemCount();
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        int int9 = xYSeries3.indexOf((java.lang.Number) 10.0f);
        xYSeries3.add((java.lang.Number) 10, (java.lang.Number) (byte) 0, false);
        xYSeries3.delete((int) '4', (int) (byte) 0);
        xYSeries3.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries29.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
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
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries23 = xYSeries3.createCopy((int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        xYSeries22.removeChangeListener(seriesChangeListener25);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.add((double) 1, 100.0d, true);
        org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries1.addOrUpdate((double) (short) -1, (double) (short) 10);
        java.lang.Class<?> wildcardClass9 = xYSeries1.getClass();
        org.junit.Assert.assertNull(xYDataItem8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        double[][] doubleArray29 = xYSeries3.toArray();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(doubleArray29);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.add(10.0d, (java.lang.Number) 0.0d);
        java.lang.Comparable comparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setKey(comparable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
            org.jfree.data.xy.XYSeries xYSeries22 = xYSeries3.createCopy((int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = xYSeries3.getItems();
        xYSeries3.add((java.lang.Number) 0.0d, (java.lang.Number) (short) 0, false);
        boolean boolean11 = xYSeries3.getAllowDuplicateXValues();
        xYSeries3.update((java.lang.Number) 0, (java.lang.Number) (byte) -1);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        xYSeries1.setMaximumItemCount(0);
        xYSeries1.add((double) 4, (double) (-1L));
        double[][] doubleArray7 = xYSeries1.toArray();
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        boolean boolean26 = xYSeries3.getAutoSort();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = xYSeries3.getX((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        org.jfree.data.xy.XYSeries xYSeries17 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        xYSeries17.add((double) (byte) 10, (double) 0, false);
        org.jfree.data.xy.XYSeries xYSeries25 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener26);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        xYSeries25.removePropertyChangeListener(propertyChangeListener28);
        xYSeries25.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray34 = xYSeries25.toArray();
        xYSeries25.add((double) 1, (java.lang.Number) (short) 1, true);
        int int40 = xYSeries25.indexOf((java.lang.Number) 1.0d);
        org.jfree.data.xy.XYSeries xYSeries44 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries44.add((double) 0.0f, 0.0d);
        xYSeries44.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean52 = xYSeries44.getAllowDuplicateXValues();
        xYSeries44.add(10.0d, (java.lang.Number) 0.0d);
        org.jfree.data.xy.XYSeries xYSeries57 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        org.jfree.data.xy.XYSeries xYSeries61 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        org.jfree.data.xy.XYSeries xYSeries65 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        xYSeries65.removePropertyChangeListener(propertyChangeListener66);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        xYSeries65.removePropertyChangeListener(propertyChangeListener68);
        xYSeries65.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        int int75 = xYSeries65.indexOf((java.lang.Number) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener76 = null;
        xYSeries65.addPropertyChangeListener(propertyChangeListener76);
        xYSeries65.add((java.lang.Number) (-1), (java.lang.Number) (byte) -1, false);
        org.jfree.data.xy.XYDataItem xYDataItem83 = xYSeries65.remove(1);
        xYSeries61.add(xYDataItem83);
        xYSeries57.add(xYDataItem83, false);
        xYSeries44.setKey((java.lang.Comparable) xYDataItem83);
        org.jfree.data.xy.XYSeries xYSeries89 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem83, false);
        xYSeries25.add(xYDataItem83);
        org.jfree.data.xy.XYSeries xYSeries92 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) xYDataItem83, true);
        xYSeries17.add(xYDataItem83, false);
        xYSeries3.setKey((java.lang.Comparable) xYDataItem83);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(xYDataItem83);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        java.lang.Class<?> wildcardClass19 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + number13 + "' != '" + 1.0d + "'", number13, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        java.util.List list5 = xYSeries1.data;
        boolean boolean6 = xYSeries1.getAutoSort();
        int int7 = xYSeries1.getMaximumItemCount();
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        int int25 = xYSeries3.indexOf((java.lang.Number) (byte) 0);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, false);
        int int3 = xYSeries2.getItemCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 100.0d, false, true);
        org.jfree.data.xy.XYSeries xYSeries5 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        xYSeries5.add((double) 100.0f, (java.lang.Number) (-1.0d), true);
        java.util.List list10 = xYSeries5.data;
        xYSeries3.data = list10;
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        java.lang.Class<?> wildcardClass32 = xYSeries3.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        xYSeries1.add((double) (byte) 10, (double) 10L);
        xYSeries1.add((java.lang.Number) (short) -1, (java.lang.Number) 0.0f);
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) 100, false);
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries2.createCopy(0, (int) (byte) 0);
        double[][] doubleArray6 = xYSeries2.toArray();
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true);
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries2.createCopy((int) 'a', (int) (byte) 1);
        java.lang.Object obj6 = xYSeries5.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem8 = xYSeries5.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        java.lang.Object obj23 = xYSeries3.clone();
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "hi!", false, false);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries3.createCopy((int) (byte) -1, 1);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries6.addOrUpdate((java.lang.Number) (short) -1, (java.lang.Number) 0L);
        org.jfree.data.xy.XYSeries xYSeries11 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '#');
        java.lang.Comparable comparable12 = xYSeries11.getKey();
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
        xYSeries11.setKey((java.lang.Comparable) xYDataItem44);
        xYSeries6.add(xYDataItem44);
        org.junit.Assert.assertNotNull(xYSeries6);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + '#' + "'", comparable12, '#');
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertNotNull(xYSeries42);
        org.junit.Assert.assertNotNull(xYDataItem44);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        xYSeries1.add((double) (-5908509288197150436L), (java.lang.Number) (byte) 100, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem11 = xYSeries1.getDataItem(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((int) (byte) 0, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYDataItem31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        boolean boolean19 = xYSeries3.getAutoSort();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        org.jfree.data.xy.XYDataItem xYDataItem35 = xYSeries29.addOrUpdate((-1.0d), (double) 1L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem35);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        int int14 = xYSeries3.indexOf((java.lang.Number) 2);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2) + "'", int14 == (-2));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries(comparable0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
            java.lang.Number number61 = xYSeries3.getY(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
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
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        double[][] doubleArray26 = xYSeries3.toArray();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem22);
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        xYSeries29.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries29.updateByIndex((int) (short) -1, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        org.jfree.data.xy.XYSeries xYSeries34 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries34.add(0.0d, (double) (short) -1, true);
        java.lang.Number number40 = xYSeries34.getY((int) (short) 0);
        double[][] doubleArray41 = xYSeries34.toArray();
        boolean boolean42 = xYSeries28.equals((java.lang.Object) doubleArray41);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertEquals("'" + number40 + "' != '" + (-1.0d) + "'", number40, (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        org.jfree.data.xy.XYDataItem xYDataItem25 = xYSeries3.addOrUpdate((java.lang.Number) (-1.0d), (java.lang.Number) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(xYDataItem25);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries44.setMaximumItemCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertNotNull(xYSeries44);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        java.lang.String str6 = xYSeries3.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        xYSeries3.addChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) (short) -1, (java.lang.Number) 3);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add(0.0d, (double) (short) -1, true);
        int int9 = xYSeries3.indexOf((java.lang.Number) 10.0f);
        xYSeries3.add((java.lang.Number) 10, (java.lang.Number) (byte) 0, false);
        xYSeries3.delete((int) '4', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) (short) 100, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 100");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem26 = xYSeries3.addOrUpdate((double) 100L, (double) (-5908509288197150436L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        xYSeries3.add(0.0d, (java.lang.Number) 1.0d);
        java.lang.Object obj9 = xYSeries3.clone();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener12);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.lang.Object obj12 = xYSeries3.clone();
        java.lang.Comparable comparable13 = xYSeries3.getKey();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener14);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 0L + "'", comparable13, 0L);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        xYSeries3.fireSeriesChanged();
        org.jfree.data.xy.XYSeries xYSeries9 = xYSeries3.createCopy(10, (-1));
        boolean boolean10 = xYSeries3.getAutoSort();
        xYSeries3.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(xYSeries9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        int int47 = xYSeries3.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(xYDataItem42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        boolean boolean40 = xYSeries3.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem42 = xYSeries3.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(xYDataItem38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        xYSeries1.addChangeListener(seriesChangeListener6);
        xYSeries1.add((double) 0, (double) 1.0f, false);
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        xYSeries1.addChangeListener(seriesChangeListener36);
        xYSeries1.add((double) 100.0f, (double) (-2));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(xYDataItem27);
        org.junit.Assert.assertNotNull(xYSeries31);
        org.junit.Assert.assertNotNull(xYDataItem33);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        xYSeries1.setKey((java.lang.Comparable) 100.0d);
        java.lang.String str4 = xYSeries1.getDescription();
        boolean boolean5 = xYSeries1.getAllowDuplicateXValues();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries1.delete((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1));
        xYSeries1.clear();
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((double) (byte) 1, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem12 = xYSeries3.remove((int) (byte) 0);
        org.jfree.data.xy.XYSeries xYSeries15 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (byte) 0, false, false);
        xYSeries15.fireSeriesChanged();
        org.jfree.data.xy.XYDataItem xYDataItem19 = xYSeries15.addOrUpdate(0.0d, (double) 100.0f);
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 2);
        xYSeries1.setKey((java.lang.Comparable) 1.0f);
        org.jfree.data.xy.XYSeries xYSeries6 = xYSeries1.createCopy((int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(xYSeries6);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 3, false, false);
        org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries3.addOrUpdate((java.lang.Number) (-1.0f), (java.lang.Number) 2);
        org.junit.Assert.assertNull(xYDataItem6);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        xYSeries3.add((double) (short) 100, (java.lang.Number) (-1L), true);
        boolean boolean11 = xYSeries3.getAutoSort();
        boolean boolean12 = xYSeries3.getNotify();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        java.lang.Class<?> wildcardClass38 = list34.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem47 = xYSeries3.remove((java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(doubleArray45);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener12);
        java.util.List list14 = xYSeries3.getItems();
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number37 = xYSeries3.getY((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYDataItem31);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
            xYSeries3.add((double) 10.0f, (java.lang.Number) (short) -1, true);
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
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        java.lang.Number number30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem31 = xYSeries19.remove(number30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYDataItem12);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        xYSeries1.setMaximumItemCount(0);
        xYSeries1.add((double) 10, (double) (-1), true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = xYSeries1.getX((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener19);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
            xYSeries1.add((java.lang.Number) (-1), (java.lang.Number) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        int int33 = xYSeries32.getItemCount();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNotNull(xYSeries32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem21 = xYSeries3.getDataItem((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNull(xYDataItem19);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.add((double) 0.0f, 0.0d);
        org.jfree.data.xy.XYDataItem xYDataItem9 = xYSeries3.addOrUpdate((-1.0d), (double) 10);
        xYSeries3.setMaximumItemCount(2147483647);
        java.lang.Object obj12 = xYSeries3.clone();
        xYSeries3.setNotify(true);
        org.junit.Assert.assertNull(xYDataItem9);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        xYSeries29.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertNull(xYDataItem32);
        org.junit.Assert.assertNotNull(xYDataItem40);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        xYSeries3.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray22);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem45 = xYSeries29.remove((java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 2");
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        int int25 = xYSeries23.indexOf((java.lang.Number) 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(xYDataItem21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        xYSeries2.addChangeListener(seriesChangeListener3);
        int int5 = xYSeries2.getMaximumItemCount();
        java.lang.Comparable comparable6 = xYSeries2.getKey();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + '4' + "'", comparable6, '4');
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
            xYSeries3.updateByIndex(3, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYDataItem31);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem18 = xYSeries3.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) (-1.0f), (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = -1.0");
        } catch (org.jfree.data.general.SeriesException e) {
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (-1L), false, true);
        int int5 = xYSeries3.indexOf((java.lang.Number) (byte) -1);
        int int7 = xYSeries3.indexOf((java.lang.Number) 0.0d);
        boolean boolean9 = xYSeries3.equals((java.lang.Object) 0.0d);
        xYSeries3.setDescription("");
        java.util.List list12 = xYSeries3.data;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        xYSeries3.removeChangeListener(seriesChangeListener13);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        boolean boolean41 = xYSeries3.getNotify();
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.updateByIndex(100, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries18);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(xYDataItem44);
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) "", true);
        boolean boolean3 = xYSeries2.getAutoSort();
        xYSeries2.add((double) (byte) 10, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10L, false);
        java.lang.Number number3 = null;
        // The following exception was thrown during execution in test generation
        try {
            xYSeries2.add(number3, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'x' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener81 = null;
        xYSeries3.removeChangeListener(seriesChangeListener81);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(xYDataItem23);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(xYDataItem66);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = xYSeries3.getY((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.data.xy.XYSeries xYSeries2 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) '4', true);
        org.jfree.data.xy.XYSeries xYSeries5 = xYSeries2.createCopy((int) 'a', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries5.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(xYSeries5);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        xYSeries3.addChangeListener(seriesChangeListener12);
        boolean boolean14 = xYSeries3.isEmpty();
        xYSeries3.add((double) (-1), (double) (-2));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setKey((java.lang.Comparable) (short) 100);
        int int10 = xYSeries3.getItemCount();
        boolean boolean11 = xYSeries3.isEmpty();
        int int12 = xYSeries3.getItemCount();
        java.util.List list13 = xYSeries3.getItems();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        xYSeries3.delete((int) 'a', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete(4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 4 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        org.jfree.data.xy.XYSeries xYSeries29 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        xYSeries29.removePropertyChangeListener(propertyChangeListener30);
        org.jfree.data.xy.XYSeries xYSeries35 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener36);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        xYSeries35.removePropertyChangeListener(propertyChangeListener38);
        xYSeries35.add((java.lang.Number) (byte) 0, (java.lang.Number) (byte) 10, false);
        double[][] doubleArray44 = xYSeries35.toArray();
        xYSeries35.add((double) 1, (java.lang.Number) (short) 1, true);
        xYSeries35.setKey((java.lang.Comparable) 10.0f);
        org.jfree.data.xy.XYDataItem xYDataItem52 = xYSeries35.remove((int) (short) 1);
        xYSeries29.add(xYDataItem52);
        xYSeries3.add(xYDataItem52, true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 0L + "'", comparable13, 0L);
        org.junit.Assert.assertNotNull(xYSeries20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertNotNull(xYDataItem52);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10);
        xYSeries1.add(0.0d, (java.lang.Number) 0.0d, false);
        org.jfree.data.xy.XYDataItem xYDataItem7 = xYSeries1.remove((int) (byte) 0);
        boolean boolean8 = xYSeries1.getAllowDuplicateXValues();
        org.junit.Assert.assertNotNull(xYDataItem7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem24 = xYSeries3.remove((java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        org.jfree.data.xy.XYSeries xYSeries30 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        xYSeries30.removePropertyChangeListener(propertyChangeListener33);
        int int35 = xYSeries30.getItemCount();
        boolean boolean36 = xYSeries30.getNotify();
        int int38 = xYSeries30.indexOf((java.lang.Number) 0.0f);
        xYSeries30.add((double) (byte) 100, (java.lang.Number) (short) -1);
        xYSeries30.add(100.0d, (java.lang.Number) (short) 100, false);
        boolean boolean46 = xYSeries3.equals((java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 10L, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 10");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = xYSeries1.getY(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 3 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
            org.jfree.data.xy.XYDataItem xYDataItem32 = xYSeries6.remove((java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        org.jfree.data.xy.XYSeries xYSeries92 = xYSeries52.createCopy(2147483647, (int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(xYSeries52);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(xYDataItem84);
        org.junit.Assert.assertNotNull(xYSeries92);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = xYSeries3.getX((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 0L + "'", comparable12, 0L);
        org.junit.Assert.assertEquals("'" + number14 + "' != '" + (byte) 0 + "'", number14, (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2) + "'", int20 == (-2));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        xYSeries3.removePropertyChangeListener(propertyChangeListener6);
        xYSeries3.setNotify(true);
        org.jfree.data.xy.XYSeries xYSeries13 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        boolean boolean14 = xYSeries3.equals((java.lang.Object) false);
        xYSeries3.add((double) (byte) 10, (double) (byte) 10, true);
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.delete((int) (byte) 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.setDescription("");
        xYSeries3.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        xYSeries3.removeChangeListener(seriesChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        xYSeries3.addPropertyChangeListener(propertyChangeListener10);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) (short) -1);
        org.jfree.data.xy.XYDataItem xYDataItem4 = xYSeries1.addOrUpdate((java.lang.Number) 0, (java.lang.Number) 10.0f);
        boolean boolean5 = xYSeries1.isEmpty();
        xYSeries1.setNotify(true);
        java.util.List list8 = xYSeries1.data;
        org.junit.Assert.assertNull(xYDataItem4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        xYSeries3.setNotify(true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, true, false);
        xYSeries3.add((double) (byte) 0, (java.lang.Number) 100.0f);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        xYSeries3.add((double) (short) 1, (java.lang.Number) 2, false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(xYDataItem25);
        org.junit.Assert.assertNotNull(xYSeries29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 10.0d, true, true);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 1);
        xYSeries1.delete((int) (byte) -1, (-2));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.xy.XYDataItem xYDataItem6 = xYSeries1.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        org.jfree.data.xy.XYSeries xYSeries41 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) true, false);
        org.junit.Assert.assertNotNull(xYSeries4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(xYDataItem30);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.data.xy.XYSeries xYSeries3 = new org.jfree.data.xy.XYSeries((java.lang.Comparable) 0L, true, true);
        xYSeries3.setDescription("hi!");
        xYSeries3.setMaximumItemCount(100);
        xYSeries3.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        xYSeries3.removeChangeListener(seriesChangeListener9);
        xYSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            xYSeries3.update((java.lang.Number) 1.0d, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.general.SeriesException; message: No observation for x = 1.0");
        } catch (org.jfree.data.general.SeriesException e) {
            // Expected exception.
        }
    }
}

