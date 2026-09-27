package org.jfree.data.time;

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
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener2);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 0);
        timePeriodValues1.setDescription("");
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod4, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        timePeriodValues1.setDomainDescription("Time");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setNotify(true);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10, "Time", "Time");
        int int11 = timePeriodValues10.getMinEndIndex();
        boolean boolean12 = timePeriodValues1.equals((java.lang.Object) timePeriodValues10);
        int int13 = timePeriodValues10.getMinMiddleIndex();
        int int14 = timePeriodValues10.getItemCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        timePeriodValues1.delete(1, (int) (byte) 0);
        int int15 = timePeriodValues1.getMinEndIndex();
        int int16 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (byte) -1, 1);
        java.lang.String str12 = timePeriodValues1.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener13);
        java.lang.Object obj15 = timePeriodValues1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timePeriodValues1.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues1.createCopy(10, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue8 = timePeriodValues1.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues6);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.lang.Object obj8 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) 'a', (int) 'a');
        int int12 = timePeriodValues11.getMinEndIndex();
        java.lang.String str13 = timePeriodValues11.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues15.setDescription("");
        java.lang.Comparable comparable18 = timePeriodValues15.getKey();
        timePeriodValues15.delete((int) ' ', 0);
        java.lang.Object obj22 = timePeriodValues15.clone();
        timePeriodValues15.setRangeDescription("Value");
        boolean boolean25 = timePeriodValues11.equals((java.lang.Object) timePeriodValues15);
        java.lang.String str26 = timePeriodValues15.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = timePeriodValues15.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 1 + "'", comparable18, 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.lang.Object obj3 = timePeriodValues1.clone();
        int int4 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues1.createCopy((int) (byte) 0, (int) 'a');
        boolean boolean8 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMinEndIndex();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setRangeDescription("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Time", "Time");
        java.lang.Comparable comparable4 = timePeriodValues3.getKey();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "hi!" + "'", comparable4, "hi!");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Time", "hi!");
        timePeriodValues3.setNotify(false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener2);
        timePeriodValues1.setRangeDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setDescription("hi!");
        int int12 = timePeriodValues1.getMinStartIndex();
        java.lang.Class<?> wildcardClass13 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (byte) 1, (int) (short) 10);
        timePeriodValues11.delete((int) '#', (int) ' ');
        java.lang.String str15 = timePeriodValues11.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues11.addPropertyChangeListener(propertyChangeListener16);
        org.jfree.data.time.TimePeriod timePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues11.add(timePeriod18, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        int int6 = timePeriodValues1.getMaxStartIndex();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriod timePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod8, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1), "Time", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        boolean boolean5 = timePeriodValues3.isEmpty();
        int int6 = timePeriodValues3.getItemCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.delete((int) ' ', 0);
        java.lang.Object obj8 = timePeriodValues1.clone();
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod11, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean5 = timePeriodValues1.isEmpty();
        java.lang.String str6 = timePeriodValues1.getRangeDescription();
        boolean boolean7 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriod timePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod8, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        timePeriodValues8.setNotify(false);
        int int11 = timePeriodValues8.getMaxMiddleIndex();
        timePeriodValues8.fireSeriesChanged();
        java.lang.Object obj13 = timePeriodValues8.clone();
        org.jfree.data.time.TimePeriod timePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues8.add(timePeriod14, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        int int7 = timePeriodValues1.getItemCount();
        timePeriodValues1.setKey((java.lang.Comparable) false);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy((int) (byte) -1, (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues12.addChangeListener(seriesChangeListener13);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues12);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        timePeriodValues1.setKey((java.lang.Comparable) (-2210593619794989709L));
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1), "Time", "hi!");
        timePeriodValues3.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener5);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        int int6 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy(0, (int) (short) -1);
        int int10 = timePeriodValues9.getMaxEndIndex();
        int int11 = timePeriodValues9.getMinStartIndex();
        timePeriodValues9.setDomainDescription("hi!");
        int int14 = timePeriodValues9.getMaxStartIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1 + "'", comparable6, 1);
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        java.lang.Object obj9 = null;
        boolean boolean10 = timePeriodValues1.equals(obj9);
        java.lang.String str11 = timePeriodValues1.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener12);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener16);
        org.jfree.data.time.TimePeriodValue timePeriodValue18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        java.lang.Object obj7 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        int int12 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener13);
        org.jfree.data.time.TimePeriodValue timePeriodValue15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        boolean boolean12 = timePeriodValues1.isEmpty();
        timePeriodValues1.setDomainDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener15);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimePeriodValue timePeriodValue19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        int int5 = timePeriodValues1.getMinStartIndex();
        int int6 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        int int7 = timePeriodValues1.getItemCount();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setDomainDescription("Time");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getItemCount();
        boolean boolean3 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int6 = timePeriodValues5.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues8.setDescription("");
        java.lang.Comparable comparable11 = timePeriodValues8.getKey();
        int int12 = timePeriodValues8.getItemCount();
        java.lang.Comparable comparable13 = timePeriodValues8.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues8.createCopy(0, (int) (short) -1);
        boolean boolean17 = timePeriodValues5.equals((java.lang.Object) (short) -1);
        timePeriodValues5.setKey((java.lang.Comparable) 10);
        org.jfree.data.time.TimePeriodValues timePeriodValues22 = timePeriodValues5.createCopy((int) (byte) 100, (int) (short) 10);
        org.jfree.data.time.TimePeriodValues timePeriodValues25 = timePeriodValues22.createCopy(1, (-1));
        boolean boolean26 = timePeriodValues1.equals((java.lang.Object) timePeriodValues22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 1 + "'", comparable11, 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 1 + "'", comparable13, 1);
        org.junit.Assert.assertNotNull(timePeriodValues16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(timePeriodValues22);
        org.junit.Assert.assertNotNull(timePeriodValues25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        java.lang.Object obj10 = timePeriodValues1.clone();
        boolean boolean11 = timePeriodValues1.getNotify();
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ', "Time", "hi!");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener4);
        timePeriodValues3.setDomainDescription("hi!");
        timePeriodValues3.setRangeDescription("");
        int int10 = timePeriodValues3.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int13 = timePeriodValues12.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues12.createCopy((int) 'a', (int) (short) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues19 = timePeriodValues16.createCopy((int) '#', (int) (short) 0);
        int int20 = timePeriodValues16.getMaxMiddleIndex();
        boolean boolean21 = timePeriodValues3.equals((java.lang.Object) timePeriodValues16);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues16);
        org.junit.Assert.assertNotNull(timePeriodValues19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy((int) '4', 1);
        java.lang.String str13 = timePeriodValues12.getDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues15.setDescription("");
        java.lang.Comparable comparable18 = timePeriodValues15.getKey();
        timePeriodValues15.setDomainDescription("hi!");
        timePeriodValues15.setNotify(true);
        java.lang.Object obj23 = timePeriodValues15.clone();
        boolean boolean24 = timePeriodValues12.equals((java.lang.Object) timePeriodValues15);
        timePeriodValues15.setRangeDescription("Value");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 1 + "'", comparable18, 1);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener3);
        int int5 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.setRangeDescription("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int8 = timePeriodValues7.getMinEndIndex();
        timePeriodValues7.setNotify(false);
        int int11 = timePeriodValues7.getMaxMiddleIndex();
        boolean boolean12 = timePeriodValues1.equals((java.lang.Object) int11);
        timePeriodValues1.setDomainDescription("hi!");
        java.lang.String str15 = timePeriodValues1.getDescription();
        java.lang.String str16 = timePeriodValues1.getDomainDescription();
        boolean boolean17 = timePeriodValues1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = timePeriodValues1.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        int int10 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        java.lang.Object obj11 = timePeriodValues1.clone();
        timePeriodValues1.setNotify(false);
        java.lang.String str14 = timePeriodValues1.getDescription();
        int int15 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy((int) '4', 1);
        java.lang.String str13 = timePeriodValues12.getDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues15.setDescription("");
        java.lang.Comparable comparable18 = timePeriodValues15.getKey();
        timePeriodValues15.setDomainDescription("hi!");
        timePeriodValues15.setNotify(true);
        java.lang.Object obj23 = timePeriodValues15.clone();
        boolean boolean24 = timePeriodValues12.equals((java.lang.Object) timePeriodValues15);
        boolean boolean25 = timePeriodValues12.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 1 + "'", comparable18, 1);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener3);
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDescription("Time");
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        int int11 = timePeriodValues10.getMinMiddleIndex();
        java.lang.String str12 = timePeriodValues10.getDomainDescription();
        int int13 = timePeriodValues10.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int16 = timePeriodValues15.getMinEndIndex();
        timePeriodValues15.setKey((java.lang.Comparable) 100L);
        timePeriodValues15.setRangeDescription("Time");
        timePeriodValues15.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues24 = timePeriodValues15.createCopy((int) (short) 1, 0);
        int int25 = timePeriodValues24.getMinMiddleIndex();
        int int26 = timePeriodValues24.getMaxEndIndex();
        java.lang.Comparable comparable27 = timePeriodValues24.getKey();
        int int28 = timePeriodValues24.getMinMiddleIndex();
        timePeriodValues24.setRangeDescription("Value");
        int int31 = timePeriodValues24.getItemCount();
        timePeriodValues24.setDescription("hi!");
        java.lang.Object obj34 = timePeriodValues24.clone();
        boolean boolean35 = timePeriodValues10.equals(obj34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + 100L + "'", comparable27, 100L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 10, "Value", "Time");
        int int4 = timePeriodValues3.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener7);
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setNotify(true);
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.delete((int) (byte) 100, (int) (short) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues19 = timePeriodValues1.createCopy((int) (byte) 10, 100);
        java.lang.String str20 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setNotify(false);
        boolean boolean12 = timePeriodValues1.isEmpty();
        timePeriodValues1.setRangeDescription("");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 100, "Time", "");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.delete((int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        timePeriodValues1.delete((int) (byte) 100, (int) '#');
        int int11 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("Time");
        int int14 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timePeriodValues1.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 100L + "'", comparable6, 100L);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.fireSeriesChanged();
        boolean boolean11 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod12, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setNotify(true);
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timePeriodValues1.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        int int11 = timePeriodValues10.getMinMiddleIndex();
        java.lang.String str12 = timePeriodValues10.getRangeDescription();
        timePeriodValues10.setRangeDescription("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int8 = timePeriodValues7.getMinEndIndex();
        timePeriodValues7.setNotify(false);
        int int11 = timePeriodValues7.getMaxMiddleIndex();
        boolean boolean12 = timePeriodValues1.equals((java.lang.Object) int11);
        timePeriodValues1.setDomainDescription("hi!");
        java.lang.String str15 = timePeriodValues1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener16);
        java.lang.String str18 = timePeriodValues1.getDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues20 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues20.setRangeDescription("Time");
        boolean boolean23 = timePeriodValues20.isEmpty();
        timePeriodValues20.setNotify(true);
        int int26 = timePeriodValues20.getMaxStartIndex();
        java.lang.Comparable comparable27 = timePeriodValues20.getKey();
        java.lang.String str28 = timePeriodValues20.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timePeriodValues20.removeChangeListener(seriesChangeListener29);
        boolean boolean31 = timePeriodValues1.equals((java.lang.Object) seriesChangeListener29);
        java.lang.Object obj32 = timePeriodValues1.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + 1 + "'", comparable27, 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Time" + "'", str28, "Time");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 1, "", "");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues3.createCopy((int) 'a', (int) (byte) 10);
        timePeriodValues7.setKey((java.lang.Comparable) 100L);
        java.lang.String str10 = timePeriodValues7.getDomainDescription();
        int int11 = timePeriodValues7.getMaxStartIndex();
        boolean boolean12 = timePeriodValues7.getNotify();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        int int6 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int9 = timePeriodValues1.getMaxStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1L), "Time", "Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod5 = timePeriodValues3.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        boolean boolean6 = timePeriodValues3.equals((java.lang.Object) 1.0d);
        boolean boolean7 = timePeriodValues3.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues3.createCopy((int) (byte) 10, (int) 'a');
        boolean boolean11 = timePeriodValues10.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues10.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues10.createCopy((int) (byte) 100, (int) (byte) 10);
        java.lang.Comparable comparable17 = timePeriodValues10.getKey();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timePeriodValues10.addPropertyChangeListener(propertyChangeListener18);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timePeriodValues16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 1.0d + "'", comparable17, 1.0d);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.delete((int) (short) 100, (int) '#');
        boolean boolean12 = timePeriodValues1.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        java.lang.String str11 = timePeriodValues10.getDomainDescription();
        int int12 = timePeriodValues10.getMaxEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues10.addChangeListener(seriesChangeListener13);
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = timePeriodValues10.createCopy((int) '4', 0);
        java.lang.Class<?> wildcardClass18 = timePeriodValues17.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        boolean boolean8 = timePeriodValues1.getNotify();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener11);
        timePeriodValues1.setDomainDescription("Time");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.lang.Object obj3 = timePeriodValues1.clone();
        java.lang.String str4 = timePeriodValues1.getDescription();
        timePeriodValues1.setKey((java.lang.Comparable) 0.0f);
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.delete((int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        java.lang.Comparable comparable7 = timePeriodValues1.getKey();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener7);
        java.lang.Object obj9 = timePeriodValues1.clone();
        int int10 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues12.setDescription("");
        java.lang.Comparable comparable15 = timePeriodValues12.getKey();
        java.lang.Object obj16 = timePeriodValues12.clone();
        boolean boolean17 = timePeriodValues1.equals((java.lang.Object) timePeriodValues12);
        org.jfree.data.time.TimePeriodValue timePeriodValue18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 1 + "'", comparable15, 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean5 = timePeriodValues1.isEmpty();
        java.lang.String str6 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setRangeDescription("hi!");
        int int9 = timePeriodValues1.getMaxStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        boolean boolean8 = timePeriodValues1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        int int12 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.fireSeriesChanged();
        boolean boolean11 = timePeriodValues1.getNotify();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        java.lang.Object obj10 = timePeriodValues1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener13);
        timePeriodValues1.setRangeDescription("");
        timePeriodValues1.setDomainDescription("");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-2210593619794989709L), "Time", "");
        timePeriodValues3.setDomainDescription("");
        int int6 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues3.createCopy((int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timePeriodValues3.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("hi!");
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setRangeDescription("Value");
        int int12 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.setKey((java.lang.Comparable) (-1L));
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        timePeriodValues1.setNotify(true);
        java.lang.Object obj8 = timePeriodValues1.clone();
        timePeriodValues1.setRangeDescription("");
        int int11 = timePeriodValues1.getMaxEndIndex();
        int int12 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean5 = timePeriodValues1.isEmpty();
        java.lang.String str6 = timePeriodValues1.getRangeDescription();
        boolean boolean7 = timePeriodValues1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timePeriodValues1.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        boolean boolean7 = timePeriodValues1.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1 + "'", comparable6, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        java.lang.Object obj10 = timePeriodValues1.clone();
        boolean boolean11 = timePeriodValues1.getNotify();
        timePeriodValues1.delete((int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        java.lang.String str11 = timePeriodValues10.getDomainDescription();
        int int12 = timePeriodValues10.getMaxEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues10.addChangeListener(seriesChangeListener13);
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = timePeriodValues10.createCopy((int) '4', 0);
        timePeriodValues17.setNotify(false);
        timePeriodValues17.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues17);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setDomainDescription("hi!");
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 0L);
        timePeriodValues1.setNotify(false);
        int int15 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        timePeriodValues1.setNotify(true);
        java.lang.Object obj8 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int13 = timePeriodValues12.getMinEndIndex();
        timePeriodValues12.setKey((java.lang.Comparable) 100L);
        timePeriodValues12.setRangeDescription("Time");
        timePeriodValues12.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues21 = timePeriodValues12.createCopy((int) (short) 1, 0);
        java.lang.String str22 = timePeriodValues21.getDomainDescription();
        int int23 = timePeriodValues21.getMaxEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        timePeriodValues21.addChangeListener(seriesChangeListener24);
        org.jfree.data.time.TimePeriodValues timePeriodValues28 = timePeriodValues21.createCopy((int) '4', 0);
        boolean boolean29 = timePeriodValues1.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("hi!");
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        int int10 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10.0f, "hi!", "");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener4);
        int int6 = timePeriodValues3.getItemCount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        java.lang.String str11 = timePeriodValues10.getDomainDescription();
        int int12 = timePeriodValues10.getMaxEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues10.addChangeListener(seriesChangeListener13);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timePeriodValues10.removeChangeListener(seriesChangeListener15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue18 = timePeriodValues10.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int13 = timePeriodValues1.getMinMiddleIndex();
        int int14 = timePeriodValues1.getItemCount();
        int int15 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.lang.Object obj8 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) 'a', (int) 'a');
        int int12 = timePeriodValues11.getMinEndIndex();
        java.lang.String str13 = timePeriodValues11.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues15.setDescription("");
        java.lang.Comparable comparable18 = timePeriodValues15.getKey();
        timePeriodValues15.delete((int) ' ', 0);
        java.lang.Object obj22 = timePeriodValues15.clone();
        timePeriodValues15.setRangeDescription("Value");
        boolean boolean25 = timePeriodValues11.equals((java.lang.Object) timePeriodValues15);
        int int26 = timePeriodValues11.getMinMiddleIndex();
        java.lang.Comparable comparable27 = timePeriodValues11.getKey();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 1 + "'", comparable18, 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + 100L + "'", comparable27, 100L);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setNotify(false);
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener3);
        int int5 = timePeriodValues1.getMinMiddleIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues8.setDescription("");
        java.lang.Comparable comparable11 = timePeriodValues8.getKey();
        java.lang.Object obj12 = timePeriodValues8.clone();
        int int13 = timePeriodValues8.getMinStartIndex();
        int int14 = timePeriodValues8.getMinMiddleIndex();
        int int15 = timePeriodValues8.getMaxMiddleIndex();
        timePeriodValues8.setDescription("Value");
        int int18 = timePeriodValues8.getMinMiddleIndex();
        int int19 = timePeriodValues8.getMaxStartIndex();
        boolean boolean20 = timePeriodValues1.equals((java.lang.Object) timePeriodValues8);
        int int21 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 1 + "'", comparable11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.fireSeriesChanged();
        int int11 = timePeriodValues1.getMinStartIndex();
        boolean boolean12 = timePeriodValues1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timePeriodValues1.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.lang.Object obj8 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) 'a', (int) 'a');
        int int12 = timePeriodValues11.getMinEndIndex();
        java.lang.String str13 = timePeriodValues11.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues15.setDescription("");
        java.lang.Comparable comparable18 = timePeriodValues15.getKey();
        timePeriodValues15.delete((int) ' ', 0);
        java.lang.Object obj22 = timePeriodValues15.clone();
        timePeriodValues15.setRangeDescription("Value");
        boolean boolean25 = timePeriodValues11.equals((java.lang.Object) timePeriodValues15);
        int int26 = timePeriodValues11.getMinMiddleIndex();
        int int27 = timePeriodValues11.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = timePeriodValues11.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 1 + "'", comparable18, 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        int int10 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Class<?> wildcardClass11 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 100L + "'", comparable6, 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues8.removeChangeListener(seriesChangeListener9);
        java.lang.String str11 = timePeriodValues8.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) 'a', (int) (short) -1);
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setDescription("");
        timePeriodValues1.setDescription("Value");
        timePeriodValues1.setDescription("hi!");
        org.jfree.data.time.TimePeriodValue timePeriodValue20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        java.lang.Comparable comparable11 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener12);
        timePeriodValues1.setDomainDescription("hi!");
        timePeriodValues1.setDomainDescription("");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 1 + "'", comparable11, 1);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        int int3 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues1.createCopy((int) (short) 100, 100);
        int int7 = timePeriodValues6.getMaxEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues6.removePropertyChangeListener(propertyChangeListener8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1));
        timePeriodValues1.delete((int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timePeriodValues1.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        timePeriodValues1.delete(1, (int) (byte) 0);
        int int15 = timePeriodValues1.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener16);
        org.jfree.data.time.TimePeriodValue timePeriodValue18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        boolean boolean9 = timePeriodValues1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener10);
        boolean boolean12 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 100L + "'", comparable8, 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.String str4 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int7 = timePeriodValues6.getMinEndIndex();
        timePeriodValues6.setKey((java.lang.Comparable) 100L);
        timePeriodValues6.setRangeDescription("Time");
        timePeriodValues6.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues6.createCopy((int) (short) 1, 0);
        int int16 = timePeriodValues6.getItemCount();
        java.lang.Object obj17 = timePeriodValues6.clone();
        boolean boolean18 = timePeriodValues1.equals(obj17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        int int7 = timePeriodValues1.getItemCount();
        timePeriodValues1.setKey((java.lang.Comparable) false);
        java.lang.Object obj10 = timePeriodValues1.clone();
        boolean boolean11 = timePeriodValues1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue13 = timePeriodValues1.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        int int3 = timePeriodValues1.getItemCount();
        timePeriodValues1.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        java.lang.Object obj10 = timePeriodValues1.clone();
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.delete((int) 'a', (int) (byte) 1);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener15);
        timePeriodValues1.setDescription("hi!");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Value", "Time");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        int int10 = timePeriodValues1.getItemCount();
        timePeriodValues1.delete((int) ' ', 0);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setKey((java.lang.Comparable) 0L);
        java.lang.String str14 = timePeriodValues1.getDescription();
        java.lang.String str15 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setNotify(false);
        boolean boolean18 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10, "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = timePeriodValues3.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues(comparable0, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        timePeriodValues1.setNotify(true);
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues9.setDescription("");
        java.lang.Comparable comparable12 = timePeriodValues9.getKey();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues9.addPropertyChangeListener(propertyChangeListener13);
        int int15 = timePeriodValues9.getMaxStartIndex();
        boolean boolean16 = timePeriodValues9.getNotify();
        boolean boolean17 = timePeriodValues9.getNotify();
        int int18 = timePeriodValues9.getMinStartIndex();
        int int19 = timePeriodValues9.getMaxEndIndex();
        boolean boolean20 = timePeriodValues1.equals((java.lang.Object) timePeriodValues9);
        timePeriodValues9.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 1 + "'", comparable12, 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy((int) (short) 100, (int) (short) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        int int12 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setRangeDescription("Value");
        int int15 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDescription("Value");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        java.lang.Object obj10 = timePeriodValues1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        boolean boolean13 = timePeriodValues1.getNotify();
        timePeriodValues1.setDescription("Value");
        int int16 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setKey((java.lang.Comparable) (byte) -1);
        timePeriodValues1.setKey((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getItemCount();
        boolean boolean3 = timePeriodValues1.isEmpty();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) true);
        timePeriodValues1.setDescription("Value");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "Time", "Time", "");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener4);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d));
        timePeriodValues1.setRangeDescription("");
        java.lang.Object obj4 = timePeriodValues1.clone();
        timePeriodValues1.setDomainDescription("Time");
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) true, "", "Value");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        boolean boolean8 = timePeriodValues1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 1, "", "");
        int int14 = timePeriodValues13.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = timePeriodValues13.createCopy((int) 'a', (int) (byte) 10);
        timePeriodValues17.setKey((java.lang.Comparable) 100L);
        java.lang.String str20 = timePeriodValues17.getDomainDescription();
        boolean boolean21 = timePeriodValues1.equals((java.lang.Object) str20);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener2);
        timePeriodValues1.setRangeDescription("Value");
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        timePeriodValues1.setNotify(true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        int int8 = timePeriodValues1.getMaxEndIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue10 = timePeriodValues1.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 100L + "'", comparable6, 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        int int5 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        int int8 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        boolean boolean10 = timePeriodValues1.isEmpty();
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        java.lang.String str10 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues12.setDescription("");
        java.lang.Comparable comparable15 = timePeriodValues12.getKey();
        int int16 = timePeriodValues12.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timePeriodValues12.removeChangeListener(seriesChangeListener17);
        timePeriodValues12.setDomainDescription("");
        java.lang.Object obj21 = timePeriodValues12.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timePeriodValues12.addChangeListener(seriesChangeListener22);
        int int24 = timePeriodValues12.getMaxMiddleIndex();
        int int25 = timePeriodValues12.getMaxEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timePeriodValues12.addPropertyChangeListener(propertyChangeListener26);
        boolean boolean28 = timePeriodValues1.equals((java.lang.Object) propertyChangeListener26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 1 + "'", comparable15, 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues4.setDescription("");
        java.lang.Comparable comparable7 = timePeriodValues4.getKey();
        int int8 = timePeriodValues4.getItemCount();
        java.lang.Comparable comparable9 = timePeriodValues4.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues4.createCopy(0, (int) (short) -1);
        boolean boolean13 = timePeriodValues1.equals((java.lang.Object) (short) -1);
        timePeriodValues1.setKey((java.lang.Comparable) 10);
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues1.createCopy((int) (byte) 100, (int) (short) 10);
        org.jfree.data.time.TimePeriodValues timePeriodValues21 = timePeriodValues18.createCopy(1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues21.delete((int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 1 + "'", comparable9, 1);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timePeriodValues18);
        org.junit.Assert.assertNotNull(timePeriodValues21);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDomainDescription("");
        int int13 = timePeriodValues1.getMaxEndIndex();
        int int14 = timePeriodValues1.getMinMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timePeriodValues1.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int13 = timePeriodValues12.getMinEndIndex();
        timePeriodValues12.setKey((java.lang.Comparable) 100L);
        int int16 = timePeriodValues12.getMinEndIndex();
        java.lang.String str17 = timePeriodValues12.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timePeriodValues12.removePropertyChangeListener(propertyChangeListener18);
        boolean boolean20 = timePeriodValues1.equals((java.lang.Object) propertyChangeListener18);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete(1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = timePeriodValues3.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy((int) '4', (int) (short) -1);
        int int10 = timePeriodValues9.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue12 = timePeriodValues9.getDataItem((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        java.lang.Object obj9 = null;
        boolean boolean10 = timePeriodValues1.equals(obj9);
        boolean boolean12 = timePeriodValues1.equals((java.lang.Object) 0);
        timePeriodValues1.setKey((java.lang.Comparable) 10L);
        timePeriodValues1.setDescription("");
        int int17 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        java.lang.Object obj7 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        int int10 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener11);
        timePeriodValues1.setDomainDescription("hi!");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "hi!", "");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        timePeriodValues1.setDomainDescription("Value");
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str13 = timePeriodValues1.getRangeDescription();
        java.lang.Object obj14 = timePeriodValues1.clone();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        java.lang.Object obj7 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        int int12 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener13);
        int int15 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        int int9 = timePeriodValues1.getMinEndIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        int int12 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy(0, (int) (short) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        java.lang.Class<?> wildcardClass13 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1 + "'", comparable6, 1);
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int13 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setKey((java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timePeriodValues1.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        java.lang.String str10 = timePeriodValues1.getDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener7);
        boolean boolean10 = timePeriodValues1.equals((java.lang.Object) false);
        int int11 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setNotify(false);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        timePeriodValues1.setDomainDescription("Time");
        java.lang.Comparable comparable9 = timePeriodValues1.getKey();
        int int10 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 1 + "'", comparable9, 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int8 = timePeriodValues7.getMinEndIndex();
        timePeriodValues7.setNotify(false);
        int int11 = timePeriodValues7.getMaxMiddleIndex();
        boolean boolean12 = timePeriodValues1.equals((java.lang.Object) int11);
        timePeriodValues1.setDomainDescription("hi!");
        java.lang.String str15 = timePeriodValues1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener16);
        java.lang.String str18 = timePeriodValues1.getDescription();
        int int19 = timePeriodValues1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = timePeriodValues1.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        java.lang.Comparable comparable11 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue15 = timePeriodValues1.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 1 + "'", comparable11, 1);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int13 = timePeriodValues1.getMinStartIndex();
        int int14 = timePeriodValues1.getMaxStartIndex();
        int int15 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int18 = timePeriodValues17.getMinEndIndex();
        timePeriodValues17.setKey((java.lang.Comparable) 100L);
        int int21 = timePeriodValues17.getMaxStartIndex();
        java.lang.Comparable comparable22 = timePeriodValues17.getKey();
        timePeriodValues17.fireSeriesChanged();
        int int24 = timePeriodValues17.getMaxEndIndex();
        boolean boolean25 = timePeriodValues1.equals((java.lang.Object) timePeriodValues17);
        int int26 = timePeriodValues1.getMinStartIndex();
        int int27 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + 100L + "'", comparable22, 100L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener2);
        int int4 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener5);
        timePeriodValues1.setKey((java.lang.Comparable) 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) -1, "Time", "Value");
        timePeriodValues3.setNotify(false);
        int int6 = timePeriodValues3.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        int int12 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        boolean boolean12 = timePeriodValues1.isEmpty();
        timePeriodValues1.setDomainDescription("Value");
        boolean boolean15 = timePeriodValues1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod17 = timePeriodValues1.getTimePeriod((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean5 = timePeriodValues1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        boolean boolean8 = timePeriodValues1.getNotify();
        int int9 = timePeriodValues1.getMinEndIndex();
        java.lang.Comparable comparable10 = timePeriodValues1.getKey();
        int int11 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 1 + "'", comparable10, 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        java.lang.Class<?> wildcardClass7 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) -1);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (byte) 1, (int) (short) 10);
        int int12 = timePeriodValues1.getMaxMiddleIndex();
        int int13 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener14);
        org.jfree.data.time.TimePeriodValue timePeriodValue16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timePeriodValues1.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("");
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        int int9 = timePeriodValues1.getMinMiddleIndex();
        int int10 = timePeriodValues1.getMinEndIndex();
        int int11 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int16 = timePeriodValues15.getMinEndIndex();
        timePeriodValues15.setKey((java.lang.Comparable) 100L);
        timePeriodValues15.setRangeDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues22 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int23 = timePeriodValues22.getMinEndIndex();
        timePeriodValues22.setNotify(false);
        int int26 = timePeriodValues22.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues28 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int29 = timePeriodValues28.getMinEndIndex();
        timePeriodValues28.setNotify(false);
        int int32 = timePeriodValues28.getMaxMiddleIndex();
        boolean boolean33 = timePeriodValues22.equals((java.lang.Object) int32);
        timePeriodValues22.setDomainDescription("hi!");
        boolean boolean36 = timePeriodValues15.equals((java.lang.Object) "hi!");
        java.lang.String str37 = timePeriodValues15.getDomainDescription();
        int int38 = timePeriodValues15.getMinMiddleIndex();
        boolean boolean39 = timePeriodValues1.equals((java.lang.Object) timePeriodValues15);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues15.delete((int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Time" + "'", str37, "Time");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        java.lang.String str2 = timePeriodValues1.getDomainDescription();
        java.lang.Comparable comparable3 = timePeriodValues1.getKey();
        int int4 = timePeriodValues1.getItemCount();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 1 + "'", comparable3, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = timePeriodValues1.createCopy((int) 'a', (int) (short) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues5.createCopy((int) '#', (int) (short) 0);
        int int9 = timePeriodValues5.getMaxMiddleIndex();
        timePeriodValues5.setDomainDescription("Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues5);
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "Value", "Time", "");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener4);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!");
        int int6 = timePeriodValues5.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues8.setDescription("");
        java.lang.Comparable comparable11 = timePeriodValues8.getKey();
        java.lang.Object obj12 = timePeriodValues8.clone();
        int int13 = timePeriodValues8.getMinStartIndex();
        int int14 = timePeriodValues8.getMinMiddleIndex();
        timePeriodValues8.setNotify(true);
        timePeriodValues8.setDescription("Value");
        boolean boolean19 = timePeriodValues5.equals((java.lang.Object) "Value");
        java.lang.Object obj20 = timePeriodValues5.clone();
        boolean boolean21 = timePeriodValues1.equals(obj20);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod23 = timePeriodValues1.getTimePeriod((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 1 + "'", comparable11, 1);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        int int7 = timePeriodValues1.getItemCount();
        int int8 = timePeriodValues1.getMinStartIndex();
        java.lang.String str9 = timePeriodValues1.getDescription();
        int int10 = timePeriodValues1.getMinStartIndex();
        int int11 = timePeriodValues1.getMaxStartIndex();
        int int12 = timePeriodValues1.getMaxStartIndex();
        int int13 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        java.lang.String str11 = timePeriodValues10.getDomainDescription();
        int int12 = timePeriodValues10.getMaxMiddleIndex();
        boolean boolean13 = timePeriodValues10.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.setDomainDescription("Time");
        java.lang.Comparable comparable10 = timePeriodValues1.getKey();
        int int11 = timePeriodValues1.getItemCount();
        timePeriodValues1.delete((int) '4', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 1 + "'", comparable10, 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        int int11 = timePeriodValues1.getItemCount();
        int int12 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues1.createCopy((int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        java.lang.String str10 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setRangeDescription("Time");
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue16 = timePeriodValues1.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        boolean boolean12 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 'a');
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = timePeriodValues1.createCopy(0, (int) (short) 10);
        org.jfree.data.time.TimePeriod timePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod18, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timePeriodValues17);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        java.lang.String str5 = timePeriodValues1.getRangeDescription();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("Value");
        int int9 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int8 = timePeriodValues7.getMinEndIndex();
        timePeriodValues7.setNotify(false);
        int int11 = timePeriodValues7.getMaxMiddleIndex();
        boolean boolean12 = timePeriodValues1.equals((java.lang.Object) int11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener13);
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues1.createCopy((-1), (int) (short) 0);
        timePeriodValues6.setDescription("Value");
        org.junit.Assert.assertNotNull(timePeriodValues6);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        timePeriodValues1.setRangeDescription("Value");
        int int8 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        timePeriodValues1.setKey((java.lang.Comparable) (short) 0);
        timePeriodValues1.setNotify(true);
        int int12 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setDomainDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy(1, (int) 'a');
        int int12 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues1.createCopy(0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue17 = timePeriodValues1.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod9 = timePeriodValues1.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        org.jfree.data.time.TimePeriod timePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod7, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener7);
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setNotify(true);
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.delete((int) (byte) 100, (int) (short) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues19 = timePeriodValues1.createCopy((int) (byte) 10, 100);
        java.lang.Comparable comparable20 = timePeriodValues1.getKey();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues19);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 1 + "'", comparable20, 1);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy((int) (short) 100, (int) (short) 0);
        java.lang.String str10 = timePeriodValues1.getDescription();
        java.lang.Object obj11 = timePeriodValues1.clone();
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setDescription("Time");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener7);
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setNotify(true);
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.delete((int) (byte) 100, (int) (short) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues19 = timePeriodValues1.createCopy((int) (byte) 10, 100);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timePeriodValues19.addPropertyChangeListener(propertyChangeListener20);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues19);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int9 = timePeriodValues8.getMinEndIndex();
        timePeriodValues8.setNotify(false);
        int int12 = timePeriodValues8.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int15 = timePeriodValues14.getMinEndIndex();
        timePeriodValues14.setNotify(false);
        int int18 = timePeriodValues14.getMaxMiddleIndex();
        boolean boolean19 = timePeriodValues8.equals((java.lang.Object) int18);
        timePeriodValues8.setDomainDescription("hi!");
        boolean boolean22 = timePeriodValues1.equals((java.lang.Object) "hi!");
        java.lang.String str23 = timePeriodValues1.getRangeDescription();
        java.lang.String str24 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Time" + "'", str23, "Time");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Time" + "'", str24, "Time");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.setDomainDescription("Time");
        java.lang.Comparable comparable10 = timePeriodValues1.getKey();
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Object obj12 = timePeriodValues1.clone();
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 1 + "'", comparable10, 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1), "Time", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        java.lang.String str5 = timePeriodValues3.getDescription();
        int int6 = timePeriodValues3.getItemCount();
        int int7 = timePeriodValues3.getMinStartIndex();
        java.lang.Class<?> wildcardClass8 = timePeriodValues3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        int int9 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 100L + "'", comparable12, 100L);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "Value");
        boolean boolean4 = timePeriodValues3.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues3.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues3.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int8 = timePeriodValues1.getMinEndIndex();
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        timePeriodValues1.setDescription("Value");
        int int9 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("Time");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        timePeriodValues1.setNotify(true);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues10.setDescription("");
        java.lang.Comparable comparable13 = timePeriodValues10.getKey();
        int int14 = timePeriodValues10.getMinMiddleIndex();
        timePeriodValues10.setDomainDescription("hi!");
        int int17 = timePeriodValues10.getItemCount();
        boolean boolean18 = timePeriodValues1.equals((java.lang.Object) int17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = timePeriodValues1.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 1 + "'", comparable13, 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        boolean boolean2 = timePeriodValues1.getNotify();
        java.lang.Comparable comparable3 = timePeriodValues1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod5 = timePeriodValues1.getTimePeriod((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 1 + "'", comparable3, 1);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        timePeriodValues8.setKey((java.lang.Comparable) (-2210593619794989709L));
        java.lang.String str11 = timePeriodValues8.getDomainDescription();
        boolean boolean12 = timePeriodValues8.getNotify();
        org.jfree.data.time.TimePeriod timePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues8.add(timePeriod13, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy((int) '4', 1);
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener14);
        java.lang.Object obj16 = timePeriodValues1.clone();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDomainDescription("Value");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean5 = timePeriodValues1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        boolean boolean8 = timePeriodValues1.getNotify();
        int int9 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setDomainDescription("");
        int int12 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod13 = timePeriodValues1.getTimePeriod((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener7);
        java.lang.Object obj9 = timePeriodValues1.clone();
        int int10 = timePeriodValues1.getMinStartIndex();
        boolean boolean11 = timePeriodValues1.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue9 = timePeriodValues1.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        int int11 = timePeriodValues10.getMinMiddleIndex();
        boolean boolean12 = timePeriodValues10.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod14 = timePeriodValues10.getTimePeriod((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMinEndIndex();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy(10, 100);
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues10);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        java.lang.Object obj9 = null;
        boolean boolean10 = timePeriodValues1.equals(obj9);
        timePeriodValues1.setDescription("");
        timePeriodValues1.setNotify(true);
        int int15 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues1.createCopy((int) (short) 0, (int) (short) 1);
        org.jfree.data.time.TimePeriodValues timePeriodValues20 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues20.setDescription("");
        java.lang.String str23 = timePeriodValues20.getDomainDescription();
        boolean boolean24 = timePeriodValues18.equals((java.lang.Object) timePeriodValues20);
        org.jfree.data.time.TimePeriod timePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues20.add(timePeriod25, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Time" + "'", str23, "Time");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0f, "Time", "hi!");
        int int4 = timePeriodValues3.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        timePeriodValues1.setNotify(true);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues10.setDescription("");
        java.lang.Comparable comparable13 = timePeriodValues10.getKey();
        int int14 = timePeriodValues10.getMinMiddleIndex();
        timePeriodValues10.setDomainDescription("hi!");
        int int17 = timePeriodValues10.getItemCount();
        boolean boolean18 = timePeriodValues1.equals((java.lang.Object) int17);
        boolean boolean19 = timePeriodValues1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 1 + "'", comparable13, 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "");
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod4, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        boolean boolean6 = timePeriodValues3.equals((java.lang.Object) 1.0d);
        boolean boolean7 = timePeriodValues3.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues3.createCopy((int) (byte) 10, (int) 'a');
        java.lang.String str11 = timePeriodValues3.getDomainDescription();
        timePeriodValues3.setRangeDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timePeriodValues3.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener8);
        timePeriodValues1.setKey((java.lang.Comparable) 10);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener11);
        int int13 = timePeriodValues1.getMinStartIndex();
        java.lang.String str14 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Time" + "'", str14, "Time");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        boolean boolean6 = timePeriodValues3.equals((java.lang.Object) 1.0d);
        boolean boolean7 = timePeriodValues3.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues3.createCopy((int) (byte) 10, (int) 'a');
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues3.createCopy((int) (byte) 10, (int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues3.addChangeListener(seriesChangeListener14);
        org.jfree.data.time.TimePeriod timePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod16, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertNotNull(timePeriodValues13);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        boolean boolean6 = timePeriodValues3.equals((java.lang.Object) 1.0d);
        boolean boolean7 = timePeriodValues3.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues3.createCopy((int) (byte) 10, (int) 'a');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues10.addChangeListener(seriesChangeListener11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues10);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        timePeriodValues8.setKey((java.lang.Comparable) (-2210593619794989709L));
        int int11 = timePeriodValues8.getMaxStartIndex();
        int int12 = timePeriodValues8.getMinMiddleIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setDomainDescription("hi!");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDomainDescription("");
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        int int10 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.delete((int) ' ', 0);
        java.lang.Object obj8 = timePeriodValues1.clone();
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.setNotify(false);
        java.lang.String str13 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        int int12 = timePeriodValues1.getItemCount();
        int int13 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues1.createCopy((int) '4', (int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timePeriodValues16.removePropertyChangeListener(propertyChangeListener17);
        int int19 = timePeriodValues16.getMinStartIndex();
        int int20 = timePeriodValues16.getMaxMiddleIndex();
        timePeriodValues16.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener7);
        timePeriodValues1.setRangeDescription("Value");
        boolean boolean11 = timePeriodValues1.getNotify();
        boolean boolean13 = timePeriodValues1.equals((java.lang.Object) 1);
        boolean boolean14 = timePeriodValues1.isEmpty();
        timePeriodValues1.setKey((java.lang.Comparable) '4');
        java.lang.Class<?> wildcardClass17 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (byte) 1, (int) (short) 10);
        timePeriodValues11.delete((int) '#', (int) ' ');
        timePeriodValues11.fireSeriesChanged();
        boolean boolean16 = timePeriodValues11.getNotify();
        java.lang.Object obj17 = timePeriodValues11.clone();
        java.lang.Comparable comparable18 = timePeriodValues11.getKey();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 1 + "'", comparable18, 1);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ', "Time", "hi!");
        int int4 = timePeriodValues3.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMinEndIndex();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener8);
        timePeriodValues1.setRangeDescription("hi!");
        int int12 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) 'a', (int) (short) -1);
        int int12 = timePeriodValues11.getMaxStartIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100, "Time", "Value");
        java.lang.String str4 = timePeriodValues3.getDescription();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        java.lang.Class<?> wildcardClass8 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener10);
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.String str4 = timePeriodValues1.getDomainDescription();
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        boolean boolean8 = timePeriodValues1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        java.lang.Number number12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod11, number12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        timePeriodValues8.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues8.removePropertyChangeListener(propertyChangeListener11);
        int int13 = timePeriodValues8.getMinStartIndex();
        int int14 = timePeriodValues8.getMinMiddleIndex();
        timePeriodValues8.setNotify(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        timePeriodValues8.setNotify(false);
        int int11 = timePeriodValues8.getMaxMiddleIndex();
        java.lang.String str12 = timePeriodValues8.getDomainDescription();
        int int13 = timePeriodValues8.getMaxEndIndex();
        int int14 = timePeriodValues8.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setNotify(true);
        java.lang.String str10 = timePeriodValues1.getRangeDescription();
        java.lang.String str11 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ', "Time", "hi!");
        int int4 = timePeriodValues3.getMaxStartIndex();
        java.lang.Comparable comparable5 = timePeriodValues3.getKey();
        java.lang.Comparable comparable6 = timePeriodValues3.getKey();
        java.lang.String str7 = timePeriodValues3.getDescription();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + ' ' + "'", comparable5, ' ');
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        java.lang.Object obj9 = null;
        boolean boolean10 = timePeriodValues1.equals(obj9);
        timePeriodValues1.setDescription("");
        timePeriodValues1.setNotify(true);
        int int15 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues1.createCopy((int) (short) 0, (int) (short) 1);
        timePeriodValues1.setDomainDescription("Value");
        timePeriodValues1.setDomainDescription("");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues18);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        java.lang.Class<?> wildcardClass10 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.fireSeriesChanged();
        int int4 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues6.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues6.removePropertyChangeListener(propertyChangeListener9);
        int int11 = timePeriodValues6.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues6.removePropertyChangeListener(propertyChangeListener12);
        boolean boolean14 = timePeriodValues1.equals((java.lang.Object) timePeriodValues6);
        org.jfree.data.time.TimePeriodValue timePeriodValue15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues4.setDescription("");
        java.lang.Comparable comparable7 = timePeriodValues4.getKey();
        int int8 = timePeriodValues4.getItemCount();
        java.lang.Comparable comparable9 = timePeriodValues4.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues4.createCopy(0, (int) (short) -1);
        boolean boolean13 = timePeriodValues1.equals((java.lang.Object) (short) -1);
        timePeriodValues1.setDomainDescription("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 1 + "'", comparable9, 1);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!");
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener2);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener4);
        timePeriodValues1.fireSeriesChanged();
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDescription("Value");
        java.lang.String str14 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMinEndIndex();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        int int9 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean13 = timePeriodValues1.getNotify();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener2);
        timePeriodValues1.setRangeDescription("Value");
        int int6 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener7);
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod9, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        timePeriodValues1.delete((int) (byte) 100, (int) '#');
        java.lang.Comparable comparable11 = timePeriodValues1.getKey();
        timePeriodValues1.setNotify(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 100L + "'", comparable11, 100L);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("");
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        int int9 = timePeriodValues1.getMinMiddleIndex();
        int int10 = timePeriodValues1.getMinEndIndex();
        boolean boolean11 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod15 = timePeriodValues1.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100.0d, "Time", "");
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod4, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        java.lang.Object obj9 = null;
        boolean boolean10 = timePeriodValues1.equals(obj9);
        timePeriodValues1.setDescription("");
        timePeriodValues1.setNotify(true);
        int int15 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues1.createCopy((int) (short) 0, (int) (short) 1);
        org.jfree.data.time.TimePeriodValues timePeriodValues20 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues20.setDescription("");
        java.lang.String str23 = timePeriodValues20.getDomainDescription();
        boolean boolean24 = timePeriodValues18.equals((java.lang.Object) timePeriodValues20);
        timePeriodValues20.delete((int) (byte) 100, (int) (short) 0);
        int int28 = timePeriodValues20.getMinStartIndex();
        java.lang.Comparable comparable29 = timePeriodValues20.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = timePeriodValues20.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Time" + "'", str23, "Time");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + 1 + "'", comparable29, 1);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        boolean boolean12 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timePeriodValues1.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        java.lang.String str6 = timePeriodValues1.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) 'a', (int) (short) 10);
        timePeriodValues1.setDescription("hi!");
        int int14 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        timePeriodValues1.setNotify(true);
        boolean boolean8 = timePeriodValues1.getNotify();
        int int9 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy((int) '#', 1);
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues12.createCopy((int) 'a', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timePeriodValues12.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNotNull(timePeriodValues15);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues1.createCopy(10, 0);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues6.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        java.lang.String str11 = timePeriodValues10.getDomainDescription();
        java.lang.Comparable comparable12 = timePeriodValues10.getKey();
        int int13 = timePeriodValues10.getMaxEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues10.addChangeListener(seriesChangeListener14);
        boolean boolean16 = timePeriodValues6.equals((java.lang.Object) seriesChangeListener14);
        org.jfree.data.time.TimePeriodValue timePeriodValue17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues6.add(timePeriodValue17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 1 + "'", comparable12, 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        java.lang.Object obj9 = null;
        boolean boolean10 = timePeriodValues1.equals(obj9);
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable11 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        int int13 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setRangeDescription("Value");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 1 + "'", comparable11, 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        java.lang.Object obj10 = timePeriodValues1.clone();
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        boolean boolean13 = timePeriodValues1.equals((java.lang.Object) (-1.0d));
        java.lang.String str14 = timePeriodValues1.getDomainDescription();
        java.lang.String str15 = timePeriodValues1.getDescription();
        java.lang.Object obj16 = timePeriodValues1.clone();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        java.lang.Object obj10 = timePeriodValues1.clone();
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        boolean boolean13 = timePeriodValues1.equals((java.lang.Object) (-1.0d));
        java.lang.String str14 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setRangeDescription("Time");
        java.lang.String str17 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setDescription("Time");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        boolean boolean4 = timePeriodValues1.getNotify();
        int int5 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        int int8 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update(100, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 1, "", "");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues3.createCopy((int) 'a', (int) (byte) 10);
        timePeriodValues7.setKey((java.lang.Comparable) 100L);
        int int10 = timePeriodValues7.getMinMiddleIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10, "Value", "");
        boolean boolean4 = timePeriodValues3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0f);
        timePeriodValues1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue4 = timePeriodValues1.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        java.lang.String str11 = timePeriodValues10.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = timePeriodValues10.createCopy(1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues14);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setDescription("hi!");
        int int12 = timePeriodValues1.getMaxMiddleIndex();
        int int13 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(true);
        java.lang.Class<?> wildcardClass16 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.Object obj4 = timePeriodValues1.clone();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = timePeriodValues1.createCopy((int) 'a', (int) (short) 100);
        java.lang.Object obj6 = timePeriodValues1.clone();
        timePeriodValues1.setKey((java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValue timePeriodValue8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean5 = timePeriodValues1.isEmpty();
        timePeriodValues1.fireSeriesChanged();
        boolean boolean7 = timePeriodValues1.getNotify();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues10.setDescription("");
        java.lang.Comparable comparable13 = timePeriodValues10.getKey();
        int int14 = timePeriodValues10.getItemCount();
        timePeriodValues10.fireSeriesChanged();
        java.lang.Object obj16 = timePeriodValues10.clone();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timePeriodValues10.addPropertyChangeListener(propertyChangeListener17);
        boolean boolean19 = timePeriodValues1.equals((java.lang.Object) timePeriodValues10);
        java.lang.String str20 = timePeriodValues1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = timePeriodValues1.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 1 + "'", comparable13, 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0f);
        java.lang.String str2 = timePeriodValues1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = timePeriodValues1.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues8.removeChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues8.getMaxEndIndex();
        int int12 = timePeriodValues8.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int17 = timePeriodValues16.getMaxMiddleIndex();
        boolean boolean19 = timePeriodValues16.equals((java.lang.Object) 1.0d);
        boolean boolean20 = timePeriodValues16.getNotify();
        timePeriodValues16.setKey((java.lang.Comparable) 100.0f);
        int int23 = timePeriodValues16.getItemCount();
        int int24 = timePeriodValues16.getMaxEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timePeriodValues16.removePropertyChangeListener(propertyChangeListener25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timePeriodValues16.removeChangeListener(seriesChangeListener27);
        boolean boolean29 = timePeriodValues8.equals((java.lang.Object) seriesChangeListener27);
        timePeriodValues8.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.setDomainDescription("Time");
        java.lang.Comparable comparable10 = timePeriodValues1.getKey();
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues13.setRangeDescription("Time");
        boolean boolean16 = timePeriodValues13.isEmpty();
        timePeriodValues13.setNotify(true);
        int int19 = timePeriodValues13.getMaxStartIndex();
        java.lang.Comparable comparable20 = timePeriodValues13.getKey();
        java.lang.String str21 = timePeriodValues13.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timePeriodValues13.removeChangeListener(seriesChangeListener22);
        java.lang.Object obj24 = timePeriodValues13.clone();
        timePeriodValues13.fireSeriesChanged();
        boolean boolean26 = timePeriodValues1.equals((java.lang.Object) timePeriodValues13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue28 = timePeriodValues13.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 1 + "'", comparable10, 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 1 + "'", comparable20, 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Time" + "'", str21, "Time");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setKey((java.lang.Comparable) 100);
        boolean boolean9 = timePeriodValues1.isEmpty();
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setRangeDescription("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.fireSeriesChanged();
        java.lang.String str4 = timePeriodValues1.getRangeDescription();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1.0d), "", "Value");
        boolean boolean4 = timePeriodValues3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue6 = timePeriodValues3.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("hi!");
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        int int10 = timePeriodValues1.getItemCount();
        timePeriodValues1.setKey((java.lang.Comparable) (-1));
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("");
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        int int9 = timePeriodValues1.getMinMiddleIndex();
        int int10 = timePeriodValues1.getMinEndIndex();
        int int11 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener12);
        int int14 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMaxStartIndex();
        java.lang.Class<?> wildcardClass10 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDescription("");
        timePeriodValues1.delete((int) (byte) 100, (int) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener14);
        java.lang.String str16 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Time", "hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues5.setDescription("");
        java.lang.Comparable comparable8 = timePeriodValues5.getKey();
        int int9 = timePeriodValues5.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues5.removeChangeListener(seriesChangeListener10);
        java.lang.String str12 = timePeriodValues5.getDomainDescription();
        timePeriodValues5.fireSeriesChanged();
        java.lang.String str14 = timePeriodValues5.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timePeriodValues5.removeChangeListener(seriesChangeListener15);
        boolean boolean17 = timePeriodValues3.equals((java.lang.Object) timePeriodValues5);
        org.jfree.data.time.TimePeriodValues timePeriodValues19 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues19.setDescription("");
        java.lang.Comparable comparable22 = timePeriodValues19.getKey();
        java.lang.Object obj23 = timePeriodValues19.clone();
        int int24 = timePeriodValues19.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timePeriodValues19.addChangeListener(seriesChangeListener25);
        timePeriodValues19.fireSeriesChanged();
        timePeriodValues19.setNotify(true);
        timePeriodValues19.setRangeDescription("Value");
        timePeriodValues19.delete((int) (byte) 100, (int) (short) 0);
        org.jfree.data.time.TimePeriodValues timePeriodValues37 = timePeriodValues19.createCopy((int) (byte) 10, 100);
        boolean boolean38 = timePeriodValues3.equals((java.lang.Object) (byte) 10);
        java.lang.Comparable comparable39 = timePeriodValues3.getKey();
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + 1 + "'", comparable22, 1);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + comparable39 + "' != '" + "hi!" + "'", comparable39, "hi!");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        int int6 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int8 = timePeriodValues1.getMinEndIndex();
        int int9 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str10 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMinEndIndex();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        int int8 = timePeriodValues1.getMaxStartIndex();
        int int9 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 0.0f, "", "Value");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        timePeriodValues1.setDomainDescription("Value");
        org.jfree.data.time.TimePeriod timePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod14, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.String str4 = timePeriodValues1.getDomainDescription();
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        boolean boolean8 = timePeriodValues1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue12 = timePeriodValues1.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("hi!");
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod10, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ', "Time", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues3.createCopy((int) ' ', (int) (short) 100);
        java.lang.String str8 = timePeriodValues3.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        int int8 = timePeriodValues1.getMaxStartIndex();
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMaxEndIndex();
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 100L + "'", comparable6, 100L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ', "Time", "hi!");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener4);
        timePeriodValues3.setDomainDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues3.createCopy((int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue12 = timePeriodValues10.getDataItem((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues10);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str3 = timePeriodValues1.getDescription();
        java.lang.String str4 = timePeriodValues1.getRangeDescription();
        int int5 = timePeriodValues1.getItemCount();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        boolean boolean7 = timePeriodValues1.getNotify();
        int int8 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1 + "'", comparable6, 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        int int6 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 0.0d);
        int int9 = timePeriodValues1.getMinEndIndex();
        int int10 = timePeriodValues1.getMinMiddleIndex();
        int int11 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = timePeriodValues1.createCopy((int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues14);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setDomainDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy(1, (int) 'a');
        int int12 = timePeriodValues1.getMaxStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timePeriodValues1.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        timePeriodValues1.setNotify(true);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener10);
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setDescription("Value");
        int int15 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMinEndIndex();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        boolean boolean10 = timePeriodValues1.getNotify();
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues4.setDescription("");
        java.lang.Comparable comparable7 = timePeriodValues4.getKey();
        int int8 = timePeriodValues4.getItemCount();
        java.lang.Comparable comparable9 = timePeriodValues4.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues4.createCopy(0, (int) (short) -1);
        boolean boolean13 = timePeriodValues1.equals((java.lang.Object) (short) -1);
        timePeriodValues1.setKey((java.lang.Comparable) 10);
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues1.createCopy((int) (byte) 100, (int) (short) 10);
        org.jfree.data.time.TimePeriodValues timePeriodValues21 = timePeriodValues18.createCopy(1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = timePeriodValues21.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 1 + "'", comparable9, 1);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timePeriodValues18);
        org.junit.Assert.assertNotNull(timePeriodValues21);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        int int11 = timePeriodValues10.getMinMiddleIndex();
        int int12 = timePeriodValues10.getMaxEndIndex();
        java.lang.Comparable comparable13 = timePeriodValues10.getKey();
        int int14 = timePeriodValues10.getMinMiddleIndex();
        java.lang.Object obj15 = timePeriodValues10.clone();
        int int16 = timePeriodValues10.getMinMiddleIndex();
        java.lang.String str17 = timePeriodValues10.getRangeDescription();
        int int18 = timePeriodValues10.getMinMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues10.add(timePeriod19, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 100L + "'", comparable13, 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.delete((int) ' ', 0);
        java.lang.Object obj8 = timePeriodValues1.clone();
        timePeriodValues1.setRangeDescription("Value");
        java.lang.Object obj11 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues13.setDescription("");
        java.lang.Comparable comparable16 = timePeriodValues13.getKey();
        int int17 = timePeriodValues13.getItemCount();
        boolean boolean18 = timePeriodValues13.getNotify();
        boolean boolean19 = timePeriodValues13.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timePeriodValues13.addPropertyChangeListener(propertyChangeListener20);
        org.jfree.data.time.TimePeriodValues timePeriodValues24 = timePeriodValues13.createCopy((int) (short) 100, (-1));
        java.lang.Object obj25 = timePeriodValues24.clone();
        boolean boolean26 = timePeriodValues24.getNotify();
        boolean boolean27 = timePeriodValues1.equals((java.lang.Object) boolean26);
        int int28 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 1 + "'", comparable16, 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timePeriodValues24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        java.lang.Object obj9 = null;
        boolean boolean10 = timePeriodValues1.equals(obj9);
        timePeriodValues1.setDescription("");
        timePeriodValues1.setNotify(true);
        int int15 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues1.createCopy((int) (short) 0, (int) (short) 1);
        org.jfree.data.time.TimePeriodValues timePeriodValues20 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues20.setDescription("");
        java.lang.String str23 = timePeriodValues20.getDomainDescription();
        boolean boolean24 = timePeriodValues18.equals((java.lang.Object) timePeriodValues20);
        timePeriodValues20.delete((int) (byte) 100, (int) (short) 0);
        int int28 = timePeriodValues20.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timePeriodValues20.addPropertyChangeListener(propertyChangeListener29);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Time" + "'", str23, "Time");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        timePeriodValues1.fireSeriesChanged();
        int int9 = timePeriodValues1.getMinMiddleIndex();
        int int10 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1, "Value", "");
        java.lang.Object obj4 = null;
        boolean boolean5 = timePeriodValues3.equals(obj4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener6);
        int int8 = timePeriodValues3.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int8 = timePeriodValues1.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        timePeriodValues1.setDescription("hi!");
        int int13 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener14);
        int int16 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.String str17 = timePeriodValues1.getDescription();
        int int18 = timePeriodValues1.getMaxMiddleIndex();
        int int19 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        int int6 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 0.0d);
        int int9 = timePeriodValues1.getMinEndIndex();
        int int10 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimePeriod timePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod13, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-2210593619794989709L), "Time", "hi!");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        int int10 = timePeriodValues1.getItemCount();
        java.lang.String str11 = timePeriodValues1.getDomainDescription();
        int int12 = timePeriodValues1.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int8 = timePeriodValues1.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        timePeriodValues1.setDescription("hi!");
        java.lang.String str13 = timePeriodValues1.getDescription();
        java.lang.String str14 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Time" + "'", str14, "Time");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        int int11 = timePeriodValues10.getMinMiddleIndex();
        int int12 = timePeriodValues10.getMaxEndIndex();
        java.lang.Comparable comparable13 = timePeriodValues10.getKey();
        int int14 = timePeriodValues10.getMinMiddleIndex();
        timePeriodValues10.setRangeDescription("Value");
        int int17 = timePeriodValues10.getItemCount();
        timePeriodValues10.setDescription("hi!");
        int int20 = timePeriodValues10.getMinMiddleIndex();
        timePeriodValues10.setNotify(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 100L + "'", comparable13, 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        int int7 = timePeriodValues1.getItemCount();
        int int8 = timePeriodValues1.getMinStartIndex();
        int int9 = timePeriodValues1.getItemCount();
        timePeriodValues1.setDescription("Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener2);
        timePeriodValues1.setRangeDescription("Value");
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.delete((int) '#', 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.lang.Object obj3 = timePeriodValues1.clone();
        java.lang.String str4 = timePeriodValues1.getDescription();
        timePeriodValues1.setKey((java.lang.Comparable) 0.0f);
        int int7 = timePeriodValues1.getMaxMiddleIndex();
        int int8 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener5);
        timePeriodValues1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (short) 10, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy((int) (short) 100, (int) (short) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        boolean boolean13 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues15.setDescription("");
        java.lang.Comparable comparable18 = timePeriodValues15.getKey();
        int int19 = timePeriodValues15.getItemCount();
        boolean boolean20 = timePeriodValues15.getNotify();
        boolean boolean21 = timePeriodValues15.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timePeriodValues15.addPropertyChangeListener(propertyChangeListener22);
        org.jfree.data.time.TimePeriodValues timePeriodValues26 = timePeriodValues15.createCopy((int) (short) 100, (-1));
        boolean boolean27 = timePeriodValues1.equals((java.lang.Object) timePeriodValues15);
        int int28 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDomainDescription("");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 1 + "'", comparable18, 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(timePeriodValues26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int12 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener13);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        int int12 = timePeriodValues1.getItemCount();
        timePeriodValues1.delete(100, 10);
        timePeriodValues1.setRangeDescription("");
        int int18 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.fireSeriesChanged();
        java.lang.Object obj8 = timePeriodValues1.clone();
        java.lang.String str9 = timePeriodValues1.getDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        java.lang.Class<?> wildcardClass5 = timePeriodValues1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        timePeriodValues1.fireSeriesChanged();
        int int12 = timePeriodValues1.getMinEndIndex();
        boolean boolean13 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        java.lang.String str16 = timePeriodValues15.getDomainDescription();
        java.lang.Comparable comparable17 = timePeriodValues15.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timePeriodValues15.addChangeListener(seriesChangeListener18);
        org.jfree.data.time.TimePeriodValues timePeriodValues22 = timePeriodValues15.createCopy((-1), 0);
        int int23 = timePeriodValues15.getMaxEndIndex();
        java.lang.String str24 = timePeriodValues15.getDescription();
        boolean boolean25 = timePeriodValues1.equals((java.lang.Object) timePeriodValues15);
        org.jfree.data.time.TimePeriod timePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod26, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 1 + "'", comparable17, 1);
        org.junit.Assert.assertNotNull(timePeriodValues22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDescription("Value");
        int int11 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues13.setDescription("");
        java.lang.Comparable comparable16 = timePeriodValues13.getKey();
        int int17 = timePeriodValues13.getItemCount();
        boolean boolean18 = timePeriodValues13.getNotify();
        timePeriodValues13.setKey((java.lang.Comparable) 1.0f);
        org.jfree.data.time.TimePeriodValues timePeriodValues23 = timePeriodValues13.createCopy((int) 'a', (int) (short) -1);
        timePeriodValues13.setKey((java.lang.Comparable) 'a');
        boolean boolean26 = timePeriodValues1.equals((java.lang.Object) 'a');
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 1 + "'", comparable16, 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(timePeriodValues23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        timePeriodValues1.setNotify(true);
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue15 = timePeriodValues1.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("hi!");
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        int int10 = timePeriodValues1.getItemCount();
        int int11 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        int int11 = timePeriodValues10.getMinMiddleIndex();
        int int12 = timePeriodValues10.getMaxEndIndex();
        java.lang.Comparable comparable13 = timePeriodValues10.getKey();
        int int14 = timePeriodValues10.getMinMiddleIndex();
        java.lang.Object obj15 = timePeriodValues10.clone();
        int int16 = timePeriodValues10.getMinMiddleIndex();
        timePeriodValues10.setNotify(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 100L + "'", comparable13, 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!");
        int int2 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues4.setDescription("");
        java.lang.Comparable comparable7 = timePeriodValues4.getKey();
        java.lang.Object obj8 = timePeriodValues4.clone();
        int int9 = timePeriodValues4.getMinStartIndex();
        int int10 = timePeriodValues4.getMinMiddleIndex();
        timePeriodValues4.setNotify(true);
        timePeriodValues4.setDescription("Value");
        boolean boolean15 = timePeriodValues1.equals((java.lang.Object) "Value");
        java.lang.Object obj16 = timePeriodValues1.clone();
        int int17 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setDomainDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy(1, (int) 'a');
        int int12 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = timePeriodValues1.createCopy(0, (int) (short) 1);
        timePeriodValues1.setDescription("hi!");
        java.lang.String str18 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1), "", "hi!");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy((int) '4', (int) (short) -1);
        int int10 = timePeriodValues9.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues9.createCopy((-1), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues13);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        int int10 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener3);
        int int5 = timePeriodValues1.getMinMiddleIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setNotify(false);
        int int12 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.fireSeriesChanged();
        boolean boolean10 = timePeriodValues1.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        boolean boolean12 = timePeriodValues1.isEmpty();
        timePeriodValues1.setDomainDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener15);
        timePeriodValues1.setRangeDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener19);
        timePeriodValues1.setRangeDescription("hi!");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDescription("");
        java.lang.Object obj11 = timePeriodValues1.clone();
        timePeriodValues1.setDomainDescription("Value");
        java.lang.String str14 = timePeriodValues1.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = timePeriodValues1.createCopy((int) (byte) 10, 1);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNotNull(timePeriodValues17);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        java.lang.Object obj10 = timePeriodValues1.clone();
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        boolean boolean13 = timePeriodValues1.equals((java.lang.Object) (-1.0d));
        java.lang.String str14 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setNotify(true);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        int int6 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setDomainDescription("");
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        int int11 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        timePeriodValues1.setNotify(true);
        timePeriodValues1.setDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timePeriodValues1.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100, "Value", "");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        java.lang.String str2 = timePeriodValues1.getDomainDescription();
        java.lang.Comparable comparable3 = timePeriodValues1.getKey();
        int int4 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues1.createCopy((int) (short) 1, 0);
        timePeriodValues1.setNotify(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + 1 + "'", comparable3, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues7);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        java.lang.String str2 = timePeriodValues1.getDomainDescription();
        int int3 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int8 = timePeriodValues1.getMinEndIndex();
        int int9 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        int int12 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        int int5 = timePeriodValues1.getMinStartIndex();
        int int6 = timePeriodValues1.getItemCount();
        int int7 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 10, "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = timePeriodValues3.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        boolean boolean8 = timePeriodValues1.getNotify();
        boolean boolean9 = timePeriodValues1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        java.lang.Class<?> wildcardClass12 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        timePeriodValues1.setNotify(true);
        java.lang.Object obj8 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (short) 0, 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getItemCount();
        boolean boolean9 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        java.lang.Class<?> wildcardClass9 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        int int12 = timePeriodValues1.getItemCount();
        int int13 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues1.createCopy((int) '4', (int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timePeriodValues16.removePropertyChangeListener(propertyChangeListener17);
        int int19 = timePeriodValues16.getMinStartIndex();
        int int20 = timePeriodValues16.getMaxMiddleIndex();
        java.lang.Object obj21 = timePeriodValues16.clone();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean5 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues7.setDescription("");
        java.lang.Comparable comparable10 = timePeriodValues7.getKey();
        int int11 = timePeriodValues7.getItemCount();
        boolean boolean12 = timePeriodValues7.getNotify();
        timePeriodValues7.setKey((java.lang.Comparable) 1.0f);
        java.lang.Object obj15 = null;
        boolean boolean16 = timePeriodValues7.equals(obj15);
        timePeriodValues7.setDescription("");
        timePeriodValues7.setNotify(true);
        timePeriodValues7.setNotify(false);
        org.jfree.data.time.TimePeriodValues timePeriodValues25 = timePeriodValues7.createCopy((int) (byte) -1, (int) (short) 0);
        timePeriodValues25.delete((int) 'a', (-1));
        boolean boolean29 = timePeriodValues1.equals((java.lang.Object) timePeriodValues25);
        org.jfree.data.time.TimePeriod timePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues25.add(timePeriod30, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 1 + "'", comparable10, 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timePeriodValues25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        java.lang.Object obj9 = null;
        boolean boolean10 = timePeriodValues1.equals(obj9);
        timePeriodValues1.setDescription("");
        timePeriodValues1.setNotify(true);
        int int15 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues1.createCopy((int) (short) 0, (int) (short) 1);
        int int19 = timePeriodValues18.getMinStartIndex();
        int int20 = timePeriodValues18.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        int int10 = timePeriodValues1.getMaxMiddleIndex();
        boolean boolean11 = timePeriodValues1.isEmpty();
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod12, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 100L + "'", comparable6, 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setRangeDescription("hi!");
        java.lang.String str8 = timePeriodValues1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int13 = timePeriodValues12.getMaxEndIndex();
        java.lang.Object obj14 = timePeriodValues12.clone();
        timePeriodValues12.setRangeDescription("Value");
        timePeriodValues12.setRangeDescription("");
        boolean boolean19 = timePeriodValues1.equals((java.lang.Object) timePeriodValues12);
        java.lang.String str20 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        boolean boolean4 = timePeriodValues1.getNotify();
        int int5 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        int int8 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        java.lang.String str11 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriod timePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod13, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int8 = timePeriodValues7.getMinEndIndex();
        timePeriodValues7.setNotify(false);
        int int11 = timePeriodValues7.getMaxMiddleIndex();
        boolean boolean12 = timePeriodValues1.equals((java.lang.Object) int11);
        timePeriodValues1.setDomainDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener15);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener17);
        org.jfree.data.time.TimePeriodValues timePeriodValues22 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ', "Time", "hi!");
        int int23 = timePeriodValues22.getMinMiddleIndex();
        java.lang.Object obj24 = timePeriodValues22.clone();
        boolean boolean25 = timePeriodValues1.equals(obj24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        java.lang.Object obj10 = timePeriodValues1.clone();
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.delete((int) 'a', (int) (byte) 1);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener15);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener17);
        java.lang.String str19 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setKey((java.lang.Comparable) 10);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        int int9 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        int int13 = timePeriodValues1.getMaxStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (short) -1, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 100L + "'", comparable12, 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy((int) (short) 0, (int) ' ');
        timePeriodValues1.setDescription("Time");
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int17 = timePeriodValues16.getMinEndIndex();
        timePeriodValues16.setNotify(false);
        java.lang.Comparable comparable20 = timePeriodValues16.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timePeriodValues16.addChangeListener(seriesChangeListener21);
        boolean boolean23 = timePeriodValues1.equals((java.lang.Object) timePeriodValues16);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 1 + "'", comparable20, 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) 'a', (int) (short) -1);
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable14 = timePeriodValues1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener15);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 1.0f + "'", comparable14, 1.0f);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener5);
        timePeriodValues1.setRangeDescription("");
        int int9 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        java.lang.Object obj7 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        int int10 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues14.setRangeDescription("Time");
        timePeriodValues14.fireSeriesChanged();
        timePeriodValues14.fireSeriesChanged();
        boolean boolean19 = timePeriodValues1.equals((java.lang.Object) timePeriodValues14);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        java.lang.String str11 = timePeriodValues10.getDomainDescription();
        int int12 = timePeriodValues10.getMaxStartIndex();
        timePeriodValues10.setDomainDescription("");
        boolean boolean15 = timePeriodValues10.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        timePeriodValues1.setNotify(true);
        boolean boolean8 = timePeriodValues1.getNotify();
        int int9 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy((int) '#', 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener13);
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = timePeriodValues1.createCopy(10, (int) (byte) 0);
        org.jfree.data.time.TimePeriodValue timePeriodValue18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNotNull(timePeriodValues17);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue17 = timePeriodValues1.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDescription("Value");
        int int11 = timePeriodValues1.getMinMiddleIndex();
        int int12 = timePeriodValues1.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener13);
        boolean boolean15 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        java.lang.Object obj10 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener11);
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        java.lang.String str11 = timePeriodValues10.getDomainDescription();
        int int12 = timePeriodValues10.getMaxEndIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues10.addChangeListener(seriesChangeListener13);
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = timePeriodValues10.createCopy((int) '4', 0);
        boolean boolean18 = timePeriodValues17.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timePeriodValues17.addChangeListener(seriesChangeListener19);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timePeriodValues17.removePropertyChangeListener(propertyChangeListener21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        int int10 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDescription("Time");
        java.lang.String str13 = timePeriodValues1.getDescription();
        int int14 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 100L + "'", comparable6, 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues1.createCopy(10, 0);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues6.addPropertyChangeListener(propertyChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues6.addPropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertNotNull(timePeriodValues6);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ', "Time", "hi!");
        int int4 = timePeriodValues3.getMaxStartIndex();
        timePeriodValues3.setKey((java.lang.Comparable) 1.0f);
        timePeriodValues3.setDescription("hi!");
        timePeriodValues3.setRangeDescription("Value");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        java.lang.Object obj7 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        java.lang.String str12 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setKey((java.lang.Comparable) 10L);
        int int15 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean5 = timePeriodValues1.isEmpty();
        java.lang.String str6 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setRangeDescription("hi!");
        int int9 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable10 = timePeriodValues1.getKey();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 1 + "'", comparable10, 1);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (byte) 10, (int) (short) -1);
        int int12 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        timePeriodValues1.setNotify(true);
        java.lang.Object obj8 = timePeriodValues1.clone();
        timePeriodValues1.setRangeDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener11);
        int int13 = timePeriodValues1.getMaxEndIndex();
        java.lang.String str14 = timePeriodValues1.getDomainDescription();
        int int15 = timePeriodValues1.getMinMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod17 = timePeriodValues1.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Time" + "'", str14, "Time");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int8 = timePeriodValues7.getMinEndIndex();
        timePeriodValues7.setNotify(false);
        int int11 = timePeriodValues7.getMaxMiddleIndex();
        boolean boolean12 = timePeriodValues1.equals((java.lang.Object) int11);
        timePeriodValues1.setDomainDescription("hi!");
        java.lang.String str15 = timePeriodValues1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener16);
        java.lang.String str18 = timePeriodValues1.getDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues20 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues20.setRangeDescription("Time");
        boolean boolean23 = timePeriodValues20.isEmpty();
        timePeriodValues20.setNotify(true);
        int int26 = timePeriodValues20.getMaxStartIndex();
        java.lang.Comparable comparable27 = timePeriodValues20.getKey();
        java.lang.String str28 = timePeriodValues20.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timePeriodValues20.removeChangeListener(seriesChangeListener29);
        boolean boolean31 = timePeriodValues1.equals((java.lang.Object) seriesChangeListener29);
        org.jfree.data.time.TimePeriodValues timePeriodValues34 = timePeriodValues1.createCopy(100, (int) (short) 10);
        timePeriodValues34.setNotify(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + 1 + "'", comparable27, 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Time" + "'", str28, "Time");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(timePeriodValues34);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.fireSeriesChanged();
        int int10 = timePeriodValues1.getMaxEndIndex();
        boolean boolean11 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.lang.Object obj8 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) 'a', (int) 'a');
        int int12 = timePeriodValues11.getMinEndIndex();
        java.lang.String str13 = timePeriodValues11.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues15.setDescription("");
        java.lang.Comparable comparable18 = timePeriodValues15.getKey();
        timePeriodValues15.delete((int) ' ', 0);
        java.lang.Object obj22 = timePeriodValues15.clone();
        timePeriodValues15.setRangeDescription("Value");
        boolean boolean25 = timePeriodValues11.equals((java.lang.Object) timePeriodValues15);
        int int26 = timePeriodValues11.getMinMiddleIndex();
        int int27 = timePeriodValues11.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue29 = timePeriodValues11.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 1 + "'", comparable18, 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy((int) (short) 100, (int) (short) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        int int12 = timePeriodValues1.getMaxStartIndex();
        int int13 = timePeriodValues1.getMaxStartIndex();
        int int14 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        int int10 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        java.lang.Object obj7 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        java.lang.String str12 = timePeriodValues1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue14 = timePeriodValues1.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues8.removeChangeListener(seriesChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues8.removeChangeListener(seriesChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod14 = timePeriodValues8.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        boolean boolean8 = timePeriodValues1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        timePeriodValues1.setDomainDescription("Time");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        timePeriodValues1.setNotify(true);
        java.lang.Object obj8 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int13 = timePeriodValues12.getMinEndIndex();
        timePeriodValues12.setKey((java.lang.Comparable) 100L);
        timePeriodValues12.setRangeDescription("Time");
        timePeriodValues12.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues21 = timePeriodValues12.createCopy((int) (short) 1, 0);
        java.lang.String str22 = timePeriodValues21.getDomainDescription();
        int int23 = timePeriodValues21.getMaxStartIndex();
        boolean boolean24 = timePeriodValues1.equals((java.lang.Object) timePeriodValues21);
        java.lang.Comparable comparable25 = timePeriodValues21.getKey();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + 100L + "'", comparable25, 100L);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 1, "", "");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = timePeriodValues3.createCopy((int) 'a', (int) (byte) 10);
        timePeriodValues7.setKey((java.lang.Comparable) 100L);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues7.removePropertyChangeListener(propertyChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod13 = timePeriodValues7.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues7);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        timePeriodValues1.setDomainDescription("");
        boolean boolean9 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-1), "Time", "hi!");
        java.lang.String str4 = timePeriodValues3.getDomainDescription();
        timePeriodValues3.setNotify(false);
        timePeriodValues3.setDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues3.createCopy((int) (byte) 1, (int) (byte) 0);
        timePeriodValues3.setRangeDescription("Value");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertNotNull(timePeriodValues11);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDescription("Value");
        int int11 = timePeriodValues1.getMinMiddleIndex();
        int int12 = timePeriodValues1.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener13);
        boolean boolean15 = timePeriodValues1.getNotify();
        java.lang.String str16 = timePeriodValues1.getDomainDescription();
        int int17 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int8 = timePeriodValues1.getMinEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener9);
        timePeriodValues1.setDescription("hi!");
        org.jfree.data.time.TimePeriod timePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod13, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) true, "Time", "Value");
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int6 = timePeriodValues5.getMinEndIndex();
        timePeriodValues5.setNotify(false);
        java.lang.Class<?> wildcardClass9 = timePeriodValues5.getClass();
        boolean boolean10 = timePeriodValues3.equals((java.lang.Object) timePeriodValues5);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues3.addPropertyChangeListener(propertyChangeListener11);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.delete((int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        timePeriodValues1.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue10 = timePeriodValues1.getDataItem(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        int int11 = timePeriodValues10.getMinMiddleIndex();
        java.lang.String str12 = timePeriodValues10.getDomainDescription();
        java.lang.Object obj13 = timePeriodValues10.clone();
        java.lang.Comparable comparable14 = timePeriodValues10.getKey();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 100L + "'", comparable14, 100L);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int8 = timePeriodValues1.getMinEndIndex();
        int int9 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues13.setDescription("");
        java.lang.Comparable comparable16 = timePeriodValues13.getKey();
        java.lang.Object obj17 = timePeriodValues13.clone();
        int int18 = timePeriodValues13.getMinStartIndex();
        int int19 = timePeriodValues13.getMinEndIndex();
        java.lang.String str20 = timePeriodValues13.getDomainDescription();
        int int21 = timePeriodValues13.getMinMiddleIndex();
        timePeriodValues13.setNotify(false);
        boolean boolean24 = timePeriodValues1.equals((java.lang.Object) timePeriodValues13);
        boolean boolean25 = timePeriodValues13.getNotify();
        boolean boolean26 = timePeriodValues13.isEmpty();
        timePeriodValues13.setKey((java.lang.Comparable) 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 1 + "'", comparable16, 1);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        int int12 = timePeriodValues1.getItemCount();
        timePeriodValues1.delete(100, 10);
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues1.createCopy(0, (int) (byte) -1);
        java.lang.Comparable comparable19 = timePeriodValues18.getKey();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 1 + "'", comparable19, 1);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int13 = timePeriodValues1.getMinStartIndex();
        java.lang.String str14 = timePeriodValues1.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener15);
        int int17 = timePeriodValues1.getMinStartIndex();
        java.lang.String str18 = timePeriodValues1.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues20 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues20.setDescription("");
        java.lang.Comparable comparable23 = timePeriodValues20.getKey();
        int int24 = timePeriodValues20.getItemCount();
        java.lang.Comparable comparable25 = timePeriodValues20.getKey();
        int int26 = timePeriodValues20.getMaxMiddleIndex();
        timePeriodValues20.setDescription("Time");
        boolean boolean29 = timePeriodValues20.isEmpty();
        boolean boolean30 = timePeriodValues1.equals((java.lang.Object) timePeriodValues20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + 1 + "'", comparable23, 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + 1 + "'", comparable25, 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        boolean boolean8 = timePeriodValues1.getNotify();
        java.lang.Object obj9 = timePeriodValues1.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setDescription("");
        java.lang.Object obj11 = timePeriodValues1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timePeriodValues1.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        java.lang.Object obj3 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues1.createCopy((int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(timePeriodValues6);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy((int) '4', (int) (short) -1);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues9.addPropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean5 = timePeriodValues1.isEmpty();
        int int6 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy(0, (int) (byte) 1);
        timePeriodValues9.setDescription("hi!");
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues9.add(timePeriod12, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        timePeriodValues1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod17 = timePeriodValues1.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setNotify(false);
        boolean boolean12 = timePeriodValues1.isEmpty();
        java.lang.Comparable comparable13 = timePeriodValues1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod15 = timePeriodValues1.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 1 + "'", comparable13, 1);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener5);
        timePeriodValues1.setRangeDescription("");
        java.lang.String str9 = timePeriodValues1.getDescription();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setDomainDescription("");
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int14 = timePeriodValues13.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = timePeriodValues13.createCopy((int) 'a', (int) (short) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues20 = timePeriodValues17.createCopy((int) '#', (int) (short) 0);
        int int21 = timePeriodValues17.getMaxMiddleIndex();
        boolean boolean22 = timePeriodValues1.equals((java.lang.Object) int21);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update(10, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues17);
        org.junit.Assert.assertNotNull(timePeriodValues20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener11);
        int int13 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = timePeriodValues1.createCopy((int) 'a', (int) (short) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues5.createCopy((int) '#', (int) (short) 0);
        int int9 = timePeriodValues5.getItemCount();
        timePeriodValues5.setDescription("Value");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues5);
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        boolean boolean6 = timePeriodValues3.equals((java.lang.Object) 1.0d);
        boolean boolean7 = timePeriodValues3.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues3.createCopy((int) (byte) 10, (int) 'a');
        java.lang.Class<?> wildcardClass11 = timePeriodValues3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) '4', "Time", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue5 = timePeriodValues3.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.lang.Object obj8 = timePeriodValues1.clone();
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) 'a', (int) 'a');
        int int12 = timePeriodValues11.getMinEndIndex();
        java.lang.String str13 = timePeriodValues11.getRangeDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues15 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues15.setDescription("");
        java.lang.Comparable comparable18 = timePeriodValues15.getKey();
        timePeriodValues15.delete((int) ' ', 0);
        java.lang.Object obj22 = timePeriodValues15.clone();
        timePeriodValues15.setRangeDescription("Value");
        boolean boolean25 = timePeriodValues11.equals((java.lang.Object) timePeriodValues15);
        java.lang.String str26 = timePeriodValues15.getDescription();
        timePeriodValues15.setDescription("Time");
        timePeriodValues15.setRangeDescription("Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 1 + "'", comparable18, 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy(0, (int) (short) -1);
        int int10 = timePeriodValues9.getMaxEndIndex();
        int int11 = timePeriodValues9.getMinStartIndex();
        java.lang.Comparable comparable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues9.setKey(comparable12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1 + "'", comparable6, 1);
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDescription("Value");
        int int11 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDescription("hi!");
        int int14 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        boolean boolean4 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        boolean boolean9 = timePeriodValues1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener4);
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.setDomainDescription("Time");
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod10, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        int int6 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setDomainDescription("");
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        int int11 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues14 = timePeriodValues1.createCopy((int) (short) 10, (-1));
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues14);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int8 = timePeriodValues7.getMinEndIndex();
        timePeriodValues7.setNotify(false);
        int int11 = timePeriodValues7.getMaxMiddleIndex();
        boolean boolean12 = timePeriodValues1.equals((java.lang.Object) int11);
        timePeriodValues1.setDomainDescription("hi!");
        java.lang.String str15 = timePeriodValues1.getDescription();
        java.lang.String str16 = timePeriodValues1.getDomainDescription();
        boolean boolean17 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues19 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues19.setDescription("");
        boolean boolean22 = timePeriodValues19.getNotify();
        int int23 = timePeriodValues19.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timePeriodValues19.addPropertyChangeListener(propertyChangeListener24);
        int int26 = timePeriodValues19.getItemCount();
        boolean boolean27 = timePeriodValues1.equals((java.lang.Object) timePeriodValues19);
        int int28 = timePeriodValues19.getMaxStartIndex();
        timePeriodValues19.setDescription("Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int8 = timePeriodValues7.getMinEndIndex();
        timePeriodValues7.setNotify(false);
        int int11 = timePeriodValues7.getMaxMiddleIndex();
        boolean boolean12 = timePeriodValues1.equals((java.lang.Object) int11);
        timePeriodValues1.setDomainDescription("hi!");
        java.lang.String str15 = timePeriodValues1.getDescription();
        java.lang.String str16 = timePeriodValues1.getDomainDescription();
        boolean boolean17 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues19 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues19.setDescription("");
        boolean boolean22 = timePeriodValues19.getNotify();
        int int23 = timePeriodValues19.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timePeriodValues19.addPropertyChangeListener(propertyChangeListener24);
        int int26 = timePeriodValues19.getItemCount();
        boolean boolean27 = timePeriodValues1.equals((java.lang.Object) timePeriodValues19);
        java.lang.Comparable comparable28 = timePeriodValues19.getKey();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + 1 + "'", comparable28, 1);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        int int12 = timePeriodValues1.getItemCount();
        int int13 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues1.createCopy((int) '4', (int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timePeriodValues16.removePropertyChangeListener(propertyChangeListener17);
        int int19 = timePeriodValues16.getMaxEndIndex();
        org.jfree.data.time.TimePeriod timePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues16.add(timePeriod20, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timePeriodValues16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.fireSeriesChanged();
        java.lang.Object obj8 = timePeriodValues1.clone();
        int int9 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        java.lang.String str11 = timePeriodValues10.getDomainDescription();
        int int12 = timePeriodValues10.getMaxMiddleIndex();
        timePeriodValues10.setDomainDescription("Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener7);
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setNotify(true);
        timePeriodValues1.setRangeDescription("Value");
        timePeriodValues1.delete((int) (byte) 100, (int) (short) 0);
        boolean boolean17 = timePeriodValues1.getNotify();
        int int18 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriod timePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod19, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        java.lang.Object obj7 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        java.lang.String str12 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.setKey((java.lang.Comparable) 10L);
        java.lang.String str15 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("Time");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (-2210593619794989709L), "Time", "");
        timePeriodValues3.setDomainDescription("");
        int int6 = timePeriodValues3.getMinEndIndex();
        int int7 = timePeriodValues3.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100.0f, "hi!", "");
        timePeriodValues3.setKey((java.lang.Comparable) (-1));
        org.jfree.data.time.TimePeriod timePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod6, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        boolean boolean6 = timePeriodValues3.equals((java.lang.Object) 1.0d);
        boolean boolean7 = timePeriodValues3.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues3.createCopy((int) (byte) 10, (int) 'a');
        java.lang.String str11 = timePeriodValues3.getDescription();
        int int12 = timePeriodValues3.getMinEndIndex();
        org.jfree.data.time.TimePeriod timePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues3.add(timePeriod13, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getItemCount();
        boolean boolean3 = timePeriodValues1.isEmpty();
        timePeriodValues1.setRangeDescription("Time");
        java.lang.String str6 = timePeriodValues1.getDescription();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (byte) 100, "hi!", "");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        int int7 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriod timePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod8, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        java.lang.Object obj10 = timePeriodValues1.clone();
        boolean boolean11 = timePeriodValues1.getNotify();
        timePeriodValues1.fireSeriesChanged();
        int int13 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriod timePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod14, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        java.lang.Object obj7 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod15 = timePeriodValues1.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        boolean boolean5 = timePeriodValues1.isEmpty();
        java.lang.String str6 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.fireSeriesChanged();
        boolean boolean10 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        timePeriodValues1.setNotify(false);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        timePeriodValues1.delete((int) (byte) 100, (int) '#');
        int int11 = timePeriodValues1.getMinStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (short) 10, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 1, "", "");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod6 = timePeriodValues3.getTimePeriod((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ', "Time", "hi!");
        int int4 = timePeriodValues3.getMinMiddleIndex();
        int int5 = timePeriodValues3.getItemCount();
        int int6 = timePeriodValues3.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues3.removeChangeListener(seriesChangeListener7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        timePeriodValues1.setNotify(true);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener10);
        java.lang.Object obj12 = timePeriodValues1.clone();
        java.lang.String str13 = timePeriodValues1.getRangeDescription();
        int int14 = timePeriodValues1.getMaxStartIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod16 = timePeriodValues1.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMinEndIndex();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        int int8 = timePeriodValues1.getMaxEndIndex();
        int int9 = timePeriodValues1.getMaxMiddleIndex();
        boolean boolean10 = timePeriodValues1.getNotify();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("");
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        int int9 = timePeriodValues1.getMinMiddleIndex();
        int int10 = timePeriodValues1.getMinEndIndex();
        int int11 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable12 = timePeriodValues1.getKey();
        boolean boolean13 = timePeriodValues1.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 1 + "'", comparable12, 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setDomainDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy(1, (int) 'a');
        boolean boolean12 = timePeriodValues1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timePeriodValues1.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        int int8 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        timePeriodValues1.fireSeriesChanged();
        int int12 = timePeriodValues1.getMinEndIndex();
        boolean boolean13 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues1.createCopy((int) (byte) 1, (int) (byte) 0);
        int int17 = timePeriodValues1.getMinEndIndex();
        int int18 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timePeriodValues16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (byte) 1, (int) (short) 10);
        timePeriodValues11.delete((int) '#', (int) ' ');
        java.lang.String str15 = timePeriodValues11.getDescription();
        int int16 = timePeriodValues11.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setDomainDescription("hi!");
        boolean boolean9 = timePeriodValues1.getNotify();
        int int10 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 0L);
        timePeriodValues1.setNotify(false);
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = timePeriodValues1.createCopy((int) (byte) 0, 10);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues17);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setDomainDescription("Value");
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        timePeriodValues1.setNotify(false);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = timePeriodValues1.createCopy((int) 'a', (int) (short) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues5.createCopy((int) '#', (int) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues5.removePropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues5);
        org.junit.Assert.assertNotNull(timePeriodValues8);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        boolean boolean4 = timePeriodValues1.getNotify();
        java.lang.Object obj5 = null;
        boolean boolean6 = timePeriodValues1.equals(obj5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        timePeriodValues8.setNotify(false);
        int int11 = timePeriodValues8.getMaxMiddleIndex();
        boolean boolean12 = timePeriodValues8.getNotify();
        int int13 = timePeriodValues8.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        java.lang.String str11 = timePeriodValues10.getDomainDescription();
        boolean boolean12 = timePeriodValues10.getNotify();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setNotify(true);
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        java.lang.String str11 = timePeriodValues1.getDescription();
        timePeriodValues1.setKey((java.lang.Comparable) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener14);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener7);
        java.lang.Object obj9 = timePeriodValues1.clone();
        int int10 = timePeriodValues1.getMinStartIndex();
        timePeriodValues1.setKey((java.lang.Comparable) '#');
        java.lang.Comparable comparable13 = timePeriodValues1.getKey();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + '#' + "'", comparable13, '#');
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setRangeDescription("hi!");
        timePeriodValues1.setRangeDescription("");
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener16);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener2);
        timePeriodValues1.setDomainDescription("Value");
        org.jfree.data.time.TimePeriod timePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod6, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        int int7 = timePeriodValues1.getItemCount();
        int int8 = timePeriodValues1.getMinStartIndex();
        int int9 = timePeriodValues1.getItemCount();
        timePeriodValues1.setKey((java.lang.Comparable) "Time");
        timePeriodValues1.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue15 = timePeriodValues1.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        int int11 = timePeriodValues10.getMinMiddleIndex();
        int int12 = timePeriodValues10.getMaxEndIndex();
        java.lang.Comparable comparable13 = timePeriodValues10.getKey();
        int int14 = timePeriodValues10.getMinMiddleIndex();
        int int15 = timePeriodValues10.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues10.createCopy((int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 100L + "'", comparable13, 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues18);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int8 = timePeriodValues7.getMinEndIndex();
        timePeriodValues7.setNotify(false);
        int int11 = timePeriodValues7.getMaxMiddleIndex();
        boolean boolean12 = timePeriodValues1.equals((java.lang.Object) int11);
        timePeriodValues1.setDomainDescription("hi!");
        java.lang.String str15 = timePeriodValues1.getDescription();
        java.lang.String str16 = timePeriodValues1.getDomainDescription();
        int int17 = timePeriodValues1.getMinMiddleIndex();
        int int18 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        int int6 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 0.0d);
        timePeriodValues1.fireSeriesChanged();
        int int10 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setDomainDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) true, "Time", "Value");
        int int4 = timePeriodValues3.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        java.lang.String str5 = timePeriodValues1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        timePeriodValues8.setNotify(false);
        boolean boolean11 = timePeriodValues8.getNotify();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.delete((int) ' ', 0);
        java.lang.Object obj8 = timePeriodValues1.clone();
        int int9 = timePeriodValues1.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (short) 100, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        java.lang.String str2 = timePeriodValues1.getDomainDescription();
        int int3 = timePeriodValues1.getMaxStartIndex();
        int int4 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.fireSeriesChanged();
        java.lang.Class<?> wildcardClass6 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues4.setDescription("");
        java.lang.Comparable comparable7 = timePeriodValues4.getKey();
        int int8 = timePeriodValues4.getItemCount();
        java.lang.Comparable comparable9 = timePeriodValues4.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues4.createCopy(0, (int) (short) -1);
        boolean boolean13 = timePeriodValues1.equals((java.lang.Object) (short) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener14);
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues1.createCopy((int) (byte) 10, (int) '#');
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 1 + "'", comparable9, 1);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timePeriodValues18);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        int int9 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        boolean boolean12 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 'a');
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = timePeriodValues1.createCopy(0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = timePeriodValues1.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timePeriodValues17);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        java.lang.String str2 = timePeriodValues1.getDomainDescription();
        java.lang.String str3 = timePeriodValues1.getRangeDescription();
        boolean boolean4 = timePeriodValues1.getNotify();
        timePeriodValues1.setNotify(true);
        java.lang.String str7 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.fireSeriesChanged();
        int int4 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues6.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues6.removePropertyChangeListener(propertyChangeListener9);
        int int11 = timePeriodValues6.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues6.removePropertyChangeListener(propertyChangeListener12);
        boolean boolean14 = timePeriodValues1.equals((java.lang.Object) timePeriodValues6);
        java.lang.String str15 = timePeriodValues6.getDomainDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        int int6 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setDomainDescription("");
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        int int11 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener14);
        boolean boolean16 = timePeriodValues1.getNotify();
        java.lang.Comparable comparable17 = timePeriodValues1.getKey();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 1 + "'", comparable17, 1);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        int int3 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener4);
        timePeriodValues1.setDescription("Value");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 10, "Time", "Time");
        int int4 = timePeriodValues3.getMinEndIndex();
        int int5 = timePeriodValues3.getMaxEndIndex();
        int int6 = timePeriodValues3.getMinMiddleIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setNotify(true);
        timePeriodValues1.setDescription("Value");
        boolean boolean12 = timePeriodValues1.isEmpty();
        int int13 = timePeriodValues1.getItemCount();
        int int14 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValue timePeriodValue15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        int int8 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDescription("Value");
        int int11 = timePeriodValues1.getMinMiddleIndex();
        int int12 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update((int) (short) 100, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        java.lang.Class<?> wildcardClass8 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        java.lang.Object obj10 = timePeriodValues1.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        boolean boolean13 = timePeriodValues1.getNotify();
        int int14 = timePeriodValues1.getMinEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int17 = timePeriodValues16.getMaxEndIndex();
        timePeriodValues16.fireSeriesChanged();
        int int19 = timePeriodValues16.getItemCount();
        boolean boolean20 = timePeriodValues1.equals((java.lang.Object) timePeriodValues16);
        int int21 = timePeriodValues16.getItemCount();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy((int) (short) 100, (int) (short) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        int int12 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setRangeDescription("Value");
        boolean boolean15 = timePeriodValues1.getNotify();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener17);
        int int19 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0d);
        timePeriodValues1.setDescription("");
        timePeriodValues1.setDescription("Time");
        timePeriodValues1.setNotify(true);
        timePeriodValues1.setKey((java.lang.Comparable) ' ');
        int int17 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100.0d, "Time", "");
        timePeriodValues3.setDescription("hi!");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = timePeriodValues1.createCopy((int) 'a', (int) (short) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues5.createCopy((int) '#', (int) (short) 0);
        int int9 = timePeriodValues5.getMaxMiddleIndex();
        timePeriodValues5.delete(1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues5);
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getItemCount();
        boolean boolean3 = timePeriodValues1.isEmpty();
        int int4 = timePeriodValues1.getItemCount();
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) true);
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getItemCount();
        boolean boolean3 = timePeriodValues1.isEmpty();
        int int4 = timePeriodValues1.getMinMiddleIndex();
        java.lang.Class<?> wildcardClass5 = timePeriodValues1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) -1, "Time", "Time");
        timePeriodValues3.setDescription("hi!");
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues7.setDescription("");
        java.lang.Comparable comparable10 = timePeriodValues7.getKey();
        int int11 = timePeriodValues7.getMinMiddleIndex();
        timePeriodValues7.setDomainDescription("hi!");
        int int14 = timePeriodValues7.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timePeriodValues7.addChangeListener(seriesChangeListener15);
        java.lang.Object obj17 = timePeriodValues7.clone();
        boolean boolean18 = timePeriodValues3.equals((java.lang.Object) timePeriodValues7);
        int int19 = timePeriodValues7.getMaxStartIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timePeriodValues7.addChangeListener(seriesChangeListener20);
        int int22 = timePeriodValues7.getMaxEndIndex();
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 1 + "'", comparable10, 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        timePeriodValues8.setKey((java.lang.Comparable) (-2210593619794989709L));
        int int11 = timePeriodValues8.getMaxStartIndex();
        int int12 = timePeriodValues8.getMaxMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues8.addPropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        timePeriodValues1.setNotify(true);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy(0, (int) (short) -1);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues11.addPropertyChangeListener(propertyChangeListener12);
        int int14 = timePeriodValues11.getMaxEndIndex();
        timePeriodValues11.setRangeDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod18 = timePeriodValues11.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) ' ', "Time", "hi!");
        int int4 = timePeriodValues3.getMaxStartIndex();
        java.lang.Comparable comparable5 = timePeriodValues3.getKey();
        java.lang.Comparable comparable6 = timePeriodValues3.getKey();
        timePeriodValues3.setKey((java.lang.Comparable) 100.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + ' ' + "'", comparable5, ' ');
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + ' ' + "'", comparable6, ' ');
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int8 = timePeriodValues1.getMinEndIndex();
        java.lang.String str9 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setDescription("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setRangeDescription("hi!");
        int int13 = timePeriodValues1.getMaxMiddleIndex();
        timePeriodValues1.setDescription("Value");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener5);
        int int7 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setNotify(false);
        boolean boolean12 = timePeriodValues1.isEmpty();
        boolean boolean13 = timePeriodValues1.isEmpty();
        timePeriodValues1.setNotify(false);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        int int7 = timePeriodValues1.getMaxStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setRangeDescription("hi!");
        int int9 = timePeriodValues1.getMinMiddleIndex();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        java.lang.Comparable comparable6 = timePeriodValues1.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues9 = timePeriodValues1.createCopy(0, (int) (short) -1);
        int int10 = timePeriodValues1.getMaxEndIndex();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener13);
        java.lang.Class<?> wildcardClass15 = timePeriodValues1.getClass();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1 + "'", comparable6, 1);
        org.junit.Assert.assertNotNull(timePeriodValues9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        int int5 = timePeriodValues1.getMaxMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues7 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int8 = timePeriodValues7.getMinEndIndex();
        timePeriodValues7.setNotify(false);
        int int11 = timePeriodValues7.getMaxMiddleIndex();
        boolean boolean12 = timePeriodValues1.equals((java.lang.Object) int11);
        timePeriodValues1.setDomainDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener15);
        java.lang.String str17 = timePeriodValues1.getDomainDescription();
        java.lang.String str18 = timePeriodValues1.getRangeDescription();
        java.lang.String str19 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (byte) 1, (int) (short) 10);
        int int12 = timePeriodValues1.getMaxMiddleIndex();
        java.lang.Object obj13 = timePeriodValues1.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        java.lang.Object obj9 = null;
        boolean boolean10 = timePeriodValues1.equals(obj9);
        java.lang.String str11 = timePeriodValues1.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener12);
        int int14 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriod timePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod15, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener6);
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        timePeriodValues1.setNotify(true);
        java.lang.Object obj9 = timePeriodValues1.clone();
        int int10 = timePeriodValues1.getMaxStartIndex();
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod11, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.fireSeriesChanged();
        boolean boolean11 = timePeriodValues1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener12);
        timePeriodValues1.setDescription("Time");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues1.createCopy((int) '#', (int) '#');
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) (byte) 1, (int) (short) 10);
        timePeriodValues11.delete((int) '#', (int) ' ');
        timePeriodValues11.fireSeriesChanged();
        timePeriodValues11.setNotify(false);
        timePeriodValues11.setRangeDescription("Value");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertNotNull(timePeriodValues11);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        int int8 = timePeriodValues1.getMaxEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) "");
        timePeriodValues1.setDomainDescription("Value");
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener10);
        timePeriodValues1.delete(1, (int) (byte) 0);
        int int15 = timePeriodValues1.getMinEndIndex();
        java.lang.String str16 = timePeriodValues1.getDomainDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setRangeDescription("Time");
        boolean boolean4 = timePeriodValues1.isEmpty();
        timePeriodValues1.setNotify(true);
        int int7 = timePeriodValues1.getMaxStartIndex();
        java.lang.Comparable comparable8 = timePeriodValues1.getKey();
        timePeriodValues1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener11);
        int int13 = timePeriodValues1.getMaxMiddleIndex();
        int int14 = timePeriodValues1.getMinEndIndex();
        java.lang.Object obj15 = timePeriodValues1.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 1 + "'", comparable8, 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.setNotify(true);
        java.lang.String str10 = timePeriodValues1.getDomainDescription();
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        timePeriodValues1.setKey((java.lang.Comparable) 1.0f);
        org.jfree.data.time.TimePeriodValues timePeriodValues11 = timePeriodValues1.createCopy((int) 'a', (int) (short) -1);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timePeriodValues11.addPropertyChangeListener(propertyChangeListener12);
        int int14 = timePeriodValues11.getMinStartIndex();
        timePeriodValues11.setRangeDescription("");
        int int17 = timePeriodValues11.getMaxStartIndex();
        java.lang.Comparable comparable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues11.setKey(comparable18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timePeriodValues11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        boolean boolean4 = timePeriodValues1.getNotify();
        int int5 = timePeriodValues1.getMinStartIndex();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        int int8 = timePeriodValues1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener9);
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy((int) (short) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod14 = timePeriodValues12.getTimePeriod((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues12);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        boolean boolean7 = timePeriodValues1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy((int) (short) 100, (-1));
        java.lang.Object obj13 = timePeriodValues12.clone();
        timePeriodValues12.setKey((java.lang.Comparable) true);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMaxStartIndex();
        int int6 = timePeriodValues1.getMaxMiddleIndex();
        int int7 = timePeriodValues1.getItemCount();
        int int8 = timePeriodValues1.getMinStartIndex();
        java.lang.String str9 = timePeriodValues1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        timePeriodValues1.setDomainDescription("Time");
        org.jfree.data.time.TimePeriodValue timePeriodValue14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        java.lang.String str8 = timePeriodValues1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        timePeriodValues1.fireSeriesChanged();
        int int11 = timePeriodValues1.getMinStartIndex();
        java.lang.String str12 = timePeriodValues1.getDomainDescription();
        int int13 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues16 = timePeriodValues1.createCopy((int) (short) -1, (int) (short) 10);
        timePeriodValues16.setKey((java.lang.Comparable) 0L);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues16);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int13 = timePeriodValues1.getMinStartIndex();
        int int14 = timePeriodValues1.getMinMiddleIndex();
        timePeriodValues1.delete(100, (int) '4');
        java.lang.String str18 = timePeriodValues1.getDescription();
        java.lang.Object obj19 = timePeriodValues1.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) (short) 0, "", "");
        timePeriodValues3.fireSeriesChanged();
        int int5 = timePeriodValues3.getItemCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        timePeriodValues1.setRangeDescription("Time");
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues1.createCopy((int) (short) 1, 0);
        int int11 = timePeriodValues1.getItemCount();
        java.lang.String str12 = timePeriodValues1.getDescription();
        int int13 = timePeriodValues1.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.Comparable comparable5 = timePeriodValues1.getKey();
        int int6 = timePeriodValues1.getMinEndIndex();
        int int7 = timePeriodValues1.getMinStartIndex();
        java.lang.String str8 = timePeriodValues1.getDescription();
        org.jfree.data.time.TimePeriod timePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod9, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 1 + "'", comparable5, 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = timePeriodValues1.createCopy((int) 'a', (int) (short) 100);
        boolean boolean6 = timePeriodValues5.isEmpty();
        int int7 = timePeriodValues5.getMinMiddleIndex();
        int int8 = timePeriodValues5.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        boolean boolean6 = timePeriodValues1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod11, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimePeriodValues timePeriodValues6 = timePeriodValues1.createCopy(10, 0);
        timePeriodValues1.setDescription("Time");
        org.jfree.data.time.TimePeriodValue timePeriodValue9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timePeriodValues6);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getItemCount();
        org.jfree.data.time.TimePeriodValues timePeriodValues4 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues4.setDescription("");
        java.lang.Comparable comparable7 = timePeriodValues4.getKey();
        int int8 = timePeriodValues4.getItemCount();
        java.lang.Comparable comparable9 = timePeriodValues4.getKey();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues4.createCopy(0, (int) (short) -1);
        boolean boolean13 = timePeriodValues1.equals((java.lang.Object) (short) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener14);
        org.jfree.data.time.TimePeriodValues timePeriodValues18 = timePeriodValues1.createCopy((int) (byte) 10, (int) '#');
        int int19 = timePeriodValues18.getMaxEndIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 1 + "'", comparable7, 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 1 + "'", comparable9, 1);
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timePeriodValues18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        timePeriodValues1.setNotify(true);
        java.lang.Object obj8 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int13 = timePeriodValues12.getMinEndIndex();
        timePeriodValues12.setKey((java.lang.Comparable) 100L);
        timePeriodValues12.setRangeDescription("Time");
        timePeriodValues12.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValues timePeriodValues21 = timePeriodValues12.createCopy((int) (short) 1, 0);
        java.lang.String str22 = timePeriodValues21.getDomainDescription();
        int int23 = timePeriodValues21.getMaxStartIndex();
        boolean boolean24 = timePeriodValues1.equals((java.lang.Object) timePeriodValues21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriod timePeriod26 = timePeriodValues1.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        int int6 = timePeriodValues1.getMinStartIndex();
        int int7 = timePeriodValues1.getMinEndIndex();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues10.setDescription("");
        java.lang.Comparable comparable13 = timePeriodValues10.getKey();
        int int14 = timePeriodValues10.getItemCount();
        boolean boolean15 = timePeriodValues10.getNotify();
        boolean boolean16 = timePeriodValues10.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timePeriodValues10.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimePeriodValues timePeriodValues21 = timePeriodValues10.createCopy((int) (short) 100, (-1));
        boolean boolean22 = timePeriodValues1.equals((java.lang.Object) timePeriodValues10);
        timePeriodValues10.setKey((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 1 + "'", comparable13, 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(timePeriodValues21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        timePeriodValues1.setNotify(true);
        boolean boolean8 = timePeriodValues1.getNotify();
        int int9 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues12 = timePeriodValues1.createCopy((int) '#', 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener13);
        org.jfree.data.time.TimePeriodValues timePeriodValues17 = timePeriodValues1.createCopy(10, (int) (byte) 0);
        timePeriodValues17.setDescription("");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues12);
        org.junit.Assert.assertNotNull(timePeriodValues17);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        java.lang.Object obj10 = timePeriodValues1.clone();
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        boolean boolean13 = timePeriodValues1.equals((java.lang.Object) (-1.0d));
        timePeriodValues1.setNotify(false);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        timePeriodValues1.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener7);
        timePeriodValues1.fireSeriesChanged();
        timePeriodValues1.setNotify(false);
        timePeriodValues1.setRangeDescription("hi!");
        java.lang.Number number15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.update(10, number15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.removeChangeListener(seriesChangeListener6);
        timePeriodValues1.setDomainDescription("");
        java.lang.Comparable comparable10 = timePeriodValues1.getKey();
        boolean boolean11 = timePeriodValues1.getNotify();
        org.jfree.data.time.TimePeriod timePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriod12, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 1 + "'", comparable10, 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getMinMiddleIndex();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener8);
        int int10 = timePeriodValues1.getMaxEndIndex();
        boolean boolean11 = timePeriodValues1.getNotify();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setKey((java.lang.Comparable) 100L);
        int int5 = timePeriodValues1.getMinEndIndex();
        java.lang.String str6 = timePeriodValues1.getDomainDescription();
        java.lang.String str7 = timePeriodValues1.getDomainDescription();
        java.lang.String str8 = timePeriodValues1.getDomainDescription();
        java.lang.String str9 = timePeriodValues1.getDomainDescription();
        boolean boolean10 = timePeriodValues1.getNotify();
        int int11 = timePeriodValues1.getMaxMiddleIndex();
        int int12 = timePeriodValues1.getItemCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMaxEndIndex();
        org.jfree.data.time.TimePeriodValues timePeriodValues5 = timePeriodValues1.createCopy((int) 'a', (int) (short) 100);
        org.jfree.data.time.TimePeriodValues timePeriodValues8 = timePeriodValues5.createCopy((int) '#', (int) (short) 0);
        int int9 = timePeriodValues5.getMinStartIndex();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(timePeriodValues5);
        org.junit.Assert.assertNotNull(timePeriodValues8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) "hi!", "Value", "Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimePeriodValue timePeriodValue5 = timePeriodValues3.getDataItem((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable11 = timePeriodValues1.getKey();
        timePeriodValues1.fireSeriesChanged();
        org.jfree.data.time.TimePeriodValue timePeriodValue13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.add(timePeriodValue13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null item not allowed.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 1 + "'", comparable11, 1);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.setNotify(false);
        java.lang.String str5 = timePeriodValues1.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timePeriodValues1.removePropertyChangeListener(propertyChangeListener6);
        boolean boolean8 = timePeriodValues1.getNotify();
        int int9 = timePeriodValues1.getMaxEndIndex();
        java.lang.Comparable comparable10 = timePeriodValues1.getKey();
        java.lang.String str11 = timePeriodValues1.getDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 1 + "'", comparable10, 1);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.jfree.data.time.TimePeriodValues timePeriodValues3 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1.0d, "", "hi!");
        int int4 = timePeriodValues3.getMaxMiddleIndex();
        boolean boolean6 = timePeriodValues3.equals((java.lang.Object) 1.0d);
        boolean boolean7 = timePeriodValues3.getNotify();
        org.jfree.data.time.TimePeriodValues timePeriodValues10 = timePeriodValues3.createCopy((int) (byte) 10, (int) 'a');
        org.jfree.data.time.TimePeriodValues timePeriodValues13 = timePeriodValues3.createCopy((int) (byte) 10, (int) ' ');
        java.lang.String str14 = timePeriodValues3.getDomainDescription();
        boolean boolean15 = timePeriodValues3.getNotify();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timePeriodValues10);
        org.junit.Assert.assertNotNull(timePeriodValues13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        int int2 = timePeriodValues1.getMinEndIndex();
        timePeriodValues1.delete((int) '#', (int) (byte) -1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener6);
        timePeriodValues1.setRangeDescription("");
        int int10 = timePeriodValues1.getMaxStartIndex();
        timePeriodValues1.setNotify(false);
        int int13 = timePeriodValues1.getMinStartIndex();
        java.lang.String str14 = timePeriodValues1.getRangeDescription();
        timePeriodValues1.setKey((java.lang.Comparable) '4');
        boolean boolean17 = timePeriodValues1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        int int5 = timePeriodValues1.getItemCount();
        timePeriodValues1.fireSeriesChanged();
        java.lang.Object obj7 = timePeriodValues1.clone();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timePeriodValues1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timePeriodValues1.addChangeListener(seriesChangeListener10);
        timePeriodValues1.fireSeriesChanged();
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.jfree.data.time.TimePeriodValues timePeriodValues1 = new org.jfree.data.time.TimePeriodValues((java.lang.Comparable) 1);
        timePeriodValues1.setDescription("");
        java.lang.Comparable comparable4 = timePeriodValues1.getKey();
        java.lang.Object obj5 = timePeriodValues1.clone();
        // The following exception was thrown during execution in test generation
        try {
            timePeriodValues1.delete((-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 1 + "'", comparable4, 1);
        org.junit.Assert.assertNotNull(obj5);
    }
}

