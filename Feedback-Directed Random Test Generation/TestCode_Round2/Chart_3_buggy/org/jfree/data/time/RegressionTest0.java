package org.jfree.data.time;

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
        java.lang.String str0 = org.jfree.data.time.TimeSeries.DEFAULT_DOMAIN_DESCRIPTION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Time" + "'", str0, "Time");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.addOrUpdate(timeSeriesDataItem6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.getRawDataItem(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod17, (double) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.addOrUpdate(regularTimePeriod7, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete((int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        java.util.List list11 = timeSeries7.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.update((int) ' ', (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries3.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries3.addOrUpdate(regularTimePeriod4, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries9 = timeSeries3.createCopy(regularTimePeriod7, regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries3.addOrUpdate(regularTimePeriod4, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod10, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries8.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy(regularTimePeriod6, regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        java.util.List list11 = timeSeries7.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.update(0, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries3.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        timeSeries7.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = timeSeries7.getIndex(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1.0f) + "'", comparable9, (-1.0f));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries3.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries3.getDataItem(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.delete(regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 0, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.String str0 = org.jfree.data.time.TimeSeries.DEFAULT_RANGE_DESCRIPTION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Value" + "'", str0, "Value");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(regularTimePeriod23, 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.add(timeSeriesDataItem22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries3.addOrUpdate(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        timeSeries7.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.update((int) (byte) 10, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(true);
        timeSeries3.removeAgedItems(false);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.setMaximumItemCount(100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries3.getValue(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod5, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries3.getDataItem(regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        boolean boolean20 = timeSeries18.getNotify();
        double double21 = timeSeries18.getMaxY();
        java.util.List list22 = timeSeries18.getItems();
        timeSeries3.data = list22;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = timeSeries3.getTimePeriod((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.setMaximumItemCount(100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.getRawDataItem(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.lang.Class class29 = timeSeries15.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries33.addAndOrUpdate(timeSeries37);
        boolean boolean39 = timeSeries37.getNotify();
        double double40 = timeSeries37.getMaxY();
        java.util.List list41 = timeSeries37.getItems();
        java.util.Collection collection42 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries37);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries46.setNotify(false);
        java.lang.Comparable comparable49 = timeSeries46.getKey();
        timeSeries46.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries55.addAndOrUpdate(timeSeries59);
        timeSeries55.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries71 = timeSeries66.addAndOrUpdate(timeSeries70);
        boolean boolean72 = timeSeries70.getNotify();
        double double73 = timeSeries70.getMaxY();
        java.util.List list74 = timeSeries70.getItems();
        timeSeries55.data = list74;
        timeSeries46.data = list74;
        timeSeries37.data = list74;
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + (-1.0f) + "'", comparable49, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries60);
        org.junit.Assert.assertNotNull(timeSeries71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertNotNull(list74);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries3.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod13, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries17);
        java.lang.String str23 = timeSeries17.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = timeSeries17.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) Double.NaN, "Time", "hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries3.getRawDataItem(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        timeSeries7.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries7.addOrUpdate(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1.0f) + "'", comparable9, (-1.0f));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(timeSeriesDataItem29, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries9.addAndOrUpdate(timeSeries13);
        timeSeries9.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries9.removeChangeListener(seriesChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries19.getDataItem(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        int int11 = timeSeries7.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries15.setNotify(false);
        java.lang.Comparable comparable18 = timeSeries15.getKey();
        java.lang.Class<?> wildcardClass19 = comparable18.getClass();
        timeSeries7.timePeriodClass = wildcardClass19;
        timeSeries7.removeAgedItems(100L, false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.update((int) '#', (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (-1.0f) + "'", comparable18, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries3.getValue(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = timeSeries15.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries17);
        java.lang.String str23 = timeSeries17.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries15.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod19, (java.lang.Number) 100.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete((int) (byte) 100, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries12.addAndOrUpdate(timeSeries16);
        timeSeries12.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries23.addAndOrUpdate(timeSeries27);
        boolean boolean29 = timeSeries27.getNotify();
        double double30 = timeSeries27.getMaxY();
        java.util.List list31 = timeSeries27.getItems();
        timeSeries12.data = list31;
        timeSeries3.data = list31;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int35 = timeSeries3.getIndex(regularTimePeriod34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod9, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = timeSeries1.getDataItem(regularTimePeriod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        java.util.List list11 = timeSeries7.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries7.getValue(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        boolean boolean11 = timeSeries3.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.getDataItem(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.removeAgedItems(false);
        double double7 = timeSeries3.getMinY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete((int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries7.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        timeSeries7.setNotify(false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries7.addOrUpdate(timeSeriesDataItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries12.addAndOrUpdate(timeSeries16);
        boolean boolean18 = timeSeries16.getNotify();
        double double19 = timeSeries16.getMaxY();
        java.util.List list20 = timeSeries16.getItems();
        timeSeries3.data = list20;
        timeSeries3.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = timeSeries3.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.util.Collection collection12 = timeSeries3.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) 'a', (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.setDomainDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        java.lang.Class class22 = timeSeries16.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries26.addAndOrUpdate(timeSeries30);
        java.lang.Comparable comparable32 = timeSeries30.getKey();
        timeSeries30.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries16.addAndOrUpdate(timeSeries30);
        java.lang.String str36 = timeSeries30.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries3.addAndOrUpdate(timeSeries30);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (-1.0f) + "'", comparable32, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries3.createCopy(regularTimePeriod11, regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries7.createCopy(regularTimePeriod13, regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        java.util.List list22 = timeSeries3.getItems();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = timeSeries3.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod11, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries3.addOrUpdate(regularTimePeriod7, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.lang.Class class29 = timeSeries15.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod30, (java.lang.Number) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class29);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        boolean boolean22 = timeSeries20.getNotify();
        double double23 = timeSeries20.getMaxY();
        int int24 = timeSeries20.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries28.setNotify(false);
        java.lang.Comparable comparable31 = timeSeries28.getKey();
        java.lang.Class<?> wildcardClass32 = comparable31.getClass();
        timeSeries20.timePeriodClass = wildcardClass32;
        timeSeries7.timePeriodClass = wildcardClass32;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod35, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (-1.0f) + "'", comparable31, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries9.addAndOrUpdate(timeSeries13);
        timeSeries9.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries9.removeChangeListener(seriesChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(timeSeriesDataItem20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod10, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod6, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.util.Collection collection12 = timeSeries3.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.createCopy(regularTimePeriod13, regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries7.addAndOrUpdate(timeSeries11);
        timeSeries7.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries7.addAndOrUpdate(timeSeries18);
        java.util.Collection collection26 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        java.lang.String str27 = timeSeries18.getRangeDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.add(timeSeriesDataItem28, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries7.addAndOrUpdate(timeSeries11);
        timeSeries7.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries7.addAndOrUpdate(timeSeries18);
        java.util.Collection collection26 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        java.lang.String str27 = timeSeries18.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries18.getDataItem(regularTimePeriod28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries17);
        java.lang.String str23 = timeSeries17.getRangeDescription();
        timeSeries17.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = timeSeries17.getIndex(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.lang.String str9 = timeSeries3.getDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.getRawDataItem((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.removeAgedItems((long) (byte) -1, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod16, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = timeSeries1.getDataItem((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = timeSeries1.addOrUpdate(timeSeriesDataItem2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "hi!", "Time");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (byte) 100, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.createCopy((int) (short) 1, (int) (byte) 1);
        boolean boolean25 = timeSeries24.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries24.addOrUpdate(regularTimePeriod26, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "hi!", "Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = timeSeries3.getTimePeriod((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        boolean boolean20 = timeSeries18.getNotify();
        double double21 = timeSeries18.getMaxY();
        java.util.List list22 = timeSeries18.getItems();
        timeSeries3.data = list22;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod4, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries9.addAndOrUpdate(timeSeries13);
        timeSeries9.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries9.removeChangeListener(seriesChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(timeSeriesDataItem20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries3.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod23, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        java.util.List list13 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries3.createCopy((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries9.addAndOrUpdate(timeSeries13);
        timeSeries9.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries9.removeChangeListener(seriesChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, (java.lang.Number) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timeSeries7.clone();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.update((int) (byte) 10, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries3.removeChangeListener(seriesChangeListener30);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries3.addOrUpdate(timeSeriesDataItem32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean5 = timeSeries1.equals((java.lang.Object) 0L);
        timeSeries1.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod8, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries3.removeChangeListener(seriesChangeListener30);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod32, (double) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timeSeries7.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries7.createCopy(regularTimePeriod12, regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.lang.Class class29 = timeSeries15.timePeriodClass;
        timeSeries15.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = timeSeries15.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class29);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries7.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        boolean boolean20 = timeSeries18.getNotify();
        double double21 = timeSeries18.getMaxY();
        java.util.List list22 = timeSeries18.getItems();
        timeSeries7.data = list22;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(timeSeriesDataItem24, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries17);
        java.lang.String str23 = timeSeries17.getRangeDescription();
        java.lang.Class class24 = timeSeries17.timePeriodClass;
        timeSeries17.setMaximumItemAge((long) 1);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(class24);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod14, (java.lang.Number) (-1L), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod8, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeSeries8.getIndex(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.add(timeSeriesDataItem23, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        java.lang.Class class22 = timeSeries16.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries26.addAndOrUpdate(timeSeries30);
        java.lang.Comparable comparable32 = timeSeries30.getKey();
        timeSeries30.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries16.addAndOrUpdate(timeSeries30);
        java.lang.String str36 = timeSeries30.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries3.addAndOrUpdate(timeSeries30);
        java.lang.Class class38 = timeSeries3.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod39, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (-1.0f) + "'", comparable32, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNull(class38);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        timeSeries3.setMaximumItemAge((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries25 = timeSeries3.createCopy((int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.lang.Class class29 = timeSeries15.timePeriodClass;
        timeSeries15.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = timeSeries15.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class29);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        java.lang.Class class4 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod5, (double) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean5 = timeSeries1.equals((java.lang.Object) 0L);
        timeSeries1.removeAgedItems(false);
        timeSeries1.clear();
        java.lang.Object obj9 = timeSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod9, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, "", "Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        double double7 = timeSeries3.getMaxY();
        timeSeries3.setDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod10, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener21);
        long long23 = timeSeries14.getMaximumItemAge();
        java.util.List list24 = timeSeries14.getItems();
        java.util.Collection collection25 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = timeSeries3.getValue(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        boolean boolean6 = timeSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (double) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        java.util.List list22 = timeSeries3.getItems();
        java.lang.String str23 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod24, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries9.addAndOrUpdate(timeSeries13);
        timeSeries9.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries9.removeChangeListener(seriesChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.delete(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries7.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        boolean boolean20 = timeSeries18.getNotify();
        double double21 = timeSeries18.getMaxY();
        java.util.List list22 = timeSeries18.getItems();
        timeSeries7.data = list22;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = timeSeries7.getValue(regularTimePeriod24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        java.util.Collection collection13 = timeSeries7.getTimePeriods();
        double double14 = timeSeries7.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries7.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        java.lang.Class class22 = timeSeries16.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries26.addAndOrUpdate(timeSeries30);
        java.lang.Comparable comparable32 = timeSeries30.getKey();
        timeSeries30.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries16.addAndOrUpdate(timeSeries30);
        java.lang.String str36 = timeSeries30.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries3.addAndOrUpdate(timeSeries30);
        java.lang.Class class38 = timeSeries3.timePeriodClass;
        java.lang.Object obj39 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries3.addOrUpdate(regularTimePeriod40, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (-1.0f) + "'", comparable32, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNull(class38);
        org.junit.Assert.assertNotNull(obj39);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod10, 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries7.setMaximumItemAge((long) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod11, (java.lang.Number) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        timeSeries3.clear();
        java.lang.Class class14 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod15, (double) 2147483647, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(class14);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        java.util.List list22 = timeSeries3.getItems();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener23);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries3.getRawDataItem(regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection16 = timeSeries3.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries3.getDataItem(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        timeSeries3.clear();
        java.lang.Class class14 = timeSeries3.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries17 = timeSeries3.createCopy(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(class14);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries3.removeChangeListener(seriesChangeListener30);
        java.lang.Class class32 = timeSeries3.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries3.getRawDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class32);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries7.addAndOrUpdate(timeSeries11);
        timeSeries7.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries7.addAndOrUpdate(timeSeries18);
        java.util.Collection collection26 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries32.addAndOrUpdate(timeSeries36);
        timeSeries32.removeAgedItems(false);
        java.lang.String str40 = timeSeries32.getDomainDescription();
        java.util.Collection collection41 = timeSeries32.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries18.addAndOrUpdate(timeSeries32);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries42.addOrUpdate(regularTimePeriod43, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        timeSeries16.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries16.removeChangeListener(seriesChangeListener24);
        timeSeries16.removeAgedItems((long) (byte) -1, false);
        java.lang.Class<?> wildcardClass29 = timeSeries16.getClass();
        timeSeries3.timePeriodClass = wildcardClass29;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries34.addAndOrUpdate(timeSeries38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries38.addPropertyChangeListener(propertyChangeListener40);
        java.lang.Object obj42 = timeSeries38.clone();
        java.util.List list43 = timeSeries38.data;
        timeSeries3.data = list43;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem46 = timeSeries3.getDataItem(regularTimePeriod45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(list43);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.removeAgedItems((long) (byte) -1, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.update((int) '4', (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        timeSeries3.clear();
        java.lang.Class class14 = timeSeries3.getTimePeriodClass();
        timeSeries3.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries3.addOrUpdate(regularTimePeriod17, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(class14);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        boolean boolean11 = timeSeries3.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = timeSeries3.getIndex(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries12.addAndOrUpdate(timeSeries16);
        timeSeries12.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries23.addAndOrUpdate(timeSeries27);
        boolean boolean29 = timeSeries27.getNotify();
        double double30 = timeSeries27.getMaxY();
        java.util.List list31 = timeSeries27.getItems();
        timeSeries12.data = list31;
        timeSeries3.data = list31;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        java.lang.Number number35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod34, number35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.setDomainDescription("");
        int int13 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries3.createCopy(regularTimePeriod14, regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        java.util.Collection collection13 = timeSeries7.getTimePeriods();
        double double14 = timeSeries7.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean24 = timeSeries22.getNotify();
        double double25 = timeSeries22.getMaxY();
        int int26 = timeSeries22.getItemCount();
        double double27 = timeSeries22.getMinY();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries31.addAndOrUpdate(timeSeries35);
        boolean boolean37 = timeSeries35.getNotify();
        double double38 = timeSeries35.getMaxY();
        int int39 = timeSeries35.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries43.setNotify(false);
        java.lang.Comparable comparable46 = timeSeries43.getKey();
        java.lang.Class<?> wildcardClass47 = comparable46.getClass();
        timeSeries35.timePeriodClass = wildcardClass47;
        timeSeries22.timePeriodClass = wildcardClass47;
        timeSeries7.timePeriodClass = wildcardClass47;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem53 = timeSeries7.addOrUpdate(regularTimePeriod51, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + (-1.0f) + "'", comparable46, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.util.Collection collection12 = timeSeries3.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries3.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries15.setRangeDescription("Time");
        java.util.List list31 = timeSeries15.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries15.getRawDataItem(regularTimePeriod32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries7.addOrUpdate(regularTimePeriod10, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1.0f) + "'", comparable9, (-1.0f));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        int int11 = timeSeries7.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.delete(regularTimePeriod29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        timeSeries16.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries16.removeChangeListener(seriesChangeListener24);
        timeSeries16.removeAgedItems((long) (byte) -1, false);
        java.lang.Class<?> wildcardClass29 = timeSeries16.getClass();
        timeSeries3.timePeriodClass = wildcardClass29;
        boolean boolean31 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries3.getDataItem(regularTimePeriod32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        java.lang.Class class22 = timeSeries16.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries26.addAndOrUpdate(timeSeries30);
        java.lang.Comparable comparable32 = timeSeries30.getKey();
        timeSeries30.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries16.addAndOrUpdate(timeSeries30);
        java.lang.String str36 = timeSeries30.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries3.addAndOrUpdate(timeSeries30);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries40 = timeSeries30.createCopy(regularTimePeriod38, regularTimePeriod39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (-1.0f) + "'", comparable32, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        timeSeries3.setMaximumItemAge((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries3.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries7.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        java.util.Collection collection13 = timeSeries7.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod14, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries8.setDomainDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries8.getRawDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        int int11 = timeSeries7.getItemCount();
        timeSeries7.removeAgedItems((long) (short) 0, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries7.addOrUpdate(timeSeriesDataItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        timeSeries7.setNotify(false);
        int int15 = timeSeries7.getItemCount();
        java.lang.Class class16 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.update(regularTimePeriod17, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(class16);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.setMaximumItemCount(100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries3.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Object obj8 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries3.addOrUpdate(regularTimePeriod9, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries15.getRawDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries3.removeChangeListener(seriesChangeListener30);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod32, (java.lang.Number) 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod7, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        java.util.List list12 = timeSeries3.data;
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = timeSeries3.getIndex(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries3.getRawDataItem(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries3.createCopy(1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) '#', (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.setMaximumItemCount(100);
        boolean boolean14 = timeSeries3.equals((java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries3.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timeSeries7.clone();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        java.lang.Class class21 = timeSeries15.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries15.addPropertyChangeListener(propertyChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries27.addAndOrUpdate(timeSeries31);
        timeSeries27.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries27.removeChangeListener(seriesChangeListener35);
        timeSeries27.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection40 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries7.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod42 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.update(regularTimePeriod42, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNull(class21);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(timeSeries41);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.lang.Class class29 = timeSeries15.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries33.addAndOrUpdate(timeSeries37);
        boolean boolean39 = timeSeries37.getNotify();
        double double40 = timeSeries37.getMaxY();
        java.util.List list41 = timeSeries37.getItems();
        java.util.Collection collection42 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries37);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries45 = timeSeries15.createCopy(regularTimePeriod43, regularTimePeriod44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.removeAgedItems((long) (byte) -1, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries3.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries7.setMaximumItemAge((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries3.addOrUpdate(timeSeriesDataItem4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy(2147483647, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        timeSeries16.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries16.removeChangeListener(seriesChangeListener24);
        timeSeries16.removeAgedItems((long) (byte) -1, false);
        java.lang.Class<?> wildcardClass29 = timeSeries16.getClass();
        timeSeries3.timePeriodClass = wildcardClass29;
        boolean boolean31 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(2147483647, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        timeSeries3.removeAgedItems(true);
        java.lang.String str12 = timeSeries3.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries3.createCopy(regularTimePeriod13, regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries9.addAndOrUpdate(timeSeries13);
        timeSeries9.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries9.removeChangeListener(seriesChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.addAndOrUpdate(timeSeries9);
        long long20 = timeSeries9.getMaximumItemAge();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(timeSeriesDataItem21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        timeSeries7.setKey((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries7.removePropertyChangeListener(propertyChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries7.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1.0f) + "'", comparable9, (-1.0f));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        timeSeries3.setRangeDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod19, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod15, (java.lang.Number) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        java.util.List list13 = timeSeries3.getItems();
        timeSeries3.removeAgedItems((long) (byte) 10, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries3.getDataItem(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries3.createCopy(1, (int) (byte) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries9.getRawDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        timeSeries16.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries16.removeChangeListener(seriesChangeListener24);
        timeSeries16.removeAgedItems((long) (byte) -1, false);
        java.lang.Class<?> wildcardClass29 = timeSeries16.getClass();
        timeSeries3.timePeriodClass = wildcardClass29;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries34.addAndOrUpdate(timeSeries38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries38.addPropertyChangeListener(propertyChangeListener40);
        java.lang.Object obj42 = timeSeries38.clone();
        java.util.List list43 = timeSeries38.data;
        timeSeries3.data = list43;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries3.addOrUpdate(regularTimePeriod45, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(list43);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.add(regularTimePeriod22, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries15.setRangeDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries15.getRawDataItem((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.addOrUpdate(regularTimePeriod11, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        timeSeries16.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries16.removeChangeListener(seriesChangeListener24);
        timeSeries16.removeAgedItems((long) (byte) -1, false);
        java.lang.Class<?> wildcardClass29 = timeSeries16.getClass();
        timeSeries3.timePeriodClass = wildcardClass29;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries34.addAndOrUpdate(timeSeries38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries38.addPropertyChangeListener(propertyChangeListener40);
        java.lang.Object obj42 = timeSeries38.clone();
        java.util.List list43 = timeSeries38.data;
        timeSeries3.data = list43;
        java.lang.Comparable comparable45 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.setKey(comparable45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(list43);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.fireSeriesChanged();
        timeSeries3.clear();
        timeSeries3.clear();
        boolean boolean14 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        java.util.List list22 = timeSeries3.getItems();
        java.lang.String str23 = timeSeries3.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number25 = timeSeries3.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.String str9 = timeSeries3.getDescription();
        boolean boolean10 = timeSeries3.isEmpty();
        timeSeries3.setKey((java.lang.Comparable) "Overwritten values from: -1.0");
        double double13 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems((long) 0, true);
        boolean boolean17 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = timeSeries3.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries3.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.createCopy((int) (short) 1, (int) (byte) 1);
        boolean boolean25 = timeSeries24.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = timeSeries24.getValue(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        int int11 = timeSeries7.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries15.setNotify(false);
        java.lang.Comparable comparable18 = timeSeries15.getKey();
        java.lang.Class<?> wildcardClass19 = comparable18.getClass();
        timeSeries7.timePeriodClass = wildcardClass19;
        timeSeries7.removeAgedItems(100L, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = timeSeries7.getIndex(regularTimePeriod24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (-1.0f) + "'", comparable18, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries7.addAndOrUpdate(timeSeries11);
        timeSeries7.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries7.addAndOrUpdate(timeSeries18);
        java.util.Collection collection26 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries32.addAndOrUpdate(timeSeries36);
        timeSeries32.removeAgedItems(false);
        java.lang.String str40 = timeSeries32.getDomainDescription();
        java.util.Collection collection41 = timeSeries32.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries18.addAndOrUpdate(timeSeries32);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.add(regularTimePeriod43, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(timeSeries42);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries17);
        java.lang.String str23 = timeSeries17.getRangeDescription();
        timeSeries17.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries17.getDataItem(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries9.addAndOrUpdate(timeSeries13);
        timeSeries9.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries9.removeChangeListener(seriesChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.addAndOrUpdate(timeSeries9);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setNotify(false);
        timeSeries7.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.setMaximumItemAge((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries12.addAndOrUpdate(timeSeries16);
        boolean boolean18 = timeSeries16.getNotify();
        double double19 = timeSeries16.getMaxY();
        java.util.List list20 = timeSeries16.getItems();
        timeSeries3.data = list20;
        timeSeries3.setNotify(true);
        java.lang.Class class24 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod25, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNull(class24);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries17);
        java.lang.String str23 = timeSeries17.getRangeDescription();
        java.util.List list24 = timeSeries17.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.update(regularTimePeriod25, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        timeSeries7.setNotify(false);
        int int15 = timeSeries7.getItemCount();
        java.lang.Class class16 = timeSeries7.getTimePeriodClass();
        java.lang.String str17 = timeSeries7.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries7.getRawDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        int int11 = timeSeries7.getItemCount();
        timeSeries7.removeAgedItems((long) (short) 0, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate(regularTimePeriod15, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod12, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries9.addAndOrUpdate(timeSeries13);
        timeSeries9.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries9.removeChangeListener(seriesChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy(regularTimePeriod20, regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = timeSeries3.getTimePeriod(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries3.addAndOrUpdate(timeSeries18);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries7.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        boolean boolean20 = timeSeries18.getNotify();
        double double21 = timeSeries18.getMaxY();
        java.util.List list22 = timeSeries18.getItems();
        timeSeries7.data = list22;
        java.lang.Comparable comparable24 = timeSeries7.getKey();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries28.addAndOrUpdate(timeSeries32);
        boolean boolean34 = timeSeries32.getNotify();
        double double35 = timeSeries32.getMaxY();
        timeSeries32.setMaximumItemCount(1);
        timeSeries32.setNotify(false);
        int int40 = timeSeries32.getItemCount();
        timeSeries32.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries7.addAndOrUpdate(timeSeries32);
        int int44 = timeSeries7.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (-1.0f) + "'", comparable24, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        timeSeries7.setDomainDescription("hi!");
        java.util.List list12 = timeSeries7.data;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(timeSeriesDataItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries15.setNotify(true);
        int int19 = timeSeries15.getMaximumItemCount();
        timeSeries15.setDomainDescription("Value");
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean5 = timeSeries1.equals((java.lang.Object) 0L);
        timeSeries1.removeAgedItems(false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        timeSeries16.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries16.removeChangeListener(seriesChangeListener24);
        timeSeries16.removeAgedItems((long) (byte) -1, false);
        java.lang.Class<?> wildcardClass29 = timeSeries16.getClass();
        timeSeries3.timePeriodClass = wildcardClass29;
        boolean boolean31 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries3.addOrUpdate(regularTimePeriod32, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection16 = timeSeries3.getTimePeriods();
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection20 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        timeSeries7.setKey((java.lang.Comparable) 'a');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries7.getRawDataItem(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1.0f) + "'", comparable9, (-1.0f));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.removeAgedItems((long) (byte) -1, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod16, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.getDataItem(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        timeSeries16.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries16.removeChangeListener(seriesChangeListener24);
        timeSeries16.removeAgedItems((long) (byte) -1, false);
        java.lang.Class<?> wildcardClass29 = timeSeries16.getClass();
        timeSeries3.timePeriodClass = wildcardClass29;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries34.addAndOrUpdate(timeSeries38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries38.addPropertyChangeListener(propertyChangeListener40);
        java.lang.Object obj42 = timeSeries38.clone();
        java.util.List list43 = timeSeries38.data;
        timeSeries3.data = list43;
        java.lang.String str45 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries49.addAndOrUpdate(timeSeries53);
        java.lang.Class class55 = timeSeries49.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries49.removeChangeListener(seriesChangeListener56);
        java.util.List list58 = timeSeries49.data;
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries3.addAndOrUpdate(timeSeries49);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem60 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries59.add(timeSeriesDataItem60, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNull(class55);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(timeSeries59);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries7.addAndOrUpdate(timeSeries11);
        timeSeries7.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries7.addAndOrUpdate(timeSeries18);
        java.util.Collection collection26 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.add(regularTimePeriod27, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        java.lang.Object obj14 = timeSeries3.clone();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries16.setNotify(false);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries23.addAndOrUpdate(timeSeries27);
        java.util.Collection collection29 = timeSeries16.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        boolean boolean30 = timeSeries7.equals((java.lang.Object) collection29);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = timeSeries7.getIndex(regularTimePeriod31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        java.util.List list22 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = timeSeries3.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        java.lang.Class class22 = timeSeries16.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries26.addAndOrUpdate(timeSeries30);
        java.lang.Comparable comparable32 = timeSeries30.getKey();
        timeSeries30.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries16.addAndOrUpdate(timeSeries30);
        java.lang.String str36 = timeSeries30.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries3.addAndOrUpdate(timeSeries30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number39 = timeSeries3.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (-1.0f) + "'", comparable32, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        int int11 = timeSeries7.getItemCount();
        timeSeries7.removeAgedItems((long) (short) 0, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod15, (double) 2147483647, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries17);
        java.lang.String str23 = timeSeries17.getRangeDescription();
        java.lang.Class class24 = timeSeries17.timePeriodClass;
        timeSeries17.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries17.getDataItem(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(class24);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        timeSeries7.setNotify(false);
        int int15 = timeSeries7.getItemCount();
        java.lang.Class class16 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(timeSeriesDataItem17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(class16);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        timeSeries7.setKey((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete((int) (short) 10, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1.0f) + "'", comparable9, (-1.0f));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.String str9 = timeSeries3.getDescription();
        boolean boolean10 = timeSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries3.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries15.setMaximumItemAge((long) 0);
        java.lang.Comparable comparable19 = timeSeries15.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod20, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + "Overwritten values from: -1.0" + "'", comparable19, "Overwritten values from: -1.0");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries15.setNotify(true);
        int int19 = timeSeries15.getMaximumItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(timeSeriesDataItem20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries7.addAndOrUpdate(timeSeries11);
        timeSeries7.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries7.addAndOrUpdate(timeSeries18);
        java.util.Collection collection26 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        timeSeries18.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.delete((int) '#', (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeSeries3.getIndex(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        double double7 = timeSeries3.getMaxY();
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries12.addAndOrUpdate(timeSeries16);
        timeSeries12.removeAgedItems(false);
        java.lang.String str20 = timeSeries12.getDomainDescription();
        java.lang.Object obj21 = timeSeries12.clone();
        double double22 = timeSeries12.getMinY();
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries3.addAndOrUpdate(timeSeries12);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(timeSeriesDataItem24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        timeSeries3.setDomainDescription("Overwritten values from: -1.0");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.getRawDataItem(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries3.addAndOrUpdate(timeSeries18);
        long long26 = timeSeries18.getMaximumItemAge();
        timeSeries18.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = timeSeries18.getTimePeriod((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9223372036854775807L + "'", long26 == 9223372036854775807L);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries9.addAndOrUpdate(timeSeries13);
        timeSeries9.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries9.removeChangeListener(seriesChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.addAndOrUpdate(timeSeries9);
        long long20 = timeSeries9.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = timeSeries9.getValue(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        java.util.List list13 = timeSeries7.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries7.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.getRawDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        java.util.List list13 = timeSeries3.getItems();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries3.addOrUpdate(regularTimePeriod15, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (-1.0f) + "'", comparable14, (-1.0f));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.fireSeriesChanged();
        timeSeries3.clear();
        timeSeries3.setMaximumItemCount((int) (byte) 100);
        timeSeries3.setDomainDescription("Overwritten values from: -1.0");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries7.addAndOrUpdate(timeSeries11);
        timeSeries7.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries7.addAndOrUpdate(timeSeries18);
        java.util.Collection collection26 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries3.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries3.createCopy((int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod11, (java.lang.Number) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        timeSeries7.setKey((java.lang.Comparable) 'a');
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete((int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1.0f) + "'", comparable9, (-1.0f));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        int int4 = timeSeries1.getMaximumItemCount();
        double double5 = timeSeries1.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod6, (double) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        java.lang.Class class22 = timeSeries16.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries26.addAndOrUpdate(timeSeries30);
        java.lang.Comparable comparable32 = timeSeries30.getKey();
        timeSeries30.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries16.addAndOrUpdate(timeSeries30);
        java.lang.String str36 = timeSeries30.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries3.addAndOrUpdate(timeSeries30);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries30.removeChangeListener(seriesChangeListener38);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries30.delete((int) (short) 10, 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (-1.0f) + "'", comparable32, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.lang.Class class29 = timeSeries15.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries33.addAndOrUpdate(timeSeries37);
        boolean boolean39 = timeSeries37.getNotify();
        double double40 = timeSeries37.getMaxY();
        java.util.List list41 = timeSeries37.getItems();
        java.util.Collection collection42 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries37);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries37.removePropertyChangeListener(propertyChangeListener43);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean5 = timeSeries1.equals((java.lang.Object) 0L);
        timeSeries1.removeAgedItems(false);
        timeSeries1.clear();
        java.lang.Object obj9 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class19 = timeSeries13.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries23.addAndOrUpdate(timeSeries27);
        java.lang.Comparable comparable29 = timeSeries27.getKey();
        timeSeries27.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries13.addAndOrUpdate(timeSeries27);
        java.lang.String str33 = timeSeries27.getRangeDescription();
        timeSeries27.setNotify(true);
        java.lang.Comparable comparable36 = timeSeries27.getKey();
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj41 = timeSeries40.clone();
        timeSeries40.clear();
        java.util.List list43 = timeSeries40.getItems();
        double double44 = timeSeries40.getMaxY();
        java.lang.Class class45 = timeSeries40.getTimePeriodClass();
        java.lang.Class<?> wildcardClass46 = timeSeries40.getClass();
        timeSeries27.timePeriodClass = wildcardClass46;
        boolean boolean48 = timeSeries1.equals((java.lang.Object) wildcardClass46);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod49, (double) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + (-1.0f) + "'", comparable29, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + (short) 0 + "'", comparable36, (short) 0);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNull(class45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries7.addAndOrUpdate(timeSeries11);
        timeSeries7.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries7.addAndOrUpdate(timeSeries18);
        java.util.Collection collection26 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries32.addAndOrUpdate(timeSeries36);
        timeSeries32.removeAgedItems(false);
        java.lang.String str40 = timeSeries32.getDomainDescription();
        java.util.Collection collection41 = timeSeries32.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries18.addAndOrUpdate(timeSeries32);
        boolean boolean43 = timeSeries42.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries42.update(regularTimePeriod44, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        java.lang.String str10 = timeSeries7.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries7.getValue(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1.0f) + "'", comparable9, (-1.0f));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        double double7 = timeSeries3.getMaxY();
        timeSeries3.setDescription("hi!");
        java.util.Collection collection10 = timeSeries3.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        java.util.Collection collection13 = timeSeries7.getTimePeriods();
        double double14 = timeSeries7.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.String str24 = timeSeries18.getDescription();
        boolean boolean25 = timeSeries18.isEmpty();
        timeSeries18.setKey((java.lang.Comparable) "Overwritten values from: -1.0");
        double double28 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries7.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.add(regularTimePeriod30, (java.lang.Number) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(timeSeries29);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod14, (double) 2147483647, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "hi!", "Time");
        timeSeries3.setDomainDescription("");
        timeSeries3.setRangeDescription("Overwritten values from: -1.0");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries17);
        int int23 = timeSeries22.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries22.addOrUpdate(timeSeriesDataItem24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timeSeries7.clone();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        java.lang.Class class21 = timeSeries15.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries15.addPropertyChangeListener(propertyChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries27.addAndOrUpdate(timeSeries31);
        timeSeries27.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries27.removeChangeListener(seriesChangeListener35);
        timeSeries27.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection40 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries7.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod42 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod42, (double) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNull(class21);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(timeSeries41);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries3.getValue(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        java.util.List list12 = timeSeries3.data;
        timeSeries3.clear();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener14);
        timeSeries3.setRangeDescription("Value");
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries15.setRangeDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod31, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        int int11 = timeSeries7.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries15.setNotify(false);
        java.lang.Comparable comparable18 = timeSeries15.getKey();
        java.lang.Class<?> wildcardClass19 = comparable18.getClass();
        timeSeries7.timePeriodClass = wildcardClass19;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = timeSeries7.getValue(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (-1.0f) + "'", comparable18, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries5.addAndOrUpdate(timeSeries9);
        boolean boolean11 = timeSeries9.getNotify();
        double double12 = timeSeries9.getMaxY();
        int int13 = timeSeries9.getItemCount();
        double double14 = timeSeries9.getMinY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean24 = timeSeries22.getNotify();
        double double25 = timeSeries22.getMaxY();
        int int26 = timeSeries22.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries30.setNotify(false);
        java.lang.Comparable comparable33 = timeSeries30.getKey();
        java.lang.Class<?> wildcardClass34 = comparable33.getClass();
        timeSeries22.timePeriodClass = wildcardClass34;
        timeSeries9.timePeriodClass = wildcardClass34;
        timeSeries1.timePeriodClass = wildcardClass34;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + (-1.0f) + "'", comparable33, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        boolean boolean22 = timeSeries14.getNotify();
        java.lang.Object obj23 = timeSeries14.clone();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.String str9 = timeSeries3.getDescription();
        boolean boolean10 = timeSeries3.isEmpty();
        timeSeries3.setKey((java.lang.Comparable) "Overwritten values from: -1.0");
        double double13 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems((long) 0, true);
        boolean boolean17 = timeSeries3.getNotify();
        timeSeries3.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries3.getRawDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        double double10 = timeSeries3.getMinY();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries15.setNotify(true);
        timeSeries15.removeAgedItems(9223372036854775807L, true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries15.getRawDataItem(regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries7.addAndOrUpdate(timeSeries11);
        timeSeries7.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries7.addAndOrUpdate(timeSeries18);
        java.util.Collection collection26 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries3.getDataItem(regularTimePeriod27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        java.lang.Class class22 = timeSeries16.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries26.addAndOrUpdate(timeSeries30);
        java.lang.Comparable comparable32 = timeSeries30.getKey();
        timeSeries30.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries16.addAndOrUpdate(timeSeries30);
        java.lang.String str36 = timeSeries30.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries3.addAndOrUpdate(timeSeries30);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem40 = timeSeries37.addOrUpdate(regularTimePeriod38, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (-1.0f) + "'", comparable32, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.lang.String str29 = timeSeries15.getRangeDescription();
        java.lang.Class<?> wildcardClass30 = timeSeries15.getClass();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        java.util.List list12 = timeSeries3.data;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (byte) 100, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timeSeries7.clone();
        java.util.List list12 = timeSeries7.data;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.update((int) (short) -1, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timeSeries7.clone();
        java.util.List list12 = timeSeries7.data;
        timeSeries7.setMaximumItemAge((long) (byte) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.update(regularTimePeriod15, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries7.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        boolean boolean20 = timeSeries18.getNotify();
        double double21 = timeSeries18.getMaxY();
        java.util.List list22 = timeSeries18.getItems();
        timeSeries7.data = list22;
        java.lang.Comparable comparable24 = timeSeries7.getKey();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries28.addAndOrUpdate(timeSeries32);
        boolean boolean34 = timeSeries32.getNotify();
        double double35 = timeSeries32.getMaxY();
        timeSeries32.setMaximumItemCount(1);
        timeSeries32.setNotify(false);
        int int40 = timeSeries32.getItemCount();
        timeSeries32.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries7.addAndOrUpdate(timeSeries32);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int45 = timeSeries43.getIndex(regularTimePeriod44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (-1.0f) + "'", comparable24, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(timeSeries43);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries7.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        boolean boolean20 = timeSeries18.getNotify();
        double double21 = timeSeries18.getMaxY();
        java.util.List list22 = timeSeries18.getItems();
        timeSeries7.data = list22;
        java.lang.Comparable comparable24 = timeSeries7.getKey();
        timeSeries7.setKey((java.lang.Comparable) (byte) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod27, (java.lang.Number) (-1.0f), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (-1.0f) + "'", comparable24, (-1.0f));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener21);
        long long23 = timeSeries14.getMaximumItemAge();
        java.util.List list24 = timeSeries14.getItems();
        java.util.Collection collection25 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = timeSeries14.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        timeSeries3.setMaximumItemAge((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(100, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.removeAgedItems((long) (byte) -1, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean5 = timeSeries1.equals((java.lang.Object) 0L);
        timeSeries1.removeAgedItems(false);
        timeSeries1.clear();
        java.lang.Object obj9 = timeSeries1.clone();
        java.util.List list10 = timeSeries1.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries1.getDataItem(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries3.createCopy(1, (int) (byte) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.update(regularTimePeriod10, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        double double13 = timeSeries3.getMaxY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries3.getDataItem(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, "Time", "Value");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (short) 10, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.util.Collection collection26 = timeSeries18.getTimePeriods();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.add(timeSeriesDataItem27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        timeSeries3.setKey((java.lang.Comparable) (short) 1);
        long long15 = timeSeries3.getMaximumItemAge();
        java.lang.Comparable comparable16 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod17, (double) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9223372036854775807L + "'", long15 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 1 + "'", comparable16, (short) 1);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean5 = timeSeries1.equals((java.lang.Object) 0L);
        timeSeries1.removeAgedItems(false);
        timeSeries1.clear();
        java.lang.Object obj9 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class19 = timeSeries13.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries23.addAndOrUpdate(timeSeries27);
        java.lang.Comparable comparable29 = timeSeries27.getKey();
        timeSeries27.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries13.addAndOrUpdate(timeSeries27);
        java.lang.String str33 = timeSeries27.getRangeDescription();
        timeSeries27.setNotify(true);
        java.lang.Comparable comparable36 = timeSeries27.getKey();
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj41 = timeSeries40.clone();
        timeSeries40.clear();
        java.util.List list43 = timeSeries40.getItems();
        double double44 = timeSeries40.getMaxY();
        java.lang.Class class45 = timeSeries40.getTimePeriodClass();
        java.lang.Class<?> wildcardClass46 = timeSeries40.getClass();
        timeSeries27.timePeriodClass = wildcardClass46;
        boolean boolean48 = timeSeries1.equals((java.lang.Object) wildcardClass46);
        timeSeries1.setMaximumItemCount((int) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod51 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod51, (java.lang.Number) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + (-1.0f) + "'", comparable29, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + (short) 0 + "'", comparable36, (short) 0);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNull(class45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries16.setNotify(false);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries23.addAndOrUpdate(timeSeries27);
        java.util.Collection collection29 = timeSeries16.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        boolean boolean30 = timeSeries7.equals((java.lang.Object) collection29);
        java.lang.Class class31 = timeSeries7.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod32, (java.lang.Number) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(class31);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, (java.lang.Number) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        boolean boolean11 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.addOrUpdate(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        timeSeries3.setRangeDescription("Time");
        int int19 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.createCopy((int) (short) 1, (int) (byte) 1);
        java.util.List list25 = timeSeries24.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries24.delete((int) '#', (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, "", "Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries3.getRawDataItem(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        timeSeries3.clear();
        java.lang.Class class14 = timeSeries3.getTimePeriodClass();
        timeSeries3.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries3.getDataItem(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(class14);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        java.lang.Class class22 = timeSeries16.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries26.addAndOrUpdate(timeSeries30);
        java.lang.Comparable comparable32 = timeSeries30.getKey();
        timeSeries30.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries16.addAndOrUpdate(timeSeries30);
        java.lang.String str36 = timeSeries30.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries3.addAndOrUpdate(timeSeries30);
        java.util.List list38 = timeSeries37.data;
        boolean boolean39 = timeSeries37.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries37.add(regularTimePeriod40, (double) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (-1.0f) + "'", comparable32, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries3.getValue(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries12.addAndOrUpdate(timeSeries16);
        timeSeries12.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries23.addAndOrUpdate(timeSeries27);
        boolean boolean29 = timeSeries27.getNotify();
        double double30 = timeSeries27.getMaxY();
        java.util.List list31 = timeSeries27.getItems();
        timeSeries12.data = list31;
        timeSeries3.data = list31;
        timeSeries3.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int37 = timeSeries3.getIndex(regularTimePeriod36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries3.addAndOrUpdate(timeSeries18);
        long long26 = timeSeries18.getMaximumItemAge();
        java.lang.Class<?> wildcardClass27 = timeSeries18.getClass();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9223372036854775807L + "'", long26 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.setDomainDescription("");
        int int13 = timeSeries3.getItemCount();
        java.lang.Class class14 = timeSeries3.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries3.getRawDataItem(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(class14);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries3.createCopy((int) (short) 1, (int) (byte) 1);
        boolean boolean25 = timeSeries24.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries24.addOrUpdate(timeSeriesDataItem26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.lang.Comparable comparable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries(comparable0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        boolean boolean11 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, "Time", "Value");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries3.addOrUpdate(timeSeriesDataItem4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, "Time", "Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        timeSeries3.removeAgedItems(true);
        timeSeries3.setDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(2147483647, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.lang.String str9 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Class class19 = timeSeries13.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries13.removeChangeListener(seriesChangeListener20);
        java.lang.Class class22 = timeSeries13.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries26.setNotify(false);
        java.lang.Comparable comparable29 = timeSeries26.getKey();
        java.lang.String str30 = timeSeries26.getRangeDescription();
        java.lang.Comparable comparable31 = timeSeries26.getKey();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener32);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries37.addAndOrUpdate(timeSeries41);
        boolean boolean43 = timeSeries41.getNotify();
        double double44 = timeSeries41.getMaxY();
        timeSeries41.setMaximumItemCount(1);
        java.util.Collection collection47 = timeSeries41.getTimePeriods();
        double double48 = timeSeries41.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries52.addAndOrUpdate(timeSeries56);
        boolean boolean58 = timeSeries56.getNotify();
        double double59 = timeSeries56.getMaxY();
        int int60 = timeSeries56.getItemCount();
        double double61 = timeSeries56.getMinY();
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries65.addAndOrUpdate(timeSeries69);
        boolean boolean71 = timeSeries69.getNotify();
        double double72 = timeSeries69.getMaxY();
        int int73 = timeSeries69.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries77 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries77.setNotify(false);
        java.lang.Comparable comparable80 = timeSeries77.getKey();
        java.lang.Class<?> wildcardClass81 = comparable80.getClass();
        timeSeries69.timePeriodClass = wildcardClass81;
        timeSeries56.timePeriodClass = wildcardClass81;
        timeSeries41.timePeriodClass = wildcardClass81;
        timeSeries26.timePeriodClass = wildcardClass81;
        timeSeries13.timePeriodClass = wildcardClass81;
        timeSeries3.timePeriodClass = wildcardClass81;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod88 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod88, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNull(class19);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + (-1.0f) + "'", comparable29, (-1.0f));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (-1.0f) + "'", comparable31, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertNotNull(timeSeries70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertEquals("'" + comparable80 + "' != '" + (-1.0f) + "'", comparable80, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        java.util.List list13 = timeSeries3.getItems();
        timeSeries3.removeAgedItems((long) (byte) 10, false);
        java.lang.String str17 = timeSeries3.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries3.getDataItem(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        java.util.List list11 = timeSeries7.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries7.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        timeSeries16.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries16.removeChangeListener(seriesChangeListener24);
        timeSeries16.removeAgedItems((long) (byte) -1, false);
        java.lang.Class<?> wildcardClass29 = timeSeries16.getClass();
        timeSeries3.timePeriodClass = wildcardClass29;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries34.addAndOrUpdate(timeSeries38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries38.addPropertyChangeListener(propertyChangeListener40);
        java.lang.Object obj42 = timeSeries38.clone();
        java.util.List list43 = timeSeries38.data;
        timeSeries3.data = list43;
        java.lang.String str45 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries49.addAndOrUpdate(timeSeries53);
        java.lang.Class class55 = timeSeries49.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries49.removeChangeListener(seriesChangeListener56);
        java.util.List list58 = timeSeries49.data;
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries3.addAndOrUpdate(timeSeries49);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod60 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries49.add(regularTimePeriod60, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNull(class55);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(timeSeries59);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries3.addAndOrUpdate(timeSeries18);
        long long26 = timeSeries18.getMaximumItemAge();
        timeSeries18.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj33 = timeSeries32.clone();
        timeSeries32.clear();
        java.util.List list35 = timeSeries32.getItems();
        double double36 = timeSeries32.getMaxY();
        timeSeries32.setDescription("hi!");
        java.util.Collection collection39 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        boolean boolean40 = timeSeries32.isEmpty();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9223372036854775807L + "'", long26 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        int int4 = timeSeries1.getMaximumItemCount();
        double double5 = timeSeries1.getMaxY();
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 1 + "'", comparable6, (byte) 1);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries9.addAndOrUpdate(timeSeries13);
        boolean boolean15 = timeSeries13.getNotify();
        double double16 = timeSeries13.getMaxY();
        int int17 = timeSeries13.getItemCount();
        java.util.Collection collection18 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries13.getRawDataItem(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries15.setNotify(true);
        timeSeries15.setMaximumItemCount((int) 'a');
        java.util.Collection collection21 = timeSeries15.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries24 = timeSeries15.createCopy(regularTimePeriod22, regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        int int11 = timeSeries7.getItemCount();
        timeSeries7.removeAgedItems((long) (short) 0, false);
        java.util.Collection collection15 = timeSeries7.getTimePeriods();
        java.lang.Comparable comparable16 = timeSeries7.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (-1.0f) + "'", comparable16, (-1.0f));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        double double7 = timeSeries3.getMaxY();
        timeSeries3.setDescription("hi!");
        java.util.Collection collection10 = timeSeries3.getTimePeriods();
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setNotify(false);
        java.lang.String str13 = timeSeries7.getDescription();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        java.util.Collection collection13 = timeSeries7.getTimePeriods();
        double double14 = timeSeries7.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean24 = timeSeries22.getNotify();
        double double25 = timeSeries22.getMaxY();
        int int26 = timeSeries22.getItemCount();
        double double27 = timeSeries22.getMinY();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries31.addAndOrUpdate(timeSeries35);
        boolean boolean37 = timeSeries35.getNotify();
        double double38 = timeSeries35.getMaxY();
        int int39 = timeSeries35.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries43.setNotify(false);
        java.lang.Comparable comparable46 = timeSeries43.getKey();
        java.lang.Class<?> wildcardClass47 = comparable46.getClass();
        timeSeries35.timePeriodClass = wildcardClass47;
        timeSeries22.timePeriodClass = wildcardClass47;
        timeSeries7.timePeriodClass = wildcardClass47;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries54.addAndOrUpdate(timeSeries58);
        timeSeries54.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener62 = null;
        timeSeries54.removeChangeListener(seriesChangeListener62);
        timeSeries54.setMaximumItemCount(0);
        timeSeries54.setKey((java.lang.Comparable) "Value");
        java.util.Collection collection68 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries54);
        java.lang.Class class69 = timeSeries7.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem71 = timeSeries7.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + (-1.0f) + "'", comparable46, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNotNull(class69);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "", "Time");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        double double7 = timeSeries3.getMaxY();
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries12.addAndOrUpdate(timeSeries16);
        timeSeries12.removeAgedItems(false);
        java.lang.String str20 = timeSeries12.getDomainDescription();
        java.lang.Object obj21 = timeSeries12.clone();
        double double22 = timeSeries12.getMinY();
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries3.addAndOrUpdate(timeSeries12);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod26, (java.lang.Number) 9223372036854775807L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries14.removeChangeListener(seriesChangeListener22);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries14.addOrUpdate(regularTimePeriod24, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        boolean boolean20 = timeSeries18.getNotify();
        double double21 = timeSeries18.getMaxY();
        timeSeries18.setMaximumItemCount(1);
        java.util.Collection collection24 = timeSeries18.getTimePeriods();
        double double25 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries29.addAndOrUpdate(timeSeries33);
        boolean boolean35 = timeSeries33.getNotify();
        double double36 = timeSeries33.getMaxY();
        int int37 = timeSeries33.getItemCount();
        double double38 = timeSeries33.getMinY();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries42.addAndOrUpdate(timeSeries46);
        boolean boolean48 = timeSeries46.getNotify();
        double double49 = timeSeries46.getMaxY();
        int int50 = timeSeries46.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries54.setNotify(false);
        java.lang.Comparable comparable57 = timeSeries54.getKey();
        java.lang.Class<?> wildcardClass58 = comparable57.getClass();
        timeSeries46.timePeriodClass = wildcardClass58;
        timeSeries33.timePeriodClass = wildcardClass58;
        timeSeries18.timePeriodClass = wildcardClass58;
        timeSeries3.timePeriodClass = wildcardClass58;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener63 = null;
        timeSeries3.addChangeListener(seriesChangeListener63);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem66 = timeSeries3.getRawDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + (-1.0f) + "'", comparable57, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        boolean boolean22 = timeSeries20.getNotify();
        double double23 = timeSeries20.getMaxY();
        int int24 = timeSeries20.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries28.setNotify(false);
        java.lang.Comparable comparable31 = timeSeries28.getKey();
        java.lang.Class<?> wildcardClass32 = comparable31.getClass();
        timeSeries20.timePeriodClass = wildcardClass32;
        timeSeries7.timePeriodClass = wildcardClass32;
        long long35 = timeSeries7.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries39.addAndOrUpdate(timeSeries43);
        timeSeries39.removeAgedItems(false);
        timeSeries39.setDescription("Value");
        java.util.Collection collection49 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries53.addAndOrUpdate(timeSeries57);
        boolean boolean59 = timeSeries57.getNotify();
        double double60 = timeSeries57.getMaxY();
        timeSeries57.setMaximumItemCount(1);
        java.util.Collection collection63 = timeSeries57.getTimePeriods();
        double double64 = timeSeries57.getMaxY();
        java.util.Collection collection65 = timeSeries57.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries73 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries74 = timeSeries69.addAndOrUpdate(timeSeries73);
        java.lang.Class class75 = timeSeries69.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener76 = null;
        timeSeries69.addPropertyChangeListener(propertyChangeListener76);
        long long78 = timeSeries69.getMaximumItemAge();
        timeSeries69.setKey((java.lang.Comparable) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries81 = timeSeries57.addAndOrUpdate(timeSeries69);
        java.lang.Object obj82 = timeSeries81.clone();
        java.util.Collection collection83 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries81);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod84 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem85 = timeSeries7.getDataItem(regularTimePeriod84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (-1.0f) + "'", comparable31, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 9223372036854775807L + "'", long35 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNotNull(timeSeries74);
        org.junit.Assert.assertNull(class75);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 9223372036854775807L + "'", long78 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries81);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertNotNull(collection83);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries7.addChangeListener(seriesChangeListener13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries7.removePropertyChangeListener(propertyChangeListener15);
        timeSeries7.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries7.addOrUpdate(regularTimePeriod19, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries3.createCopy(1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries3.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.removeAgedItems((long) (byte) -1, false);
        boolean boolean16 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = timeSeries3.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        java.lang.Class class22 = timeSeries16.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries26.addAndOrUpdate(timeSeries30);
        java.lang.Comparable comparable32 = timeSeries30.getKey();
        timeSeries30.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries16.addAndOrUpdate(timeSeries30);
        java.lang.String str36 = timeSeries30.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries3.addAndOrUpdate(timeSeries30);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries30.removeChangeListener(seriesChangeListener38);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        java.lang.Number number41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries30.addOrUpdate(regularTimePeriod40, number41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (-1.0f) + "'", comparable32, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries7.addAndOrUpdate(timeSeries11);
        timeSeries7.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries7.addAndOrUpdate(timeSeries18);
        java.util.Collection collection26 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener27);
        int int29 = timeSeries18.getMaximumItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.add(timeSeriesDataItem30, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        java.util.List list22 = timeSeries3.getItems();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener23);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = timeSeries3.getIndex(regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries21.removeAgedItems(true);
        java.util.List list24 = timeSeries21.getItems();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries28.addAndOrUpdate(timeSeries32);
        java.lang.Class class34 = timeSeries28.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries28.addPropertyChangeListener(propertyChangeListener35);
        long long37 = timeSeries28.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries41.addAndOrUpdate(timeSeries45);
        timeSeries41.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries41.removeChangeListener(seriesChangeListener49);
        timeSeries41.removeAgedItems((long) (byte) -1, false);
        java.lang.Class<?> wildcardClass54 = timeSeries41.getClass();
        timeSeries28.timePeriodClass = wildcardClass54;
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries59.addAndOrUpdate(timeSeries63);
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        timeSeries63.addPropertyChangeListener(propertyChangeListener65);
        java.lang.Object obj67 = timeSeries63.clone();
        java.util.List list68 = timeSeries63.data;
        timeSeries28.data = list68;
        java.util.Collection collection70 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        java.util.Collection collection71 = timeSeries21.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod72 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.delete(regularTimePeriod72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 9223372036854775807L + "'", long37 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(timeSeries64);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(collection71);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        java.util.Collection collection13 = timeSeries7.getTimePeriods();
        double double14 = timeSeries7.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean24 = timeSeries22.getNotify();
        double double25 = timeSeries22.getMaxY();
        int int26 = timeSeries22.getItemCount();
        double double27 = timeSeries22.getMinY();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries31.addAndOrUpdate(timeSeries35);
        boolean boolean37 = timeSeries35.getNotify();
        double double38 = timeSeries35.getMaxY();
        int int39 = timeSeries35.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries43.setNotify(false);
        java.lang.Comparable comparable46 = timeSeries43.getKey();
        java.lang.Class<?> wildcardClass47 = comparable46.getClass();
        timeSeries35.timePeriodClass = wildcardClass47;
        timeSeries22.timePeriodClass = wildcardClass47;
        timeSeries7.timePeriodClass = wildcardClass47;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries54.addAndOrUpdate(timeSeries58);
        timeSeries54.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener62 = null;
        timeSeries54.removeChangeListener(seriesChangeListener62);
        timeSeries54.setMaximumItemCount(0);
        timeSeries54.setKey((java.lang.Comparable) "Value");
        java.util.Collection collection68 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries54);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries54.update((int) (byte) 1, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + (-1.0f) + "'", comparable46, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertNotNull(collection68);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        timeSeries3.setDomainDescription("Overwritten values from: -1.0");
        java.lang.Comparable comparable13 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries3.getDataItem(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (-1.0f) + "'", comparable13, (-1.0f));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        boolean boolean22 = timeSeries20.getNotify();
        double double23 = timeSeries20.getMaxY();
        int int24 = timeSeries20.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries28.setNotify(false);
        java.lang.Comparable comparable31 = timeSeries28.getKey();
        java.lang.Class<?> wildcardClass32 = comparable31.getClass();
        timeSeries20.timePeriodClass = wildcardClass32;
        timeSeries7.timePeriodClass = wildcardClass32;
        long long35 = timeSeries7.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries39.addAndOrUpdate(timeSeries43);
        timeSeries39.removeAgedItems(false);
        timeSeries39.setDescription("Value");
        java.util.Collection collection49 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries53.addAndOrUpdate(timeSeries57);
        boolean boolean59 = timeSeries57.getNotify();
        double double60 = timeSeries57.getMaxY();
        timeSeries57.setMaximumItemCount(1);
        java.util.Collection collection63 = timeSeries57.getTimePeriods();
        double double64 = timeSeries57.getMaxY();
        java.util.Collection collection65 = timeSeries57.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries73 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries74 = timeSeries69.addAndOrUpdate(timeSeries73);
        java.lang.Class class75 = timeSeries69.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener76 = null;
        timeSeries69.addPropertyChangeListener(propertyChangeListener76);
        long long78 = timeSeries69.getMaximumItemAge();
        timeSeries69.setKey((java.lang.Comparable) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries81 = timeSeries57.addAndOrUpdate(timeSeries69);
        java.lang.Object obj82 = timeSeries81.clone();
        java.util.Collection collection83 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries81);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem85 = timeSeries81.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (-1.0f) + "'", comparable31, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 9223372036854775807L + "'", long35 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(timeSeries58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNotNull(timeSeries74);
        org.junit.Assert.assertNull(class75);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 9223372036854775807L + "'", long78 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries81);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertNotNull(collection83);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries15.setNotify(true);
        timeSeries15.setMaximumItemCount((int) 'a');
        int int21 = timeSeries15.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod22, (java.lang.Number) 9223372036854775807L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        java.lang.Class class22 = timeSeries16.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries26.addAndOrUpdate(timeSeries30);
        java.lang.Comparable comparable32 = timeSeries30.getKey();
        timeSeries30.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries16.addAndOrUpdate(timeSeries30);
        java.lang.String str36 = timeSeries30.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries3.addAndOrUpdate(timeSeries30);
        java.util.List list38 = timeSeries37.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries41 = timeSeries37.createCopy((int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (-1.0f) + "'", comparable32, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.String str9 = timeSeries3.getDescription();
        boolean boolean10 = timeSeries3.isEmpty();
        long long11 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(10, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries7.addAndOrUpdate(timeSeries11);
        timeSeries7.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries7.addAndOrUpdate(timeSeries18);
        java.util.Collection collection26 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener27);
        int int29 = timeSeries18.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries18.addOrUpdate(regularTimePeriod30, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        int int11 = timeSeries7.getItemCount();
        timeSeries7.removeAgedItems((long) (short) 0, false);
        java.util.List list15 = timeSeries7.data;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete(1, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        timeSeries7.setNotify(false);
        long long15 = timeSeries7.getMaximumItemAge();
        timeSeries7.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries7.addOrUpdate(regularTimePeriod18, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9223372036854775807L + "'", long15 == 9223372036854775807L);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries21.removeAgedItems(true);
        java.util.List list24 = timeSeries21.getItems();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries28.addAndOrUpdate(timeSeries32);
        java.lang.Class class34 = timeSeries28.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries28.addPropertyChangeListener(propertyChangeListener35);
        long long37 = timeSeries28.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries41.addAndOrUpdate(timeSeries45);
        timeSeries41.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries41.removeChangeListener(seriesChangeListener49);
        timeSeries41.removeAgedItems((long) (byte) -1, false);
        java.lang.Class<?> wildcardClass54 = timeSeries41.getClass();
        timeSeries28.timePeriodClass = wildcardClass54;
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries59.addAndOrUpdate(timeSeries63);
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        timeSeries63.addPropertyChangeListener(propertyChangeListener65);
        java.lang.Object obj67 = timeSeries63.clone();
        java.util.List list68 = timeSeries63.data;
        timeSeries28.data = list68;
        java.util.Collection collection70 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod71 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem72 = timeSeries28.getRawDataItem(regularTimePeriod71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 9223372036854775807L + "'", long37 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(timeSeries64);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(collection70);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        java.util.List list12 = timeSeries3.data;
        timeSeries3.removeAgedItems(true);
        timeSeries3.setDomainDescription("Overwritten values from: -1.0");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = timeSeries3.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.removeAgedItems((long) (byte) -1, false);
        boolean boolean16 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries3.addOrUpdate(regularTimePeriod17, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        java.util.Collection collection13 = timeSeries7.getTimePeriods();
        double double14 = timeSeries7.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        boolean boolean24 = timeSeries22.getNotify();
        double double25 = timeSeries22.getMaxY();
        int int26 = timeSeries22.getItemCount();
        double double27 = timeSeries22.getMinY();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries31.addAndOrUpdate(timeSeries35);
        boolean boolean37 = timeSeries35.getNotify();
        double double38 = timeSeries35.getMaxY();
        int int39 = timeSeries35.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries43.setNotify(false);
        java.lang.Comparable comparable46 = timeSeries43.getKey();
        java.lang.Class<?> wildcardClass47 = comparable46.getClass();
        timeSeries35.timePeriodClass = wildcardClass47;
        timeSeries22.timePeriodClass = wildcardClass47;
        timeSeries7.timePeriodClass = wildcardClass47;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries54.addAndOrUpdate(timeSeries58);
        timeSeries54.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener62 = null;
        timeSeries54.removeChangeListener(seriesChangeListener62);
        timeSeries54.setMaximumItemCount(0);
        timeSeries54.setKey((java.lang.Comparable) "Value");
        java.util.Collection collection68 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries54);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem70 = timeSeries7.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + (-1.0f) + "'", comparable46, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertNotNull(collection68);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.fireSeriesChanged();
        timeSeries3.clear();
        timeSeries3.setMaximumItemCount((int) (byte) 100);
        timeSeries3.setDomainDescription("Overwritten values from: -1.0");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries3.getRawDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        java.lang.Object obj14 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries3.createCopy((int) (short) 0, (int) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod18, (java.lang.Number) 2147483647, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timeSeries7.clone();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        java.lang.Class class21 = timeSeries15.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries15.addPropertyChangeListener(propertyChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries27.addAndOrUpdate(timeSeries31);
        timeSeries27.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries27.removeChangeListener(seriesChangeListener35);
        timeSeries27.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection40 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries7.addAndOrUpdate(timeSeries15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = timeSeries7.getTimePeriod((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNull(class21);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(timeSeries41);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.fireSeriesChanged();
        timeSeries3.clear();
        timeSeries3.clear();
        timeSeries3.setDomainDescription("Overwritten values from: -1.0");
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.lang.String str17 = timeSeries3.getDomainDescription();
        timeSeries3.setDescription("Time");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        java.lang.String str12 = timeSeries3.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) '#', (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timeSeries7.clone();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        java.lang.Class class21 = timeSeries15.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries15.addPropertyChangeListener(propertyChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries27.addAndOrUpdate(timeSeries31);
        timeSeries27.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries27.removeChangeListener(seriesChangeListener35);
        timeSeries27.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection40 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries7.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries43.addChangeListener(seriesChangeListener44);
        boolean boolean47 = timeSeries43.equals((java.lang.Object) 0L);
        timeSeries43.removeAgedItems(false);
        timeSeries43.clear();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj55 = timeSeries54.clone();
        timeSeries54.clear();
        java.util.List list57 = timeSeries54.getItems();
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj62 = timeSeries61.clone();
        timeSeries61.clear();
        java.util.List list64 = timeSeries61.getItems();
        timeSeries54.data = list64;
        timeSeries43.data = list64;
        timeSeries7.data = list64;
        timeSeries7.removeAgedItems((long) (short) 0, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod71 = null;
        java.lang.Number number72 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod71, number72, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNull(class21);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNotNull(list64);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        java.util.List list22 = timeSeries3.getItems();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener23);
        java.lang.String str25 = timeSeries3.getDomainDescription();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod7, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries14.removeChangeListener(seriesChangeListener22);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries26 = timeSeries14.createCopy(regularTimePeriod24, regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        double double11 = timeSeries3.getMinY();
        double double12 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries3.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries3.removeChangeListener(seriesChangeListener30);
        java.lang.Class class32 = timeSeries3.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod33, (java.lang.Number) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class32);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries3.getDataItem((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        timeSeries7.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        int int11 = timeSeries7.getItemCount();
        double double12 = timeSeries7.getMinY();
        java.lang.Class class13 = timeSeries7.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod14, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNull(class13);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.fireSeriesChanged();
        timeSeries3.clear();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries3.addOrUpdate(regularTimePeriod14, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeSeries3.getIndex(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setNotify(false);
        timeSeries7.setNotify(false);
        timeSeries7.setMaximumItemCount((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete((-1), 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timeSeries7.clone();
        java.util.List list12 = timeSeries7.data;
        timeSeries7.setMaximumItemAge((long) (byte) 100);
        int int15 = timeSeries7.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(timeSeriesDataItem16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries26.setNotify(false);
        java.lang.Comparable comparable29 = timeSeries26.getKey();
        timeSeries26.removeAgedItems(true);
        java.util.List list32 = timeSeries26.data;
        timeSeries22.data = list32;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = timeSeries22.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + (-1.0f) + "'", comparable29, (-1.0f));
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        timeSeries7.setDomainDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries7.getValue(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries17);
        java.lang.String str23 = timeSeries17.getRangeDescription();
        java.lang.Class class24 = timeSeries17.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries17.createCopy(0, 0);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries27.addChangeListener(seriesChangeListener28);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries27);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        java.util.Collection collection13 = timeSeries7.getTimePeriods();
        double double14 = timeSeries7.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.String str24 = timeSeries18.getDescription();
        boolean boolean25 = timeSeries18.isEmpty();
        timeSeries18.setKey((java.lang.Comparable) "Overwritten values from: -1.0");
        double double28 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries7.addAndOrUpdate(timeSeries18);
        java.lang.String str30 = timeSeries7.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod31, (double) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.String str9 = timeSeries3.getDescription();
        boolean boolean10 = timeSeries3.isEmpty();
        timeSeries3.setKey((java.lang.Comparable) "Overwritten values from: -1.0");
        double double13 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems((long) 0, true);
        boolean boolean17 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod18, (double) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener11);
        timeSeries7.setDomainDescription("Overwritten values from: -1.0");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(timeSeriesDataItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        timeSeries3.removeAgedItems(true);
        java.lang.String str12 = timeSeries3.getDescription();
        java.util.List list13 = timeSeries3.getItems();
        java.lang.String str14 = timeSeries3.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries3.addOrUpdate(regularTimePeriod15, (double) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        java.lang.String str12 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries3.getDataItem(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timeSeries7.clone();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        java.lang.Class class21 = timeSeries15.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries15.addPropertyChangeListener(propertyChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries27.addAndOrUpdate(timeSeries31);
        timeSeries27.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries27.removeChangeListener(seriesChangeListener35);
        timeSeries27.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection40 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries7.addAndOrUpdate(timeSeries15);
        java.util.List list42 = timeSeries15.getItems();
        java.lang.Object obj43 = timeSeries15.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries15.getDataItem(regularTimePeriod44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNull(class21);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries3.addAndOrUpdate(timeSeries18);
        java.lang.String str26 = timeSeries25.getDomainDescription();
        java.lang.Class<?> wildcardClass27 = timeSeries25.getClass();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Time" + "'", str26, "Time");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        java.lang.Class class4 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod5, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        boolean boolean22 = timeSeries20.getNotify();
        double double23 = timeSeries20.getMaxY();
        int int24 = timeSeries20.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries28.setNotify(false);
        java.lang.Comparable comparable31 = timeSeries28.getKey();
        java.lang.Class<?> wildcardClass32 = comparable31.getClass();
        timeSeries20.timePeriodClass = wildcardClass32;
        timeSeries7.timePeriodClass = wildcardClass32;
        long long35 = timeSeries7.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries39.addAndOrUpdate(timeSeries43);
        timeSeries39.removeAgedItems(false);
        timeSeries39.setDescription("Value");
        java.util.Collection collection49 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod50 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries39.add(regularTimePeriod50, 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (-1.0f) + "'", comparable31, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 9223372036854775807L + "'", long35 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(collection49);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        long long13 = timeSeries7.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = timeSeries7.getIndex(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        boolean boolean11 = timeSeries3.getNotify();
        java.lang.Object obj12 = timeSeries3.clone();
        int int13 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        timeSeries7.setDomainDescription("hi!");
        java.util.List list12 = timeSeries7.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries7.createCopy(regularTimePeriod13, regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.lang.Class class29 = timeSeries15.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries33.addAndOrUpdate(timeSeries37);
        boolean boolean39 = timeSeries37.getNotify();
        double double40 = timeSeries37.getMaxY();
        java.util.List list41 = timeSeries37.getItems();
        java.util.Collection collection42 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries37);
        org.jfree.data.time.TimeSeries timeSeries43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries44 = timeSeries37.addAndOrUpdate(timeSeries43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries3.addAndOrUpdate(timeSeries18);
        long long26 = timeSeries18.getMaximumItemAge();
        timeSeries18.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries18.addOrUpdate(regularTimePeriod29, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9223372036854775807L + "'", long26 == 9223372036854775807L);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timeSeries7.clone();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        java.lang.Class class21 = timeSeries15.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries15.addPropertyChangeListener(propertyChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries27.addAndOrUpdate(timeSeries31);
        timeSeries27.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries27.removeChangeListener(seriesChangeListener35);
        timeSeries27.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection40 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries7.addAndOrUpdate(timeSeries15);
        int int42 = timeSeries41.getItemCount();
        int int43 = timeSeries41.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem44 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries41.add(timeSeriesDataItem44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNull(class21);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        double double7 = timeSeries3.getMaxY();
        timeSeries3.setDescription("hi!");
        java.lang.Comparable comparable10 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.addOrUpdate(regularTimePeriod11, Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (-1.0f) + "'", comparable10, (-1.0f));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(2147483647, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        timeSeries3.setKey((java.lang.Comparable) (short) 1);
        timeSeries3.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = timeSeries3.getIndex(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        boolean boolean20 = timeSeries18.getNotify();
        double double21 = timeSeries18.getMaxY();
        java.util.List list22 = timeSeries18.getItems();
        timeSeries3.data = list22;
        timeSeries3.removeAgedItems(1L, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = timeSeries3.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Failed to clone.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        java.lang.Class class22 = timeSeries16.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries26.addAndOrUpdate(timeSeries30);
        java.lang.Comparable comparable32 = timeSeries30.getKey();
        timeSeries30.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries16.addAndOrUpdate(timeSeries30);
        java.lang.String str36 = timeSeries30.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries3.addAndOrUpdate(timeSeries30);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries30.removeChangeListener(seriesChangeListener38);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number41 = timeSeries30.getValue(regularTimePeriod40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (-1.0f) + "'", comparable32, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(timeSeries37);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.removeAgedItems(false);
        double double7 = timeSeries3.getMinY();
        java.lang.String str8 = timeSeries3.getDomainDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries3.getDataItem(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        timeSeries7.setNotify(false);
        int int15 = timeSeries7.getItemCount();
        java.lang.Class class16 = timeSeries7.getTimePeriodClass();
        java.lang.String str17 = timeSeries7.getDescription();
        timeSeries7.setDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = timeSeries7.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.String str9 = timeSeries3.getDescription();
        boolean boolean10 = timeSeries3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries3.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        java.util.List list12 = timeSeries3.data;
        java.lang.Class<?> wildcardClass13 = list12.getClass();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        java.lang.String str12 = timeSeries3.getDomainDescription();
        timeSeries3.setRangeDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries3.addOrUpdate(regularTimePeriod15, (java.lang.Number) Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (byte) 0, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        java.lang.Class class22 = timeSeries16.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries26.addAndOrUpdate(timeSeries30);
        java.lang.Comparable comparable32 = timeSeries30.getKey();
        timeSeries30.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries16.addAndOrUpdate(timeSeries30);
        java.lang.String str36 = timeSeries30.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries3.addAndOrUpdate(timeSeries30);
        java.util.List list38 = timeSeries37.data;
        timeSeries37.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int41 = timeSeries37.getIndex(regularTimePeriod40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (-1.0f) + "'", comparable32, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        int int11 = timeSeries7.getItemCount();
        double double12 = timeSeries7.getMinY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(timeSeriesDataItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        int int5 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries3.addOrUpdate(timeSeriesDataItem6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        java.lang.Object obj14 = timeSeries3.clone();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries3.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        int int11 = timeSeries7.getItemCount();
        timeSeries7.removeAgedItems((long) (short) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete((int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        java.util.Collection collection13 = timeSeries7.getTimePeriods();
        double double14 = timeSeries7.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.String str24 = timeSeries18.getDescription();
        boolean boolean25 = timeSeries18.isEmpty();
        timeSeries18.setKey((java.lang.Comparable) "Overwritten values from: -1.0");
        double double28 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries7.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries18.getDataItem(regularTimePeriod30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(timeSeries29);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries9.addAndOrUpdate(timeSeries13);
        boolean boolean15 = timeSeries13.getNotify();
        double double16 = timeSeries13.getMaxY();
        int int17 = timeSeries13.getItemCount();
        java.util.Collection collection18 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries13.addOrUpdate(regularTimePeriod19, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries7.addAndOrUpdate(timeSeries11);
        timeSeries7.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries7.addAndOrUpdate(timeSeries18);
        java.util.Collection collection26 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries32.addAndOrUpdate(timeSeries36);
        timeSeries32.removeAgedItems(false);
        java.lang.String str40 = timeSeries32.getDomainDescription();
        java.util.Collection collection41 = timeSeries32.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries18.addAndOrUpdate(timeSeries32);
        boolean boolean43 = timeSeries42.getNotify();
        java.lang.Comparable comparable44 = timeSeries42.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int46 = timeSeries42.getIndex(regularTimePeriod45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + comparable44 + "' != '" + "Overwritten values from: -1.0" + "'", comparable44, "Overwritten values from: -1.0");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.String str9 = timeSeries3.getDescription();
        boolean boolean10 = timeSeries3.isEmpty();
        long long11 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries3.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        java.lang.Object obj14 = timeSeries3.clone();
        timeSeries3.setDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries20.addAndOrUpdate(timeSeries24);
        boolean boolean26 = timeSeries24.getNotify();
        double double27 = timeSeries24.getMaxY();
        timeSeries24.setMaximumItemCount(1);
        java.util.Collection collection30 = timeSeries24.getTimePeriods();
        double double31 = timeSeries24.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries35.addAndOrUpdate(timeSeries39);
        java.lang.String str41 = timeSeries35.getDescription();
        boolean boolean42 = timeSeries35.isEmpty();
        timeSeries35.setKey((java.lang.Comparable) "Overwritten values from: -1.0");
        double double45 = timeSeries35.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries24.addAndOrUpdate(timeSeries35);
        java.lang.String str47 = timeSeries24.getDescription();
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries3.addAndOrUpdate(timeSeries24);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem51 = timeSeries24.addOrUpdate(regularTimePeriod49, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(timeSeries48);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener21);
        long long23 = timeSeries14.getMaximumItemAge();
        java.util.List list24 = timeSeries14.getItems();
        java.util.Collection collection25 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection16 = timeSeries3.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = timeSeries3.getTimePeriod(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        timeSeries16.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries16.removeChangeListener(seriesChangeListener24);
        timeSeries16.removeAgedItems((long) (byte) -1, false);
        java.lang.Class<?> wildcardClass29 = timeSeries16.getClass();
        timeSeries3.timePeriodClass = wildcardClass29;
        boolean boolean31 = timeSeries3.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries3.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        boolean boolean6 = timeSeries3.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries3.createCopy(1, (int) (byte) 1);
        timeSeries9.removeAgedItems(9223372036854775807L, false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries7.addAndOrUpdate(timeSeries11);
        timeSeries7.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries7.addAndOrUpdate(timeSeries18);
        java.util.Collection collection26 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries32.addAndOrUpdate(timeSeries36);
        timeSeries32.removeAgedItems(false);
        java.lang.String str40 = timeSeries32.getDomainDescription();
        java.util.Collection collection41 = timeSeries32.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries18.addAndOrUpdate(timeSeries32);
        boolean boolean43 = timeSeries42.getNotify();
        int int44 = timeSeries42.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries42.update(regularTimePeriod45, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        timeSeries21.removeAgedItems(true);
        java.util.List list24 = timeSeries21.getItems();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries28.addAndOrUpdate(timeSeries32);
        java.lang.Class class34 = timeSeries28.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries28.addPropertyChangeListener(propertyChangeListener35);
        long long37 = timeSeries28.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries41.addAndOrUpdate(timeSeries45);
        timeSeries41.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries41.removeChangeListener(seriesChangeListener49);
        timeSeries41.removeAgedItems((long) (byte) -1, false);
        java.lang.Class<?> wildcardClass54 = timeSeries41.getClass();
        timeSeries28.timePeriodClass = wildcardClass54;
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries59.addAndOrUpdate(timeSeries63);
        java.beans.PropertyChangeListener propertyChangeListener65 = null;
        timeSeries63.addPropertyChangeListener(propertyChangeListener65);
        java.lang.Object obj67 = timeSeries63.clone();
        java.util.List list68 = timeSeries63.data;
        timeSeries28.data = list68;
        java.util.Collection collection70 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        org.jfree.data.time.TimeSeries timeSeries74 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries78 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries79 = timeSeries74.addAndOrUpdate(timeSeries78);
        boolean boolean80 = timeSeries78.getNotify();
        double double81 = timeSeries78.getMaxY();
        int int82 = timeSeries78.getItemCount();
        timeSeries78.removeAgedItems((long) (short) 0, false);
        java.util.Collection collection86 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries78);
        timeSeries78.setDescription("Value");
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNull(class34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 9223372036854775807L + "'", long37 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(timeSeries64);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(timeSeries79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(collection86);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        double double7 = timeSeries3.getMaxY();
        timeSeries3.setDescription("hi!");
        java.util.Collection collection10 = timeSeries3.getTimePeriods();
        timeSeries3.setKey((java.lang.Comparable) "Time");
        java.util.List list13 = timeSeries3.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries3.getRawDataItem(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod13, (double) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod9, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries9.addAndOrUpdate(timeSeries13);
        timeSeries9.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries9.removeChangeListener(seriesChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.addAndOrUpdate(timeSeries9);
        long long20 = timeSeries9.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(regularTimePeriod21, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        int int11 = timeSeries7.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries15.setNotify(false);
        java.lang.Comparable comparable18 = timeSeries15.getKey();
        java.lang.Class<?> wildcardClass19 = comparable18.getClass();
        timeSeries7.timePeriodClass = wildcardClass19;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries7.getRawDataItem(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (-1.0f) + "'", comparable18, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries17);
        java.lang.String str23 = timeSeries17.getRangeDescription();
        java.util.List list24 = timeSeries17.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.update(regularTimePeriod25, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        java.util.List list13 = timeSeries3.getItems();
        timeSeries3.removeAgedItems((long) (byte) 10, false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries16.setNotify(false);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries23.addAndOrUpdate(timeSeries27);
        java.util.Collection collection29 = timeSeries16.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        boolean boolean30 = timeSeries7.equals((java.lang.Object) collection29);
        java.lang.Class class31 = timeSeries7.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.update(1, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(class31);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        timeSeries7.setNotify(false);
        int int15 = timeSeries7.getItemCount();
        java.lang.Class class16 = timeSeries7.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete((int) (short) 100, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(class16);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        boolean boolean20 = timeSeries18.getNotify();
        double double21 = timeSeries18.getMaxY();
        java.util.List list22 = timeSeries18.getItems();
        timeSeries3.data = list22;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod24, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries17);
        java.util.List list23 = timeSeries22.data;
        double double24 = timeSeries22.getMinY();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries7.addChangeListener(seriesChangeListener13);
        java.lang.Class class15 = timeSeries7.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete((int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class15);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        java.util.List list13 = timeSeries3.getItems();
        java.lang.Comparable comparable14 = timeSeries3.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries3.addOrUpdate(regularTimePeriod15, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (-1.0f) + "'", comparable14, (-1.0f));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.setMaximumItemCount(100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries3.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        long long13 = timeSeries7.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries7.addOrUpdate(regularTimePeriod14, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        boolean boolean20 = timeSeries18.getNotify();
        double double21 = timeSeries18.getMaxY();
        timeSeries18.setMaximumItemCount(1);
        java.util.Collection collection24 = timeSeries18.getTimePeriods();
        double double25 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries29.addAndOrUpdate(timeSeries33);
        boolean boolean35 = timeSeries33.getNotify();
        double double36 = timeSeries33.getMaxY();
        int int37 = timeSeries33.getItemCount();
        double double38 = timeSeries33.getMinY();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries42.addAndOrUpdate(timeSeries46);
        boolean boolean48 = timeSeries46.getNotify();
        double double49 = timeSeries46.getMaxY();
        int int50 = timeSeries46.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries54.setNotify(false);
        java.lang.Comparable comparable57 = timeSeries54.getKey();
        java.lang.Class<?> wildcardClass58 = comparable57.getClass();
        timeSeries46.timePeriodClass = wildcardClass58;
        timeSeries33.timePeriodClass = wildcardClass58;
        timeSeries18.timePeriodClass = wildcardClass58;
        timeSeries3.timePeriodClass = wildcardClass58;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener63 = null;
        timeSeries3.addChangeListener(seriesChangeListener63);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries67 = timeSeries3.createCopy((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + (-1.0f) + "'", comparable57, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        timeSeries7.setNotify(false);
        int int15 = timeSeries7.getItemCount();
        timeSeries7.setMaximumItemCount(2147483647);
        java.util.List list18 = timeSeries7.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries21 = timeSeries7.createCopy(regularTimePeriod19, regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean5 = timeSeries1.equals((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries9.addAndOrUpdate(timeSeries13);
        timeSeries9.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries9.removeChangeListener(seriesChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries3.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries23.addAndOrUpdate(timeSeries27);
        boolean boolean29 = timeSeries27.getNotify();
        double double30 = timeSeries27.getMaxY();
        int int31 = timeSeries27.getItemCount();
        timeSeries27.removeAgedItems((long) (short) 0, false);
        java.util.List list35 = timeSeries27.data;
        timeSeries9.data = list35;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.delete((int) (byte) 1, 2147483647, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries7.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        boolean boolean20 = timeSeries18.getNotify();
        double double21 = timeSeries18.getMaxY();
        java.util.List list22 = timeSeries18.getItems();
        timeSeries7.data = list22;
        java.lang.Comparable comparable24 = timeSeries7.getKey();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries28.addAndOrUpdate(timeSeries32);
        boolean boolean34 = timeSeries32.getNotify();
        double double35 = timeSeries32.getMaxY();
        timeSeries32.setMaximumItemCount(1);
        timeSeries32.setNotify(false);
        int int40 = timeSeries32.getItemCount();
        timeSeries32.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries7.addAndOrUpdate(timeSeries32);
        timeSeries7.setDescription("Value");
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (-1.0f) + "'", comparable24, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(timeSeries43);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        java.lang.Object obj14 = timeSeries3.clone();
        timeSeries3.setDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries18.addChangeListener(seriesChangeListener19);
        boolean boolean22 = timeSeries18.equals((java.lang.Object) 0L);
        timeSeries18.removeAgedItems(false);
        java.util.List list25 = timeSeries18.getItems();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries29.addAndOrUpdate(timeSeries33);
        boolean boolean35 = timeSeries33.getNotify();
        double double36 = timeSeries33.getMaxY();
        timeSeries33.setMaximumItemCount(1);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries42.addAndOrUpdate(timeSeries46);
        boolean boolean48 = timeSeries46.getNotify();
        double double49 = timeSeries46.getMaxY();
        int int50 = timeSeries46.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries54.setNotify(false);
        java.lang.Comparable comparable57 = timeSeries54.getKey();
        java.lang.Class<?> wildcardClass58 = comparable57.getClass();
        timeSeries46.timePeriodClass = wildcardClass58;
        timeSeries33.timePeriodClass = wildcardClass58;
        timeSeries18.timePeriodClass = wildcardClass58;
        timeSeries18.setMaximumItemAge((long) (short) 0);
        java.util.Collection collection64 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(0, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + (-1.0f) + "'", comparable57, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(collection64);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries26.setNotify(false);
        java.lang.Comparable comparable29 = timeSeries26.getKey();
        timeSeries26.removeAgedItems(true);
        java.util.List list32 = timeSeries26.data;
        timeSeries22.data = list32;
        timeSeries22.setMaximumItemCount((int) (byte) 1);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + (-1.0f) + "'", comparable29, (-1.0f));
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener21);
        long long23 = timeSeries14.getMaximumItemAge();
        java.util.List list24 = timeSeries14.getItems();
        java.util.Collection collection25 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries3.removeChangeListener(seriesChangeListener26);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener28);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem30, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timeSeries7.clone();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        java.lang.Class class21 = timeSeries15.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries15.addPropertyChangeListener(propertyChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries27.addAndOrUpdate(timeSeries31);
        timeSeries27.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries27.removeChangeListener(seriesChangeListener35);
        timeSeries27.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection40 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries7.addAndOrUpdate(timeSeries15);
        long long42 = timeSeries7.getMaximumItemAge();
        java.lang.String str43 = timeSeries7.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries46 = timeSeries7.createCopy((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNull(class21);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 9223372036854775807L + "'", long42 == 9223372036854775807L);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        int int5 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = timeSeries3.getIndex(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries3.addAndOrUpdate(timeSeries14);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries14.removeChangeListener(seriesChangeListener22);
        java.util.List list24 = timeSeries14.data;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries14.addOrUpdate(timeSeriesDataItem25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries15.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.delete(regularTimePeriod30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        java.lang.String str10 = timeSeries7.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod11, (java.lang.Number) (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1.0f) + "'", comparable9, (-1.0f));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        java.lang.Object obj11 = timeSeries7.clone();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        java.lang.Class class21 = timeSeries15.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries15.addPropertyChangeListener(propertyChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries27.addAndOrUpdate(timeSeries31);
        timeSeries27.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries27.removeChangeListener(seriesChangeListener35);
        timeSeries27.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection40 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries7.addAndOrUpdate(timeSeries15);
        java.util.List list42 = timeSeries15.getItems();
        java.lang.Object obj43 = timeSeries15.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.update(regularTimePeriod44, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNull(class21);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        java.util.Collection collection13 = timeSeries7.getTimePeriods();
        double double14 = timeSeries7.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.String str24 = timeSeries18.getDescription();
        boolean boolean25 = timeSeries18.isEmpty();
        timeSeries18.setKey((java.lang.Comparable) "Overwritten values from: -1.0");
        double double28 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries7.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete(regularTimePeriod30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(timeSeries29);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries17);
        java.lang.String str23 = timeSeries17.getRangeDescription();
        java.lang.Class class24 = timeSeries17.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries17.createCopy(0, 0);
        boolean boolean28 = timeSeries27.getNotify();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries3.addAndOrUpdate(timeSeries18);
        double double26 = timeSeries3.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries3.addOrUpdate(regularTimePeriod27, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setNotify(false);
        timeSeries7.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries7.addOrUpdate(regularTimePeriod15, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        java.util.List list12 = timeSeries3.data;
        timeSeries3.removeAgedItems(true);
        timeSeries3.setDomainDescription("Overwritten values from: -1.0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = timeSeries3.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection16 = timeSeries3.getTimePeriods();
        timeSeries3.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete((int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        double double11 = timeSeries3.getMinY();
        double double12 = timeSeries3.getMaxY();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.addAndOrUpdate(timeSeries19);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.removeChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection28 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.lang.Class class29 = timeSeries15.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries33.addAndOrUpdate(timeSeries37);
        boolean boolean39 = timeSeries37.getNotify();
        double double40 = timeSeries37.getMaxY();
        java.util.List list41 = timeSeries37.getItems();
        java.util.Collection collection42 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries37);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries37.add(regularTimePeriod43, 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(class29);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.removeChangeListener(seriesChangeListener10);
        java.util.List list12 = timeSeries3.data;
        timeSeries3.setKey((java.lang.Comparable) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries3.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.String str9 = timeSeries3.getDescription();
        boolean boolean10 = timeSeries3.isEmpty();
        timeSeries3.setKey((java.lang.Comparable) "Overwritten values from: -1.0");
        double double13 = timeSeries3.getMaxY();
        timeSeries3.removeAgedItems((long) 0, true);
        boolean boolean17 = timeSeries3.getNotify();
        long long18 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries3.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries3.addAndOrUpdate(timeSeries18);
        long long26 = timeSeries18.getMaximumItemAge();
        timeSeries18.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj33 = timeSeries32.clone();
        timeSeries32.clear();
        java.util.List list35 = timeSeries32.getItems();
        double double36 = timeSeries32.getMaxY();
        timeSeries32.setDescription("hi!");
        java.util.Collection collection39 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        java.lang.Object obj40 = timeSeries32.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries32.getDataItem((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9223372036854775807L + "'", long26 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries9.addAndOrUpdate(timeSeries13);
        boolean boolean15 = timeSeries13.getNotify();
        double double16 = timeSeries13.getMaxY();
        int int17 = timeSeries13.getItemCount();
        java.util.Collection collection18 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod19, (double) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        double double7 = timeSeries3.getMaxY();
        timeSeries3.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod12, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) '4', (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        java.lang.Object obj14 = timeSeries3.clone();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries3.addOrUpdate(regularTimePeriod17, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        timeSeries7.setNotify(false);
        int int15 = timeSeries7.getItemCount();
        java.lang.Class class16 = timeSeries7.getTimePeriodClass();
        java.lang.String str17 = timeSeries7.getDescription();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries21.addAndOrUpdate(timeSeries25);
        timeSeries21.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries21.removeChangeListener(seriesChangeListener29);
        boolean boolean31 = timeSeries21.getNotify();
        java.lang.Object obj32 = timeSeries21.clone();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries21.createCopy((int) (short) 0, (int) ' ');
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries7.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = timeSeries36.getValue(regularTimePeriod37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(class16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(timeSeries36);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries8.setDomainDescription("Value");
        long long11 = timeSeries8.getMaximumItemAge();
        java.lang.String str12 = timeSeries8.getDescription();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        boolean boolean11 = timeSeries3.getNotify();
        java.lang.Object obj12 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries14.addChangeListener(seriesChangeListener15);
        boolean boolean18 = timeSeries14.equals((java.lang.Object) 0L);
        timeSeries14.removeAgedItems(false);
        java.util.List list21 = timeSeries14.getItems();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries25.addAndOrUpdate(timeSeries29);
        boolean boolean31 = timeSeries29.getNotify();
        double double32 = timeSeries29.getMaxY();
        timeSeries29.setMaximumItemCount(1);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries38.addAndOrUpdate(timeSeries42);
        boolean boolean44 = timeSeries42.getNotify();
        double double45 = timeSeries42.getMaxY();
        int int46 = timeSeries42.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries50.setNotify(false);
        java.lang.Comparable comparable53 = timeSeries50.getKey();
        java.lang.Class<?> wildcardClass54 = comparable53.getClass();
        timeSeries42.timePeriodClass = wildcardClass54;
        timeSeries29.timePeriodClass = wildcardClass54;
        timeSeries14.timePeriodClass = wildcardClass54;
        timeSeries3.timePeriodClass = wildcardClass54;
        timeSeries3.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + comparable53 + "' != '" + (-1.0f) + "'", comparable53, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        double double7 = timeSeries3.getMaxY();
        timeSeries3.setDescription("hi!");
        java.util.Collection collection10 = timeSeries3.getTimePeriods();
        timeSeries3.setKey((java.lang.Comparable) "Time");
        java.util.List list13 = timeSeries3.getItems();
        timeSeries3.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod15, 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        timeSeries3.setKey((java.lang.Comparable) "Value");
        timeSeries3.setRangeDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries22.addAndOrUpdate(timeSeries26);
        java.lang.Class class28 = timeSeries22.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries32.addAndOrUpdate(timeSeries36);
        java.lang.Comparable comparable38 = timeSeries36.getKey();
        timeSeries36.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries22.addAndOrUpdate(timeSeries36);
        java.lang.String str42 = timeSeries36.getRangeDescription();
        java.util.Collection collection43 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries36);
        double double44 = timeSeries36.getMinY();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNull(class28);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + (-1.0f) + "'", comparable38, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        timeSeries7.setKey((java.lang.Comparable) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries7.removePropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.update(regularTimePeriod14, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (-1.0f) + "'", comparable9, (-1.0f));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries3.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        java.lang.Number number27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod26, number27, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.String str9 = timeSeries3.getDescription();
        boolean boolean10 = timeSeries3.isEmpty();
        long long11 = timeSeries3.getMaximumItemAge();
        double double12 = timeSeries3.getMinY();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries16.setNotify(false);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        java.lang.String str20 = timeSeries16.getRangeDescription();
        java.lang.Comparable comparable21 = timeSeries16.getKey();
        java.lang.String str22 = timeSeries16.getDescription();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries16.removeChangeListener(seriesChangeListener23);
        boolean boolean25 = timeSeries3.equals((java.lang.Object) seriesChangeListener23);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = timeSeries3.getIndex(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (-1.0f) + "'", comparable21, (-1.0f));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        timeSeries3.setDomainDescription("");
        int int13 = timeSeries3.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries3.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        java.lang.Class class22 = timeSeries16.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries26.addAndOrUpdate(timeSeries30);
        java.lang.Comparable comparable32 = timeSeries30.getKey();
        timeSeries30.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries16.addAndOrUpdate(timeSeries30);
        java.lang.String str36 = timeSeries30.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries3.addAndOrUpdate(timeSeries30);
        java.util.List list38 = timeSeries37.data;
        timeSeries37.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number41 = timeSeries37.getValue(regularTimePeriod40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (-1.0f) + "'", comparable32, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setRangeDescription("");
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries3.getDataItem(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        java.util.List list11 = timeSeries7.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries7.createCopy(regularTimePeriod12, regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setNotify(false);
        timeSeries7.setNotify(false);
        java.lang.String str15 = timeSeries7.getDomainDescription();
        double double16 = timeSeries7.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod17, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries7.addAndOrUpdate(timeSeries11);
        timeSeries7.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries7.addAndOrUpdate(timeSeries18);
        java.util.Collection collection26 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.delete(regularTimePeriod29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        long long11 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries3.getRawDataItem(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        timeSeries16.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries16.removeChangeListener(seriesChangeListener24);
        timeSeries16.removeAgedItems((long) (byte) -1, false);
        java.lang.Class<?> wildcardClass29 = timeSeries16.getClass();
        timeSeries3.timePeriodClass = wildcardClass29;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries34.addAndOrUpdate(timeSeries38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries38.addPropertyChangeListener(propertyChangeListener40);
        java.lang.Object obj42 = timeSeries38.clone();
        java.util.List list43 = timeSeries38.data;
        timeSeries3.data = list43;
        java.lang.String str45 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries49.addAndOrUpdate(timeSeries53);
        java.lang.Class class55 = timeSeries49.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries49.removeChangeListener(seriesChangeListener56);
        java.util.List list58 = timeSeries49.data;
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries3.addAndOrUpdate(timeSeries49);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod60 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number61 = timeSeries49.getValue(regularTimePeriod60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNull(class55);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(timeSeries59);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries7.addAndOrUpdate(timeSeries11);
        timeSeries7.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries7.addAndOrUpdate(timeSeries18);
        java.util.Collection collection26 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener27);
        boolean boolean29 = timeSeries18.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries18.getDataItem(regularTimePeriod30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        timeSeries3.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries3.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.delete(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries7.addAndOrUpdate(timeSeries11);
        timeSeries7.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries7.addAndOrUpdate(timeSeries18);
        java.util.Collection collection26 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener27);
        long long29 = timeSeries18.getMaximumItemAge();
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(class24);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 9223372036854775807L + "'", long29 == 9223372036854775807L);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        java.lang.Class class22 = timeSeries16.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries26.addAndOrUpdate(timeSeries30);
        java.lang.Comparable comparable32 = timeSeries30.getKey();
        timeSeries30.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries16.addAndOrUpdate(timeSeries30);
        java.lang.String str36 = timeSeries30.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries3.addAndOrUpdate(timeSeries30);
        java.util.List list38 = timeSeries37.data;
        boolean boolean39 = timeSeries37.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries37.update((int) (short) 10, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + (-1.0f) + "'", comparable32, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries3.removeChangeListener(seriesChangeListener11);
        boolean boolean13 = timeSeries3.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod14, (double) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries12.addAndOrUpdate(timeSeries16);
        boolean boolean18 = timeSeries16.getNotify();
        double double19 = timeSeries16.getMaxY();
        java.util.List list20 = timeSeries16.getItems();
        timeSeries3.data = list20;
        timeSeries3.setNotify(true);
        java.lang.Class class24 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(regularTimePeriod25, (java.lang.Number) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNull(class24);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        timeSeries3.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries12.addAndOrUpdate(timeSeries16);
        boolean boolean18 = timeSeries16.getNotify();
        double double19 = timeSeries16.getMaxY();
        java.util.List list20 = timeSeries16.getItems();
        timeSeries3.data = list20;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.Class<?> wildcardClass11 = timeSeries3.getClass();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        int int11 = timeSeries7.getItemCount();
        double double12 = timeSeries7.getMinY();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries7.addOrUpdate(regularTimePeriod13, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        java.util.Collection collection13 = timeSeries7.getTimePeriods();
        double double14 = timeSeries7.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.addAndOrUpdate(timeSeries22);
        java.lang.String str24 = timeSeries18.getDescription();
        boolean boolean25 = timeSeries18.isEmpty();
        timeSeries18.setKey((java.lang.Comparable) "Overwritten values from: -1.0");
        double double28 = timeSeries18.getMaxY();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries7.addAndOrUpdate(timeSeries18);
        java.lang.String str30 = timeSeries7.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries33 = timeSeries7.createCopy(regularTimePeriod31, regularTimePeriod32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener9);
        timeSeries7.setKey((java.lang.Comparable) 10L);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries16.setNotify(false);
        java.lang.Comparable comparable19 = timeSeries16.getKey();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries23.addAndOrUpdate(timeSeries27);
        java.util.Collection collection29 = timeSeries16.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        boolean boolean30 = timeSeries7.equals((java.lang.Object) collection29);
        java.lang.String str31 = timeSeries7.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = timeSeries7.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        boolean boolean11 = timeSeries3.getNotify();
        java.lang.Object obj12 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries14.addChangeListener(seriesChangeListener15);
        boolean boolean18 = timeSeries14.equals((java.lang.Object) 0L);
        timeSeries14.removeAgedItems(false);
        java.util.List list21 = timeSeries14.getItems();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries25.addAndOrUpdate(timeSeries29);
        boolean boolean31 = timeSeries29.getNotify();
        double double32 = timeSeries29.getMaxY();
        timeSeries29.setMaximumItemCount(1);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries38.addAndOrUpdate(timeSeries42);
        boolean boolean44 = timeSeries42.getNotify();
        double double45 = timeSeries42.getMaxY();
        int int46 = timeSeries42.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries50.setNotify(false);
        java.lang.Comparable comparable53 = timeSeries50.getKey();
        java.lang.Class<?> wildcardClass54 = comparable53.getClass();
        timeSeries42.timePeriodClass = wildcardClass54;
        timeSeries29.timePeriodClass = wildcardClass54;
        timeSeries14.timePeriodClass = wildcardClass54;
        timeSeries3.timePeriodClass = wildcardClass54;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod59 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update(regularTimePeriod59, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + comparable53 + "' != '" + (-1.0f) + "'", comparable53, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        java.util.List list6 = timeSeries3.getItems();
        double double7 = timeSeries3.getMaxY();
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        double double9 = timeSeries3.getMinY();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries3.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(class8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries7.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries7.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        boolean boolean20 = timeSeries18.getNotify();
        double double21 = timeSeries18.getMaxY();
        java.util.List list22 = timeSeries18.getItems();
        timeSeries7.data = list22;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(timeSeriesDataItem24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        int int11 = timeSeries7.getItemCount();
        double double12 = timeSeries7.getMinY();
        int int13 = timeSeries7.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries7.getDataItem(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        java.lang.String str11 = timeSeries3.getDomainDescription();
        java.lang.Object obj12 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        java.lang.Class class22 = timeSeries16.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries16.addPropertyChangeListener(propertyChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries28.addAndOrUpdate(timeSeries32);
        timeSeries28.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries28.removeChangeListener(seriesChangeListener36);
        timeSeries28.removeAgedItems((long) (byte) -1, false);
        java.util.Collection collection41 = timeSeries16.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        timeSeries16.fireSeriesChanged();
        org.jfree.data.event.SeriesChangeListener seriesChangeListener43 = null;
        timeSeries16.removeChangeListener(seriesChangeListener43);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries3.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.delete(regularTimePeriod46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(class22);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(timeSeries45);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) (short) 0);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries3.addAndOrUpdate(timeSeries17);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.delete((int) (byte) 100, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (-1.0f) + "'", comparable19, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries3.getValue(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        java.lang.String str7 = timeSeries3.getRangeDescription();
        java.lang.Comparable comparable8 = timeSeries3.getKey();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries14.removeChangeListener(seriesChangeListener20);
        timeSeries14.setMaximumItemCount(100);
        java.util.List list24 = timeSeries14.getItems();
        timeSeries3.data = list24;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries3.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (-1.0f) + "'", comparable8, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        boolean boolean20 = timeSeries18.getNotify();
        double double21 = timeSeries18.getMaxY();
        java.util.List list22 = timeSeries18.getItems();
        timeSeries3.data = list22;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries3.getRawDataItem(regularTimePeriod24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries3.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.lang.Class class20 = timeSeries14.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener21);
        long long23 = timeSeries14.getMaximumItemAge();
        java.util.List list24 = timeSeries14.getItems();
        java.util.Collection collection25 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries3.removeChangeListener(seriesChangeListener26);
        double double28 = timeSeries3.getMinY();
        int int29 = timeSeries3.getMaximumItemCount();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNull(class20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        timeSeries7.setMaximumItemCount(1);
        timeSeries7.setNotify(false);
        int int15 = timeSeries7.getItemCount();
        timeSeries7.setMaximumItemCount(2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries7.addOrUpdate(regularTimePeriod18, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries3.setNotify(false);
        java.lang.Comparable comparable6 = timeSeries3.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries10.addAndOrUpdate(timeSeries14);
        java.util.Collection collection16 = timeSeries3.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.lang.String str17 = timeSeries3.getDomainDescription();
        timeSeries3.setDescription("Time");
        long long20 = timeSeries3.getMaximumItemAge();
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (-1.0f) + "'", comparable6, (-1.0f));
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        timeSeries3.removeAgedItems(false);
        boolean boolean11 = timeSeries3.getNotify();
        java.lang.Object obj12 = timeSeries3.clone();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries14.addChangeListener(seriesChangeListener15);
        boolean boolean18 = timeSeries14.equals((java.lang.Object) 0L);
        timeSeries14.removeAgedItems(false);
        java.util.List list21 = timeSeries14.getItems();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries25.addAndOrUpdate(timeSeries29);
        boolean boolean31 = timeSeries29.getNotify();
        double double32 = timeSeries29.getMaxY();
        timeSeries29.setMaximumItemCount(1);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries38.addAndOrUpdate(timeSeries42);
        boolean boolean44 = timeSeries42.getNotify();
        double double45 = timeSeries42.getMaxY();
        int int46 = timeSeries42.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        timeSeries50.setNotify(false);
        java.lang.Comparable comparable53 = timeSeries50.getKey();
        java.lang.Class<?> wildcardClass54 = comparable53.getClass();
        timeSeries42.timePeriodClass = wildcardClass54;
        timeSeries29.timePeriodClass = wildcardClass54;
        timeSeries14.timePeriodClass = wildcardClass54;
        timeSeries3.timePeriodClass = wildcardClass54;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem59 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem59, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + comparable53 + "' != '" + (-1.0f) + "'", comparable53, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        boolean boolean5 = timeSeries1.equals((java.lang.Object) 0L);
        timeSeries1.removeAgedItems(false);
        java.util.List list8 = timeSeries1.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        boolean boolean9 = timeSeries7.getNotify();
        double double10 = timeSeries7.getMaxY();
        int int11 = timeSeries7.getItemCount();
        java.lang.String str12 = timeSeries7.getRangeDescription();
        java.lang.String str13 = timeSeries7.getRangeDescription();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        java.lang.Object obj4 = timeSeries3.clone();
        timeSeries3.clear();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.add(timeSeriesDataItem6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        timeSeries3.removeAgedItems(true);
        java.lang.String str12 = timeSeries3.getDescription();
        java.util.List list13 = timeSeries3.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries3.update((int) (short) 0, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.addAndOrUpdate(timeSeries7);
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener10);
        long long12 = timeSeries3.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries16.addAndOrUpdate(timeSeries20);
        timeSeries16.removeAgedItems(false);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries16.removeChangeListener(seriesChangeListener24);
        timeSeries16.removeAgedItems((long) (byte) -1, false);
        java.lang.Class<?> wildcardClass29 = timeSeries16.getClass();
        timeSeries3.timePeriodClass = wildcardClass29;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries34.addAndOrUpdate(timeSeries38);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries38.addPropertyChangeListener(propertyChangeListener40);
        java.lang.Object obj42 = timeSeries38.clone();
        java.util.List list43 = timeSeries38.data;
        timeSeries3.data = list43;
        java.lang.String str45 = timeSeries3.getDescription();
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "hi!", "");
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries49.addAndOrUpdate(timeSeries53);
        java.lang.Class class55 = timeSeries49.timePeriodClass;
        org.jfree.data.event.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries49.removeChangeListener(seriesChangeListener56);
        java.util.List list58 = timeSeries49.data;
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries3.addAndOrUpdate(timeSeries49);
        timeSeries3.setDomainDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod62 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem64 = timeSeries3.addOrUpdate(regularTimePeriod62, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(class9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNull(class55);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(timeSeries59);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.event.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        java.lang.Class class4 = timeSeries1.getTimePeriodClass();
        java.util.List list5 = timeSeries1.data;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(10, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(list5);
    }
}

